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
import org.apache.hupa.client.HupaConstants;
import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.place.FolderPlace;
import org.apache.hupa.client.rf.LoginUserRequest;
import org.apache.hupa.client.storage.HupaStorage;
import org.apache.hupa.client.ui.HupaLayoutable;
import org.apache.hupa.shared.domain.Settings;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.events.FlashEvent;
import org.apache.hupa.shared.events.LoginEvent;
import org.apache.hupa.shared.events.SessionExpireEvent;
import org.apache.hupa.shared.events.SessionExpireEventHandler;
import org.apache.hupa.widgets.dialog.Dialog;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

public class LoginActivity extends AppBaseActivity {


    public LoginActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0090x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0090x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf009");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf009a35e8df80x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf009a35e8df8_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf009a35e8df80x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf009a35e8df80x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00959b189070x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00959b189070x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00959b189070x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00959b18907");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00937831bd80x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00937831bd8_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00937831bd80x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00937831bd80x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0093cc1d5a4_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0093cc1d5a40x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0093cc1d5a40x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0093cc1d5a40x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0093d48292e0x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0093d48292e0x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0093d48292e0x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0093d48292e");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf009aac51d7d_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf009aac51d7d0x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf009aac51d7d0x0");
	}
	
	@Inject private HupaLayoutable hupaLayout;
    @Inject private Displayable display;
    @Inject private HupaConstants constants;
    @Inject private HupaStorage storage;

    private Settings settings;

    @Override
    public void start(AcceptsOneWidget container, final EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x3_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x30x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x4_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x30x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x00x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x10x00x0");
		display.setActivity(this);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x2");
		display.setLoading(false);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x3");
		registerHandler(eventBus.addHandler(SessionExpireEvent.TYPE, new SessionExpireEventHandler() {
            @Override
			public void onSessionExpireEvent(SessionExpireEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b30087");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x30x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x30x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x30x00x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x30x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf00987191a1d0x40x30x00x00x00x143b300870x30x00x00x00x1");
				eventBus.fireEvent(new FlashEvent(constants.sessionTimedOut(), 4000));
            }
        }));
    }

    public void doLogin() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x00x20x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x00x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x00x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x00x20x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x00x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x0");
		final String user = display.getUserNameValue().getValue().trim();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x10x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x10x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x10x20x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x10x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x10x20x00x00x0");
		final String pass = display.getPasswordValue().getValue().trim();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x20x00x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x20x00x0");
		if (user.isEmpty() || pass.isEmpty()) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x20x10x0");
			return;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x30x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x3");
		display.setLoading(true);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x40x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x40x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x40x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x4");
		LoginUserRequest loginRequest = rf.loginRequest();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x5_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x50x0");
		if (settings != null) {
             InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x50x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x50x10x00x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x50x10x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x50x10x00x00x0");
			settings = display.getSettings(loginRequest.edit(settings));
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x00x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x6_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x0");
		loginRequest.login(user, pass, settings).fire(new Receiver<User>() {
            @Override
            public void onSuccess(User response) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x3_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x00x0");
				HupaController.user = response;

                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x10x00x0");
				RootLayoutPanel.get().clear();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x20x00x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x20x00x0");
				RootLayoutPanel.get().add(hupaLayout.get());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x30x00x00x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x30x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x30x00x00x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x30x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x3_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x30x00x0");
				pc.goTo(new FolderPlace(response.getSettings().getInboxFolderName()));

                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x4_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x40x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x40x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x40x00x0");
				eventBus.fireEvent(new LoginEvent(response));
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x50x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x5");
				display.setLoading(false);

                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x6_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x14d654a6b0x30x60x0");
				storage.saveSettings(user, settings);
            }
            @Override
            public void onFailure(ServerFailure error) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac25");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x3_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x30x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x30x00x0");
				Dialog.alert("Unable to login, verify that your user, password and settings are correct.");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x30x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0098f7d25ae0x20x60x00x10x17148ac250x30x1");
				display.setLoading(false);
            }
        });
    }

    public interface Displayable extends IsWidget {
        public HasValue<String> getUserNameValue();
        public Settings getSettings(Settings edit);
        public void setActivity(LoginActivity loginActivity);
        public HasValue<String> getPasswordValue();
        public void setLoading(boolean loading);
        @Override
		public Widget asWidget();
        void setSettings(Settings s);
    }

    public void loadSettings() {
      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x00x0");
	System.out.println("Load settings");
      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x10x10x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x10x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x10x1");
	String email = display.getUserNameValue().getValue();
      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x0");
	if (!email.isEmpty()) {
          InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x00x00x0");
		settings = storage.getSettingsByEmail(email);
          InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x1");
		if (settings == null) {
              InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x00x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x00x1");
			rf.loginRequest().getSettings(email).fire(new Receiver<Settings>() {
                  @Override
				public void onSuccess(Settings response) {
                      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa2404");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x2_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x3");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x30x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x30x00x0");
					settings = response;
                      InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x30x1_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x10x00x00x10x17daa24040x30x10x0");
					display.setSettings(settings);
                  }
              });
          } else {
              InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x20x0_____org_apache_hupa_client_activity_LoginActivity_java0x0bdedf0094e34623a0x20x20x10x10x20x00x0");
			display.setSettings(settings);
          }
      }
    }
}
