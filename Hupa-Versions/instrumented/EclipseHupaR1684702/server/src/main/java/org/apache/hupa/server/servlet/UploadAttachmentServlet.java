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

package org.apache.hupa.server.servlet;


import tc3.desktop.InstrumentationLoggerProvider;
import gwtupload.server.UploadAction;
import gwtupload.server.exceptions.UploadActionException;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.logging.Log;
import org.apache.hupa.server.utils.SessionUtils;

import com.google.inject.Inject;

/**
 * Servlet which handle uploads. The uploaded files will get added to a temporary registry to get looked-up
 * later.
 *
 *
 */
public class UploadAttachmentServlet extends UploadAction{

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d3a4bb2400x3_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d3a4bb2400x1_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d3a4bb2400x4_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d3a4bb2400x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d3a4bb240_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d3a4bb2400x2");
	}
	
	private static final long serialVersionUID = 4936687307133529124L;



    private final Log logger;

    @Inject
    public UploadAttachmentServlet(Log logger) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424dd37f8f5a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424dd37f8f5a0x10x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424dd37f8f5a0x2_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424dd37f8f5a0x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424dd37f8f5a0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d16cc54ff0x1_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d16cc54ff0x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d16cc54ff0x3_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d16cc54ff0x2_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d16cc54ff");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424dd37f8f5a0x20x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424dd37f8f5a0x20x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x0");
		this.logger = logger;
    }

    @Override
    public String executeAction(HttpServletRequest request, List<FileItem> sessionFiles) throws UploadActionException {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c06027");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x2_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x30x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x4_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x1_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x3_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x30x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x20x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x30x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x00x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x00x00x00x1_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x00x00x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x00x00x00x10x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x00x00x00x10x00x0");
		logger.info("Executing Action, files in session: " + sessionFiles.size() + " previous files in registry: " + SessionUtils.getSessionRegistry(logger, request.getSession()).size());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x10x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x1_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x10x00x0");
		// save file items in the user session's registry
        for(FileItem item: sessionFiles) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x10x10x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x10x10x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x10x10x00x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x10x10x00x00x00x0");
			SessionUtils.getSessionRegistry(logger, request.getSession()).add(item);
		}


        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x2_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x20x0");
		// remove items from session but not remove the data from disk or memory
        removeSessionFileItems(request, false);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424d44c060270x40x3");
		return null;
    }

    @Override
    public void removeItem(HttpServletRequest request, FileItem item)  throws UploadActionException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x20x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x3_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x1_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x2_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x30x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x4_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb050887");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x40x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x40x00x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x40x00x00x00x0_____org_apache_hupa_server_servlet_UploadAttachmentServlet_java0x073c5424ddb0508870x40x00x0");
		SessionUtils.getSessionRegistry(logger, request.getSession()).remove(item);
    }
}
