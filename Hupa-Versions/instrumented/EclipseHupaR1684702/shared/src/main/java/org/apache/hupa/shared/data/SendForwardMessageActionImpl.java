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
import org.apache.hupa.shared.domain.SendForwardMessageAction;

public class SendForwardMessageActionImpl extends SendMessageActionImpl implements SendForwardMessageAction {

    private long uid;
    private ImapFolder folder;
    private String inReplyTo;
    private String references;

    public SendForwardMessageActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8c87196d8_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8c87196d80x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8c87196d80x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81961b90d_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81961b90d0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81961b90d0x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81961b90d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8f4c9a69f0x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8f4c9a69f0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8f4c9a69f0x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8f4c9a69f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8e2577dd70x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8e2577dd7_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8e2577dd70x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8e2577dd70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8afffdd080x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8afffdd080x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8afffdd080x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8afffdd08");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d80x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d80x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d80x1");
    }

    public SendForwardMessageActionImpl(SmtpMessage msg, ImapFolder folder, long uid) {
        super(msg);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x4_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e184_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x10x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x30x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x20x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x40x20x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x40x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x40x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d85521e1840x40x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81961b90d_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81961b90d0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81961b90d0x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81961b90d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8f4c9a69f0x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8f4c9a69f0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8f4c9a69f0x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8f4c9a69f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8e2577dd70x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8e2577dd7_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8e2577dd70x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8e2577dd70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8afffdd080x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8afffdd080x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8afffdd080x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8afffdd08");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d80x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d80x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d80x1");
        this.uid = uid;
        this.folder = folder;
    }

    @Override
    public void setFolder(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d84fe885f10x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d84fe885f10x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d84fe885f10x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d84fe885f10x3_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d84fe885f10x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d84fe885f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d84fe885f10x30x00x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d84fe885f10x30x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0");
		this.folder = folder;
    }

    @Override
    public void setUid(long uid) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81ada84090x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81ada84090x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81ada84090x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81ada84090x3_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81ada84090x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81ada8409");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81ada84090x30x00x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d81ada84090x30x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0");
		this.uid = uid;
    }

    @Override
    public long getUid() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d824981954");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8249819540x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8249819540x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8249819540x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8249819540x20x0");
		return uid;
    }

    @Override
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8a7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8a7336cc50x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8a7336cc50x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8a7336cc50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8a7336cc50x20x0");
		return folder;
    }

    @Override
    public String getInReplyTo() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8df65272e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8df65272e0x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8df65272e0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8df65272e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8df65272e0x20x0");
		return inReplyTo;
    }

    @Override
    public String getReferences() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d82ac8fe84");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d82ac8fe840x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d82ac8fe840x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d82ac8fe840x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d82ac8fe840x20x0");
		return references;
    }

    @Override
    public void setInReplyTo(String inReplyTo) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d89878b6930x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d89878b6930x20x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d89878b6930x3_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d89878b6930x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d89878b6930x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d89878b693");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d89878b6930x30x00x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d89878b6930x30x0");
		this.inReplyTo = inReplyTo;
    }

    @Override
    public void setReferences(String references) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8d85b4a0d0x2_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8d85b4a0d0x3_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8d85b4a0d0x20x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8d85b4a0d0x1_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8d85b4a0d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8d85b4a0d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8d85b4a0d0x30x00x0_____org_apache_hupa_shared_data_SendForwardMessageActionImpl_java0x0c87196d8d85b4a0d0x30x0");
		this.references = references;
    }
}
