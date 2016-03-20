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
import java.util.ArrayList;
import java.util.List;

import org.apache.hupa.client.place.FolderPlace;
import org.apache.hupa.client.rf.SetFlagRequest;
import org.apache.hupa.client.ui.MessagesCellTable;
import org.apache.hupa.client.ui.ToolBarView.Parameters;
import org.apache.hupa.shared.data.MessageImpl.IMAPFlag;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.Message;
import org.apache.hupa.shared.domain.SetFlagAction;
import org.apache.hupa.shared.events.RefreshMessagesEvent;
import org.apache.hupa.shared.events.RefreshFoldersEvent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class ToolBarActivity extends AppBaseActivity {

    public ToolBarActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5aac51d7d0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5aac51d7d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e50x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e50x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5d1eb2f3e0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5d1eb2f3e_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5d1eb2f3e0x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5d1eb2f3e0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5ffc6facc0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5ffc6facc_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5ffc6facc0x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5ffc6facc0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5c3ee137d0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5c3ee137d0x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5c3ee137d0x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5c3ee137d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e559b189070x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e559b18907_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e559b189070x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e559b189070x2");
	}
	
	@Inject private Displayable display;
    @Inject private MessagesCellTable table;
    @Inject private MessageListActivity.Displayable messagesDisplay;
    private String folderName;

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x30x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x4_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x3_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x00x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x1");
		bindTo(eventBus);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x20x00x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x20x00x0");
		if(pc.getWhere() instanceof FolderPlace){
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x20x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5abdb942c0x40x20x10x00x0");
			display.enableAllTools(false);
        }
    }

    public ToolBarActivity with(String folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x3_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x30x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x30x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0");
		this.folderName = folder;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x30x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e551b3579d0x30x1");
		return this;
    }

    public Displayable getDisplay() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e51224bac4_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e51224bac40x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e51224bac40x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e51224bac40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e51224bac40x20x0");
		return display;
    }

    private void bindTo(final EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x3_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x20x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x0");
		registerHandler(display.getMarkRead().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x30x00x0");
				hc.showTopLoading("Loading");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x30x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x30x10x0");
				toMarkRead(true);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x30x20x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x30x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x00x00x00x10x1208950cc0x30x2");
				display.getPopup().hide();
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x0");
		registerHandler(display.getMarkUnread().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x30x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x30x00x0");
				hc.showTopLoading("Loading");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x30x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x30x10x0");
				toMarkRead(false);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x30x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x30x20x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x10x00x00x10x1208950cc0x30x2");
				display.getPopup().hide();
            }
        }));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x1");
		registerHandler(display.getRefresh().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x3_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x0");
				hc.showTopLoading("Loading");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x10x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x10x00x00x0");
				eventBus.fireEvent(new RefreshMessagesEvent());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x20x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5da82389f0x30x20x00x00x10x1208950cc0x30x20x00x00x0");
				eventBus.fireEvent(new RefreshFoldersEvent());
            }
        }));
    }

    protected void toMarkRead(boolean read) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d9_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x3_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x00x00x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x00x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x00x10x00x00x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x00x10x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x00x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x00x10x00x0");
		List<Long> uids = new ArrayList<Long>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x1");
		for (Message msg : table.getVisibleItems()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x00x00x0");
			if (table.getSelectionModel().isSelected(msg)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x00x10x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x00x10x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x00x10x0");
				uids.add(msg.getUid());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x00x10x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x10x20x00x10x1");
				table.markRead(msg, read);
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x20x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x20x10x0");
		SetFlagRequest req = this.rf.setFlagRequest();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x30x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x3_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x30x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x30x1");
		SetFlagAction action = req.create(SetFlagAction.class);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x40x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x4_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x40x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x40x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0");
		ImapFolder f = req.create(ImapFolder.class);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x5_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x50x0");
		f.setFullName(folderName);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x60x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x6");
		action.setFolder(f);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x70x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x7");
		action.setFlag(IMAPFlag.SEEN);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x8_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x80x0");
		action.setValue(read);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x90x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30x9");
		action.setUids(uids);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x00x1_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x0");
		req.set(action).fire(new Receiver<GenericResult>() {
            @Override
            public void onSuccess(GenericResult response) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd7");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x2_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x3_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x30x00x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x30x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x30x00x00x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x30x0");
				eventBus.fireEvent(new RefreshFoldersEvent());
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x30x10x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x30x1");
				messagesDisplay.refresh();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x30x20x0_____org_apache_hupa_client_activity_ToolBarActivity_java0x0736ce0e5a37ae2d90x30xa0x00x10x1ca563bd70x30x2");
				hc.hideTopLoading();
            }
        });
    }


    // FIXME: for some reason if we extend WidgetDisplayable we get the error
    // ToolBarActivity.java:[124,38] error: cannot find symbol
    public interface Displayable /*extends WidgetDisplayable*/ {
        // FIXME: added this method until we fix the problem with inheritance
        com.google.gwt.user.client.ui.Widget asWidget();

        void enableSendingTools(boolean is);
        void enableDealingTools(boolean is);
        void enableAllTools(boolean is);

        HasClickHandlers getRefresh();
        HasClickHandlers getReply();
        HasClickHandlers getReplyAll();
        HasClickHandlers getForward();
        void setParameters(Parameters parameters);
        Parameters getParameters();
        HasClickHandlers getMarkUnread();
        HasClickHandlers getMarkRead();
        HasClickHandlers getMark();
        HasClickHandlers getDelete();
        PopupPanel getPopup();
        HasClickHandlers getCompose();

        void enableUpdatingTools(boolean is);

    }
}
