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

public class BackEvent extends GwtEvent<BackEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x3_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x30x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x4_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x1_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x40x00x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x40x00x00x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x2_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x40x00x00x1_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x40x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af1_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0cc351af10x30x1");
	}
	

	public BackEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_BackEvent_java0x017e22de00x10x1_____org_apache_hupa_shared_events_BackEvent_java0x017e22de00x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de00x1_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de00x10x0");
	}
	

	public final static Type<BackEventHandler> TYPE = new Type<BackEventHandler>();
    @Override
    protected void dispatch(BackEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd20x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd20x3_____org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd20x20x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd20x2_____org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd20x30x00x00x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd20x30x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de026406bd20x30x00x0");
		handler.onBackEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<BackEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_BackEvent_java0x017e22de0adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_BackEvent_java0x017e22de0adc165ab0x2_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0adc165ab0x0_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0adc165ab0x10x1_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0adc165ab0x1_____org_apache_hupa_shared_events_BackEvent_java0x017e22de0adc165ab0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_BackEvent_java0x017e22de0adc165ab0x20x0");
		return TYPE;
    }

}
