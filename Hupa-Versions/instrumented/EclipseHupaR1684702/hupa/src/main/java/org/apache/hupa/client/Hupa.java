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

package org.apache.hupa.client;


import com.google.gwt.core.client.ScriptInjector;

import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.client.ioc.AppGinModule.AppGinjector;
import org.apache.hupa.client.ioc.AppInjector;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.GWT.UncaughtExceptionHandler;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.user.client.DOM;

public class Hupa implements EntryPoint {

    @Override
    public void onModuleLoad() {
        InstrumentationLoggerProvider.set(new tc3.client.InstrumentationLogger());
		ScriptInjector.fromString("var nameSuffix = ''; var record = false; var nodeIdCounter = 0; var bufferedNodeIdentifiers = {}; var testCaseName = window.top.location.search.substring(1); var loggingServer = new WebSocket('ws://localhost:8090/loggingServer'); loggingServer.onopen = function() {}; loggingServer.onmessage = function(evt) { if(evt.data=='0') {flushNodeIdentifiers(nameSuffix); record = false; } else if(evt.data=='1') {record = true; flushNodeIdentifiers(nameSuffix); nameSuffix = ''; } else if(evt.data!==undefined) {flushNodeIdentifiers(nameSuffix); nameSuffix = evt.data; record = true; } }; loggingServer.onclose = function() { flushNodeIdentifiers(nameSuffix) }; function flushNodeIdentifiers(nameSufx) { if(nodeIdCounter > 0) { if(loggingServer.readyState === 1) { loggingServer.send('testName='+testCaseName+'&nr='+JSON.stringify(bufferedNodeIdentifiers)+'&testSuffix='+nameSufx); bufferedNodeIdentifiers = {}; nodeIdCounter = 0; } else { setTimeout(function() { flushNodeIdentifiers(nameSuffix); },250); } } } function sendToLoggingServer(nodeIdentifier) { if(!record) {return;} bufferedNodeIdentifiers[nodeIdentifier]=nodeIdentifier; nodeIdCounter++; if(nodeIdCounter > 1200) { flushNodeIdentifiers(nameSuffix); } }")
				 .setRemoveTag(false)
				 .setWindow(ScriptInjector.TOP_WINDOW)
				 .inject();
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b958af03dc2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b958af03dc20x0_____org_apache_hupa_client_Hupa_java0x031c56b958af03dc20x1_____org_apache_hupa_client_Hupa_java0x031c56b958af03dc20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95_____org_apache_hupa_client_Hupa_java0x031c56b950x1_____org_apache_hupa_client_Hupa_java0x031c56b950x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b958af03dc20x20x00x0_____org_apache_hupa_client_Hupa_java0x031c56b958af03dc20x20x0");
		handleExceptionsAsync();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b958af03dc20x20x10x0_____org_apache_hupa_client_Hupa_java0x031c56b958af03dc20x20x1");
		initApp();
    }

    protected void initApp() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x0_____org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x2_____org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x1_____org_apache_hupa_client_Hupa_java0x031c56b95219b09a2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x20x00x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x20x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x20x0");
		DOM.getElementById("loading").removeFromParent();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x20x1_____org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x20x10x0_____org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x20x10x00x0");
		createInjector().getHupaController();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x20x2_____org_apache_hupa_client_Hupa_java0x031c56b95219b09a20x20x20x0");
		bindEvents();
    }

    protected void bindEvents() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95923116350x0_____org_apache_hupa_client_Hupa_java0x031c56b95923116350x1_____org_apache_hupa_client_Hupa_java0x031c56b95923116350x2_____org_apache_hupa_client_Hupa_java0x031c56b9592311635");
    }

    protected AppInjector createInjector() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95d3964869_____org_apache_hupa_client_Hupa_java0x031c56b95d39648690x0_____org_apache_hupa_client_Hupa_java0x031c56b95d39648690x2_____org_apache_hupa_client_Hupa_java0x031c56b95d39648690x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95d39648690x20x00x0_____org_apache_hupa_client_Hupa_java0x0_____org_apache_hupa_client_Hupa_java0x031c56b95d39648690x20x0");
		return GWT.create(AppGinjector.class);
    }

    protected void handleExceptionsAsync() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x2_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x1_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e1_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x0_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x0_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x0_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x0");
		GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
			public void onUncaughtException(Throwable e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x2_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x3_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x1_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x0_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x20x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x30x00x0_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x30x0");
				e.printStackTrace();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x30x1_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x30x10x00x0_____org_apache_hupa_client_Hupa_java0x031c56b957076d5e10x20x00x00x00x1db65bf2e0x30x10x0");
				GQuery.console.log(stackTraceToString(e));
            }
        });
    }

    private String stackTraceToString(Throwable throwable) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x2_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x1_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x20x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x3_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x00x1");
		String ret = "";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x1_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x0");
		while (throwable != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x00x0");
			if (ret != "") {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x00x10x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x00x10x0");
				ret += "\nCaused by: ";
			}
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x10x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x10x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x1");
			ret += throwable.toString();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x2_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x20x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x20x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x20x1");
			for (StackTraceElement sTE : throwable.getStackTrace()) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x20x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x20x20x00x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x20x20x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x20x20x0");
				ret += "\n  at " + sTE;
			}
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x30x00x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x30x0_____org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x10x10x3");
			throwable = throwable.getCause();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_Hupa_java0x031c56b95f7dffaf00x30x2");
		return ret;
    }
}
