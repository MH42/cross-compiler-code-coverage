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

package org.apache.hupa.server.service;


import tc3.desktop.InstrumentationLoggerProvider;
import java.util.ArrayList;
import java.util.List;

import javax.mail.Folder;
import javax.mail.MessagingException;

import org.apache.hupa.shared.data.ImapFolderImpl;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.User;

import com.sun.mail.imap.IMAPStore;

public class ImapFolderServiceImpl extends AbstractService implements ImapFolderService {


    public ImapFolderServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d280x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d280x2_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d280x1");
	}
	

	@Override
	public List<ImapFolder> requestFolders() throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x2_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x10x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x00x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x00x1");
		User user = getUser();
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x00x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x00x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x0");
			IMAPStore store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x10x10x00x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x10x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x10x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x10x10x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x1");
			com.sun.mail.imap.IMAPFolder folder = (com.sun.mail.imap.IMAPFolder) store.getDefaultFolder();

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x20x10x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x20x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x20x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x20x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x20x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x2_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x20x10x00x00x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x20x10x00x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x20x00x1");
			// List of mail 'root' imap folders
            List<ImapFolder> imapFolders = new ArrayList<ImapFolder>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x3");
			// Create IMAPFolder tree list
            for (Folder f : folder.list()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x20x00x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x20x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x20x00x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x20x00x0");
				ImapFolder imapFolder = createIMAPFolder(f);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x20x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x20x10x0");
				imapFolders.add(imapFolder);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x20x20x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x30x20x2");
				walkFolders(f, imapFolder);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x00x4");
			return imapFolders;
        } catch (Exception e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x10x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x10x0");
			e.printStackTrace();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x10x10x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x10x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x10x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d289eac455c0x20x10x10x10x10x00x1");
			throw new Exception("Unable to get folders for User " + user);
        }
    }

    /**
     * Walk through the folder's sub-folders and add sub-folders to current
     * imapFolder
     *
     * @param folder Folder to walk
     * @param imapFolder Current IMAPFolder
     * @throws MessagingException If an error occurs
     */
    private void walkFolders(Folder folder, ImapFolder imapFolder) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d70");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x3_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x4_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x20x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x2_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x00x0");
		for (Folder f : folder.list()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x00x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x00x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x0");
			ImapFolder iFolder = createIMAPFolder(f);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x10x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x10x0");
			imapFolder.getChildren().add(iFolder);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x2_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d28ac947d700x40x00x20x20x0");
			walkFolders(f, iFolder);
        }
    }

    /**
     * Create a new IMAPFolder from the given Folder
     *
     * @param folder Current folder
     * @return imapFolder Created IMAPFolder
     * @throws Exception If an error occurs
     * @throws MessagingException If an error occurs
     */
    private ImapFolder createIMAPFolder(Folder folder) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x2_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x3_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f98");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x00x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x00x1");
		String fullName = folder.getFullName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x10x1");
		String delimiter;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x20x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x2_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x20x1");
		ImapFolder iFolder = null;

        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x00x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x00x00x00x0");
			delimiter = String.valueOf(folder.getSeparator());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x10x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x10x00x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x1");
			iFolder = new ImapFolderImpl(fullName);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x2_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x20x0");
			iFolder.setDelimiter(delimiter);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x3_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x30x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x30x0");
			if ("[Gmail]".equals(folder.getFullName())) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x30x10x0");
				return iFolder;
			}
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x4_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x40x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x40x0");
			iFolder.setMessageCount(folder.getMessageCount());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x50x00x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x5_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x50x0");
			iFolder.setSubscribed(folder.isSubscribed());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x60x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x6_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x00x60x00x0");
			iFolder.setUnseenMessageCount(folder.getUnreadMessageCount());
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x10x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x1_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x10x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x10x10x0_____org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x30x10x10x00x0");
			e.printStackTrace();
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_ImapFolderServiceImpl_java0x092de1d2862710f980x30x4");
		return iFolder;
    }
}
