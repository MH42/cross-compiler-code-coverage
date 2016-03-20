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

package org.apache.hupa.server.utils;


import tc3.desktop.InstrumentationLoggerProvider;
import java.util.regex.Pattern;

import org.apache.hupa.shared.SConsts;

/**
 * A place where we centralize all compiled regular expressions which will be used in
 * server side for html and text transformations.
 */
public class RegexPatterns {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c63bbf4d0x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c63bbf4d0x40x00x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c63bbf4d_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c63bbf4d0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c63bbf4d0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c63bbf4d0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c63bbf4d0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c63bbf4d0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c47330d5c9_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c47330d5c90x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c47330d5c90x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c47330d5c90x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c47330d5c90x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c47330d5c90x4");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c442e01cf70x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c442e01cf70x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c442e01cf70x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c442e01cf70x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c442e01cf70x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c442e01cf7");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4279e988e0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4279e988e0x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4279e988e0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4279e988e0x40x00x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4279e988e_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4279e988e0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4279e988e0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4279e988e0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4db3244ef0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4db3244ef0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4db3244ef0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4db3244ef_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4db3244ef0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4db3244ef0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c43e3abb0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c43e3abb0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c43e3abb0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c43e3abb_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c43e3abb0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c43e3abb0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49f02ddec0x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49f02ddec0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49f02ddec0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49f02ddec_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49f02ddec0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49f02ddec0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49f02ddec0x4");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c44d9abcc60x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c44d9abcc60x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c44d9abcc60x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c44d9abcc60x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c44d9abcc60x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c44d9abcc6");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4e0e887c20x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4e0e887c20x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4e0e887c20x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4e0e887c20x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4e0e887c20x40x00x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4e0e887c20x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4e0e887c2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4e0e887c20x4");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c431f23f110x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c431f23f110x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c431f23f11_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c431f23f110x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c431f23f110x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c431f23f110x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a63f4aee0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a63f4aee0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a63f4aee_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a63f4aee0x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a63f4aee0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a63f4aee0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a63f4aee0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a63f4aee0x40x00x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4d615fb700x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4d615fb70_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4d615fb700x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4d615fb700x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4d615fb700x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4d615fb700x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4d615fb700x3");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4571a09710x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4571a09710x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4571a09710x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4571a0971_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4571a09710x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4571a09710x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4571a09710x40x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c415c77e330x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c415c77e330x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c415c77e330x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c415c77e330x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c415c77e33_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c415c77e330x3");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42928d3ce0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42928d3ce0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42928d3ce0x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42928d3ce0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42928d3ce_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42928d3ce0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42928d3ce0x3");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45b92152d0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45b92152d0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45b92152d0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45b92152d0x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45b92152d0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45b92152d_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45b92152d0x3");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4599e0e92_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4599e0e920x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4599e0e920x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4599e0e920x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4599e0e920x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4599e0e920x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c480b139a40x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c480b139a40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c480b139a40x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c480b139a40x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c480b139a4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c480b139a40x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c480b139a40x3");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45e4bd4bf0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45e4bd4bf0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45e4bd4bf0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45e4bd4bf0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45e4bd4bf_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45e4bd4bf0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b833f7200x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b833f7200x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b833f7200x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b833f7200x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b833f720_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b833f7200x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c3c6f3f10x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c3c6f3f10x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c3c6f3f1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c3c6f3f10x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c3c6f3f10x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c3c6f3f10x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c3c6f3f10x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b1d7595f0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b1d7595f0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b1d7595f0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b1d7595f_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b1d7595f0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b1d7595f0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45cba25db0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45cba25db0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45cba25db0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45cba25db0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45cba25db0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c45cba25db");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a29bae8e0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a29bae8e0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a29bae8e0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a29bae8e0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a29bae8e0x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a29bae8e_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a29bae8e0x40x00x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4a29bae8e0x4");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b3b9572c0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b3b9572c0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b3b9572c0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b3b9572c0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b3b9572c0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4b3b9572c");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c39efe550x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c39efe550x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c39efe550x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c39efe55_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c39efe550x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4c39efe550x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4be0251030x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4be0251030x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4be0251030x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4be025103_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4be0251030x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4be0251030x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4be0251030x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c46e8fd9720x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c46e8fd972_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c46e8fd9720x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c46e8fd9720x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c46e8fd9720x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c46e8fd9720x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c46e8fd9720x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c426e3a5a70x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c426e3a5a70x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c426e3a5a70x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c426e3a5a70x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c426e3a5a7_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c426e3a5a70x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c426e3a5a70x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42ba27ebf0x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42ba27ebf0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42ba27ebf0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42ba27ebf0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42ba27ebf0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c42ba27ebf");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c429b819e40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c429b819e40x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c429b819e4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c429b819e40x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c429b819e40x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c429b819e40x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c429b819e40x40x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f8d3b7a10x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f8d3b7a1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f8d3b7a10x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f8d3b7a10x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f8d3b7a10x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f8d3b7a10x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49dea74ff0x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49dea74ff_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49dea74ff0x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49dea74ff0x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49dea74ff0x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49dea74ff0x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c49dea74ff0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f53466650x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f53466650x2_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f5346665_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f53466650x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f53466650x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4f53466650x3");
	}
	

	public RegexPatterns(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4");
	}
	

	public static final Pattern regex_lt = Pattern.compile("<");
    public static final String repl_lt = "&lt;";

    public static final Pattern regex_gt = Pattern.compile(">");
    public static final String repl_gt = "&gt;";

    public static final Pattern regex_nl = Pattern.compile("\n");
    public static final String repl_nl = "<br/>";

    public static final String HTML_LINK_REGEXP =  "\\b?(https?://[\\w\\d:#@%/;$\\(\\)~_\\?\\+\\-=\\\\.&]*)\\b?";
    public static final Pattern regex_htmllink = Pattern.compile(HTML_LINK_REGEXP);
    public static final String repl_htmllink = "<a href=\"$1\">$1</a>";

    public static final String EMAIL_REGEXP =  "\\b(?<![A-z0-9._%\\+\\-=])([A-z][A-z0-9._%\\+\\-]+@[A-z0-9\\.\\-]+\\.[A-z]{2,4})";
    public static final Pattern regex_email = Pattern.compile("\\b"+ EMAIL_REGEXP);
    public static final String repl_email = "<a href=\"mailto:$1\">$1</a>";

    public static final Pattern regex_inlineImg = Pattern.compile("(?si)(<\\s*img\\s+.*?src=)[\"']?cid:([^\"']+)[\"']?");
    public static final String repl_inlineImg = "$1'" + SConsts.HUPA + SConsts.SERVLET_DOWNLOAD
                                        + "?" + SConsts.PARAM_MODE + "=inline"
                                        + "&" + SConsts.PARAM_FOLDER + "=%%FOLDER%%"
                                        + "&" + SConsts.PARAM_UID + "=%%UID%%"
                                        + "&" + SConsts.PARAM_NAME + "=$2' name='cid:$2'";

    public static final Pattern regex_revertInlineImg = Pattern.compile("(?si)(<img\\s[^>]*src=)[^>]+name=([\"']cid:[^\"']+[\"'])");
    public static final String repl_revertInlineImg = "$1$2";

    public static final Pattern regex_badTags = Pattern.compile("(?si)<(script|style|head).*?</\\1\\s*>");
    public static final String repl_badTags = "";

    public static final Pattern regex_unneededTags = Pattern.compile("(?si)(</?(html|body)[^>]*?>)");
    public static final String repl_unneededTags = "";

    public static final String EVENT_ATTR_REGEX = "(?:on[dbl]*click)|(?:onmouse[a-z]+)|(?:onkey[a-z]+)";
    public static final Pattern regex_badAttrs = Pattern.compile("(?si)(<\\w+[^<>]*)\\s+("+ EVENT_ATTR_REGEX + ")=[\"']?([^\\s<>]+?)[\"']?([\\s>])");
    public static final String repl_badAttrs = "$1$4";

    public static final Pattern regex_orphandHttpLinks = Pattern.compile("(?si)(?!.*<a\\s?[^>]*?>.+</a\\s*>.*)(<[^<]*?>[^<>]*)" + HTML_LINK_REGEXP + "([^<>]*<[^>]*?>)");
    public static final String repl_orphandHttpLinks = "$1<a href=\"$2\">$2</a>$3";

    public static final Pattern regex_existingHttpLinks = Pattern.compile("(?si)<a\\s[^>]*?href=[\"']?" + HTML_LINK_REGEXP + "[\"']?");
    public static final String repl_existingHttpLinks = "<a onClick=\"openLink('$1');return false;\" href=\"$1\"";

    public static final Pattern regex_orphandEmailLinks = Pattern.compile("(?si)(?!.*<a\\s?[^>]*?>.+</a\\s*>.*)(<[^<]*?>[^<>]*)" + EMAIL_REGEXP + "([^<>]*<[^>]*?>)");
    public static final String repl_orphandEmailLinks = "$1<a href=\"mailto:$2\">$2</a>$3";

    public static final Pattern regex_existingEmailLinks = Pattern.compile("(?si)<a\\s[^>]*?href=[\"']*mailto:[\"']?([^\"]+)[\"']?");
    public static final String repl_existngEmailLinks = "<a onClick=\"mailTo('$1');return false;\" href=\"mailto:$1\"";

    public static String replaceAll(String txt, Pattern pattern, String replacement) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x30x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca13_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x50x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x5_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x6_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x60x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x60x00x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c4fc7aca130x60x00x00x0");
		return pattern.matcher(txt).replaceAll(replacement);
    }

    public static String replaceAllRecursive(String txt, Pattern pattern, String replacement) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x40x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x6_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x30x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x4_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x3_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d98763_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x1_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x50x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x5_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x00x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x00x00x0");
		while (pattern.matcher(txt).find()) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x00x10x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x00x10x00x00x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x00x10x00x0_____org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x00x10x00x00x00x0");
			txt = pattern.matcher(txt).replaceAll(replacement);
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_RegexPatterns_java0x0f2a598c459d987630x60x1");
		return txt;
    }

    public static final Pattern regex_nl_tags = Pattern.compile("(?si)(<br\\s*?/?>)|(</div\\s*?>)");
    public static final Pattern regex_any_tag = Pattern.compile("(\\w)<.*?>(\\w)");
    public static final String repl_any_tag = "$1 $2";

//    s=s.replaceAll("\n", " ");
//    s=s.replaceAll("(?si)<br\\s*?/?>", "\n");
//    s=s.replaceAll("(?si)</div\\s*?>", "\n");
//    s=s.replaceAll("(\\w)<.*?>(\\w)", "$1 $2");
//    s=s.replaceAll("<.*?>", "");
//    s=s.replaceAll("[ \t]+", " ");


}
