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
import org.apache.hupa.shared.data.ImapFolderImpl;
import org.apache.hupa.shared.events.MoveMessageEvent;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasVisibility;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ListBox;
import com.google.inject.Inject;

public class MessageListFooterActivity extends AppBaseActivity {

    public MessageListFooterActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7c0x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7c_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7c0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7caac51d7d0x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7caac51d7d_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7caac51d7d0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7c59b189070x2_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7c59b189070x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7c59b18907_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7c59b189070x1");
	}
	

	@Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x2_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x30x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x4_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x3_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x40x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x40x00x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x40x00x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x40x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cabdb942c0x40x10x0");
		bindTo(eventBus);
    }

    private void bindTo(final EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x2_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x20x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x3_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x20x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x00x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x00x2_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x00x20x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x0");
		final ListBox labels = display.getLabels();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1");
		labels.addChangeHandler(new ChangeHandler() {
            public void onChange(ChangeEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x2_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x20x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x3_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x00x10x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x00x1");
				int selectedIndex = labels.getSelectedIndex();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x0");
				if (selectedIndex > 0){
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x00x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x00x10x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x00x10x00x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x00x10x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x00x10x00x00x00x0");
					String newFolderName = labels.getItemText(labels.getSelectedIndex()).replace(".", "").trim();
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x10x00x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x10x00x00x10x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x10x00x0_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x10x00x00x1_____org_apache_hupa_client_activity_MessageListFooterActivity_java0x069dc5f7cda82389f0x30x10x00x00x1be0b1a4b0x30x10x10x10x0");
					eventBus.fireEvent(new MoveMessageEvent(new ImapFolderImpl(newFolderName)));
                }
            }
        });
    }

    @Inject private Displayable display;

    public interface Displayable extends IsWidget {
        SimplePager getPager();
        HasVisibility getLabelsPanel();
        ListBox getLabels();
    }
}
