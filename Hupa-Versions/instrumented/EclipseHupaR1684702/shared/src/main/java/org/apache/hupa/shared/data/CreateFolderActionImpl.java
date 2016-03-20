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
import org.apache.hupa.shared.domain.CreateFolderAction;
import org.apache.hupa.shared.domain.ImapFolder;

public class CreateFolderActionImpl implements CreateFolderAction{

    private ImapFolder folder;
    public CreateFolderActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c824c096c0x1_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c824c096c0x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c824c096c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096cafffdd080x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096cafffdd08_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096cafffdd080x1_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096cafffdd080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c0x1_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c0x0");
    }
    public CreateFolderActionImpl(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ce056163d0x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ce056163d0x2_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ce056163d0x10x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ce056163d0x1_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ce056163d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096cafffdd080x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096cafffdd08_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096cafffdd080x1_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096cafffdd080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c0x1_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ce056163d0x20x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ce056163d0x20x00x0");
		this.folder = folder;
    }
    @Override
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ca7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ca7336cc50x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ca7336cc50x2_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ca7336cc50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096ca7336cc50x20x0");
		return folder;
    }
    @Override
    public void setFolder(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c4fe885f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c4fe885f10x1_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c4fe885f10x20x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c4fe885f10x2_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c4fe885f10x3_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c4fe885f10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c4fe885f10x30x00x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0824c096c4fe885f10x30x0_____org_apache_hupa_shared_data_CreateFolderActionImpl_java0x0");
		this.folder = folder;
    }
}
