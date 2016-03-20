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
import java.util.List;

import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;

import org.apache.hupa.server.handler.JavamailUtil;
import org.apache.hupa.shared.data.GenericResultImpl;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.SetFlagAction;
import org.apache.hupa.shared.domain.User;

import com.sun.mail.imap.IMAPStore;

public class SetFlagServiceImpl extends AbstractService implements SetFlagService {

    public SetFlagServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d850x2_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d850x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d850x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85");
	}
	

	@Override
    public GenericResult set(SetFlagAction action) throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x20x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x2_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x3_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x00x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x00x1");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x10x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x10x1");
		ImapFolder folder = action.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x20x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x20x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x20x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x20x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x20x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x2");
		List<Long> uids = action.getUids();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x30x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x3_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x30x0");
		com.sun.mail.imap.IMAPFolder f = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x4_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x00x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x00x0");
			IMAPStore store = cache.get(user);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x10x00x00x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x10x00x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x10x00x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x10x0");
			f = (com.sun.mail.imap.IMAPFolder) store.getFolder(folder.getFullName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x20x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x2_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x20x0");
			if (f.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x20x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x20x10x00x0");
				f.open(Folder.READ_WRITE);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x30x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x30x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x30x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x3_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x30x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x30x1");
			Message[] msgs = f.getMessagesByUID(toArray(uids));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x40x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x40x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x40x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x40x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x4");
			Flag flag = JavamailUtil.convert(action.getFlag());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x5_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x50x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x50x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x50x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x50x1");
			Flags flags = new Flags();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x60x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x6");
			flags.add(flag);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x70x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x7_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x70x0");
			f.setFlags(msgs, flags, action.getValue());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x80x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x80x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x00x8");
			return new GenericResultImpl();
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x00x10x0");
			String errorMsg = "Error while setting flags of messages with uids " + uids + " for user " + user;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x10x0");
			logger.error(errorMsg, e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x20x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x20x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x10x10x2");
			throw new Exception(errorMsg, e);
        } finally {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x00x0");
			if (f != null && f.isOpen()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x1");
				try {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x10x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x10x00x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x10x00x00x00x0");
					f.close(false);
                } catch (MessagingException e) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x10x00x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x10x00x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x10x00x10x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8564233d6b0x30x40x20x00x10x00x1");
                    // ignore on close
                }
            }
        }
    }

    private long[] toArray(List<Long> uids) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x20x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x2_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x3_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x20x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x20x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d8566109082_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x00x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x00x10x00x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x00x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x00x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x00x10x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x00x0");
		long[] array = new long[uids.size()];
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x2_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x00x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x1_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x10x0");
		for (int i = 0; i < uids.size(); i++) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x30x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x30x00x0_____org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x10x30x00x00x0");
			array[i] = uids.get(i);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SetFlagServiceImpl_java0x0f3c97d85661090820x30x2");
		return array;
    }
}
