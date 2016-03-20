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

public class RefreshLabelListEvent extends GwtEvent<RefreshLabelListEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x40x00x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x40x00x00x1_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee77_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x30x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x1_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x30x1_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x40x00x00x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x4_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x2_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x40x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e7b53ee770x3");
	}
	

	public RefreshLabelListEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e0x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e0x1_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e0x10x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e0x10x1_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89e");
	}
	

	public final static Type<RefreshLabelListEventHandler> TYPE = new Type<RefreshLabelListEventHandler>();
    @Override
    protected void dispatch(RefreshLabelListEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e0x1_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e0x2_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e0x20x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e0x3_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e0x30x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e0x30x00x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89ecc1f574e0x30x00x00x0");
		handler.onRefreshEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<RefreshLabelListEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89eadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89eadc165ab0x0_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89eadc165ab0x1_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89eadc165ab0x10x1_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89eadc165ab0x2_____org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89eadc165ab0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_RefreshLabelListEvent_java0x036dbf89eadc165ab0x20x0");
		return TYPE;
    }

}
