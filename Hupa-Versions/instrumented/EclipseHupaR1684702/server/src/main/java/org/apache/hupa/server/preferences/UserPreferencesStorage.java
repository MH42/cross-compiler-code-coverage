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
import org.apache.hupa.shared.rpc.ContactsResult.Contact;

import java.util.Arrays;
import java.util.List;

/**
 *
 * Abstract class which defines storage operations related
 * with user preferences
 *
 */
public abstract class UserPreferencesStorage {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc123175e58b0x4_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc123175e58b0x3_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc123175e58b_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc123175e58b0x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc123175e58b0x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc123175e58b0x2");
	}
	

	public UserPreferencesStorage(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12");
	}
	

	protected static final String REGEX_OMITTED_EMAILS = "^.*(reply)[A-z0-9._%\\+\\-]*@.*$";

    /**
     * Add a new contact to the list.
     * The implementation has to check for duplicates
     */
    abstract public void addContact(Contact... c);

    /**
     * Add a new contact to the list.
     * The implementation has to check for duplicates
     */
    final public void addContact(String... mails) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x2_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x3_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x30x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x40x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x40x00x0");
		if (mails != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x40x00x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x40x00x10x00x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12603baea40x40x00x10x00x0");
			addContact(Arrays.asList(mails));
        }
    }

    /**
     * Add a new contact to the list.
     * The implementation has to check for duplicates
     */
    final public void addContact(List<String> mails) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x3_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x30x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x30x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x30x00x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x4_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x2_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d961");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x0");
		if (mails != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x0");
			for (String mail: mails) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x00x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x00x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x0");
				if (mail != null && !mail.matches(REGEX_OMITTED_EMAILS)) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x00x10x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x00x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x00x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x00x0");
					Contact contact = new Contact(mail);
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x10x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x10x0");
					if (!exists(contact)) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x10x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x10x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12e133d9610x40x00x10x00x10x00x10x10x10x00x0");
						addContact(contact);
                    }
                }
            }
        }
    }

    boolean exists (Contact mail) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x2_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x1");
		for (Contact c : getContacts()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x0");
			if (c.mail.equals(mail.mail)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x00x00x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x00x00x00x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x00x00x00x1_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x00x00x0");
				if (c.realname == null || c.realname.isEmpty() || c.realname.equals(c.mail)) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x00x10x0_____org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x00x10x00x0");
					c.realname = mail.realname;
                }
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x00x20x00x10x1");
				return true;
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_preferences_UserPreferencesStorage_java0x013c0cc12105e18a70x20x1");
		return false;
    }

    /**
     * Get the list of contacts
     */
    abstract public Contact[] getContacts();

}
