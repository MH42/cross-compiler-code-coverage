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

public class SentMessageEvent extends GwtEvent<SentMessageEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x30x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x40x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x40x00x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x40x00x00x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x2_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x1_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a3_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x30x1_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x40x00x00x1_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x3_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a12b7fe4a30x4");
	}
	

	public SentMessageEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a10x10x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a10x1_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a1_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a10x10x1_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a10x0");
	}
	

	public final static Type<SentMessageEventHandler> TYPE = new Type<SentMessageEventHandler>();
    @Override
    protected void dispatch(SentMessageEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d60x3_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d60x1_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d60x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d60x2_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d60x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d60x30x00x00x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d60x30x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a18ea935d60x30x00x0");
		handler.onSentMessageEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<SentMessageEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a1adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a1adc165ab0x2_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a1adc165ab0x10x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a1adc165ab0x1_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a1adc165ab0x0_____org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a1adc165ab0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SentMessageEvent_java0x0fd9b27a1adc165ab0x20x0");
		return TYPE;
    }

}
