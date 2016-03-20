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
import org.apache.hupa.widgets.event.EditEvent;
import org.apache.hupa.widgets.event.EditHandler;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;

/**
 * TreeItem which supports editing
 *
 *
 */
public class EditableTreeItem extends TreeItem implements HasEditable,HasEditHandlers{
    protected TextBox editBox = new TextBox();
    protected String oldValue;
    protected Widget normalItem = new Label();
    protected HandlerManager manager = new HandlerManager(this);
    public EditableTreeItem() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b45333c95e_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b45333c95e0x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b45333c95e0x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b45333c95e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ddf17ed20x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ddf17ed20x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ddf17ed20x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ddf17ed20x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ddf17ed2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ddf17ed20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b474d006010x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b474d006010x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b474d006010x20x00x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b474d006010x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b474d006010x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b474d00601_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b474d006010x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4bd7423dc0x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4bd7423dc0x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4bd7423dc0x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4bd7423dc0x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4bd7423dc_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4bd7423dc0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x00x0");
		editBox.setWidth("100px");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x0");
		editBox.addKeyDownHandler(new KeyDownHandler() {

            public void onKeyDown(KeyDownEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x3_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x00x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x00x10x0");
				int code = event.getNativeKeyCode();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x1");
				switch (code) {
                // handle ENTER and ESCAPE keys
                case KeyCodes.KEY_ENTER:
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x0");
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x10x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x1");
					stopEdit();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x2");
					break;
                case KeyCodes.KEY_ESCAPE:
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x3");
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x40x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x4");
					cancelEdit();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x5");
					break;

                default:
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x6");
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x10x00x00x16421da4b0x30x10x7");
					break;
                }

            }

        });

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x2");
		// Just cancel the editing if the user click outside the TextBox
        editBox.addBlurHandler(new BlurHandler() {

            public void onBlur(BlurEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x13b22a491_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x13b22a4910x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x13b22a4910x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x13b22a4910x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x13b22a4910x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x13b22a4910x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x13b22a4910x30x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x20x00x00x13b22a4910x30x0");
				cancelEdit();
            }

        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x30x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4dc0a72b40x10x3");
		super.setWidget(normalItem);
    }


    @Override
    public void setText(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a5851856");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x3_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x30x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x30x0");
		editBox.setText(text);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x30x10x00x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x30x10x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x30x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x30x10x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4a58518560x30x10x00x0");
		((HasText)normalItem).setText(text);
    }


    @Override
    public void setWidget(Widget newWidget) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce7434");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x3_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x0");
		if (newWidget instanceof HasText) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x10x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x10x00x0");
			normalItem = newWidget;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x10x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x10x10x0");
			super.setWidget(newWidget);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x20x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b475ce74340x30x00x20x00x0");
			throw new IllegalArgumentException("Widget need to implement HasText");
        }
    }

    /*
     * (non-Javadoc)
     * @see org.apache.hupa.client.widgets.HasEditable#cancelEdit()
     */
    public void cancelEdit() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e9118614_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x20x00x0");
		showItem(oldValue);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x20x10x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x20x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x20x10x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4e91186140x20x10x0");
		manager.fireEvent(new EditEvent(EditEvent.EventType.Start,oldValue,null));
    }
    /*
     * (non-Javadoc)
     * @see org.apache.hupa.client.widgets.HasEditable#isEdit()
     */
    public boolean isEdit() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ef8b2f4b0x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ef8b2f4b0x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ef8b2f4b0x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ef8b2f4b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ef8b2f4b0x20x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ef8b2f4b0x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4ef8b2f4b0x20x0");
		return getWidget().equals(editBox);
    }

    /*
     * (non-Javadoc)
     * @see org.apache.hupa.client.widgets.HasEditable#startEdit()
     */
    public void startEdit() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x00x00x0");
		oldValue = getText();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x10x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x1");
		showEditBox(oldValue);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x20x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b44f1886e00x20x2");
		manager.fireEvent(new EditEvent(EditEvent.EventType.Start,oldValue,null));
    }

    /**
     * Show the editbox filled with the given value
     *
     * @param value
     */
    protected void showEditBox(String value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x3_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x0");
		super.setWidget(editBox);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x10x0");
		editBox.setText(value);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x20x0");
		editBox.setCursorPos(value.length());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x3_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b481f38fab0x30x30x0");
		editBox.setFocus(true);
    }


    /*
     * (non-Javadoc)
     * @see org.apache.hupa.client.widgets.HasEditable#stopEdit()
     */
    public void stopEdit() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b3796_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x2_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x20x00x00x0");
		showItem(editBox.getText());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x20x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x20x10x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x20x10x00x00x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x20x10x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b49b8b37960x20x10x0");
		manager.fireEvent(new EditEvent(EditEvent.EventType.Stop,oldValue,editBox.getText()));
    }

    /**
     * Show the "normal" item with the given text
     *
     * @param text
     */
    protected void showItem(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x3_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x30x00x00x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x30x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x30x00x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x30x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x30x00x00x0");
		((HasText)normalItem).setText(text);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x30x10x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4811c2dcb0x30x1");
		setWidget(normalItem);
    }

    @Override
    public String getText() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e20x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e20x20x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e20x20x00x00x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e20x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e20x20x00x00x00x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b47412d4e20x20x00x00x0");
		return ((HasText)normalItem).getText();
    }

    /*
     * (non-Javadoc)
     * @see org.apache.hupa.client.widgets.HasEditHandlers#addEditHandler(org.apache.hupa.client.widgets.EditHandler)
     */
    public HandlerRegistration addEditHandler(EditHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4b68efb710x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4b68efb710x20x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4b68efb710x1_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4b68efb71_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4b68efb710x3_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4b68efb710x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4b68efb710x30x0_____org_apache_hupa_widgets_ui_EditableTreeItem_java0x0dc0a72b4b68efb710x30x00x0");
		return manager.addHandler(EditEvent.TYPE, handler);
    }



}
