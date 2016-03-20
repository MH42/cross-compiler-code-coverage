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
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

import com.google.inject.Provider;
import com.google.inject.Singleton;

@Singleton
public class LogProvider implements Provider<Log>{

    public LogProvider(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_LogProvider_java0x0e648b4f9");
	}
	

	public Log get() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_LogProvider_java0x0e648b4f9783923e50x1_____org_apache_hupa_server_guice_providers_LogProvider_java0x0e648b4f9783923e5_____org_apache_hupa_server_guice_providers_LogProvider_java0x0e648b4f9783923e50x2_____org_apache_hupa_server_guice_providers_LogProvider_java0x0e648b4f9783923e50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_guice_providers_LogProvider_java0x0e648b4f9783923e50x20x0_____org_apache_hupa_server_guice_providers_LogProvider_java0x0e648b4f9783923e50x20x00x00x0_____org_apache_hupa_server_guice_providers_LogProvider_java0x0e648b4f9783923e50x20x00x0");
		return new Log4JLogger("HupaLogger");
    }

}
