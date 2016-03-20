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

public class IncreaseUnseenEvent extends GwtEvent<IncreaseUnseenEventHandler>{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x40x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x30x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x4_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x30x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x40x00x00x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x40x00x00x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x3_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c38_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x40x00x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aede68c380x0");
	}
	

	public final static Type<IncreaseUnseenEventHandler> TYPE = new Type<IncreaseUnseenEventHandler>();
    private User user;
    private ImapFolder folder;
    private int amount;

    public IncreaseUnseenEvent(User user, ImapFolder folder) {
        this(user, folder, 1);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a12dea96f_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a12dea96f0x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a12dea96f0x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a12dea96f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aafffdd080x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aafffdd080x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aafffdd08_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aafffdd080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a0x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a0x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a0x10x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a9cb6ff120x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a9cb6ff120x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a9cb6ff12_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a9cb6ff120x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a3048a2d10x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a3048a2d10x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a3048a2d10x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a3048a2d10x3_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a3048a2d1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a3048a2d10x20x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a3048a2d10x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a3048a2d10x10x0");
    }

    public IncreaseUnseenEvent(User user, ImapFolder folder, int amount) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a12dea96f_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a12dea96f0x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a12dea96f0x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a12dea96f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aafffdd080x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aafffdd080x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aafffdd08_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aafffdd080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a0x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a0x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a0x10x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d10_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x10x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x20x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x4_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x30x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a9cb6ff120x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a9cb6ff120x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a9cb6ff12_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a9cb6ff120x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x40x00x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x40x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x0");
		this.user =user;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x40x10x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x40x1");
		this.folder = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x40x20x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980ae7c91d100x40x2");
		this.amount = amount;
    }

    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aa7336cc5_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aa7336cc50x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aa7336cc50x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aa7336cc50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aa7336cc50x20x0");
		return folder;
    }

    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aabbd3e69_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aabbd3e690x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aabbd3e690x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aabbd3e690x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aabbd3e690x20x0");
		return user;
    }

    public int getAmount() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a55faf254_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a55faf2540x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a55faf2540x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a55faf2540x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a55faf2540x20x0");
		return amount;
    }

    @Override
    protected void dispatch(IncreaseUnseenEventHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a8043");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a80430x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a80430x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a80430x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a80430x3_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a80430x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a80430x30x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a80430x30x00x00x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980a836a80430x30x00x0");
		handler.onIncreaseUnseenEvent(this);

    }

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<IncreaseUnseenEventHandler> getAssociatedType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aadc165ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aadc165ab0x2_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aadc165ab0x10x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aadc165ab0x10x1_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aadc165ab0x0_____org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aadc165ab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_events_IncreaseUnseenEvent_java0x014ee980aadc165ab0x20x0");
		return TYPE;
    }

}
