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
/**
 * Much of this code has been taken from the GWT Showcase example
 * which is licensed under Apache License v2.0
 *
 * This class is necessary while GWT library doesn't provide any
 * toolbar to be used with its RichTextArea widget.
 */
package org.apache.hupa.widgets.editor;


import tc3.shared.InstrumentationLoggerProvider;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.logical.shared.HasValueChangeHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.RichTextArea.FontSize;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Font picker for rich editor
 */
@SuppressWarnings("deprecation")
public class FontPicker extends PopupPanel implements ClickHandler, HasValueChangeHandlers<FontPicker> {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x4_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x40x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x40x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x3_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be422db03e0x40x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f921_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x3_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x40x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x40x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x4_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7becad0f9210x40x00x0");
	}
	

	private class FontCell extends HTML {
        String cellFont;

		public FontCell(String font) {
            super(font);
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e0x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e0x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e0x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be20ec4f430x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be20ec4f430x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be20ec4f430x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be20ec4f43");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bec65457cb38514922_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bec65457cbe7785011");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bec65457cb0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bec65457cb");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x5");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x20x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x3_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x30x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x4_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf442_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed40x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed40x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed4");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed42df3a49b0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed42df3a49b0x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed42df3a49b");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be");
            this.cellFont = font;
            DOM.setStyleAttribute(getElement(), "backgroundColor", "#D8ECFD");
            DOM.setStyleAttribute(getElement(), "padding", "2px 4px 2px 8px");
            addMouseOverHandler(new MouseOverHandler() {
                @Override
				public void onMouseOver(MouseOverEvent event) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b730200x3_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b730200x20x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b730200x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b730200x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b730200x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b73020");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b730200x30x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b730200x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x40x00x00x187b730200x30x00x00x0");
					DOM.setStyleAttribute(getElement(), "backgroundColor", "#7FAAFF");
                }
            });
            addMouseOutHandler(new MouseOutHandler() {
                @Override
				public void onMouseOut(MouseOutEvent event) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e061870x20x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e061870x3_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e061870x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e061870x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e061870x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e06187");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e061870x30x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e061870x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed41eaaf4420x20x50x00x00x171e061870x30x00x00x0");
					DOM.setStyleAttribute(getElement(), "backgroundColor", "#D8ECFD");
                }
            });
        }

        public String getFont() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed4c6f96aa2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed4c6f96aa20x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed4c6f96aa20x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed4c6f96aa20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed4c6f96aa20x20x0");
			return cellFont;
        }

    }

    public enum FontPickerType {
        FONT_FAMILY, FONT_SIZE
    }

    private static final String[] fontFamilies = new String[] { "Times New Roman", "Arial", "Courier New", "Georgia", "Trebuchet", "Verdana", "Comic Sans MS" };

    private static final String[] fontSizes = new String[] { "xx-small", "x-small", "small", "medium", "large", "x-large", "xx-large" };

    private String font = "";

    ValueChangeHandler<FontPicker> changeHandler = null;

    public FontPicker(FontPickerType type) {
        super(true);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x7_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x80x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x90x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x50x10x0");
		if(type == FontPickerType.FONT_SIZE)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x50x10x00x1");
		if(!(type == FontPickerType.FONT_SIZE))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x50x10x00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x6_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c6926_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e0x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e0x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e0x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bea474010e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x3_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x30x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x40x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x40x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x10x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x10x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x10x10x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x20x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be20ec4f430x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be20ec4f430x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be20ec4f430x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be20ec4f43");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bec65457cb38514922_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bec65457cbe7785011");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bec65457cb0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7bec65457cb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed40x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed40x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed42df3a49b0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed42df3a49b0x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be36338ed42df3a49b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be");
        VerticalPanel container = new VerticalPanel();
        DOM.setStyleAttribute(container.getElement(), "border", "1px solid  #7FAAFF");
        DOM.setStyleAttribute(container.getElement(), "backgroundColor", "#D8ECFD");
        DOM.setStyleAttribute(container.getElement(), "cursor", "pointer");

        String[] fonts = type == FontPickerType.FONT_SIZE ? fontSizes : fontFamilies;

        for (int i = 0; i < fonts.length; i++) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x00x1");
			FontCell cell;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x0");
			if (type == FontPickerType.FONT_SIZE) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x00x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x00x00x00x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x00x00x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x00x00x00x10x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x00x0");
				cell = new FontCell("" + (i + 1));
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x10x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x10x1");
				DOM.setStyleAttribute(cell.getElement(), "fontSize", fonts[i]);
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x20x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x20x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x20x00x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x20x0");
				cell = new FontCell(fonts[i]);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x20x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x20x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x10x20x10x00x0");
				DOM.setStyleAttribute(cell.getElement(), "fontFamily", fonts[i]);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x20x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x20x0");
			cell.addClickHandler(this);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be387c69260x20x60x30x3");
			container.add(cell);
        }

        add(container);
        setAnimationEnabled(true);
        setStyleName("hupa-color-picker");
    }

    @Override
	public HandlerRegistration addValueChangeHandler(ValueChangeHandler<FontPicker> handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c838");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x3_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x20x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x20x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x20x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x00x0");
		assert changeHandler == null : "Change handler is already defined";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x10x0");
		changeHandler = handler;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x00x1");
		return new HandlerRegistration() {
            @Override
			public void removeHandler() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x00x1b0aaafed");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x00x1b0aaafed0x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x00x1b0aaafed0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x00x1b0aaafed0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x00x1b0aaafed0x20x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be3fa2c8380x30x20x00x1b0aaafed0x20x00x0");
				changeHandler = null;
            }
        };
    }

    public String getFontName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be443f1d610x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be443f1d610x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be443f1d61_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be443f1d610x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be443f1d610x20x0");
		return font;
    }

    public FontSize getFontSize() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be80939901_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x0");
		switch (Integer.valueOf(font).intValue()) {
        case 1:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x1");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x2");
			return FontSize.XX_SMALL;
        case 2:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x3");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x4");
			return FontSize.X_SMALL;
        case 4:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x5");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x6");
			return FontSize.MEDIUM;
        case 5:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x7");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x8");
			return FontSize.LARGE;
        case 6:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00x9");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00xa");
			return FontSize.X_LARGE;
        case 7:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00xb");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00xc");
			return FontSize.XX_LARGE;
        case 3:
        default:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00xe");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00xd");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be809399010x20x00xf");
			return FontSize.SMALL;
        }
    }

    @Override
	public void onClick(ClickEvent event) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x20x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x3_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x00x10x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x00x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x00x10x00x0");
		FontCell cell = (FontCell) event.getSource();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x1_____org_apache_hupa_widgets_editor_FontPicker_java0x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x10x00x1");
		this.font = cell.getFont();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x0");
		if (changeHandler != null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x10x00x00x00x00x1_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x10x00x00x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x10x00x00x00x2_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x10x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x10x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x10x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x10x00x00x00x0_____org_apache_hupa_widgets_editor_FontPicker_java0x08714e7be208950cc0x30x20x10x00x00x00x1");
			changeHandler.onValueChange(new ValueChangeEvent<FontPicker>(this) {
            });
		}
    }

}
