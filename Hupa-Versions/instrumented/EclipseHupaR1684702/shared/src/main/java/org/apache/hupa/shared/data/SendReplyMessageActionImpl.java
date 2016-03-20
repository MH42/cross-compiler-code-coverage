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

package org.apache.hupa.shared.data;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.SmtpMessage;
import org.apache.hupa.shared.domain.SendReplyMessageAction;

public class SendReplyMessageActionImpl extends SendForwardMessageActionImpl implements SendReplyMessageAction {
    public SendReplyMessageActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2130x0_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2130x1_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2130x2_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e213");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e21387b4e213_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e21387b4e2130x0_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e21387b4e2130x1");
    }
    public SendReplyMessageActionImpl(SmtpMessage msg, ImapFolder folder, long uid) {
        super(msg, folder, uid);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x10x0_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x2_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x30x0_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x1_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x4_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x20x0_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x3_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2136207477e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2130x0_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2130x1_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e2130x2_____org_apache_hupa_shared_data_SendReplyMessageActionImpl_java0x087b4e213");
    }
}
