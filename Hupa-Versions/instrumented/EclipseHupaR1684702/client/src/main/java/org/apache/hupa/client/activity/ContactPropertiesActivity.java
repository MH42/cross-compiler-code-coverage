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
import java.util.List;

import org.apache.hupa.client.ui.LabelNode;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class ContactPropertiesActivity extends AppBaseActivity {

    public ContactPropertiesActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2e0x0_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2e0x1_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2e");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2e59b18907_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2e59b189070x0_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2e59b189070x2_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2e59b189070x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eaac51d7d0x0_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eaac51d7d0x1_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eaac51d7d");
	}
	
	@Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x4_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x20x0_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x2_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x3_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x0_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x1_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x40x00x00x0_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x40x00x0_____org_apache_hupa_client_activity_ContactPropertiesActivity_java0x0b7a95e2eabdb942c0x40x0");
		container.setWidget(display.asWidget());
    }

    @Inject private Displayable display;

    public interface Displayable extends IsWidget {
        void cascade(LabelNode labelNode, List<LabelNode> list, int cascadeTypeAdd);
        HasClickHandlers getSave();
    }
}
