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

public class MessagePlace extends HupaPlace {

    public static class TokenWrapper {
        String folder;
        String uid;

        public TokenWrapper(String folder, String uid) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa8e9d09d50x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa8e9d09d5_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa8e9d09d50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f8139040_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x3_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x20x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x10x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029afffdd080x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029afffdd080x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029afffdd08");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029e2577dd7_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029e2577dd70x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029e2577dd70x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a20290x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a20290x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa0x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x30x00x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x30x0_____org_apache_hupa_client_place_MessagePlace_java0x0");
			this.folder = folder;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x30x10x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029f81390400x30x1");
			this.uid = uid;
        }
        public String getUid() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029249819540x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029249819540x2_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029249819540x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a202924981954");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029249819540x20x0");
			return uid;
        }
        public String getFolder() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7336cc50x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7336cc5_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7336cc50x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7336cc50x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7336cc50x20x0");
			return folder;
        }

        @Override
        public String toString() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7edc6080x2_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7edc6080x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7edc6080x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7edc608");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7edc6080x20x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029a7edc6080x20x00x0");
			return folder + SPLITTER + uid;
        }
    }

    TokenWrapper tokenWrapper;

    public TokenWrapper getTokenWrapper() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa7dd66cff0x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa7dd66cff_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa7dd66cff0x2_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa7dd66cff0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa7dd66cff0x20x0");
		return tokenWrapper;
    }

    public MessagePlace(String token) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x2_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x10x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df88");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa8e9d09d50x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa8e9d09d5_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa8e9d09d50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029afffdd080x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029afffdd080x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029afffdd08");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029e2577dd7_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029e2577dd70x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029e2577dd70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a20290x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a2029_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fae68a20290x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa0x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fa0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x00x00x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x00x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x00x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x00x10x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x0");
		String[] params = token.split(SPLITTER);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x10x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x1");
		if (params.length == 2) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x10x10x00x00x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x10x10x00x0_____org_apache_hupa_client_place_MessagePlace_java0x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x10x10x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0faf354df880x20x10x10x00x00x10x0");
			this.tokenWrapper = new TokenWrapper(params[0], params[1]);
        }
    }

    @Prefix("message")
    public static class Tokenizer implements PlaceTokenizer<MessagePlace> {

        @Override
        public MessagePlace getPlace(String token) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e0x2_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e0x3_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e0x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e0x20x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e0x30x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e0x30x00x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b34f35e88e0x30x00x00x0");
			return new MessagePlace(token);
        }

        @Override
        public String getToken(MessagePlace place) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x2_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x3_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c12");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x30x00x00x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x30x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x30x00x00x1_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x30x00x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x30x00x00x10x0_____org_apache_hupa_client_place_MessagePlace_java0x0781aa0fac8bdf6b3dbfb5c120x30x00x00x00x0");
			return place.getTokenWrapper().getFolder() + SPLITTER + place.getTokenWrapper().getUid();
        }
    }

}
