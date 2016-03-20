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
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SplitLayoutPanel;

public class _CenterPanel extends Composite {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd493dbac0x2_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd493dbac_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd493dbac0x30x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd493dbac0x3_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd493dbac0x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd493dbac0x0");
	}
	

	@UiField protected SplitLayoutPanel thisPanel;
    @UiField protected __OutlinePanel outlinePanel;
    @UiField protected __ContentPanel contentPanel;

    public _CenterPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d9ebcf8a9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d99a54f500x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d99a54f500x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d99a54f500x2_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d99a54f50");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d0x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d8a4e17c20x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d8a4e17c20x2_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d8a4e17c20x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d8a4e17c2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d6ac0cb4d0x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d6ac0cb4d0x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d6ac0cb4d_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d6ac0cb4d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d0x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d0x10x00x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d0x10x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d0x10x00x00x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d0x10x00x00x00x0");
		initWidget(binder.createAndBindUi(this));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d0x10x10x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dd200b98d0x10x1");
		thisPanel.setWidgetMinSize(outlinePanel, 144);
    }

    public AcceptsOneWidget getFolderListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d7faa6bf00x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d7faa6bf0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d7faa6bf00x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d7faa6bf00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d7faa6bf00x20x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98d7faa6bf00x20x00x0");
		return outlinePanel.getFolderListView();
    }

    public AcceptsOneWidget getMessageListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98de9fa38f50x2_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98de9fa38f50x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98de9fa38f50x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98de9fa38f5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98de9fa38f50x20x00x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98de9fa38f50x20x0");
		return contentPanel.getMessageListView();
    }

    public AcceptsOneWidget getMessageListFooterView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dfa15814b_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dfa15814b0x2_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dfa15814b0x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dfa15814b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dfa15814b0x20x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dfa15814b0x20x00x0");
		return contentPanel.getMessageListFooterView();
    }

    public AcceptsOneWidget getMessageContentView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98ddc2dc0bd0x2_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98ddc2dc0bd0x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98ddc2dc0bd_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98ddc2dc0bd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98ddc2dc0bd0x20x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98ddc2dc0bd0x20x00x0");
		return contentPanel.getMessageContentView();
    }

    public AcceptsOneWidget getStatusView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dcb3ba731_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dcb3ba7310x1_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dcb3ba7310x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dcb3ba7310x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dcb3ba7310x20x0_____org_apache_hupa_client_ui__CenterPanel_java0x0d200b98dcb3ba7310x20x00x0");
		return contentPanel.getStatusView();
    }

    interface _CenterPanelUiBinder extends
            UiBinder<SplitLayoutPanel, _CenterPanel> {
    }

    private static _CenterPanelUiBinder binder = GWT
            .create(_CenterPanelUiBinder.class);

}
