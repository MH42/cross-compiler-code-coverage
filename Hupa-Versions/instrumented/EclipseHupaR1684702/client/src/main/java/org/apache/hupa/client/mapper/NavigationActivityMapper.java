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
import org.apache.hupa.client.activity.NavigationActivity;
import org.apache.hupa.client.place.DefaultPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class NavigationActivityMapper implements ActivityMapper {
    private final Provider<NavigationActivity> navigationActivityProvider;

    @Inject
    public NavigationActivityMapper(
            Provider<NavigationActivity> navigationActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd099f0e1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd099f0e10x2_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd099f0e10x10x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd099f0e10x10x00x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd099f0e10x10x00x1_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd099f0e10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d0x1_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d93d6b3200x3_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d93d6b3200x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d93d6b320_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d93d6b3200x2_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d93d6b3200x20x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d93d6b3200x20x1_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008d93d6b3200x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd099f0e10x20x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd099f0e10x20x00x0");
		this.navigationActivityProvider = navigationActivityProvider;
    }

    public Activity getActivity(Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x2_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x3_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x20x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x1_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x00x00x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x00x1_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x00x0");
		if(place instanceof DefaultPlace) return null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x1_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1eb4b3f5d0x2_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1eb4b3f5d0x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1eb4b3f5d0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1eb4b3f5d0x30x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1eb4b3f5d0x30x00x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1c38e762c0x2_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1c38e762c0x1_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1c38e762c0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1c38e762c0x20x00x0_____org_apache_hupa_client_mapper_NavigationActivityMapper_java0x06da2008dd92c4d5b0x30x10x00x1c38e762c0x20x0");
				return navigationActivityProvider.get();
            }
        };
    }
}
