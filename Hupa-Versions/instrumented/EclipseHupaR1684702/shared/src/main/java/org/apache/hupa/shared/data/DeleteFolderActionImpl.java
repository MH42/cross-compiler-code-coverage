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
import org.apache.hupa.shared.domain.DeleteFolderAction;
import org.apache.hupa.shared.domain.ImapFolder;

public class DeleteFolderActionImpl implements DeleteFolderAction{

    private ImapFolder folder;
    public DeleteFolderActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783341d77830x1_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783341d77830x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783341d7783");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783afffdd080x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783afffdd08_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783afffdd080x2_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77830x1_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77830x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783");
    }
    public DeleteFolderActionImpl(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783eb85f0570x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783eb85f0570x2_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783eb85f0570x10x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783eb85f0570x1_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783eb85f057");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783afffdd080x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783afffdd08_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783afffdd080x2_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77830x1_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77830x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783eb85f0570x20x00x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783eb85f0570x20x0");
		this.folder = folder;
    }
    @Override
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783a7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783a7336cc50x2_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783a7336cc50x1_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783a7336cc50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d7783a7336cc50x20x0");
		return folder;
    }
    @Override
    public void setFolder(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77834fe885f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77834fe885f10x20x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77834fe885f10x3_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77834fe885f10x2_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77834fe885f10x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77834fe885f10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77834fe885f10x30x00x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0341d77834fe885f10x30x0_____org_apache_hupa_shared_data_DeleteFolderActionImpl_java0x0");
		this.folder = folder;
    }
}
