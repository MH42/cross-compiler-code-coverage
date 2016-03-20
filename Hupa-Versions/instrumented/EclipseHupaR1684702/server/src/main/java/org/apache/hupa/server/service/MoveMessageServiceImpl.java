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
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;

import org.apache.hupa.shared.data.GenericResultImpl;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.MoveMessageAction;
import org.apache.hupa.shared.domain.User;

import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class MoveMessageServiceImpl extends AbstractService implements MoveMessageService {
    public MoveMessageServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c0x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c0x2_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c0x1");
	}
	
	public GenericResult move(MoveMessageAction action) throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x20x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x2_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x3_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x00x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x00x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x00x0");
		User user = getUser();
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x00x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x00x1");
			IMAPStore store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x10x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x10x10x00x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x10x10x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x10x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x10x10x00x10x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x10x10x00x10x0");
			IMAPFolder folder = (IMAPFolder) store.getFolder(action.getOldFolder().getFullName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x20x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x20x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x2");
			if (folder.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x20x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x20x10x00x0");
				folder.open(Folder.READ_WRITE);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x30x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x30x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x30x10x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x3_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x30x10x0");
			Message m = folder.getMessageByUID(action.getMessageUid());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x40x10x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x40x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x40x10x00x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x4_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x40x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x40x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x40x00x0");
			Message[] mArray = new Message[] { m };
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x50x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x50x00x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x5_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x50x00x00x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x50x00x0");
			folder.copyMessages(mArray, store.getFolder(action.getNewFolder().getFullName()));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x60x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x60x00x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x6_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x60x00x0");
			folder.setFlags(mArray, new Flags(Flags.Flag.DELETED), true);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x7_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x0");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x00x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x00x0");
				folder.expunge(mArray);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x00x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x00x1");
				folder.close(false);
            } catch (MessagingException e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x10x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x10x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x10x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x70x10x10x00x0");
				// prolly UID expunge is not supported
                folder.close(true);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x8_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x80x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x00x80x00x0");
			return new GenericResultImpl();
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x10x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x10x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x10x10x00x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x10x10x0");
			logger.error(
                    "Error while moving message " + action.getMessageUid() + " from folder " + action.getOldFolder()
                            + " to " + action.getNewFolder(), e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x10x10x1_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x10x10x10x0_____org_apache_hupa_server_service_MoveMessageServiceImpl_java0x0b956be3c31d7d60c0x30x10x10x10x10x00x0");
			throw new Exception(e);
        }
    }
}
