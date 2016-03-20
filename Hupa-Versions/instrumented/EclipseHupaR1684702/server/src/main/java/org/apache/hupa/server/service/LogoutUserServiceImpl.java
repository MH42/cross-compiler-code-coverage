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

package org.apache.hupa.server.service;


import tc3.desktop.InstrumentationLoggerProvider;
import org.apache.hupa.server.utils.SessionUtils;
import org.apache.hupa.shared.data.LogoutUserResultImpl;
import org.apache.hupa.shared.domain.LogoutUserResult;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

public class LogoutUserServiceImpl extends AbstractService implements LogoutUserService {
    public LogoutUserServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e30x2_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e30x1_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e3_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e30x0");
	}
	
	@Override
    public LogoutUserResult logout() throws HupaException {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x1_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x0_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x00x10x0_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x0_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x00x1_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x00x0");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x1_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x10x0");
		user.setAuthenticated(false);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x2_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x20x0");
		// delete cached store
        cache.delete(user);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x30x0_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x30x00x0_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x3");
		// remove user attributes from session
        SessionUtils.cleanSessionAttributes(httpSessionProvider.get());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x40x0_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x4_____org_apache_hupa_server_service_LogoutUserServiceImpl_java0x0c296d3e355525e1b0x20x40x00x0");
		return new LogoutUserResultImpl(user);

    }
}
