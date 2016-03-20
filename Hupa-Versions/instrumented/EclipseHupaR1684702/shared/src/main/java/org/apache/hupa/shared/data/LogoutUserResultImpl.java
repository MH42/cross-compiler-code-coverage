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
import org.apache.hupa.shared.domain.LogoutUserResult;
import org.apache.hupa.shared.domain.User;

public class LogoutUserResultImpl implements LogoutUserResult{

    private User user;

    public LogoutUserResultImpl(User user) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f593621840x1_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f593621840x10x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f593621840x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f593621840x2_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f59362184");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f12dea96f0x2_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f12dea96f0x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f12dea96f_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f12dea96f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f0x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f593621840x20x00x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f593621840x20x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x0");
		this.user = user;
    }

    public LogoutUserResultImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f12dea96f0x2_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f12dea96f0x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f12dea96f_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f12dea96f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f0x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f7c824c0f_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f7c824c0f0x0_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0f7c824c0f0x1");
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0fabbd3e690x2_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0fabbd3e69_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0fabbd3e690x1_____org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0fabbd3e690x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_LogoutUserResultImpl_java0x07c824c0fabbd3e690x20x0");
		return user;
    }
}
