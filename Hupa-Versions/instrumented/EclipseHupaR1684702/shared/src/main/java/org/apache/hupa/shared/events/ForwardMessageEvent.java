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
import org.apache.hupa.shared.domain.MessageDetails;
import org.apache.hupa.shared.domain.User;

import com.google.gwt.event.shared.GwtEvent;

public class ForwardMessageEvent extends GwtEvent<ForwardMessageEventHandler> {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x40x00x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x30x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x4_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x40x00x00x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x40x00x00x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x40x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x3_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9252a5ce0x30x1");
	}
	
	public final static Type<ForwardMessageEventHandler> TYPE = new Type<ForwardMessageEventHandler>();
    private User user;
    private ImapFolder folder;
    private Message message;
    private MessageDetails details;

    public ForwardMessageEvent(User user, ImapFolder folder, Message message, MessageDetails details) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dee9711657_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dee97116570x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dee97116570x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dee97116570x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x30x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x5_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x3_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x4_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x40x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x20x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de12dea96f0x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de12dea96f0x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de12dea96f0x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de12dea96f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de6f9b9af3_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de6f9b9af30x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de6f9b9af30x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de6f9b9af30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deafffdd080x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deafffdd080x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deafffdd08_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deafffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de0x10x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de0x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de0x10x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x50x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x50x00x0");
		this.user = user;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x50x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x50x10x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0");
		this.folder = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x50x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x50x20x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0");
		this.message = message;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x50x30x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de9f66f72b0x50x3_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0");
		this.details = details;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deabbd3e690x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deabbd3e690x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deabbd3e69_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deabbd3e690x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deabbd3e690x20x0");
		return user;
    }

    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dea7336cc50x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dea7336cc5_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dea7336cc50x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dea7336cc50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7dea7336cc50x20x0");
		return folder;
    }

    public Message getMessage() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de480ad7700x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de480ad770_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de480ad7700x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de480ad7700x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de480ad7700x20x0");
		return message;
    }


    public MessageDetails getMessageDetails() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deb49db1d30x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deb49db1d30x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deb49db1d3_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deb49db1d30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deb49db1d30x20x0");
		return details;
    }

    @Override
    protected void dispatch(ForwardMessageEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb0x2_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb0x3_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb0x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb0x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb0x30x00x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb0x30x00x00x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7de3b81f4bb0x30x0");
		handler.onForwardMessageEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<ForwardMessageEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deadc165ab0x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deadc165ab0x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deadc165ab0x10x1_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deadc165ab0x10x0_____org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deadc165ab0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ForwardMessageEvent_java0x0167bf7deadc165ab0x20x0");
		return TYPE;
    }
}
