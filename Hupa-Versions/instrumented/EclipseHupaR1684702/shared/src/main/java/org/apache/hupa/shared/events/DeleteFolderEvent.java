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

public class DeleteFolderEvent extends GwtEvent<DeleteFolderEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x40x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x2_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x30x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x40x00x00x1_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x1_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x40x00x00x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d4_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x40x00x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x30x1_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x4_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f631b627d40x3");
	}
	

	public DeleteFolderEvent(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f60x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f60x1_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f60x10x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f60x10x1");
	}
	

	public final static Type<DeleteFolderEventHandler> TYPE = new Type<DeleteFolderEventHandler>();
    @Override
    protected void dispatch(DeleteFolderEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d2724");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d27240x2_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d27240x20x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d27240x3_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d27240x1_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d27240x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d27240x30x00x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d27240x30x00x00x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6a79d27240x30x0");
		handler.onDeleteFolderEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<DeleteFolderEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6adc165ab0x10x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6adc165ab0x2_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6adc165ab0x0_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6adc165ab0x1_____org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6adc165ab0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DeleteFolderEvent_java0x051e074f6adc165ab0x20x0");
		return TYPE;
    }

}
