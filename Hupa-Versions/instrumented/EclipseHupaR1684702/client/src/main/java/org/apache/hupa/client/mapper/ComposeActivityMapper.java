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
import org.apache.hupa.client.activity.ComposeActivity;
import org.apache.hupa.client.place.ComposePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ComposeActivityMapper implements ActivityMapper {
    private final Provider<ComposeActivity> composeActivityProvider;

    @Inject protected PlaceController placeController;

    @Inject
    public ComposeActivityMapper(Provider<ComposeActivity> composeActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f00x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f00x10x00x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f00x10x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f00x10x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c69e10810x2_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c69e1081_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c69e10810x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c69e10810x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761462c2a78df0x3_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761462c2a78df0x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761462c2a78df0x20x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761462c2a78df0x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761462c2a78df_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761462c2a78df0x2_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761462c2a78df0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761460x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0404761460x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f00x20x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146798118f00x20x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x0");
		this.composeActivityProvider = composeActivityProvider;
    }

    @Override
	public Activity getActivity(final Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x20x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x2_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x20x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c9658234");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x00x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x00x00x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x00x00x00x00x0");
		if (!(place instanceof ComposePlace)) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x00x10x0");
			return null;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x10x2_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x10x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x10x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x10x20x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x10x20x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x1");
		final ComposePlace here = (ComposePlace) place;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x20x00x10x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x2_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x20x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x20x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x20x00x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x20x00x00x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x20x00x1");
		if (!"new".equals(here.getToken()) && here.getParameters() == null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x20x10x0");
			return null;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x3_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1eb4b3f5d0x2_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1eb4b3f5d0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1eb4b3f5d0x30x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1eb4b3f5d0x30x00x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1c38e762c0x2_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1c38e762c0x1_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1c38e762c0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1c38e762c0x20x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1c38e762c0x20x00x00x0_____org_apache_hupa_client_mapper_ComposeActivityMapper_java0x040476146c96582340x30x30x00x1c38e762c0x20x0");
				return composeActivityProvider.get().with(here);
            }
        };
    }
}
