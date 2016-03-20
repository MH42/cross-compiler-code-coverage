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
import org.apache.hupa.client.activity.NotificationActivity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class NotificationActivityMapper extends _HupaActivityMapper {
    private final Provider<NotificationActivity> notificationActivityProvider;

    @Inject
    public NotificationActivityMapper(Provider<NotificationActivity> notificationActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488030x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488030x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803f4071f8e0x3_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803f4071f8e0x20x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803f4071f8e0x20x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803f4071f8e0x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803f4071f8e0x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803f4071f8e_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803f4071f8e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a050x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a050x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a050x10x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a050x10x00x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a050x10x00x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a050x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a05");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a050x20x00x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb7488037cf65a050x20x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0");
		this.notificationActivityProvider = notificationActivityProvider;
    }

    @Override
    public Activity asyncLoadActivity(Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x20x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x2_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x0");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1eb4b3f5d0x2_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1eb4b3f5d0x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1eb4b3f5d0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1eb4b3f5d0x30x00x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1eb4b3f5d0x30x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1c38e762c0x1_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1c38e762c0x2_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1c38e762c0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1c38e762c0x20x0_____org_apache_hupa_client_mapper_NotificationActivityMapper_java0x0eb748803e484aefe0x30x00x00x1c38e762c0x20x00x0");
				return notificationActivityProvider.get();
            }
        };
    }
}
