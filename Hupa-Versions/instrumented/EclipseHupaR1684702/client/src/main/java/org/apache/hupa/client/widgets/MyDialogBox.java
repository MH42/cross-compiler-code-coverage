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

package org.apache.hupa.client.widgets;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.HupaCSS;

import com.google.gwt.user.client.ui.DialogBox;

public class MyDialogBox extends DialogBox implements HasDialog{
    public MyDialogBox () {
        super();
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2dceb36e2d0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2dceb36e2d0x10x1_____org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2dceb36e2d0x10x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2d0x0_____org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2d0x2_____org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2d_____org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2dceb36e2d0x1_____org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2dceb36e2d_____org_apache_hupa_client_widgets_MyDialogBox_java0x0ceb36e2dceb36e2d0x0");
        super.addStyleName(HupaCSS.C_dialog);
    }

}
