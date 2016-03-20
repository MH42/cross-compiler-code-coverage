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
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.hupa.client.activity.MessageListActivity;
import org.apache.hupa.client.ui.MessagesCellTable.MessageListDataProvider;
import org.apache.hupa.shared.domain.Message;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.inject.Inject;

public class MessageListView extends Composite implements MessageListActivity.Displayable, RequiresResize {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be3a541e910x3_____org_apache_hupa_client_ui_MessageListView_java0x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be3a541e910x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be3a541e910x30x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be3a541e910x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be3a541e910x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be3a541e91");
	}
	

	@UiField SimpleLayoutPanel thisView;
    private MessagesCellTable grid;

    @Inject
    public MessageListView(final EventBus eventBus, final MessagesCellTable table) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be34e895700x00x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be34e895700x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be34e89570_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be34e895700x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be34e895700x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a6034");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x10x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x20x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x3_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be0x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be0x3_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be0x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be0x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88bef3c543ad_____org_apache_hupa_client_ui_MessageListView_java0x012bb88bef3c543ad0x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88bef3c543ad0x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88bef3c543ad0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be60cb6d7e_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be60cb6d7e0x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be60cb6d7e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x30x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x30x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x30x00x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x30x00x00x00x0");
		initWidget(binder.createAndBindUi(this));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x30x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x30x1");
		grid = table;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x30x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88beca7a60340x30x20x0");
		thisView.add(grid);
    }

    interface MessageListUiBinder extends UiBinder<SimpleLayoutPanel, MessageListView> {
    }

    private static MessageListUiBinder binder = GWT.create(MessageListUiBinder.class);

    @Override
    public MessagesCellTable getGrid() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be14a31e62");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be14a31e620x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be14a31e620x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be14a31e620x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be14a31e620x20x0");
		return grid;
    }

    @Override
    public MessageListDataProvider getDataProvider() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be6f8a6637");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be6f8a66370x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be6f8a66370x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be6f8a66370x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be6f8a66370x20x0");
		return grid.dataProvider;
    }


    @Override
    public void refresh(){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be26b56c1b0x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be26b56c1b0x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be26b56c1b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be26b56c1b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be26b56c1b0x20x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be26b56c1b0x20x00x0");
		grid.refresh();
    }

    @Override
    public List<Long> getSelectedMessagesIds() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c5356");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x00x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x00x10x00x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x00x10x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x00x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x00x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x00x10x00x00x1");
		List<Long> selecteds = new ArrayList<Long>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x10x00x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x10x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x10x00x00x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x10x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x00x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x10x00x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x10x00x0");
		MultiSelectionModel<? super Message> selectionModel = (MultiSelectionModel<? super Message>) grid
                .getSelectionModel();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x20x0");
		selectionModel.getSelectedSet();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x30x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x30x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x30x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x3");
		for (Message msg : getSelectedMessages()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x30x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x30x20x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x30x20x00x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x30x20x0");
			selecteds.add(msg.getUid());
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be978c53560x20x4");
		return selecteds;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Set<Message> getSelectedMessages() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x00x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x10x00x00x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x10x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x10x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x10x00x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x00x10x00x00x0");
		MultiSelectionModel<? super Message> selectionModel = (MultiSelectionModel<? super Message>) grid
                .getSelectionModel();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x10x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x10x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x10x00x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x10x00x00x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be22b4ee3c0x20x10x00x0");
		return (Set<Message>) selectionModel.getSelectedSet();
    }

    @Override
    public void onResize() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be337030700x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be337030700x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be337030700x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be33703070");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be337030700x20x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be337030700x20x00x0");
		grid.onResize();
    }

    @Override
    public void setSearchValue(String searchValue){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be1505f8aa0x1_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be1505f8aa0x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be1505f8aa0x2_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be1505f8aa0x20x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be1505f8aa0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be1505f8aa");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageListView_java0x012bb88be1505f8aa0x30x00x0_____org_apache_hupa_client_ui_MessageListView_java0x012bb88be1505f8aa0x30x0");
		grid.setSearchValue(searchValue);

    }

}
