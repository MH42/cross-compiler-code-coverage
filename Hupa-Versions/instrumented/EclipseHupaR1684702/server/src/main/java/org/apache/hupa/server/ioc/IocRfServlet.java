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

package org.apache.hupa.server.ioc;


import tc3.desktop.InstrumentationLoggerProvider;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.requestfactory.server.ExceptionHandler;
import com.google.web.bindery.requestfactory.server.RequestFactoryServlet;
import com.google.web.bindery.requestfactory.server.ServiceLayerDecorator;

/**
 * This is a Guice-injected RequestFactoryServlet. Use this to replace the standard
 * non-dependency-injected RequestFactory servlet.
 */
@Singleton
public class IocRfServlet extends RequestFactoryServlet {

  static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606300efe640x0_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606300efe640x4_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606300efe640x3_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606300efe64_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606300efe640x1_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606300efe640x2");
	}
	

private static final long serialVersionUID = 1L;

  @Inject
  protected IocRfServlet(ExceptionHandler e, ServiceLayerDecorator d) {
    super(e, d);
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606f4260dcf");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606f4260dcf0x30x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606f4260dcf0x10x0_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606f4260dcf0x20x0_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606f4260dcf0x3_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606f4260dcf0x2_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606f4260dcf0x0_____org_apache_hupa_server_ioc_IocRfServlet_java0x08f7df606f4260dcf0x1");
  }

}