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
import org.apache.hupa.shared.domain.FetchMessagesAction;

public class FetchMessagesActionImpl implements FetchMessagesAction {

    private ImapFolder folder;
    private int start;
    private int offset;
    private String searchString;

    public FetchMessagesActionImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876882d6876_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876882d68760x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876882d68760x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876bfef518e0x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876bfef518e_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876bfef518e0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876bfef518e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68762b0209270x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68762b020927_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68762b0209270x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68762b0209270x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687653a610e9_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687653a610e90x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687653a610e90x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687653a610e90x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876afffdd080x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876afffdd080x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876afffdd08_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68760x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68760x1");
    }

    @Override
    public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7edc6080x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7edc6080x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7edc6080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7edc608");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7edc6080x20x00x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7edc6080x20x00x00x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7edc6080x20x0");
		return "[" + folder.getFullName() + "," + start + "," + offset + "," + searchString + "]";
    }

    public FetchMessagesActionImpl(ImapFolder folder, int start, int offset, String searchString) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x4_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x40x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x20x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x30x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x5_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x3_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876bfef518e0x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876bfef518e_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876bfef518e0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876bfef518e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68762b0209270x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68762b020927_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68762b0209270x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68762b0209270x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687653a610e9_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687653a610e90x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687653a610e90x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687653a610e90x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876afffdd080x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876afffdd080x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876afffdd08_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876afffdd080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68760x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68760x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x50x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x50x00x0");
		this.folder = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x50x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x50x10x0");
		this.start = start;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x50x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x50x20x0");
		this.offset = offset;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x50x30x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876991e226b0x50x3_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0");
		this.searchString = searchString;
    }

    @Override
    public ImapFolder getFolder() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7336cc50x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7336cc50x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7336cc50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7336cc5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876a7336cc50x20x0");
		return folder;
    }

    @Override
    public int getStart() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876f321efd5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876f321efd50x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876f321efd50x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876f321efd50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876f321efd50x20x0");
		return start;
    }

    @Override
    public int getOffset() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687614d3a489");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687614d3a4890x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687614d3a4890x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687614d3a4890x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687614d3a4890x20x0");
		return offset;
    }

    @Override
    public String getSearchString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876656e9fec");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876656e9fec0x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876656e9fec0x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876656e9fec0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876656e9fec0x20x0");
		return searchString;
    }

    @Override
    public void setFolder(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68764fe885f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68764fe885f10x20x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68764fe885f10x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68764fe885f10x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68764fe885f10x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68764fe885f10x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68764fe885f10x30x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d68764fe885f10x30x00x0");
		this.folder = folder;
    }

    @Override
    public void setStart(int start) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687658176f700x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687658176f700x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687658176f700x3_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687658176f700x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687658176f700x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687658176f70");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687658176f700x30x00x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d687658176f700x30x0");
		this.start = start;
    }

    @Override
    public void setOffset(int offset) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876ba75216f0x3_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876ba75216f0x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876ba75216f0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876ba75216f0x20x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876ba75216f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876ba75216f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876ba75216f0x30x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876ba75216f0x30x00x0");
		this.offset = offset;
    }

    @Override
    public void setSearchString(String searchString) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876710ba67f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876710ba67f0x3_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876710ba67f0x1_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876710ba67f0x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876710ba67f0x2_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876710ba67f0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876710ba67f0x30x00x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0882d6876710ba67f0x30x0_____org_apache_hupa_shared_data_FetchMessagesActionImpl_java0x0");
		this.searchString = searchString;
    }

}
