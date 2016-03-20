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

package org.apache.hupa.server;


import tc3.desktop.InstrumentationLoggerProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

import org.apache.commons.logging.Log;
import org.apache.hupa.shared.domain.Settings;
import org.apache.hupa.shared.domain.User;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;
import com.sun.mail.iap.ProtocolException;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPFolder.ProtocolCommand;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.imap.protocol.IMAPProtocol;
import com.sun.mail.imap.protocol.ListInfo;

@Singleton
public class InMemoryIMAPStoreCache implements IMAPStoreCache {

    private final Map<String, CachedIMAPStore> pool = new HashMap<String, CachedIMAPStore>();

    private Log logger;
    private int connectionPoolSize;
    private int timeout;
    private boolean debug;
    private boolean trustSSL;

    @Inject
    public InMemoryIMAPStoreCache(
            Log logger,
            @Named("IMAPConnectionPoolSize") int connectionPoolSize,
            @Named("IMAPConnectionPoolTimeout") int timeout,
            @Named("SessionDebug") boolean debug,
            @Named("TrustStore") String truststore,
            @Named("TrustStorePassword") String truststorePassword,
            @Named("TrustSSL") boolean trustSSL)
    {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f32faaeca0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f32faaeca0x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f32faaeca_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f32faaeca0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f624840d8_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f624840d80x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f624840d80x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f624840d80x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f16cc54ff_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f16cc54ff0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f16cc54ff0x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f16cc54ff0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f3356bcb20x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f3356bcb20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f3356bcb2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f3356bcb20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f56d3c9490x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f56d3c9490x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f56d3c9490x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f56d3c949");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x20x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x30x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x20x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x30x00x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x30x00x00x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x30x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f59984895_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f599848950x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x0");
		this.logger = logger;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x0");
		this.connectionPoolSize = connectionPoolSize;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x0");
		this.timeout = timeout;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x0");
		this.debug = debug;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x40x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x4_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x0");
		this.trustSSL = trustSSL;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x50x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x50x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x5");
		if (!truststore.isEmpty()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x50x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x50x10x00x0");
			System.setProperty("javax.net.ssl.trustStore", truststore);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x60x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x6_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x60x00x0");
		if (!truststorePassword.isEmpty()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x60x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x60x10x00x0");
			System.setProperty("javax.net.ssl.trustStorePassword", truststorePassword);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x70x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fb2dbece40x80x7");
		System.setProperty("mail.mime.decodetext.strict", "false");
    }

    /*
     * (non-Javadoc)
     * @see org.apache.hupa.server.IMAPStoreCache#get(org.apache.hupa.shared.data.User)
     */
    public IMAPStore get(User user) throws MessagingException {
        // FIXME, there will be a NullPointerException thrown here when user session expired

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x00x0");
		String id = user.getId();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x10x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x10x0");
		String username = user.getName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x20x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x20x10x0");
		String password = user.getPassword();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x30x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x30x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x30x0");
		Settings settings = user.getSettings();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x40x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x4_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x40x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x40x10x0");
		CachedIMAPStore cstore = pool.get(username);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x5");
		if (cstore == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x10x0");
			logger.debug("No cached store found for user " +username);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x0");
			if (cstore.isExpired() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x10x00x0");
				try {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x10x00x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x10x00x00x0");
					cstore.validate();
                } catch (MessagingException e) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x10x00x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x10x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x10x00x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x10x00x10x0");
                }
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x0");
				pool.remove(username);
                try {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x00x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x00x0");
					cstore.getStore().close();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x00x10x0");
					cstore = null;
                } catch (MessagingException e) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x50x20x00x20x10x10x00x0");
                }
            }
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x60x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x6");
		if (cstore == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x60x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x60x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x60x10x00x0");
			cstore = createCachedIMAPStore(user);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x7_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x00x00x0");
		if (cstore.getStore().isConnected() == false) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x10x00x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x70x10x00x00x2");
			cstore.getStore().connect(settings.getImapServer(), settings.getImapPort(), id, password);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x80x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x8");
		pool.put(username, cstore);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x9_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x90x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x90x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30x90x0");
		IMAPStore ret = cstore.getStore();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30xa0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30xa0x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30xa");
		// TODO: this is a hack for gmail
        if (settings.getImapServer().contains("gmail.com")) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30xa0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30xa0x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30xa0x10x0");
			internationalizeGmailFolders(user, ret);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fe5dc662a0x30xb");
		return ret;
    }

    public void internationalizeGmailFolders(User user, IMAPStore store) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c7_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x00x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x00x00x0");
		// TODO: this is a hack, we should have a default domain suffix in configuration files
        if (!user.getName().contains("@")) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x00x10x00x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x00x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x00x10x00x00x0");
			user.setName(user.getName() + "@gmail.com");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x00x20x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x00x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x00x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x00x2");
			final IMAPFolder folder = (IMAPFolder) store.getDefaultFolder();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x10x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x10x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x10x0");
			final char c = folder.getSeparator();

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x0");
			ListInfo[] li = (ListInfo[])folder.doCommandIgnoreFailure(new ProtocolCommand() {
                                public Object doCommand(IMAPProtocol p) throws ProtocolException {
                                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x3");
									InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x30x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x30x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x30x00x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x30x00x0");
									String arg = folder.getFullName() + c + "*";
                                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x30x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x20x10x00x10x00x1af5befad0x30x1");
									return p.lsub("", arg);
                                }
                            });

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x3");
			for (ListInfo l : li) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x00x1");
				if (l.attrs != null && l.attrs.length > 1) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x00x0");
					// * LIST (\HasNoChildren \Drafts) "/" "[Gmail]/Borradores"
                    String n = l.attrs[1];
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x1");
					if ("\\Drafts".equals(n)) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x10x0");
						user.getSettings().setDraftsFolderName(l.name);
                    } else if ("\\Sent".equals(n)) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x2");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x10x00x00x0");
						user.getSettings().setSentFolderName(l.name);
                    } else if ("\\Trash".equals(n)) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x2");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x2");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x20x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x20x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x20x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x20x10x0");
						user.getSettings().setTrashFolderName(l.name);
                    } else if ("\\Junk".equals(n)) {
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x20x2");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x2");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x2");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x00x30x10x00x10x10x20x20x20x1");
                    }
                }
            }
        } catch (Exception e) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fce4fc0c70x40x10x1");
        }
    }

    public CachedIMAPStore createCachedIMAPStore(User user) throws NoSuchProviderException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec830_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x00x10x0");
		Session ses = createSession(user);
        if(user.getSettings().getImapSecure())InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x10x10x00x10x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x10x10x00x10x0");
		if(!(user.getSettings().getImapSecure()))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x10x10x00x10x00x2");
		IMAPStore store = (IMAPStore)ses.getStore(user.getSettings().getImapSecure() ? "imaps" : "imap");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x20x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x20x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x20x1");
		CachedIMAPStore ret = new CachedIMAPStore(store, 300);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x30x0");
		ret.setSession(ses);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fc74ec8300x30x4");
		return ret;
    }

    /*
     * (non-Javadoc)
     * @see org.apache.hupa.server.IMAPStoreCache#delete(org.apache.hupa.shared.data.User)
     */
    public synchronized void delete(User user) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x4_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x40x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x40x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f9cf942c10x40x00x0");
		delete(user.getName());
    }

    /*
     * (non-Javadoc)
     * @see org.apache.hupa.server.IMAPStoreCache#delete(java.lang.String)
     */
    public synchronized void delete(String username) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b17_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x4_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x00x0");
		CachedIMAPStore cstore = pool.get(username);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x00x10x0");
		if (cstore != null && cstore.getStore().isConnected()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x1");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x00x00x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x00x00x00x0");
				cstore.getStore().close();
            } catch (MessagingException e) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x00x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x00x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x10x10x00x1");
                // Ignore on close
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f456b6b170x40x20x0");
		pool.remove(username);
    }

    public void sendMessage(Message msg) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f63cb2c7b0x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f63cb2c7b0x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f63cb2c7b_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f63cb2c7b0x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f63cb2c7b0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f63cb2c7b0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f63cb2c7b0x30x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f63cb2c7b0x30x0");
		Transport.send(msg);
    }

    public Session getMailSession(User user) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x30x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x30x00x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x30x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x30x00x1");
		CachedIMAPStore cstore = pool.get(user.getName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x30x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75fad8be2a10x30x10x0");
		return cstore.getSession();
    }

    private Session createSession(final User user) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda5_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x3_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x20x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x00x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x00x10x0");
		Properties props = new Properties();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x10x10x0");
		Settings settings = user.getSettings();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x20x0");
		props.setProperty("mail.mime.decodetext.strict", "false");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x3");
		if (settings.getImapSecure()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x0");
			props.setProperty("mail.store.protocol", "imaps");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x1");
			props.setProperty("mail.imaps.connectionpoolsize", connectionPoolSize + "");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x20x0");
			props.setProperty("mail.imaps.connectionpooltimeout", timeout + "");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x3");
			if (trustSSL) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x30x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x30x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x30x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x10x30x00x00x00x0");
				props.setProperty("mail.imaps.ssl.trust", settings.getImapServer());
            }
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x20x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x20x00x0");
			props.setProperty("mail.imap.connectionpoolsize", connectionPoolSize + "");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x20x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x20x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x30x20x1");
			props.setProperty("mail.imap.connectionpooltimeout", timeout + "");
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x4_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x0");
		if (settings.getSmtpSecure()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x0");
			if (settings.getSmtpPort() == 587) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x10x00x0");
				props.setProperty("mail.smtp.starttls.enable", "true");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x10x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x10x1");
				props.setProperty("mail.transport.protocol.rfc822", "smtp");
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x0");
				props.setProperty("mail.transport.protocol.rfc822", "smtps");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x10x0");
				props.setProperty("mail.smtps.ssl.enable", "true");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x2");
				if (trustSSL) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x20x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x20x00x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x10x00x20x20x00x00x0");
					props.setProperty("mail.smtps.ssl.trust", settings.getSmtpServer());
                }
            }
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x40x20x0");
			props.setProperty("mail.transport.protocol.rfc822", "smtp");
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x50x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x5_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x50x0");
		props.setProperty("mail.smtp.host", settings.getSmtpServer());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x60x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x6_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x60x0");
		props.setProperty("mail.smtps.host", settings.getSmtpServer());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x70x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x70x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x7_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x70x00x00x0");
		props.setProperty("mail.smtp.port", settings.getSmtpPort() + "");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x80x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x80x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x80x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x8");
		props.setProperty("mail.smtps.port", settings.getSmtpPort() + "");

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x90x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x9_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30x90x0");
		Authenticator auth = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x00x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x00x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x00x10x0");
		if (settings.getSmtpAuth() && user.getPassword() != null && user.getName() != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x00x0");
			props.setProperty("mail.smtp.auth", "true");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x10x0");
			props.setProperty("mail.smtps.auth", "true");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x2");
			auth = new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f7_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x00x0");
					String userId = user.getId();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x10x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x10x10x00x0");
					StackTraceElement[] sElms = Thread.currentThread().getStackTrace();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x2_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x00x0");
					for (StackTraceElement e : sElms) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x00x00x1");
						if (e.getClassName().equals(InMemoryIMAPStoreCache.class.getName()) && e.getMethodName().equals("get")) {
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x1");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x0");
							// We try with the id part the second time (unix imap/smtp auth compatible)
                            if (userId.matches(".*@.*")) {
                                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x1");
								InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x10x00x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x10x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x10x0");
								userId = userId.replaceFirst("@.*", "");
                                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x10x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x10x10x0");
								user.setId(userId);
                                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x10x2");
								break;
                            } else {
                                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x2");
								InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x20x10x00x10x00x20x0");
								return null;
                            }
                        }
                    }
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x30x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x30x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x30x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xa0x10x20x00x00x1a892d2f70x20x3");
					return new PasswordAuthentication(userId, user.getPassword());
                }
            };
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xb_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xb0x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xb0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xb0x10x0");
		Session ses = Session.getInstance(props, auth);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xc_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xc0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xc0x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xc0x00x00x0");
		ses.setDebug(debug && logger.isDebugEnabled());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xd_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xd0x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xd0x00x00x1_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xd0x00x00x10x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xd0x00x0_____org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xd0x00x00x0");
		logger.debug("Created session " + user.getName() + "\n" + settings + "\n"+ props.toString().replaceAll(",", ",\n "));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_InMemoryIMAPStoreCache_java0x040a5c75f2ae7dda50x30xe");
		return ses;
    }
}
