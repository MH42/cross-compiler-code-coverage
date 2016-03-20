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
import static org.apache.hupa.server.utils.RegexPatterns.regex_badAttrs;
import static org.apache.hupa.server.utils.RegexPatterns.regex_badTags;
import static org.apache.hupa.server.utils.RegexPatterns.regex_email;
import static org.apache.hupa.server.utils.RegexPatterns.regex_existingEmailLinks;
import static org.apache.hupa.server.utils.RegexPatterns.regex_existingHttpLinks;
import static org.apache.hupa.server.utils.RegexPatterns.regex_gt;
import static org.apache.hupa.server.utils.RegexPatterns.regex_htmllink;
import static org.apache.hupa.server.utils.RegexPatterns.regex_inlineImg;
import static org.apache.hupa.server.utils.RegexPatterns.regex_lt;
import static org.apache.hupa.server.utils.RegexPatterns.regex_nl;
import static org.apache.hupa.server.utils.RegexPatterns.regex_unneededTags;
import static org.apache.hupa.server.utils.RegexPatterns.repl_badAttrs;
import static org.apache.hupa.server.utils.RegexPatterns.repl_badTags;
import static org.apache.hupa.server.utils.RegexPatterns.repl_email;
import static org.apache.hupa.server.utils.RegexPatterns.repl_existingHttpLinks;
import static org.apache.hupa.server.utils.RegexPatterns.repl_existngEmailLinks;
import static org.apache.hupa.server.utils.RegexPatterns.repl_gt;
import static org.apache.hupa.server.utils.RegexPatterns.repl_htmllink;
import static org.apache.hupa.server.utils.RegexPatterns.repl_inlineImg;
import static org.apache.hupa.server.utils.RegexPatterns.repl_lt;
import static org.apache.hupa.server.utils.RegexPatterns.repl_nl;
import static org.apache.hupa.server.utils.RegexPatterns.repl_unneededTags;
import static org.apache.hupa.server.utils.RegexPatterns.replaceAll;
import static org.apache.hupa.server.utils.RegexPatterns.replaceAllRecursive;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Header;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.hupa.server.utils.MessageUtils;
import org.apache.hupa.shared.data.GetMessageDetailsResultImpl;
import org.apache.hupa.shared.data.MailHeaderImpl;
import org.apache.hupa.shared.data.MessageDetailsImpl;
import org.apache.hupa.shared.domain.GetMessageDetailsAction;
import org.apache.hupa.shared.domain.GetMessageDetailsResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.MessageAttachment;
import org.apache.hupa.shared.domain.MessageDetails;
import org.apache.hupa.shared.domain.User;

import com.sun.mail.imap.IMAPStore;

public class GetMessageDetailsServiceImpl extends AbstractService implements GetMessageDetailsService {

