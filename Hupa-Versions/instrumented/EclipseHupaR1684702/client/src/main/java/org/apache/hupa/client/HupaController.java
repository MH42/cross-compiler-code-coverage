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

package org.apache.hupa.client;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.activity.NotificationActivity;
import org.apache.hupa.client.activity.TopBarActivity;
import org.apache.hupa.client.mapper.ActivityManagerInitializer;
import org.apache.hupa.client.place.ComposePlace;
import org.apache.hupa.client.place.ContactPlace;
import org.apache.hupa.client.place.DefaultPlace;
import org.apache.hupa.client.place.FolderPlace;
import org.apache.hupa.client.place.HupaPlace;
import org.apache.hupa.client.place.SettingPlace;
import org.apache.hupa.client.rf.HupaRequestFactory;
import org.apache.hupa.client.storage.HupaStorage;
import org.apache.hupa.client.ui.HupaLayout;
import org.apache.hupa.client.ui.HupaLayoutable;
import org.apache.hupa.client.ui.LoginLayoutable;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.events.LoginEvent;
import org.apache.hupa.shared.events.LogoutEvent;
import org.apache.hupa.shared.events.LogoutEventHandler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

public class HupaController {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25ad1f381350x3_____org_apache_hupa_client_HupaController_java0x067a7f25ad1f381350x1_____org_apache_hupa_client_HupaController_java0x067a7f25ad1f38135_____org_apache_hupa_client_HupaController_java0x067a7f25ad1f381350x2_____org_apache_hupa_client_HupaController_java0x067a7f25ad1f381350x0");
	}
	
	private final PlaceController placeController;
    private final HupaLayoutable hupaLayout;
    private final LoginLayoutable loginLayout;

    @Inject private NotificationActivity.Displayable noticeRegion;
    @Inject private TopBarActivity.Displayable topBar;

    public static User user = null;

    @Inject
    public HupaController(final PlaceController placeController, final PlaceHistoryHandler placeHistoryHandler,
            final EventBus eventBus, ActivityManagerInitializer initializeActivityManagerByGin, HupaRequestFactory requestFactory,
            HupaStorage storage, final HupaLayoutable hupaLayout, final LoginLayoutable loginLayout) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c286");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x6_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x70x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x60x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x80x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x9_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x8_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x80x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x70x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x7");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a8fc6e1660x0_____org_apache_hupa_client_HupaController_java0x067a7f25a8fc6e1660x2_____org_apache_hupa_client_HupaController_java0x067a7f25a8fc6e166_____org_apache_hupa_client_HupaController_java0x067a7f25a8fc6e1660x1_____org_apache_hupa_client_HupaController_java0x067a7f25a8fc6e1660x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a9b0396bc0x2_____org_apache_hupa_client_HupaController_java0x067a7f25a9b0396bc_____org_apache_hupa_client_HupaController_java0x067a7f25a9b0396bc0x1_____org_apache_hupa_client_HupaController_java0x067a7f25a9b0396bc0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25acc0b74b90x0_____org_apache_hupa_client_HupaController_java0x067a7f25acc0b74b90x1_____org_apache_hupa_client_HupaController_java0x067a7f25acc0b74b9_____org_apache_hupa_client_HupaController_java0x067a7f25acc0b74b90x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a0x0_____org_apache_hupa_client_HupaController_java0x067a7f25a");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25ac69e1081_____org_apache_hupa_client_HupaController_java0x067a7f25ac69e10810x2_____org_apache_hupa_client_HupaController_java0x067a7f25ac69e10810x3_____org_apache_hupa_client_HupaController_java0x067a7f25ac69e10810x0_____org_apache_hupa_client_HupaController_java0x067a7f25ac69e10810x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a37831bd8_____org_apache_hupa_client_HupaController_java0x067a7f25a37831bd80x3_____org_apache_hupa_client_HupaController_java0x067a7f25a37831bd80x0_____org_apache_hupa_client_HupaController_java0x067a7f25a37831bd80x2_____org_apache_hupa_client_HupaController_java0x067a7f25a37831bd80x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25addd263100x2_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x3_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x0_____org_apache_hupa_client_HupaController_java0x067a7f25addd26310_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x1_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x00x1_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x0_____org_apache_hupa_client_HupaController_java0x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x00x0");
		this.placeController = placeController;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x10x0_____org_apache_hupa_client_HupaController_java0x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x1");
		this.hupaLayout = hupaLayout;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x2_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x20x0_____org_apache_hupa_client_HupaController_java0x0");
		this.loginLayout = loginLayout;

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x3_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x0");
		eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
            @Override
            public void onPlaceChange(PlaceChangeEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1b84675ce0x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1b84675ce0x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1b84675ce0x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1b84675ce0x2_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1b84675ce0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1b84675ce");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1b84675ce0x30x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x30x00x00x1b84675ce0x30x0");
				adjustLayout(event);
            }
        });

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x4_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x00x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x1");
		requestFactory.sessionRequest().getUser().fire(new Receiver<User>() {
            @Override
            public void onSuccess(User u) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed617");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x3_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x2_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x0");
				if (u == null) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x10x00x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x10x00x00x0");
					placeController.goTo(new DefaultPlace(""));
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x10x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x10x1");
					onFailure(null);
                } else {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x00x0");
					user = u;
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x10x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x1");
					eventBus.fireEvent(new LoginEvent(user));
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x2_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x20x0");
					showScreen(false);
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x30x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x3_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x30x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x30x00x0");
					eventBus.fireEvent(new LoginEvent(user));
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x40x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x193aed6170x30x00x20x4");
					placeHistoryHandler.handleCurrentHistory();
                }
            }
            @Override
            public void onFailure(ServerFailure error) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x17148ac25");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x17148ac250x2_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x17148ac250x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x17148ac250x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x17148ac250x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x17148ac250x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x17148ac250x30x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x40x00x10x17148ac250x30x0");
				showScreen(true);
            }
        });

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x5");
		eventBus.addHandler(LogoutEvent.TYPE, new LogoutEventHandler() {
            @Override
			public void onLogout(LogoutEvent logoutEvent) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x3_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x1_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x30x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x30x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x30x0");
				RootLayoutPanel.get().clear();
InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x30x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a63d3c2860x90x50x00x00x1f05a9bc10x30x1");
			//              RootLayoutPanel.get().add(loginLayout.get());
//              pc.goTo(new DefaultPlace(""));
              Window.Location.reload();
            }
        });
    }

    private void showScreen(boolean login) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x3_____org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f_____org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x2_____org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x1_____org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x30x0_____org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x30x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x30x00x00x0");
		RootLayoutPanel.get().clear();
        if(login)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x30x10x00x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x30x10x00x1");
		if(!(login))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25af927eb8f0x30x10x00x10x2");
		RootLayoutPanel.get().add(login ? loginLayout.get() : hupaLayout.get());
    }

    private void adjustLayout(PlaceChangeEvent event) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x3_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x2_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x1_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x00x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x00x1_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x00x0");
		Place place = event.getNewPlace();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x1");
		if (place instanceof ComposePlace) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x00x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x00x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x00x1");
			ComposePlace here = (ComposePlace) place;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x1_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x0");
			if (here.getParameters() != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x10x0");
				hupaLayout.switchTo(HupaLayout.LAYOUT_COMPOSE);
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x0");
				//FIXME using configure one
                if(GWT.isProdMode()){
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x10x00x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x10x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x10x00x0");
					placeController.goTo(new FolderPlace("INBOX"));
                }else{
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x20x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x20x00x00x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x10x10x20x00x20x00x0");
					placeController.goTo(new FolderPlace("Mock-Inbox"));
                }
            }
        } else if (place instanceof ContactPlace) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x10x0");
			hupaLayout.switchTo(HupaLayout.LAYOUT_CONTACT);
        }  else if (place instanceof SettingPlace) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x0");
			hupaLayout.switchTo(HupaLayout.LAYOUT_SETTING);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x1_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x10x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x10x1_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x10x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x10x0");
			SettingPlace sp = (SettingPlace)place;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x2_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x10x20x0");
			hupaLayout.arrangeSettingLayout(sp);
        } else if(place instanceof HupaPlace){
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x20x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x20x10x0");
			hupaLayout.switchTo(HupaLayout.LAYOUT_MESSAGE);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a3606594b0x30x10x20x20x20x20x0");
			return;
        }
    }

    public void showNotice(String html, int millis) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x2_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x0_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x30x0_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x1_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x4_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x40x0_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x40x00x0");
		noticeRegion.notice(html);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x40x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x40x1");
		if (millis > 0) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x40x10x10x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25ade36dbea0x40x10x10x0");
			hideNotice.schedule(millis);
		}
    }

    public void showTopLoading(String message) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a156fc70e0x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a156fc70e0x3_____org_apache_hupa_client_HupaController_java0x067a7f25a156fc70e0x1_____org_apache_hupa_client_HupaController_java0x067a7f25a156fc70e0x0_____org_apache_hupa_client_HupaController_java0x067a7f25a156fc70e0x2_____org_apache_hupa_client_HupaController_java0x067a7f25a156fc70e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a156fc70e0x30x0_____org_apache_hupa_client_HupaController_java0x067a7f25a156fc70e0x30x00x0");
		topBar.showLoading(message);
    }

    public void hideTopLoading() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x2_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x0_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x1_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x10x0_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x10x1_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x0");
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
            @Override
            public void execute() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x10x139ae89e00x2_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x10x139ae89e00x1_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x10x139ae89e00x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x10x139ae89e0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x10x139ae89e00x20x0_____org_apache_hupa_client_HupaController_java0x067a7f25a22f5148f0x20x00x00x10x139ae89e00x20x00x0");
				topBar.hideLoading();
            }
        });
    }

    private final Timer hideNotice = new Timer() {
        @Override
		public void run() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x00x1df6ad190");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x00x1df6ad1900x2_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x00x1df6ad1900x1_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x00x1df6ad1900x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x00x1df6ad1900x20x00x0_____org_apache_hupa_client_HupaController_java0x067a7f25addd263100x30x00x1df6ad1900x20x0");
			noticeRegion.hideNotification();
        }
    };
}
