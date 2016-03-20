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

package org.apache.hupa.server.service;


import tc3.desktop.InstrumentationLoggerProvider;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

public class CheckSessionServiceImpl extends AbstractService implements CheckSessionService {

    public CheckSessionServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e8240x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e8240x1_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e8240x2");
	}
	

	@Override
    public User getUser() throws HupaException{
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e690x1_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e690x2_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e690x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e690x20x00x00x10x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e690x20x00x00x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e690x20x00x00x1_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e690x20x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824abbd3e690x20x00x0");
		return (User) httpSessionProvider.get().getAttribute(SConsts.USER_SESS_ATTR);
    }

    public Boolean isValid()  throws HupaException{
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x2_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac8_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x20x00x00x1_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x20x00x00x10x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x20x00x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x20x00x00x00x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x20x0_____org_apache_hupa_server_service_CheckSessionServiceImpl_java0x07597e824faf87ac80x20x00x00x0");
		return getUser() != null && getUser().getAuthenticated();
    }
}
