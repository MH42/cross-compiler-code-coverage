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
import org.apache.hupa.client.activity.NotificationActivity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;

public class NotificationView extends Composite implements NotificationActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddc468a3190x30x0_____org_apache_hupa_client_ui_NotificationView_java0x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddc468a3190x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddc468a3190x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddc468a3190x3_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddc468a319_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddc468a3190x2");
	}
	

	@UiField FlowPanel notificationContainer;
    @UiField HTML notification;

    @UiField Style style;


    interface Style extends CssResource {
        String hideNotification();
    }


    @Override
    public void notice(String html){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x2_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x3_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x20x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x30x0_____org_apache_hupa_client_ui_NotificationView_java0x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x30x00x00x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x30x00x0");
		this.notificationContainer.removeStyleName(style.hideNotification());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x30x10x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd316c295c0x30x1");
		this.notification.setHTML(html);
    }

    @Override
    public void hideNotification(){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf00x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf00x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf00x20x00x0_____org_apache_hupa_client_ui_NotificationView_java0x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf00x20x0");
		this.notification.setHTML("");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf00x20x10x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf00x20x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd1ab59bf00x20x10x00x1_____org_apache_hupa_client_ui_NotificationView_java0x0");
		this.notificationContainer.addStyleName(style.hideNotification());
    }


    public NotificationView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd55a85bbf_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd55a85bbf0x00x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd55a85bbf0x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd55a85bbf0x00x2_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd55a85bbf0x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddbd7856dd0x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddbd7856dd0x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddbd7856dd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd99a0efc60x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd99a0efc6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd26ec8d000x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd26ec8d000x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd26ec8d00");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd0x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd0x2_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd0x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd310ec4e60x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd310ec4e6_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd310ec4e60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd54123f2c0x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd54123f2c0x1_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856dd54123f2c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddbd7856dd0x10x00x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddbd7856dd0x10x00x00x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddbd7856dd0x10x00x00x00x0_____org_apache_hupa_client_ui_NotificationView_java0x0bd7856ddbd7856dd0x10x0");
		initWidget(binder.createAndBindUi(this));
    }

    interface NotificationUiBinder extends UiBinder<FlowPanel, NotificationView> {
    }

    private static NotificationUiBinder binder = GWT.create(NotificationUiBinder.class);

}
