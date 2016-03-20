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
import javax.mail.Folder;

import org.apache.hupa.shared.data.GenericResultImpl;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.RenameFolderAction;
import org.apache.hupa.shared.domain.User;

import com.sun.mail.imap.IMAPStore;

public class RenameFolderServiceImpl extends AbstractService implements RenameFolderService {

    public RenameFolderServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf0x2_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf0x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf0x1");
	}
	

	@Override
    public GenericResult rename(RenameFolderAction action) throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x1_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x3_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x2_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b02");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x00x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x00x1_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x00x0");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x1_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x10x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x10x1");
		ImapFolder folder = action.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x20x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x20x1_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x20x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x2");
		String newName = action.getNewName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x30x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x30x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x3_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x30x1");
		IMAPStore store = cache.get(user);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x4_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x40x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x40x10x00x1_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x40x10x00x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x40x1_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x40x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x40x10x00x10x0");
		com.sun.mail.imap.IMAPFolder iFolder = (com.sun.mail.imap.IMAPFolder) store.getFolder(folder.getFullName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x5_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x50x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x50x1_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x50x0");
		Folder newFolder = store.getFolder(newName);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x6_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x60x0");
		if (iFolder.isOpen()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x60x10x00x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x60x10x0");
			iFolder.close(false);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x70x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x7");
		if (iFolder.renameTo(newFolder)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x70x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x70x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x70x10x00x00x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x70x10x00x0");
			return new GenericResultImpl();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x80x00x10x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x80x00x1_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x80x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x80x00x0_____org_apache_hupa_server_service_RenameFolderServiceImpl_java0x0568134cf1c492b020x30x8");
		throw new Exception("Unable to rename Folder " + folder.getFullName() + " to " + newName + " for user " + user);
    }

}
