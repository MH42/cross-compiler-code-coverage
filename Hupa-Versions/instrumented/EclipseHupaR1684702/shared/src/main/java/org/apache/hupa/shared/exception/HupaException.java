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

package org.apache.hupa.shared.exception;


import tc3.shared.InstrumentationLoggerProvider;
import java.io.Serializable;

/**
 * An abstract superclass for exceptions that can be thrown by the Hupa system.
 *
 * @author echo
 */
@SuppressWarnings("serial")
public class HupaException extends Exception implements Serializable {

    private String causeClassname;

    protected HupaException() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea77_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67f3368d67f_____org_apache_hupa_shared_exception_HupaException_java0x03368d67f3368d67f0x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67f3368d67f0x1");
    }

    public HupaException(String message) {
        super(message);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa9e2a34f0x2_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa9e2a34f0x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa9e2a34f0x10x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa9e2a34f0x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa9e2a34f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa9e2a34f0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea77_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x2");
    }

    public HupaException(Throwable cause) {
        super(cause.getMessage());
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x10x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x2_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x20x10x00x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x20x10x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x20x10x00x10x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x20x00x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fe0479c8e0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea77_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x2");
        this.causeClassname = cause.getClass().getName();
    }

    public HupaException(String message, Throwable cause) {
        super(message + " (" + cause.getMessage() + ")");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x30x10x0_____org_apache_hupa_shared_exception_HupaException_java0x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x30x10x00x10x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x30x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x30x10x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x30x00x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x30x00x00x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x20x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf8472_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x3_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x10x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa1bf84720x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea77_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fee63ea770x2");
        this.causeClassname = cause.getClass().getName();
    }

    public String getCauseClassname() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fab4e0b85_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fab4e0b850x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fab4e0b850x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fab4e0b850x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fab4e0b850x20x0");
		return causeClassname;
    }

    @Override public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa7edc6080x1_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa7edc6080x2_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa7edc6080x0_____org_apache_hupa_shared_exception_HupaException_java0x03368d67fa7edc608");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa7edc6080x20x00x00x10x0");
		if(causeClassname != null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa7edc6080x20x00x00x10x00x1");
		if(!(causeClassname != null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_exception_HupaException_java0x03368d67fa7edc6080x20x00x00x10x00x2");
		return super.toString() + (causeClassname != null ? " [cause: " + causeClassname + "]" : "");
    }

}
