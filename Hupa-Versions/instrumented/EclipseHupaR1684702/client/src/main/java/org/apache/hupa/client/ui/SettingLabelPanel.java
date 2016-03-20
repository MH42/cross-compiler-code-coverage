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

public class SettingLabelPanel extends Composite {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5fc2781750x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5fc278175_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5fc2781750x30x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5fc2781750x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5fc2781750x3_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5fc2781750x2");
	}
	
	@UiField SimpleLayoutPanel labelListContainer;
    @UiField SimpleLayoutPanel labelPropertiesContainer;

    public SettingLabelPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5cf26f69d0x00x2_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5cf26f69d0x00x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5cf26f69d0x00x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5cf26f69d0x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5cf26f69d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5ca9658f50x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5ca9658f5_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5ca9658f50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f50x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5155bda910x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5155bda91_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5155bda910x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f53c41266d0x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f53c41266d0x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f53c41266d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5ca9658f50x10x00x00x00x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5ca9658f50x10x00x00x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5ca9658f50x10x00x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5ca9658f50x10x0");
		initWidget(binder.createAndBindUi(this));
    }

    public AcceptsOneWidget getLabelListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x2_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf88450x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf88450x3_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf88450x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5b649654a0x20x00x00x199bf88450x30x00x0");
				labelListContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    public AcceptsOneWidget getLabelPropertiesView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf88450x3_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf88450x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf88450x2_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf88450x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui_SettingLabelPanel_java0x0ca9658f5eb835dfe0x20x00x00x199bf88450x30x00x0");
				labelPropertiesContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    interface Binder extends UiBinder<SplitLayoutPanel, SettingLabelPanel> {
    }

    private static Binder binder = GWT.create(Binder.class);
}
