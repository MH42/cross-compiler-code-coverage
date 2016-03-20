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
import org.apache.hupa.shared.domain.GetMessageRawAction;
import org.apache.hupa.shared.domain.ImapFolder;

public class GetMessageRawActionImpl implements GetMessageRawAction {

    private ImapFolder folder;
    private long uid;

    public GetMessageRawActionImpl(ImapFolder folder, long uid) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x2_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x20x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e50_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x10x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08ae2577dd70x2_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08ae2577dd7_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08ae2577dd70x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08ae2577dd70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aafffdd08_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aafffdd080x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aafffdd080x2_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aafffdd080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a0x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x30x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x30x00x0");
		this.folder = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x30x10x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a22046e500x30x1");
		this.uid = uid;
    }

    public GetMessageRawActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08ae2577dd70x2_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08ae2577dd7_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08ae2577dd70x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08ae2577dd70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aafffdd08_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aafffdd080x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aafffdd080x2_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aafffdd080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a0x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a9a25e08a_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a9a25e08a0x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a9a25e08a0x1");
    }

    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aa7336cc50x2_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aa7336cc50x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aa7336cc5_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aa7336cc50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08aa7336cc50x20x0");
		return folder;
    }

    public long getUid() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a249819540x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a24981954_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a249819540x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a249819540x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a249819540x20x0");
		return uid;
    }

    public boolean equals(Object obj) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x3_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x2_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x0");
		if (obj instanceof GetMessageRawAction) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x00x10x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x00x10x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x00x1");
			GetMessageRawAction action = (GetMessageRawAction) obj;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x00x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x00x10x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x00x10x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x00x00x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x00x1");
			if (action.getFolder().equals(getFolder()) && action.getUid() == getUid()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x00x10x10x10x0");
				return true;
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08a1a1ed2a00x30x1");
		return false;
    }

    public int hashCode() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda94728_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x20x00x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x20x00x00x10x00x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x20x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x20x00x00x10x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x20x00x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x20x00x00x10x0_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x20x00x00x1_____org_apache_hupa_shared_data_GetMessageRawActionImpl_java0x09a25e08adda947280x20x00x00x10x00x1");
		return (int) (getFolder().hashCode() * getUid());
    }

}
