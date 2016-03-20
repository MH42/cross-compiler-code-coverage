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
import org.apache.hupa.widgets.WidgetsCSS;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

/**
 * Widget which shows a Loading state
 *
 */
public class Loading extends Composite {

    public Loading(String loadingMsg) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c652");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x1_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x0_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x2_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x20x0_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x20x00x00x00x0_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x20x00x0_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x20x00x00x0");
		initWidget(new HTML(loadingMsg));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x20x1_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65252f2316f0x20x10x0");
		addStyleName(WidgetsCSS.C_loading);
    }

    public Loading() {
        this("");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c652");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c6528f26c6520x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c6528f26c652_____org_apache_hupa_widgets_ui_Loading_java0x08f26c6528f26c6520x0_____org_apache_hupa_widgets_ui_Loading_java0x08f26c6528f26c6520x1");
    }

    /**
     * Show the Loading image
     */
    public void show() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c6529fb290510x2_____org_apache_hupa_widgets_ui_Loading_java0x08f26c6529fb290510x1_____org_apache_hupa_widgets_ui_Loading_java0x08f26c6529fb290510x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c6529fb29051");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c6529fb290510x20x00x0_____org_apache_hupa_widgets_ui_Loading_java0x08f26c6529fb290510x20x0");
		setVisible(true);
    }

    /**
     * Hide the Loading image
     */
    public void hide() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c65293c8c96b0x2_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65293c8c96b0x1_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65293c8c96b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c65293c8c96b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_Loading_java0x08f26c65293c8c96b0x20x00x0_____org_apache_hupa_widgets_ui_Loading_java0x08f26c65293c8c96b0x20x0");
		setVisible(false);
    }

}
