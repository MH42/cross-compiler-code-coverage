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

package org.apache.hupa.shared.events;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.event.shared.GwtEvent;

import org.apache.hupa.shared.rpc.ContactsResult.Contact;

public class ContactsUpdatedEvent extends GwtEvent<ContactsUpdatedEventHandler> {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x40x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e25_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x40x00x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x40x00x00x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x30x1_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x3_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x40x00x00x1_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x1_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x30x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x4_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622abd19e250x2");
	}
	

	public final static Type<ContactsUpdatedEventHandler> TYPE = new Type<ContactsUpdatedEventHandler>();

    Contact[] contacts;

    public Contact[] getContacts() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326226a5552ca_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326226a5552ca0x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326226a5552ca0x10x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326226a5552ca0x2_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326226a5552ca0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326226a5552ca0x20x0");
		return contacts;
    }

    public ContactsUpdatedEvent(Contact[] contacts) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326229db49a590x1_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326229db49a590x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326229db49a590x00x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326229db49a59");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326220x10x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326220x10x1_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326220x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a25326220x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622655c7d6d0x10x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622655c7d6d0x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622655c7d6d0x1_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622655c7d6d0x2_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622655c7d6d0x10x00x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622655c7d6d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622655c7d6d0x20x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622655c7d6d0x20x00x0");
		this.contacts = contacts;
    }

    @Override
    protected void dispatch(ContactsUpdatedEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f2830x1_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f2830x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f2830x20x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f2830x3_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f2830x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f283");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f2830x30x00x00x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f2830x30x00x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622cb59f2830x30x0");
		handler.onContactsUpdated(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<ContactsUpdatedEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622adc165ab0x10x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622adc165ab0x10x1_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622adc165ab0x2_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622adc165ab0x0_____org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622adc165ab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ContactsUpdatedEvent_java0x0a2532622adc165ab0x20x0");
		return TYPE;
    }

}
