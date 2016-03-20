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

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class SettingNavActivity extends AppBaseActivity {

    public SettingNavActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c49459b18907_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c49459b189070x2_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c49459b189070x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c49459b189070x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c4940x1_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c4940x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494aac51d7d0x1_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494aac51d7d0x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494aac51d7d");
	}
	
	@Inject protected Displayable display;

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x2_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x4_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x30x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x3_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x20x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x40x00x00x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x40x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x40x00x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x40x10x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x40x1");
		itemChangeByPlace();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x40x2_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494abdb942c0x40x20x0");
		bindTo(eventBus);
    }

    protected void itemChangeByPlace() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494d9190aa50x1_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494d9190aa50x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494d9190aa5_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494d9190aa50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494d9190aa50x20x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494d9190aa50x20x00x0");
		display.singleSelect(1);
    }

    protected void bindTo(EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x2_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x20x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x1_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x1_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1");
		registerHandler(display.getLabelsAchor().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x30x00x0");
				display.singleSelect(1);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x30x10x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x30x10x00x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x30x10x00x00x0_____org_apache_hupa_client_activity_SettingNavActivity_java0x056a6c494bc3fb24b0x30x00x00x00x10x1208950cc0x30x1");
				pc.goTo(new SettingPlace("labels"));
            }
        }));
    }

    public interface Displayable extends IsWidget {
        HasClickHandlers getLabelsAchor();
        void singleSelect(int i);
    }
}
