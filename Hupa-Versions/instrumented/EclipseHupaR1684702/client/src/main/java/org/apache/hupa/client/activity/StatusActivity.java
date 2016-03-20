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
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class StatusActivity extends AppBaseActivity {

    public StatusActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_StatusActivity_java0x07738878c59b18907_____org_apache_hupa_client_activity_StatusActivity_java0x07738878c59b189070x2_____org_apache_hupa_client_activity_StatusActivity_java0x07738878c59b189070x1_____org_apache_hupa_client_activity_StatusActivity_java0x07738878c59b189070x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_StatusActivity_java0x07738878caac51d7d0x0_____org_apache_hupa_client_activity_StatusActivity_java0x07738878caac51d7d0x1_____org_apache_hupa_client_activity_StatusActivity_java0x07738878caac51d7d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_StatusActivity_java0x07738878c_____org_apache_hupa_client_activity_StatusActivity_java0x07738878c0x0_____org_apache_hupa_client_activity_StatusActivity_java0x07738878c0x1");
	}
	
	@Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x2_____org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x30x0_____org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x3_____org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x4_____org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x1_____org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x0_____org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x40x00x0_____org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x40x0_____org_apache_hupa_client_activity_StatusActivity_java0x07738878cabdb942c0x40x00x00x0");
		container.setWidget(display.asWidget());
    }

    @Inject private Displayable display;

    public interface Displayable extends IsWidget {}
}
