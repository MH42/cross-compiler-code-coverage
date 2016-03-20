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

package org.apache.hupa.server.mock;


import tc3.desktop.InstrumentationLoggerProvider;
import java.util.Properties;

import org.apache.hupa.shared.data.SettingsImpl;
import org.apache.hupa.shared.data.UserImpl;
import org.apache.hupa.shared.domain.Settings;
import org.apache.hupa.shared.domain.User;

/**
 * Constants and properties used for mock mode
 */
public class MockConstants {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221319c91e1d0x2_____org_apache_hupa_server_mock_MockConstants_java0x0b509221319c91e1d0x0_____org_apache_hupa_server_mock_MockConstants_java0x0b509221319c91e1d0x3_____org_apache_hupa_server_mock_MockConstants_java0x0b509221319c91e1d0x1_____org_apache_hupa_server_mock_MockConstants_java0x0b509221319c91e1d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e82");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1300efe640x3_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1300efe640x4_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1300efe640x1_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1300efe640x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1300efe640x2_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1300efe64");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x1_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x3_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x2_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x4");
	}
	
	public MockConstants(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b5092213");
	}
	
	public static String SESSION_ID = "MockID";

    @SuppressWarnings("serial")
	public final static Settings mockSettings = new SettingsImpl() {
        {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x174279611_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x00x0_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x0");
			setInboxFolderName(MockIMAPStore.MOCK_INBOX_FOLDER);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x1_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x10x0");
			setSentFolderName(MockIMAPStore.MOCK_SENT_FOLDER);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x2_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x20x0");
			setTrashFolderName(MockIMAPStore.MOCK_TRASH_FOLDER);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x30x0_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x3");
			setDraftsFolderName(MockIMAPStore.MOCK_DRAFTS_FOLDER);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x40x0_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x4");
			setImapServer("localhost");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x5_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x50x0");
			setImapPort(143);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x6_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x60x0");
			setImapSecure(false);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x70x0_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x7");
			setSmtpServer("localhost");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x80x0_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x8");
			setSmtpPort(25);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x9_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00x90x0");
			setSmtpSecure(false);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00xa_____org_apache_hupa_server_mock_MockConstants_java0x0b509221397358e820x40x00x1742796110x00xa0x0");
			setSmtpAuth(false);
        }
    };

    public final static Properties mockProperties = new Properties() {
        private static final long serialVersionUID = 1L;
        {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed435_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x00x0");
			put("Username", MockIMAPStore.MOCK_LOGIN);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x1_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x10x0");
			put("Password", MockIMAPStore.MOCK_LOGIN);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x2_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x20x0");
			put("IMAPServerAddress", MockIMAPStore.MOCK_HOST);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x30x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x3");
			put("SMTPServerAddress", MockIMAPStore.MOCK_HOST);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x40x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x4");
			put("SessionDebug", "false");

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x50x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x5");
			put("DefaultInboxFolder", MockIMAPStore.MOCK_INBOX_FOLDER);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x60x0_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x6");
			put("DefaultTrashFolder", MockIMAPStore.MOCK_TRASH_FOLDER);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x7_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x70x0");
			put("DefaultSentFolder", MockIMAPStore.MOCK_SENT_FOLDER);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x8_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x80x0");
			put("DefaultDraftsFolder", MockIMAPStore.MOCK_DRAFTS_FOLDER);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x9_____org_apache_hupa_server_mock_MockConstants_java0x0b50922139c20afdf0x40x00x1a4bed4350x00x90x0");
			put("PostFetchMessageCount", "0");
        }
    };

    @SuppressWarnings("serial")
	public final static User mockUser = new UserImpl() {
        {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa0x40x00x1706ab79b_____org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa0x40x00x1706ab79b0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa0x40x00x1706ab79b0x00x00x0_____org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa0x40x00x1706ab79b0x00x0");
			setName(MockIMAPStore.MOCK_LOGIN);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa0x40x00x1706ab79b0x00x10x0_____org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa0x40x00x1706ab79b0x00x1");
			setPassword(MockIMAPStore.MOCK_LOGIN);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa0x40x00x1706ab79b0x00x20x0_____org_apache_hupa_server_mock_MockConstants_java0x0b5092213f3a359fa0x40x00x1706ab79b0x00x2");
			setSettings(mockSettings);
        }
    };
}
