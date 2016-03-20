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

package org.apache.hupa.server.utils;



import tc3.desktop.InstrumentationLoggerProvider;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.hupa.server.FileItemRegistry;
import org.apache.hupa.shared.SConsts;

/**
 * Utility methods for manage user's session objects
 */
public class SessionUtils {

    public SessionUtils(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76");
	}
	

	public static FileItemRegistry getSessionRegistry(Log logger, HttpSession session) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x40x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x4_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x5_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x30x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x2_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x3_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x00x1_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x00x10x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x00x10x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x00x10x00x1");
		FileItemRegistry registry = (FileItemRegistry)session.getAttribute(SConsts.REG_SESS_ATTR);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x10x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x1");
		if (registry == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x10x10x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x10x10x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x10x10x00x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x10x10x00x00x00x0");
			registry = new FileItemRegistry(logger);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x10x10x1_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x10x10x10x0");
			session.setAttribute(SConsts.REG_SESS_ATTR, registry);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76792827aa0x50x2");
		return registry;
    }

    /**
     * Remove session attributes, it has to be done in the login and logout actions
     * @param session
     */
    public static void cleanSessionAttributes(HttpSession session) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x1_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x2_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x30x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x4_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x3_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x0");
		if (session != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x0");
			@SuppressWarnings("rawtypes")
            Enumeration en = session.getAttributeNames();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x10x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x10x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x10x1_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x10x10x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x10x00x1_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x1_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x10x10x00x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x10x10x00x00x1_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x10x10x0");
			ArrayList<String> toRemove = new ArrayList<String>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x2_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x0");
			while (en.hasMoreElements()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x00x1_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x00x10x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x00x10x0");
				String s = en.nextElement().toString();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x10x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x1");
				if (s.startsWith("hupa")) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x10x10x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x20x10x10x10x0");
					toRemove.add(s);
                }
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x30x00x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x30x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x3");
			for (String attr: toRemove) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x30x10x0_____org_apache_hupa_server_utils_SessionUtils_java0x0e5d8af76ecb740af0x40x00x10x30x10x00x0");
				session.removeAttribute(attr);
            }
        }
    }

}