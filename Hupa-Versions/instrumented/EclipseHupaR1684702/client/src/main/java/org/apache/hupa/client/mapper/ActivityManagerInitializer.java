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

package org.apache.hupa.client.mapper;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.ui.HupaLayoutable;
import org.apache.hupa.client.ui.LoginLayoutable;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * This class is responsible for ActivityManager instantiations through GIN, it
 * also associate every ActivityManager with the corresponding display region
 */
public class ActivityManagerInitializer {

    @Inject
    public ActivityManagerInitializer(LoginLayoutable loginLayout, HupaLayoutable hupaLayout,

            @Named("ContactsListRegion") ActivityManager contactsListActivityManager,
            @Named("ContactPropertiesRegion") ActivityManager contactPropertiesActivityManager,
            @Named("LabelListRegion") ActivityManager labelListActivityManager,
            @Named("SettingNavRegion") ActivityManager settingNavActivityManager,
            @Named("LabelPropertiesRegion") ActivityManager labelPropertiesActivityManager,
            @Named("LoginPage") ActivityManager loginActivityManager,
            @Named("TopBarRegion") ActivityManager topBarActivityManager,
            @Named("LogoRegion") ActivityManager logoActivityManager,
            @Named("NotificationRegion") ActivityManager notificationActivityManager,
            @Named("NavigationRegion") ActivityManager navigationActivityManager,
            @Named("ToolBarRegion") ActivityManager toolBarActivityManager,
            @Named("FolderListRegion") ActivityManager folderListActivityManager,
            @Named("AddressListRegion") ActivityManager addressListActivityManager,
            @Named("MessageListRegion") ActivityManager messageListActivityManager,
            @Named("MessageListFooterRegion") ActivityManager messageListFooterActivityManager,
            @Named("MessageContentRegion") ActivityManager messageContentActivityManager,
            @Named("StatusRegion") ActivityManager statusActivityManager,
            @Named("ComposeToolBarRegion") ActivityManager composeToolBarActivityManager,
            @Named("SearchBoxRegion") ActivityManager searchBoxActivityManager,
            @Named("ComposeRegion") ActivityManager composeActivityManager) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x16_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x160x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x17");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d62");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b10");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x00x00x0");
		contactsListActivityManager.setDisplay(hupaLayout.getContactsListView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x10x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x1_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x10x00x0");
		contactPropertiesActivityManager.setDisplay(hupaLayout.getContactPropertiesView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x20x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x2_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x20x0");
		settingNavActivityManager.setDisplay(hupaLayout.getSettingNavView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x3_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x30x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x30x0");
		loginActivityManager.setDisplay(loginLayout.getLoginView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x40x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x4_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x40x00x0");
		topBarActivityManager.setDisplay(hupaLayout.getTopBarView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x50x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x50x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x5");
		logoActivityManager.setDisplay(hupaLayout.getLogoView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x60x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x60x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x6");
		notificationActivityManager.setDisplay(hupaLayout.getNotificationView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x70x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x70x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x7");
		navigationActivityManager.setDisplay(hupaLayout.getNavigationView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x80x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x8_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x80x00x0");
		toolBarActivityManager.setDisplay(hupaLayout.getToolBarView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x90x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x90x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x9");
		folderListActivityManager.setDisplay(hupaLayout.getFolderListView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xa0x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xa_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xa0x00x0");
		addressListActivityManager.setDisplay(hupaLayout.getAddressListView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xb_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xb0x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xb0x0");
		messageListActivityManager.setDisplay(hupaLayout.getMessageListView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xc0x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xc_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xc0x0");
		messageListFooterActivityManager.setDisplay(hupaLayout.getMessageListFooterView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xd0x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xd_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xd0x0");
		messageContentActivityManager.setDisplay(hupaLayout.getMessageContentView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xe0x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xe_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xe0x00x0");
		statusActivityManager.setDisplay(hupaLayout.getStatusView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xf0x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xf0x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170xf");
		composeToolBarActivityManager.setDisplay(hupaLayout.getComposeToolBarView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x100x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x10_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x100x00x0");
		searchBoxActivityManager.setDisplay(hupaLayout.getSearchBoxView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x110x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x110x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x11");
		composeActivityManager.setDisplay(hupaLayout.getComposeView());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x120x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x120x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x12");
		labelPropertiesActivityManager.setDisplay(hupaLayout.getLabelPropertiesView());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x130x00x0_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x13_____org_apache_hupa_client_mapper_ActivityManagerInitializer_java0x0cce83b1071c78d620x170x130x0");
		labelListActivityManager.setDisplay(hupaLayout.getLabelListView());
    }

}
