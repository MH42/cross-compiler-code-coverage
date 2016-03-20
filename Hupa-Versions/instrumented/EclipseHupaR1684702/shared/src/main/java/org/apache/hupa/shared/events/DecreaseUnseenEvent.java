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

public class DecreaseUnseenEvent extends GwtEvent<DecreaseUnseenEventHandler>{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x40x00x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x4_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x30x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x40x00x00x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x40x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x40x00x00x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x3_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf7f5d377e0x30x0");
	}
	

	public final static Type<DecreaseUnseenEventHandler> TYPE = new Type<DecreaseUnseenEventHandler>();
    private User user;
    private ImapFolder folder;
    private int amount;

    public DecreaseUnseenEvent(User user, ImapFolder folder) {
        this(user, folder, 1);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf12dea96f_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf12dea96f0x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf12dea96f0x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf12dea96f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfafffdd08_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfafffdd080x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfafffdd080x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfafffdd080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf0x10x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf0x10x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf0x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf9cb6ff120x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf9cb6ff120x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf9cb6ff120x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf9cb6ff12");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf90fb26c20x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf90fb26c20x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf90fb26c2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf90fb26c20x3_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf90fb26c20x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf90fb26c20x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf90fb26c20x20x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf90fb26c20x10x0");
    }

    public DecreaseUnseenEvent(User user, ImapFolder folder, int amount) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf12dea96f_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf12dea96f0x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf12dea96f0x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf12dea96f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfafffdd08_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfafffdd080x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfafffdd080x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfafffdd080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf0x10x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf0x10x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf0x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x30x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x4_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x3_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x10x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf9cb6ff120x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf9cb6ff120x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf9cb6ff120x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf9cb6ff12");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x40x00x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x40x0");
		this.user =user;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x40x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x40x10x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0");
		this.folder = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x40x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55eeae4d0x40x20x0");
		this.amount = amount;
    }

    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfa7336cc50x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfa7336cc5_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfa7336cc50x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfa7336cc50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfa7336cc50x20x0");
		return folder;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfabbd3e690x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfabbd3e690x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfabbd3e690x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfabbd3e69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfabbd3e690x20x0");
		return user;
    }

    public int getAmount() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55faf2540x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55faf254_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55faf2540x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55faf2540x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf55faf2540x20x0");
		return amount;
    }

    @Override
    protected void dispatch(DecreaseUnseenEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a74548");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a745480x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a745480x20x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a745480x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a745480x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a745480x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a745480x30x00x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a745480x30x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cf46a745480x30x00x00x0");
		handler.onDecreaseUnseenEvent(this);

    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<DecreaseUnseenEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfadc165ab0x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfadc165ab0x10x0_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfadc165ab0x2_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfadc165ab0x1_____org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfadc165ab0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_DecreaseUnseenEvent_java0x0f7eb90cfadc165ab0x20x0");
		return TYPE;
    }

}
