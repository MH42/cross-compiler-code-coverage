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
import javax.mail.MessagingException;
import javax.mail.Session;

import com.sun.mail.imap.IMAPStore;

public class CachedIMAPStore {
    private long validUntil;
    private int validForMillis;
    private IMAPStore store;
    private Session session;

    private CachedIMAPStore() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6af358ac6_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6af358ac60x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6af358ac60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac63a21295d_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac63a21295d0x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac63a21295d0x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac63a21295d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6fcbdc4c20x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6fcbdc4c2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6fcbdc4c20x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6fcbdc4c20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6bcae83cd0x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6bcae83cd_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6bcae83cd0x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6bcae83cd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac637b95a330x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac637b95a330x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac637b95a330x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac637b95a33");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac60x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6");
    }

    public static CachedIMAPStore getInstance() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac640804ce70x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac640804ce70x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac640804ce70x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac640804ce7_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac640804ce70x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac640804ce70x30x00x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac640804ce70x30x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac640804ce70x30x00x00x0");
		return new CachedIMAPStore();
    }

    public CachedIMAPStore(IMAPStore store, int validForSeconds) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x20x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca189_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x10x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac63a21295d_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac63a21295d0x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac63a21295d0x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac63a21295d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6fcbdc4c20x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6fcbdc4c2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6fcbdc4c20x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6fcbdc4c20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6bcae83cd0x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6bcae83cd_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6bcae83cd0x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6bcae83cd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac637b95a330x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac637b95a330x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac637b95a330x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac637b95a33");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac60x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x00x0");
		this.store = store;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x10x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x10x00x1");
		this.validForMillis = validForSeconds * 1000;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x20x00x10x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x20x0_____org_apache_hupa_server_CachedIMAPStore_java0x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6edaca1890x30x20x00x1");
		this.validUntil = System.currentTimeMillis() + validForMillis;
    }

    public boolean isExpired() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb4_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x20x00x00x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x20x00x00x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x20x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x20x00x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x20x00x00x00x0");
		if (validUntil > System.currentTimeMillis() && store.isConnected()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x20x00x10x0");
			return false;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac612e0bbb40x20x1");
		return true;
    }

    public void validate() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6e204d28a0x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6e204d28a0x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6e204d28a_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6e204d28a0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6e204d28a0x20x00x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6e204d28a0x20x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6e204d28a0x20x00x00x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6e204d28a0x20x00x00x00x0");
		validUntil = System.currentTimeMillis() + validForMillis;
    }

    public IMAPStore getStore() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6cc87ba9b0x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6cc87ba9b_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6cc87ba9b0x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6cc87ba9b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6cc87ba9b0x20x0");
		return store;
    }

    public Session getSession() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac68d734d3c0x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac68d734d3c_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac68d734d3c0x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac68d734d3c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac68d734d3c0x20x0");
		return session;
    }

    public void setSession(Session session) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6ba9021080x3_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6ba9021080x1_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6ba9021080x20x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6ba902108_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6ba9021080x2_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6ba9021080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_CachedIMAPStore_java0x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6ba9021080x30x00x0_____org_apache_hupa_server_CachedIMAPStore_java0x0af358ac6ba9021080x30x0");
		this.session = session;
    }
}