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
import org.apache.hupa.shared.domain.Tag;

public class TagImpl implements Tag {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e89e9636c0x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e89e9636c0x4_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e89e9636c0x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e89e9636c0x2_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e89e9636c0x3_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e89e9636c");
	}
	

	public final static String PREFIX = "TAG.";
    private String tagName;

    public TagImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e9034c02e0x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e9034c02e_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e9034c02e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e527dc8480x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e527dc8480x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e527dc848_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e527dc8480x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e0x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e0x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e");
    }

    public TagImpl(String tagName) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e527dc8480x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e527dc8480x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e527dc848_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e527dc8480x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e0x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e0x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e3dc4370d0x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e3dc4370d0x2_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e3dc4370d0x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e3dc4370d0x10x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e3dc4370d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e3dc4370d0x20x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e3dc4370d0x20x00x0_____org_apache_hupa_shared_data_TagImpl_java0x0");
		this.tagName = tagName;
    }

    public String getName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02efa98c1fd_____org_apache_hupa_shared_data_TagImpl_java0x09034c02efa98c1fd0x2_____org_apache_hupa_shared_data_TagImpl_java0x09034c02efa98c1fd0x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02efa98c1fd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02efa98c1fd0x20x0");
		return tagName;
    }

    public String getPrefix() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e1f50dd6c0x2_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e1f50dd6c_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e1f50dd6c0x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02e1f50dd6c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02e1f50dd6c0x20x0");
		return PREFIX;
    }

    public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02ea7edc6080x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02ea7edc608_____org_apache_hupa_shared_data_TagImpl_java0x09034c02ea7edc6080x1_____org_apache_hupa_shared_data_TagImpl_java0x09034c02ea7edc6080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_TagImpl_java0x09034c02ea7edc6080x20x0_____org_apache_hupa_shared_data_TagImpl_java0x09034c02ea7edc6080x20x00x0");
		return PREFIX + tagName;
    }

}
