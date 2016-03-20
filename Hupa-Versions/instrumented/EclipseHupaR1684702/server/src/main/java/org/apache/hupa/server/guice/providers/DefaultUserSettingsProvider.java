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

package org.apache.hupa.server.guice.providers;


import tc3.desktop.InstrumentationLoggerProvider;
import org.apache.hupa.shared.data.SettingsImpl;
import org.apache.hupa.shared.domain.Settings;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;

public class DefaultUserSettingsProvider implements Provider<Settings> {

    public DefaultUserSettingsProvider(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091650x10x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091650x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091650x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091650x10x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916528efc0f7_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916528efc0f70x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916528efc0f70x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916528efc0f70x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091658552dd5c0x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091658552dd5c0x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091658552dd5c0x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091658552dd5c");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165fac15e290x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165fac15e290x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165fac15e290x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165fac15e29");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165cb99f82c_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165cb99f82c0x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165cb99f82c0x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165cb99f82c0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165c9d67d99_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165c9d67d990x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165c9d67d990x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165c9d67d990x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165b1a4e3c80x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165b1a4e3c80x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165b1a4e3c80x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165b1a4e3c8");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916524693e190x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916524693e190x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916524693e190x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916524693e19");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091653631c8f70x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091653631c8f7_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091653631c8f70x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091653631c8f70x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165c0b2ef8e0x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165c0b2ef8e_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165c0b2ef8e0x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165c0b2ef8e0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165db6a61b70x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165db6a61b70x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165db6a61b7_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165db6a61b70x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916572e294080x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916572e29408_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916572e294080x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x04990916572e294080x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091653e6a39ef0x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091653e6a39ef_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091653e6a39ef0x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x0499091653e6a39ef0x1");
	}
	

	@Inject @Named("DefaultInboxFolder") private String inboxFolder;
    @Inject @Named("DefaultSentFolder") private String sentFolder;
    @Inject @Named("DefaultTrashFolder") private String trashFolder;
    @Inject @Named("DefaultDraftsFolder") private String draftFolder;
    @Inject @Named("PostFetchMessageCount") private int postCount;
    @Inject @Named("IMAPServerAddress") private String imapAddress;
    @Inject @Named("IMAPServerPort") private int imapPort;
    @Inject @Named("IMAPS") private boolean imapSSL;
    @Inject @Named("SMTPServerAddress") private String smtpAddress;
    @Inject @Named("SMTPServerPort") private int smtpPort;
    @Inject @Named("SMTPS") private boolean smtpSSL;
    @Inject @Named("SMTPAuth") private boolean smtpAuth;

    /*
     * (non-Javadoc)
     * @see com.google.inject.Provider#get()
     */
    public Settings get() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e5_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x2_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x00x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x00x10x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x00x10x00x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x00x1");
		Settings settings = new SettingsImpl();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x1_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x10x0");
		settings.setInboxFolderName(inboxFolder);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x20x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x2");
		settings.setSentFolderName(sentFolder);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x30x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x3");
		settings.setTrashFolderName(trashFolder);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x40x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x4");
		settings.setDraftsFolderName(draftFolder);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x5_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x50x0");
		settings.setPostFetchMessageCount(postCount);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x6_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x60x0");
		settings.setSmtpServer(smtpAddress);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x7_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x70x0");
		settings.setSmtpPort(smtpPort);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x80x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x8");
		settings.setSmtpSecure(smtpSSL);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x9_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20x90x0");
		settings.setImapServer(imapAddress);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20xa_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20xa0x0");
		settings.setImapPort(imapPort);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20xb0x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20xb");
		settings.setImapSecure(imapSSL);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20xc0x0_____org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20xc");
		settings.setSmtpAuth(smtpAuth);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_DefaultUserSettingsProvider_java0x049909165783923e50x20xd");
		return settings;
    }

}
