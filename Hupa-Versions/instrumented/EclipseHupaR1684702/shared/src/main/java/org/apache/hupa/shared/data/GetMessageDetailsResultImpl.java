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
import org.apache.hupa.shared.domain.GetMessageDetailsResult;
import org.apache.hupa.shared.domain.MessageDetails;

public class GetMessageDetailsResultImpl implements GetMessageDetailsResult{
    private MessageDetails messageDetails;

    public GetMessageDetailsResultImpl() {
        super();
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000391d1000390x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000391d100039_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000391d1000390x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000391d1000390x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000399205ba1e0x2_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000399205ba1e0x1_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000399205ba1e0x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000399205ba1e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000390x1_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000390x0");
    }

    public GetMessageDetailsResultImpl(MessageDetails messageDetails) {
        super();
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000399205ba1e0x2_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000399205ba1e0x1_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000399205ba1e0x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000399205ba1e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000390x1_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d1000390x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039968950e30x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039968950e30x1_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039968950e3_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039968950e30x10x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039968950e30x2_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039968950e30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039968950e30x20x1_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039968950e30x20x10x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x0");
        this.messageDetails = messageDetails;
    }

    @Override
    public MessageDetails getMessageDetails() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039b49db1d3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039b49db1d30x2_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039b49db1d30x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039b49db1d30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039b49db1d30x20x0");
		return messageDetails;
    }

    @Override
    public void setMessageDetails(MessageDetails messageDetails) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039440db2780x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039440db2780x1_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039440db2780x2_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039440db2780x20x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039440db2780x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039440db278");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039440db2780x30x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x0_____org_apache_hupa_shared_data_GetMessageDetailsResultImpl_java0x01d100039440db2780x30x00x0");
		this.messageDetails = messageDetails;
    }
}
