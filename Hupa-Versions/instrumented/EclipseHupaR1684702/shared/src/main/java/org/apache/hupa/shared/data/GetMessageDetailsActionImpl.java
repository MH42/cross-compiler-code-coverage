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
import org.apache.hupa.shared.domain.GetMessageDetailsAction;
import org.apache.hupa.shared.domain.ImapFolder;

public class GetMessageDetailsActionImpl implements GetMessageDetailsAction {
    public GetMessageDetailsActionImpl() {
        super();
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7522458f7520x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7522458f7520x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7522458f752");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7522458f7520x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7520x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7520x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752e2577dd70x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752e2577dd7_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752e2577dd70x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752e2577dd70x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752afffdd08_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752afffdd080x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752afffdd080x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752afffdd080x2");
    }
    public GetMessageDetailsActionImpl(ImapFolder folder, long uid) {
        super();
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x30x10x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x30x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x10x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x20x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x2_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x3_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7520x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7520x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752e2577dd70x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752e2577dd7_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752e2577dd70x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752e2577dd70x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x30x20x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7525d8ba43b0x30x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752afffdd08_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752afffdd080x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752afffdd080x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752afffdd080x2");
        this.folder = folder;
        this.uid = uid;
    }

    private ImapFolder folder;
    private long uid;

    @Override
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752a7336cc50x2_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752a7336cc50x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752a7336cc50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752a7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752a7336cc50x20x0");
		return folder;
    }
    @Override
    public void setFolder(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7524fe885f10x20x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7524fe885f10x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7524fe885f10x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7524fe885f10x3_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7524fe885f10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7524fe885f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7524fe885f10x30x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7524fe885f10x30x00x0");
		this.folder = folder;
    }
    @Override
    public long getUid() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752249819540x2_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752249819540x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752249819540x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f75224981954");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f752249819540x20x0");
		return uid;
    }
    @Override
    public void setUid(long uid) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7521ada8409");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7521ada84090x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7521ada84090x1_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7521ada84090x20x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7521ada84090x2_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7521ada84090x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7521ada84090x30x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x0_____org_apache_hupa_shared_data_GetMessageDetailsActionImpl_java0x02458f7521ada84090x30x00x0");
		this.uid = uid;
    }
}
