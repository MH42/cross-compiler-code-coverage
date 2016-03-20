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
import org.apache.hupa.client.activity.FolderListActivity;
import org.apache.hupa.client.place.SettingPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class FolderListActivityMapper extends _HupaActivityMapper {
    private final Provider<FolderListActivity> folderListActivityProvider;

    @Inject
    public FolderListActivityMapper(Provider<FolderListActivity> folderListActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa30x10x00x1_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa30x10x00x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa30x10x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa30x2_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa30x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87ad4c078600x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87ad4c078600x1_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87ad4c078600x20x1_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87ad4c078600x20x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87ad4c078600x3_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87ad4c07860_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87ad4c078600x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a0x1_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a0x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa30x20x00x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a31eb5aa30x20x0");
		this.folderListActivityProvider = folderListActivityProvider;
    }

    @Override
    protected Activity asyncLoadActivity(final Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x1_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x20x1_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x2_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x20x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d19");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x00x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x00x00x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x0");
		if (place instanceof SettingPlace) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x00x10x0");
			return null;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x1");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1eb4b3f5d0x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1eb4b3f5d0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1eb4b3f5d0x30x00x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1eb4b3f5d0x30x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1c38e762c0x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1c38e762c0x2_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1c38e762c0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1c38e762c0x20x0_____org_apache_hupa_client_mapper_FolderListActivityMapper_java0x010c4e87a66539d190x30x10x00x1c38e762c0x20x00x0");
				return folderListActivityProvider.get();
            }
        };

    }
}
