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
import org.apache.hupa.client.activity.MessageListFooterActivity;
import org.apache.hupa.client.rf.HupaRequestFactory;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;

public class MessageListFooterView extends Composite implements MessageListFooterActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd8a826a0x2_____org_apache_hupa_client_ui_MessageListFooterView_java0x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd8a826a0x30x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd8a826a0x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd8a826a_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd8a826a0x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd8a826a0x3");
	}
	

	@UiField(provided = true) SimplePager simplePager;

    @UiField ListBox labels;
    @UiField SimplePanel labelsPanel;

    @Inject
    public MessageListFooterView(final MessagesCellTable table, final HupaRequestFactory rf) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41605eabfd_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41605eabfd0x00x2_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41605eabfd0x00x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41605eabfd0x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41605eabfd0x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x10x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x2_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x20x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x20x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x3_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x10x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d65");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41c7775e920x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41c7775e920x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41c7775e92");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd0e3beb_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd0e3beb0x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41cd0e3beb0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee410x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee410x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee410x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41748f209f_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41748f209f0x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41748f209f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x00x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x00x10x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x00x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x0");
		SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x1_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x10x00x00x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x10x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x10x00x0");
		simplePager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x2_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x20x0");
		simplePager.setDisplay(table);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x30x00x00x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x30x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x3_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x30x00x0");
		// simplePager.setRangeLimited(false);
        initWidget(binder.createAndBindUi(this));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x40x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee4192412d650x30x4");
		// FIXME: make it work
        labels.setVisible(false);
    }

    interface MessageListFooterUiBinder extends UiBinder<HorizontalPanel, MessageListFooterView> {
    }

    private static MessageListFooterUiBinder binder = GWT.create(MessageListFooterUiBinder.class);

    @Override
    public SimplePager getPager() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee418f7c39b1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee418f7c39b10x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee418f7c39b10x2_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee418f7c39b10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee418f7c39b10x20x0");
		return simplePager;
    }

    @Override
    public HasVisibility getLabelsPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41b41cf7db0x2_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41b41cf7db0x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41b41cf7db0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41b41cf7db");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41b41cf7db0x20x0");
		return labelsPanel;
    }

    @Override
    public ListBox getLabels() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41de4e78dd0x0_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41de4e78dd0x2_____org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41de4e78dd0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41de4e78dd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListFooterView_java0x06212ee41de4e78dd0x20x0");
		return labels;
    }

}
