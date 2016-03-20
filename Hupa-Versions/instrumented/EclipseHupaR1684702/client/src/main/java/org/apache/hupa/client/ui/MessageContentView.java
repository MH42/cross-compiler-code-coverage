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

import org.apache.hupa.client.HupaCSS;
import org.apache.hupa.client.HupaConstants;
import org.apache.hupa.client.activity.MessageContentActivity;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.domain.MessageAttachment;
import org.apache.hupa.widgets.editor.Editor;
import org.apache.hupa.widgets.editor.Toolbar;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.Inject;

public class MessageContentView extends Composite implements MessageContentActivity.Displayable {


    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618ffc2781750x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618ffc2781750x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618ffc278175_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618ffc2781750x30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618ffc2781750x3_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618ffc2781750x2_____org_apache_hupa_client_ui_MessageContentView_java0x0");
	}
	
	private final Editor editor = new Editor();

    // TODO should use a scrolled panel which can contain multiple children
    @UiField HTML messageContent = new HTML();
    @UiField FlowPanel attachments;
    @UiField DockLayoutPanel thisPanel;
    @UiField FlowPanel tmpWrapper;
    @UiField DockLayoutPanel messageUpdateContent;
    @UiField SimplePanel updateToolBar;
    @UiField SimplePanel updateEditor;
    @UiField SimpleLayoutPanel centerPanel;

    String messageDetail = "";

    @Inject
    public MessageContentView(HupaConstants constants) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcd02d3460x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcd02d3460x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcd02d346");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f963c4992_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f963c49920x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f963c49920x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9591a1350x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9591a1350x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9591a135");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f21f6c77b_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f21f6c77b0x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f21f6c77b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5cb34b44_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5cb34b440x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5cb34b440x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f99a54f500x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f99a54f50_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f99a54f500x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcc1d28ca_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcc1d28ca0x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcc1d28ca0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f8c1173670x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f8c117367_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f8c1173670x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f850339c3_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f850339c30x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f850339c30x3_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f850339c30x30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f850339c30x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f850339c30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f850339c30x30x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd3456870x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd345687_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd3456870x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd3456870x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd3456870x10x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f0x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f0x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcf26f69d0x00x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcf26f69d_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcf26f69d0x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcf26f69d0x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fcf26f69d0x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x00x00x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x00x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x00x0");
		initWidget(binder.createAndBindUi(this));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x10x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x10x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x10x10x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x10x10x00x0");
		Toolbar toolbar = new Toolbar(editor.getArea(), constants);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x20x0");
		toolbar.ensureDebugId("hupa-editor-toolbar");

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x3_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x30x0");
		tmpWrapper.removeFromParent();


        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x4_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x40x0");
		updateToolBar.setWidget(toolbar);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x5_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x50x0");
		updateEditor.setWidget(editor);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x60x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9927f2d90x20x6");
		clearContent();
    }

    @Override
    public void fillMessageContent(String messageDetail, boolean isEditable) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x4_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x0");
		this.messageDetail = messageDetail;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x1");
		if (isEditable) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x00x00x0");
			editor.setHTML(messageDetail);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x00x10x0");
			centerPanel.setWidget(messageUpdateContent);
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x10x0");
			messageContent.setHTML(messageDetail);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x10x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fb572c81e0x40x10x10x1");
			centerPanel.setWidget(messageContent);
        }
    }

    @Override
    public void setAttachments(List<MessageAttachment> attachements, final String folder, final long uid) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x4_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x20x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x3_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x40x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x30x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x40x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x5_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x20x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x00x0");
		thisPanel.setWidgetHidden(attachments, false);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x1");
		attachments.clear();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x20x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x20x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x20x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x20x20x00x0");
		final Element downloadIframe = RootPanel.get("__download").getElement();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x3");
		if (attachements != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x00x0");
			for (final MessageAttachment messageAttachment : attachements) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x00x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x00x10x0");
				int s = messageAttachment.getSize() / 1024;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x10x10x0");
				if(!(s < 100))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x10x10x00x2");
				if(s < 100)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x10x10x00x1");
				String size = s < 100 ? "" : ("(" + s + " kB)");
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x20x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x20x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x20x10x0");
				String name = messageAttachment.getName() + size;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x3_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x30x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x30x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x30x10x00x0");
				Label link = new Label(name);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x40x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x4");
				link.setTitle(name);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x5_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x50x0");
				link.setStyleName(HupaCSS.C_hyperlink);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x6_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x0");
				link.addClickHandler(new ClickHandler() {
                    @Override
					@SuppressWarnings("deprecation")
					public void onClick(ClickEvent event) {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x3_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x0");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x00x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x00x0");
						String url = getUrl(messageAttachment, folder, uid, false);
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x1");
						if (downloadIframe == null) {
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x1");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x10x00x0");
							Window.open(url, "_blank", "");
						} else {
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x2");
							InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x20x00x00x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x20x00x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x60x00x00x1208950cc0x30x10x20x00x0");
							DOM.setElementAttribute(RootPanel.get("__download").getElement(), "src", url);
						}
                    }
                });
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x7_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x70x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x70x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x70x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x70x0");
				HorizontalPanel aPanel = new HorizontalPanel();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x8_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x80x0");
				aPanel.addStyleName(HupaCSS.C_attachment);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x9_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10x90x0");
				// aPanel.add(new Image(imageBundle.attachmentIcon()));
                aPanel.add(link);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa");
				if (messageAttachment.isImage()) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x00x10x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x00x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x00x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x00x10x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x0");
					Anchor viewImageLink = new Anchor("View", getUrl(messageAttachment, folder, uid, true), "_blank");
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x10x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x1");
					viewImageLink.setStyleName(HupaCSS.C_attachment_view);
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xa0x10x20x0");
					aPanel.add(viewImageLink);
                }
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xb_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5af21ba60x50x30x10x00x10xb0x0");
				attachments.add(aPanel);
            }
        }
    }

    private String getUrl(MessageAttachment messageAttachment, String folder, long uid, boolean inline) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x30x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x4_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d6054_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x40x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x6_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x5_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x50x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x3_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x60x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x60x00x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f9d9d60540x60x00x00x0");
		return GWT.getModuleBaseURL() + SConsts.SERVLET_DOWNLOAD + "?" + SConsts.PARAM_NAME + "="
                + messageAttachment.getName() + "&" + SConsts.PARAM_FOLDER + "=" + folder + "&" + SConsts.PARAM_UID
                + "=" + uid + (inline ? "&" + SConsts.PARAM_MODE + "=inline" : "");
    }

    @Override
    public void clearContent() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5845f0340x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5845f0340x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5845f0340x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5845f034");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5845f0340x20x0_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5845f0340x20x00x0");
		fillMessageContent("<div class='emptyMsg' style='position absolute; height: 100%'/>", false);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5845f0340x20x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618f5845f0340x20x10x0");
		thisPanel.setWidgetHidden(attachments, true);
    }

    interface Binder extends UiBinder<DockLayoutPanel, MessageContentView> {
    }

    private static Binder binder = GWT.create(Binder.class);

    @Override
    public HasHTML getMessageHTML() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd6a3d270x2_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd6a3d270x1_____org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd6a3d270x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd6a3d27");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_ui_MessageContentView_java0x04aeb618fbd6a3d270x20x0");
		return editor;
    }
}
