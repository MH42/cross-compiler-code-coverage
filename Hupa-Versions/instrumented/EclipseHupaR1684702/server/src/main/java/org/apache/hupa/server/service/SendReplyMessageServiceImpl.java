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
import org.apache.hupa.shared.domain.SendMessageAction;
import org.apache.hupa.shared.domain.SendReplyMessageAction;
import org.apache.hupa.shared.exception.HupaException;

import com.google.inject.Inject;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class SendReplyMessageServiceImpl extends SendMessageBaseServiceImpl implements SendReplyMessageService{

    @Inject
    public SendReplyMessageServiceImpl(UserPreferencesStorage preferences, IMAPStoreCache cache) {
        super(preferences, cache);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5977e6b1e630x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5977e6b1e630x2_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5977e6b1e630x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5977e6b1e630x3_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5977e6b1e630x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5977e6b1e630x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5977e6b1e630x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec597_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5970x2_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5970x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5970x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec5977e6b1e63");
    }

    @Override
    @SuppressWarnings({ "rawtypes", "unchecked" })
    protected List getAttachments(SendMessageAction action) throws MessagingException, HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce7700");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x20x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x2_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x3_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x00x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x00x10x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x00x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x0");
		SendReplyMessageAction replyAction = (SendReplyMessageAction)action;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x10x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x10x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x10x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x10x00x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x10x10x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x1");
		List<?> items = new ArrayList();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x20x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x2_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x20x10x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x20x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x20x1");
		IMAPStore store = cache.get(getUser());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x30x10x00x10x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x30x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x30x10x00x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x30x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x3_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x30x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x30x10x00x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x30x10x00x0");
		IMAPFolder folder = (IMAPFolder) store.getFolder(replyAction.getFolder().getFullName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x40x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x40x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x4");
		if (folder.isOpen() == false) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x40x10x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x40x10x0");
			folder.open(Folder.READ_ONLY);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x5_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x50x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x50x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x50x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x50x10x00x0");
		// Only original inline images have to be added to the list
        Message msg = folder.getMessageByUID(replyAction.getUid());
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x6");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x00x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x00x00x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x00x0");
			items = MessageUtils.extractInlineImages(logger, msg.getContent());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x10x00x0");
			if (items.size() > 0) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x10x10x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x10x10x00x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x10x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x00x10x10x00x00x00x0");
				logger.debug("Replying a message, extracted: " + items.size() + " inline image from");
			}
        } catch (IOException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x10x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x1_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x10x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x10x10x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x60x10x10x00x0");
			e.printStackTrace();
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x70x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x70x00x0_____org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x7");
		// Put into the list the attachments uploaded by the user
        items.addAll(super.getAttachments(replyAction));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendReplyMessageServiceImpl_java0x01a0ec59792ce77000x30x8");
		return items;
    }


}
