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
import org.apache.hupa.shared.domain.GetMessageRawResult;

public class GetMessageRawResultImpl implements GetMessageRawResult {

    private String rawMessage;

    protected GetMessageRawResultImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9443480e9_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9443480e90x1_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9443480e90x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e93963d8e60x2_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e93963d8e6_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e93963d8e60x0_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e93963d8e60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e90x1_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e90x0_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9");

    }

    public GetMessageRawResultImpl(String rawMessage) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e93963d8e60x2_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e93963d8e6_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e93963d8e60x0_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e93963d8e60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e90x1_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e90x0_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9c77285c60x2_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9c77285c6_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9c77285c60x10x0_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9c77285c60x1_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9c77285c60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9c77285c60x20x0_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e9c77285c60x20x00x0_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0");
		this.rawMessage = rawMessage;
    }

    public String getRawMessage() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e944ac974d0x0_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e944ac974d0x2_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e944ac974d0x1_____org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e944ac974d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawResultImpl_java0x0443480e944ac974d0x20x0");
		return rawMessage;
    }
}
