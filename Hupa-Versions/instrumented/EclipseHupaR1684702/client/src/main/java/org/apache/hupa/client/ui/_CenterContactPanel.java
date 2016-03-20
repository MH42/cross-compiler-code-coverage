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
import java.util.Arrays;
import java.util.List;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy.KeyboardSelectionPolicy;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

public class _CenterContactPanel extends Composite {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4477430f50x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4477430f50x30x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4477430f50x3_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4477430f50x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4477430f50x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4477430f5");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc0x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc0x40x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc0x30x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc0x30x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc0x4_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc0x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc0x3_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e485cebfdc0x1");
	}
	
	@UiField SplitLayoutPanel thisPanel;

    @UiField SimpleLayoutPanel settingsTab;

    @UiField SimpleLayoutPanel labelListContainer;
    @UiField SimplePanel labelPropertiesContainer;

    public _CenterContactPanel() {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c41266d0x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c41266d0x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c41266d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4155bda910x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4155bda910x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4155bda91");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e4_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e499a54f500x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e499a54f50_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e499a54f500x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4bf636df9_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4bf636df90x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4bf636df90x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e40x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e40x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e20x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e20x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e20x00x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e20x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e480x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e480x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e480x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e480x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x10x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x10x00x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x10x00x00x00x0");
		initWidget(binder.createAndBindUi(this));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x10x10x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x10x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4ed5d27e40x10x10x0");
		settingsTab.setWidget(createTabList());
    }

    private static final List<String> TABS = Arrays.asList("Folders");

    private CellList<String> createTabList() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x00x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x10x00x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x10x00x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x10x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x10x00x00x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x10x00x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x0");
		CellList<String> cellList = new CellList<String>(new SpanCell());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x1");
		cellList.setKeyboardSelectionPolicy(KeyboardSelectionPolicy.ENABLED);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x20x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x20x00x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x20x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x10x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x20x20x00x00x1");
		final SingleSelectionModel<String> selectionModel = new SingleSelectionModel<String>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x30x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x3");
		cellList.setSelectionModel(selectionModel);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x4");
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            public void onSelectionChange(SelectionChangeEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x3_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a24198_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x30x00x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x30x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x30x00x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x30x00x0");
				String selected = selectionModel.getSelectedObject();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x30x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x30x1");
				if (selected != null) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x40x00x00x112a241980x30x10x1");
                    // Window.alert("You selected: " + selected);
                }
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x50x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x5_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x50x00x0");
		cellList.setRowCount(TABS.size(), true);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x6_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x60x0");
		// Push the data into the widget.
        cellList.setRowData(0, TABS);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e41436900a0x20x7");
		return cellList;
    }

    static class SpanCell extends AbstractCell<String> {

        public SpanCell() {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c41266d0x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c41266d0x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c41266d");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4155bda910x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4155bda910x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4155bda91");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e499a54f500x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e499a54f50_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e499a54f500x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4bf636df9_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4bf636df90x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4bf636df90x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e40x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e40x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e20x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e20x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e20x00x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c94287e20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e485b087e48_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e485b087e480x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e485b087e480x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e480x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e480x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e480x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e480x10x1");
        }

        @Override
        public void render(Context context, String value, SafeHtmlBuilder sb) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x4_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x30x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x40x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x20x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x3_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x5_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x0");
			if (value == null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x00x10x0");
				return;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x10x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x1");
			sb.appendHtmlConstant("<span style='display: block;color: #376572;text-shadow: 0px 1px 1px #fff;text-decoration: none;cursor: default;padding: 6px 8px 2px 8px;height: 17px;white-space: nowrap;'>");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x20x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x2");
			sb.appendHtmlConstant(value);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x30x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e45b087e48dccb335f0x50x3");
			sb.appendHtmlConstant("</span>");
        }
    }

    interface _CeterSettingPanelUiBinder extends UiBinder<SplitLayoutPanel, _CenterContactPanel> {
    }

    private static _CeterSettingPanelUiBinder binder = GWT.create(_CeterSettingPanelUiBinder.class);

    public AcceptsOneWidget getContactListView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b9_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf88450x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf88450x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf88450x3_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf88450x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf88450x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e43c8297b90x20x00x00x199bf88450x30x0");
				labelListContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }

    public AcceptsOneWidget getContactPropertiesView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c2718570_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x0");
		return new AcceptsOneWidget() {
            @Override
            public void setWidget(IsWidget w) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf88450x1_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf88450x2_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf88450x3_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf88450x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf88450x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf8845");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf88450x30x00x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf88450x30x00x0_____org_apache_hupa_client_ui__CenterContactPanel_java0x0ed5d27e4c27185700x20x00x00x199bf88450x30x0");
				labelPropertiesContainer.setWidget(Widget.asWidgetOrNull(w));
            }
        };
    }
}
