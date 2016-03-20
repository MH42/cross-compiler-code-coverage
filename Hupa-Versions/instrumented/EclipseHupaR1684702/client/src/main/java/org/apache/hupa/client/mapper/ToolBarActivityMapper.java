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
import org.apache.hupa.client.activity.ToolBarActivity;
import org.apache.hupa.client.place.FolderPlace;
import org.apache.hupa.client.place.MessagePlace;
import org.apache.hupa.client.place.SettingPlace;
import org.apache.hupa.client.ui.ToolBarView.Parameters;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ToolBarActivityMapper extends _HupaActivityMapper {
    private final Provider<ToolBarActivity> toolBarActivityProvider;

    @Inject
    public ToolBarActivityMapper(Provider<ToolBarActivity> toolActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8ddb49a620x2_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8ddb49a62_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8ddb49a620x20x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8ddb49a620x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8ddb49a620x3_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8ddb49a620x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8ddb49a620x20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d10x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d10x10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d10x2_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d10x10x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d10x10x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad80x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad80x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d10x20x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad8d5e346d10x20x0");
		this.toolBarActivityProvider = toolActivityProvider;
    }

    @Override
    protected Activity asyncLoadActivity(final Place place) {
        
		//		Block insertion:
		//
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x00x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x00x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x20x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x2_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x20x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d19");
		if(place instanceof SettingPlace) return null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x10x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x10x20x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x10x2");
		final ToolBarActivity tba = toolBarActivityProvider.get();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x2");
		if (place instanceof FolderPlace) { // might be from login page
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x00x10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x00x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x00x10x00x0");
			FolderPlace here = (FolderPlace) place;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x10x00x10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x10x00x10x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x10x00x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x10x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x20x10x1");
			tba.getDisplay().setParameters(new Parameters(null, here.getToken(), null, null));
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x3_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x00x0");
		if(place instanceof MessagePlace){
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x10x00x00x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x10x00x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x10x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x10x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x10x00x00x00x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x30x10x00x0");
			return tba.with(((MessagePlace)place).getTokenWrapper().getFolder());
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x4_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1eb4b3f5d0x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1eb4b3f5d0x2_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1eb4b3f5d0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1eb4b3f5d0x30x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1eb4b3f5d0x30x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x00x1");
				String token = null;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x1_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x0");
				if (place instanceof FolderPlace) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x10x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x10x00x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x10x00x00x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x10x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x10x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x10x0");
					token = ((FolderPlace) place).getToken();
                }else if(place instanceof MessagePlace){
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x20x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x20x10x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x20x10x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x20x10x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x20x10x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x20x10x00x00x00x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x20x10x00x00x00x00x00x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x10x20x10x00x00x00x00x0");
					token = ((MessagePlace)place).getTokenWrapper().getFolder();
                }
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x20x0_____org_apache_hupa_client_mapper_ToolBarActivityMapper_java0x0cd09cad866539d190x30x40x00x1c38e762c0x20x2");
				return tba.with(token);
            }
        };
    }
}
