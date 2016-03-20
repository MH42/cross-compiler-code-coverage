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
import java.util.List;

import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.activity.ContactPropertiesActivity;
import org.apache.hupa.client.rf.HupaRequestFactory;
import org.apache.hupa.shared.domain.ImapFolder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;

public class ContactPropertiesView extends Composite implements ContactPropertiesActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc278175_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc2781750x30x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc2781750x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc2781750x1_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc2781750x2_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc2781750x3_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0");
	}
	

	@Inject HupaRequestFactory rf;
    @Inject HupaController hc;
    @Inject EventBus eventBus;

    @UiField TextBox name;

    @UiField ListBox parent;
    @UiField Button save;

    @UiField VerticalPanel propContainer;
    @UiField CaptionPanel information;


    ImapFolder folder;

    @UiHandler("save")
    void handleSave(ClickEvent e) {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc4db584");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc4db5840x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc4db5840x10x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc4db5840x2_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7afc4db5840x1");}
    public ContactPropertiesView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7aafffdd08_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7aafffdd080x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7aafffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a5e3a2e410x1_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a5e3a2e410x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a5e3a2e41");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a83dd9d6a0x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a83dd9d6a0x1_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a83dd9d6a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7ad8fd39d00x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7ad8fd39d0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7ad8fd39d00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a13a4a1130x1_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a13a4a1130x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a13a4a113");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a978c9f3f0x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a978c9f3f_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a978c9f3f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a99b14ede_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a99b14ede0x1_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a99b14ede0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a6ae999550x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a6ae999550x1_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a6ae99955");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a0x2_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a0x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a22ee0097_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a22ee00970x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a22ee00970x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7af4123b7a0x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7af4123b7a_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7af4123b7a0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7acf26f69d0x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7acf26f69d_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7acf26f69d0x00x2_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7acf26f69d0x00x1_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7acf26f69d0x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7af4123b7a0x10x00x00x00x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7af4123b7a0x10x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7af4123b7a0x10x00x00x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7af4123b7a0x10x00x0");
		initWidget(binder.createAndBindUi(this));
    }

    interface Binder extends UiBinder<DecoratorPanel, ContactPropertiesView> {
    }

    private static Binder binder = GWT.create(Binder.class);

    @Override
    public void cascade(LabelNode labelNode, List<LabelNode> wholeList, int type) {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x30x00x1_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x5_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x3_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x2_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x40x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x30x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x20x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x4_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x30x00x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a8df13e5b");}

    @Override
    public HasClickHandlers getSave() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a9670c2d40x2_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a9670c2d40x0_____org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a9670c2d40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a9670c2d4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_ContactPropertiesView_java0x0f4123b7a9670c2d40x20x0");
		return save;
    }

}
