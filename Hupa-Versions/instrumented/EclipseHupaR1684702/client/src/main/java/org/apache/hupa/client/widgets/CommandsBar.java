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
import org.apache.hupa.widgets.ui.Loading;
import org.cobogw.gwt.user.client.ui.Button;
import org.cobogw.gwt.user.client.ui.ButtonBar;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Widget;

/**
 * A panel with three parts,
 * left has a button bar
 * right has a bunch of links
 * center has a loading widget
 */
public class CommandsBar extends Composite {

    Grid buttonPanel = new Grid(1, 3);
    ButtonBar buttonBarLeft = new ButtonBar();
    ButtonBar buttonBarRight = new ButtonBar();

    public CommandsBar() {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x1_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb2ba8503e0x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb2ba8503e0x10x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb2ba8503e0x10x00x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb2ba8503e_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb2ba8503e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb872a66b80x1_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb872a66b80x10x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb872a66b80x10x00x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb872a66b8_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb872a66b80x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb24184ca5_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb24184ca50x1_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb24184ca50x10x00x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb24184ca50x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb24184ca50x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x00x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x0");
		buttonPanel.addStyleName(HupaCSS.C_commands_bar);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x10x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x1");
		buttonBarLeft.addStyleName(HupaCSS.C_buttons);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x20x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x2");
		buttonBarRight.addStyleName(HupaCSS.C_buttons);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x3_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x30x0");
		buttonPanel.setWidget(0, 0, buttonBarLeft);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x40x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x4");
		buttonPanel.setWidget(0, 2, buttonBarRight);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x5_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x50x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x50x00x0");
		buttonPanel.getCellFormatter().setWidth(0, 1, "100%");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x60x00x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x6_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x60x0");
		buttonPanel.getCellFormatter().setHorizontalAlignment(0, 1, HasHorizontalAlignment.ALIGN_CENTER);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x70x00x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x7_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x70x0");
		buttonPanel.getCellFormatter().setHorizontalAlignment(0, 2, HasHorizontalAlignment.ALIGN_LEFT);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x8_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb80358adb0x10x80x0");
		initWidget(buttonPanel);
    }

    public void add(Widget w) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x2_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x3_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x1_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df2_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x20x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x00x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x0");
		if (w instanceof Button) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x10x00x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x10x0");
			addLeft(w);
        } else if ( w instanceof Loading) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x20x10x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x20x10x00x0");
			buttonPanel.setWidget(0, 1, w);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x20x20x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbac9f3df20x30x00x20x20x00x0");
			addRight(w);
        }
    }

    public void addLeft(Widget w) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbb6294a550x3_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbb6294a55_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbb6294a550x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbb6294a550x1_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbb6294a550x20x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbb6294a550x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbb6294a550x30x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbb6294a550x30x00x0");
		buttonBarLeft.add(w);
    }

    public void addRight(Widget w) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbef20bbba_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbef20bbba0x1_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbef20bbba0x20x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbef20bbba0x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbef20bbba0x3_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbef20bbba0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbef20bbba0x30x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbef20bbba0x30x00x0");
		buttonBarRight.add(w);
    }

    public void clear() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x1_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x2_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x20x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x20x00x0");
		buttonBarLeft.clear();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x20x10x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x20x1");
		buttonBarRight.clear();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x20x2_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adb168cbb2e0x20x20x0");
		buttonPanel.setText(0, 1, "");
    }

    public boolean remove(Widget w) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbc8ae8ac40x2_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbc8ae8ac40x20x0_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbc8ae8ac40x1_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbc8ae8ac40x3_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbc8ae8ac4_____org_apache_hupa_client_widgets_CommandsBar_java0x080358adbc8ae8ac40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_CommandsBar_java0x080358adbc8ae8ac40x30x0");
		return false;
    }



}
