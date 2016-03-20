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

package org.apache.hupa.client.ui;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.activity.ComposeToolBarActivity;
import org.apache.hupa.shared.events.SendClickEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ComposeToolBarView extends Composite implements ComposeToolBarActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaabc4b4aaef");
	}
	

	@Inject protected EventBus eventBus;

    @UiField public Anchor send;
    @UiField public Anchor cancel;

    @UiHandler("cancel")
    public void handleClickCancel(ClickEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab87c600890x20x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab87c600890x3_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab87c600890x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab87c600890x1_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab87c600890x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab87c60089");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab87c600890x30x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab87c600890x30x00x0");
		History.back();
    }

    @UiHandler("send")
    public void handleClickSend(ClickEvent e) {
       InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x2_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x1_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x3_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x30x00x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x30x00x00x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x30x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab51b0feb70x30x00x00x00x0");
	eventBus.fireEvent(new SendClickEvent());
    }

    @Override
    public HasClickHandlers getSendClick() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab2847deea");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab2847deea0x1_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab2847deea0x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab2847deea0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab2847deea0x20x0");
		return send;
    }

    interface ComposeToolBarUiBinder extends UiBinder<HorizontalPanel, ComposeToolBarView> {
    }

    @SuppressWarnings("rawtypes")
    private static UiBinder binder;

    @SuppressWarnings("rawtypes")
    protected UiBinder initBinder() {
      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab60102663");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab601026630x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab601026630x2_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab601026630x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab601026630x20x00x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab601026630x20x0");
	return  GWT.create(ComposeToolBarUiBinder.class);
    }

    @SuppressWarnings("unchecked")
    public ComposeToolBarView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab562b101c0x00x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab562b101c0x00x2_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab562b101c0x00x1_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab562b101c_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab562b101c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab4fd0653c0x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab4fd0653c_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab4fd0653c0x2_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab4fd0653c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab99b14ede0x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab99b14ede0x1_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab99b14ede0x2_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab99b14ede");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab37ed539c0x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab37ed539c0x2_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab37ed539c_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab37ed539c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab0x2_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab0x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x00x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x00x00x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x0");
		binder = initBinder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x10x00x00x10x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x1_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x10x00x00x1_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x10x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x10x00x00x0_____org_apache_hupa_client_ui_ComposeToolBarView_java0x03e86aaab3e86aaab0x10x10x00x0");
		initWidget((Widget)binder.createAndBindUi(this));
    }

}
