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
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class LoginLayout implements LoginLayoutable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2d169a870x30x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2d169a870x2_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2d169a87_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2d169a870x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2d169a870x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2d169a870x3");
	}
	

	@UiField SimplePanel loginContainer;

    private LayoutPanel loginMainPanel;

    public LoginLayout() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d0x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d64fec54a0x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d64fec54a0x00x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d64fec54a0x00x2_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d64fec54a0x00x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d64fec54a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dcec19c7d_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dcec19c7d0x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dcec19c7d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dfa38191d0x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dfa38191d0x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dfa38191d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7df007717b0x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7df007717b0x2_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7df007717b_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7df007717b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dcec19c7d0x10x00x00x10x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dcec19c7d0x10x00x0_____org_apache_hupa_client_ui_LoginLayout_java0x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dcec19c7d0x10x00x00x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7dcec19c7d0x10x0");
		this.loginMainPanel = binder.createAndBindUi(this);
    }

    @Override
    public AcceptsOneWidget getLoginView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x2_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf88450x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf88450x3_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf88450x2_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf88450x20x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf88450x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf88450x30x0_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d2a14a51f0x20x00x00x199bf88450x30x00x0");
				loginContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    @Override
    public LayoutPanel get() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d783923e50x2_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d783923e50x1_____org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d783923e50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d783923e5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginLayout_java0x0cec19c7d783923e50x20x0");
		return loginMainPanel;
    }

    interface LoginLayoutUiBinder extends UiBinder<LayoutPanel, LoginLayout> {
    }

    private static LoginLayoutUiBinder binder = GWT
            .create(LoginLayoutUiBinder.class);

}
