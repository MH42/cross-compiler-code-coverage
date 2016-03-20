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

package org.apache.hupa.widgets.ui;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.TextBox;

/**
 * TextBox which only allows numbers to get entered
 *
 *
 */
public class NumberOnlyTextBox extends TextBox implements KeyPressHandler{

    public NumberOnlyTextBox() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d0339980d03399_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d0339980d033990x0_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d0339980d033990x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d0339980d033990x10x00x0_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d0339980d033990x10x0_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d0339980d033990x10x00x00x0");
		addKeyPressHandler(this);
    }

    /*
     * (non-Javadoc)
     * @see com.google.gwt.event.dom.client.KeyPressHandler#onKeyPress(com.google.gwt.event.dom.client.KeyPressEvent)
     */
    public void onKeyPress(KeyPressEvent event) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x20x0_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x3_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x2_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f2_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x1_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x0_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x00x0_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x00x1_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x00x10x0");
		char keyCode = event.getCharCode();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x1_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x10x00x0_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x10x0");
		if (!Character.isDigit(keyCode)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x10x10x0_____org_apache_hupa_widgets_ui_NumberOnlyTextBox_java0x080d03399f76c84f20x30x10x10x00x0");
			cancelKey();
        }
    }

}
