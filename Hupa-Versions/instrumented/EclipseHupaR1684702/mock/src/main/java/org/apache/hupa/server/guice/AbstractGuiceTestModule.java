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

package org.apache.hupa.server.guice;


import tc3.desktop.InstrumentationLoggerProvider;
import java.util.Properties;

import org.apache.hupa.shared.data.UserImpl;
import org.apache.hupa.shared.domain.Settings;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Abstract Guice module.
 * Extend this class with your own, and set bindings to your need. E.g.
 *
 * <pre>
 *   @Override
 *   protected void configureHandlers() {
 *       Names.bindProperties(binder(), properties);
 *
 *       bind(Session.class).toProvider(sessionClass);
 *       bind(HttpSession.class).toProvider(MockHttpSessionProvider.class);
 *       bind(Settings.class).toProvider(settingsProviderClass).in(Singleton.class);
 *       bind(Log.class).toProvider(logClass).in(Singleton.class);
 *
 *       bind(IMAPStore.class).to(imapStoreClass);
 *       bind(IMAPStoreCache.class).to(imapStoreCacheClass).in(Singleton.class);
 *
 *       bind(LoginUserHandler.class);
 *       bind(LogoutUserHandler.class);
 *       bind(IdleHandler.class);
 *
 *       bind(FetchFoldersHandler.class);
 *       bind(CreateFolderHandler.class);
 *       bind(DeleteFolderHandler.class);
 *       bind(FetchMessagesHandler.class);
 *       bind(DeleteMessageByUidHandler.class);
 *       bind(GetMessageDetailsHandler.class);
 *       bind(AbstractSendMessageHandler.class).to(SendMessageHandler.class);
 *       bind(SendMessageHandler.class);
 *       bind(ReplyMessageHandler.class);
 *       bind(ForwardMessageHandler.class);
 *
 *       bindHandler(Contacts.class, ContactsHandler.class);
 *       bindHandler(SendMessage.class, SendMessageHandler.class);
 *
 *       bind(UserPreferencesStorage.class).to(userPreferencesClass);
 *
 *       bind(User.class).to(TestUser.class).in(Singleton.class);
 *
 *   }
 * </pre>
 *
 * @author manolo
 *
 */
public abstract class AbstractGuiceTestModule extends AbstractModule{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x1300efe640x1_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x1300efe640x2_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x1300efe640x3_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x1300efe64_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x1300efe640x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x1300efe640x4");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f9");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x1300efe640x4_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x1300efe640x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x1300efe640x1_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x1300efe640x2_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x1300efe640x3_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x1300efe64");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b695");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1300efe640x4_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1300efe640x1_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1300efe640x3_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1300efe640x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1300efe64_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1300efe640x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d499242");
	}
	

	@SuppressWarnings("serial")
	protected static class TestUser extends UserImpl {

        @Inject
        public TestUser(@Named("Username") String username,
                        @Named("Password") String password,
                        Settings settings) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x30x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x3_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x4");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x40x00x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x40x0");
			setName(username);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x40x10x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x40x1");
			setPassword(password);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x40x20x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af65085b72a9f7b09e0x40x2");
			setSettings(settings);
        }
    }


    /**
     * Configuration of a Apache-James server.
     * Customize it for your integration tests.
     */
    public static final Properties jamesProperties = new Properties() {
        private static final long serialVersionUID = 1L;
        {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f8_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x00x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x0");
			// SET THIS
            put("Username","manolo");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x10x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x1");
			put("Password","***");
            ///

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x2_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x20x0");
			put("IMAPServerAddress", "localhost");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x3_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x30x0");
			put("IMAPServerPort", "143");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x4_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x40x0");
			put("IMAPS", "false");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x50x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x5");
			put("DefaultInboxFolder", "INBOX");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x6_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x60x0");
			put("DefaultTrashFolder", "Trash");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x7_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x70x0");
			put("DefaultSentFolder", "Sent");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x8_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x80x0");
			put("DefaultDraftsFolder", "Drafts");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x9_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00x90x0");
			put("SMTPServerAddress", "localhost");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xa_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xa0x0");
			put("SMTPServerPort", "25");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xb_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xb0x0");
			put("SMTPS", "false");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xc0x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xc");
			put("SMTPAuth", "true");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xd_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xd0x0");
			put("SessionDebug", "true");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xe0x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af64b8b6950x40x00x1643368f80x00xe");
			put("TrustSSL", "false");
        }
    };

    /**
     * Configuration of an IMAP server.
     * Customize it for your integration tests.
     */
    public static final Properties courierProperties = new Properties() {
        private static final long serialVersionUID = 1L;
        {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x00x0");
			// SET THIS
            put("Username","user");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x10x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x1");
			put("Password","password");
            ///

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x20x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x2");
			put("IMAPServerAddress", "localhost");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x30x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x3");
			put("IMAPServerPort", "143");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x4_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x40x0");
			put("IMAPS", "false");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x50x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x5");
			put("DefaultInboxFolder", "INBOX");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x60x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x6");
			put("DefaultTrashFolder", "INBOX.Trash");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x7_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x70x0");
			put("DefaultSentFolder", "INBOX.Sent");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x80x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x8");
			put("DefaultDraftsFolder", "INBOX.Drafts");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x9_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00x90x0");
			put("SMTPServerAddress", "mail.hotelsearch.com");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xa_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xa0x0");
			put("SMTPServerPort", "25");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xb0x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xb");
			put("SMTPS", "false");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xc_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xc0x0");
			put("SMTPAuth", "true");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xd0x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xd");
			put("SessionDebug", "true");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xe0x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002af5d4992420x40x00x13d45a5f10x00xe");
			put("TrustSSL", "false");
        }
    };

    /**
     * Configuration of GMail IMAP server.
     */
    public static final Properties gmailProperties = new Properties() {
        private static final long serialVersionUID = 1L;
        {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x00x0");
			// Use a valid gmail account
            put("Username","doodootis@gmail.com");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x1_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x10x0");
			put("Password","******");
            /////

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x20x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x2");
			put("IMAPServerAddress", "imap.gmail.com");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x3_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x30x0");
			put("IMAPServerPort", "993");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x40x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x4");
			put("IMAPS", "true");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x5_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x50x0");
			put("IMAPConnectionPoolSize", "4");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x60x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x6");
			put("IMAPConnectionPoolTimeout", "300000");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x70x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x7");
			put("DefaultInboxFolder", "INBOX");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x80x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x8");
			put("DefaultTrashFolder", "[Gmail]/Trash");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x9_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x90x0");
			put("DefaultSentFolder", "[Gmail]/Sent Mail");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xa_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xa0x0");
			put("DefaultDraftsFolder", "[Gmail]/Drafts");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xb_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xb0x0");
			put("SMTPServerAddress", "smtp.gmail.com");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xc0x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xc");
			put("SMTPServerPort", "465");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xd_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xd0x0");
			put("SMTPS", "true");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xe0x0_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xe");
			put("SMTPAuth", "true");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xf_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00xf0x0");
			put("SessionDebug", "true");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x10_____org_apache_hupa_server_guice_AbstractGuiceTestModule_java0x0692002afc35a68f90x40x00x123c4243e0x00x100x0");
			put("TrustSSL", "false");
        }
    };

}
