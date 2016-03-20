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
import com.google.inject.Injector;
import com.google.web.bindery.requestfactory.shared.ServiceLocator;

/**
 * This is Guice-injected ServiceLocator.  Use this class to provide dependency-injected
 * instances of your RequestFactory services. When defining a new Request interface,
 * set this in the locator attribute of the @Service annotation.
 */
public class IocRfServiceLocator implements ServiceLocator {

  public IocRfServiceLocator(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f414187a73");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4");
	}
	

@Inject
  private Injector injector;

  @Override
  public Object getInstance(Class<?> clazz) {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x2_____org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x20x00x0_____org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x1_____org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x3_____org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x20x00x1_____org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x0_____org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x20x0");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb563");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x30x0_____org_apache_hupa_server_ioc_IocRfServiceLocator_java0x046a751f4a48eb5630x30x00x0");
	return injector.getInstance(clazz);
  }

}