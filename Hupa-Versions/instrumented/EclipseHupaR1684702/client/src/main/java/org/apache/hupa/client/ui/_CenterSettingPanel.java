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
import org.apache.hupa.client.place.SettingPlace;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class _CenterSettingPanel extends Composite {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6c4b4aaef");
	}
	
	@UiField public SplitLayoutPanel thisPanel;

    @UiField public SimpleLayoutPanel settingNavContainer;

    @UiField public SettingLabelPanel settingLabelPanel;

    @UiField public LayoutPanel settingBox;

    @UiField public Style style;

    public interface Style extends CssResource {
    }

    public void arrangeLayout(int lyt) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b057_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x3_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x20x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x30x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x30x00x0");
		settingBox.setWidgetLeftWidth(settingLabelPanel, 0, Unit.PCT, 100, Unit.PCT);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x30x10x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a67db0b0570x30x1");
		settingBox.setWidgetTopHeight(settingLabelPanel, 0, Unit.PCT, 100, Unit.PCT);
    }

    interface _CenterSettingPanelUiBinder extends UiBinder<SplitLayoutPanel, _CenterSettingPanel> {
    }

    @SuppressWarnings("rawtypes")
    protected static UiBinder binder;

    @SuppressWarnings("unchecked")
    public _CenterSettingPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6a9925b06_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6a9925b060x00x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6a9925b060x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6a9925b060x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6a9925b060x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a626ec8d000x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a626ec8d00_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a626ec8d000x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a626ec8d000x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a699a0efc6_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a699a0efc60x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a699a0efc60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a63da619b1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a63da619b10x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a63da619b10x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a63da619b10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6606c536d0x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6606c536d0x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6606c536d0x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6606c536d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a699a54f500x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a699a54f500x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a699a54f50_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a699a54f500x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a692ad3ec0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a692ad3ec00x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a692ad3ec00x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a692ad3ec00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a60x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a687df60dee29879220x10x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a687df60dee29879220x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a687df60dee29879220x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a687df60dee2987922");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a687df60de0x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a687df60de_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a687df60de0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x00x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x00x0");
		binder = createBinder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x10x00x00x10x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x10x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x10x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x10x00x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6367fe3a60x10x10x00x00x1");
		initWidget((SplitLayoutPanel)binder.createAndBindUi(this));
    }

    @SuppressWarnings("rawtypes")
    protected UiBinder createBinder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6c0ed6ddd0x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6c0ed6ddd0x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6c0ed6ddd0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6c0ed6ddd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6c0ed6ddd0x20x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6c0ed6ddd0x20x00x0");
		return GWT.create(_CenterSettingPanelUiBinder.class);
    }

    public interface Resources extends CellList.Resources {

        Resources INSTANCE = GWT.create(Resources.class);

        @Source("res/CssLabelListView.css")
        public CellList.Style cellListStyle();
    }

    public AcceptsOneWidget getLabelListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6b649654a0x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6b649654a0x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6b649654a0x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6b649654a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6b649654a0x20x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6b649654a0x20x00x0");
		return settingLabelPanel.getLabelListView();
    }

    public AcceptsOneWidget getLabelPropertiesView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6eb835dfe0x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6eb835dfe_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6eb835dfe0x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6eb835dfe0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6eb835dfe0x20x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6eb835dfe0x20x0");
		return settingLabelPanel.getLabelPropertiesView();
    }

    public AcceptsOneWidget getSettingNavView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf88450x3_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf88450x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf88450x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a6141594cd0x20x00x00x199bf88450x30x0");
				settingNavContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    public void swithTo(SettingPlace sp) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x20x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x2_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x3_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x1_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x30x00x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x30x00x00x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x30x00x0_____org_apache_hupa_client_ui__CenterSettingPanel_java0x0367fe3a62c0bfb2f0x30x0");
		GQuery.console.log("_CenterSetting... swithTo " + sp + " " + sp.getToken());
    }
}
