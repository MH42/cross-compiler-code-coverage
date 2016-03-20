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

package org.apache.hupa.client.activity;


import tc3.shared.InstrumentationLoggerProvider;
import java.util.List;
import java.util.logging.Logger;

import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.place.ComposePlace;
import org.apache.hupa.client.place.MessagePlace.TokenWrapper;
import org.apache.hupa.client.rf.GetMessageDetailsRequest;
import org.apache.hupa.client.ui.ToolBarView.Parameters;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.domain.GetMessageDetailsAction;
import org.apache.hupa.shared.domain.GetMessageDetailsResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.MailHeader;
import org.apache.hupa.shared.domain.MessageAttachment;
import org.apache.hupa.shared.domain.MessageDetails;
import org.apache.hupa.shared.events.MailToEvent;
import org.apache.hupa.shared.events.MessageViewEvent;
import org.apache.hupa.shared.events.RefreshFoldersEvent;
import org.apache.hupa.shared.events.RefreshFoldersEventHandler;
import org.apache.hupa.shared.events.ShowRawEvent;
import org.apache.hupa.shared.events.ShowRawEventHandler;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

public class MessageContentActivity extends AppBaseActivity {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e599918e_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e599918e0x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e599918e0x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e599918e0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e599918e0x4_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e599918e0x40x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e599918e0x40x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e599918e0x1");
	}
	
	private static final Logger log = Logger.getLogger(MessageContentActivity.class.getName());

    @Inject private Displayable display;
    @Inject private ToolBarActivity.Displayable toolBar;

    private String folder;
    private String uid;
    private MessageDetails details;

    public MessageContentActivity() {
       InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40efce1f400x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40efce1f40_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40efce1f400x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e97116570x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e97116570x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e97116570x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e9711657");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40d86e873f0x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40d86e873f_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40d86e873f0x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40d86e873f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40afffdd08_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40afffdd080x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40afffdd080x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e2577dd70x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e2577dd70x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e2577dd7_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40e2577dd70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4059b189070x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4059b189070x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4059b18907_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4059b189070x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f400x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f400x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40aac51d7d0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40aac51d7d0x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40aac51d7d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40efce1f400x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40efce1f400x10x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40efce1f400x10x00x0");
	exportJSMethods(this);
    }

    @Override
    public void start(AcceptsOneWidget container, final EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x30x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x4_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x00x0");
		bindTo(eventBus);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x1");
		if (isUidSet()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x0");
			hc.showTopLoading("Loading... ");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x1");
			display.clearContent();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x20x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x20x1");
			GetMessageDetailsRequest req = rf.messageDetailsRequest();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x30x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x30x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x30x1");
			GetMessageDetailsAction action = req.create(GetMessageDetailsAction.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x40x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x40x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x40x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x40x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x4");
			final ImapFolder f = req.create(ImapFolder.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x50x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x5");
			f.setFullName(folder);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x60x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x6");
			action.setFolder(f);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x70x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x70x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x7");
			action.setUid(Long.parseLong(uid));

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x80x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x80x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x80x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x8");
			final String id = uid;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x9_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x00x1");
			req.get(action).fire(new Receiver<GetMessageDetailsResult>() {
                @Override
                public void onSuccess(GetMessageDetailsResult response) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x20x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x00x0");
					if (!id.equals(uid)) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x00x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x00x10x0");
						return;
                    }
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x1");
					hc.hideTopLoading();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x20x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x20x00x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x20x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x2");
					eventBus.fireEvent(new MessageViewEvent(response.getMessageDetails()));

                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x30x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x30x0");
					details = response.getMessageDetails();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x40x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x40x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x4");
					display.fillMessageContent(details.getText(), false);

                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x50x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x50x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x5_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x50x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x50x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x50x1");
					List<MessageAttachment> attaches = details.getMessageAttachments();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x60x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x60x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x6_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x60x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x60x00x10x0");
					if (attaches != null && !attaches.isEmpty()) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x60x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x60x10x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x60x10x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x16a619d1b0x30x60x10x0");
						display.setAttachments(attaches, folder, Long.parseLong(uid));
                    }
                }

                @Override
                public void onFailure(ServerFailure error) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac25");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x0");
					hc.hideTopLoading();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x10x0");
					toolBar.enableAllTools(false);
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x2");
					if (error.isFatal()) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x20x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x20x10x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x20x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x10x10x90x00x10x17148ac250x30x20x10x00x00x0");
						hc.showNotice(error.getMessage(), 10000);
                    }
                }
            });
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4087191a1d0x40x20x00x0");
		container.setWidget(display.asWidget());
    }

    private void bindTo(EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x1");
		eventBus.addHandler(ShowRawEvent.TYPE, new ShowRawEventHandler() {
            @Override
            public void onShowRaw(ShowRawEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a7911");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x30x00x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x30x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x30x00x10x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x30x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x30x00x0");
				String message_url = GWT.getModuleBaseURL() + SConsts.SERVLET_SOURCE + "?" + SConsts.PARAM_UID + "="
                        + uid + "&" + SConsts.PARAM_FOLDER + "=" + folder;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x30x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x00x00x00x13f7a79110x30x1");
				Window.open(message_url, "_blank", "");
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x1");
		eventBus.addHandler(RefreshFoldersEvent.TYPE, new RefreshFoldersEventHandler() {
            public void onRefreshEvent(RefreshFoldersEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x188f92188_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x188f921880x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x188f921880x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x188f921880x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x188f921880x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x188f921880x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x188f921880x30x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40bc3fb24b0x30x10x00x00x188f921880x30x00x0");
				display.clearContent();
            }
        });
    }

    private boolean isUidSet() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f402c32a5f30x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f402c32a5f30x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f402c32a5f3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f402c32a5f30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f402c32a5f30x20x00x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f402c32a5f30x20x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f402c32a5f30x20x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f402c32a5f30x20x0");
		return uid != null && uid.matches("\\d+");
    }

    public interface Displayable extends IsWidget {
        void clearContent();
        void setAttachments(List<MessageAttachment> attachements, String folder, long uid);
        HasHTML getMessageHTML();
        void fillMessageContent(String messageDetail, boolean isEditable);
    }

    public Activity with(TokenWrapper tokenWrapper) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd8_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x30x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x30x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x30x0");
		folder = tokenWrapper.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x30x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x30x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x30x10x00x0");
		uid = tokenWrapper.getUid();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x30x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40204dfbd80x30x20x0");
		return this;
    }

    public void openLink(String url) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f408f1fe97f0x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f408f1fe97f0x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f408f1fe97f_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f408f1fe97f0x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f408f1fe97f0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f408f1fe97f0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f408f1fe97f0x30x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f408f1fe97f0x30x0");
		Window.open(url, "_blank", "");
    }

    public void mailTo(String mailto) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x00x00x00x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x00x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x00x00x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x00x00x00x00x0");
		pc.goTo(new ComposePlace("new").with(new Parameters(null, null, null, null)));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x10x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4040ca66ac0x30x10x00x0");
		eventBus.fireEvent(new MailToEvent(mailto));
    }

    private String getHeader(String key) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x2_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x3_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d39514");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x0");
		for (MailHeader h : details.getMailHeaders()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x20x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x20x00x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x20x0");
			if (h.getName().equals(key)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x20x00x10x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x00x20x00x10x0");
				return h.getValue();
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f4084d395140x30x1");
		return null;
    }

    private boolean isSenderMessage() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f31_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x00x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x00x0");
		String from = getHeader("From");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x10x00x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x10x00x00x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x10x00x00x10x0_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x1_____org_apache_hupa_client_activity_MessageContentActivity_java0x0efce1f40ad499f310x20x10x00x00x0");
		return from != null && from.contains(HupaController.user.getName())
              || folder.equals(HupaController.user.getSettings().getSentFolderName());
    }

    protected native void exportJSMethods(MessageContentActivity activity)
    /*-{
       $wnd.openLink = function(url) {
           try {
               activity.@org.apache.hupa.client.activity.MessageContentActivity::openLink(Ljava/lang/String;) (url);
           } catch(e) {}
           return false;
       };
       $wnd.mailTo = function(mail) {
           try {
               activity.@org.apache.hupa.client.activity.MessageContentActivity::mailTo(Ljava/lang/String;) (mail);
           } catch(e) {}
           return false;
       };
   }-*/;
}
