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

import javax.mail.Message;
import javax.mail.MessagingException;

import org.apache.hupa.shared.domain.DeleteMessageAction;
import org.apache.hupa.shared.domain.DeleteMessageByUidAction;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

import com.sun.mail.imap.IMAPStore;

public class DeleteMessageByUidServiceImpl extends DeleteMessageBaseServiceImpl implements DeleteMessageByUidService{

    public DeleteMessageByUidServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f30x2_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f30x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f3_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f30x1");
	}
	

	@Override
    protected Message[] getMessagesToDelete(DeleteMessageAction actionBase) throws HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x2_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x3_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x20x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c028");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x00x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x00x10x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x00x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x0");
		DeleteMessageByUidAction action = (DeleteMessageByUidAction)actionBase;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x10x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x10x10x0");
		ImapFolder folder = action.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x2_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x20x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x20x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x20x00x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x20x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x20x10x0");
		List<Long> uids = action.getMessageUids();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x30x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x3_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x30x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x30x10x0");
		User user = getUser();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x40x00x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x4_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x40x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x40x0");
		logger.info("Deleting messages with uids " + action.getMessageUids()
                + " for user " + user + " in folder " + action.getFolder());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x5_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x00x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x00x10x0");
			IMAPStore store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x10x10x00x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x10x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x10x10x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x10x1");
			com.sun.mail.imap.IMAPFolder f = (com.sun.mail.imap.IMAPFolder) store
                    .getFolder(folder.getFullName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x20x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x2_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x20x0");
			// check if the folder is open, if not open it "rw"
            if (f.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x20x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x20x10x00x0");
				f.open(com.sun.mail.imap.IMAPFolder.READ_WRITE);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x30x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x30x10x00x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x30x10x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x30x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x30x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x30x00x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x30x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x3_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x30x10x00x00x1");
			// build up the list of messages to delete
            List<Message> messages = new ArrayList<Message>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x40x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x4_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x40x00x0");
			for (Long uid : uids) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x40x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x40x10x00x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x40x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x40x10x00x0");
				messages.add(f.getMessageByUID(uid));
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x50x10x00x00x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x50x10x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x50x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x50x10x00x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x50x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x5_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x50x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x50x10x00x00x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x50x1");
			Message[] mArray = messages.toArray(new Message[messages.size()]);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x00x6");
			return mArray;
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x1_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x10x00x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x10x00x0");
			logger.error("Error while deleting messages with uids "
                    + action.getMessageUids() + " for user " + user
                    + " in folder" + action.getFolder(), e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x10x10x00x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x10x10x0_____org_apache_hupa_server_service_DeleteMessageByUidServiceImpl_java0x0d57752f37111c0280x30x50x10x10x1");
			throw new HupaException("Error while deleting messages", e);
        }

    }

}
