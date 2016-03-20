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
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.activation.DataSource;
import javax.mail.AuthenticationFailedException;
import javax.mail.BodyPart;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.hupa.server.FileItemRegistry;
import org.apache.hupa.server.IMAPStoreCache;
import org.apache.hupa.server.preferences.UserPreferencesStorage;
import org.apache.hupa.server.utils.MessageUtils;
import org.apache.hupa.server.utils.RegexPatterns;
import org.apache.hupa.server.utils.SessionUtils;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.data.GenericResultImpl;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.MessageAttachment;
import org.apache.hupa.shared.domain.SendMessageAction;
import org.apache.hupa.shared.domain.SmtpMessage;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class SendMessageBaseServiceImpl extends AbstractService implements SendMessageService {

    UserPreferencesStorage userPreferences;

    @Inject
    public SendMessageBaseServiceImpl(UserPreferencesStorage preferences, IMAPStoreCache cache) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d97670x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d97670x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d9767_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d97670x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d97670x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca429242");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929cf05f6da_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929cf05f6da0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929cf05f6da0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109290x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109290x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109290x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x30x0");
		this.cache = cache;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929ca4292420x30x1");
		this.userPreferences = preferences;
    }

    @Override
	public GenericResult send(SendMessageAction action)
            throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d7");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x0");
		GenericResult result = new GenericResultImpl();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x00x1");
			User user = getUser();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x10x10x00x0");
			Message message = createMessage(cache.getMailSession(user), action);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x20x0");
			message = fillBody(message,action);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x30x00x0");
			sendMessage(getUser(), message);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x40x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x40x00x00x00x0");
			if (!user.getSettings().getSmtpServer().contains("gmail.com")) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x40x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x40x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x40x10x00x0");
				saveSentMessage(getUser(), message);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x5_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x00x50x0");
			resetAttachments(action);

            // TODO: notify the user more accurately where the error is
            // if the message was sent and the storage in the sent folder failed, etc.
        } catch (AddressException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x10x0");
			result.setError("Error while parsing recipient: " + e.getMessage());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x10x10x10x0");
			logger.error("Error while parsing recipient", e);
        } catch (AuthenticationFailedException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x20x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x20x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x20x10x00x0");
			result.setError("Error while sending message: SMTP Authentication error.");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x20x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x20x10x1");
			logger.error("SMTP Authentication error", e);
        } catch (MessagingException e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x10x00x00x0");
			result.setError("Error while sending message: " + e.getMessage());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x30x10x10x0");
			logger.error("Error while sending message", e);
        } catch (Exception e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x10x00x00x00x0");
			result.setError("Unexpected exception while sendig message: " + e.getMessage());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x10x40x10x10x0");
			logger.error("Unexpected exception while sendig message: ", e);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929384d26d70x30x2");
		return result;
    }

    /**
     * Create basic Message which contains all headers. No body is filled
     *
     * @param session the Session
     * @param action the action
     * @return message
     * @throws AddressException
     * @throws MessagingException
     */
    public Message createMessage(Session session, SendMessageAction action) throws AddressException, MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e38445");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x00x10x00x0");
		MimeMessage message = new MimeMessage(session);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x10x1");
		SmtpMessage m = action.getMessage();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x20x00x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x20x00x00x0");
		message.setFrom(new InternetAddress(m.getFrom()));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x30x0");
		userPreferences.addContact(m.getTo());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x40x0");
		userPreferences.addContact(m.getCc());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x5_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x50x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x50x0");
		userPreferences.addContact(m.getBcc());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x60x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x60x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x6_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x60x00x00x0");
		message.setRecipients(RecipientType.TO, MessageUtils.getRecipients(m.getTo()));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x70x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x7_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x70x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x70x00x00x0");
		message.setRecipients(RecipientType.CC, MessageUtils.getRecipients(m.getCc()));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x80x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x80x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x80x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x8");
		message.setRecipients(RecipientType.BCC, MessageUtils.getRecipients(m.getBcc()));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x9_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x90x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x90x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40x90x00x00x0");
		message.setSentDate(new Date());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xa0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xa");
		message.addHeader("User-Agent:", "HUPA, The Apache JAMES webmail client.");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xb0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xb_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xb0x00x0");
		message.addHeader("X-Originating-IP", getClientIpAddr());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xc_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xc0x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xc0x0");
		message.setSubject(m.getSubject(), "utf-8");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xd_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xd0x0");
		updateHeaders(message, action);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xe0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xe");
		message.saveChanges();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929b5e384450x40xf");
		return message;
    }

    public static String getClientIpAddr() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c19");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x00x1");
		HttpServletRequest request = RequestFactoryServlet.getThreadLocalRequest();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x1");
		String ip = "unknown";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x2");
		if (request != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x00x00x0");
			ip = request.getHeader("X-Forwarded-For");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x00x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x00x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x00x1");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x10x10x00x0");
				ip = request.getHeader("Proxy-Client-IP");
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x00x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x00x00x1");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x20x10x0");
				ip = request.getHeader("WL-Proxy-Client-IP");
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x00x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x00x00x10x0");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x30x10x00x0");
				ip = request.getHeader("HTTP_CLIENT_IP");
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x00x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x00x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x00x1");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x40x10x00x00x0");
				ip = request.getHeader("HTTP_X_FORWARDED_FOR");
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x5_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x00x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x00x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x00x1");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x20x10x50x10x00x0");
				ip = request.getRemoteAddr();
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092913f38c190x30x3");
		return ip;
    }

    protected void updateHeaders(MimeMessage message, SendMessageAction action) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x0");
		if (action.getInReplyTo() != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x1");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x00x0");
				message.addHeader(SConsts.HEADER_IN_REPLY_TO, action.getInReplyTo());
            } catch (MessagingException e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x10x00x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x10x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x10x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x00x10x00x10x10x00x00x0");
				logger.error("Error while setting header:" + e.getMessage(), e);
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x1");
		if (action.getReferences() != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x0");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x00x00x00x0");
				message.addHeader(SConsts.HEADER_REFERENCES, action.getReferences());
            } catch (MessagingException e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x10x00x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x10x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x10x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929c160f63e0x40x10x10x00x10x10x00x0");
				logger.error("Error while setting header:" + e.getMessage(), e);
            }
        }
    }

    /**
     * Fill the body of the given message with data which the given action contain
     *
     * @param message the message
     * @param action the action
     * @return filledMessage
     * @throws MessagingException
     * @throws IOException
     * @throws HupaException
     */
    public Message fillBody(Message message, SendMessageAction action) throws MessagingException, IOException, HupaException {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x00x10x00x00x0");
		String html = restoreInlineLinks(action.getMessage().getText());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x10x0");
		// TODO: client sends the message as a html document right now,
        // the idea is that it should be sent in both formats because
        // it is easier to handle html in the browser.
        String text = htmlToText(html);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x2");
		@SuppressWarnings("rawtypes")
        List items = getAttachments(action);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929e08cc45e0x40x3");
		return composeMessage(message, text, html, items);
    }

    protected String restoreInlineLinks(String s) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929dd421ed00x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929dd421ed00x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929dd421ed00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929dd421ed00x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929dd421ed00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929dd421ed0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929dd421ed00x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929dd421ed00x30x00x0");
		return RegexPatterns.replaceAll(s, RegexPatterns.regex_revertInlineImg, RegexPatterns.repl_revertInlineImg);
    }

    // TODO: just temporary stuff because it has to be done in the client side
    protected String htmlToText(String s){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x00x00x0");
		s=s.replaceAll("\n", " ");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x10x00x0");
		s=s.replaceAll("(?si)<br\\s*?/?>", "\n");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x2");
		s=s.replaceAll("(?si)</div\\s*?>", "\n");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x30x00x0");
		s=s.replaceAll("(\\w)<.*?>(\\w)", "$1 $2");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x4");
		s=s.replaceAll("<.*?>", "");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x5_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x50x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x50x0");
		s=s.replaceAll("[ \t]+", " ");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294a79961e0x30x6");
		return s;
    }

    /**
     * Get the attachments stored in the registry.
     *
     * @param action
     * @return A list of stored attachments
     * @throws HupaException
     */
    @SuppressWarnings("rawtypes")
    protected List getAttachments(SendMessageAction action) throws MessagingException, HupaException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce7700");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x00x10x0");
		FileItemRegistry registry = SessionUtils.getSessionRegistry(logger, httpSessionProvider.get());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x10x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x10x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x10x00x0");
		List<MessageAttachment> attachments = action.getMessage().getMessageAttachments();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x20x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x20x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x20x10x00x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x20x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x20x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x20x00x1");
		ArrayList<FileItem> items = new ArrayList<FileItem>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x0");
		if (attachments != null && attachments.size() > 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x00x0");
			for (MessageAttachment attachment: attachments) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x0");
				FileItem fItem = registry.get(attachment.getName());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x1");
				if (fItem != null) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x00x10x10x10x00x0");
					items.add(fItem);
				}
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x30x10x10x0");
			logger.debug("Found " + items.size() + " attachmets in the registry.");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e61092992ce77000x30x4");
		return items;
    }

    /**
     * Remove attachments from the registry
     *
     * @param action
     * @throws MessagingException
     * @throws ActionException
     */
    protected void resetAttachments(SendMessageAction action) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x00x10x0");
		SmtpMessage msg = action.getMessage();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x10x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x10x10x0");
		List<MessageAttachment> attachments = msg.getMessageAttachments();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x0");
		if (attachments != null && ! attachments.isEmpty()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x0");
			for(MessageAttachment attach : attachments) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x00x10x00x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x00x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295e71bcd50x30x20x10x00x10x00x00x0");
				SessionUtils.getSessionRegistry(logger, httpSessionProvider.get()).remove(attach.getName());
			}
        }
    }

    /**
     * Send the message using SMTP, if the configuration uses authenticated SMTP, it uses
     * the user stored in session to get the given login and password.
     *
     * @param user
     * @param session
     * @param message
     * @throws MessagingException
     */
    protected void sendMessage(User user, Message message) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x40x00x0");
		cache.sendMessage(message);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x40x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x40x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109294e0762a10x40x10x00x00x0");
		logger.info("Send message from " + message.getFrom()[0].toString());
    }

    /**
     * Save the message in the sent folder
     *
     * @param user
     * @param message
     * @throws MessagingException
     * @throws IOException
     */
    protected void saveSentMessage(User user, Message message) throws MessagingException, IOException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x00x10x0");
		IMAPStore iStore = cache.get(user);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x10x10x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x10x10x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x10x10x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x10x10x00x0");
		IMAPFolder folder = (IMAPFolder) iStore.getFolder(user.getSettings().getSentFolderName());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x0");
		if (folder.exists() || folder.create(IMAPFolder.READ_WRITE)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x00x00x0");
			if (folder.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x00x10x0");
				folder.open(Folder.READ_WRITE);
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x10x00x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x10x00x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x10x0");
			// It is necessary to copy the message, before putting it
            // in the sent folder. If not, it is not guaranteed that it is
            // stored in ascii and is not possible to get the attachments
            // size. message.saveChanges() doesn't fix the problem.
            // There are tests which demonstrate this.
            message = new MimeMessage((MimeMessage)message);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x2");
			message.setFlag(Flag.SEEN, true);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x30x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x30x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x3");
			folder.appendMessages(new Message[] {message});

            try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x40x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x40x00x0");
				folder.close(false);
            } catch (MessagingException e) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x40x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x40x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929f8df2f4c0x40x20x10x40x10x1");
                // we don't care on close
            }
        }
    }

    /**
     * Fill the body of a message already created.
     * The result message depends on the information given.
     *
     * @param message
     * @param text
     * @param html
     * @param parts
     * @return The composed message
     * @throws MessagingException
     * @throws IOException
     */
    @SuppressWarnings("rawtypes")
    public static Message composeMessage (Message message, String text, String html, List parts) throws MessagingException, IOException {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x60x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x7_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x6_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x50x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x5_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x00x1");
		MimeBodyPart txtPart = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x10x0");
		MimeBodyPart htmlPart = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x20x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x2");
		MimeMultipart mimeMultipart = null;

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x30x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x30x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x30x00x1");
		if (text == null && html == null) {
           InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x30x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x30x10x00x0");
		text = "";
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x40x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x4");
		if (text != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x40x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x40x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x40x10x00x00x0");
			txtPart = new MimeBodyPart();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x40x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x40x10x10x0");
			txtPart.setContent(text, "text/plain; charset=UTF-8");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x5_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x50x0");
		if (html != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x50x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x50x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x50x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x50x10x00x0");
			htmlPart = new MimeBodyPart();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x50x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x50x10x1");
			htmlPart.setContent(html, "text/html; charset=UTF-8");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x6_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x00x1");
		if (html != null && text != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x00x0");
			mimeMultipart = new MimeMultipart();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x10x0");
			mimeMultipart.setSubType("alternative");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x20x0");
			mimeMultipart.addBodyPart(txtPart);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x60x10x30x0");
			mimeMultipart.addBodyPart(htmlPart);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x7");
		if (parts == null || parts.isEmpty()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x0");
			if (mimeMultipart != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x10x0");
				message.setContent(mimeMultipart);
            } else if (html != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x10x00x0");
				message.setText(html);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x10x1");
				message.setHeader("Content-type", "text/html");
            } else if (text != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x20x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x10x00x20x20x10x0");
				message.setText(text);
            }
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x0");
			MimeBodyPart bodyPart = new MimeBodyPart();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x0");
			if (mimeMultipart != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x10x00x0");
				bodyPart.setContent(mimeMultipart);
            } else if (html != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x10x00x0");
				bodyPart.setText(html);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x10x1");
				bodyPart.setHeader("Content-type", "text/html");
            } else if (text != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x20x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x10x20x20x10x00x0");
				bodyPart.setText(text);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x20x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x20x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x20x10x0");
			Multipart multipart = new MimeMultipart();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x30x0");
			multipart.addBodyPart(bodyPart);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x4_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x0");
			for (Object attachment: parts) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x00x0");
				if (attachment instanceof FileItem) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x10x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x10x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x10x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x10x00x00x00x00x0");
					multipart.addBodyPart(MessageUtils.fileitemToBodypart((FileItem)attachment));
                } else {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x20x00x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x20x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x40x10x00x20x00x0");
					multipart.addBodyPart((BodyPart)attachment);
                }
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x50x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x70x20x5");
			message.setContent(multipart);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x80x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x8");
		message.saveChanges();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109295b11bcb20x70x9");
		return message;

    }

    /**
     * DataStore which wrap a FileItem
     *
     */
    public static class FileItemDataStore implements DataSource {

        private final FileItem item;

        public FileItemDataStore(FileItem item) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d97670x3_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d97670x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d9767_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d97670x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243a7d97670x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24cf7ff7bd0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24cf7ff7bd0x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24cf7ff7bd0x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24cf7ff7bd_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24cf7ff7bd0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929cf05f6da_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929cf05f6da0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929cf05f6da0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e610929_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109290x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109290x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109290x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24cf7ff7bd0x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24cf7ff7bd0x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x0");
			this.item = item;
        }

        /*
         * (non-Javadoc)
         * @see javax.activation.DataSource#getContentType()
         */
        @Override
		public String getContentType() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d2467af0bd7");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d2467af0bd70x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d2467af0bd70x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d2467af0bd70x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d2467af0bd70x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d2467af0bd70x20x00x0");
			return item.getContentType();
        }

        /*
         * (non-Javadoc)
         * @see javax.activation.DataSource#getInputStream()
         */
        @Override
		public InputStream getInputStream() throws IOException {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243b7e79480x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243b7e79480x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243b7e79480x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243b7e7948");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243b7e79480x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d243b7e79480x20x00x0");
			return item.getInputStream();
        }

        /*
         * (non-Javadoc)
         * @see javax.activation.DataSource#getName()
         */
        @Override
		public String getName() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x00x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x00x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x0");
			String fullName = item.getName();

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x10x10x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x10x1");
			// Strip path from file
            int index = fullName.lastIndexOf(File.separator);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x00x0");
			if (index == -1) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x10x0");
				return fullName;
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x20x00x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x20x00x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x20x0_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24fa98c1fd0x20x20x20x00x00x1");
				return fullName.substring(index +1 ,fullName.length());
            }
        }

        /*
         * (non-Javadoc)
         * @see javax.activation.DataSource#getOutputStream()
         */
        @Override
		public OutputStream getOutputStream() throws IOException {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24f757f02c0x2_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24f757f02c0x1_____org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24f757f02c0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24f757f02c");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_SendMessageBaseServiceImpl_java0x01e6109298aca4d24f757f02c0x20x0");
			return null;
        }

    }


}
