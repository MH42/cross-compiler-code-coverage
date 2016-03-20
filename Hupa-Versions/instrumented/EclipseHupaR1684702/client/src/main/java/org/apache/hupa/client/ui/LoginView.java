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

package org.apache.hupa.client.ui;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.activity.LoginActivity;
import org.apache.hupa.shared.domain.Settings;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginView extends Composite implements LoginActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83847bf55d60x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83847bf55d60x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83847bf55d60x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83847bf55d60x30x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83847bf55d6_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83847bf55d60x1");
	}
	
	@UiField FlowPanel innerBox;
    @UiField HTMLPanel message;
    @UiField SubmitButton submitButton;
    @UiField Button setupButton;

    @UiField PopupPanel settingsPopup;
    @UiField TextBox imapServer;
    @UiField TextBox imapPort;
    @UiField CheckBox imapSecure;
    @UiField TextBox smtpServer;
    @UiField TextBox smtpPort;
    @UiField CheckBox smtpSecure;
    private LoginActivity activity;

    /*
     * We wrap login/password boxes with a form which must be in the html
     * document, in this way, the browser knows that we are sending a login form
     * and offers the save password dialog to the user
     */
    @UiField(provided = true) TextBox usernameTextBox;
    @UiField(provided = true) PasswordTextBox passwordTextBox;

    public LoginView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381d9d1ff40x00x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381d9d1ff4_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381d9d1ff40x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381d9d1ff40x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381d9d1ff40x00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a83899a0efc60x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83899a0efc6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a838_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8384cafb3b7_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8384cafb3b70x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8384cafb3b70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a83864795f440x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83864795f44_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83864795f440x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a83837add8e6_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83837add8e60x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83837add8e60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a83872e294080x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83872e294080x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83872e29408");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a83844ec32980x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83844ec3298_____org_apache_hupa_client_ui_LoginView_java0x03bc8a83844ec32980x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bf4170440x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bf4170440x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bf4170440x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bf417044");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838caed30f70x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838caed30f7_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838caed30f70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838be177a950x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838be177a950x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838be177a95");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838c0b2ef8e_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838c0b2ef8e0x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838c0b2ef8e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8386537e85a_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386537e85a0x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386537e85a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8386f9b9af30x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386f9b9af3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386f9b9af30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838f851ccd30x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838f851ccd30x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838f851ccd3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8389858b1a10x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8389858b1a10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8389858b1a1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8380x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8380x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8380x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8386f4305ba0x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386f4305ba0x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386f4305ba");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x0");
		// Wrapped elements from the html document
        usernameTextBox = TextBox.wrap(DOM.getElementById("email"));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x10x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x10x00x0");
		passwordTextBox = PasswordTextBox.wrap(DOM.getElementById("password"));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x20x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x20x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x20x0");
		initWidget(binder.createAndBindUi(this));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x30x0");
		imapPort.setText("");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x40x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x4");
		smtpPort.setText("");

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x50x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x5");
		usernameTextBox.setFocus(true);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x60x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x6");
		setLoading(false);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x7_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383bc8a8380x10x70x0");
		settingsPopup.setVisible(false);
    }

    @UiHandler("usernameTextBox")
    protected void onUser(KeyPressEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x0");
		if (e.getNativeEvent().getKeyCode() == KeyCodes.KEY_ENTER) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x00x1");
			new Timer() {
                @Override
				public void run() {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x00x1df6ad1900x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x00x1df6ad1900x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x00x1df6ad1900x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x00x1df6ad190");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x00x1df6ad1900x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8381987b0d90x30x00x10x00x00x00x1df6ad1900x20x00x0");
					passwordTextBox.setFocus(true);
                }
            }.schedule(100);
        }
    }

    @UiHandler("usernameTextBox")
    protected void onUser(ChangeEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8386c8f1c29");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8386c8f1c290x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386c8f1c290x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386c8f1c290x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386c8f1c290x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386c8f1c290x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8386c8f1c290x30x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8386c8f1c290x30x00x0");
		activity.loadSettings();
    }

    @UiHandler("passwordTextBox")
    protected void onPassword(KeyDownEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f782");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x30x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x30x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x30x00x00x0");
		if (e.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x30x00x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838dbd7f7820x30x00x10x0");
			submitButton.click();
        }
    }

    @UiHandler("submitButton")
    protected void onSubmit(ClickEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x0");
		System.out.println("ON sub");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x00x0");
		if (!usernameTextBox.getValue().isEmpty() &&
            !passwordTextBox.getValue().isEmpty()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x00x0");
			if (!settingsPopup.isShowing() &&
                    (imapServer.getValue().isEmpty()
                    || smtpServer.getValue().isEmpty()
                    || imapPort.getValue().isEmpty()
                    || smtpPort.getValue().isEmpty()
                    )) {
                       InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x10x00x0");
					settingsPopup.showRelativeTo(setupButton);
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x20x00x0");
				setLoading(true);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x20x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a327844e0x30x10x10x00x20x10x0");
				activity.doLogin();
            }
        }
    }

    @UiHandler("setupButton")
    protected void onSetup(ClickEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x30x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x30x0");
		if (settingsPopup.isShowing()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x30x00x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x30x00x10x00x0");
			settingsPopup.hide();
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x30x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x30x00x20x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8382b701ead0x30x00x20x0");
			settingsPopup.showRelativeTo(setupButton);
        }
    }

    @Override
    public HasValue<String> getUserNameValue() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838f06cac810x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838f06cac810x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838f06cac810x10x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838f06cac810x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838f06cac810x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838f06cac81");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838f06cac810x20x0");
		return usernameTextBox;
    }

    @Override
    public HasValue<String> getPasswordValue() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838cf09851a0x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838cf09851a0x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838cf09851a0x10x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838cf09851a0x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838cf09851a0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838cf09851a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838cf09851a0x20x0");
		return passwordTextBox;
    }

    @Override
    public void setLoading(boolean load) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x0");
		if (load) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x00x0");
			message.setVisible(true);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x00x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x00x1");
			submitButton.setEnabled(false);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x10x0");
			message.setVisible(false);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x10x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838bbfc8a2e0x30x00x10x10x0");
			submitButton.setEnabled(true);
        }
    }

    @Override
    public Widget asWidget() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838916a2d6d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838916a2d6d0x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838916a2d6d0x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838916a2d6d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838916a2d6d0x20x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838916a2d6d0x20x0");
		return this;
    }

    interface LoginViewUiBinder extends UiBinder<FlowPanel, LoginView> {
    }

    private static LoginViewUiBinder binder = GWT.create(LoginViewUiBinder.class);

    interface Style extends CssResource {
        String imapSetting();
    }

    @Override
    public void setSettings(Settings s) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x00x0");
		System.out.println("Settings " + settingsPopup.isShowing());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x1");
		imapServer.setValue(s.getImapServer());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x20x00x00x00x0");
		if(s.getImapPort() > 0)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x20x00x00x00x00x1");
		if(!(s.getImapPort() > 0))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x20x00x00x00x00x2");
		imapPort.setValue("" + (s.getImapPort() > 0 ? s.getImapPort() : ""));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x30x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x30x0");
		imapSecure.setValue(s.getImapSecure());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x40x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x40x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x4");
		smtpServer.setValue(s.getSmtpServer());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x50x00x00x00x0");
		if(s.getSmtpPort() > 0)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x50x00x00x00x00x1");
		if(!(s.getSmtpPort() > 0))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x50x00x00x00x00x2");
		smtpPort.setValue("" + (s.getSmtpPort() > 0 ? s.getSmtpPort() : ""));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x6_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x60x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383c36c2f10x30x60x0");
		smtpSecure.setValue(s.getSmtpSecure());
    }

    @Override
    public Settings getSettings(Settings s) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c83");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x0");
		s.setImapServer(imapServer.getValue());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x10x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x10x0");
		imapPort.setValue(imapPort.getValue().replaceAll("[^\\d]+", ""));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x20x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x2");
		if(imapPort.getValue().matches("\\d+")) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x20x10x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x20x10x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x20x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x20x10x0");
			s.setImapPort(Integer.valueOf(imapPort.getValue()));
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x30x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x30x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x3");
		s.setImapSecure(imapSecure.getValue());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x40x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x4_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x40x0");
		s.setSmtpServer(smtpServer.getValue());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x50x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x5_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x50x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x50x0");
		smtpPort.setValue(smtpPort.getValue().replaceAll("[^\\d]+", ""));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x6_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x60x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x60x0");
		if(smtpPort.getValue().matches("\\d+")) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x60x10x00x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x60x10x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x60x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x60x10x00x00x0");
			s.setSmtpPort(Integer.valueOf(smtpPort.getValue()));
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x70x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x7_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x70x0");
		s.setSmtpSecure(smtpSecure.getValue());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8383db74c830x30x8");
		return s;
    }

    @Override
    public void setActivity(LoginActivity loginActivity) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a7fc8183");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a7fc81830x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a7fc81830x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a7fc81830x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a7fc81830x3_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a7fc81830x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a838a7fc81830x30x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a838a7fc81830x30x00x0");
		activity = loginActivity;
    }

    @Override
    protected void onAttach() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x0");
		super.onAttach();
        new Timer() {@Override
		public void run() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x00x1df6ad1900x2_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x00x1df6ad1900x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x00x1df6ad1900x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x00x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x00x1df6ad190_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x00x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x1_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x00x1df6ad1900x20x0_____org_apache_hupa_client_ui_LoginView_java0x03bc8a8385cd6b07b0x20x10x00x00x1df6ad1900x20x00x0");
			activity.loadSettings();
        }}.schedule(800);
    }
}
