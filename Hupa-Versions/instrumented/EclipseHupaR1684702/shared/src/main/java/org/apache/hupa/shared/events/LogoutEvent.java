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

public class LogoutEvent extends GwtEvent<LogoutEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x2_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x30x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x40x00x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x3_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x4_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x40x00x00x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x40x00x00x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x40x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbffeffd50a0x30x0");
	}
	

	public final static Type<LogoutEventHandler> TYPE = new Type<LogoutEventHandler>();
    private User user;
    public LogoutEvent(User user) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf12dea96f0x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf12dea96f_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf12dea96f0x2_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf12dea96f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf6f8ce6b40x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf6f8ce6b40x10x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf6f8ce6b40x2_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf6f8ce6b40x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf6f8ce6b4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf0x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf0x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf0x10x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf6f8ce6b40x20x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf6f8ce6b40x20x00x0");
		this.user = user;
    }

    @Override
    protected void dispatch(LogoutEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee350");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee3500x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee3500x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee3500x3_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee3500x20x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee3500x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee3500x30x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee3500x30x00x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbf38cee3500x30x00x00x0");
		handler.onLogout(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<LogoutEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfadc165ab0x2_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfadc165ab0x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfadc165ab0x10x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfadc165ab0x10x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfadc165ab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfadc165ab0x20x0");
		return TYPE;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfabbd3e690x1_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfabbd3e690x0_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfabbd3e69_____org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfabbd3e690x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LogoutEvent_java0x018fd7dbfabbd3e690x20x0");
		return user;
    }

}
