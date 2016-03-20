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

package org.apache.hupa.client.widgets;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.HupaConstants;
import org.cobogw.gwt.user.client.ui.Button;
import org.cobogw.gwt.user.client.ui.ButtonBar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ConfirmDialogBox extends MyDialogBox implements HasClickHandlers {
    private HupaConstants constants = GWT.create(HupaConstants.class);
    private Label text = new Label();
    private ButtonBar bar = new ButtonBar();
    private VerticalPanel panel = new VerticalPanel();
    private Button okButton = new Button(constants.okButton());
    private Button cancelButton = new Button(constants.cancelButton());

    public ConfirmDialogBox() {
        super();
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x9_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x90x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xa_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xa0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x50x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x6_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x60x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x7_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x8_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x80x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x40x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x40x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x3_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae501c6fa80x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae501c6fa80x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae501c6fa80x20x00x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae501c6fa80x20x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae501c6fa80x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae501c6fa80x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae501c6fa8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae856fe9d60x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae856fe9d60x20x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae856fe9d6_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae856fe9d60x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae856fe9d60x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae856fe9d60x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae3bb28e7a0x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae3bb28e7a0x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae3bb28e7a0x20x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae3bb28e7a0x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae3bb28e7a0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae3bb28e7a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee2ac9297_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee2ac92970x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee2ac92970x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee2ac92970x20x00x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee2ac92970x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee2ac92970x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee2ac92970x20x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2ba2eb920x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2ba2eb920x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2ba2eb920x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2ba2eb92_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2ba2eb920x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2ba2eb920x20x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caef095915e0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caef095915e0x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caef095915e_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caef095915e0x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caef095915e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae0x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xd_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xd0x0");
        setModal(true);
        setAnimationEnabled(true);
        setAutoHideEnabled(false);
        super.setText(constants.productName());
        panel.setSpacing(10);
        panel.add(text);
        bar.add(okButton);
        bar.add(cancelButton);
        panel.add(bar);
        panel.setCellHorizontalAlignment(bar, VerticalPanel.ALIGN_RIGHT);

        cancelButton.addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1208950cc0x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1208950cc0x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1208950cc0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1208950cc0x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1208950cc_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1208950cc0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1208950cc0x30x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xb0x00x00x1208950cc0x30x00x0");
				hide();
            }

        });
        okButton.addClickHandler(new ClickHandler() {

            public void onClick(ClickEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1208950cc0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1208950cc_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1208950cc0x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1208950cc0x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1208950cc0x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1208950cc0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1208950cc0x30x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae2f440cae0x10xc0x00x00x1208950cc0x30x0");
				hide();
            }

        });
        add(panel);
    }

    public void setText(String value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caeffd73afe_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caeffd73afe0x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caeffd73afe0x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caeffd73afe0x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caeffd73afe0x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caeffd73afe0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caeffd73afe0x30x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caeffd73afe0x30x00x0");
		text.setText(value);
    }

    public HandlerRegistration addClickHandler(ClickHandler handler) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee9eb51e20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee9eb51e20x3_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee9eb51e20x20x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee9eb51e20x1_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee9eb51e2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee9eb51e20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee9eb51e20x30x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440caee9eb51e20x30x0");
		return okButton.addClickHandler(handler);
    }

    public void show() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae9fb29051_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae9fb290510x2_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae9fb290510x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae9fb290510x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae9fb290510x20x00x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae9fb290510x20x0");
		super.show();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae9fb290510x20x10x0_____org_apache_hupa_client_widgets_ConfirmDialogBox_java0x02f440cae9fb290510x20x1");
		center();

    }

}
