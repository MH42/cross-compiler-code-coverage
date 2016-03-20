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

public class SendClickEvent extends GwtEvent<SendClickEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x4_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x30x1_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x40x00x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x1_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x40x00x00x1_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x3_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x30x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x40x00x00x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x2_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a28e401b3b0x40x0");
	}
	

	public SendClickEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a20x10x1_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a20x1_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a20x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a20x10x0");
	}
	

	public final static Type<SendClickEventHandler> TYPE = new Type<SendClickEventHandler>();
    @Override
    protected void dispatch(SendClickEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e0x3_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e0x1_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e0x2_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e0x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e0x30x00x00x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e0x30x00x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2f9497a9e0x30x0");
		handler.onSendClick(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<SendClickEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2adc165ab0x10x1_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2adc165ab0x2_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2adc165ab0x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2adc165ab0x10x0_____org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2adc165ab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_SendClickEvent_java0x0425a36a2adc165ab0x20x0");
		return TYPE;
    }

}
