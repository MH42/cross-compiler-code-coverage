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
import org.apache.hupa.client.activity.MessageContentActivity;
import org.apache.hupa.client.place.MessagePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class MessageContentActivityMapper extends _MessageActivityMapper {
    private final Provider<MessageContentActivity> messageContentActivityProvider;

    @Inject
    public MessageContentActivityMapper(Provider<MessageContentActivity> messageContentActivityProvider) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc20470x10x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc20470x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc20470x2_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc20470x10x00x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc20470x10x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc20470x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff16a691bec0x3_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff16a691bec0x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff16a691bec0x2_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff16a691bec0x20x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff16a691bec0x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff16a691bec0x20x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff16a691bec");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff10x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff10x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc2047");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc20470x20x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1b8dc20470x20x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0");
		this.messageContentActivityProvider = messageContentActivityProvider;
    }

    @Override
    protected Activity lazyLoadActivity(final Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x2_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x20x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x20x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b00");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x0");
		return new ActivityAsyncProxy() {
            @Override
            protected void doAsync(RunAsyncCallback callback) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1eb4b3f5d0x3_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1eb4b3f5d0x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1eb4b3f5d0x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1eb4b3f5d0x20x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1eb4b3f5d0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1eb4b3f5d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1eb4b3f5d0x30x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1eb4b3f5d0x30x0");
				GWT.runAsync(callback);
            }

            @Override
            protected Activity createInstance() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x2_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x00x0");
				if (place instanceof MessagePlace) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x10x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x10x00x00x10x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x10x00x00x10x00x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x10x00x00x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x10x00x00x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x10x00x00x10x0_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x00x10x0");
					return messageContentActivityProvider.get().with(((MessagePlace) place).getTokenWrapper());
                }
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x1_____org_apache_hupa_client_mapper_MessageContentActivityMapper_java0x0e4003ff1f4ae7b000x30x00x00x1c38e762c0x20x10x0");
				return messageContentActivityProvider.get();
            }
        };
    }
}
