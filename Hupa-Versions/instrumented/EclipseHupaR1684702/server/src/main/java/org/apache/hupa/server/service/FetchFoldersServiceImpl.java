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
import org.apache.hupa.shared.exception.HupaException;

import com.sun.mail.imap.IMAPStore;

public class FetchFoldersServiceImpl extends AbstractService implements FetchFoldersService {

    public FetchFoldersServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8630x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8630x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8630x2");
	}
	

	@Override
    public List<ImapFolder> fetch(ImapFolder imapFolder, Boolean recursive) throws MessagingException, HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x30x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x2_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x4_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x0");
		if(recursive){
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x00x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x00x00x00x00x0");
			return this.pullAll();
        }
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x00x0");
			Folder folder = null;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x10x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x10x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x10x0");
			IMAPStore store = cache.get(getUser());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x2_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x0");
			if (imapFolder == null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x10x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x10x0");
				folder = store.getDefaultFolder();
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x20x00x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x20x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x20x20x00x0");
				folder = store.getFolder(imapFolder.getFullName());
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x30x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x30x10x00x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x30x10x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x30x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x30x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x30x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x30x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x30x00x1");
			List<ImapFolder> imapFolders = new ArrayList<ImapFolder>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x4_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x1");
			for (Folder f : folder.list()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x20x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x20x00x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x20x00x0");
				ImapFolder i = createImapFolder(f);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x20x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x40x20x10x0");
				imapFolders.add(i);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x00x5");
			return imapFolders;
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x10x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x10x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x10x10x0");
			e.printStackTrace();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x10x10x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x10x10x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863f68ce1ce0x40x10x10x10x1");
			throw new MessagingException();
        }
    }

    public List<ImapFolder> pullAll() throws MessagingException, HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x00x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x00x0");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x0");
		try {

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x00x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x00x0");
			// get the store for the user
            IMAPStore store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x10x10x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x10x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x10x10x00x0");
			com.sun.mail.imap.IMAPFolder folder = (com.sun.mail.imap.IMAPFolder) store.getDefaultFolder();

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x20x10x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x20x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x20x10x00x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x20x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x20x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x20x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x20x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x2");
			// List of mail 'root' imap folders
            List<ImapFolder> imapFolders = new ArrayList<ImapFolder>();

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x0");
			// Create IMAPFolder tree list
            for (Folder f : folder.list()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x20x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x20x00x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x20x00x1");
				ImapFolder imapFolder = createIMAPFolder(f);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x20x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x20x10x0");
				imapFolders.add(imapFolder);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x20x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x30x20x2");
				walkFolders(f, imapFolder);
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x00x4");
			return imapFolders;
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x00x0");
			e.printStackTrace();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x10x0");
			logger.error("Unable to get folders for User " + user, e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x2_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x20x0");
			e.printStackTrace();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x30x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863e3a7dddc0x20x10x10x10x30x0");
			throw new MessagingException();
        }
    }

    /**
     * Walk through the folder's sub-folders and add sub-folders to current
     * imapFolder
     *
     * @param folder
     *            Folder to walk
     * @param imapFolder
     *            Current IMAPFolder
     * @throws ActionException
     *             If an error occurs
     * @throws MessagingException
     *             If an error occurs
     * @throws HupaException
     */
    private void walkFolders(Folder folder, ImapFolder imapFolder) throws MessagingException, HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x30x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x2_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d70");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x0");
		for (Folder f : folder.list()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x00x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x00x1");
			ImapFolder iFolder = createIMAPFolder(f);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x10x00x0");
			imapFolder.getChildren().add(iFolder);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb863ac947d700x40x00x20x2");
			walkFolders(f, iFolder);
        }
    }

    private ImapFolder createIMAPFolder(Folder folder) throws MessagingException, HupaException {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x2_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f98_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x00x10x0");
		String fullName = folder.getFullName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x10x1");
		String delimiter;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x20x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x2");
		ImapFolder iFolder = null;

        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x00x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x00x0");
			logger.debug("Creating folder: " + fullName + " for user: " + getUser());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x10x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x1");
			delimiter = String.valueOf(folder.getSeparator());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x20x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x2_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x20x00x00x0");
			iFolder = new ImapFolderImpl(fullName);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x30x0");
			iFolder.setHasChildren(true);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x40x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x4");
			iFolder.setDelimiter(delimiter);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x5_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x50x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x50x0");
			if ("[Gmail]".equals(folder.getFullName())) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x50x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x50x10x0");
				return iFolder;
			}
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x6_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x60x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x60x00x0");
			iFolder.setMessageCount(folder.getMessageCount());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x70x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x7_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x70x00x0");
			iFolder.setSubscribed(folder.isSubscribed());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x80x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x80x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x00x8");
			iFolder.setUnseenMessageCount(folder.getUnreadMessageCount());
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x10x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x10x10x00x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x10x10x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x30x10x10x0");
			logger.error("Unable to construct folder " + folder.getFullName(), e);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb86362710f980x30x4");
		return iFolder;
    }

    /**
     * Create a new IMAPFolder from the given Folder
     *
     * @param folder
     *            Current folder
     * @return imapFolder Created IMAPFolder
     * @throws HupaException
     * @throws Exception
     *             If an error occurs
     * @throws MessagingException
     *             If an error occurs
     */
    private ImapFolder createImapFolder(Folder folder) throws HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x00x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x00x1");
		String fullName = folder.getFullName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x10x0");
		String delimiter;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x2_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x20x1");
		ImapFolder iFolder = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x00x00x00x0");
			new RuntimeException().printStackTrace();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x10x00x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x10x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x10x0");
			System.out.println("Creating folder2: " + fullName + " for user: " + this.getUser());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x20x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x20x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x2_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x20x00x0");
			delimiter = String.valueOf(folder.getSeparator());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x30x00x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x30x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x3_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x30x0");
			iFolder = new ImapFolderImpl(fullName);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x4_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x40x0");
			iFolder.setDelimiter(delimiter);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x5_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x50x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x50x0");
			if ("[Gmail]".equals(folder.getFullName())) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x50x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x50x10x0");
				return iFolder;
			}
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x6_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x60x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x60x00x0");
			iFolder.setMessageCount(folder.getMessageCount());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x70x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x70x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x7");
			iFolder.setSubscribed(folder.isSubscribed());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x80x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x8_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x80x00x0");
			iFolder.setUnseenMessageCount(folder.getUnreadMessageCount());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x90x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x9_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0");
			if (folder.list().length != 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x90x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x90x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x00x90x10x00x0");
				iFolder.setHasChildren(true);
            }
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x10x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x10x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x1_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x10x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x10x10x00x0_____org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x30x10x10x0");
			e.printStackTrace();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchFoldersServiceImpl_java0x0d14bb8639f4d0b3b0x30x4");
		return iFolder;
    }

}
