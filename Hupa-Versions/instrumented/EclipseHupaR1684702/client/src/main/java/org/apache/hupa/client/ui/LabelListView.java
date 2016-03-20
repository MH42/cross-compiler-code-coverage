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

import org.apache.hupa.client.activity.LabelListActivity;
import org.apache.hupa.client.activity.LabelPropertiesActivity;
import org.apache.hupa.client.rf.HupaRequestFactory;
import org.apache.hupa.client.storage.HupaStorage;
import org.apache.hupa.shared.domain.ImapFolder;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.query.client.Function;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.view.client.AsyncDataProvider;
import com.google.gwt.view.client.HasData;
import com.google.gwt.view.client.ProvidesKey;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;

public class LabelListView extends Composite implements LabelListActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bdc7b569d0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bdc7b569d0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bdc7b569d_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bdc7b569d0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bdc7b569d0x30x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bdc7b569d0x3_____org_apache_hupa_client_ui_LabelListView_java0x0");
	}
	

	@Inject LabelPropertiesActivity.Displayable labelProperties;
    @Inject private HupaStorage hupaStorage;
    @UiField ScrollPanel thisView;

    @UiField Button add;
    @UiField Button delete;
    private CellList<LabelNode> cellList;

    public interface Resources extends CellList.Resources {

        Resources INSTANCE = GWT.create(Resources.class);

        @Source("res/CssLabelListView.css")
        public CellList.Style cellListStyle();
    }
    @UiHandler("add")
    public void handleAdd(ClickEvent e) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x30x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x30x00x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x30x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4e50020b0x30x00x0");
		labelProperties.cascade(selectionModel.getSelectedObject(), data.getDataList(), CASCADE_TYPE_ADD);
    }

    private final ImapLabelListDataProvider data;

    protected void onAttach() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x00x0");
		super.onAttach();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x10x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x10x00x0");
		// Delay getting data until the widget has been attached, to use injected objects.
        if (data.getDataDisplays().size() == 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x10x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b5cd6b07b0x20x10x10x00x0");
			data.addDataDisplay(cellList);
        }
    };

    @Inject
    public LabelListView(final HupaRequestFactory rf) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e0x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e0x10x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x20x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x20x00x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x10x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab6_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4eaa4b5ab60x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e59b18907_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e59b189070x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e59b189070x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e59b189070x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e59b189070x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x20x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c04_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x10x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26ba17c9aaa_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26ba17c9aaa0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26ba17c9aaa0x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26ba17c9aaa0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26ba17c9aaa0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b87df60de0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b87df60de0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b87df60de");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b87df60dee29879220x1_____org_apache_hupa_client_ui_LabelListView_java0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b87df60dee29879220x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b87df60dee2987922_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b87df60dee29879220x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b58d1bbce_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b58d1bbce0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b58d1bbce0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b9485989f_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b9485989f0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b9485989f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2ad325310x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2ad325310x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2ad325310x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2ad325310x10x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2ad325310x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2ad32531");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26be25d99240x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26be25d9924_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26be25d99240x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4195d7e10x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4195d7e1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4195d7e10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b4195d7e10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b60cb6d7e0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b60cb6d7e0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b60cb6d7e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2e63f9df0x00x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2e63f9df0x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2e63f9df0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2e63f9df_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b2e63f9df0x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x00x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x00x00x0");
		initWidget(binder.createAndBindUi(this));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x10x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x10x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x1");
		data = new ImapLabelListDataProvider();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x20x00x00x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x20x00x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x20x00x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x20x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x20x00x00x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x20x0");
		cellList = new CellList<LabelNode>(new LabelCell(), Resources.INSTANCE);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x30x0");
		cellList.setPageSize(100);// assume one's labels are under one hundred, otherwise we need a pager
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x40x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x4");
		cellList.setSelectionModel(selectionModel);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x5_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x1");
		selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            public void onSelectionChange(SelectionChangeEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a24198_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x30x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x30x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x30x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x50x00x00x112a241980x30x00x00x1");
				labelProperties.cascade(selectionModel.getSelectedObject(), data.getDataList(), CASCADE_TYPE_RENAME);
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x6_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b872f154a0x20x60x0");
		thisView.setWidget(cellList);
    }

    @Override
    public SingleSelectionModel<LabelNode> getSelectionModel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b312910e2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b312910e20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b312910e20x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b312910e20x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b312910e20x10x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b312910e20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b312910e20x20x0");
		return this.selectionModel;
    }

    public final SingleSelectionModel<LabelNode> selectionModel = new SingleSelectionModel<LabelNode>(
            new ProvidesKey<LabelNode>() {
                @Override
                public Object getKey(LabelNode item) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa0x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa0x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa0x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa");
					if(!(item == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa0x30x00x00x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa0x30x00x0");
					if(item == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b8eaf5c040x30x00x10x1621e11aa0x30x00x00x1");
					return item == null ? null : item.getPath();
                }
            });

    // FIXME: almost the code in this class is identical to FolderListView, duplicated code in GWT is bad
    // because explodes js size !!!
    public class ImapLabelListDataProvider extends AsyncDataProvider<LabelNode> implements HasRefresh {

        private List<LabelNode> folderNodes = new ArrayList<LabelNode>();
        HasData<LabelNode> display;

        public List<LabelNode> getDataList() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e2677a2df_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e2677a2df0x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e2677a2df0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e2677a2df0x10x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e2677a2df0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e2677a2df0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e2677a2df0x20x0");
			return folderNodes;
        }

        @Override
        public void addDataDisplay(HasData<LabelNode> display) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e69490873");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x20x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x30x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x30x00x0");
			super.addDataDisplay(display);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x30x10x0_____org_apache_hupa_client_ui_LabelListView_java0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e694908730x30x1");
			this.display = display;
        }

        @Override
        protected void onRangeChanged(HasData<LabelNode> display) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x20x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x20x00x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x0");
			hupaStorage
                .gettingFolders()
                .done(new Function(){public void f() {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a1921_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x0");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x00x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x00x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x00x1");
					List<ImapFolder> response = arguments(0);
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x10x0");
					folderNodes.clear();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x2");
					for (ImapFolder folder : response) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x20x1");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x20x10x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x20x10x0");
						fillCellList(folderNodes, folder, LabelNode.ROOT, "");
                    }
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x30x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x30x0");
					// For some reason removing a row does not update the display correctly
                    updateRowCount(folderNodes.size(), true);
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x40x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e1f3388dc0x30x00x00x10x14a0a19210x20x4");
					updateRowData(0, folderNodes);
                 }});
        }

        private void fillCellList(List<LabelNode> folderNodes, ImapFolder curFolder, LabelNode parent, String intents) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x3_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x40x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x5_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x20x00x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x6_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x4_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x50x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x30x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x00x10x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x00x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x00x1");
			LabelNode labelNode = new LabelNode();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x1");
			labelNode.setFolder(curFolder);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x20x0");
			labelNode.setName(curFolder.getName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x30x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x30x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x30x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x3");
			labelNode.setNameForDisplay(intents + curFolder.getName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x4_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x40x0");
			labelNode.setParent(parent);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x50x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x50x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x5");
			labelNode.setPath(curFolder.getFullName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x6_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x60x0");
			folderNodes.add(labelNode);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x7");
			if (curFolder.getHasChildren()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x10x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x10x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x10x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x10x00x1");
				for (ImapFolder subFolder : curFolder.getChildren()) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x10x00x2");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x10x00x20x00x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x10x00x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4ec332acfb0x60x70x10x00x20x00x0");
					// FIXME: don't use intents, it will be much better user experience to use cellTree
                    fillCellList(folderNodes, subFolder, labelNode, intents + "&nbsp;&nbsp;&nbsp;&nbsp;");
                }
            }
        }

        @Override
        public void refresh() {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e26b56c1b0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e26b56c1b0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e26b56c1b0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e26b56c1b");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e26b56c1b0x20x00x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e26b56c1b0x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26bcd324b4e26b56c1b0x20x00x00x0");
			this.onRangeChanged(display);
        }
    }

    interface LabelListUiBinder extends UiBinder<DockLayoutPanel, LabelListView> {
    }

    private static LabelListUiBinder binder = GWT.create(LabelListUiBinder.class);

    @Override
    public HasClickHandlers getAdd() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b7c205f78");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b7c205f780x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b7c205f780x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b7c205f780x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b7c205f780x20x0");
		return add;
    }

    @Override
    public HasClickHandlers getDelete() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b3d199a0f0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b3d199a0f0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b3d199a0f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b3d199a0f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b3d199a0f0x20x0");
		return delete;
    }

    @Override
    public void refresh() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x20x0_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x20x00x0");
		System.out.println("REFRESH");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x20x1_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x20x10x0");
		hupaStorage.expireFolders();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x20x2_____org_apache_hupa_client_ui_LabelListView_java0x026b4c26b26b56c1b0x20x20x0");
		data.refresh();
    }

}
