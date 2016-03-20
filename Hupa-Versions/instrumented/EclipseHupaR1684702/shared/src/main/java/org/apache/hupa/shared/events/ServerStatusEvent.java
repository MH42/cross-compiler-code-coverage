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
import com.google.gwt.event.shared.GwtEvent;

public class ServerStatusEvent extends GwtEvent<ServerStatusEventHandler> {
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x40x00x00x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x40x00x00x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x40x00x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x2_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x4_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x3_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x40x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x30x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecb5d8a4ad0x30x0");
	}
	

	public final static Type<ServerStatusEventHandler> TYPE = new Type<ServerStatusEventHandler>();

    public enum ServerStatus {
        Unknown, Available, Unavailable, Error
    }

    private ServerStatus status = ServerStatus.Unknown;
    public ServerStatusEvent(ServerStatus status) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec386b3981_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec386b39810x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec386b39810x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec386b39810x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec43cb57697c62a142_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec43cb57692c9c1f79_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec43cb5769bc7819b3_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec43cb57697f2f6a15");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec43cb5769_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec43cb57690x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec0x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec0x10x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec0x10x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec8024b3850x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec8024b3850x2_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec8024b3850x10x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec8024b3850x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec8024b385");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec8024b3850x20x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec8024b3850x20x00x0");
		this.status = status;
    }

    public ServerStatus getStatus() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aeccb49f8b40x2_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aeccb49f8b4_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aeccb49f8b40x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aeccb49f8b40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aeccb49f8b40x20x0");
		return status;
    }

    @Override
    protected void dispatch(ServerStatusEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e1020x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e1020x20x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e1020x3_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e1020x2_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e1020x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e102");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e1020x30x00x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e1020x30x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aec2f50e1020x30x00x00x0");
		handler.onServerStatusChange(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<ServerStatusEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecadc165ab0x10x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecadc165ab0x2_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecadc165ab0x1_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecadc165ab0x0_____org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecadc165ab0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ServerStatusEvent_java0x0dfb76aecadc165ab0x20x0");
		return TYPE;
    }

}
