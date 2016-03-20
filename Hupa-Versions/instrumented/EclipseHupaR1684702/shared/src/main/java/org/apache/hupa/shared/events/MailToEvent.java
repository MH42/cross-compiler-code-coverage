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

public class MailToEvent extends GwtEvent<MailToEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x40x00x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x40x00x00x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x4_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x3_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x40x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x40x00x00x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x2_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x30x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d958680x30x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f2d95868");
	}
	

	public final static Type<MailToEventHandler> TYPE = new Type<MailToEventHandler>();
    private String mailto;
    public MailToEvent(String mailto){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4fe710cd00x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4fe710cd00x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4fe710cd00x2_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4fe710cd0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f4614e420x2_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f4614e420x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f4614e420x10x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f4614e42_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f4614e420x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff40x10x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff40x10x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff40x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f4614e420x20x00x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4f4614e420x20x0_____org_apache_hupa_shared_events_MailToEvent_java0x0");
		this.mailto = mailto;
    }
    public String getMailto(){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff49d3477c80x2_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff49d3477c80x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff49d3477c80x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff49d3477c8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff49d3477c80x20x0");
		return mailto;
    }
    @Override
    protected void dispatch(MailToEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc10x3_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc10x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc10x20x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc10x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc10x30x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc10x30x00x00x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff468fd6dc10x30x00x0");
		handler.onMailTo(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<MailToEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4adc165ab0x10x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4adc165ab0x10x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4adc165ab0x1_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4adc165ab0x0_____org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4adc165ab0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MailToEvent_java0x0ab722ff4adc165ab0x20x0");
		return TYPE;
    }

}
