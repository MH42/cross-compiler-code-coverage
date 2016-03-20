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
import gwtupload.client.IUploadStatus.Status;
import gwtupload.client.IUploader;
import gwtupload.client.IUploader.OnCancelUploaderHandler;
import gwtupload.client.IUploader.OnFinishUploaderHandler;
import gwtupload.client.IUploader.OnStatusChangedHandler;
import gwtupload.client.IUploader.UploadedInfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.place.ComposePlace;
import org.apache.hupa.client.rf.SendForwardMessageRequest;
import org.apache.hupa.client.rf.SendMessageRequest;
import org.apache.hupa.client.rf.SendReplyMessageRequest;
import org.apache.hupa.client.validation.EmailListValidator;
import org.apache.hupa.shared.Util;
import org.apache.hupa.shared.data.MessageAttachmentImpl;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.Message;
import org.apache.hupa.shared.domain.MessageAttachment;
import org.apache.hupa.shared.domain.MessageDetails;
import org.apache.hupa.shared.domain.SendForwardMessageAction;
import org.apache.hupa.shared.domain.SendMessageAction;
import org.apache.hupa.shared.domain.SendReplyMessageAction;
import org.apache.hupa.shared.domain.SmtpMessage;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.events.AddressClickEvent;
import org.apache.hupa.shared.events.AddressClickEventHandler;
import org.apache.hupa.shared.events.AttachClickEvent;
import org.apache.hupa.shared.events.AttachClickEventHandler;
import org.apache.hupa.shared.events.LoginEvent;
import org.apache.hupa.shared.events.LoginEventHandler;
import org.apache.hupa.shared.events.MailToEvent;
import org.apache.hupa.shared.events.MailToEventHandler;
import org.apache.hupa.shared.events.SendClickEvent;
import org.apache.hupa.shared.events.SendClickEventHandler;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.storage.client.Storage;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.RequestContext;

