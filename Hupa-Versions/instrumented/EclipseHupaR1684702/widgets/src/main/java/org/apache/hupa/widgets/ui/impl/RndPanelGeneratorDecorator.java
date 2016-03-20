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
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Panel;

/**
 * Simple generator of rounded panels using DecoratedPanels in GWT 2.0.
 * It works in all browsers
 */
public class RndPanelGeneratorDecorator implements RndPanelGenerator {
    public RndPanelGeneratorDecorator(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f8281");
	}
	

	public Panel roundPanel(Panel panel) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x20x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x3_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x2_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x30x00x10x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x30x00x1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x30x00x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x30x00x10x00x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x30x0");
		DecoratorPanel ret = new DecoratorPanel();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x30x1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x30x10x0");
		ret.setWidget(panel);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82811fabd4c00x30x2");
		return ret;
    }

    public FlowPanel createPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82815f4e93a10x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82815f4e93a10x2_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82815f4e93a10x1_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82815f4e93a1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82815f4e93a10x20x00x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82815f4e93a10x20x00x00x0_____org_apache_hupa_widgets_ui_impl_RndPanelGeneratorDecorator_java0x03f6f82815f4e93a10x20x0");
		return new FlowPanel();
    }
}
