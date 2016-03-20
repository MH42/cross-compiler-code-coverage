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

import javax.mail.Address;
import javax.mail.FetchProfile;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.UIDFolder;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.search.BodyTerm;
import javax.mail.search.FromStringTerm;
import javax.mail.search.OrTerm;
import javax.mail.search.SearchTerm;
import javax.mail.search.SubjectTerm;

import org.apache.hupa.server.handler.JavamailUtil;
import org.apache.hupa.server.preferences.UserPreferencesStorage;
import org.apache.hupa.server.utils.MessageUtils;
import org.apache.hupa.shared.data.FetchMessagesResultImpl;
import org.apache.hupa.shared.data.MessageImpl.IMAPFlag;
import org.apache.hupa.shared.data.TagImpl;
import org.apache.hupa.shared.domain.FetchMessagesAction;
import org.apache.hupa.shared.domain.FetchMessagesResult;
import org.apache.hupa.shared.domain.Tag;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

import com.google.inject.Inject;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class FetchMessagesServiceImpl extends AbstractService implements FetchMessagesService {

    @Inject protected UserPreferencesStorage userPreferences;

    @Override
	public FetchMessagesResult fetch(FetchMessagesAction action) throws HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a24");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x00x0");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x0");
		// ImapFolder folder = action.getFolder();
        if (action.getFolder() == null || action.getFolder().getFullName() == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x10x10x0");
			// folder = new
            // ImapFolderImpl(user.getSettings().getInboxFolderName());
            throw new IllegalArgumentException("why you want to ask us for messages in a null folder");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x20x1");
		com.sun.mail.imap.IMAPFolder f = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x30x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x30x0");
		int start = action.getStart();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x40x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x40x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x40x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x4");
		int offset = action.getOffset();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x5_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x00x1");
			IMAPStore store = cache.get(user);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x10x00x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x10x00x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x10x00x00x1");
			f = (com.sun.mail.imap.IMAPFolder) store.getFolder(action.getFolder().getFullName());

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x20x00x0");
			// check if the folder is open, if not open it read only
            if (f.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x20x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x20x10x0");
				f.open(com.sun.mail.imap.IMAPFolder.READ_ONLY);
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x30x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x30x0");
			// if the folder is empty we have no need to process
            int exists = f.getMessageCount();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x4");
			if (exists == 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x10x00x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x10x00x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x10x00x00x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x40x10x00x0");
				return new FetchMessagesResultImpl(new ArrayList<org.apache.hupa.shared.domain.Message>(), start,
                        offset, 0, 0);
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x50x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x5_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x50x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x50x10x0");
			MessageConvertArray convArray = getMessagesToConvert(f, action);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x60x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x60x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x60x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x6_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x00x60x00x0");
			return new FetchMessagesResultImpl(convert(offset, f, convArray.getMesssages()), start, offset,
                    convArray.getRealCount(), f.getUnreadMessageCount());
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x00x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x00x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x00x00x00x0");
			logger.info("Error fetching messages in folder: " + action.getFolder().getFullName() + " " + e.getMessage());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x10x00x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x10x10x10x00x10x00x0");
			// Folder can not contain messages
            return new FetchMessagesResultImpl(new ArrayList<org.apache.hupa.shared.domain.Message>(), start, offset,
                    0, 0);
        } finally {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x00x0");
			if (f != null && f.isOpen()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x1");
				try {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x10x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x10x00x00x00x0");
					f.close(false);
                } catch (MessagingException e) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x10x00x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164213c51a240x30x50x20x00x10x00x10x0");
                    // we don't care to much about an exception on close here...
                }
            }
        }
    }

    protected MessageConvertArray getMessagesToConvert(IMAPFolder f, FetchMessagesAction action)
            throws MessagingException, HupaException {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x30x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x00x10x0");
		String searchString = action.getSearchString();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x10x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x1");
		int start = action.getStart();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x20x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x20x1");
		int offset = action.getOffset();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x30x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x30x0");
		int end = start + offset;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x40x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x40x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x4_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x40x1");
		Message[] messages;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x5_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x50x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x50x1");
		int exists;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x6");
		// check if a searchString was given, and if so use it
        if (searchString == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x00x0");
			exists = f.getMessageCount();

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x10x0");
			if (end > exists) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x10x10x0");
				end = exists;
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x20x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x20x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x20x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x20x0");
			int firstIndex = exists - end + 1;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x30x0");
			if (firstIndex < 1) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x30x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x30x10x0");
				firstIndex = 1;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x4_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x40x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x40x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x40x1");
			int lastIndex = exists - start;

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x50x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x50x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x10x5");
			messages = f.getMessages(firstIndex, lastIndex);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x00x10x0");
			SearchTerm subjectTerm = new SubjectTerm(searchString);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x10x10x0");
			SearchTerm fromTerm = new FromStringTerm(searchString);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x20x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x20x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x20x10x0");
			SearchTerm bodyTerm = new BodyTerm(searchString);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x30x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x30x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x30x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x30x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x30x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x30x0");
			SearchTerm orTerm = new OrTerm(new SearchTerm[] { subjectTerm, fromTerm, bodyTerm });
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x40x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x40x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x40x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x4_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x40x1");
			Message[] tmpMessages = f.search(orTerm);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x50x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x5");
			if (end > tmpMessages.length) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x50x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x50x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x50x10x00x0");
				end = tmpMessages.length;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x6_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x60x0");
			exists = tmpMessages.length;

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x7_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x70x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x70x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x70x1");
			int firstIndex = exists - end;

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x8_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x0");
			if (tmpMessages.length > firstIndex) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x00x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x00x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x00x1");
				List<Message> mList = new ArrayList<Message>();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x0");
				for (int i = firstIndex; i < tmpMessages.length; i++) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x3");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x30x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x30x0");
					if (i == end) {
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x30x00x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x30x00x10x0");
						break;
					}
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x30x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x10x30x10x0");
					mList.add(tmpMessages[i]);
                }
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x20x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x20x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x20x00x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x20x00x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x20x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x10x2");
				messages = mList.toArray(new Message[mList.size()]);
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x20x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x20x00x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x20x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x20x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x60x20x80x20x0");
				messages = new Message[0];
            }

        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x70x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x70x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x7_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x70x00x00x0");
		logger.debug("Fetching messages for user: " + getUser() + " returns: " + messages.length + " messages in "
                + f.getFullName());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x8_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x80x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16426f628ba00x40x80x0");
		return new MessageConvertArray(exists, messages);
    }


    @Override
	public List<org.apache.hupa.shared.domain.Message> convert(int offset, com.sun.mail.imap.IMAPFolder folder,
            Message[] messages) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x5_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x40x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x4_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x40x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x00x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x00x10x00x00x0");
		List<org.apache.hupa.shared.domain.Message> mList = new ArrayList<org.apache.hupa.shared.domain.Message>();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x10x10x0");
		// Setup fetchprofile to limit the stuff which is fetched
        FetchProfile fp = getFetchProfile();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x20x0");
		folder.fetch(messages, fp);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x1");
		// loop over the fetched messages
        for (int i = 0; i < messages.length && i < offset; i++) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x00x0");
			org.apache.hupa.shared.domain.Message msg = new org.apache.hupa.shared.data.MessageImpl();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1");
			Message message = messages[i];

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x20x1");
			String from = null;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x00x00x0");
			if (message.getFrom() != null && message.getFrom().length > 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x30x10x00x00x00x0");
				from = MessageUtils.decodeText(message.getFrom()[0].toString());
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x40x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x4");
			msg.setFrom(from);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x50x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x5_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x50x0");
			String replyto = null;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x6_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x00x0");
			if (message.getReplyTo() != null && message.getReplyTo().length > 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x10x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x60x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0");
				replyto = MessageUtils.decodeText(message.getReplyTo()[0].toString());
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x7_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x70x0");
			msg.setReplyto(replyto);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x80x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x80x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x80x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x80x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x80x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x80x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x80x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x8_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x80x00x0");
			ArrayList<String> to = new ArrayList<String>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x90x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x90x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x90x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x90x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x9");
			// Add to addresses
            Address[] toArray = message.getRecipients(RecipientType.TO);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x0");
			if (toArray != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x0");
				for (Address addr : toArray) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x10x00x0");
					String mailTo = MessageUtils.decodeText(addr.toString());
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xa0x10x00x10x10x0");
					to.add(mailTo);
                }
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xb_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xb0x0");
			msg.setTo(to);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xc0x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xc0x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xc_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xc0x0");
			// Check if a subject exist and if so decode it
            String subject = message.getSubject();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xd0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xd");
			if (subject != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xd0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xd0x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xd0x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xd0x10x00x0");
				subject = MessageUtils.decodeText(subject);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xe_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xe0x0");
			msg.setSubject(subject);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xf_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xf0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xf0x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xf0x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30xf0x1");
			// Add cc addresses
            Address[] ccArray = message.getRecipients(RecipientType.CC);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x100x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x100x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x100x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x100x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x100x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x100x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x100x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x100x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x10");
			ArrayList<String> cc = new ArrayList<String>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x11_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x0");
			if (ccArray != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x0");
				for (Address addr : ccArray) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x10x0");
					String mailCc = MessageUtils.decodeText(addr.toString());
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x10x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x110x10x00x10x1");
					cc.add(mailCc);
                }
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x120x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x12");
			msg.setCc(cc);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x13_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x130x0");
			userPreferences.addContact(from);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x140x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x14");
			userPreferences.addContact(to);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x150x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x15");
			userPreferences.addContact(replyto);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x16_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x160x0");
			userPreferences.addContact(cc);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x17_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x170x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x170x00x0");
			// Using sentDate since received date is not useful in the view when
            // using fetchmail
            msg.setReceivedDate(message.getSentDate());

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x180x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x180x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x180x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x180x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x180x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x18_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x180x00x1");
			// Add flags
            ArrayList<IMAPFlag> iFlags = JavamailUtil.convert(message.getFlags());

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x19_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x190x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x190x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x190x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x190x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x190x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x190x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x190x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x190x10x00x0");
			ArrayList<Tag> tags = new ArrayList<Tag>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x00x0");
			for (String flag : message.getFlags().getUserFlags()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x0");
				if (flag.startsWith(TagImpl.PREFIX)) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x00x10x00x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x00x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x00x10x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x00x10x00x00x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1a0x20x00x10x00x0");
					tags.add(new TagImpl(flag.substring(TagImpl.PREFIX.length())));
                }
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1b0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1b_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1b0x00x0");
			msg.setUid(folder.getUID(message));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1c_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1c0x0");
			msg.setFlags(iFlags);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1d0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1d");
			msg.setTags(tags);
            try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x00x00x0");
				msg.setHasAttachments(hasAttachment(message));
            } catch (MessagingException e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x10x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x10x00x00x0");
				logger.debug("Unable to identify attachments in message UID:" + msg.getUid() + " subject:"
                        + msg.getSubject() + " cause:" + e.getMessage());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x10x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1e0x10x10x1");
				logger.info("");
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1f_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x30x30x1f0x0");
			mList.add(0, msg);

        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164298dffaf40x50x4");
		return mList;
    }

    protected FetchProfile getFetchProfile() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa76919_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x00x10x00x0");
		FetchProfile fp = new FetchProfile();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x10x0");
		fp.add(FetchProfile.Item.ENVELOPE);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x2");
		fp.add(FetchProfile.Item.FLAGS);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x30x0");
		fp.add(FetchProfile.Item.CONTENT_INFO);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x4_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x40x0");
		fp.add(UIDFolder.FetchProfileItem.UID);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642dfa769190x20x5");
		return fp;
    }

    private boolean hasAttachment(Message message) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x00x0");
		if (message.getContentType().startsWith("multipart/")) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x1");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x00x0");
				Object content;

                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x10x00x0");
				content = message.getContent();

                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x00x0");
				if (content instanceof Multipart) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x0");
					Multipart mp = (Multipart) content;
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x0");
					if (mp.getCount() > 1) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x1");
						for (int i = 0; i < mp.getCount(); i++) {
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x3");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x00x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x00x1");
							String disp = mp.getBodyPart(i).getDisposition();
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x1");
							if (disp != null && disp.equalsIgnoreCase(Part.ATTACHMENT)) {
                                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x10x1");
								InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x00x20x10x10x10x00x30x10x10x0");
								return true;
                            }
                        }
                    }

                }
            } catch (IOException e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x10x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x10x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x10x10x00x00x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x10x10x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x10x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x00x10x00x10x10x00x00x0");
				logger.error("Error while get content of message " + message.getMessageNumber());
            }

        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642259b6a3b0x30x1");
		return false;
    }

    protected final class MessageConvertArray {
        private final Message[] messages;
        private final int realCount;

        public MessageConvertArray(int realCount, Message[] messages) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16420x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16420x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b16420x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642cf05f6da_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642cf05f6da0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642cf05f6da0x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b1642cf05f6da0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc04_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x20x00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b9d5bdbbc0x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b9d5bdbbc0x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b9d5bdbbc0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b9d5bdbbc0x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b9d5bdbbc");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b17f3467d0x20x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b17f3467d0x3_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b17f3467d_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b17f3467d0x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b17f3467d0x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b17f3467d0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x30x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x30x00x0");
			this.messages = messages;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x30x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b83b3fc040x30x10x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0");
			this.realCount = realCount;
        }

        public int getRealCount() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19ba948ca11_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19ba948ca110x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19ba948ca110x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19ba948ca110x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19ba948ca110x20x0");
			return realCount;
        }

        public Message[] getMesssages() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b5f64c5e00x0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b5f64c5e00x2_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b5f64c5e00x1_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b5f64c5e0_____org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b5f64c5e00x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_FetchMessagesServiceImpl_java0x0317b164229a0a19b5f64c5e00x20x0");
			return messages;
        }
    }
}
