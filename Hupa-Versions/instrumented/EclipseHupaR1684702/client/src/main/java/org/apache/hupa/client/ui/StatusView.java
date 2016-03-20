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
import org.apache.hupa.client.activity.StatusActivity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class StatusView extends Composite implements StatusActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_StatusView_java0x0267a20b3c909f1f40x0_____org_apache_hupa_client_ui_StatusView_java0x0_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3c909f1f40x1_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3c909f1f40x30x0_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3c909f1f40x3_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3c909f1f4_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3c909f1f40x2");
	}
	

	public StatusView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_StatusView_java0x0267a20b3267a20b30x0_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3267a20b3_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3267a20b30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_StatusView_java0x0267a20b30x0_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3_____org_apache_hupa_client_ui_StatusView_java0x0267a20b30x2_____org_apache_hupa_client_ui_StatusView_java0x0267a20b30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_StatusView_java0x0267a20b3a1a35ec10x00x2_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3a1a35ec10x00x0_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3a1a35ec10x00x1_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3a1a35ec1_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3a1a35ec10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_StatusView_java0x0267a20b3267a20b30x10x00x00x0_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3267a20b30x10x00x00x00x0_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3267a20b30x10x0_____org_apache_hupa_client_ui_StatusView_java0x0267a20b3267a20b30x10x00x0");
		initWidget(binder.createAndBindUi(this));
    }

    interface StatusUiBinder extends UiBinder<HTMLPanel, StatusView> {
    }

    private static StatusUiBinder binder = GWT.create(StatusUiBinder.class);

}
