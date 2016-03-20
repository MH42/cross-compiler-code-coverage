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
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class __ContentPanel extends Composite{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d2e3327110x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d2e3327110x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d2e332711_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d2e3327110x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d2e3327110x3_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d2e3327110x30x0");
	}
	

	@UiField SplitLayoutPanel thisPanel;
    @UiField DockLayoutPanel messageListBox;
    @UiField SimpleLayoutPanel messageListContainer;
    @UiField SimplePanel messageListFooterContainer;
    @UiField SimpleLayoutPanel messageContentContainer;
    @UiField SimplePanel statusContainer;

    @UiField HTMLPanel contactBox;

    public __ContentPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d979862b20x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d979862b20x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d979862b2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dbbcf34870x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dbbcf3487_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dbbcf34870x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de1cbffd30x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de1cbffd3_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de1cbffd30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d72297b960x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d72297b96_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d72297b960x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d99a54f50_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d99a54f500x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d99a54f500x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d5df4c73f_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d5df4c73f0x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d5df4c73f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3df39faba3_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3df39faba30x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3df39faba30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d0x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d81174965");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x10x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x10x00x00x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x10x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x10x00x00x0");
		initWidget(binder.createAndBindUi(this));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x10x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x10x10x0");
		thisPanel.setWidgetHidden(contactBox, true);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x10x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3d44fffc3d0x10x20x0");
		thisPanel.setWidgetMinSize(messageListBox, 130);
    }

    public AcceptsOneWidget getMessageListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf88450x3_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf88450x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf88450x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf88450x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf88450x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3de9fa38f50x20x00x00x199bf88450x30x00x0");
				messageListContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    public AcceptsOneWidget getMessageListFooterView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf88450x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf88450x3_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf88450x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dfa15814b0x20x00x00x199bf88450x30x0");
				messageListFooterContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    public AcceptsOneWidget getMessageContentView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf88450x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf88450x3_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf88450x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3ddc2dc0bd0x20x00x00x199bf88450x30x0");
				messageContentContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    public AcceptsOneWidget getStatusView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba731_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf88450x1_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf88450x3_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf88450x2_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf88450x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui___ContentPanel_java0x044fffc3dcb3ba7310x20x00x00x199bf88450x30x00x00x0");
				statusContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    interface __ContentPanelUiBinder extends
            UiBinder<SplitLayoutPanel, __ContentPanel> {
    }

    private static __ContentPanelUiBinder binder = GWT
            .create(__ContentPanelUiBinder.class);

}
