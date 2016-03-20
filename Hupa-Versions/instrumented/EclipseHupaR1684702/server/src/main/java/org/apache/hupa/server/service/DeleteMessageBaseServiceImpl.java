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
import javax.mail.Message;
import javax.mail.MessagingException;

import org.apache.hupa.shared.data.DeleteMessageResultImpl;
import org.apache.hupa.shared.domain.DeleteMessageAction;
import org.apache.hupa.shared.domain.DeleteMessageResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

import com.sun.mail.imap.IMAPStore;

public abstract class DeleteMessageBaseServiceImpl extends AbstractService{
    public DeleteMessageBaseServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa8480x2_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa8480x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa8480x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848");
	}
	


	public DeleteMessageResult delete(DeleteMessageAction action) throws HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x2_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde53_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x20x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x3_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x00x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x00x10x0");
		ImapFolder folder = action.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x10x10x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x10x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x10x0");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x2_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x00x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x00x10x0");
			IMAPStore store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x10x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x10x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x10x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x10x10x00x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x10x10x0");
			com.sun.mail.imap.IMAPFolder f = (com.sun.mail.imap.IMAPFolder) store
                    .getFolder(folder.getFullName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x20x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x20x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x2");
			// check if the folder is open, if not open it "rw"
            if (f.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x20x10x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x20x10x00x0");
				f.open(com.sun.mail.imap.IMAPFolder.READ_WRITE);
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x30x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x30x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x3_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x30x10x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x30x1");
			Message[] mArray = getMessagesToDelete(action);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x4_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x00x00x0");
			// check if the delete was triggered not in the trash folder
            if (folder.getFullName().equalsIgnoreCase(
                    user.getSettings().getTrashFolderName()) == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x00x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x00x10x00x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x00x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x00x10x0");
				com.sun.mail.imap.IMAPFolder trashFolder = (com.sun.mail.imap.IMAPFolder) store
                        .getFolder(user.getSettings().getTrashFolderName());

                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x10x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x10x1");
				boolean trashFound = false;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x2");
				// if the trash folder does not exist we create it
                if (trashFolder.exists() == false) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x10x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x10x00x00x0");
					trashFound = trashFolder
                            .create(com.sun.mail.imap.IMAPFolder.READ_WRITE);
                } else {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x20x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x20x20x0");
					trashFound = true;
                }

                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x3");
				// Check if we are able to copy the messages to the trash folder
                if (trashFound) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x30x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x30x00x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x40x10x30x00x0");
					// copy the messages to the trashfolder
                    f.copyMessages(mArray, trashFolder);
                }
            }


            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x50x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x50x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x5_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x50x00x00x0");
			// delete the messages from the folder
            f.setFlags(mArray, new Flags(Flags.Flag.DELETED), true);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x6_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x0");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x00x00x0");
				f.expunge(mArray);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x00x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x00x10x0");
				f.close(false);
            } catch (MessagingException e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x10x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x10x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x10x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x60x10x10x0");
				// prolly UID expunge is not supported
                f.close(true);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x70x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x7_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x00x70x0");
			return new DeleteMessageResultImpl(user, folder, mArray.length);

        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x10x00x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x10x0");
			logger.error("Error while deleting messages for user " + user
                    + " in folder" + action.getFolder(), e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x10x10x00x0_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x10x1_____org_apache_hupa_server_service_DeleteMessageBaseServiceImpl_java0x08c2aa848402fde530x30x20x10x10x10x0");
			throw new HupaException("Error while deleting messages");
        }
    }


    /**
     * Return an array holding all messages which should get deleted by the given action
     *
     * @param action
     * @return messages
     */
    protected abstract Message[] getMessagesToDelete(DeleteMessageAction actionBase) throws HupaException;
}
