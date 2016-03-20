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
import org.apache.hupa.shared.domain.MessageDetails;

import com.google.gwt.event.shared.GwtEvent;

public class MessageViewEvent extends GwtEvent<MessageViewEventHandler>{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x40x00x00x1_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x1_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x40x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x30x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x3_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x2_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x40x00x00x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x40x00x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a256_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x4_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50918c5a2560x30x1");
	}
	

	public final static Type<MessageViewEventHandler> TYPE = new Type<MessageViewEventHandler>();

    public MessageDetails messageDetails;
    public MessageViewEvent(MessageDetails details) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f5099205ba1e0x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f5099205ba1e0x1_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f5099205ba1e0x2_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f5099205ba1e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509a597d2ad0x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509a597d2ad0x2_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509a597d2ad0x1_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509a597d2ad_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509a597d2ad0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f5090x10x1_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f5090x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f5090x10x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f5090x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509a597d2ad0x20x00x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509a597d2ad0x20x0");
		messageDetails = details;
    }

    @Override
    protected void dispatch(MessageViewEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b0x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b0x20x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b0x3_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b0x2_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b0x30x00x00x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b0x30x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f50973ab973b0x30x00x0");
		handler.onMessageViewEvent(this);
    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<MessageViewEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509adc165ab0x0_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509adc165ab0x2_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509adc165ab0x1_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509adc165ab0x10x1_____org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509adc165ab0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509adc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_MessageViewEvent_java0x0bc49f509adc165ab0x20x0");
		return TYPE;
    }

}
