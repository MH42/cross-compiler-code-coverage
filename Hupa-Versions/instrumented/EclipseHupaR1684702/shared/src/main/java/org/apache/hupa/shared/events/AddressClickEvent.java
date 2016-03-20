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

public class AddressClickEvent extends GwtEvent<AddressClickEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x40x00x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x4_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x40x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x40x00x00x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x40x00x00x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x30x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x30x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a3_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x3_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x2_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa42d40a30x0");
	}
	

	public final static Type<AddressClickEventHandler> TYPE = new Type<AddressClickEventHandler>();
    private String email;
    public AddressClickEvent(String email){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa88b7dcd0x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa88b7dcd0x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa88b7dcd_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaa88b7dcd0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa3dfde3460x10x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa3dfde346_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa3dfde3460x2_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa3dfde3460x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa3dfde3460x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa0x10x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa0x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa0x10x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa3dfde3460x20x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa3dfde3460x20x00x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x0");
		this.email = email;
    }

    public String getEmail() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffafa4be4940x2_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffafa4be4940x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffafa4be4940x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffafa4be494");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffafa4be4940x20x0");
		return email;
    }

    public void setEmail(String email) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa54a166f80x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa54a166f8_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa54a166f80x2_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa54a166f80x3_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa54a166f80x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa54a166f80x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa54a166f80x30x00x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa54a166f80x30x0");
		this.email = email;
    }

    @Override
    protected void dispatch(AddressClickEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f0x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f0x2_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f0x20x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f0x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f0x30x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f0x30x00x00x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffa323a158f0x30x00x0");
		handler.onClick(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<AddressClickEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaadc165ab0x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaadc165ab0x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaadc165ab0x10x0_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaadc165ab0x10x1_____org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaadc165ab0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AddressClickEvent_java0x05bb26ffaadc165ab0x20x0");
		return TYPE;
    }

}
