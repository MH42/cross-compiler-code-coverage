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
import java.io.ByteArrayOutputStream;

import javax.mail.Folder;
import javax.mail.Message;

import org.apache.hupa.shared.data.GetMessageRawResultImpl;
import org.apache.hupa.shared.domain.GetMessageRawAction;
import org.apache.hupa.shared.domain.GetMessageRawResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.User;

import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class GetMessageRawServiceImpl extends AbstractService implements GetMessageRawService {

    public GetMessageRawServiceImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc513980x2_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc513980x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc513980x0");
	}
	
	@Override
    public GetMessageRawResult get(GetMessageRawAction action) throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x20x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x2_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e0217");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x00x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x00x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x00x0");
		User user = getUser();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x10x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x10x1");
		long uid = action.getUid();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x20x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x2_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x20x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x20x0");
		ImapFolder folder = action.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x3_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x00x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x00x1");
			IMAPStore store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x10x10x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x10x10x00x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x10x10x00x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x10x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x10x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x10x0");
			IMAPFolder f = (IMAPFolder) store.getFolder(folder.getFullName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x20x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x2_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x20x0");
			if (f.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x20x10x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x20x10x0");
				f.open(Folder.READ_ONLY);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x30x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x30x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x30x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x3_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x30x10x00x0");
			Message m = f.getMessageByUID(action.getUid());

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x4_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x40x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x40x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x40x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x40x10x00x0");
			ByteArrayOutputStream out = new ByteArrayOutputStream();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x5_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x50x0");
			m.writeTo(out);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x6_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x60x0");
			if (f.isOpen()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x60x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x60x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x60x10x00x0");
				f.close(false);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x70x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x70x00x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x70x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x00x7");
			return new GetMessageRawResultImpl(out.toString());
        } catch (Exception e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x10x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x10x00x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x10x0");
			logger.error("Unable to get raw content of msg for user " + user + " in folder " + folder + " with uid "
                    + uid, e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x10x10x00x1_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x10x10x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x10x10x00x0_____org_apache_hupa_server_service_GetMessageRawServiceImpl_java0x04cc51398e40e02170x30x30x10x10x1");
			throw new Exception("Unable to et raw content of msg for user " + user + " in folder " + folder
                    + " with uid " + uid);
        }

    }
}
