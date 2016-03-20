
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

public class LoadMessagesEvent extends GwtEvent<LoadMessagesEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x3_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x4_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x30x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x40x00x00x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x40x00x00x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x30x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x40x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x40x00x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1e82d0c20x2");
	}
	

	public final static Type<LoadMessagesEventHandler> TYPE = new Type<LoadMessagesEventHandler>();
    private User user;
    private ImapFolder folder;
    private String searchValue;

    public LoadMessagesEvent(User user, ImapFolder folder) {
        this(user,folder,null);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d12dea96f0x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d12dea96f0x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d12dea96f0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d12dea96f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dafffdd080x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dafffdd08_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dafffdd080x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dafffdd080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d0x10x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d0x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1632733a0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1632733a0x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1632733a0x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1632733a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dddea6a7c0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dddea6a7c0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dddea6a7c0x3_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dddea6a7c0x10x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dddea6a7c0x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dddea6a7c0x20x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dddea6a7c0x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dddea6a7c");
    }

    public LoadMessagesEvent(User user, ImapFolder folder, String searchValue) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d12dea96f0x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d12dea96f0x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d12dea96f0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d12dea96f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dafffdd080x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dafffdd08_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dafffdd080x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dafffdd080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d0x10x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d0x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x3_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x30x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x10x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x4_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x20x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1632733a0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1632733a0x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1632733a0x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d1632733a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x40x00x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x40x0");
		this.user = user;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x40x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x40x10x0");
		this.folder = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x40x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d8b8fa8c50x40x20x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x0");
		this.searchValue = searchValue;
    }
    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dabbd3e690x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dabbd3e690x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dabbd3e690x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dabbd3e69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dabbd3e690x20x0");
		return user;
    }
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9da7336cc50x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9da7336cc50x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9da7336cc5_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9da7336cc50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9da7336cc50x20x0");
		return folder;
    }

    public String getSearchValue() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d28f237a20x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d28f237a20x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d28f237a2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d28f237a20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9d28f237a20x20x0");
		return searchValue;
    }

    @Override
    protected void dispatch(LoadMessagesEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c70x3_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c70x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c70x20x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c70x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c70x30x00x00x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c70x30x00x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9de79167c70x30x0");
		handler.onLoadMessagesEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<LoadMessagesEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dadc165ab0x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dadc165ab0x0_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dadc165ab0x10x1_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dadc165ab0x2_____org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dadc165ab0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_LoadMessagesEvent_java0x07e21da9dadc165ab0x20x0");
		return TYPE;
    }

}
