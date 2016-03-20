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
import org.apache.hupa.shared.domain.GenericResult;

public class GenericResultImpl implements GenericResult {

    private String message = null;
    private boolean success = true;

    public GenericResultImpl() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdfddf69cd_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdfddf69cd0x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdfddf69cd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd85c6a9bc0x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd85c6a9bc_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd85c6a9bc0x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd85c6a9bc0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda9bdd90f0x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda9bdd90f0x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda9bdd90f0x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda9bdd90f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd0x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd0x0");
    }
    public GenericResultImpl(String message, boolean success) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x10x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x20x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd85c6a9bc0x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd85c6a9bc_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd85c6a9bc0x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd85c6a9bc0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda9bdd90f0x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda9bdd90f0x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda9bdd90f0x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda9bdd90f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd0x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x30x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x30x00x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0");
		this.message = message;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x30x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cda2c9093f0x30x10x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0");
		this.success = success;
    }
    @Override
    public String getMessage() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd480ad7700x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd480ad7700x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd480ad7700x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd480ad770");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd480ad7700x20x0");
		return message;
    }

    @Override
    public boolean isSuccess() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd82a1c15b0x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd82a1c15b0x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd82a1c15b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd82a1c15b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd82a1c15b0x20x0");
		return success;
    }

    @Override
    public void setMessage(String message) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd23e67b99");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd23e67b990x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd23e67b990x3_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd23e67b990x20x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd23e67b990x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd23e67b990x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd23e67b990x30x00x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd23e67b990x30x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0");
		this.message = message;

    }

    @Override
    public void setSuccess(boolean success) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdb613a8410x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdb613a8410x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdb613a8410x20x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdb613a8410x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdb613a8410x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdb613a841");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdb613a8410x30x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cdb613a8410x30x00x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0");
		this.success = success;
    }

    @Override
    public void setError(String message) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a743591");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x2_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x3_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x30x0_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x30x00x0");
		setMessage(message);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x30x1_____org_apache_hupa_shared_data_GenericResultImpl_java0x0fddf69cd1a7435910x30x10x0");
		setSuccess(false);
    }

}
