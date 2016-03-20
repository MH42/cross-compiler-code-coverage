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

package org.apache.hupa.server.ioc.demo;


import tc3.desktop.InstrumentationLoggerProvider;
import java.lang.reflect.Constructor;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;

import org.apache.commons.logging.Log;
import org.apache.hupa.server.CachedIMAPStore;
import org.apache.hupa.server.IMAPStoreCache;
import org.apache.hupa.server.InMemoryIMAPStoreCache;
import org.apache.hupa.shared.domain.User;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.sun.mail.imap.IMAPStore;

/**
 * Module which binds the handlers and configurations for demo mode
 */
public class DemoGuiceServerModule extends org.apache.hupa.server.ioc.GuiceServerModule {

    public DemoGuiceServerModule(Properties properties) {
        super(properties);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x20x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x20x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x20x10x00x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x20x10x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcaca9ada83a0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac");
        new RuntimeException().printStackTrace();
    }

    protected Class<? extends IMAPStoreCache> getIMAPStoreCacheClass() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcacb508216d_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcacb508216d0x10x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcacb508216d0x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcacb508216d0x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcacb508216d0x10x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcacb508216d0x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcacb508216d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcacb508216d0x20x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0");
		return DemoIMAPStoreCache.class;
    }

    /**
     * IMAPStoreCache implementation for Demo mode.
     *
     * It uses mock module which emulates fake imap and smtp servers based on
     * a set of example messages in filesystem and used for unit tests.
     *
     * We use here reflection so as we can deliver Hupa without mock stuff.
     *
     */
    public static class DemoIMAPStoreCache extends InMemoryIMAPStoreCache {
        @Inject
        public DemoIMAPStoreCache(Log logger,
                @Named("IMAPConnectionPoolSize") int connectionPoolSize,
                @Named("IMAPConnectionPoolTimeout") int timeout,
                @Named("SessionDebug") boolean debug,
                @Named("TrustStore") String truststore,
                @Named("TrustStorePassword") String truststorePassword,
                @Named("TrustSSL") boolean trustSSL) {
            super(logger, connectionPoolSize, timeout, debug, truststore, truststorePassword, trustSSL);
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f1bca5f330x80x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f1bca5f33");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f1bca5f330x7_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f1bca5f330x70x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f1bca5f330x8");
        }

        @Override
        public CachedIMAPStore createCachedIMAPStore(User user)
                throws NoSuchProviderException {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec830");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x3");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x00x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x00x00x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x00x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x00x1");
				Class<?> clz = Class.forName("org.apache.hupa.server.mock.MockIMAPStore");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x10x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x10x00x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x10x00x0");
				Constructor<?> cons = clz.getConstructors()[1];
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x20x10x00x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x10x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x20x10x00x10x00x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x20x10x00x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x20x10x00x10x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x20x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x2_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x20x10x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x20x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x20x1");
				IMAPStore store = (IMAPStore) cons.newInstance(new Object[] { Session.getInstance(new Properties()) });
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x30x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x3_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x00x30x00x0");
				return new CachedIMAPStore(store, 300);
            } catch (ClassNotFoundException e) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x10x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x10x00x0");
            } catch (Exception e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x20x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x20x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x20x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x20x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x00x20x10x00x0");
				e.printStackTrace();
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399fc74ec8300x30x10x0");
			return super.createCachedIMAPStore(user);
        }

        @Override
        public void sendMessage(Message msg) throws MessagingException {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x20x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x2_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x3_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x1");
			try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x00x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x00x0");
				Class.forName("org.apache.hupa.server.mock.MockIMAPStore");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x00x1");
				return;
            } catch (ClassNotFoundException e) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x10x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x10x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x10x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x1");
            } catch (Exception e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x20x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x2_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x20x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x20x10x00x0_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x00x20x10x0");
				e.printStackTrace();
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x1_____org_apache_hupa_server_ioc_demo_DemoGuiceServerModule_java0x0469fbcac1e63399f63cb2c7b0x30x10x0");
			super.sendMessage(msg);
        }
    }

}
