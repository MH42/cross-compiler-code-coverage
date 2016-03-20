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
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

import org.apache.hupa.widgets.ui.impl.RndPanelGenerator;

/**
 * Widget which renders a rounded panel.
 *
 * This is here because IE doesn't support rounded borders in css,
 * so it is needed to wrap the container with additional html elements.
 *
 * For other browsers this class just produces a class-named FlowPanel.
 *
 */
public class RndPanel extends Composite {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cdd4e42420x4_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cdd4e42420x40x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cdd4e42420x2_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cdd4e42420x1_____org_apache_hupa_widgets_ui_RndPanel_java0x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cdd4e42420x3_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cdd4e4242_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cdd4e42420x0");
	}
	

	private static final RndPanelGenerator impl = GWT.create(RndPanelGenerator.class);

    private FlowPanel panel = new FlowPanel();

    public RndPanel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c0x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c0x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c60e3131f0x20x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c60e3131f0x20x00x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c60e3131f_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c60e3131f0x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c60e3131f0x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c60e3131f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c0x10x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c0x10x00x00x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c0x10x00x0");
		panel = impl.createPanel();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c0x10x10x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c0x10x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c1761334c0x10x10x00x0");
		initWidget(impl.roundPanel(panel));
    }

    public void add(Widget child) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc30a5e9e0x2_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc30a5e9e0x3_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc30a5e9e0x20x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc30a5e9e0x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc30a5e9e0x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc30a5e9e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc30a5e9e0x30x00x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc30a5e9e0x30x0");
		panel.add(child);
    }

    public void insert(Widget w, int beforeIndex) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x3_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x2_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x4_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c77978_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x20x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x40x00x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c58c779780x40x0");
		panel.insert(w, beforeIndex);
    }

    public void clear() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c168cbb2e0x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c168cbb2e_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c168cbb2e0x2_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c168cbb2e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334c168cbb2e0x20x00x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334c168cbb2e0x20x0");
		panel.clear();
    }

    public boolean remove(Widget w) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc8ae8ac40x3_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc8ae8ac40x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc8ae8ac40x20x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc8ae8ac40x2_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc8ae8ac4_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc8ae8ac40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc8ae8ac40x30x00x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cc8ae8ac40x30x0");
		return panel.remove(w);
    }

    public void setWidget(Widget w) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x2_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x3_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x20x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee991_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x30x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x30x00x0");
		panel.clear();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x30x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cbffee9910x30x10x0");
		panel.add(w);
    }

    @Override
    public void addStyleName(String style) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be10x1_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be10x2_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be10x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be10x20x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be10x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be10x30x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be10x30x00x00x0_____org_apache_hupa_widgets_ui_RndPanel_java0x01761334cedeb1be10x30x00x0");
		getWidget().addStyleName(style);
    }

}
