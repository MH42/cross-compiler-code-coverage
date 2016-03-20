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
package org.apache.hupa.server.mock;


import tc3.desktop.InstrumentationLoggerProvider;
import javax.servlet.http.HttpSession;

import com.google.inject.Inject;
import com.google.inject.Provider;


public class MockHttpSessionProvider implements Provider<HttpSession> {
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1ebd7b168eb0x1_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1ebd7b168eb0x2_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1ebd7b168eb_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1ebd7b168eb0x0");
	}
	
	static HttpSession session = null;
    @Inject
    public MockHttpSessionProvider() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x1_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb0x1_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb0x0_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb0x10x1_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x10x00x0_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x10x0");
		if (session == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x10x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x10x00x10x00x00x00x0_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x10x00x10x00x0_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x10x00x10x00x00x0_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb2c07c1eb0x10x00x10x0");
			session = new MockHttpSession();
        }
    }
    public HttpSession get() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb783923e5_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb783923e50x1_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb783923e50x2_____org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb783923e50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSessionProvider_java0x02c07c1eb783923e50x20x0");
		return session;
    }
}
