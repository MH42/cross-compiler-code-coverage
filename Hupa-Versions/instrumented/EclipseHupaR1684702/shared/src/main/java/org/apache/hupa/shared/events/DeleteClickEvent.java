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

public class DeleteClickEvent extends GwtEvent<DeleteClickEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x1_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x2_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x4_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x40x00x00x1_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x3_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x40x00x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x30x1_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x40x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x40x00x00x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237200bbcb00x30x0");
	}
	

	public DeleteClickEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f52370x10x1_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f52370x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f52370x10x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f52370x1");
	}
	

	public final static Type<DeleteClickEventHandler> TYPE = new Type<DeleteClickEventHandler>();
    @Override
    protected void dispatch(DeleteClickEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc05479");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc054790x20x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc054790x2_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc054790x3_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc054790x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc054790x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc054790x30x00x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc054790x30x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237bdc054790x30x00x00x0");
		handler.onDeleteClickEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<DeleteClickEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237adc165ab0x1_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237adc165ab0x10x1_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237adc165ab0x2_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237adc165ab0x0_____org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237adc165ab0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteClickEvent_java0x0831f5237adc165ab0x20x0");
		return TYPE;
    }

}
