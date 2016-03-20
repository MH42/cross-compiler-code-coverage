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
import org.apache.hupa.client.place.FolderPlace;
import org.apache.hupa.client.place.MessagePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.activity.shared.CachingActivityMapper;
import com.google.gwt.activity.shared.FilteredActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;

public class CachingMessageListActivityMapper implements ActivityMapper {

    private ActivityMapper filteredActivityMapper;

    @Inject
    public CachingMessageListActivityMapper(MessageListActivityMapper messageListActivityMapper) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x2_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x1_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f340x1_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f340x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34dfbac1750x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34dfbac1750x2_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34dfbac1750x1_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34dfbac175");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x1_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1");
		FilteredActivityMapper.Filter filter = new FilteredActivityMapper.Filter() {
            @Override
            public Place filter(Place place) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1cccc91680x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1cccc91680x2_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1cccc91680x1_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1cccc91680x3_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1cccc91680x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1cccc9168");
				if(place instanceof MessagePlace)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1cccc91680x30x00x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x00x10x00x1cccc91680x30x00x0");
				return place instanceof MessagePlace ? new FolderPlace(((MessagePlace) place).getTokenWrapper()
                        .getFolder()) : place;
            }
        };

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x10x00x00x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x1_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x10x00x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34ffa91fa50x20x10x0");
		filteredActivityMapper = new FilteredActivityMapper(filter,
                new CachingActivityMapper(messageListActivityMapper));
    }

    @Override
    public Activity getActivity(Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34d92c4d5b0x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34d92c4d5b0x3_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34d92c4d5b0x1_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34d92c4d5b0x2_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34d92c4d5b0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34d92c4d5b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34d92c4d5b0x30x0_____org_apache_hupa_client_mapper_CachingMessageListActivityMapper_java0x0660b7f34d92c4d5b0x30x00x0");
		return filteredActivityMapper.getActivity(place);
    }

}
