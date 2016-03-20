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
import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;

import org.apache.hupa.server.utils.SessionUtils;
import org.apache.hupa.server.utils.SettingsDiscoverer;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.data.UserImpl;
import org.apache.hupa.shared.domain.Settings;
import org.apache.hupa.shared.domain.User;
import org.apache.hupa.shared.exception.HupaException;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class LoginUserServiceImpl extends AbstractService implements LoginUserService {

    public LoginUserServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee248de9be0x10x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee248de9be0x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee248de9be0x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee248de9be_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee248de9be0x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee248de9be0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eed4ca380c0x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eed4ca380c_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eed4ca380c0x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eed4ca380c0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee0x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee0x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee0x0");
	}
	

	@Inject private Provider<Settings> settingsProvider;
    @Inject private SettingsDiscoverer settingsDiscoverer;

    public User login(String username, String password, Settings settings) throws HupaException, MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x4_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b30_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x30x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x3_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x5_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x40x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x00x00x0");
		logger.debug("Login user: " + username + " " + password);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x00x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x00x1");
			HttpSession httpSession = httpSessionProvider.get();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x10x0");
			SessionUtils.cleanSessionAttributes(httpSession);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x20x10x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x20x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x20x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x20x0");
			User user = new UserImpl();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x30x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x3");
			user.setName(username);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x4_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x40x0");
			user.setPassword(password);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x5_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x50x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x50x0");
			user.setSettings(fix(settings));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x60x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x6");
			cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x7_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x70x0");
			user.setAuthenticated(true);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x80x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x8");
			httpSession.setAttribute(SConsts.USER_SESS_ATTR, user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x90x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x90x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00x9");
			logger.debug("Logged user: " + username);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00xa0x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00xa");
			settingsDiscoverer.setValidSettings(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x00xb");
			return user;
        } catch (Exception e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x10x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x10x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x10x10x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x10x10x0");
			e.printStackTrace();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x10x10x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x10x10x10x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee442d9b300x50x10x10x10x1");
			throw new RuntimeException(e);
        }
    }

    private Settings fix(Settings a) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a53807_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x20x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x0");
		if (settingsProvider != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x00x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x00x1");
			Settings b = settingsProvider.get();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x1");
			if (a == null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x10x10x0");
				return b;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x20x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x20x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x20x00x00x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x20x00x00x0");
			a.setImapServer(or(a.getImapServer(), b.getImapServer()));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x30x00x00x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x30x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x30x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x30x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x3");
			a.setImapPort(or(a.getImapPort(), b.getImapPort()));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x4_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x40x00x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x40x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x40x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x40x00x00x00x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x40x0");
			a.setSmtpServer((or(a.getSmtpServer(), b.getSmtpServer())));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x50x00x00x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x5_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x50x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x50x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x50x00x00x0");
			a.setSmtpPort(or(a.getSmtpPort(), b.getSmtpPort()));

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x60x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x60x00x00x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x60x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x60x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x6");
			a.setInboxFolderName(or(a.getInboxFolderName(), b.getInboxFolderName()));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x70x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x70x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x70x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x70x00x00x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x7");
			a.setSentFolderName(or(a.getSentFolderName(), b.getSentFolderName()));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x80x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x80x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x8_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x80x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x80x00x00x1");
			a.setTrashFolderName(or(a.getTrashFolderName(), b.getTrashFolderName()));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x9_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x90x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x90x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x90x00x00x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x00x10x90x00x0");
			a.setDraftsFolderName(or(a.getDraftsFolderName(), b.getDraftsFolderName()));
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee71a538070x30x1");
		return a;
    }

    private <T> T or (T a, T b) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x1_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x30x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x3_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x40x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x4_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x5");
		if(!(a == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x50x00x00x2");
		if(a == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x50x00x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6ee3f538ffc0x50x00x0");
		return a == null ? b : a;
    }

    @Override
    public Settings getSettings(String email) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x3_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x20x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x2_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a805");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x0");
		if (settingsDiscoverer == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x00x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x00x10x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x00x10x00x00x00x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x00x10x00x00x0");
			settingsDiscoverer = new SettingsDiscoverer();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x10x0_____org_apache_hupa_server_service_LoginUserServiceImpl_java0x07629a6eeae50a8050x30x1");
		return settingsDiscoverer.discoverSettings(email);
    }

}
