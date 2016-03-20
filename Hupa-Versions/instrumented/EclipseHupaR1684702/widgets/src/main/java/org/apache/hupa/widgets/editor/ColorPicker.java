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
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;

/**
 * Color picker for rich editor
 */
public class ColorPicker extends PopupPanel implements ClickHandler, HasValueChangeHandlers<ColorPicker>  {

    private class ColorCell extends Label {
        String rgbColor;
        public ColorCell(long color) {
            this(Long.toHexString(color));
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x00x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec683_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca224f88979_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca224f889790x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca224f889790x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca224f889790x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca224f889790x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca224f889790x20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca224f889790x20x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a");
        }

        @SuppressWarnings("deprecation")
		public ColorCell(String color) {
            super();
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x00x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec683_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x7_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x4_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x40x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x40x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x5_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x50x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x6_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x30x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab09514");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a0x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a");
            setColor(color);
            setTitle(rgbColor);
            setSize("14px", "12px");
            DOM.setStyleAttribute(getElement(), "backgroundColor", rgbColor);
            setBorderColor("#cccccc");
            addMouseOverHandler(new MouseOverHandler() {
                @Override
				public void onMouseOver(MouseOverEvent event) {
                  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x187b730200x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x187b730200x20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x187b730200x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x187b730200x3_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x187b730200x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x187b73020");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x187b730200x30x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x60x00x00x187b730200x30x0");
				setBorderColor("#ffffff");
                }
            });
            addMouseOutHandler(new MouseOutHandler() {
                @Override
				public void onMouseOut(MouseOutEvent event) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x171e061870x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x171e061870x20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x171e061870x3_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x171e061870x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x171e061870x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x171e06187");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x171e061870x30x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2fab095140x20x70x00x00x171e061870x30x00x0");
					setBorderColor("#cccccc");
                }
            });
        }

        public String getColor() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca23a40be0c_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca23a40be0c0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca23a40be0c0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca23a40be0c0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca23a40be0c0x20x0");
			return rgbColor;
        }

        @SuppressWarnings("deprecation")
		public void setBorderColor(String color) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x30x00x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x30x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x30x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2357eccae0x30x00x00x1");
			DOM.setStyleAttribute(getElement(), "border", "1px solid " + color);
        }

        void setColor(String s){
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e318794_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x00x00x0");
			while(s.length()<6) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x00x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x00x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x00x10x00x00x0");
				s= "0" + s;
			}
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca26e3187940x20x10x0");
			rgbColor="#" + s;
        }
    }

    ValueChangeHandler<ColorPicker> changeHandler = null;

    private String color = "";

    long[] colors = new long[] {
        0xffffff, 0xcccccc, 0xc0c0c0, 0x999999, 0x666666, 0x333333, 0x000000,
        0xffcccc, 0xff6666, 0xff0000, 0xcc0000, 0x990000, 0x660000, 0x330000,
        0xffcc99, 0xff9966, 0xff9900, 0xfd6500, 0xcb6500, 0x983200, 0x653200,
        0xffff99, 0xffff66, 0xffcc66, 0xfdcb32, 0xcb9832, 0x986532, 0x653232,
        0xffffcc, 0xffff33, 0xffff00, 0xfdcb00, 0x989800, 0x656500, 0x323200,
        0x99ff99, 0x66ff99, 0x33ff33, 0x32cb00, 0x009800, 0x006500, 0x003200,
        0x99ffff, 0x33ffff, 0x66cccc, 0x00cbcb, 0x329898, 0x326565, 0x003232,
        0xccffff, 0x66ffff, 0x33ccff, 0x3265fd, 0x3232fd, 0x000098, 0x000065,
        0xccccff, 0x9999ff, 0x6666cc, 0x6532fd, 0x6500cb, 0x323298, 0x320098,
        0xffccff, 0xff99ff, 0xcc66cc, 0xcb32cb, 0x983298, 0x653265, 0x320032,
    };

    @SuppressWarnings("deprecation")
	public ColorPicker() {
        super(true);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x7_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x10x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x10x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x10x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x3_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x4_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x40x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x40x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x50x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x50x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x6_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4ea3014b0x10x00x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec683_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a4bfec6830x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aa474010e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123aeec93ca2d975248a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x8_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x80x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x9_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x90x0");
        FlexTable t = new FlexTable();
        t.setCellPadding(0);
        t.setCellSpacing(0);
        DOM.setStyleAttribute(t.getElement(), "border", "1px solid #cccccc");

        int i=0;
        for (int r=0; i<colors.length; r++) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x3_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x10x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x10x0");
			for (int c=0; c<7 && i<colors.length; c++, i++) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x00x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x00x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x0");
				ColorCell cell = new ColorCell(colors[i]);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x10x0");
				cell.addClickHandler(this);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123af337123a0x10x60x30x00x40x20x0");
				t.setWidget(r, c, cell);
            }
        }

        add(t);
        setAnimationEnabled(true);
        setStyleName("hupa-color-picker");
    }

    @Override
	public HandlerRegistration addValueChangeHandler(ValueChangeHandler<ColorPicker> handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x20x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x20x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x3_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x0");
		assert changeHandler == null : "Change handler is already defined";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x1");
		changeHandler = handler;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x2");
		return new HandlerRegistration() {
            @Override
			public void removeHandler() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x00x1b0aaafed0x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x00x1b0aaafed0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x00x1b0aaafed0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x00x1b0aaafed");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x00x1b0aaafed0x20x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a23ecb5f70x30x20x00x1b0aaafed0x20x0");
				changeHandler = null;
            }
        };
    }

    public String getColor() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a3a40be0c_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a3a40be0c0x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a3a40be0c0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a3a40be0c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a3a40be0c0x20x0");
		return color;
    }

    @Override
	public void onClick(ClickEvent event) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x3_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x00x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x00x10x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x00x10x00x0");
		ColorCell cell = (ColorCell)event.getSource();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x10x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x1");
		this.color = cell.getColor();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x0");
		if (changeHandler != null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x10x00x00x00x2_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x10x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x10x00x00x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x10x00x00x00x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x10x00x00x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x10x0_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x10x00x00x00x00x1_____org_apache_hupa_widgets_editor_ColorPicker_java0x0f337123a208950cc0x30x20x10x00x00x00x1");
			changeHandler.onValueChange(new ValueChangeEvent<ColorPicker>(this){});
		}
    }

}
