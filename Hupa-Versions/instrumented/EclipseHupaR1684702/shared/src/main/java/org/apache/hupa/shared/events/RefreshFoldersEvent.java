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
import org.apache.hupa.shared.domain.Message;

import com.google.gwt.event.shared.GwtEvent;

public class RefreshFoldersEvent extends GwtEvent<RefreshFoldersEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x2_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x40x00x00x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af46904_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x40x00x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x30x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x40x00x00x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x30x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x4_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x3_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f7af469040x40x0");
	}
	

	public final static Type<RefreshFoldersEventHandler> TYPE = new Type<RefreshFoldersEventHandler>();

    public Message message;

    public RefreshFoldersEvent() {
        this(null);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f5891f55f0x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f5891f55f0x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f5891f55f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f6f9b9af3_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f6f9b9af30x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f6f9b9af30x2_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f6f9b9af30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f0x10x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f0x10x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f0x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f5891f55f0x10x0");
    }

    public RefreshFoldersEvent(Message value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f6f9b9af3_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f6f9b9af30x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f6f9b9af30x2_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f6f9b9af30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f0x10x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f0x10x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f0x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f2452ee400x2_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f2452ee400x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f2452ee400x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f2452ee400x10x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f2452ee40");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f2452ee400x20x00x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f2452ee400x20x0");
		message = value;
    }

    @Override
    protected void dispatch(RefreshFoldersEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de0x2_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de0x3_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de0x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de0x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de0x30x00x00x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de0x30x00x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55f46b865de0x30x0");
		handler.onRefreshEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<RefreshFoldersEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55fadc165ab0x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55fadc165ab0x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55fadc165ab0x10x1_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55fadc165ab0x10x0_____org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55fadc165ab0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55fadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshFoldersEvent_java0x05891f55fadc165ab0x20x0");
		return TYPE;
    }

}
