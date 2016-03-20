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
import java.util.List;

import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.Message;

import com.google.gwt.event.shared.GwtEvent;

public class MessagesReceivedEvent extends GwtEvent<MessagesReceivedEventHandler>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x2_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x3_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x40x00x00x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x30x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x40x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc3_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x40x00x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x30x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x40x00x00x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1217662afc30x4");
	}
	

	public final static Type<MessagesReceivedEventHandler> TYPE = new Type<MessagesReceivedEventHandler>();
    private List<Message> messages;
    private ImapFolder folder;

    public MessagesReceivedEvent(ImapFolder folder, List<Message> messages) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12117f3467d0x10x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12117f3467d0x2_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12117f3467d0x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12117f3467d0x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12117f3467d_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12117f3467d0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121afffdd08_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121afffdd080x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121afffdd080x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121afffdd080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1210x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1210x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1210x10x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1210x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb522_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x2_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x20x00x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x3_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x20x00x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x10x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x30x00x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x30x0");
		this.messages = messages;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x30x10x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b12147ddb5220x30x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x0");
		this.folder = folder;
    }

    public List<Message> getMessages() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1218c4146150x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1218c4146150x2_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1218c4146150x10x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1218c414615_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1218c4146150x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1218c4146150x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b1218c4146150x20x0");
		return messages;
    }

    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121a7336cc50x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121a7336cc50x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121a7336cc50x2_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121a7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121a7336cc50x20x0");
		return folder;
    }


    @Override
    protected void dispatch(MessagesReceivedEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c0x3_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c0x20x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c0x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c0x2_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c0x30x00x00x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c0x30x00x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121f533281c0x30x0");
		handler.onMessagesReceived(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<MessagesReceivedEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121adc165ab0x10x0_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121adc165ab0x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121adc165ab0x10x1_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121adc165ab0x2_____org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121adc165ab0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessagesReceivedEvent_java0x08b58b121adc165ab0x20x0");
		return TYPE;
    }

}
