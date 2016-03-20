/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.hupa.server.preferences;


import tc3.desktop.InstrumentationLoggerProvider;
import gwtupload.server.UploadServlet;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Hashtable;

import javax.mail.BodyPart;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.logging.Log;
import org.apache.hupa.server.IMAPStoreCache;
import org.apache.hupa.server.utils.MessageUtils;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.rpc.ContactsResult.Contact;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

/**
 * A user preferences storage which uses IMAP as repository data
 *
 * @author manolo
 */
public class InImapUserPreferencesStorage extends UserPreferencesStorage {


    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fd0c91905_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fd0c919050x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fd0c919050x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fd0c919050x4_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fd0c919050x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fd0c919050x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd69322_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x30x00x00x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x30x00x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x30x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x30x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x30x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6fd693220x20x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f66d9ea6e0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f66d9ea6e0x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f66d9ea6e0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f66d9ea6e0x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f66d9ea6e");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f964d6054_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f964d60540x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f964d60540x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f964d60540x4_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f964d60540x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f964d60540x3");
	}
	
	// User preferences are saved in IMAP but there is a delay between a new
    // contact is added an the save action. It saves number of operations in
    // the IMAP server.
    // It's not final in order to override in tests to make them run faster
    protected static int IMAP_SAVE_DELAY = 10000;

    protected static final String MAGIC_SUBJECT_CONTACTS = "Hupa-Contacts";

    private static final String HUPA_DATA_MIME_TYPE = "application/hupa-data";


    private static Hashtable<User, Thread> threads = new Hashtable<User, Thread>();

    /**
     * Opens the IMAP folder and read messages until it founds the magic subject,
     * then gets the attachment which contains the data and return the serialized object stored.
     */
    protected static Object readUserPreferencesFromIMAP(Log logger, User user, IMAPStore iStore, String folderName, String magicType)
              throws MessagingException, IOException, ClassNotFoundException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca949");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x8");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x00x0");
		Folder folder = iStore.getFolder(folderName);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x0");
		if (folder.exists()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x00x00x0");
			if (!folder.isOpen()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x00x10x0");
				folder.open(Folder.READ_WRITE);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x10x1");
			Message message = null;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x20x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x20x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x2");
			Message[] msgs = folder.getMessages();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x0");
			for (Message msg : msgs) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x10x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x10x00x0");
				if (magicType.equals(msg.getSubject())) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x10x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x10x00x10x0");
					message = msg;
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x30x10x00x10x1");
					break;
                }
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x4");
			if (message != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x00x10x0");
				Object con = message.getContent();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x1");
				if (con instanceof Multipart) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x0");
					Multipart mp = (Multipart) con;
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x00x1");
					for(int i=0; i<mp.getCount(); i++) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x3");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x00x1");
						BodyPart part = mp.getBodyPart(i);
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x00x00x0");
						if (part.getContentType().toLowerCase().startsWith(HUPA_DATA_MIME_TYPE)) {
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x1");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x00x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x00x1");
							ObjectInputStream ois = new ObjectInputStream(part.getInputStream());
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x1");
							Object o = ois.readObject();
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x2");
							ois.close();
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x30x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x30x0");
							logger.info("Returning user preferences of type " + magicType + " from imap folder + " + folderName + " for user " + user);
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x10x10x40x10x10x10x10x30x10x10x4");
							return o;
                        }
                    }
                }
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f912ca9490x80x2");
		return null;
    }

    /**
     * Opens the IMAP folder, deletes all messages which match the magic subject and
     * creates a new message with an attachment which contains the object serialized
     */
    protected static void saveUserPreferencesInIMAP(Log logger, User user, Session session, IMAPStore iStore, String folderName, String subject, Object object)
              throws MessagingException, IOException, InterruptedException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a86");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x00x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x0");
		IMAPFolder folder = (IMAPFolder) iStore.getFolder(folderName);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x00x0");
		if (folder.exists() || folder.create(IMAPFolder.HOLDS_MESSAGES)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x00x0");
			if (!folder.isOpen()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x00x10x00x0");
				folder.open(Folder.READ_WRITE);
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x10x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x10x1");
			// Serialize the object
            ByteArrayOutputStream fout = new ByteArrayOutputStream();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x20x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x20x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x20x1");
			ObjectOutputStream oos = new ObjectOutputStream(fout);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x30x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x3");
			oos.writeObject(object);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x4_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x40x0");
			oos.close();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x50x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x5_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x50x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x50x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x50x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x50x10x0");
			ByteArrayInputStream is = new ByteArrayInputStream(fout.toByteArray());

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x60x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x60x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x6_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x60x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x60x10x00x0");
			// Create a new message with an attachment which has the serialized object
            MimeMessage message = new MimeMessage(session);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x70x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x7");
			message.setSubject(subject);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x80x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x80x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x80x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x80x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x8");
			Multipart multipart = new MimeMultipart();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x90x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x9_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x90x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x90x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x90x10x00x0");
			MimeBodyPart txtPart = new MimeBodyPart();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xa_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xa0x0");
			txtPart.setContent("This message contains configuration used by Hupa, do not delete it", "text/plain");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xb_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xb0x0");
			multipart.addBodyPart(txtPart);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xc0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xc0x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xc_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xc0x1");
			FileItem item = createPreferencesFileItem(is, subject, HUPA_DATA_MIME_TYPE);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xd_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xd0x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xd0x0");
			multipart.addBodyPart(MessageUtils.fileitemToBodypart(item));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xe_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xe0x0");
			message.setContent(multipart);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xf_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10xf0x0");
			message.saveChanges();

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x100x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x10_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x100x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x100x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x100x1");
			// It seems it's not possible to modify the content of an existing message using the API
            // So I delete the previous message storing the preferences and I create a new one
            Message[] msgs = folder.getMessages();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x11_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x00x0");
			for (Message msg : msgs) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x10x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x10x0");
				if (subject.equals(msg.getSubject())) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x110x10x00x10x00x0");
					msg.setFlag(Flag.DELETED, true);
                }
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x120x00x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x120x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x120x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x12_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x120x00x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x120x00x0");
			// It is necessary to copy the message before saving it (the same problem in AbstractSendMessageHandler)
            message = new MimeMessage((MimeMessage)message);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x13_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x130x0");
			message.setFlag(Flag.SEEN, true);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x140x00x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x140x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x14_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x140x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x140x00x00x0");
			folder.appendMessages(new Message[] { message });
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x150x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x15");
			folder.close(true);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x160x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x16_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x10x160x00x0");
			logger.info("Saved preferences " + subject + " in imap folder " + folderName + " for user " + user);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x20x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f55bc1a860xa0x10x20x00x0");
			logger.error("Unable to save preferences " + subject + " in imap folder " + folderName + " for user " + user);
        }
    }

    /**
     * Right now, using the same approach present in upload attachments to create the attachment
     */
    private static FileItem createPreferencesFileItem(InputStream is, String filename, String contentType) throws IOException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x50x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x4_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x6_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x40x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x5_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab0621");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x00x0");
		FileItemFactory f = new DiskFileItemFactory();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x10x0");
		FileItem item = f.createItem(filename, contentType, false, filename);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x20x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x2");
		UploadServlet.copyFromInputStreamToOutputStream(is, item.getOutputStream());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fefab06210x60x3");
		return item;
    }

    private Log logger;

    private final IMAPStoreCache cache;

    private final Provider<HttpSession> sessionProvider;

    /**
     * Constructor
     */
    @Inject
    public InImapUserPreferencesStorage(IMAPStoreCache cache, Log logger, Provider<HttpSession> sessionProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x4_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x30x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x30x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x30x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f16cc54ff0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f16cc54ff0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f16cc54ff_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f16cc54ff0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb0359280_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb03592800x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb03592800x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb03592800x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb03592800x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fd1f38135_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fd1f381350x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fd1f381350x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fd1f381350x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f109c311e0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f109c311e_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f109c311e0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f109c311e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691ffcbb9b3e_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691ffcbb9b3e0x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691ffcbb9b3e0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691ffcbb9b3e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f68b974e20x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f68b974e20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f68b974e2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f68b974e20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x40x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x40x00x0");
		this.sessionProvider = sessionProvider;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x40x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x40x10x0");
		this.cache = cache;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x40x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f7c7ae6df0x40x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x0");
		this.logger = logger;
    }

    /* (non-Javadoc)
     * @see org.apache.hupa.server.preferences.UserPreferencesStorage#addContact(org.apache.hupa.shared.rpc.ContactsResult.Contact[])
     */
    @Override
    public void addContact(Contact... contacts) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b6325");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x00x00x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x00x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x00x1");
		HashMap<String, Contact> contactsHash = getContactsHash();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x1");
		for (Contact contact : contacts) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x0");
			if (!contactsHash.containsKey(contact.toKey())) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x00x00x0");
				contactsHash.put(contact.toKey(), contact);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x10x00x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x10x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x10x00x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f287b63250x30x10x10x00x10x10x00x0");
				saveContactsAsync((User) sessionProvider.get().getAttribute(SConsts.USER_SESS_ATTR));
            }
        }
    }

    /* (non-Javadoc)
     * @see org.apache.hupa.server.preferences.UserPreferencesStorage#getContacts()
     */
    @Override
    public Contact[] getContacts() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x00x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x00x00x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x00x10x0");
		HashMap<String, Contact> sessionContacts = getContactsHash();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x10x00x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f6a5552ca0x20x10x00x10x00x0");
		return sessionContacts.values().toArray(new Contact[sessionContacts.size()]);
    }

    /**
     * Returns the Hash of contacts getting it from the session if available, or from
     * the IMAP repository if it is the first time.
     */
    @SuppressWarnings("unchecked")
    private HashMap<String, Contact> getContactsHash() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x10x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x0");
		HttpSession session = sessionProvider.get();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x10x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x10x00x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x00x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x10x00x00x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x10x0");
		HashMap<String, Contact> contactHash = (HashMap<String, Contact>) session.getAttribute(SConsts.CONTACTS_SESS_ATTR);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x0");
		if (contactHash == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x0");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x00x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x00x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x00x1");
				User user = (User) sessionProvider.get().getAttribute(SConsts.USER_SESS_ATTR);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x1");
				IMAPStore iStore = cache.get(user);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x20x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x20x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x20x10x00x00x0");
				Object o = readUserPreferencesFromIMAP(logger, user, iStore, user.getSettings().getDraftsFolderName(), MAGIC_SUBJECT_CONTACTS);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x30x00x0");
				if(!(o != null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x30x00x00x2");
				if(o != null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x30x00x00x1");
				contactHash = o != null ? (HashMap<String, Contact>) o : new HashMap<String, Contact>();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x4_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x00x40x0");
				session.setAttribute(SConsts.CONTACTS_SESS_ATTR, contactHash);
            } catch (Exception e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x10x00x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x10x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x20x10x00x10x10x0");
				e.printStackTrace();
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fc8abfdb60x20x3");
		return contactHash;
    }

    /**
     * Saves the contacts list in IMAP asynchronously, It is so because of two reasons:
     * 1.- User processes don't wait for it
     * 2.- It saves number of save operations, because the method addContact
     *  is called frequently when fetching a folder, so add these contacts are
     *  added to the session list, and a thread is delayed to store
     *  all the block.
     */
    private void saveContactsAsync(User user) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d001");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x00x10x0");
		Thread thread = threads.get(user);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x00x10x0");
		if (thread == null || !thread.isAlive()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x00x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x00x00x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x00x0");
			thread = new SavePreferencesThread(user, MAGIC_SUBJECT_CONTACTS, getContactsHash());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x1");
			threads.put(user, thread);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f1c79d0010x30x10x10x2");
			thread.start();
        }
    }

    /**
     * The thread class which saves asynchronously the user preferences
     */
    private class SavePreferencesThread extends Thread {
        private String folderName = null;
        private Object object = null;
        private String subject = null;
        private User user = null;

        public SavePreferencesThread(User user, String subject, Object object) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f16cc54ff0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f16cc54ff0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f16cc54ff_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f16cc54ff0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb0359280_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb03592800x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb03592800x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb03592800x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fb03592800x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965fbad50efc0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fd1f38135_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fd1f381350x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fd1f381350x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fd1f381350x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f109c311e0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f109c311e_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f109c311e0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f109c311e0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x4_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x30x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691ffcbb9b3e_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691ffcbb9b3e0x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691ffcbb9b3e0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691ffcbb9b3e0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f68b974e20x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f68b974e20x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f68b974e2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f68b974e20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x0");
			this.user = user;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x10x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x10x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x10x0");
			this.folderName = user.getSettings().getDraftsFolderName();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x20x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x0");
			this.subject = subject;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x3_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691f571c247c0x40x30x0");
			this.object = object;
        }

        public void run(){
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x2_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad190");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x00x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x00x0");
				sleep(IMAP_SAVE_DELAY);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x00x10x00x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x00x10x00x1");
				saveUserPreferencesInIMAP(logger, user, cache.getMailSession(user), cache.get(user), folderName, subject, object);
            } catch (Exception e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x10x1_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x10x00x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x10x10x0_____org_apache_hupa_server_preferences_InImapUserPreferencesStorage_java0x04ddc965f65a7691fdf6ad1900x20x00x10x10x00x0");
				logger.error("Error saving user's preferences: ", e);
            }
        }
    }
}
