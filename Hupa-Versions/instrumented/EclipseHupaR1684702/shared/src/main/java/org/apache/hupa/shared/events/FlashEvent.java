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

public class FlashEvent extends GwtEvent<FlashEventHandler> {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a14_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x4_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x40x00x00x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x40x00x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x3_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x40x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x30x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x40x00x00x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x30x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf88bba0a140x2");
	}
	

	public final static Type<FlashEventHandler> TYPE = new Type<FlashEventHandler>();

    public String getMessage() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8480ad7700x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8480ad7700x2_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8480ad770_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8480ad7700x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8480ad7700x20x0");
		return message;
    }

    public int getMillisec() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8f42067ca0x2_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8f42067ca_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8f42067ca0x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8f42067ca0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8f42067ca0x20x0");
		return millisec;
    }

    String message;
    int millisec;

    public FlashEvent(String message) {
        this(message, 0);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf80x10x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf80x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf80x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf80x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8e97aa3b70x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf89b9ecf690x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf89b9ecf690x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf89b9ecf69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf86f9b9af30x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf86f9b9af30x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf86f9b9af3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8e97aa3b70x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8e97aa3b70x10x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8e97aa3b70x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8e97aa3b70x2_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8e97aa3b7");
    }

    public FlashEvent(String message, int millisec) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf80x10x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf80x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf80x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf80x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x2_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x3_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x10x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x20x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a515_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf89b9ecf690x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf89b9ecf690x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf89b9ecf69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf86f9b9af30x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf86f9b9af30x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf86f9b9af3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x30x00x0_____org_apache_hupa_shared_events_FlashEvent_java0x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x30x0");
		this.message = message;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x30x10x0_____org_apache_hupa_shared_events_FlashEvent_java0x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8a6b5a5150x30x1");
		this.millisec = millisec;
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<FlashEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8adc165ab0x10x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8adc165ab0x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8adc165ab0x2_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8adc165ab0x10x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8adc165ab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf8adc165ab0x20x0");
		return TYPE;
    }

    @Override
    protected void dispatch(FlashEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a10x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a10x3_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a10x1_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a10x20x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a10x30x00x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a10x30x00x00x0_____org_apache_hupa_shared_events_FlashEvent_java0x0e981aaf83af466a10x30x0");
		handler.onFlash(this);
    }

}
