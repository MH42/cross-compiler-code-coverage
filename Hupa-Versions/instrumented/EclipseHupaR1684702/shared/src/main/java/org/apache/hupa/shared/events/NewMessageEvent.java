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

public class NewMessageEvent extends GwtEvent<NewMessageEventHandler>{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x2_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x3_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x40x00x00x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x30x1_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x30x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x1_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x4_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x40x00x00x1_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x40x00x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d399456f343ec0x40x0");
	}
	

	public NewMessageEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d3994_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39940x1_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39940x10x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39940x10x1_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39940x0");
	}
	

	public final static Type<NewMessageEventHandler> TYPE = new Type<NewMessageEventHandler>();

    @Override
    protected void dispatch(NewMessageEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a0x3_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a0x20x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a0x1_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a0x2_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a0x30x00x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a0x30x00x00x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d39942689e80a0x30x0");
		handler.onNewMessageEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<NewMessageEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d3994adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d3994adc165ab0x10x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d3994adc165ab0x2_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d3994adc165ab0x0_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d3994adc165ab0x10x1_____org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d3994adc165ab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_NewMessageEvent_java0x0c91d3994adc165ab0x20x0");
		return TYPE;
    }

}
