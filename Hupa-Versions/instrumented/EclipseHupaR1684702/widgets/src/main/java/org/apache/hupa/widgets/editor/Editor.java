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
package org.apache.hupa.widgets.editor;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.logical.shared.InitializeEvent;
import com.google.gwt.event.logical.shared.InitializeHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.RichTextArea;

/**
 * Wysiwyg editor for composing and editing emails in Hupa
 */
@SuppressWarnings("deprecation")
public class Editor extends FlowPanel implements HasHTML, Focusable {

    RichTextArea area = new RichTextArea();
    boolean isNewMessage = true;

    public Editor() {
        this((ToolbarConstants) GWT.create(ToolbarConstants.class));
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef69ca86e_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef69ca86e0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef69ca86e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f818_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec7e9fb2e0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec7e9fb2e0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec7e9fb2e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec7e9fb2e0x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec7e9fb2e0x10x00x00x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec7e9fb2e0x10x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec7e9fb2e0x10x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb70x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb70x10x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb70x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb7_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e702d758c0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e702d758c0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e702d758c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e");
    }

    public Editor(ToolbarConstants constants) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef69ca86e_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef69ca86e0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef69ca86e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f818_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f4_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb70x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb70x10x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb70x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb7_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ef0a2ebb70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e702d758c0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e702d758c0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e702d758c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x0");
		area.ensureDebugId("hupa-editor-area");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x1");
		area.setHeight("100%");

//        Toolbar toolbar = new Toolbar(area, constants);
//        toolbar.ensureDebugId("hupa-editor-toolbar");

InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x2");
		//        super.add(toolbar);
        super.add(area);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x30x0");
		setWidth("100%");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x40x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x4");
		setHeight("100%");

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x5_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x0");
		/*
         * Note: rich-area is created in an iframe, so Hupa's style sheets are
         * not available, unless we inject them to the generated iframe
         *
         * When body is available, we put the default style for messages:
         */
        area.addInitializeHandler(new InitializeHandler() {
            @Override
			public void onInitialize(InitializeEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x30x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x30x0");
				setBodyStyleAttribute("fontFamily", "arial");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x30x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x50x00x00x1d74fdfd10x30x1");
				setBodyStyleAttribute("fontSize", "12px");
            }
        });

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x60x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x6_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x60x0");
		/*
         * When the users writes in-line comments in replies, the text has to be
         * leftIdented. Right now, I've implemented this feature only in gecko
         * browsers, for other browsers the user has to push the leftIdent
         * button.
         */
        if (getUA().equals("ff")) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x60x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb99c08f40x20x60x10x00x0");
			addNewlineHandlersForFireFox();
		}

    }

    public RichTextArea getArea(){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb21bf3680x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb21bf3680x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb21bf368_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb21bf3680x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb21bf3680x20x0");
		return area;
    }

    @Override
    public void setSize(String width, String height) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x4_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x40x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e70713d8a0x40x00x0");
		area.setSize(width, height);
    }

    @Override
    public void setWidth(String width) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x30x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x30x0");
		super.setWidth(width);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x30x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec054ed2f0x30x10x0");
		area.setWidth(width);
    }

    @Override
    public void setHeight(String height) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a705");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x30x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x30x0");
		super.setHeight(height);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x30x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb7c6a7050x30x10x0");
		area.setHeight(height);
    }

    @Override
	public String getHTML() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e43c8f1540x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e43c8f1540x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e43c8f1540x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e43c8f154");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e43c8f1540x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e43c8f1540x20x00x0");
		return area.getHTML();
    }

    @Override
	public void setHTML(String html) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x30x00x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x30x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x30x00x00x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x30x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x30x0");
		isNewMessage = html.trim().length() > 0;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x30x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e91bfa2e40x30x10x0");
		area.setHTML(html);
    }

    @Override
	public String getText() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7412d4e2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7412d4e20x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7412d4e20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7412d4e20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7412d4e20x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7412d4e20x20x00x0");
		return area.getText();
    }

    @Override
	public void setText(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ea58518560x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ea58518560x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ea58518560x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ea58518560x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ea58518560x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ea5851856");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ea58518560x30x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ea58518560x30x0");
		area.setText(text);
    }

    public void setBodyStyleAttribute(final String key, final String value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x30x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x4_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x30x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd850205_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x20x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x40x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x40x00x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x40x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edd8502050x40x00x00x0");
		DOM.setStyleAttribute(getBody(area.getElement()), key, value);
    }

    @Override
	public int getTabIndex() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec31f4a62");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec31f4a620x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec31f4a620x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec31f4a620x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec31f4a620x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2ec31f4a620x20x00x0");
		return area.getTabIndex();
    }

    @Override
	public void setAccessKey(char key) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e745f99010x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e745f99010x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e745f99010x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e745f99010x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e745f99010x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e745f9901");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e745f99010x30x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e745f99010x30x00x0");
		area.setAccessKey(key);
    }

    @Override
	public void setFocus(boolean focused) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edbdd55970x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edbdd55970x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edbdd55970x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edbdd55970x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edbdd55970x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edbdd5597");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edbdd55970x30x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2edbdd55970x30x0");
		area.setFocus(focused);
    }

    @Override
	public void setTabIndex(int index) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb0a06ae5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb0a06ae50x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb0a06ae50x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb0a06ae50x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb0a06ae50x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb0a06ae50x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb0a06ae50x30x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2eb0a06ae50x30x00x0");
		area.setTabIndex(index);
    }

    // isEnabled and setEnabled dont work in richtextarea due to a bug,
    // I've sent a patch to gwt, when it is accepted this native methods can be
    // removed
    public void setEnabled(boolean b) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d0x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d0x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d0x30x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d0x30x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e7b72bb9d0x30x0");
		setEnabled(area.getElement(), b);
    }

    public boolean isEnabled() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e67d5de1e0x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e67d5de1e0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e67d5de1e0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e67d5de1e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e67d5de1e0x20x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e67d5de1e0x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e67d5de1e0x20x00x0");
		return isEnabled(area.getElement());
    }

    private native void setEnabled(Element iframe, boolean b) /*-{
                                                                var doc = iframe.contentWindow.document;
                                                                if (doc.body.contentEditable)
                                                                doc.body.contentEditable = b;
                                                                else
                                                                doc.designMode = b ? 'On' : 'Off';
                                                                }-*/;

    private native boolean isEnabled(Element iframe) /*-{
                                                        var doc = iframe.contentWindow.document;
                                                        alert((doc.designMode.toUpperCase()) == 'ON');
                                                        if (doc.body.contentEditable) {
                                                        alert("editable ???");
                                                        return doc.body.contentEditable;
                                                        } else {
                                                        var ret = (((doc.designMode).toUpperCase()) == 'ON') ? true : false;
                                                        alert(ret);
                                                        return ret;
                                                        }
                                                        }-*/;

    private native Element getBody(Element frame) /*-{
                                                    return frame.contentWindow.document.body;
                                                    }-*/;

    private void addNewlineHandlersForFireFox() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f30_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x0");
		area.addClickHandler(new ClickHandler() {
            @Override
			public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1208950cc0x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1208950cc0x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1208950cc0x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1208950cc0x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1208950cc0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1208950cc0x30x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x00x00x00x1208950cc0x30x00x0");
				doNline = true;
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x0");
		area.addFocusHandler(new FocusHandler() {
            @Override
			public void onFocus(FocusEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1f1b08ca4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1f1b08ca40x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1f1b08ca40x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1f1b08ca40x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1f1b08ca40x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1f1b08ca40x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1f1b08ca40x30x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x10x00x00x1f1b08ca40x30x00x0");
				doNline = true;
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x0");
		area.addKeyPressHandler(new KeyPressHandler() {
            @Override
			public void onKeyPress(KeyPressEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x1_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x3_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x0");
				if (!isNewMessage) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x00x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x0");
					if (doNline && event.getCharCode() == KeyCodes.KEY_ENTER) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x10x00x0");
						doNline = false;
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x10x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x10x1");
						leftIdentTimer.schedule(10);
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x10x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x00x10x2");
						event.preventDefault();
                    }
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x10x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x1");
					if (!doNline
                            && (event.getCharCode() == KeyCodes.KEY_DOWN || event.getCharCode() == KeyCodes.KEY_UP)) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x10x1");
								InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x10x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e40688f300x20x20x00x00x1f76c84f20x30x00x10x10x10x00x0");
						doNline = true;
                    }
                }
            }
        });

    }

    boolean doNline = true;
    private final Timer leftIdentTimer = new Timer() {
        @Override
		public void run() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad190");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x2_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x20x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x20x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x20x00x00x0");
			area.getFormatter().insertHTML("<br/>\n");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x20x10x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x20x10x00x0_____org_apache_hupa_widgets_editor_Editor_java0x0c7e9fb2e1f32f8180x30x00x1df6ad1900x20x1");
			area.getFormatter().leftIndent();
        }
    };

    private native String getUA() /*-{
                                    var ua = navigator.userAgent.toLowerCase();
                                    if (ua.indexOf("gecko") != -1)
                                    return "ff";
                                    return "other";
                                    }-*/;

}
