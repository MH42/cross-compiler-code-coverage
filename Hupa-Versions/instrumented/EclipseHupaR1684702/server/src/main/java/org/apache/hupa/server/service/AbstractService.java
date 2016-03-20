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
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.hupa.server.IMAPStoreCache;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;
import org.apache.hupa.shared.exception.InvalidSessionException;

import com.google.inject.Inject;
import com.google.inject.Provider;

public abstract class AbstractService {

    public AbstractService(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc210x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21_____org_apache_hupa_server_service_AbstractService_java0x0730acc210x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc2116cc54ff_____org_apache_hupa_server_service_AbstractService_java0x0730acc2116cc54ff0x1_____org_apache_hupa_server_service_AbstractService_java0x0730acc2116cc54ff0x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc2116cc54ff0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21b03592800x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21b03592800x1_____org_apache_hupa_server_service_AbstractService_java0x0730acc21b03592800x2_____org_apache_hupa_server_service_AbstractService_java0x0730acc21b0359280");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21ed47589f0x10x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21ed47589f0x2_____org_apache_hupa_server_service_AbstractService_java0x0730acc21ed47589f0x1_____org_apache_hupa_server_service_AbstractService_java0x0730acc21ed47589f_____org_apache_hupa_server_service_AbstractService_java0x0730acc21ed47589f0x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21ed47589f0x10x1");
	}
	
	@Inject protected IMAPStoreCache cache;
    @Inject protected Provider<HttpSession> httpSessionProvider;
    @Inject protected Log logger;

    protected User getUser() throws HupaException{
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x1_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x2_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x00x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x00x1_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x00x10x00x10x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x00x10x00x1_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x00x10x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x00x10x00x0");
		User user = (User) httpSessionProvider.get().getAttribute(SConsts.USER_SESS_ATTR);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x1_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x0");
		if (user == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x10x00x00x10x00x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x10x00x00x1_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x10x00x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x10x00x00x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x10x00x00x10x0_____org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x10x0");
			throw new InvalidSessionException(getClass().getSimpleName()
                    + User.NOT_FOUND
                    + httpSessionProvider.get().getId());
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_AbstractService_java0x0730acc21abbd3e690x20x10x20x0");
			return user;
        }
    }
}
