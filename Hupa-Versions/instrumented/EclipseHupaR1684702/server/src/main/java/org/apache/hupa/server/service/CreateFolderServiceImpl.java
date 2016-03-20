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
import org.apache.hupa.shared.domain.CreateFolderAction;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.User;

import com.sun.mail.imap.IMAPStore;

public class CreateFolderServiceImpl extends AbstractService implements CreateFolderService {

    public CreateFolderServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0da0x2_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0da0x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0da_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0da0x0");
	}
	

	@Override
    public GenericResult create(CreateFolderAction action) throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x3_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x20x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf854348");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x00x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x00x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x00x10x0");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x10x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x10x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x10x10x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x1");
		ImapFolder folder = action.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x2_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x20x10x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x20x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x20x0");
		IMAPStore store = cache.get(user);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x30x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x3_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x30x10x00x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x30x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x30x10x0");
		Folder f = store.getFolder(folder.getFullName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x4");
		if (f.create(Folder.HOLDS_MESSAGES)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x10x00x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x10x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x10x00x00x0");
			logger.info("Successfully create folder " + folder + " for user " + user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x10x10x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x10x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x10x10x00x0");
			return new GenericResultImpl();
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x20x00x00x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x20x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x20x00x0");
			logger.info("Unable to create folder " + folder + " for user " + user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x20x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x20x10x0_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x20x10x00x1_____org_apache_hupa_server_service_CreateFolderServiceImpl_java0x079a2b0daaf8543480x30x40x20x10x00x0");
			throw new Exception("Unable to create folder " + folder + " for user " + user);

        }
    }

}
