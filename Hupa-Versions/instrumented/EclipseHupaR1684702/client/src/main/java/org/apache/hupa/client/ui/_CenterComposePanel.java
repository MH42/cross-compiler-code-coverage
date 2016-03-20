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
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class _CenterComposePanel extends Composite {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ed493dbac0x3_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ed493dbac0x30x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ed493dbac_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ed493dbac0x1_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ed493dbac0x2_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ed493dbac0x0");
	}
	

	@UiField protected SplitLayoutPanel thisPanel;
    @UiField protected __OutlineComposePanel outlinePanel;
    @UiField protected SimpleLayoutPanel composeContainer;

    public _CenterComposePanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e9ebcf8a9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ee26b94700x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ee26b94700x2_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ee26b9470_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034ee26b94700x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e5c73034e_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e5c73034e0x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e5c73034e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e0x1_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e6ac0cb4d0x1_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e6ac0cb4d_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e6ac0cb4d0x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e6ac0cb4d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e99a54f500x1_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e99a54f500x2_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e99a54f500x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e99a54f50");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e5c73034e0x10x00x00x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e5c73034e0x10x00x00x00x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e5c73034e0x10x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e5c73034e0x10x00x0");
		initWidget(binder.createAndBindUi(this));
//        thisPanel.setWidgetHidden(outlinePanel, true);
    }

    public AcceptsOneWidget getAddressListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034eee0a0ac10x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034eee0a0ac10x2_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034eee0a0ac1_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034eee0a0ac10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034eee0a0ac10x20x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034eee0a0ac10x20x00x0");
		return outlinePanel.getAddressListView();
    }


    interface _CenterPanelUiBinder extends
            UiBinder<SplitLayoutPanel, _CenterComposePanel> {
    }

    private static _CenterPanelUiBinder binder = GWT
            .create(_CenterPanelUiBinder.class);


    public AcceptsOneWidget getComposeView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x2_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb758_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x1_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x1_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf88450x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf88450x3_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf88450x1_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf88450x2_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf88450x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui__CenterComposePanel_java0x05c73034e2b3eb7580x20x00x00x199bf88450x30x00x0");
				composeContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

}
