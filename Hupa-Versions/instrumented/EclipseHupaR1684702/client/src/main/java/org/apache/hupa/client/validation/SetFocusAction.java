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
import com.google.gwt.user.client.ui.Focusable;

import eu.maydu.gwt.validation.client.ValidationAction;
import eu.maydu.gwt.validation.client.ValidationResult;

/**
 * FocusAction uses FocusWidget instead of focusable, so it doesn't work
 * with customized widgets extending composite.
 *
 */
public class SetFocusAction extends ValidationAction<Focusable> {
    public SetFocusAction(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a2");
	}
	
	@Override
    public void invoke(ValidationResult result, Focusable widget) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd1225");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x0_____org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x20x0_____org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x4_____org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x3_____org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x2_____org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x1_____org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x40x00x0_____org_apache_hupa_client_validation_SetFocusAction_java0x0ef5332a250fd12250x40x0");
		widget.setFocus(true);
    }
}
