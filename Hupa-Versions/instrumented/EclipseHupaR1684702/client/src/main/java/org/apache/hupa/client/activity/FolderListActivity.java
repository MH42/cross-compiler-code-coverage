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
import org.apache.hupa.shared.events.RefreshFoldersEvent;
import org.apache.hupa.shared.events.RefreshFoldersEventHandler;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.inject.Inject;

public class FolderListActivity extends AppBaseActivity {

    public FolderListActivity(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe059b189070x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe059b18907_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe059b189070x2_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe059b189070x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x2_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c01");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0aac51d7d0x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0aac51d7d0x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0aac51d7d");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe00x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe00x0");
	}
	

	@Inject private Displayable display;

    @Override
    public void start(AcceptsOneWidget container, EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x20x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x4_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x3_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x2_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x40x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x40x00x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x40x00x0");
		container.setWidget(display.asWidget());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x40x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0abdb942c0x40x10x0");
		bindTo(eventBus);
    }

    private Timer refreshFoldersTimer = new Timer() {
        public void run() {
           InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1df6ad1900x2_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1df6ad190_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1df6ad1900x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1df6ad1900x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1df6ad1900x20x00x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1df6ad1900x20x00x00x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1df6ad1900x20x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe072fb3c010x20x00x1df6ad1900x20x0");
		eventBus.fireEvent(new RefreshFoldersEvent());
        }
    };

    private void bindTo(EventBus eventBus) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x20x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x3_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x0");
		eventBus.addHandler(RefreshFoldersEvent.TYPE, new RefreshFoldersEventHandler() {
            @Override
            public void onRefreshEvent(RefreshFoldersEvent event) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x188f92188");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x188f921880x20x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x188f921880x3_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x188f921880x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x188f921880x2_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x188f921880x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x188f921880x30x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x00x00x00x188f921880x30x00x0");
				display.refresh();
            }
        });
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x10x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x10x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0bc3fb24b0x30x1");
		refreshFoldersTimer.scheduleRepeating(3*60*1000);
    }

    @Override
    public void onStop() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0d2e0f1d9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0d2e0f1d90x2_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0d2e0f1d90x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0d2e0f1d90x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0d2e0f1d90x20x00x0_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0d2e0f1d90x20x0");
		super.onStop();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0d2e0f1d90x20x1_____org_apache_hupa_client_activity_FolderListActivity_java0x0a3e30fe0d2e0f1d90x20x10x0");
		refreshFoldersTimer.cancel();
    }

    public interface Displayable extends IsWidget {
        void refresh();
    }
}