    public GetMessageDetailsServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac310x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac310x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac310x2");
	}
	

	@Override
	public GetMessageDetailsResult get(GetMessageDetailsAction action) throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e35");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x30x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x30x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x30x00x00x10x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x30x00x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x30x00x00x10x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac315e2e7e350x30x00x00x1");
		return new GetMessageDetailsResultImpl(exposeMessage(getUser(), action.getFolder(), action.getUid()));
    }

    protected MessageDetails exposeMessage(User user, ImapFolder folder, long uid) throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x3_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x5_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x40x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x4_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd45");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x0");
		IMAPStore store = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x10x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x1");
		com.sun.mail.imap.IMAPFolder f = null;
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x0");
			store = cache.get(user);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x10x00x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x10x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x10x00x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x10x0");
			f = (com.sun.mail.imap.IMAPFolder) store.getFolder(folder.getFullName());

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x20x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x20x0");
			if (f.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x20x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x20x10x0");
				f.open(com.sun.mail.imap.IMAPFolder.READ_WRITE);
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x30x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x30x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x30x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x30x10x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x3");
			MimeMessage message = (MimeMessage) f.getMessageByUID(uid);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x40x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x40x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x4_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x40x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x40x1");
			MessageDetails mDetails = mimeToDetails(message, f.getFullName(), uid, user);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x50x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x5");
			mDetails.setUid(uid);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x60x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x60x00x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x6_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x60x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x60x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x60x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x60x00x10x0");
			f.setFlags(new Message[] { message }, new Flags(Flag.SEEN), true);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x00x7");
			return mDetails;
        } catch (Exception e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x10x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x10x00x0");
			logger.error("Unable to expose msg for user " + user + " in folder " + folder + " with uid " + uid, e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x10x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x10x10x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x10x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x10x10x10x00x0");
			throw new Exception("Unable to expose msg for user " + user + " in folder " + folder + " with uid " + uid);

        } finally {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x0");
			if (f != null && f.isOpen()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x10x00x0");
				try {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x10x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x10x00x00x00x0");
					f.close(false);
                } catch (MessagingException e) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x10x00x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x10x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x10x00x10x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31ccaedd450x50x20x20x00x10x00x1");
                    // ignore on close
                }
            }
        }
    }

    protected MessageDetails mimeToDetails(MimeMessage message, String folderName, long uid, User user) throws IOException,
            MessagingException, UnsupportedEncodingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x5_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x40x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x4_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x50x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x3_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x6");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x00x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x00x1");
		MessageDetails mDetails = new MessageDetailsImpl();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x10x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x10x1");
		Object content = message.getContent();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x20x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x20x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x20x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x2");
		StringBuffer sbPlain = new StringBuffer();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x3_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x30x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x30x10x00x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x30x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x30x10x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x30x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x30x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x30x1");
		ArrayList<MessageAttachment> attachmentList = new ArrayList<MessageAttachment>();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x40x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x40x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x40x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x4");
		boolean isHTML = MessageUtils.handleParts(message, content, sbPlain, attachmentList);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x5");
		if (isHTML) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x00x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x00x00x00x00x0");
			mDetails.setText(filterHtmlDocument(sbPlain.toString(), folderName, uid));
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x10x00x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x10x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x50x10x00x0");
			mDetails.setText(txtDocumentToHtml(sbPlain.toString(), folderName, uid));
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x6_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x60x0");
		mDetails.setMessageAttachments(attachmentList);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x00x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x7");
		for (@SuppressWarnings("unchecked") Enumeration<Header> en = message.getAllHeaders(); en.hasMoreElements();) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x00x0");
			Header header = en.nextElement();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x00x00x0");
			if (header.getName().toLowerCase().matches("^(x-.*|date|from|to|subject)$")) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x10x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x10x00x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x10x00x00x10x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x10x00x00x10x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x70x20x10x10x00x00x10x0");
				mDetails.getMailHeaders().add(new MailHeaderImpl(header.getName(), header.getValue()));
            }
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac3192c5cc9e0x60x8");
		return mDetails;
    }

    protected String txtDocumentToHtml(String txt, String folderName, long uuid) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x5_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x3_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x4_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d0139_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x40x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x00x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x00x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x00x00x0");
		if (txt == null || txt.length() == 0) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x00x10x0");
			return txt;
		}

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x10x00x0");
		// escape html tags symbols
        txt = replaceAll(txt, regex_lt, repl_lt);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x20x00x0");
		txt = replaceAll(txt, regex_gt, repl_gt);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x3_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x30x00x0");
		// enclose between <a> http links and emails
        txt = replaceAll(txt, regex_htmllink, repl_htmllink);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x40x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x4_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x40x0");
		txt = replaceAll(txt, regex_email, repl_email);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x50x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x5_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x50x0");
		// put break lines
        txt = replaceAll(txt, regex_nl, repl_nl);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x6_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x60x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x60x0");
		txt = filterHtmlDocument(txt, folderName, uuid);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac31b64d01390x50x7");
		return txt;
    }

    protected String filterHtmlDocument(String html, String folderName, long uuid) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x3_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x4_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x5_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x00x00x1_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x00x00x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x00x00x0");
		if (html == null || html.length() == 0) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x00x10x0");
			return html;
		}

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x10x00x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x10x00x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x10x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x10x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x1");
		// Replace in-line images links to use Hupa's download servlet
        html = replaceAll(html, regex_inlineImg, repl_inlineImg).replaceAll("%%FOLDER%%", folderName).replaceAll(
                "%%UID%%", String.valueOf(uuid));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x20x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x2_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x20x00x0");
		// Remove head, script and style tags to avoid interferences with Hupa
        html = replaceAll(html, regex_badTags, repl_badTags);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x3_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x30x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x30x00x0");
		// Remove body and html tags
        html = replaceAll(html, regex_unneededTags, repl_unneededTags);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x40x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x4_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x40x00x0");
		// Remove all onClick attributes
        html = replaceAllRecursive(html, regex_badAttrs, repl_badAttrs);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x50x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x50x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x5");
		html = replaceAll(html, regex_existingHttpLinks, repl_existingHttpLinks);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x6_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x60x00x0_____org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x60x0");
		// FIXME: These have serious performance problems (see
        // testMessageDetails_Base64Image_Performance)
        // Add <a> tags to links which are not already into <a>
        // html = replaceAll(html, regex_orphandHttpLinks,
        // repl_orphandHttpLinks);
        // Add javascript method to <a> in order to open links in a different
        // window
        // Add <a> tags to emails which are not already into <a>
        // html = replaceAll(html, regex_orphandEmailLinks,
        // repl_orphandEmailLinks);
        // Add a js method to mailto links in order to compose new mails inside
        // hupa
        html = replaceAll(html, regex_existingEmailLinks, repl_existngEmailLinks);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageDetailsServiceImpl_java0x0b085ac316ddbb7be0x50x7");
		return html;
    }

}
