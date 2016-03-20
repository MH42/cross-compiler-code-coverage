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

public class MessageListRangeChangedEvent extends GwtEvent<MessageListRangeChangedEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x4_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x40x00x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x30x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x40x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x40x00x00x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c49_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x30x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x3_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x2_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x40x00x00x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383b5a4c490x1");
	}
	

	public final static Type<MessageListRangeChangedEventHandler> TYPE = new Type<MessageListRangeChangedEventHandler>();

    public Message message;


    public int start = 0, size = 0;
    public String search;

    public MessageListRangeChangedEvent(int start, int size, String search) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58386f9b9af30x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58386f9b9af30x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58386f9b9af30x2_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58386f9b9af3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58380x10x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58380x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58380x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58380x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383559d7ac_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383559d7ac0x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383559d7ac0x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58383559d7ac0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58387fe1fdfc0x2_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58387fe1fdfc0x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58387fe1fdfc0x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58387fe1fdfc0x3_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e58387fe1fdfc");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x4_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x2_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x20x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x3_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x30x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x10x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x40x00x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x40x0");
		this.start = start;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x40x10x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x40x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x0");
		this.size = size;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x40x20x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838b505b7d30x40x2");
		this.search = search;
    }

    @Override
    protected void dispatch(MessageListRangeChangedEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f0x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f0x20x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f0x3_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f0x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f0x30x00x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f0x30x00x00x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838979d135f0x30x0");
		handler.onRangeChangedEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<MessageListRangeChangedEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838adc165ab0x1_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838adc165ab0x10x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838adc165ab0x0_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838adc165ab0x2_____org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838adc165ab0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageListRangeChangedEvent_java0x03a6e5838adc165ab0x20x0");
		return TYPE;
    }

}
