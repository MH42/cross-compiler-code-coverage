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
import org.apache.hupa.shared.domain.DeleteMessageAction;
import org.apache.hupa.shared.domain.ImapFolder;

public class DeleteMessageActionImpl implements DeleteMessageAction {

    protected ImapFolder folder;

    public DeleteMessageActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038389b30380x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038389b3038_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038389b30380x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038afffdd08_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038afffdd080x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038afffdd080x1_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038afffdd080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30380x1_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30380x0");
    }
    public DeleteMessageActionImpl(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30382828e3e40x10x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30382828e3e40x1_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30382828e3e40x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30382828e3e40x2_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30382828e3e4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038afffdd08_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038afffdd080x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038afffdd080x1_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038afffdd080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30380x1_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30380x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30382828e3e40x20x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30382828e3e40x20x00x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0");
		this.folder = folder;
    }

    @Override
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038a7336cc50x1_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038a7336cc50x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038a7336cc50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038a7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b3038a7336cc50x20x0");
		return folder;
    }
    @Override
    public void setFolder(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30384fe885f10x20x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30384fe885f10x1_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30384fe885f10x2_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30384fe885f10x3_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30384fe885f10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30384fe885f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30384fe885f10x30x00x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0389b30384fe885f10x30x0_____org_apache_hupa_shared_data_DeleteMessageActionImpl_java0x0");
		this.folder = folder;
    }

}
