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

package org.apache.hupa.shared.events;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.shared.domain.User;

import com.google.gwt.event.shared.GwtEvent;

public class LoginEvent extends GwtEvent<LoginEventHandler>{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x3_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x40x00x00x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x2_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x40x00x00x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x4_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x30x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x30x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x40x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b7_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac8b0c49b70x40x00x0");
	}
	

	public final static Type<LoginEventHandler> TYPE = new Type<LoginEventHandler>();
    private User user;

    public LoginEvent(User user) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cac29eb03b40x10x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac29eb03b4_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac29eb03b40x2_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac29eb03b40x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac29eb03b40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cac12dea96f0x2_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac12dea96f0x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac12dea96f_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac12dea96f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cac0x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac0x10x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac0x10x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cac29eb03b40x20x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac29eb03b40x20x00x0_____org_apache_hupa_shared_events_LoginEvent_java0x0");
		this.user = user;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cacabbd3e690x2_____org_apache_hupa_shared_events_LoginEvent_java0x080247cacabbd3e690x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cacabbd3e690x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cacabbd3e69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cacabbd3e690x20x0");
		return user;
    }

    @Override
    public Type<LoginEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cacadc165ab0x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cacadc165ab0x10x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cacadc165ab0x10x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cacadc165ab0x2_____org_apache_hupa_shared_events_LoginEvent_java0x080247cacadc165ab0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cacadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cacadc165ab0x20x0");
		return TYPE;
    }

    @Override
    protected void dispatch(LoginEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e110x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e110x3_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e110x1_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e110x2_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e110x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e11");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e110x30x00x00x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e110x30x0_____org_apache_hupa_shared_events_LoginEvent_java0x080247cac81f73e110x30x00x0");
		handler.onLogin(this);
    }

}
