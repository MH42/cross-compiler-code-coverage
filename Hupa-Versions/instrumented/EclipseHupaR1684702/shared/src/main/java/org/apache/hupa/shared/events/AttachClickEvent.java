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

public class AttachClickEvent extends GwtEvent<AttachClickEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x2_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x4_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x40x00x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x40x00x00x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x3_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x30x1_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x40x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe75_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x1_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x30x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d9852fe750x40x00x00x1");
	}
	

	public AttachClickEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d0x10x1_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d0x1_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d0x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d0x10x0");
	}
	

	public final static Type<AttachClickEventHandler> TYPE = new Type<AttachClickEventHandler>();
    @Override
    protected void dispatch(AttachClickEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f0x3_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f0x2_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f0x20x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f0x1_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f0x30x00x00x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f0x30x00x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51d2edd513f0x30x0");
		handler.onAttachClick(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<AttachClickEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51dadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51dadc165ab0x2_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51dadc165ab0x10x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51dadc165ab0x0_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51dadc165ab0x10x1_____org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51dadc165ab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_AttachClickEvent_java0x088dcf51dadc165ab0x20x0");
		return TYPE;
    }

}
