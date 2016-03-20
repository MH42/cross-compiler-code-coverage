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

public class SessionExpireEvent extends GwtEvent<SessionExpireEventHandler>{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x30x1_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x3_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x40x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x30x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x40x00x00x1_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x4_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x40x00x00x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x2_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x1_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522b6b2c7bb0x40x00x0");
	}
	
	public final static Type<SessionExpireEventHandler> TYPE = new Type<SessionExpireEventHandler>();
    private User user;
    @Override
    protected void dispatch(SessionExpireEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f20x2_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f20x3_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f20x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f20x20x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f20x30x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f20x30x00x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522fc2c81f20x30x00x00x0");
		handler.onSessionExpireEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<SessionExpireEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522adc165ab0x10x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522adc165ab0x2_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522adc165ab0x1_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522adc165ab0x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522adc165ab0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522adc165ab0x20x0");
		return TYPE;
    }

    public SessionExpireEvent(User user) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d4252212dea96f0x1_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d4252212dea96f0x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d4252212dea96f0x2_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d4252212dea96f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425220x10x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425220x10x1_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425220x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425220x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425227b109504_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425227b1095040x10x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425227b1095040x1_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425227b1095040x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425227b1095040x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425227b1095040x20x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d425227b1095040x20x00x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x0");
		this.user = user;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522abbd3e690x1_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522abbd3e69_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522abbd3e690x0_____org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522abbd3e690x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SessionExpireEvent_java0x067d42522abbd3e690x20x0");
		return user;
    }
}
