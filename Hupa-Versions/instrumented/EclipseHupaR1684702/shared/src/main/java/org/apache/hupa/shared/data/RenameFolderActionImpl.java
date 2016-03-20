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
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.RenameFolderAction;

public class RenameFolderActionImpl implements RenameFolderAction {

    public RenameFolderActionImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978afffdd080x1_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978afffdd08_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978afffdd080x2_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978afffdd080x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459781530cb410x2_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459781530cb410x1_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459781530cb410x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459781530cb41");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459780x1_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459780x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978");
	}
	
	@Override
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978a7336cc50x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978a7336cc50x1_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978a7336cc50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978a7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc45978a7336cc50x20x0");
		return folder;
    }
    @Override
    public void setFolder(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459784fe885f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459784fe885f10x20x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459784fe885f10x2_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459784fe885f10x3_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459784fe885f10x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459784fe885f10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459784fe885f10x30x00x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459784fe885f10x30x0");
		this.folder = folder;
    }
    @Override
    public String getNewName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459788afb52f60x2_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459788afb52f60x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459788afb52f60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459788afb52f6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459788afb52f60x20x0");
		return newName;
    }
    @Override
    public void setNewName(String newName) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459782755f3fa0x3_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459782755f3fa0x1_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459782755f3fa0x20x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459782755f3fa0x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459782755f3fa0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459782755f3fa");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_RenameFolderActionImpl_java0x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459782755f3fa0x30x0_____org_apache_hupa_shared_data_RenameFolderActionImpl_java0x07bc459782755f3fa0x30x00x0");
		this.newName = newName;
    }

    private ImapFolder folder;
    private String newName;

}
