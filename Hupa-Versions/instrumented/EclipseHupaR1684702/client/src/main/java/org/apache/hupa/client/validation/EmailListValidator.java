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
import com.google.gwt.user.client.ui.HasText;

import eu.maydu.gwt.validation.client.ValidationAction;
import eu.maydu.gwt.validation.client.ValidationResult;
import eu.maydu.gwt.validation.client.Validator;
import eu.maydu.gwt.validation.client.i18n.ValidationMessages;

/**
 * Validator which handles the validation of Email Lists. Email addresses
 * needs to be comma separated
 *
 *
 */
public class EmailListValidator extends Validator<EmailListValidator>{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694f3a6d6380x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694f3a6d6380x2_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694f3a6d6380x4_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694f3a6d638_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694f3a6d6380x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694f3a6d6380x3");
	}
	
	private static final String emailRegex = "^(.*<)?[A-Za-z0-9._%'*/=+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}(>)?\\s*$";

    private final HasText text;
    public EmailListValidator(HasText text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694abefdf4b0x2_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694abefdf4b0x10x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694abefdf4b0x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694abefdf4b0x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694abefdf4b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694372ea08c0x3_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694372ea08c0x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694372ea08c0x2_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694372ea08c_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694372ea08c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694abefdf4b0x20x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694abefdf4b0x20x00x0");
		this.text = text;
    }

    @SuppressWarnings("unchecked")
	@Override
    public void invokeActions(ValidationResult result) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x3_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x20x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x00x00x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x00x00x00x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x00x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x00x00x0");
		for (ValidationAction<HasText> action : getFailureActions()) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x00x20x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d436948bb784bd0x30x00x20x00x0");
			action.invoke(result, text);
		}
    }

    @Override
    public <V extends ValidationMessages> ValidationResult validate(V messages) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x3_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x4_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x10x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x2_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e120");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x00x00x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x00x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x00x0");
		if (isValidAddressList(text.getText()) == false) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x00x10x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x00x10x00x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x00x10x00x0");
			return new ValidationResult();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369415b4e1200x40x1");
		return null;
    }

    /**
     * Return if the give text is a valid Emailaddress list
     *
     * @param text
     * @return isValid
     */
    public static boolean isValidAddressList(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369441481099");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x4_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x2_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x3_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x00x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x00x10x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x00x0");
		if (text != null && text.length() > 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x0");
			for (String address : text.split("[,;\r\n]+")) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x00x10x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x00x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x00x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x00x00x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x00x10x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x0");
				if (address.trim().length() > 0 && isValidAddress(address.trim()) == false) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x00x10x00x20x00x10x0");
					return false;
                }
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d43694414810990x40x1");
		return true;
    }

    /**
     * Checks if the given value is a valid emailaddress
     *
     * @param email
     * @return isValid
     */
    private static boolean isValidAddress(String email) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f940x4_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f940x3_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f940x2_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f940x1_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f940x30x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f940x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f94");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f940x40x00x0_____org_apache_hupa_client_validation_EmailListValidator_java0x0a3d4369488158f940x40x0");
		return email.matches(emailRegex);
    }
}
