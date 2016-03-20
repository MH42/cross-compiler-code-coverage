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

package org.apache.hupa.widgets.ui.impl;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.widgets.WidgetsCSS;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Panel;

/**
 * Simple generator of rounded panels using css.
 * It works in FF, safari, chrome and opera.
 *
 * It is needed to define this in your css.
 * <pre>
 *  div.hupa-rounded {
 *       border: 1px solid #7FAAFF;
 *       border-radius: 8px;
 *     }
 * </pre>
 *
 */
public class RndPanelGeneratorCss3 implements RndPanelGenerator {

    public RndPanelGeneratorCss3(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea620");
	}
	

	public Panel roundPanel(Panel panel) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c00x20x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c00x1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c00x3_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c00x2_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c00x30x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c00x30x00x0");
		panel.addStyleName(WidgetsCSS.C_hupa_rnd_container);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6201fabd4c00x30x1");
		return panel;
    }

    public FlowPanel createPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x2_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x0");
		return new FlowPanel() {
            @Override
            public void setStyleName(String style) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x20x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x3_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x2_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x30x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x30x00x0");
				super.setStyleName(style);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x30x10x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorCss3_java0x09a7ea6205f4e93a10x20x00x00x16d69ab6e0x30x1");
				super.addStyleName(WidgetsCSS.C_hupa_rnd_container);
            }
        };
    }
}
