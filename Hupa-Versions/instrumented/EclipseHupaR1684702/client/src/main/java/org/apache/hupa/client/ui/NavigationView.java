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
import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.activity.NavigationActivity;
import org.apache.hupa.client.place.FolderPlace;
import org.apache.hupa.client.place.SettingPlace;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;

public class NavigationView extends Composite implements NavigationActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71b67450960x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71b67450960x3_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71b67450960x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71b67450960x2_____org_apache_hupa_client_ui_NavigationView_java0x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71b67450960x30x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71b6745096");
	}
	

	@Inject PlaceController placeController;
    @UiField Anchor mail;
    @UiField Anchor setting;
    @UiField SimplePanel mailOuter;
    @UiField SimplePanel settingOuter;

    @UiField Style style;

    interface Style extends CssResource {
        String selected();
        String settingsInnerSelected();
        String mailInnerSelected();
        String contactInnerSelected();
    }

    public NavigationView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f716f204f710x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f716f204f71_____org_apache_hupa_client_ui_NavigationView_java0x06f204f716f204f710x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7126ec8d000x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7126ec8d00_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7126ec8d000x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7199a0efc60x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7199a0efc6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71125435ba0x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71125435ba_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71125435ba0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71d6df1ab70x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71d6df1ab7_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71d6df1ab70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71695098ae_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71695098ae0x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71695098ae0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f710x2_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71_____org_apache_hupa_client_ui_NavigationView_java0x06f204f710x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f710x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f711d6e1cf70x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f711d6e1cf7_____org_apache_hupa_client_ui_NavigationView_java0x06f204f711d6e1cf70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71c69e1081_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c69e10810x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c69e10810x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71869f71af0x00x2_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71869f71af0x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71869f71af_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71869f71af0x00x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71869f71af0x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f716f204f710x10x00x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f716f204f710x10x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f716f204f710x10x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f716f204f710x10x00x00x00x0");
		initWidget(binder.createAndBindUi(this));
    }

    @UiHandler("mail")
    public void onMailClick(ClickEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7193752323");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x2_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x3_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x30x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x30x0");
		select(1);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x30x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x30x10x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x30x10x00x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x30x10x00x00x10x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x30x10x00x00x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71937523230x30x10x00x0");
		placeController.goTo(new FolderPlace(HupaController.user.getSettings().getInboxFolderName()));
    }

    @UiHandler("setting")
    public void onSettingClick(ClickEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d152");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x2_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x20x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x30x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x30x0");
		select(2);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x30x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x30x10x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x30x10x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f71c161d1520x30x10x00x00x0");
		placeController.goTo(new SettingPlace("labels"));
    }

    interface NavigationUiBinder extends UiBinder<DockLayoutPanel, NavigationView> {
    }

    private static NavigationUiBinder binder = GWT.create(NavigationUiBinder.class);

    @Override
    public void select(int idx) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x3_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x20x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x0");
		switch (idx) {
        case 2:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x0");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x1_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x10x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x10x0");
			mailOuter.removeStyleName(style.selected());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x2_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x20x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x20x0");
			mail.removeStyleName(style.mailInnerSelected());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x30x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x3_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x30x0");
			settingOuter.addStyleName(style.selected());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x40x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x4_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x40x0");
			setting.addStyleName(style.settingsInnerSelected());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x5");
			break;
        default:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x6");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x70x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x7_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x70x00x0");
			mailOuter.addStyleName(style.selected());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x8_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x80x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x80x0");
			mail.addStyleName(style.mailInnerSelected());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x90x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x90x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00x9");
			settingOuter.removeStyleName(style.selected());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00xa_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00xa0x00x0_____org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00xa0x0");
			setting.removeStyleName(style.settingsInnerSelected());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NavigationView_java0x06f204f7191a01c8b0x30x00xb");
			break;
        }
    }

}
