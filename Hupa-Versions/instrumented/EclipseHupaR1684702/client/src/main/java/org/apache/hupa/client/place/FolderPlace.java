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

public class FolderPlace extends HupaPlace {

    private String token;

    public FolderPlace(String token) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee35471e410x10x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee35471e410x2_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee35471e410x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee35471e41_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee35471e410x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3eeee9778060x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eeee9778060x1_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eeee977806_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eeee9778060x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee0x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee0x1_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee35471e410x20x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee35471e410x20x00x0_____org_apache_hupa_client_place_FolderPlace_java0x0");
		this.token = token;
    }

    public String getToken() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee5fa9385e0x1_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee5fa9385e0x2_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee5fa9385e0x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee5fa9385e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3ee5fa9385e0x20x0");
		return token;
    }

    @Prefix("folder")
    public static class Tokenizer implements PlaceTokenizer<FolderPlace> {

        @Override
        public FolderPlace getPlace(String token) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e0x2_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e0x20x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e0x1_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e0x3_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e0x30x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e0x30x00x00x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b34f35e88e0x30x00x0");
			return new FolderPlace(token);
        }

        @Override
        public String getToken(FolderPlace place) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b347dd8e71");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b347dd8e710x20x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b347dd8e710x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b347dd8e710x2_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b347dd8e710x1_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b347dd8e710x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b347dd8e710x30x0_____org_apache_hupa_client_place_FolderPlace_java0x0251bd3eec8bdf6b347dd8e710x30x00x0");
			return place.getToken();
        }
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null)
//            return false;
//        if (o == this)
//            return true;
//        if (o.getClass() != getClass())
//            return false;
//        FolderPlace place = (FolderPlace) o;
//        return (token == place.token || (token != null && token.equals(place.token)));
//    }
//
//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((token == null) ? 0 : token.hashCode());
//        return result;
//    }
}
