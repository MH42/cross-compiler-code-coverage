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
import org.apache.hupa.client.place.DefaultPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
/**
 * almost all of the activities could extends this activity<p>
 * except the Login one.
 */
public abstract class _HupaActivityMapper implements ActivityMapper{

    public _HupaActivityMapper(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9");
	}
	

	@Override
    public Activity getActivity(Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x3_____org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x1_____org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x20x0_____org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x0_____org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x30x0_____org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x30x00x00x0_____org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x30x00x0");
		if(place instanceof DefaultPlace) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x30x00x10x0");
			return null;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x30x1_____org_apache_hupa_client_mapper__HupaActivityMapper_java0x0ae80afa9d92c4d5b0x30x10x0");
		return asyncLoadActivity(place);
    }

    /**
     * code splitting
     */
    protected abstract Activity asyncLoadActivity(final Place place);

}
