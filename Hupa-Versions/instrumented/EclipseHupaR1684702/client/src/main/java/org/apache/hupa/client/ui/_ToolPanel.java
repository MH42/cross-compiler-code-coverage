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
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class _ToolPanel extends Composite {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c7fb9b4e20x30x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c7fb9b4e2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c7fb9b4e20x0_____org_apache_hupa_client_ui__ToolPanel_java0x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c7fb9b4e20x3_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c7fb9b4e20x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c7fb9b4e20x2");
	}
	

	@UiField protected DockLayoutPanel thisPanel;
    @UiField protected SimplePanel toolBarContainer;
    @UiField protected SimplePanel composeToolBarContainer;
    @UiField protected SimplePanel searchBoxContainer;

    public _ToolPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cdf355ef3_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cdf355ef30x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cdf355ef30x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cdf355ef30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cb62251e20x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cb62251e2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cb62251e20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cb62251e20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c53fbee0c0x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c53fbee0c0x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c53fbee0c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c0x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c4c9dc8910x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c4c9dc8910x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c4c9dc8910x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c4c9dc891");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c99a54f500x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c99a54f500x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c99a54f50_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c99a54f500x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c508354ab0x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c508354ab0x00x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c508354ab0x00x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c508354ab0x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c508354ab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c53fbee0c0x10x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c53fbee0c0x10x00x00x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c53fbee0c0x10x00x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c53fbee0c0x10x00x0");
		initWidget(binder.createAndBindUi(this));
    }

    public void toggleTo(int layout) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x3_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x0");
		switch (layout) {
        case HupaLayout.LAYOUT_MESSAGE:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x0");
            this.toggleToCompose(false);InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x10x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x10x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x1");
			break;
        case HupaLayout.LAYOUT_COMPOSE:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x3");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x40x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x4_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x5_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x40x0");
			this.toggleToCompose(true);break;
            //TODO compose button should be shown when setting
        default:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x6");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x7_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c5d3ff11c0x30x00x70x0");
			hideAll();
        }
    }

    private void hideAll() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x20x00x0");
		thisPanel.setWidgetHidden(toolBarContainer, true);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x20x10x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x20x1");
		thisPanel.setWidgetHidden(searchBoxContainer, true);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x20x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cab4b989c0x20x20x0");
		thisPanel.setWidgetHidden(composeToolBarContainer, true);
    }

    protected void toggleToCompose(boolean visible) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x3_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d766_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x30x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x30x00x0");
		thisPanel.setWidgetHidden(toolBarContainer, visible);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x30x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x30x10x0");
		thisPanel.setWidgetHidden(searchBoxContainer, visible);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x30x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x30x20x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c2510d7660x30x2");
		thisPanel.setWidgetHidden(composeToolBarContainer, !visible);
    }

    public AcceptsOneWidget getToolBarView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd583_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf88450x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf88450x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf88450x3_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf88450x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cd18cd5830x20x00x00x199bf88450x30x00x0");
				toolBarContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    public AcceptsOneWidget getComposeToolBarView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf88450x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf88450x3_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf88450x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0cec0cf97a0x20x00x00x199bf88450x30x00x0");
				composeToolBarContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    public AcceptsOneWidget getSearchBoxView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd39_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf88450x3_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf88450x2_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf88450x1_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf88450x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui__ToolPanel_java0x053fbee0c6287fd390x20x00x00x199bf88450x30x00x0");
				searchBoxContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    interface _ToolPanelUiBinder extends UiBinder<DockLayoutPanel, _ToolPanel> {
    }

    private static _ToolPanelUiBinder binder = GWT.create(_ToolPanelUiBinder.class);

}
