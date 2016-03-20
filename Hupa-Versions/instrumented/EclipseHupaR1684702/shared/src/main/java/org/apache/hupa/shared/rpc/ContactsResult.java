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

package org.apache.hupa.shared.rpc;


import tc3.shared.InstrumentationLoggerProvider;
import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;



public class ContactsResult{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c43e587c280x4_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c43e587c280x3_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c43e587c280x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c43e587c280x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c43e587c28_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c43e587c280x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c43e587c280x40x0");
	}
	

	public static class Contact implements IsSerializable, Serializable{
        private static final long serialVersionUID = -8632580327693416473L;
        public String mail;
        public String realname;

        public Contact() {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe653");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf7_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b37456c4_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b37456c40x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b37456c40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x3_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c770x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a59_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x10x0");
        }

        public Contact(String address) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e27_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe653");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf7_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x3_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c770x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a59_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x00x00x0");
			mail = address.replaceAll("^.*<([^>]+)>\\s*$", "$1");

            if(!(mail.equals(address)))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x10x00x00x2");
			if(mail.equals(address))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x10x00x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x10x00x0");
			realname = mail.equals(address) ? mail : address
                    // remove the email part
                    .replaceAll("<[^<>]+>\\s*$", "")
                    // remove start symbols in the name
                    .replaceAll("^[\\s\"'<]+", "")
                    // remove end symbols in the name
                    .replaceAll("[\\s\"'>]+$", "")
                    ;

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x20x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x2");
			if (realname.isEmpty()) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x20x10x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c48f590e270x20x20x10x0");
				realname = mail;
			}
        }

        public Contact(String realname, String mail) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x3_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x20x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe653");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf7_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x3_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c770x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a59_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x30x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x30x0");
			this.realname = realname;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x30x10x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4b895941a0x30x1");
			this.mail = mail;
        }

        @Override
		public String toString() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4a7edc608");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4a7edc6080x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4a7edc6080x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4a7edc6080x1");
			if(!(realname != null && !realname.isEmpty()))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4a7edc6080x20x00x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4a7edc6080x20x00x0");
			if(realname != null && !realname.isEmpty())InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4a7edc6080x20x00x00x1");
			return realname != null && !realname.isEmpty() ? realname : mail;
        }

        public String toKey() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4d486da810x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4d486da810x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4d486da810x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4d486da81");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4d486da810x20x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4d486da810x20x00x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4d486da810x20x00x00x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4d486da810x20x0");
			return toString().replaceAll("[^\\w\\d<@>]+", "").toLowerCase();
        }

        public String getName() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4fa98c1fd0x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4fa98c1fd_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4fa98c1fd0x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4fa98c1fd0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4fa98c1fd0x20x0");
			return realname;
        }

        public String toIsoAddress() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x20x00x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x20x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x20x0");
			if (!mail.equals(realname)) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x20x00x10x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x20x00x10x0");
				return realname + " <" + mail + ">";
			} else {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x20x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4230b7abd0x20x00x20x0");
				return mail;
			}
        }
    }

    private Contact[] contacts;

    public ContactsResult() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe653");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf7_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x3_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c770x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a59_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c7754f50c770x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c7754f50c77_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c7754f50c770x0");
    }

    public ContactsResult(Contact... contacts) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe6530x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c49f0fe653");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf7_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c41d6e1cf70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c4_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x3_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77b37456c40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c770x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a59_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779db49a590x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779946e261_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779946e2610x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779946e2610x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779946e2610x10x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779946e2610x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779946e2610x20x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c779946e2610x20x00x0");
		this.contacts = contacts;
    }

    public Contact[] getContacts() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c776a5552ca0x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c776a5552ca_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c776a5552ca0x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c776a5552ca0x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c776a5552ca0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c776a5552ca0x20x0");
		return contacts;
    }

    public void setContacts(Contact[] contacts) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac833_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac8330x20x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac8330x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac8330x20x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac8330x2_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac8330x1_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac8330x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_rpc_ContactsResult_java0x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac8330x30x00x0_____org_apache_hupa_shared_rpc_ContactsResult_java0x054f50c77defac8330x30x0");
		this.contacts = contacts;
    }

}
