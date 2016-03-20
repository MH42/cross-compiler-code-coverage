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
import javax.mail.MessagingException;

import org.apache.hupa.shared.data.GenericResultImpl;
import org.apache.hupa.shared.domain.DeleteFolderAction;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

import com.sun.mail.imap.IMAPStore;

public class DeleteFolderServiceImpl extends AbstractService implements DeleteFolderService {

    public DeleteFolderServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e0x1_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e0x2_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e0x0");
	}
	

	@Override
    public GenericResult delete(DeleteFolderAction action) throws HupaException, MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x1_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x3_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x20x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x00x10x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x00x1_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x00x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x0");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x10x1_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x10x10x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x10x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x1");
		ImapFolder folder = action.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x2_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x20x10x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x20x1_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x20x0");
		IMAPStore store = cache.get(user);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x3_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x30x10x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x30x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x30x10x00x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x30x1");
		Folder f = store.getFolder(folder.getFullName());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x40x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x4");
		// close the folder if its open
        if (f.isOpen()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x40x10x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x40x10x00x0");
			f.close(false);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x5_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x0");
		// recursive delete the folder
        if (f.delete(true)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x10x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x10x00x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x10x00x00x0");
			logger.info("Successfully delete folder " + folder + " for user " + user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x10x10x00x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x10x1_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x10x10x0");
			return new GenericResultImpl();
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x20x00x00x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x20x00x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x20x0_____org_apache_hupa_server_service_DeleteFolderServiceImpl_java0x0df1ef31e62c821eb0x30x50x20x00x00x1");
			throw new HupaException("Unable to delete folder " + folder + " for user " + user);
        }
    }

}
