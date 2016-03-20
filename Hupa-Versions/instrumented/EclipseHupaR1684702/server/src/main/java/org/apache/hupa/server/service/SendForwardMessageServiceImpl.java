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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;

import org.apache.hupa.server.IMAPStoreCache;
import org.apache.hupa.server.preferences.UserPreferencesStorage;
import org.apache.hupa.server.utils.MessageUtils;
import org.apache.hupa.shared.domain.SendForwardMessageAction;
import org.apache.hupa.shared.domain.SendMessageAction;
import org.apache.hupa.shared.exception.HupaException;

import com.google.inject.Inject;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class SendForwardMessageServiceImpl extends SendMessageBaseServiceImpl implements SendForwardMessageService {

    @Inject
    public SendForwardMessageServiceImpl(UserPreferencesStorage preferences, IMAPStoreCache cache) {
        super(preferences, cache);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6a5aa53a60x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6a5aa53a60x2_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6a5aa53a60x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6a5aa53a60x10x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6a5aa53a60x20x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6a5aa53a60x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6a5aa53a60x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b60x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b60x2_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b6a5aa53a6");
    }

    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected List getAttachments(SendMessageAction action) throws MessagingException, HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce7700");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x20x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x2_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x3_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x00x10x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x00x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x00x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x00x0");
		SendForwardMessageAction forwardAction = (SendForwardMessageAction)action;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x10x00x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x10x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x10x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x10x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x10x10x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x1");
		List<?> items = new ArrayList();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x20x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x2_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x20x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x20x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x20x10x0");
		IMAPStore store = cache.get(getUser());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x30x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x30x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x30x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x30x10x00x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x30x10x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x3_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x30x10x00x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x30x10x00x10x0");
		IMAPFolder folder = (IMAPFolder) store.getFolder(forwardAction.getFolder().getFullName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x40x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x40x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x4");
		if (folder.isOpen() == false) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x40x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x40x10x0");
			folder.open(Folder.READ_ONLY);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x50x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x50x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x5_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x50x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x50x10x0");
		// Put the original attachments in the list
        Message msg = folder.getMessageByUID(forwardAction.getUid());
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x6");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x00x00x00x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x00x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x00x00x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x00x0");
			items = MessageUtils.extractMessageAttachments(logger, msg.getContent());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x00x10x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x00x10x00x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x00x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x00x10x00x0");
			logger.debug("Forwarding a message, extracted: " + items.size() + " from original.");
        } catch (IOException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x10x1_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x10x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x10x10x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x60x10x10x00x0");
			e.printStackTrace();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x7_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x70x00x0_____org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x70x0");
		// Put in the list the attachments uploaded by the user
        items.addAll(super.getAttachments(forwardAction));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendForwardMessageServiceImpl_java0x0905fa9b692ce77000x30x8");
		return items;
    }
}
