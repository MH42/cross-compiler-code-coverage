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
import com.google.gwt.query.client.GQuery;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class HupaLayout implements HupaLayoutable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd21348c250x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd21348c250x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd21348c25_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd21348c250x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd21348c250x4_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd21348c250x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd47665d3f_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd47665d3f0x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd47665d3f0x4_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd47665d3f0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd47665d3f0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd47665d3f0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb94f3ffe0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb94f3ffe_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb94f3ffe0x4_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb94f3ffe0x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb94f3ffe0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb94f3ffe0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dda99cb009_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dda99cb0090x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dda99cb0090x4_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dda99cb0090x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dda99cb0090x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dda99cb0090x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc4b4aaef");
	}
	

	/*
     * The flag of layout can be defined as any single bit. such as: 0b0001
     * 0b0010 0b0100, namely, 0x01 0x02 0x04 respectively
     */
    public static final int LAYOUT_MESSAGE = 0x01;
    public static final int LAYOUT_COMPOSE = 0x02;
    public static final int LAYOUT_CONTACT = 0x04;
    public static final int LAYOUT_SETTING = 0x08;

    @UiField public SimplePanel topBarContainer;
    @UiField public SimplePanel logoContainer;
    @UiField public SimplePanel notificationContainer;
    @UiField public SimpleLayoutPanel navigationContainer;
    @UiField public _ToolPanel toolPanel;

    @UiField public LayoutPanel mainBox;

    @UiField public _CenterPanel centerPanel;
    @UiField public _CenterComposePanel composePanel;
    @UiField public _CenterSettingPanel settingPanel;
    @UiField public _CenterContactPanel contactPanel;

    protected LayoutPanel hupaMainPanel;

    interface HupaLayoutUiBinder extends UiBinder<LayoutPanel, HupaLayout> {
    }

    @SuppressWarnings("rawtypes")
    protected static UiBinder binder;

    @SuppressWarnings("unchecked")
    public HupaLayout() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf3874b610x00x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf3874b61_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf3874b610x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf3874b610x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf3874b610x00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd8261f6e70x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd8261f6e70x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd8261f6e70x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd8261f6e7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf74bdc1a_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf74bdc1a0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf74bdc1a0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf74bdc1a0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc873d3130x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc873d3130x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc873d313_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc873d3130x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf5bcea1c_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf5bcea1c0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf5bcea1c0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf5bcea1c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcd02d3460x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcd02d3460x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcd02d346_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcd02d3460x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddef1498eb0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddef1498eb0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddef1498eb_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddef1498eb0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd54123f2c_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd54123f2c0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd54123f2c0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd54123f2c0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6e70eab20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6e70eab2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6e70eab20x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6e70eab20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7b189791_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7b1897910x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7b1897910x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7b1897910x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd8cea9b600x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd8cea9b600x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd8cea9b600x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd8cea9b60");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd597e979b0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd597e979b0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd597e979b0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd597e979b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x10x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x10x0");
		initBinder();
       InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x10x10x00x00x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x10x10x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x10x10x00x00x10x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x10x10x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x10x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf4c185dd0x10x10x00x0");
	hupaMainPanel = (LayoutPanel) binder.createAndBindUi(this);
    }

    protected void initBinder() {
       InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd601026630x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd601026630x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd601026630x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd60102663");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd601026630x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd601026630x20x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd601026630x20x0");
	binder = GWT.create(HupaLayoutUiBinder.class);
    }

    @Override
    public LayoutPanel get() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd783923e50x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd783923e50x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd783923e50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd783923e5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd783923e50x20x0");
		return hupaMainPanel;
    }

    @Override
    public void switchTo(int layout) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde01eedc0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde01eedc00x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde01eedc00x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde01eedc00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde01eedc00x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde01eedc00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde01eedc00x30x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde01eedc00x30x0");
		arrangeLayout(layout);
    }

    @Override
    public AcceptsOneWidget getTopBarView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf88450x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf88450x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf88450x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf88450x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb77be6a10x20x00x00x199bf88450x30x0");
				topBarContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    @Override
    public AcceptsOneWidget getLogoView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf88450x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf88450x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf88450x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf88450x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddf2869bfb0x20x00x00x199bf88450x30x00x0");
				logoContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    @Override
    public AcceptsOneWidget getNotificationView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c182221");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x1");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf88450x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf88450x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf88450x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf88450x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd3c1822210x20x00x00x199bf88450x30x0");
				notificationContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }
    @Override
    public AcceptsOneWidget getNavigationView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf88450x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf88450x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf88450x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd205484ea0x20x00x00x199bf88450x30x0");
				navigationContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    @Override
    public AcceptsOneWidget getToolBarView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddd18cd583");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddd18cd5830x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddd18cd5830x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddd18cd5830x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddd18cd5830x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddd18cd5830x20x0");
		return toolPanel.getToolBarView();
    }

    @Override
    public AcceptsOneWidget getComposeView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2b3eb7580x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2b3eb7580x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2b3eb7580x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2b3eb758");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2b3eb7580x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2b3eb7580x20x00x0");
		return composePanel.getComposeView();
    }

    @Override
    public AcceptsOneWidget getComposeToolBarView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddec0cf97a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddec0cf97a0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddec0cf97a0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddec0cf97a0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddec0cf97a0x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddec0cf97a0x20x0");
		return toolPanel.getComposeToolBarView();
    }

    @Override
    public AcceptsOneWidget getSearchBoxView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6287fd390x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6287fd390x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6287fd390x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6287fd39");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6287fd390x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd6287fd390x20x0");
		return toolPanel.getSearchBoxView();
    }
    @Override
    public AcceptsOneWidget getFolderListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7faa6bf00x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7faa6bf00x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7faa6bf00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7faa6bf0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7faa6bf00x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7faa6bf00x20x0");
		return centerPanel.getFolderListView();
    }
    @Override
    public AcceptsOneWidget getAddressListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee0a0ac10x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee0a0ac10x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee0a0ac10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee0a0ac1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee0a0ac10x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee0a0ac10x20x0");
		return composePanel.getAddressListView();
    }

    @Override
    public AcceptsOneWidget getMessageListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde9fa38f50x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde9fa38f50x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde9fa38f50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde9fa38f5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde9fa38f50x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dde9fa38f50x20x0");
		return centerPanel.getMessageListView();
    }

    @Override
    public AcceptsOneWidget getMessageListFooterView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddfa15814b0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddfa15814b0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddfa15814b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddfa15814b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddfa15814b0x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddfa15814b0x20x0");
		return centerPanel.getMessageListFooterView();
    }

    @Override
    public AcceptsOneWidget getMessageContentView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dddc2dc0bd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dddc2dc0bd0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dddc2dc0bd0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dddc2dc0bd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dddc2dc0bd0x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dddc2dc0bd0x20x00x0");
		return centerPanel.getMessageContentView();
    }

    @Override
    public AcceptsOneWidget getStatusView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcb3ba731");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcb3ba7310x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcb3ba7310x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcb3ba7310x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcb3ba7310x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddcb3ba7310x20x00x0");
		return centerPanel.getStatusView();
    }

    @Override
    public AcceptsOneWidget getLabelListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb649654a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb649654a0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb649654a0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb649654a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb649654a0x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddb649654a0x20x0");
		return settingPanel.getLabelListView();
    }

    @Override
    public AcceptsOneWidget getSettingNavView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd141594cd0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd141594cd0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd141594cd0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd141594cd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd141594cd0x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd141594cd0x20x0");
		return settingPanel.getSettingNavView();
    }

    @Override
    public AcceptsOneWidget getLabelPropertiesView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddeb835dfe0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddeb835dfe0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddeb835dfe0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddeb835dfe");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddeb835dfe0x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddeb835dfe0x20x0");
		return settingPanel.getLabelPropertiesView();
    }

    @Override
    public AcceptsOneWidget getContactsListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee312c35");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee312c350x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee312c350x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee312c350x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee312c350x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddee312c350x20x00x0");
		return contactPanel.getContactListView();
    }

    @Override
    public AcceptsOneWidget getContactPropertiesView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc2718570");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc27185700x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc27185700x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc27185700x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc27185700x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185ddc27185700x20x0");
		return contactPanel.getContactPropertiesView();
    }

    private void arrangeLayout(int lyt) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b057_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x00x00x0");
		GQuery.console.log("HupaLayout arrangeLayout " + lyt);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x10x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x1");
		toolPanel.toggleTo(lyt);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x20x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x20x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x2");
		mainBox.setWidgetVisible(contactPanel, lyt == LAYOUT_CONTACT);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x30x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x30x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x3");
		mainBox.setWidgetVisible(settingPanel, lyt == LAYOUT_SETTING);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x40x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x40x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x4");
		mainBox.setWidgetVisible(composePanel, lyt == LAYOUT_COMPOSE);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x50x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x5_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd7db0b0570x30x50x00x0");
		mainBox.setWidgetVisible(centerPanel, lyt == LAYOUT_MESSAGE);
    }

    @Override
    public void arrangeSettingLayout(SettingPlace sp) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x2_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x3_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x30x00x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x30x0_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x30x00x00x0");
		GQuery.console.log("HupaLayout arrangeSettingLayout " + sp);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x30x1_____org_apache_hupa_client_ui_HupaLayout_java0x0f4c185dd2934af3a0x30x10x0");
		settingPanel.swithTo(sp);
    }

}
