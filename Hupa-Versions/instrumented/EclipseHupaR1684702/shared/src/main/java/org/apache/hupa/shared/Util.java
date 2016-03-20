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

package org.apache.hupa.shared;


import tc3.shared.InstrumentationLoggerProvider;
import java.util.ArrayList;
import java.util.List;

public class Util {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156ea7f4fce9_____org_apache_hupa_shared_Util_java0x04c31156ea7f4fce90x0_____org_apache_hupa_shared_Util_java0x04c31156ea7f4fce90x3_____org_apache_hupa_shared_Util_java0x04c31156ea7f4fce90x2_____org_apache_hupa_shared_Util_java0x04c31156ea7f4fce90x1_____org_apache_hupa_shared_Util_java0x04c31156ea7f4fce90x4");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156ece488ad2_____org_apache_hupa_shared_Util_java0x04c31156ece488ad20x3_____org_apache_hupa_shared_Util_java0x04c31156ece488ad20x4_____org_apache_hupa_shared_Util_java0x04c31156ece488ad20x0_____org_apache_hupa_shared_Util_java0x04c31156ece488ad20x1_____org_apache_hupa_shared_Util_java0x04c31156ece488ad20x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156ea2d434d10x1_____org_apache_hupa_shared_Util_java0x04c31156ea2d434d10x0_____org_apache_hupa_shared_Util_java0x04c31156ea2d434d1_____org_apache_hupa_shared_Util_java0x04c31156ea2d434d10x4_____org_apache_hupa_shared_Util_java0x04c31156ea2d434d10x3_____org_apache_hupa_shared_Util_java0x04c31156ea2d434d10x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156e7581234a_____org_apache_hupa_shared_Util_java0x04c31156e7581234a0x1_____org_apache_hupa_shared_Util_java0x04c31156e7581234a0x2_____org_apache_hupa_shared_Util_java0x04c31156e7581234a0x3_____org_apache_hupa_shared_Util_java0x04c31156e7581234a0x4_____org_apache_hupa_shared_Util_java0x04c31156e7581234a0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156efc9086ec0x4_____org_apache_hupa_shared_Util_java0x04c31156efc9086ec0x1_____org_apache_hupa_shared_Util_java0x04c31156efc9086ec_____org_apache_hupa_shared_Util_java0x04c31156efc9086ec0x3_____org_apache_hupa_shared_Util_java0x04c31156efc9086ec0x0_____org_apache_hupa_shared_Util_java0x04c31156efc9086ec0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156e175332a30x4_____org_apache_hupa_shared_Util_java0x04c31156e175332a30x3_____org_apache_hupa_shared_Util_java0x04c31156e175332a30x0_____org_apache_hupa_shared_Util_java0x04c31156e175332a3_____org_apache_hupa_shared_Util_java0x04c31156e175332a30x1_____org_apache_hupa_shared_Util_java0x04c31156e175332a30x2");
	}
	
	public Util(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156e0x0_____org_apache_hupa_shared_Util_java0x04c31156e");
	}
	
	public final static String HTML_LT = "&lt;";
    public final static String STRING_LT = "<";
    public final static String HTML_GT = "&gt;";
    public final static String STRING_GT = ">";
    public final static String HTML_CR = "<br>";
    public final static String STRING_CR = "\n";

    public static String unEscapeHtmlTags(String string) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156eca9156be0x30x0_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x1_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x3_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x0_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x4_____org_apache_hupa_shared_Util_java0x04c31156eca9156be_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x0_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x0");
		if (string != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x0_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x00x0_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x00x00x0");
			string = string.replaceAll(HTML_LT, STRING_LT);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x10x0_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x1_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x10x00x0");
			string = string.replaceAll(HTML_GT, STRING_GT);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x2_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x20x00x0_____org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x00x10x20x0");
			string = string.replaceAll(HTML_CR, STRING_CR);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156eca9156be0x40x1");
		return string;
    }

    public static String escapeHtmlTags(String string) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x0_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x3_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x2_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x1_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x4_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x0_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x00x0");
		if (string != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x00x10x00x0_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x00x10x00x00x0_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x00x10x0");
			string = string.replaceAll(STRING_LT, HTML_LT);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x00x10x10x00x0_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x00x10x1_____org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x00x10x10x0");
			string = string.replaceAll(STRING_GT, HTML_GT);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156edc174bfa0x40x1");
		return string;
    }

    public static <T> String listToString(List<T> list) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156ee426df690x40x0_____org_apache_hupa_shared_Util_java0x04c31156ee426df69_____org_apache_hupa_shared_Util_java0x04c31156ee426df690x5_____org_apache_hupa_shared_Util_java0x04c31156ee426df690x3_____org_apache_hupa_shared_Util_java0x04c31156ee426df690x40x00x1_____org_apache_hupa_shared_Util_java0x04c31156ee426df690x4_____org_apache_hupa_shared_Util_java0x04c31156ee426df690x40x00x0_____org_apache_hupa_shared_Util_java0x04c31156ee426df690x2_____org_apache_hupa_shared_Util_java0x04c31156ee426df690x0_____org_apache_hupa_shared_Util_java0x04c31156ee426df690x1");
		if(list == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156ee426df690x50x00x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156ee426df690x50x00x0");
		if(!(list == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_Util_java0x04c31156ee426df690x50x00x00x2");
		return list == null ? "" : new ArrayList<T>(list).toString().replaceFirst("^\\[(.*)\\]$", "$1");
    }
}
