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
import org.apache.hupa.client.activity.LogoActivity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;

public class LogoView extends Composite implements LogoActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LogoView_java0x0dcc55d5ea9bac1f90x1_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5ea9bac1f90x30x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5ea9bac1f90x2_____org_apache_hupa_client_ui_LogoView_java0x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5ea9bac1f9_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5ea9bac1f90x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5ea9bac1f90x3");
	}
	

	public LogoView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LogoView_java0x0dcc55d5edcc55d5e0x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5edcc55d5e_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5edcc55d5e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e0x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e0x1_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e0x2_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e1b48e0f10x00x2_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e1b48e0f10x00x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e1b48e0f10x00x1_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e1b48e0f10x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5e1b48e0f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LogoView_java0x0dcc55d5edcc55d5e0x10x00x00x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5edcc55d5e0x10x00x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5edcc55d5e0x10x00x00x00x0_____org_apache_hupa_client_ui_LogoView_java0x0dcc55d5edcc55d5e0x10x0");
		initWidget(binder.createAndBindUi(this));
    }

    interface LogoUiBinder extends UiBinder<SimplePanel, LogoView> {
    }

    private static LogoUiBinder binder = GWT.create(LogoUiBinder.class);

}
