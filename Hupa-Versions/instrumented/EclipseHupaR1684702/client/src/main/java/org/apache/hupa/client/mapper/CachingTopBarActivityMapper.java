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
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.activity.shared.CachingActivityMapper;
import com.google.gwt.activity.shared.FilteredActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;

public class CachingTopBarActivityMapper implements ActivityMapper {

    private ActivityMapper filteredActivityMapper;

    @Inject
    public CachingTopBarActivityMapper(TopBarActivityMapper topBarActivityMapper) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cdfbac1750x2_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cdfbac1750x1_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cdfbac175_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cdfbac1750x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8c_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8c0x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce4757130");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x1_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x2_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x1_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x1_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x0");
		FilteredActivityMapper.Filter filter = new FilteredActivityMapper.Filter() {
            @Override
            public Place filter(Place place) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x1cccc9168");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x1cccc91680x2_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x1cccc91680x1_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x1cccc91680x3_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x1cccc91680x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x1cccc91680x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x00x10x00x1cccc91680x30x0");
				return place;
            }
        };

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x1_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x10x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x10x10x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x10x1_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x10x10x00x0");
		CachingActivityMapper cachingActivityMapper = new CachingActivityMapper(topBarActivityMapper);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x20x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x2_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x20x00x00x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8ce47571300x20x20x00x0");
		filteredActivityMapper = new FilteredActivityMapper(filter, cachingActivityMapper);
    }

    @Override
    public Activity getActivity(Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cd92c4d5b0x3_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cd92c4d5b0x20x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cd92c4d5b0x2_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cd92c4d5b0x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cd92c4d5b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cd92c4d5b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cd92c4d5b0x30x00x0_____org_apache_hupa_client_mapper_CachingTopBarActivityMapper_java0x099545d8cd92c4d5b0x30x0");
		return filteredActivityMapper.getActivity(place);
    }

}
