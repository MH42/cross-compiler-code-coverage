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

public class ReplyMessageEvent extends GwtEvent<ReplyMessageEventHandler>{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x40x00x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x30x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x4_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x30x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x40x00x00x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x40x00x00x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x3_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f14375b3f0x40x0");
	}
	

	public final static Type<ReplyMessageEventHandler> TYPE = new Type<ReplyMessageEventHandler>();
    private User user;
    private ImapFolder folder;
    private Message message;
    private MessageDetails details;
    private boolean replyAll;

    @Override
    protected void dispatch(ReplyMessageEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf8980x20x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf8980x3_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf8980x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf8980x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf8980x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf898");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf8980x30x00x00x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf8980x30x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fbcecf8980x30x00x0");
		handler.onReplyMessageEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<ReplyMessageEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fadc165ab0x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fadc165ab0x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fadc165ab0x10x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fadc165ab0x10x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fadc165ab0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fadc165ab0x20x0");
		return TYPE;
    }

    public ReplyMessageEvent(User user, ImapFolder folder, Message message, MessageDetails details, boolean replyAll) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x3_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x6_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x30x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x20x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x4_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x5_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x10x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x40x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x50x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f2b24f41a0x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f2b24f41a0x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f2b24f41a_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f2b24f41a0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fafffdd080x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fafffdd080x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fafffdd08_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fafffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f12dea96f0x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f12dea96f_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f12dea96f0x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f12dea96f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fe97116570x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fe97116570x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fe97116570x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fe9711657");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f6f9b9af30x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f6f9b9af30x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f6f9b9af3_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f6f9b9af30x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f0x10x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f0x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f0x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x00x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x0");
		this.user = user;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x10x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x0");
		this.folder = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x20x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x0");
		this.message = message;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x30x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x3");
		this.replyAll = replyAll;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x40x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f591497b50x60x4");
		this.details = details;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fabbd3e690x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fabbd3e690x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fabbd3e690x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fabbd3e69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fabbd3e690x20x0");
		return user;
    }

    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fa7336cc50x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fa7336cc50x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fa7336cc50x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fa7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fa7336cc50x20x0");
		return folder;
    }

    public Message getMessage() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f480ad7700x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f480ad7700x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f480ad770_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f480ad7700x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f480ad7700x20x0");
		return message;
    }


    public MessageDetails getMessageDetails() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fb49db1d30x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fb49db1d30x0_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fb49db1d30x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fb49db1d3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5fb49db1d30x20x0");
		return details;
    }

    public boolean getReplyAll() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f534bb9f20x1_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f534bb9f20x2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f534bb9f2_____org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f534bb9f20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_ReplyMessageEvent_java0x049d3ba5f534bb9f20x20x0");
		return replyAll;
    }

}