public class ComposeActivity extends AppBaseActivity {
    public ComposeActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b12dea96f0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b12dea96f0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b12dea96f0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b12dea96f");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9da8f1fa0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9da8f1fa_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9da8f1fa0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9da8f1fa0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b16ad05bc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b16ad05bc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b16ad05bc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b16ad05bc");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b59b189070x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b59b189070x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b59b18907_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b59b189070x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x20x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x30x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b556532a40x30x00x00x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b520398cc_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b520398cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b520398cc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b520398cc0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e53_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad49549_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f3");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7baac51d7d0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7baac51d7d_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7baac51d7d0x1");
	}
	

	@Inject private Displayable display;
    @Inject private HupaController hupaController;
    private final List<MessageAttachment> attachments = new ArrayList<MessageAttachment>();
    protected ComposePlace place;
    private User user;
    private boolean sending;

    public Activity with(ComposePlace place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d7_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x30x00x0");
		this.place = place;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x30x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bfae394d70x30x10x0");
		return this;
    }

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x40x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x40x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x40x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x40x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x40x10x0");
		bindTo(eventBus);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x40x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7babdb942c0x40x20x0");
		fillHeader();
    }

    @Override
    public String mayStop() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x20x0");
		super.mayStop();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x20x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x20x10x0");
		if (noContent()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x20x10x10x0");
			return null;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf653745f0x20x2");
		return null;
        // return "Do you want to leave this page?"; TODO
    }

    @Override
    public void onStop() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bd2e0f1d90x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bd2e0f1d90x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bd2e0f1d90x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bd2e0f1d9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bd2e0f1d90x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bd2e0f1d90x20x0");
		super.onStop();
    }

    private boolean noContent() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf3767712_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x20x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x20x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x20x00x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x20x00x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x20x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf37677120x20x00x00x0");
		return "".equals(display.getMessage().getText()) && "".equals(display.getSubject().getText());
    }

    @Override
    public void onCancel() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b994124b60x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b994124b60x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b994124b60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b994124b6");

    }

    protected void fillHeader() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae5_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x00x00x0");
		if (place == null || place.getParameters() == null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x00x10x0");
			return;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x1");
		if (user == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x10x10x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x10x10x00x0");
			user = place.getParameters().getUser();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x20x0");
		if (user == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x20x10x00x0");
			user = HupaController.user;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x30x00x1");
		display.getFromList().addItem(user.getName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x40x00x0");
		display.getUploader().reset();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x5_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x00x0");
		if ("new".equals(place.getToken())) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x00x0");
			display.getTo().setText("");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x10x00x0");
			display.getCc().setText("");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x2");
			display.getBcc().setText("");
            if(place.getSubject() == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x30x00x10x1");
			if(!(place.getSubject() == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x30x00x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x30x00x1");
			display.getSubject().setText(place.getSubject() == null ? "" : place.getSubject());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x40x00x1");
			if(!(place.getBody() == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x40x00x10x2");
			if(place.getBody() == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x40x00x10x1");
			display.getMessageHTML().setHTML(place.getBody() == null ? "" : place.getBody());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x5_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x50x0");
			attachments.clear();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x50x10x6");
			return;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x60x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x60x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x60x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x6_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x60x10x0");
		Message oldMessage = place.getParameters().getOldmessage();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x70x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x70x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x7");
		display.getMessageHTML().setHTML(
                wrapMessage(oldMessage, place.getParameters().getOldDetails(), place.getToken()));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x8_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x00x0");
		if ("forward".equals(place.getToken())) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x1");
			if(!(oldMessage.getSubject() != null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x00x10x00x2");
			if(oldMessage.getSubject() != null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x00x10x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x00x10x0");
			String subject = oldMessage.getSubject() != null ? oldMessage.getSubject().trim() : "";
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x10x00x0");
			if (!subject.toLowerCase().startsWith("fwd:")) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x10x10x00x00x0");
				subject = "Fwd: " + subject;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x10x2");
			display.getSubject().setText(subject);
        } else if ("reply".equals(place.getToken()) || "replyAll".equals(place.getToken())) {

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x00x10x0");
			if(oldMessage.getSubject() != null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x00x10x00x1");
			if(!(oldMessage.getSubject() != null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x00x10x00x2");
			String subject = oldMessage.getSubject() != null ? oldMessage.getSubject().trim() : "";
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x10x00x00x0");
			if (!subject.toLowerCase().startsWith("re:")) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x10x10x00x00x0");
				subject = "Re: " + subject;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x2");
			if ("reply".equals(place.getToken())) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x0");
				display.getSubject().setText(subject);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x00x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x00x00x0");
				if (oldMessage.getReplyto() != null && !oldMessage.getFrom().contains(oldMessage.getReplyto())) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x10x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x10x00x00x0");
					display.getTo().setText(oldMessage.getReplyto());
                } else {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x20x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x20x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x10x10x20x00x0");
					display.getTo().setText(oldMessage.getFrom());
                }
            } else if ("replyAll".equals(place.getToken())) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x00x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x00x10x00x00x1");
				ArrayList<String> list = new ArrayList<String>();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x00x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x00x10x00x0");
				if (oldMessage.getReplyto() != null && !oldMessage.getFrom().contains(oldMessage.getReplyto())) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x10x10x00x00x0");
					list.add(oldMessage.getReplyto());
				}
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x20x0");
				if (oldMessage.getTo() != null) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x20x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x20x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x20x10x00x0");
					list.addAll(oldMessage.getTo());
				}
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x30x0");
				if (oldMessage.getCc() != null) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x30x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x30x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x30x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x30x10x00x00x0");
					list.addAll(oldMessage.getCc());
				}
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x40x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x40x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x4");
				list = removeEmailFromList(list, user.getName());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x50x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x50x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x5_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x50x00x0");
				display.getCc().setText(Util.listToString(list));
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x60x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x6_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x60x00x0");
				if (oldMessage.getTo() != null) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x60x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x60x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x60x10x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x60x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x60x10x00x0");
					oldMessage.getTo().remove(user.getName());
                }
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x7_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x70x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x70x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b47be2ae50x20x80x20x10x20x20x10x70x00x0");
				display.getTo().setText(oldMessage.getFrom());
            }
        }
    }

    protected ArrayList<String> removeEmailFromList(List<String> list, String email) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x20x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x00x10x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x00x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x00x10x0");
		ArrayList<String> ret = new ArrayList<String>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x10x1");
		String regex = ".*<?\\s*" + email.trim() + "\\s*>?\\s*";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x00x0");
		for (String e : list) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x10x0");
			if (!e.matches(regex)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x20x10x00x10x00x0");
				ret.add(e);
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b527c8ef20x40x3");
		return ret;
    }
    private static String generateHeader(Message message, String type) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x0");
		String ret = "<br>";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x1");
		if (message != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x0");
			if (type.equals("forward")) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x00x0");
				ret += "--------- Forwarded message --------- <br>";
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x10x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x10x00x00x00x00x0");
				ret += "From: " + message.getFrom().replaceAll("<", "&lt;").replaceAll(">", "&gt;") + "<br>";
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x20x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x20x00x0");
				ret += "Date: " + message.getReceivedDate() + "<br>";
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x30x00x00x0");
				ret += "Subject: " + message.getSubject() + "<br>";
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x40x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x40x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x40x10x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x40x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x40x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x40x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x40x10x00x0");
				ArrayList<String> to = new ArrayList<String>();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x50x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x50x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x5");
				to.addAll(message.getTo());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x60x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x60x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x6");
				to.addAll(message.getCc());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x70x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x70x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x70x00x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x7_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x70x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x10x70x00x0");
				ret += "To: " + Util.listToString(to).replaceAll("<", "&lt;").replaceAll(">", "&gt;") + "<br>";
            } else if (type.equals("reply") || type.equals("replyAll")) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x0");
				ret += "On " + message.getReceivedDate();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x10x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x10x00x00x00x00x0");
				ret += ", " + message.getFrom().replaceAll("<", "&lt;").replaceAll(">", "&gt;");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x10x10x00x20x10x2");
				ret += ". wrote:<br>";
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba848ecb00x50x20x0");
		return ret + "<br>";
    }
    public static String wrapMessage(Message message, MessageDetails details, String type) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x50x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x5_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda40_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x6_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x0");
		String ret = "";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x1");
		if (message != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x10x10x00x0");
			ret += generateHeader(message, type);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x00x10x00x0");
		if (details != null && details.getText() != null && details.getText().length() > 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x10x00x0");
			ret += "<blockquote style='border-left: 1px solid rgb(204, 204, 204); margin: 0pt 0pt 0pt 0.8ex; padding-left: 1ex;'>";
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x10x10x00x0");
			ret += details.getText();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x10x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x20x10x20x0");
			ret += "</blockquote>";
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bdefdda400x60x3");
		return ret;
    }
    protected void bindTo(EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x0");
		registerHandler(eventBus.addHandler(AddressClickEvent.TYPE, new AddressClickEventHandler() {
            @Override
            public void onClick(AddressClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x00x0");
				String to = display.getTo().getText();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x00x1");
				if(to != null && to.trim().length() > 0){
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x10x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x10x00x00x10x0");
				display.getTo().setText(to + ";" + event.getEmail());
                }else {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x20x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x00x00x00x00x13242b1ae0x30x10x20x00x00x1");
					display.getTo().setText(event.getEmail());
                }
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x0");
		registerHandler(eventBus.addHandler(SendClickEvent.TYPE, new SendClickEventHandler() {
            @Override
			public void onSendClick(SendClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1bd767506");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1bd7675060x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1bd7675060x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1bd7675060x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1bd7675060x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1bd7675060x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1bd7675060x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10x00x00x00x1bd7675060x30x0");
				send();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x0");
		registerHandler(eventBus.addHandler(LoginEvent.TYPE, new LoginEventHandler() {
            @Override
			public void onLogin(LoginEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f0x30x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x20x00x00x00x15db5302f0x30x0");
				user = event.getUser();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x0");
		registerHandler(eventBus.addHandler(AttachClickEvent.TYPE, new AttachClickEventHandler() {
            @Override
			public void onAttachClick(AttachClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf424440");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x30x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x30x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x30x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x30x00x00x00x1cf4244400x30x00x00x10x1");
				display.getAttachButton().fireEvent(new ClickEvent() {
                });
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x40x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x40x00x00x0");
		registerHandler(display.getSendClick().addClickHandler(sendClickHandler));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x50x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x50x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x50x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x5");
		registerHandler(display.getCancelClick().addClickHandler(cancelClickHandler));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x6_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x0");
		registerHandler(display.getCcClick().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1208950cc0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x60x00x00x10x1208950cc0x30x00x0");
				display.showCc();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x7_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x0");
		registerHandler(display.get_CcClick().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1208950cc0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1208950cc0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x70x00x00x10x1208950cc0x30x0");
				display.hideCc();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x8_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x0");
		registerHandler(display.getBccClick().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1208950cc0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x80x00x00x10x1208950cc0x30x00x0");
				display.showBcc();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x9_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1");
		registerHandler(display.get_BccClick().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1208950cc0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1208950cc0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x90x00x00x10x1208950cc0x30x0");
				display.hideBcc();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa");
		registerHandler(display.getReplyClick().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1208950cc0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xa0x00x00x10x1208950cc0x30x00x0");
				display.showReply();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x0");
		registerHandler(display.get_ReplyClick().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1208950cc0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xb0x00x00x10x1208950cc0x30x00x0");
				display.hideReply();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x0");
		registerHandler(display.getFollowupClick().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1208950cc0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1208950cc0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xc0x00x00x10x1208950cc0x30x0");
				display.showFollowup();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x0");
		registerHandler(display.get_FollowupClick().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1208950cc0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xd0x00x00x10x1208950cc0x30x00x0");
				display.hideFollowup();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xe0x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xe_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xe0x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xe0x0");
		registerHandler(display.getUploader().addOnStatusChangedHandler(onStatusChangedHandler));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xf0x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xf0x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xf_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30xf0x0");
		registerHandler(display.getUploader().addOnFinishUploadHandler(onFinishUploadHandler));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x10_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x100x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x100x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x100x00x0");
		registerHandler(display.getUploader().addOnCancelUploadHandler(onCancelUploadHandler));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x11_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x0");
		registerHandler(eventBus.addHandler(MailToEvent.TYPE, new MailToEventHandler() {
            @Override
            public void onMailTo(MailToEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x30x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x30x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x110x00x00x00x1d97294e20x30x00x0");
				display.getTo().setText(event.getMailto());
            }
        }));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x12_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bbc3fb24b0x30x120x0");
		fillSuggestList();

    }

    private void fillSuggestList() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x00x0");
		// TODO move this to hupaStorage
        Storage contactStore = Storage.getLocalStorageIfSupported();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x0");
		if (contactStore != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x00x0");
			String contactsString = contactStore.getItem(MessageListActivity.CONTACTS_STORE);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x1");
			if (contactsString != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x10x10x00x00x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x10x10x00x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x10x10x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6e793bcc0x20x10x10x10x10x00x0");
				display.fillContactList(contactsString.replace("[", "").replace("]", "").trim().split(","));
            }
        }
    }

    private final OnFinishUploaderHandler onFinishUploadHandler = new OnFinishUploaderHandler() {
        @Override
		public void onFinish(IUploader uploader) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x0");
			if (uploader.getStatus() == Status.SUCCESS) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x0");
				// We use the fileInputName (unique) instead of the fileName so
                // as we
                // can find the item in the registry.
                for (UploadedInfo info : uploader.getServerMessage().getUploadedInfos()) {
                  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x00x10x0");
				MessageAttachment attachment = new MessageAttachmentImpl();
                  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x1");
				attachment.setName(info.getField());
                  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x2");
				attachment.setContentType(info.getCtype());
                  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x3");
				attachment.setSize(info.getSize());
                  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7befc95e530x30x00x1977fedee0x30x00x10x00x20x40x0");
				attachments.add(attachment);
                }
            }
        }
    };

    private final OnStatusChangedHandler onStatusChangedHandler = new OnStatusChangedHandler() {
        @Override
		public void onStatusChanged(IUploader uploader) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x00x10x0");
			Status stat = display.getUploader().getStatus();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x10x00x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bf117551b0x30x00x148cf7c1c0x30x10x00x00x00x0");
			((HasEnabled) display.getSendClick()).setEnabled(stat != Status.INPROGRESS);
        }
    };

    private final OnCancelUploaderHandler onCancelUploadHandler = new OnCancelUploaderHandler() {
        @Override
		public void onCancel(IUploader uploader) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x00x00x1");
			for (Iterator<MessageAttachment> i = attachments.iterator(); i.hasNext();) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x0");
				MessageAttachment attachment = i.next();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x1");
				if (attachment.getName().equals(uploader.getInputName())) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7ba63b5eb00x30x00x1cda7e85e0x30x00x20x10x10x00x0");
					i.remove();
				}
            }
        }
    };

    private final ClickHandler cancelClickHandler = new ClickHandler() {
        @Override
        public void onClick(ClickEvent event) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1208950cc0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1208950cc0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1208950cc0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1208950cc");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1208950cc0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b9ad495490x30x00x1208950cc0x30x0");
			History.back();
        }

    };

    protected ClickHandler sendClickHandler = new ClickHandler() {
        @Override
		public void onClick(ClickEvent event) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1208950cc");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1208950cc0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1208950cc0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1208950cc0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1208950cc0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1208950cc0x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1208950cc0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b6624f9f30x20x00x1208950cc0x30x0");
			send();
        }
    };

    protected void send() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x00x0");
		if (!validate()) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x00x10x0");
			return;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x10x0");
		sending = true;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x20x0");
		hupaController.showTopLoading("Sending...");

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x30x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x30x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x30x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x30x0");
		MessageDetails oldDetails = place.getParameters().getOldDetails();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x4");
		if ("new".equals(place.getToken())) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x00x1");
			SendMessageRequest sendReq = rf.sendMessageRequest();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x10x1");
			SendMessageAction sendAction = sendReq.create(SendMessageAction.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x2");
			sendAction.setMessage(parseMessage(sendReq));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x0");
			sendReq.send(sendAction).fire(new Receiver<GenericResult>() {
                @Override
                public void onSuccess(GenericResult response) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1ca563bd7");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1ca563bd70x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1ca563bd70x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1ca563bd70x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1ca563bd70x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1ca563bd70x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1ca563bd70x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x10x30x00x10x1ca563bd70x30x00x0");
					afterSend(response);
                }
            });
        } else if ("forward".equals(place.getToken())) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x00x0");
			SendForwardMessageRequest req = rf.sendForwardMessageRequest();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x0");
			SendForwardMessageAction action = req.create(SendForwardMessageAction.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x2");
			action.setReferences(oldDetails.getReferences());

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x3");
			action.setMessage(parseMessage(req));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x40x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x40x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x4_____org_apache_hupa_client_activity_ComposeActivity_java0x0");
			ImapFolder f = req.create(ImapFolder.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x50x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x50x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x5_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x50x0");
			f.setFullName(place.getParameters().getFolderName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x60x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x6");
			action.setFolder(f);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x70x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x70x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x70x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x7_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x70x0");
			action.setUid(place.getParameters().getOldmessage().getUid());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x8_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x0");
			req.send(action).fire(new Receiver<GenericResult>() {
                @Override
                public void onSuccess(GenericResult response) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1ca563bd70x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1ca563bd70x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1ca563bd70x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1ca563bd70x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1ca563bd70x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1ca563bd7");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1ca563bd70x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x10x80x00x10x1ca563bd70x30x0");
					afterSend(response);
                }
            });
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x00x0");
			SendReplyMessageRequest replyReq = rf.sendReplyMessageRequest();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x1");
			SendReplyMessageAction action = replyReq.create(SendReplyMessageAction.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x2");
			action.setReferences(oldDetails.getReferences());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x30x00x0");
			action.setMessage(parseMessage(replyReq));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x4_____org_apache_hupa_client_activity_ComposeActivity_java0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x40x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x40x10x0");
			ImapFolder folder = replyReq.create(ImapFolder.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x50x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x50x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x5_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x50x0");
			folder.setFullName(place.getParameters().getFolderName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x60x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x6");
			action.setFolder(folder);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x7_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x70x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x70x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x70x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x70x0");
			action.setUid(place.getParameters().getOldmessage().getUid());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x8_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x00x1");
			replyReq.send(action).fire(new Receiver<GenericResult>() {
                @Override
                public void onSuccess(GenericResult response) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1ca563bd70x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1ca563bd70x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1ca563bd70x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1ca563bd70x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1ca563bd70x20x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1ca563bd7");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1ca563bd70x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b37ed539c0x20x40x20x20x80x00x10x1ca563bd70x30x00x0");
					afterSend(response);
                }
            });
        }
    }
    private boolean validate() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x20x00x00x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x20x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x20x00x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7be204d28a0x20x00x00x00x0");
		// Don't trust only in view validation
        return !sending
                && display.validate() && display.getTo().getText().trim().length() > 0
                && EmailListValidator.isValidAddressList(display.getTo().getText())
                && EmailListValidator.isValidAddressList(display.getCc().getText())
                && EmailListValidator.isValidAddressList(display.getBcc().getText());
    }

    protected SmtpMessage parseMessage(RequestContext rc) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x0");
		SmtpMessage message = rc.create(SmtpMessage.class);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x10x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x10x10x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x10x10x00x0");
		List<MessageAttachment> attaches = new ArrayList<MessageAttachment>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x00x0");
		for (MessageAttachment attach : attachments) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x00x10x0");
			MessageAttachment attachMent = rc.create(MessageAttachment.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x10x0");
			attachMent.setName(attach.getName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x20x0");
			attachMent.setSize(attach.getSize());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x30x0");
			attachMent.setContentType(attach.getContentType());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x20x10x4");
			attaches.add(attachMent);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x30x00x0");
		message.setFrom(display.getFromText());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x40x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x40x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x4_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x40x00x0");
		message.setSubject(display.getSubject().getText());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x50x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x50x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x5_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x50x0");
		message.setText(display.getMessageHTML().getHTML());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x6_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x60x0");
		message.setMessageAttachments(attaches);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x7_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x70x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x70x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x70x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x70x00x00x00x0");
		message.setTo(emailTextToArray(display.getTo().getText()));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x80x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x80x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x80x00x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x8_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x80x00x00x0");
		message.setCc(emailTextToArray(display.getCc().getText()));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x90x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x9_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x90x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x90x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30x90x00x00x00x0");
		message.setBcc(emailTextToArray(display.getBcc().getText()));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bca12cebe0x30xa");
		return message;
    }

    private List<String> emailTextToArray(String emails) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b10949960_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x00x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x00x10x00x00x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x00x10x00x0");
		List<String> cc = new ArrayList<String>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x1");
		for (String ccRaw : emails.split("[,;]+")) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x00x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x00x1");
			String ccRecip = ccRaw.trim();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x10x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x1");
			if (ccRecip.length() > 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x10x10x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x10x10x00x00x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x10x20x10x10x0");
				cc.add(ccRaw.trim());
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7b109499600x30x2");
		return cc;
    }

    private void afterSend(GenericResult response) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x20x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x30x0_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x30x00x0");
		sending = false;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x30x1_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x30x10x0");
		hupaController.hideTopLoading();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x30x2_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x30x20x0");
		hupaController.showNotice("Your mail has been sent.", 10000);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x30x3_____org_apache_hupa_client_activity_ComposeActivity_java0x05a906b7bde2c520e0x30x30x0");
		History.back();
    }

    public interface Displayable extends IsWidget {
        String getFromText();
        void showCc();
        void hideCc();
        void showBcc();
        void hideBcc();
        void showReply();
        void hideReply();
        void showFollowup();
        void hideFollowup();
        HasText getTo();
        HasText getCc();
        HasText getBcc();
        HasText getSubject();
        HasClickHandlers getSendClick();
        HasClickHandlers getCancelClick();
        HasClickHandlers getCcClick();
        HasClickHandlers get_CcClick();
        HasClickHandlers getBccClick();
        HasClickHandlers get_BccClick();
        HasClickHandlers getReplyClick();
        HasClickHandlers get_ReplyClick();
        HasClickHandlers getFollowupClick();
        HasClickHandlers get_FollowupClick();
        boolean validate();
        HasText getMessage();
        HasHTML getMessageHTML();
        ListBox getFromList();
        IUploader getUploader();
        void fillContactList(String[] contacts);
        HasFocusHandlers getAttachButton();
    }
}
