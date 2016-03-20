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

package org.apache.hupa.client.mapper;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.activity.StatusActivity;
import org.apache.hupa.client.place.DefaultPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class StatusActivityMapper implements ActivityMapper {
    private final Provider<StatusActivity> statusActivityProvider;

    @Inject
    public StatusActivityMapper(Provider<StatusActivity> statusActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc0x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc0x10x00x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc0x10x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc0x10x00x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc0x2_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af214570x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af214570x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457c54289c40x3_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457c54289c40x20x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457c54289c40x20x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457c54289c40x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457c54289c40x2_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457c54289c4_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457c54289c40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc0x20x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457e86008bc0x20x00x0");
		this.statusActivityProvider = statusActivityProvider;
    }

    public Activity getActivity(Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x2_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x3_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x00x00x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x00x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x00x0");
		if(place instanceof DefaultPlace) return null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x0");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1eb4b3f5d0x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1eb4b3f5d0x2_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1eb4b3f5d0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1eb4b3f5d0x30x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1eb4b3f5d0x30x00x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1c38e762c0x1_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1c38e762c0x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1c38e762c0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1c38e762c0x20x0_____org_apache_hupa_client_mapper_StatusActivityMapper_java0x02af21457d92c4d5b0x30x10x00x1c38e762c0x20x00x0");
				return statusActivityProvider.get();
            }
        };
    }
}
