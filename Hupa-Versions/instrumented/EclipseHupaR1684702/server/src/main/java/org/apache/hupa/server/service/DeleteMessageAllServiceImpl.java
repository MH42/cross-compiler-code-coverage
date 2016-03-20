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
import javax.mail.Message;
import javax.mail.MessagingException;

import org.apache.hupa.shared.domain.DeleteMessageAction;
import org.apache.hupa.shared.domain.DeleteMessageAllAction;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class DeleteMessageAllServiceImpl extends DeleteMessageBaseServiceImpl implements DeleteMessageAllService {

    public DeleteMessageAllServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633400x2_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f63340_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633400x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633400x1");
	}
	

	@Override
    protected Message[] getMessagesToDelete(DeleteMessageAction actionBase) throws HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x2_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x20x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x3_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c028");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x00x10x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x00x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x00x10x0");
		DeleteMessageAllAction action = (DeleteMessageAllAction) actionBase;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x10x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x10x10x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x10x0");
		User user = getUser();
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x00x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x00x00x00x0");
			logger.info("Delete all messages in folder " + action.getFolder() + " for user " + user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x10x10x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x10x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x10x0");
			IMAPStore store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x20x10x00x10x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x20x10x00x10x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x20x10x00x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x20x10x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x2_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x20x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x20x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x20x10x0");
			IMAPFolder folder = (IMAPFolder) store.getFolder(action.getFolder().getFullName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x30x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x3_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x30x00x0");
			if (folder.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x30x10x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x30x10x00x0");
				folder.open(Folder.READ_WRITE);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x40x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x00x4");
			return folder.getMessages();
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x00x1_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x00x10x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x00x10x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x0");
			String errorMsg = "Error while deleting all messages in folder " + action.getFolder() + " for user " + user;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x10x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x1");
			logger.error(errorMsg, e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x20x00x0_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x2_____org_apache_hupa_server_service_DeleteMessageAllServiceImpl_java0x0a2f633407111c0280x30x20x10x10x20x0");
			throw new HupaException(errorMsg);

        }

    }

}
