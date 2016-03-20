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

package org.apache.hupa.client.validation;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.UIObject;

import eu.maydu.gwt.validation.client.ValidationResult;
import eu.maydu.gwt.validation.client.actions.StyleAction;

/**
 * It's like StyleAction but with a timer to remove the style
 */
public class AddStyleAction extends StyleAction {

    Timer removeTimer = new Timer() {
        @Override
        public void run() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x00x1df6ad1900x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x00x1df6ad1900x2_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x00x1df6ad1900x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x00x1df6ad190");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x00x1df6ad1900x20x00x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x00x1df6ad1900x20x0");
			reset();
        }
    };

    int removePeriod = 0;

    public AddStyleAction(String add, int millisecs) {
        super(add);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x30x10x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x30x1_____org_apache_hupa_client_validation_AddStyleAction_java0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b882b1dbe380x1_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b882b1dbe380x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b882b1dbe38");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff85_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x3_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x1_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x10x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x20x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88bf88ff850x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c4_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x1_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x00x1_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b88ba4b89c40x10x00x0");
        this.removePeriod = millisecs;
    }

    @Override
    public void invoke(ValidationResult result, UIObject object) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x2_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x20x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x3_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x4_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x30x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x1_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb89");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x40x00x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x40x0");
		super.invoke(result, object);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x40x1_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x40x10x0");
		if (removePeriod > 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x40x10x10x00x0_____org_apache_hupa_client_validation_AddStyleAction_java0x0db743b888e6abb890x40x10x10x0");
			removeTimer.schedule(removePeriod);
        }
    }

}
