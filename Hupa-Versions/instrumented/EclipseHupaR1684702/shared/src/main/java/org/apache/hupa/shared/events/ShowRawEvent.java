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

public class ShowRawEvent extends GwtEvent<ShowRawEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x3_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x30x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x40x00x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x30x1_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x4_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x40x00x00x1_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x1_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x40x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x40x00x00x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x2_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b0x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c266bf7e0b");
	}
	

	public ShowRawEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c20x10x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c20x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c20x10x1_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c20x1");
	}
	

	public final static Type<ShowRawEventHandler> TYPE = new Type<ShowRawEventHandler>();
    @Override
    protected void dispatch(ShowRawEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e0x2_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e0x3_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e0x1_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e0x20x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e0x30x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e0x30x00x00x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2786c843e0x30x00x0");
		handler.onShowRaw(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<ShowRawEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2adc165ab0x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2adc165ab0x2_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2adc165ab0x10x0_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2adc165ab0x1_____org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2adc165ab0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ShowRawEvent_java0x03d7dc8c2adc165ab0x20x0");
		return TYPE;
    }

}
