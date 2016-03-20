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
import org.apache.hupa.client.place.SettingPlace;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class NavigationActivity extends AppBaseActivity {

    public NavigationActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c859b189070x2_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c859b189070x1_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c859b18907_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c859b189070x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8aac51d7d0x1_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8aac51d7d0x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8aac51d7d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c80x1_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c80x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8");
	}
	

	@Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x20x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x30x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x2_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x3_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x4_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x40x00x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x40x00x00x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x40x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x40x1_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8abdb942c0x40x10x0");
		itemChangeByPlace();
    }

    private void itemChangeByPlace() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa5_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x1_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x00x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x00x10x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x00x1_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x0");
		Place place = pc.getWhere();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x1_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x10x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x10x00x0");
		if (place instanceof SettingPlace) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x10x10x00x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x10x10x0");
			display.select(2);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x10x20x00x0_____org_apache_hupa_client_activity_NavigationActivity_java0x0999fe5c8d9190aa50x20x10x20x0");
			display.select(1);
        }
    }

    @Inject private Displayable display;

    public interface Displayable extends IsWidget {
        void select(int i);
    }
}
