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
import java.util.List;

import org.apache.hupa.client.activity.SearchBoxActivity;
import org.apache.hupa.shared.domain.Message;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.TextBox;

public class SearchBoxView extends Composite implements SearchBoxActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9260ab76c_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9260ab76c0x30x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9260ab76c0x1_____org_apache_hupa_client_ui_SearchBoxView_java0x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9260ab76c0x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9260ab76c0x3_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9260ab76c0x0");
	}
	

	private MultiWordSuggestOracle oracle = new MultiWordSuggestOracle(" ,@");
    private TextBox searchBox = new TextBox();
    private Button searchButton = new Button("Search");
    @UiField protected HorizontalPanel thisPanel;

    // @SuppressWarnings("deprecation")
    public SearchBoxView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec98163c3b10x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec98163c3b10x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec98163c3b10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec98163c3b10x20x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec98163c3b10x20x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec98163c3b1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec950b577ea0x20x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec950b577ea0x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec950b577ea0x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec950b577ea0x20x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec950b577ea_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec950b577ea0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec999a54f500x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec999a54f500x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec999a54f50_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec999a54f500x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec90x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec90x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec90x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9e8b541a60x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9e8b541a6_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9e8b541a60x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9e8b541a60x20x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9e8b541a60x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9e8b541a60x20x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec993e53a880x00x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec993e53a880x00x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec993e53a880x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec993e53a88_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec993e53a880x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x00x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x00x00x00x0");
		initWidget(binder.createAndBindUi(this));

        // searchBox.addStyleName(HupaCSS.C_msg_search);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x10x0");
		// searchBox.setAnimationEnabled(true);
        // searchBox.setAutoSelectEnabled(false);
        // searchBox.setLimit(20);
        searchBox.getElement().setAttribute("type", "search");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x20x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x20x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x2");
		searchBox.getElement().setAttribute("placeholder", "Search...");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x30x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x3_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x30x00x0");
		searchBox.getElement().setAttribute("results", "10");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x4_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x40x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x40x00x0");
		searchBox.getElement().setAttribute("incremental", "incremental");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x50x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x50x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x5");
		searchBox.getElement().setAttribute("name", "s");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x6_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x0");
		searchBox.addKeyUpHandler(new KeyUpHandler() {
            public void onKeyUp(KeyUpEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x20x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec9_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x10x00x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x10x00x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x10x00x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x10x00x10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x00x10x0");
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER || (event.getNativeKeyCode() == KeyCodes.KEY_BACKSPACE && searchBox.getText().trim().equals(""))) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x60x00x00x12c163ec90x30x00x10x0");
					searchButton.click();
                }
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x70x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x7");
		thisPanel.add(searchBox);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x8_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec93589aec90x10x80x0");
		thisPanel.add(searchButton);
    }

    @Override
    public HasClickHandlers getSearchClick() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec939ee5b030x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec939ee5b030x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec939ee5b030x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec939ee5b03");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec939ee5b030x20x0");
		return searchButton;
    }

    @Override
    public HasValue<String> getSearchValue() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec928f237a20x10x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec928f237a20x10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec928f237a20x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec928f237a20x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec928f237a20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec928f237a2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec928f237a20x20x0");
		return searchBox;
    }

    @Override
    public void fillSearchOracle(List<Message> messages) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc17");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x20x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x3_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x20x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x2_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x20x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x0");
		for (Message m : messages) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x00x10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x00x1");
			String subject = m.getSubject();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x10x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x10x10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x10x0");
			String from = m.getFrom();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x00x1_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x00x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x00x10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x2");
			if (subject != null && subject.trim().length() > 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x10x00x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x20x10x0");
				oracle.add(subject.trim());
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x00x10x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x3_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x00x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x00x1");
			if (from != null && from.trim().length() > 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x10x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x10x00x00x0_____org_apache_hupa_client_ui_SearchBoxView_java0x03589aec9bd4abc170x30x00x10x30x10x0");
				oracle.add(from.trim());
            }
        }
        // searchBox.setText("");
    }

    interface SearchBoxUiBinder extends UiBinder<HorizontalPanel, SearchBoxView> {
    }

    private static SearchBoxUiBinder binder = GWT.create(SearchBoxUiBinder.class);

}
