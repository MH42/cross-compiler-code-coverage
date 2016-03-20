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

package org.apache.hupa.client.activity;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.rf.LogoutUserRequest;
import org.apache.hupa.shared.domain.LogoutUserResult;
import org.apache.hupa.shared.events.LogoutEvent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

public class TopBarActivity extends AppBaseActivity {

    public TopBarActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95aac51d7d0x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95aac51d7d_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95aac51d7d0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa9559b189070x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa9559b18907_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa9559b189070x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa9559b189070x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa950x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa950x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95da0c66680x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95da0c66680x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95da0c66680x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95da0c6668");
	}
	
	@Inject private Displayable display;

    @UiField protected HTMLPanel userLabel;

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x4_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x20x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x3_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x00x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x10x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x1");
		bindTo(eventBus);
        if(!(HupaController.user != null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x20x10x00x2");
		if(HupaController.user != null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x20x10x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x20x10x0");
		String user = HupaController.user != null ? HupaController.user.getName() : "Not logged in";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x3_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x30x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x30x00x0");
		display.getUserLabel().clear();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x4_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x40x00x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x40x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x40x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95abdb942c0x40x40x00x10x0");
		display.getUserLabel().add(new HTML(user));
    }

    private void bindTo(EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x3_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x0");
		registerHandler(display.getLogoutClick().addClickHandler(new ClickHandler() {
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1208950cc_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1208950cc0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1208950cc0x30x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95bc3fb24b0x30x00x00x00x10x1208950cc0x30x0");
				doLogout();
            }
        }));
    }

    private void doLogout() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x00x10x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x00x1");
		LogoutUserRequest req = rf.logoutRequest();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x10x0");
		hc.showTopLoading("Logging out ...");

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x00x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x0");
		req.logout().fire(new Receiver<LogoutUserResult>() {
            public void onSuccess(LogoutUserResult response) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x3_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x30x00x00x00x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x30x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x30x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x30x00x00x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17ac6327f0x30x00x00x0");
				eventBus.fireEvent(new LogoutEvent(response.getUser()));
            }

            public void onFailure(ServerFailure error) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x3_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x2_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x20x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x1_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac25");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x30x00x00x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x30x00x00x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x30x0_____org_apache_hupa_client_activity_TopBarActivity_java0x048e1fa95627fd04d0x20x20x00x10x17148ac250x30x00x0");
				eventBus.fireEvent(new LogoutEvent(null));
            }
        });
    }

    public interface Displayable extends IsWidget {
        HasClickHandlers getLogoutClick();
        void showUserName(String userName);
        HTMLPanel getUserLabel();
        void showLoading(String message);
        void hideLoading();
    }
}
