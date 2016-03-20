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

package org.apache.hupa.server.guice.providers;



import tc3.desktop.InstrumentationLoggerProvider;
import javax.servlet.http.HttpSession;

import com.google.inject.Provider;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;

public class HttpSessionProvider implements Provider<HttpSession>{

    public HttpSessionProvider(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a510x10x1_____org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a51_____org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a510x10x0_____org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a510x0_____org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a510x1");
	}
	

	@Override
    public HttpSession get() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a51783923e5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a51783923e50x1_____org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a51783923e50x0_____org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a51783923e50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a51783923e50x20x00x00x0_____org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a51783923e50x20x0_____org_apache_hupa_server_guice_providers_HttpSessionProvider_java0x019be8a51783923e50x20x00x0");
		return RequestFactoryServlet.getThreadLocalRequest().getSession();
    }

}
