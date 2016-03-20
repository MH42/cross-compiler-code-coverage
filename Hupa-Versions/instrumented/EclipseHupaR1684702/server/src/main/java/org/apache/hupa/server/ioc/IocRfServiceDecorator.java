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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.web.bindery.requestfactory.server.ServiceLayerDecorator;
import com.google.web.bindery.requestfactory.shared.Locator;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;
import com.google.web.bindery.requestfactory.shared.ServiceLocator;

public final class IocRfServiceDecorator extends ServiceLayerDecorator {
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8184b5e7e0x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8184b5e7e0x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8184b5e7e_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8184b5e7e0x2");
	}
	
	public IocRfServiceDecorator(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc80x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc80x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc80x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc814187a73");
	}
	

	@Inject
    private Injector injector;

    @Override
    public <T extends Locator<?, ?>> T createLocator(Class<T> clazz) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x30x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x3_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x4_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x10x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x10x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x30x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x30x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x10x00x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x40x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8c9a09cc10x40x00x0");
		return injector.getInstance(clazz);
    }

    @Override
    public Object createServiceInstance(
            Class<? extends RequestContext> requestContext) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x20x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x20x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x20x00x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x3_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc846684838");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x00x00x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x00x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x00x0");
		Class<? extends ServiceLocator> serviceLocatorClass;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x00x00x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x00x00x00x0");
		if ((serviceLocatorClass = getTop().resolveServiceLocator(
                requestContext)) != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x10x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x10x00x0");
			return injector.getInstance(serviceLocatorClass).getInstance(
                    requestContext.getAnnotation(Service.class).value());
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8466848380x30x10x20x0");
			return null;
        }
    }

    @Override
    public <T> T createDomainObject(Class<T> clazz) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc862900404");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x3_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x30x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x30x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x4_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x30x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x40x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc8629004040x40x0");
		return injector.getInstance(clazz);
    }

    static int count = 0;
    @Override
    public Object invoke(Method domainMethod, Object... args) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x4_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x20x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x3_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x30x0");
		
		//		Block insertion:
		//
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x00x00x20x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x00x00x20x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x00x00x20x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x00x00x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x00x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x3_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x30x00x00x00x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x00x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x0");
		int n = count ++;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x10x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x10x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x1");
		long start = System.currentTimeMillis();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x20x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x20x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x20x10x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x20x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x20x10x00x00x0");
		boolean doLog = !"login".equals(domainMethod.getName());
        if (doLog) System.out.println(n + " >>>>>>>>> Invoking  RF "  + domainMethod.getDeclaringClass() + " >>" + domainMethod.getName() + " " + new ArrayList<Object>(Arrays.asList(args)));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x40x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x40x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x4");
		Object ret = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x5_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x00x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x00x00x0");
			ret =  super.invoke(domainMethod, args);
        } catch (Throwable e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x00x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x00x10x00x0");
			long l = System.currentTimeMillis() - start;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x10x0");
			e.printStackTrace();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x30x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x3_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x30x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x30x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x30x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x00x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x20x00x00x0");
			if (doLog) System.out.println(n + " << " + String.format("%6d", l) +" Returning RF ERROR "  + domainMethod.getDeclaringClass().getSimpleName() + " <<" + domainMethod.getName() + " " + new ArrayList<Object>(Arrays.asList(args)));
            if(!(e instanceof RuntimeException))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x30x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x30x0");
			if(e instanceof RuntimeException)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x10x10x30x00x1");
			throw e instanceof RuntimeException ? (RuntimeException) e : new RuntimeException(e);
        } finally {
            
			//		Block insertion:
			//
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x30x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x30x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x2_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x30x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x3_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x30x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x10x00x00x00x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x00x10x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x00x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x0_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x00x1_____org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x50x20x00x10x0");
			long l = System.currentTimeMillis() - start;
            if (doLog) System.out.println(n + " << " + String.format("%6d", l) +" Returning RF "  + domainMethod.getDeclaringClass().getSimpleName() + " <<" + domainMethod.getName() + " " + new ArrayList<Object>(Arrays.asList(args)));
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_IocRfServiceDecorator_java0x0a7a8abc817bace9a0x40x6");
		return ret;
    }
}