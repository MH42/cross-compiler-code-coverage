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

package org.apache.hupa.shared.data;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.shared.domain.DeleteMessageResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.User;

public class DeleteMessageResultImpl implements DeleteMessageResult {

    private User user;
    private ImapFolder folder;
    private int deleteCount;

    public DeleteMessageResultImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc44bd60ca40x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc44bd60ca4_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc44bd60ca40x1_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc44bd60ca40x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc412dea96f0x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc412dea96f_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc412dea96f0x2_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc412dea96f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4afffdd080x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4afffdd08_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4afffdd080x2_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc40x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4921e4dc40x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4921e4dc4_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4921e4dc40x1");
    }

    public DeleteMessageResultImpl(User user, ImapFolder folder, int deleteCount) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc44bd60ca40x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc44bd60ca4_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc44bd60ca40x1_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc44bd60ca40x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc412dea96f0x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc412dea96f_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc412dea96f0x2_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc412dea96f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4afffdd080x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4afffdd08_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4afffdd080x2_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc40x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x4_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x30x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x10x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x3_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x1_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x20x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x40x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x40x00x0");
		this.user = user;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x40x10x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x40x1");
		this.folder = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x40x20x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a8eddf0c0x40x2_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0");
		this.deleteCount = deleteCount;
    }
    @Override
    public int getCount() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4eb9b66ba0x2_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4eb9b66ba0x1_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4eb9b66ba0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4eb9b66ba");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4eb9b66ba0x20x0");
		return deleteCount;
    }

    @Override
    public User getUser() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4abbd3e69");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4abbd3e690x1_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4abbd3e690x2_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4abbd3e690x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4abbd3e690x20x0");
		return user;
    }

    @Override
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a7336cc50x0_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a7336cc50x2_____org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a7336cc50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageResultImpl_java0x0921e4dc4a7336cc50x20x0");
		return folder;
    }

}
