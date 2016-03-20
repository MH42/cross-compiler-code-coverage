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
import java.util.List;

import org.apache.hupa.shared.data.MessageImpl.IMAPFlag;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.SetFlagAction;

public class SetFlagActionImpl implements SetFlagAction {

    private IMAPFlag flag;
    private List<Long> uids;
    private ImapFolder folder;
    private boolean value;

    public SetFlagActionImpl(ImapFolder folder, IMAPFlag flag, boolean value, List<Long> uids) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f32b67c7_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f32b67c70x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f32b67c70x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f32b67c70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372afffdd080x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372afffdd08_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372afffdd080x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x30x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x20x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x40x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef46_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x10x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x40x00x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x4_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x5_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x3_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x40x00x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372112f3a990x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372112f3a990x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372112f3a99_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372112f3a990x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x10x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x10x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653720x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653720x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x50x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x50x00x0");
		this.flag = flag;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x50x10x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x50x1");
		this.value = value;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x50x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x50x20x0");
		this.uids = uids;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x50x30x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372dc4bef460x50x3_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x0");
		this.folder = folder;
    }

    protected SetFlagActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537289d65372_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537289d653720x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537289d653720x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f32b67c7_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f32b67c70x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f32b67c70x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f32b67c70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372afffdd080x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372afffdd08_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372afffdd080x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372112f3a990x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372112f3a990x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372112f3a99_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372112f3a990x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x10x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x10x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723a8b28e00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653720x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653720x1");
    }

    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372a7336cc50x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372a7336cc5_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372a7336cc50x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372a7336cc50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372a7336cc50x20x0");
		return folder;
    }

    public boolean getValue() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653722ee204060x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653722ee20406_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653722ee204060x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653722ee204060x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653722ee204060x20x0");
		return value;
    }
    public IMAPFlag getFlag() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723eb396620x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723eb396620x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723eb39662_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723eb396620x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653723eb396620x20x0");
		return flag;
    }

    public List<Long> getUids() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f82974d30x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f82974d30x10x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f82974d30x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f82974d30x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f82974d3_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f82974d30x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d65372f82974d30x20x0");
		return uids;
    }

    public void setFlag(IMAPFlag flag) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653726bd4a2250x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653726bd4a225_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653726bd4a2250x20x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653726bd4a2250x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653726bd4a2250x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653726bd4a2250x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653726bd4a2250x30x00x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653726bd4a2250x30x0");
		this.flag = flag;
    }

    public void setUids(List<Long> uids) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d61_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x20x00x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x20x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x3_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x20x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x30x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537297b66d610x30x00x0");
		this.uids = uids;
    }

    public void setFolder(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653724fe885f10x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653724fe885f10x20x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653724fe885f10x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653724fe885f1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653724fe885f10x3_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653724fe885f10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653724fe885f10x30x00x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d653724fe885f10x30x0");
		this.folder = folder;
    }

    public void setValue(boolean value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537259b143eb0x1_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537259b143eb0x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537259b143eb0x3_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537259b143eb0x20x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537259b143eb0x2_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537259b143eb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537259b143eb0x30x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x089d6537259b143eb0x30x00x0_____org_apache_hupa_shared_data_SetFlagActionImpl_java0x0");
		this.value = value;
    }
}
