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
import org.apache.hupa.client.activity.SettingNavActivity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class SettingNavView extends Composite implements SettingNavActivity.Displayable {

    @UiField public Element navLabelsItem;
    @UiField public Anchor labelsAnchor;

    @SuppressWarnings("rawtypes")
    protected UiBinder getBinder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f249cb5e8180x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f249cb5e8180x2_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f249cb5e8180x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f249cb5e818");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f249cb5e8180x20x00x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f249cb5e8180x20x0");
		return GWT.create(Binder.class);
    }

    @SuppressWarnings("unchecked")
    public SettingNavView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24cf26f69d_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24cf26f69d0x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24cf26f69d0x00x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24cf26f69d0x00x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24cf26f69d0x00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f24");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ba84581d0x2_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ba84581d0x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ba84581d0x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ba84581d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f2473835c380x2_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f2473835c380x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f2473835c38_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f2473835c380x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f240x2_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f240x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f240x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x10x00x00x00x10x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x10x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x10x00x00x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x10x00x00x00x10x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x10x00x00x00x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x10x00x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24b7210f240x10x00x00x00x1");
		initWidget((Widget)getBinder().createAndBindUi(this));
    }

    interface Binder extends UiBinder<HTMLPanel, SettingNavView> {
    }

    @Override
    public HasClickHandlers getLabelsAchor() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24297792a6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24297792a60x2_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24297792a60x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24297792a60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24297792a60x20x0");
		return labelsAnchor;
    }

    @Override
    public void singleSelect(int i) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24eb24dc89");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24eb24dc890x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24eb24dc890x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24eb24dc890x3_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24eb24dc890x2_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24eb24dc890x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24eb24dc890x30x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24eb24dc890x30x00x0");
		selectNavLabelItem();
    }

    protected void selectNavLabelItem() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff843_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x2_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x20x00x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x20x00x10x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x20x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x20x00x0");
		String labelClass = navLabelsItem.getAttribute("class");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x20x1_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x20x10x00x0_____org_apache_hupa_client_ui_SettingNavView_java0x0b7210f24ea1ff8430x20x10x0");
		navLabelsItem.setAttribute("class", labelClass + " selected");
    }
}
