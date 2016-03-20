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
import org.apache.hupa.client.place.ComposePlace;
import org.apache.hupa.client.place.SettingPlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;

/**
 * mappers in the messages panel could facility
 */
abstract class _MessageActivityMapper extends _HupaActivityMapper {
    public _MessageActivityMapper(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209");
	}
	
	@Override
    protected Activity asyncLoadActivity(Place place) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x1_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x3_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x20x0_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x2_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x00x00x0_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x00x0_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x0");
		if (place instanceof SettingPlace) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x00x10x0");
			return null;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x10x0_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x10x00x0_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x1");
		if (place instanceof ComposePlace) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x10x10x0");
			return null;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x2_____org_apache_hupa_client_mapper__MessageActivityMapper_java0x078192209e484aefe0x30x20x0");
		return lazyLoadActivity(place);
    }
    abstract protected Activity lazyLoadActivity(Place place);
}
