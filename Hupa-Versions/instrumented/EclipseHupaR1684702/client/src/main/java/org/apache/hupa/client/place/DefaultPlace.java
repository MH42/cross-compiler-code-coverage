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

/**
 * login page
 */
public class DefaultPlace extends AbstractPlace {

    String token;

    public DefaultPlace(String token) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72ee9778060x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72ee977806_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72ee9778060x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72fb967333_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72fb9673330x2_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72fb9673330x1_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72fb9673330x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72fb9673330x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72fb9673330x20x0_____org_apache_hupa_client_place_DefaultPlace_java0x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72fb9673330x20x00x0");
		this.token = token;
    }

    public String getToken() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a725fa9385e_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a725fa9385e0x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a725fa9385e0x1_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a725fa9385e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a725fa9385e0x20x0");
		return token;
    }

    @Prefix("")
    public static class Tokenizer implements PlaceTokenizer<DefaultPlace> {

        @Override
        public DefaultPlace getPlace(String token) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e0x2_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e0x20x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e0x3_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e0x1_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e0x30x00x00x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e0x30x00x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b34f35e88e0x30x0");
			return new DefaultPlace(token);
        }

        @Override
        public String getToken(DefaultPlace place) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b31e94588a");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b31e94588a0x1_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b31e94588a0x3_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b31e94588a0x2_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b31e94588a0x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b31e94588a0x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b31e94588a0x30x00x0_____org_apache_hupa_client_place_DefaultPlace_java0x0cf0f2a72c8bdf6b31e94588a0x30x0");
			return place.getToken();
        }
    }

}
