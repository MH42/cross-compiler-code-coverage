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
import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.rf.DeleteFolderRequest;
import org.apache.hupa.client.ui.LabelNode;
import org.apache.hupa.shared.domain.DeleteFolderAction;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.events.DeleteFolderEvent;
import org.apache.hupa.shared.events.DeleteFolderEventHandler;
import org.apache.hupa.shared.events.RefreshLabelListEvent;
import org.apache.hupa.shared.events.RefreshLabelListEventHandler;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

public class LabelListActivity extends AppBaseActivity {

    public LabelListActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d0x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d0x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d10da39840x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d10da39840x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d10da3984_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d10da39840x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d710dc0960x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d710dc0960x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d710dc0960x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00aac51d7d710dc096");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00520398cc0x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00520398cc0x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00520398cc_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00520398cc0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e000x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e000x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0059b18907_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0059b189070x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0059b189070x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0059b189070x0");
	}
	
	@Inject private HupaController hupaController;
    @Inject private Displayable display;

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x20x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x4_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x3_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x40x00x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x40x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x40x00x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x40x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00abdb942c0x40x10x0");
		bindTo(eventBus);
    }

    private void bindTo(final EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x20x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x20x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x3_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x0");
		this.registerHandler(display.getDelete().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x3_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x30x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x30x0");
				if (Window.confirm("Are you sure?")) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x30x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x30x00x10x00x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x30x00x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x30x00x10x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x00x00x10x10x1208950cc0x30x00x10x00x00x00x0");
					eventBus.fireEvent(new DeleteFolderEvent());
                }
            }
        }));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1");
		eventBus.addHandler(DeleteFolderEvent.TYPE, new DeleteFolderEventHandler() {
            @Override
            public void onDeleteFolderEvent(DeleteFolderEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1bb16f9ca0x20x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1bb16f9ca0x3_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1bb16f9ca0x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1bb16f9ca0x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1bb16f9ca0x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1bb16f9ca");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1bb16f9ca0x30x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x10x00x00x1bb16f9ca0x30x00x0");
				deleteSelected();
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x0");
		eventBus.addHandler(RefreshLabelListEvent.TYPE, new RefreshLabelListEventHandler(){
            @Override
            public void onRefreshEvent(RefreshLabelListEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x13314012f0x20x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x13314012f0x3_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x13314012f0x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x13314012f0x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x13314012f0x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x13314012f");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x13314012f0x30x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e00da82389f0x30x20x00x00x13314012f0x30x00x0");
				display.refresh();
            }
        });
    }

    public interface Displayable extends IsWidget {
        final int CASCADE_TYPE_ADD = 0x01;
        final int CASCADE_TYPE_RENAME = 0x02;
        SingleSelectionModel<LabelNode> getSelectionModel();
        HasClickHandlers getAdd();
        HasClickHandlers getDelete();
        void refresh();
    }

    public void deleteSelected() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x0");
		hupaController.showTopLoading("Deleting...");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x10x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x10x00x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x10x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x10x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x10x0");
		SingleSelectionModel<LabelNode> selectionModel = display.getSelectionModel();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x20x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x20x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x20x0");
		LabelNode labelNode = selectionModel.getSelectedObject();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x30x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x3_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x30x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x30x1");
		DeleteFolderRequest req = rf.deleteFolderRequest();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x40x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x40x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x4_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x40x0");
		DeleteFolderAction action = req.create(DeleteFolderAction.class);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x50x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x5_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x50x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x50x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x50x20x0");
		final ImapFolder f = req.create(ImapFolder.class);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x60x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x60x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x60x00x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x6");
		f.setFullName(labelNode.getFolder().getFullName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x70x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x7");
		action.setFolder(f);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x8_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x00x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1");
		req.delete(action).fire(new Receiver<GenericResult>() {
            @Override
            public void onSuccess(GenericResult response) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x3_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd7");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x30x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x30x0");
				hupaController.hideTopLoading();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x30x1_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x30x10x0");
				display.refresh();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x30x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x30x20x00x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x30x20x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x1ca563bd70x30x20x0");
				hupaController.showNotice("The label \"" + f.getFullName() + "\" was deleted.", 10000);
            }
            @Override
            public void onFailure(ServerFailure error) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x2_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x20x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x3_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac25");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x30x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x30x00x0");
				hupaController.hideTopLoading();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x30x10x00x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x30x10x0_____org_apache_hupa_client_activity_LabelListActivity_java0x0c18a6e0052b9500d0x20x80x00x10x17148ac250x30x1");
				hupaController.showNotice(error.getMessage(), 10000);
            }
        });
    }
}
