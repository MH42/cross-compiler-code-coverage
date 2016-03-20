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
import org.apache.hupa.client.activity.TopBarActivity;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.SimplePanel;

public class TopBarView extends Composite implements TopBarActivity.Displayable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdef9cd208e0x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdef9cd208e_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdef9cd208e0x30x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdef9cd208e0x2_____org_apache_hupa_client_ui_TopBarView_java0x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdef9cd208e0x3_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdef9cd208e0x1");
	}
	

	@UiField Anchor about;
    @UiField Anchor logout;
    @UiField HTMLPanel userLabel;
    @UiField SimplePanel loading;
    @UiField HTML loadingRegion;

    @UiField Style style;

    interface Style extends CssResource {
        String hideLoading();
    }

    public TopBarView() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde19bcdfde0x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde19bcdfde0x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde19bcdfde");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde99a0efc60x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde99a0efc6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde93d166a9_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde93d166a90x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde93d166a90x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde14b85fa80x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde14b85fa80x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde14b85fa8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde26ec8d000x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde26ec8d000x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde26ec8d00");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde5780daf6_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde5780daf60x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde5780daf60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdeda0c66680x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdeda0c66680x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdeda0c6668");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde55525e1b0x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde55525e1b0x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde55525e1b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde0x2_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde0x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdec126ad48_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdec126ad480x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdec126ad480x00x2_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdec126ad480x00x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdec126ad480x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde19bcdfde0x10x00x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde19bcdfde0x10x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde19bcdfde0x10x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde19bcdfde0x10x00x00x00x0");
		initWidget(binder.createAndBindUi(this));
    }

    @UiHandler("about")
    void handleAboutClick(ClickEvent e){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde262868ed");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde262868ed0x2_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde262868ed0x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde262868ed0x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde262868ed0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde262868ed0x20x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde262868ed0x20x00x0");
		Window.alert("// TODO show about model view");
    }

    @Override
    public void showLoading(String message){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e68");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x2_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x3_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x20x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x30x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x30x0");
		loadingRegion.setHTML(message);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x30x10x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x30x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdefe569e680x30x10x00x0");
		loading.removeStyleName(style.hideLoading());
    }

    @Override
    public void hideLoading(){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f40x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f40x2_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f40x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f40x20x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f40x20x0");
		loadingRegion.setHTML("");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f40x20x10x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f40x20x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde7aa780f40x20x10x0");
		loading.addStyleName(style.hideLoading());
    }

    @Override
    public HasClickHandlers getLogoutClick() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdeca189a740x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdeca189a740x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdeca189a740x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdeca189a74");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdeca189a740x20x0");
		return logout;
    }

    @Override
    public HTMLPanel getUserLabel() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdea6da6f5c0x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdea6da6f5c0x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfdea6da6f5c0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdea6da6f5c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfdea6da6f5c0x20x0");
		return userLabel;
    }

    @Override
    public void showUserName(String userName){
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f0820");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x3_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x20x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x2_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x30x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x30x0");
		userLabel.clear();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x30x10x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x30x1_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x30x10x00x00x0_____org_apache_hupa_client_ui_TopBarView_java0x019bcdfde879f08200x30x10x0");
		userLabel.add(new HTML(userName));
    }

    interface TopBarUiBinder extends UiBinder<DockLayoutPanel, TopBarView> {
    }

    private static TopBarUiBinder binder = GWT.create(TopBarUiBinder.class);

}
