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

package org.apache.hupa.client.place;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class ContactPlace extends AbstractPlace {

    String token;

    public ContactPlace(String token) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8d205510d0x10x0_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8d205510d0x1_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8d205510d0x2_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8d205510d_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8d205510d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8ee9778060x0_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8ee9778060x1_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8ee977806");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf80x1_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf80x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8d205510d0x20x00x0_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8d205510d0x20x0_____org_apache_hupa_client_place_ContactPlace_java0x0");
		this.token = token;
    }

    public String getToken() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf85fa9385e0x2_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf85fa9385e0x1_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf85fa9385e_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf85fa9385e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf85fa9385e0x20x0");
		return token;
    }

    @Prefix("contacts")
    public static class Tokenizer implements PlaceTokenizer<ContactPlace> {

        @Override
        public ContactPlace getPlace(String token) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e0x2_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e0x0_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e0x3_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e0x1_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e0x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e0x30x00x0_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e0x30x00x00x0_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b34f35e88e0x30x0");
			return new ContactPlace(token);
        }

        @Override
        public String getToken(ContactPlace place) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3cfe17c33");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3cfe17c330x1_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3cfe17c330x2_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3cfe17c330x3_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3cfe17c330x0_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3cfe17c330x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3cfe17c330x30x00x0_____org_apache_hupa_client_place_ContactPlace_java0x0b415dbf8c8bdf6b3cfe17c330x30x0");
			return place.getToken();
        }
    }

}
