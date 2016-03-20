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
import org.apache.hupa.shared.domain.Message;
import org.apache.hupa.shared.domain.User;

import com.google.gwt.event.shared.GwtEvent;

public class MoveMessageEvent extends GwtEvent<MoveMessageEventHandler> {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x4_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x40x00x00x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x40x00x00x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x30x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x3_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x40x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x40x00x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c40x30x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5c177b7c4");
	}
	

	public final static Type<MoveMessageEventHandler> TYPE = new Type<MoveMessageEventHandler>();
    private User user;
    private ImapFolder oldFolder;
    private ImapFolder newFolder;
    private Message message;

    public MoveMessageEvent(User user, ImapFolder oldFolder,
            ImapFolder newFolder, Message message) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b512dea96f0x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b512dea96f_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b512dea96f0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b512dea96f0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b50x10x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b50x10x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b50x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b50x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x5_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x3_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x4_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x30x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x40x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x10x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x20x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc77_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56b1427a5_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56b1427a50x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56b1427a50x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56b1427a50x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5451d7fa10x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5451d7fa10x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5451d7fa10x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5451d7fa1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56f9b9af30x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56f9b9af30x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56f9b9af30x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56f9b9af3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x50x00x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x50x0");
		this.user = user;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x50x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x50x10x0");
		this.oldFolder = oldFolder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x50x20x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x50x2");
		this.newFolder = newFolder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x50x30x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5d387cc770x50x3_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0");
		this.message = message;
    }

    public MoveMessageEvent(ImapFolder newFolder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b512dea96f0x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b512dea96f_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b512dea96f0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b512dea96f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b50x10x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b50x10x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b50x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b50x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b524fa077c0x10x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b524fa077c_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b524fa077c0x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b524fa077c0x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b524fa077c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56b1427a5_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56b1427a50x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56b1427a50x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56b1427a50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5451d7fa10x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5451d7fa10x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5451d7fa10x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5451d7fa1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56f9b9af30x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56f9b9af30x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56f9b9af30x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b56f9b9af3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b524fa077c0x20x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b524fa077c0x20x00x0");
		this.newFolder = newFolder;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5abbd3e690x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5abbd3e690x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5abbd3e690x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5abbd3e69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5abbd3e690x20x0");
		return user;
    }

    public ImapFolder getOldFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5ec009ebe0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5ec009ebe_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5ec009ebe0x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5ec009ebe0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5ec009ebe0x20x0");
		return oldFolder;
    }

    public ImapFolder getNewFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5df33dc9a_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5df33dc9a0x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5df33dc9a0x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5df33dc9a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5df33dc9a0x20x0");
		return newFolder;
    }

    public Message getMessage() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5480ad7700x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5480ad770_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5480ad7700x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5480ad7700x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5480ad7700x20x0");
		return message;
    }

    protected void dispatch(MoveMessageEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa0x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa0x3_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa0x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa0x30x00x00x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa0x30x00x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5524f07aa0x30x0");
		handler.onMoveMessageHandler(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<MoveMessageEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5adc165ab0x2_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5adc165ab0x10x1_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5adc165ab0x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5adc165ab0x10x0_____org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5adc165ab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MoveMessageEvent_java0x0a25e20b5adc165ab0x20x0");
		return TYPE;
    }

}
