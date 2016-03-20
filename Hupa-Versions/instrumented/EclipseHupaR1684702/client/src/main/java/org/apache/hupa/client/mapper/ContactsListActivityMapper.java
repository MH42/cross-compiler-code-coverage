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

package org.apache.hupa.client.mapper;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.activity.ContactsListActivity;
import org.apache.hupa.client.place.ContactPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ContactsListActivityMapper extends _HupaActivityMapper {
    private final Provider<ContactsListActivity> contactsListActivityProvider;

    @Inject
    public ContactsListActivityMapper(Provider<ContactsListActivity> contactsListActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e8950x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e8950x10x00x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e8950x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e8950x2_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e8950x10x00x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e8950x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049193c965e0x20x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049193c965e0x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049193c965e0x2_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049193c965e0x3_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049193c965e0x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049193c965e0x20x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049193c965e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e0490x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e0490x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e895");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e8950x20x00x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e049e530e8950x20x0");
		this.contactsListActivityProvider = contactsListActivityProvider;
    }

    @Override
    protected Activity asyncLoadActivity(final Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x20x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x3_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x2_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x20x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d19");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x00x00x00x00x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x00x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x00x00x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x00x00x00x0");
		if (!(place instanceof ContactPlace)) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x00x10x0");
			return null;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1eb4b3f5d0x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1eb4b3f5d0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1eb4b3f5d0x30x00x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1eb4b3f5d0x30x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1c38e762c0x2_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1c38e762c0x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1c38e762c0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1c38e762c0x20x00x0_____org_apache_hupa_client_mapper_ContactsListActivityMapper_java0x0ef05e04966539d190x30x10x00x1c38e762c0x20x0");
				return contactsListActivityProvider.get();
            }
        };

    }
}
