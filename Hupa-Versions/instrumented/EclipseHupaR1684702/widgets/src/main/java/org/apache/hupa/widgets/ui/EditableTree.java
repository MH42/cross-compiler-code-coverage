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
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;

/**
 * Tree which can holds EditableTreeItem instances
 *
 *
 */
public class EditableTree extends Tree {
    public EditableTree(Tree.Resources images, boolean leaf) {
        super(images, leaf);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a4350fea4770x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a4350fea4770x1_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a4350fea4770x2_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a4350fea477_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a4350fea4770x10x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a4350fea4770x20x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a4350fea4770x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a4350fea4770x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43");
    }

    public EditableTree() {
        super();
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43dbd94a430x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43dbd94a43_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43dbd94a430x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43dbd94a430x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43");
    }

    public EditableTree(Tree.Resources images) {
        super(images);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43cd8a6ca70x10x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43cd8a6ca7_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43cd8a6ca70x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43cd8a6ca70x2_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43cd8a6ca70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43cd8a6ca70x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43");
    }

    /**
     * Prevent  Event.ONCLICK, Event.ONMOUSEDOWN, Event.ONKEYDOWN from bubble down if the item is in editing mode
     */
    public void onBrowserEvent(Event event) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x20x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x3_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x2_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a8777");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x00x10x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x00x1_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x00x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x0");
		TreeItem item = getSelectedItem();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x00x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x1_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x0");
		// Check if the selectedItem is Editable and if so make sure the events are not fired
        if (item instanceof HasEditable) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x00x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x00x10x00x00x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x00x10x00x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x00x10x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x00x1");
			if (item != null && ((HasEditable) item).isEdit()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x00x1_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x00x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x00x10x0");
				int type = DOM.eventGetType(event);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x1");
				switch (type) {
                case Event.ONCLICK:
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x10x0");
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x10x1");
					return;
                case Event.ONMOUSEDOWN:
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x10x2");
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x10x3");
					return;
                case Event.ONKEYDOWN:
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x10x4");
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x10x5");
					return;
                default:
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x10x6");
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x10x10x00x10x10x7");
					break;
                }
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x20x0_____org_apache_hupa_widgets_ui_EditableTree_java0x0dbd94a43e40a87770x30x2");
		super.onBrowserEvent(event);
    }
}
