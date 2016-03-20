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
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

import org.apache.hupa.widgets.WidgetsCSS;

/**
 * Hyperlink which can get enabled/disabled.
 *
 * CSS rules:
 * <pre>
    .hupa-hyperlink .gwt-Hyperlink {
        color: #0d0eb0;
        text-decoration: underline;
        cursor: default;
    }
    .hupa-hyperlink .gwt-Hyperlink-disabled {
        color: #8d8d8d;
    }
 * </pre>
 */
public class EnableHyperlink extends Composite implements HasClickHandlers,HasHTML,HasText, HasEnable{

    private SimplePanel panel = new SimplePanel();
    private Widget link;
    private HTML html;

    public EnableHyperlink(String text) {
        this(text, false, null);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b6_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1d3afdd750x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1d3afdd750x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1d3afdd75_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1d3afdd750x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1d3afdd750x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1d3afdd750x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a189945675_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x20x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1");
    }

    public EnableHyperlink(String text, String historyToken) {
        this(text, false, historyToken);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a16664f1e40x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a16664f1e4_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a16664f1e40x3_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a16664f1e40x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a16664f1e40x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a16664f1e40x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a16664f1e40x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a16664f1e40x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b6_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a189945675_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x20x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1");
    }

    public EnableHyperlink(String text, boolean asHTML, String historyToken) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b6_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1950a39b60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a189945675_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x20x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1899456750x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14f0aa52d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x30x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x3_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x10x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x4");
		if(historyToken != null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x00x00x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x00x00x0");
		if(!(historyToken != null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x00x00x00x2");
		link = historyToken != null ? new Hyperlink(text, asHTML, historyToken) : new Anchor(text);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x10x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x10x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x10x00x00x0");
		html = new HTML();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x20x0");
		panel.setStyleName(WidgetsCSS.C_hyperlink);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x30x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x30x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x3");
		html.setStyleName(link.getStyleName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x40x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x4");
		html.addStyleDependentName("disabled");

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x5");
		if (asHTML) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x50x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x50x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x50x00x0");
			html.setHTML(text);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x50x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x50x10x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x50x10x00x0");
			html.setText(text);
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x6_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x60x0");
		panel.setWidget(link);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x7_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a14b03927a0x40x70x0");
		initWidget(panel);
    }
    /*
     * (non-Javadoc)
     * @see com.google.gwt.event.dom.client.HasClickHandlers#addClickHandler(com.google.gwt.event.dom.client.ClickHandler)
     */
    public HandlerRegistration addClickHandler(ClickHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x3_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x30x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x30x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x30x00x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x30x00x00x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1e9eb51e20x30x00x0");
		return ((HasClickHandlers)link).addClickHandler(handler);
    }

    /*
     * (non-Javadoc)
     * @see com.google.gwt.user.client.ui.HasText#getText()
     */
    public String getText() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e20x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e20x20x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e20x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e20x20x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e20x20x00x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a17412d4e20x20x00x00x00x00x0");
		return ((HasHTML)link).getText();
    }

    /*
     * (non-Javadoc)
     * @see com.google.gwt.user.client.ui.HasText#setText(java.lang.String)
     */
    public void setText(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a5851856_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x3_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x30x00x00x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x30x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x30x00x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x30x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x30x00x0");
		((HasHTML)link).setText(text);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x30x10x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a1a58518560x30x1");
		html.setText(text);
    }

    /*
     * (non-Javadoc)
     * @see com.google.gwt.user.client.ui.HasHTML#getHTML()
     */
    public String getHTML() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f154_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f1540x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f1540x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f1540x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f1540x20x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f1540x20x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f1540x20x00x00x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f1540x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a143c8f1540x20x00x00x00x0");
		return ((HasHTML)link).getHTML();
    }

    /*
     * (non-Javadoc)
     * @see com.google.gwt.user.client.ui.HasHTML#setHTML(java.lang.String)
     */
    public void setHTML(String html) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a191bfa2e40x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a191bfa2e40x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a191bfa2e40x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a191bfa2e40x3_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a191bfa2e40x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a191bfa2e4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a191bfa2e40x30x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a191bfa2e40x30x00x0");
		this.html.setHTML(html);
    }

    /*
     * (non-Javadoc)
     * @see org.apache.hupa.client.widgets.HasEnable#setEnabled(boolean)
     */
    public void setEnabled(boolean enable) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x20x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x2_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x1_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x30x0");
		if (enable) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x30x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x30x00x00x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x30x00x00x0");
			panel.setWidget(link);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x30x00x10x00x0_____org_apache_hupa_widgets_ui_EnableHyperlink_java0x028fba2a19cfed9bb0x30x00x10x0");
			panel.setWidget(html);
        }
    }

}
