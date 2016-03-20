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
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.User;

import com.google.gwt.event.shared.GwtEvent;

public class FolderSelectionEvent extends GwtEvent<FolderSelectionEventHandler>{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c237_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x40x00x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x3_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x40x00x00x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x2_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x40x00x00x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x30x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x30x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x4_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a761c2370x40x0");
	}
	

	private User user;
    private ImapFolder folder;
    public final static Type<FolderSelectionEventHandler> TYPE = new Type<FolderSelectionEventHandler>();
    public FolderSelectionEvent(User user, ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81afffdd080x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81afffdd080x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81afffdd08_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81afffdd080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c8112dea96f0x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c8112dea96f_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c8112dea96f0x2_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c8112dea96f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c810x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c810x10x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c810x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c810x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c2437_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x20x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x10x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x2_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x30x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x30x00x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0");
		this.user =user;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x30x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81816c24370x30x10x0");
		this.folder = folder;
    }

    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a7336cc5_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a7336cc50x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a7336cc50x2_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a7336cc50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81a7336cc50x20x0");
		return folder;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81abbd3e690x2_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81abbd3e69_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81abbd3e690x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81abbd3e690x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81abbd3e690x20x0");
		return user;
    }

    @Override
    protected void dispatch(FolderSelectionEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a80x3_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a80x2_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a80x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a80x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a80x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a80x30x00x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a80x30x00x00x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81de5e88a80x30x0");
		handler.onFolderSelectionEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<FolderSelectionEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81adc165ab0x10x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81adc165ab0x1_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81adc165ab0x2_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81adc165ab0x0_____org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81adc165ab0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_FolderSelectionEvent_java0x0f4176c81adc165ab0x20x0");
		return TYPE;
    }

}
