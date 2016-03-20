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
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Focusable;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.SuggestOracle;
import com.google.gwt.user.client.ui.TextArea;

/**
 * A text-area which shows a pop-up with suggestions.
 * Different values in the text area are separated by comma.
 *
 * @author manolo
 */
public class MultiValueSuggestArea extends Composite implements HasText, Focusable {

    /**
     * It is necessary to modify the behavior of the default SuggestBox, because
     * it look for items which match the entire text in the box.
     *
     * @author manolo
     */
    @SuppressWarnings("deprecation")
    private class CustomSuggestBox extends SuggestBox {

        public CustomSuggestBox(SuggestOracle oracle) {
            // this is a hack, It is necessary to override the TextBoxBase passed to the constructor
            // instead of overriding getText and setText from SuggestBox because a bug in the implementation
            // I've sent a patch to gwt.
            super(oracle, new TextArea() {

                {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d228");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x0");
					// Avoid entering a new-line when selecting a suggestion element
                    // TODO: I think this is a bug in GWT SuggestBox which should be reported.
                    addKeyDownHandler(new KeyDownHandler() {
                        @Override
						public void onKeyDown(KeyDownEvent event) {
                            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x20x0");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x30x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x30x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x30x0");
							if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
                                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x30x00x1");
								InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x30x00x10x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x14d97d2280x00x00x00x00x16421da4b0x30x00x10x0");
								event.preventDefault();
                            }
                        }
                    });
                }

                String search = null;

                @Override
                public String getText() {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x20x00x00x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x20x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x20x00x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x20x00x00x00x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x20x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x17412d4e20x20x00x00x00x00x00x00x0");
					return search = super.getText().replaceFirst("\\s+$", "").replaceFirst("^\\s+","").replaceAll("[\\s;]", ",").replaceFirst("^.+,", "");
                }

                @Override
                public void setText(String text) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a5851856");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x00x00x0");
					if (text.trim().length() > 0) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x00x10x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x00x10x00x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x00x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x00x10x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x00x10x0");
						String actual = super.getText().replaceFirst("\\s+$", "").replaceFirst(search + "[\\s]*$", "");
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1a58518560x30x00x10x10x00x0");
						super.setText(actual + text + ", ");
                    }
                }

            });
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b6_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d7_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e0x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e0x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b48039");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d52162594");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d");
        }

        // We have to use getValue and setValue to get/set the entire text of the textarea
        // because setText and getText have different behavior since we have modified
        // this methods in the the box implementation
		@Override
        public String getValue() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d521625942ee20406");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d521625942ee204060x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d521625942ee204060x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d521625942ee204060x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d521625942ee204060x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d521625942ee204060x20x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d521625942ee204060x20x00x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d521625942ee204060x20x00x0");
			return DOM.getElementProperty(getValueBox().getElement(), "value");
        }

        @Override
        public void setValue(String text) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c13");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x30x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x30x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x30x00x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259445162c130x30x0");
			DOM.setElementProperty(getValueBox().getElement(), "value", text);
        }
    }

    private final SuggestBox box;

    private MultiWordSuggestOracle oracle;

    public MultiValueSuggestArea(SuggestOracle oracle) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b6_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d7_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e0x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e0x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d52162594");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x20x00x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x20x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x20x00x0");
		box = new CustomSuggestBox(oracle);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x20x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc3c7072e0x20x10x0");
		initWidget(box);
    }

    public MultiValueSuggestArea(String separators) {
        this(null, separators);
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dbe895ffc0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b6_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dbe895ffc0x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dbe895ffc0x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dbe895ffc0x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dbe895ffc0x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dbe895ffc");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d7_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e0x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e0x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d52162594");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d");
    }

    public MultiValueSuggestArea(Object[] list, String separators) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x10x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f73_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b6_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d431364b60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d7_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc7d8a6d70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e0x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e0x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d5216259414b480390x20x00x00x1c1d0643e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d52162594");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x00x00x00x0");
		oracle = new MultiWordSuggestOracle(separators);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x10x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x10x00x00x0");
		box = new CustomSuggestBox(oracle);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x20x0");
		initWidget(box);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dd4747f730x30x30x0");
		fillOracle(list);
    }

    @Override
	public String getText() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d7412d4e2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d7412d4e20x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d7412d4e20x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d7412d4e20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d7412d4e20x20x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d7412d4e20x20x0");
		return box.getValue();
    }

    @Override
	public void setText(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da5851856");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da58518560x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da58518560x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da58518560x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da58518560x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da58518560x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da58518560x30x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da58518560x30x0");
		box.setValue(text);
    }

    public void fillOracle(Object[] list) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x20x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c73");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x0");
		oracle.clear();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x1");
		if (list != null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x10x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x10x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x10x00x0");
			for (Object o : list) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x10x00x10x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x10x00x10x00x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8da20c6c730x30x10x10x00x10x0");
				oracle.add(o.toString());
			}
		}
    }

    public SuggestOracle getOracle() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d4fa3a66b0x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d4fa3a66b0x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d4fa3a66b_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d4fa3a66b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d4fa3a66b0x20x0");
		return oracle;
    }

    @Override
	public int getTabIndex() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc31f4a620x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc31f4a620x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc31f4a620x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc31f4a62");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc31f4a620x20x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8dc31f4a620x20x0");
		return box.getTabIndex();
    }

    @Override
	public void setAccessKey(char key) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d745f99010x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d745f99010x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d745f99010x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d745f99010x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d745f99010x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d745f9901");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d745f99010x30x00x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8d745f99010x30x0");
		box.setAccessKey(key);
    }

    @Override
	public void setFocus(boolean focused) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8ddbdd55970x2_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8ddbdd55970x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8ddbdd55970x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8ddbdd55970x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8ddbdd55970x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8ddbdd5597");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8ddbdd55970x30x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8ddbdd55970x30x00x0");
		box.setFocus(focused);
    }

    @Override
	public void setTabIndex(int index) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8db0a06ae5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8db0a06ae50x3_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8db0a06ae50x1_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8db0a06ae50x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8db0a06ae50x20x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8db0a06ae50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8db0a06ae50x30x0_____org_apache_hupa_widgets_ui_MultiValueSuggestArea_java0x08c727d8db0a06ae50x30x00x0");
		box.setTabIndex(index);
    }
}
