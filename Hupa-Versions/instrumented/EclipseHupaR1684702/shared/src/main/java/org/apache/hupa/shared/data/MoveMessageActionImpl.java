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
import org.apache.hupa.shared.domain.MoveMessageAction;

public class MoveMessageActionImpl implements MoveMessageAction {

    private ImapFolder oldFolder;
    private ImapFolder newFolder;
    private long messageUid;

    public MoveMessageActionImpl(ImapFolder oldFolder, ImapFolder newFolder, long messageUid) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x30x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x3_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x20x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x10x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x2_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd6b1427a5_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd6b1427a50x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd6b1427a50x2_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd6b1427a50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdef0d73bc0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdef0d73bc0x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdef0d73bc_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdef0d73bc0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd451d7fa10x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd451d7fa1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd451d7fa10x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd451d7fa10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x40x00x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x40x0");
		this.oldFolder = oldFolder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x40x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x40x10x0");
		this.newFolder = newFolder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x40x2_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd29924bff0x40x20x0");
		this.messageUid = messageUid;
    }

    protected MoveMessageActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd6b1427a5_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd6b1427a50x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd6b1427a50x2_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd6b1427a50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdef0d73bc0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdef0d73bc0x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdef0d73bc_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdef0d73bc0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd451d7fa10x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd451d7fa1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd451d7fa10x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd451d7fa10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdeb44b2cd0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdeb44b2cd0x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdeb44b2cd");
    }

    public long getMessageUid() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdcdfc51b80x2_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdcdfc51b80x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdcdfc51b8_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdcdfc51b80x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdcdfc51b80x20x0");
		return messageUid;
    }

    public ImapFolder getOldFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdec009ebe0x2_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdec009ebe0x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdec009ebe_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdec009ebe0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdec009ebe0x20x0");
		return oldFolder;
    }

    public ImapFolder getNewFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cddf33dc9a0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cddf33dc9a0x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cddf33dc9a_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cddf33dc9a0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cddf33dc9a0x20x0");
		return newFolder;
    }

    public void setMessageUid(long messageUid){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdd57bced70x3_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdd57bced7_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdd57bced70x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdd57bced70x20x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdd57bced70x2_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdd57bced70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdd57bced70x30x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cdd57bced70x30x00x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0");
		this.messageUid = messageUid;
    }

    public void setOldFolder(ImapFolder oldFolder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd1817787a0x1_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd1817787a0x20x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd1817787a0x3_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd1817787a_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd1817787a0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd1817787a0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd1817787a0x30x00x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd1817787a0x30x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0");
		this.oldFolder = oldFolder;
    }

    public void setNewFolder(ImapFolder newFolder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd3e81b6dc0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd3e81b6dc0x3_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd3e81b6dc0x2_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd3e81b6dc_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd3e81b6dc0x20x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd3e81b6dc0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd3e81b6dc0x30x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0_____org_apache_hupa_shared_data_MoveMessageActionImpl_java0x0eb44b2cd3e81b6dc0x30x00x0");
		this.newFolder = newFolder;
    }
}
