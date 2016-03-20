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

package org.apache.hupa.server.ioc;


import tc3.desktop.InstrumentationLoggerProvider;
import org.apache.hupa.server.servlet.DownloadAttachmentServlet;
import org.apache.hupa.server.servlet.MessageSourceServlet;
import org.apache.hupa.server.servlet.UploadAttachmentServlet;
import org.apache.hupa.shared.SConsts;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

public class GuiceWebModule extends ServletModule {

  public GuiceWebModule(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe720x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe720x0");
	}
	
@Override
  protected void configureServlets() {
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x2_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x1");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d0508683");
	InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x00x0");
	System.err.println("GuiceWebModule configuring servlets.");

    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x10x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x10x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0");
	bind(IocRfServlet.class).in(Singleton.class);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x20x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x2_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x20x0");
	serveRegex(".*/gwtRequest").with(IocRfServlet.class);

    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x30x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x3_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x30x00x0");
	bind(DownloadAttachmentServlet.class).in(Singleton.class);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x4_____org_apache_hupa_server_ioc_GuiceWebModule_java0x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x40x00x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x40x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x40x0");
	serveRegex(".*/" + SConsts.HUPA + SConsts.SERVLET_DOWNLOAD).with(DownloadAttachmentServlet.class);

    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x50x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x50x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x5");
	bind(UploadAttachmentServlet.class).in(Singleton.class);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x60x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x60x00x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x60x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x6_____org_apache_hupa_server_ioc_GuiceWebModule_java0x1");
	serveRegex(".*/" + SConsts.HUPA + SConsts.SERVLET_UPLOAD).with(UploadAttachmentServlet.class);

    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x7_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x70x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x70x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0");
	bind(MessageSourceServlet.class).in(Singleton.class);
    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x80x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x80x00x00x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x1_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x80x0_____org_apache_hupa_server_ioc_GuiceWebModule_java0x0f4d7fe72d05086830x20x8");
	serveRegex(".*/" + SConsts.HUPA + SConsts.SERVLET_SOURCE).with(MessageSourceServlet.class);
  }
}
