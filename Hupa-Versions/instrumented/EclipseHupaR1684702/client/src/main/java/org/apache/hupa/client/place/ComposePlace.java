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
import org.apache.hupa.client.ui.ToolBarView.Parameters;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class ComposePlace extends AbstractPlace {

    private String token;
    private Parameters parameters;
    private String subject;
    private String body;

    public ComposePlace(String token) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2083f4570x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2083f4570x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2083f4570x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2083f457");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c335ce16b0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c335ce16b0x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c335ce16b0x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c335ce16b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c61b6a6250x10x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c61b6a6250x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c61b6a6250x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c61b6a6250x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c61b6a625");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cee9778060x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cee977806_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cee9778060x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cee9778060x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf1f1425b0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf1f1425b_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf1f1425b0x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf1f1425b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c61b6a6250x20x00x0_____org_apache_hupa_client_place_ComposePlace_java0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c61b6a6250x20x0");
		this.token = token;
    }

    public String getToken() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c5fa9385e_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c5fa9385e0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c5fa9385e0x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c5fa9385e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c5fa9385e0x20x0");
		return token;
    }

    @Prefix("compose")
    public static class Tokenizer implements PlaceTokenizer<ComposePlace> {

        @Override
        public ComposePlace getPlace(String token) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e0x20x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e0x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e0x3_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e0x30x00x00x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e0x30x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b34f35e88e0x30x00x0");
			return new ComposePlace(token);
        }

        @Override
        public String getToken(ComposePlace place) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3b868017c0x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3b868017c0x20x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3b868017c0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3b868017c0x3_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3b868017c0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3b868017c");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3b868017c0x30x00x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cc8bdf6b3b868017c0x30x0");
			return place.getToken();
        }
    }

    public Place with(Parameters parameters) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x20x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x3_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x30x00x0_____org_apache_hupa_client_place_ComposePlace_java0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x30x0");
		this.parameters = parameters;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x30x10x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c5fff2f0x30x1");
		return this;
    }

    public Parameters getParameters() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c1dcc8a0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c1dcc8a0x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c1dcc8a0x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c1dcc8a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c2c1dcc8a0x20x0");
		return parameters;
    }

    public ComposePlace with(String subject, String body) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x4_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x3_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x30x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x20x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x00x00x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x00x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x00x00x10x0_____org_apache_hupa_client_place_ComposePlace_java0x0");
		this.parameters = new Parameters(null, null, null, null);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x10x0_____org_apache_hupa_client_place_ComposePlace_java0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x1");
		this.subject = subject;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x2_____org_apache_hupa_client_place_ComposePlace_java0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x20x0");
		this.body = body;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x30x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09ce1de1f5e0x40x3");
		return this;
    }

    public String getSubject(){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c3ef042e50x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c3ef042e5_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c3ef042e50x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c3ef042e50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09c3ef042e50x20x0");
		return subject;
    }

    public String getBody(){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf4be0f1b0x0_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf4be0f1b0x2_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf4be0f1b0x1_____org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf4be0f1b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_ComposePlace_java0x0d5bec09cf4be0f1b0x20x0");
		return body;
    }

}
