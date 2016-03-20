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

import org.apache.hupa.client.HupaController;
import org.apache.hupa.client.activity.LabelListActivity;
import org.apache.hupa.client.activity.LabelPropertiesActivity;
import org.apache.hupa.client.rf.CreateFolderRequest;
import org.apache.hupa.client.rf.HupaRequestFactory;
import org.apache.hupa.client.rf.RenameFolderRequest;
import org.apache.hupa.shared.domain.CreateFolderAction;
import org.apache.hupa.shared.domain.GenericResult;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.shared.domain.RenameFolderAction;
import org.apache.hupa.shared.events.RefreshLabelListEvent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CaptionPanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.ServerFailure;

public class LabelPropertiesView extends Composite implements LabelPropertiesActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ddaabf3d0x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ddaabf3d_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ddaabf3d0x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ddaabf3d0x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ddaabf3d0x4_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ddaabf3d0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc2781750x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc278175_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc2781750x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc2781750x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc2781750x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc2781750x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0");
	}
	

	@Inject HupaRequestFactory rf;
    @Inject HupaController hc;
    @Inject EventBus eventBus;

    @UiField TextBox name;
    private String path;

    @UiField ListBox parent;
    @UiField Button save;

    @UiField VerticalPanel propContainer;
    @UiField CaptionPanel information;
    private static final String ROOT_PATH = "imap_root";

    private int state;

    ImapFolder folder;

    @UiHandler("save")
    void handleSave(ClickEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db584");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x0");
		hc.showTopLoading("Saving...");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x1");
		if (state == LabelListActivity.Displayable.CASCADE_TYPE_RENAME) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x00x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x00x0");
			RenameFolderRequest req = rf.renameFolderRequest();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x10x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x10x10x0");
			RenameFolderAction action = req.create(RenameFolderAction.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x20x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x20x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x20x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0");
			final ImapFolder f = req.create(ImapFolder.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x30x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x30x0");
			f.setFullName(folder.getFullName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x4_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x40x0");
			action.setFolder(f);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x5_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x00x0");
			if (ROOT_PATH.equals(parent.getValue(parent.getSelectedIndex()))) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x10x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x10x0");
				action.setNewName(name.getText());
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x20x00x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x20x00x00x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x20x00x00x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x20x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x50x20x00x00x0");
				action.setNewName(parent.getValue(parent.getSelectedIndex()) + "/" + name.getText());
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x6_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x00x0");
			req.rename(action).fire(new Receiver<GenericResult>() {
                @Override
                public void onSuccess(GenericResult response) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd7");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x0");
					hc.hideTopLoading();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x10x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x10x00x0");
					eventBus.fireEvent(new RefreshLabelListEvent());
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x20x00x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x20x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x20x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x1ca563bd70x30x20x0");
					hc.showNotice("The label \"" + f.getFullName() + "\" has been renamed to " + name.getText(), 10000);
                }
                @Override
                public void onFailure(ServerFailure error) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac25");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x30x00x0");
					hc.hideTopLoading();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x30x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x30x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x10x60x00x10x17148ac250x30x10x00x0");
					hc.showNotice(error.getMessage(), 10000);
                }
            });
        } else if (state == LabelListActivity.Displayable.CASCADE_TYPE_ADD) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x00x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x0");
			CreateFolderRequest req = rf.createFolderRequest();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x10x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x10x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x1");
			CreateFolderAction action = req.create(CreateFolderAction.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x20x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x20x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x20x1");
			final ImapFolder f = req.create(ImapFolder.class);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x30x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x30x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x3");
			f.setFullName(path + "/" + name.getText());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x40x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x4");
			action.setFolder(f);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x5_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x0");
			req.create(action).fire(new Receiver<GenericResult>() {
                @Override
                public void onSuccess(GenericResult response) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd7");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x00x0");
					hc.hideTopLoading();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x10x00x00x0");
					eventBus.fireEvent(new RefreshLabelListEvent());
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x20x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x20x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x1ca563bd70x30x2");
					hc.showNotice("The label \"" + f.getFullName() + "\" was created.", 10000);
                }
                @Override
                public void onFailure(ServerFailure error) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac25");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x30x00x0");
					hc.hideTopLoading();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x30x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x30x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34fc4db5840x20x10x20x10x50x00x10x17148ac250x30x1");
					hc.showNotice(error.getMessage(), 10000);
                }
            });

        }
    }
    public LabelPropertiesView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34cf26f69d0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34cf26f69d_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34cf26f69d0x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34cf26f69d0x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34cf26f69d0x00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ae93af34_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ae93af340x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ae93af340x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34afffdd080x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34afffdd080x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34afffdd08");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3483dd9d6a0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3483dd9d6a0x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3483dd9d6a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af345e3a2e410x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af345e3a2e41_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af345e3a2e410x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3413a4a1130x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3413a4a1130x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3413a4a113");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34aa4a5f810x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34aa4a5f81_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34aa4a5f810x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34aa4a5f810x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af346ae999550x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af346ae99955_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af346ae999550x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af343150ecd50x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af343150ecd50x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af343150ecd5_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af343150ecd50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34d8fd39d00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34d8fd39d00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34d8fd39d0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3422ee0097_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3422ee00970x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3422ee00970x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34978c9f3f0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34978c9f3f_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34978c9f3f0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3499b14ede0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3499b14ede0x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3499b14ede");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af340x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af340x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af340x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ae93af340x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ae93af340x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ae93af340x10x00x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34ae93af340x10x00x00x0");
		initWidget(binder.createAndBindUi(this));
    }

    interface Binder extends UiBinder<ScrollPanel, LabelPropertiesView> {
    }

    private static Binder binder = GWT.create(Binder.class);

    @Override
    public void cascade(LabelNode labelNode, List<LabelNode> wholeList, int type) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x5_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x30x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x30x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x4_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x0");
		state = type;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x1");
		switch (type) {
        case LabelListActivity.Displayable.CASCADE_TYPE_ADD:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x0");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x1");
			makeParentList(labelNode, true, wholeList);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x20x0");
			name.setText("");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x30x00x0");
			path = labelNode.getPath();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x4_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x40x0");
			information.setVisible(false);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x5");
			break;
        case LabelListActivity.Displayable.CASCADE_TYPE_RENAME:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x6");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x70x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x7_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x70x00x0");
			name.setText(labelNode.getName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x80x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x8_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x80x0");
			path = labelNode.getPath();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x9_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10x90x0");
			makeParentList(labelNode, false, wholeList);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10xa0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10xa");
			information.setVisible(true);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10xb");
			break;
        default:
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10xc");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10xd0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x10xd");
			name.setText("");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x20x00x0");
		folder = labelNode.getFolder();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x00x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x00x0");
		if (!(labelNode.getFolder().getSubscribed())) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x10x0");
			name.setEnabled(false);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348df13e5b0x50x30x20x00x0");
			name.setEnabled(true);
        }
    }
    private void makeParentList(LabelNode labelNode, boolean isParent, List<LabelNode> wholeList) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x4_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x40x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x5_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x40x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x00x0");
		parent.clear();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x10x0");
		parent.addItem("---", ROOT_PATH);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x00x0");
		for (LabelNode folderNode : wholeList) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x00x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x0");
			if (isItself(labelNode, isParent, folderNode) || isItsDecendant(labelNode, isParent, folderNode)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x00x10x0");
				continue;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x10x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x20x10x10x00x1");
			parent.addItem(folderNode.getNameForDisplay().replace("&nbsp;&nbsp;", ". "), folderNode.getPath());
        }

        if(!(isParent))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x30x10x00x00x2");
		if(isParent)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x30x10x00x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x30x10x00x0");
		int parentIndex = wholeList.indexOf(isParent ? labelNode : labelNode.getParent());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x40x00x0");
		if(!(parentIndex < 0))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x40x00x00x2");
		if(parentIndex < 0)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af3411c85c3d0x50x40x00x00x1");
		parent.setSelectedIndex(parentIndex < 0 ? 0 : parentIndex + 1);
    }
    private boolean isItself(LabelNode labelNode, boolean isParent, LabelNode folderNode) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d631_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x5_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x40x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x50x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x50x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x50x00x00x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x50x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af348b79d6310x50x00x00x1");
		return !isParent && labelNode.compareTo(folderNode) == 0;
    }
    private boolean isItsDecendant(LabelNode labelNode, boolean isParent, LabelNode folderNode) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x4_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x40x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x5_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x50x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x50x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x50x00x00x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34254d3cf00x50x0");
		return !isParent && isKinship(labelNode, folderNode);
    }

    private boolean isKinship(LabelNode labelNode, LabelNode folderNode) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x4_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x20x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x30x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x1_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x3_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x0");
		if (folderNode == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x00x10x0");
			return false;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x10x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x10x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x10x00x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x1");
		if (labelNode.compareTo(folderNode.getParent()) == 0) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x10x10x0");
			return true;
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x20x00x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af34b285e22f0x40x20x0");
		return isKinship(labelNode, folderNode.getParent());
    }
    @Override
    public HasClickHandlers getSave() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af349670c2d40x0_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af349670c2d40x2_____org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af349670c2d40x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af349670c2d4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelPropertiesView_java0x0ae93af349670c2d40x20x0");
		return save;
    }

}
