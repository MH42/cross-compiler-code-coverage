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
import java.util.List;

import org.apache.hupa.shared.domain.DeleteMessageByUidAction;
import org.apache.hupa.shared.domain.ImapFolder;

public class DeleteMessageByUidActionImpl extends DeleteMessageActionImpl implements DeleteMessageByUidAction {

    public DeleteMessageByUidActionImpl(){
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3ff26cfa30x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3ff26cfa3_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3ff26cfa30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa30x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa30x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa30x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f21_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x10x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x10x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x2_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x0");}
    public DeleteMessageByUidActionImpl(ImapFolder folder, List<Long> messageUids){
        super(folder);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x10x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x20x00x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x20x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd2_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x2_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x3_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x20x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa30x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa30x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa30x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x30x10x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa3a33c8dd20x30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f21_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x10x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x10x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x2_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa315155f210x0");
        this.messageUids = messageUids;
    }

    private List<Long> messageUids;

    @Override
    public List<Long> getMessageUids() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa347abb242");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa347abb2420x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa347abb2420x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa347abb2420x10x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa347abb2420x2_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa347abb2420x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa347abb2420x20x0");
		return messageUids;
    }

    @Override
    public void setMessageUids(List<Long> messageUids) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x20x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x20x00x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x1_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x2_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x20x00x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x30x00x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0ff26cfa39f754a7f0x30x0_____org_apache_hupa_shared_data_DeleteMessageByUidActionImpl_java0x0");
		this.messageUids = messageUids;
    }

}
