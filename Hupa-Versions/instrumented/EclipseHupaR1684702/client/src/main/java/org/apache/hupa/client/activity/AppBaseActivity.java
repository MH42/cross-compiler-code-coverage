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
import java.util.ArrayList;
import java.util.List;

import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.rf.HupaRequestFactory;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;

public abstract class AppBaseActivity extends AbstractActivity {

    public AppBaseActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e680x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e680x2_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e680x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68793d6d7c0x2_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68793d6d7c_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68793d6d7c0x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68793d6d7c0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6822ee00970x2_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6822ee00970x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6822ee0097_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6822ee00970x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6899b14ede0x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6899b14ede0x2_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6899b14ede0x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6899b14ede");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68978c9f3f0x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68978c9f3f0x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68978c9f3f0x2_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68978c9f3f");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x10x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x20x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x10x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x20x00x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x20x00x00x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x20x00x00x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e689118558a0x2");
	}
	
	@Inject protected EventBus eventBus;
    @Inject protected HupaController hc;
    @Inject protected PlaceController pc;
    @Inject protected HupaRequestFactory rf;

    protected List<HandlerRegistration> registrations = new ArrayList<HandlerRegistration>();

    @Override
    public void onStop() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x2_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x00x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x00x00x0");
		for (HandlerRegistration registration : registrations) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x00x10x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x00x10x00x0");
			if(registration != null){
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x00x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x00x10x00x10x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x00x10x00x10x00x0");
				registration.removeHandler();
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x10x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68d2e0f1d90x20x1");
		registrations.clear();
    }

    protected void registerHandler(HandlerRegistration handlerRegistration) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6843a426a60x3_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6843a426a60x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6843a426a6_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6843a426a60x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6843a426a60x2_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6843a426a60x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6843a426a60x30x00x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e6843a426a60x30x0");
		registrations.add(handlerRegistration);
    }

    public String mayStop() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68f653745f0x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68f653745f0x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68f653745f_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68f653745f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68f653745f0x20x0");
		return null;
    }

    public void onCancel() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68994124b60x0_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68994124b60x2_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68994124b60x1_____org_apache_hupa_client_activity_AppBaseActivity_java0x0cee40e68994124b6");
    }
}
