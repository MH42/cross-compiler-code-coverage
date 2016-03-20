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

package org.apache.hupa.client.activity;


import tc3.shared.InstrumentationLoggerProvider;
import java.util.List;

import org.apache.hupa.shared.domain.Message;
import org.apache.hupa.shared.events.RefreshMessagesEvent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class SearchBoxActivity extends AppBaseActivity {

    public SearchBoxActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359b59b18907_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359b59b189070x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359b59b189070x2_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359b59b189070x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359b0x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359b0x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359b");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359baac51d7d0x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359baac51d7d0x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359baac51d7d");
	}
	

	@Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x3_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x20x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x2_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x30x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x4_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x40x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x40x0");
		bindTo(eventBus);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x40x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x40x10x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359babdb942c0x40x10x0");
		container.setWidget(display.asWidget());

    }

    private void bindTo(final EventBus eventBus) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x2_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x20x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x20x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x3_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x0");
		registerHandler(display.getSearchClick().addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x00x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x00x0");
				String searchValue = null;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x00x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x1_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x00x00x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x00x00x00x00x0");
				if (display.getSearchValue().getValue().trim().length() > 0) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x10x00x00x00x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x10x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x10x00x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x10x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x10x10x00x00x00x0");
					searchValue = display.getSearchValue().getValue().trim();
                }
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x20x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x2_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x20x00x00x0_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x20x0");
				eventBus.fireEvent(new RefreshMessagesEvent(searchValue));
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x3_____org_apache_hupa_client_activity_SearchBoxActivity_java0x070b5359bda82389f0x30x00x00x00x10x1208950cc0x30x30x0");
				hc.showTopLoading("Searching...");
            }

        }));

//        registerHandler(eventBus.addHandler(MessagesReceivedEvent.TYPE, new MessagesReceivedEventHandler() {
//
//            public void onMessagesReceived(MessagesReceivedEvent event) {
//
//                // fill the oracle
//                display.fillSearchOracle(event.getMessages());
//            }
//
//        }));
    }

    @Inject private Displayable display;

    public interface Displayable extends IsWidget {
        HasClickHandlers getSearchClick();

        HasValue<String> getSearchValue();

        void fillSearchOracle(List<Message> messages);
    }
}
