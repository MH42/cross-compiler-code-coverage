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

package org.apache.hupa.server.preferences;


import tc3.desktop.InstrumentationLoggerProvider;
import com.google.inject.Inject;
import com.google.inject.Provider;

import org.apache.commons.logging.Log;
import org.apache.hupa.server.IMAPStoreCache;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.rpc.ContactsResult.Contact;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

/**
 * A preferences storage which uses session as repository data
 */
public class InSessionUserPreferencesStorage extends UserPreferencesStorage {

    private final Provider<HttpSession> sessionProvider;

    @Inject
    public InSessionUserPreferencesStorage(IMAPStoreCache cache, Log logger, Provider<HttpSession> sessionProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x10x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x30x00x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x4_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x30x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x2_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x3_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x30x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3ebad50efc_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3ebad50efc0x20x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3ebad50efc0x3_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3ebad50efc0x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3ebad50efc0x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3ebad50efc0x2_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3ebad50efc0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x40x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e3f2e25c20x40x00x0");
		this.sessionProvider = sessionProvider;
    }

    public void addContact(Contact... contacts) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x2_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x3_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b6325_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x20x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x00x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x00x10x0");
		HttpSession session = sessionProvider.get();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x1");
		@SuppressWarnings("unchecked")
        HashMap<String, Contact> sessionContacts = (HashMap<String, Contact>)session.getAttribute(SConsts.CONTACTS_SESS_ATTR);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x2");
		if (sessionContacts==null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x00x00x00x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x00x00x00x00x2_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x00x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x00x00x00x00x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x00x00x00x0");
			sessionContacts=new HashMap<String, Contact>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x20x10x10x0");
			session.setAttribute(SConsts.CONTACTS_SESS_ATTR, sessionContacts);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x3_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x0");
		for(Contact contact: contacts) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x10x00x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x10x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x10x00x00x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x10x00x0");
			if (!sessionContacts.containsKey(contact.toKey())) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x10x00x10x00x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x10x00x10x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e287b63250x30x30x10x00x10x00x0");
				sessionContacts.put(contact.toKey(), contact);
            }
        }
    }

    public Contact[] getContacts() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x2_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x10x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x20x00x1_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x20x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x20x00x0_____org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x20x00x10x0");
		HttpSession session = sessionProvider.get();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x20x1");
		@SuppressWarnings("unchecked")
        HashMap<String, Contact> sessionContacts = (HashMap<String, Contact>)session.getAttribute(SConsts.CONTACTS_SESS_ATTR);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x20x20x0");
		if(sessionContacts == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x20x20x00x1");
		if(!(sessionContacts == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_InSessionUserPreferencesStorage_java0x05afbeb3e6a5552ca0x20x20x00x2");
		return sessionContacts == null ? new Contact[]{} : sessionContacts.values().toArray(new Contact[sessionContacts.size()]);
    }
}
