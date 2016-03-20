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
import com.google.gwt.event.dom.client.HasMouseMoveHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * A ToolTip which is shown a configured time before get destroyed
 *
 *
 */
public class ToolTip extends Label {
    private int y = 0;
    private int x = 0;
    private final PopupPanel popup = new PopupPanel();
    private final Timer showTimer = new Timer() {

        @Override
        public void run() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1df6ad190");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1df6ad1900x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1df6ad1900x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1df6ad1900x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1df6ad1900x20x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1df6ad1900x20x0");
			popup.setPopupPosition(y,x);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1df6ad1900x20x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1df6ad1900x20x10x0");
			popup.show();
        }

    };

    public <T extends Widget & HasMouseOverHandlers & HasMouseOutHandlers & HasMouseMoveHandlers> ToolTip(final T w) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x10x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x20x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x10x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x10x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x10x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x20x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f5_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5ef9f160f0x30x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5b85c0c07_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5b85c0c070x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5b85c0c070x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5b85c0c070x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5448d43ad0x30x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5448d43ad0x30x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5448d43ad0x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5448d43ad0x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5448d43ad_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5448d43ad0x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5448d43ad0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c58bdf21360x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c58bdf21360x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c58bdf2136_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c58bdf21360x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x0");
		w.addMouseOverHandler(new MouseOverHandler() {

            public void onMouseOver(MouseOverEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x187b730200x20x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x187b730200x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x187b730200x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x187b73020_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x187b730200x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x187b730200x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x187b730200x30x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x00x00x00x187b730200x30x0");
				showTimer.schedule(1000);
            }

        });

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x0");
		w.addMouseOutHandler(new MouseOutHandler() {

            public void onMouseOut(MouseOutEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x20x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e06187_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x30x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x30x00x0");
				showTimer.cancel();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x30x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x10x00x00x171e061870x30x10x0");
				popup.hide();
            }

        });

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x1");
		w.addMouseMoveHandler(new MouseMoveHandler() {

            public void onMouseMove(MouseMoveEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x20x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab266");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x30x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x30x00x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x30x00x0");
				y = event.getScreenY();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x30x10x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x30x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x30x10x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x30x10x00x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x20x00x00x155eab2660x30x10x00x00x1");
				x = w.getAbsoluteTop() + w.getOffsetHeight();
            }

        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x00x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x00x0");
		popup.addCloseHandler(new CloseHandler<PopupPanel>() {

            public void onClose(CloseEvent<PopupPanel> event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d53_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x20x00x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x20x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x20x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x30x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x30x00x00x15e0c0d530x30x00x0");
				showTimer.cancel();
            }

        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x4_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x40x0");
		addStyleName("hupa-ToolTip");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x50x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x5");
		popup.addStyleName("hupa-ToolTip");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x60x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x6");
		popup.setAnimationEnabled(true);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x70x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5c512f0f50x30x7");
		popup.setAutoHideEnabled(true);
    }

    public void setText(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x3_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x2_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a5851856_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x20x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x30x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x30x00x0");
		super.setText(text);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x30x10x00x0_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x30x1_____org_apache_hupa_widgets_ui_ToolTip_java0x09c0f05c5a58518560x30x10x0");
		popup.setWidget(this);
    }


}
