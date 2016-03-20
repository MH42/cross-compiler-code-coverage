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
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Part;
import javax.mail.Store;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.hupa.server.IMAPStoreCache;
import org.apache.hupa.server.utils.MessageUtils;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.domain.User;

import com.google.inject.Inject;
import com.sun.mail.imap.IMAPFolder;

/**
 * Handle to download attachments in messages
 */
public class DownloadAttachmentServlet extends HttpServlet {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7da80e3df0x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7da80e3df0x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7da80e3df0x2_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7da80e3df0x4_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7da80e3df0x3_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7da80e3df");
	}
	
	private static final long serialVersionUID = 1245563204035792963L;

    private final IMAPStoreCache cache;
    private final Log logger;

    @Inject
    public DownloadAttachmentServlet(IMAPStoreCache cache, Log logger) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x3_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x2_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x20x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7b03592800x2_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7b03592800x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7b03592800x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7b03592800x3_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7b0359280");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac716cc54ff0x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac716cc54ff0x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac716cc54ff0x3_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac716cc54ff0x2_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac716cc54ff");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x30x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x30x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0");
		this.cache = cache;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x30x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7ad36d39d0x30x1");
		this.logger = logger;
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7946fe2910x3_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7946fe2910x4_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7946fe2910x30x0");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7946fe291");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7946fe2910x40x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7946fe2910x40x00x0");
		doGet(request, response);
    }

    /**
     * Handle to write back the requested attachment
     */
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x30x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x4_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x3");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x00x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x00x10x00x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x00x10x00x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x00x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x00x10x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x0");
		User user = (User) request.getSession().getAttribute(SConsts.USER_SESS_ATTR);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x10x0");
		if (user == null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x10x10x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x10x10x00x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x10x10x0");
			throw new ServletException("Invalid session");
		}

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x2_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x20x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x20x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x20x0");
		String message_uuid = request.getParameter(SConsts.PARAM_UID);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x30x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x30x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x30x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x3");
		String attachmentName = request.getParameter(SConsts.PARAM_NAME);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x40x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x4_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x40x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x40x1");
		String folderName = request.getParameter(SConsts.PARAM_FOLDER);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x50x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x5_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x50x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x50x1");
		String mode = request.getParameter(SConsts.PARAM_MODE);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x60x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x6_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x60x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x60x10x0");
		boolean inline = "inline".equals(mode);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x70x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x7");
		if (!inline) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x70x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x70x10x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x70x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x70x10x00x00x0");
		response.setHeader("Content-disposition", "attachment; filename="
            + attachmentName + "");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x80x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x8_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x80x0");
		InputStream in = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x90x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x90x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x9_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40x90x10x0");
		OutputStream out = response.getOutputStream();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xa_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xa0x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xa0x0");
		IMAPFolder folder = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x0");
		try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x00x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x00x1");
			Store store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x10x00x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x10x00x00x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x10x00x0");
			folder = (IMAPFolder) store.getFolder(folderName);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x2_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x20x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x20x00x0");
			if (folder.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x20x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x20x10x00x0");
				folder.open(Folder.READ_ONLY);
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x30x10x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x30x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x30x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x3_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x30x10x0");
			Message m = folder.getMessageByUID(Long.parseLong(message_uuid));

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x4_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x40x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x40x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x40x10x0");
			Object content = m.getContent();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x50x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x50x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x5_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x50x0");
			Part part  = MessageUtils.handleMultiPart(logger, content, attachmentName);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x6");
			if (part.getContentType()!=null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x10x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x10x00x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x10x0");
				response.setContentType(part.getContentType());
            } else {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x20x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x60x20x0");
				response.setContentType("application/download");
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x7_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x70x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x70x0");
			handleAttachmentData(request, m, attachmentName, part.getInputStream(), out);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x00x8");
			return;
        } catch (Exception e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x10x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x10x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x10x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x10x10x00x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x10x10x00x0");
			logger.error("Error while downloading attachment "
                    + attachmentName + " of message " + message_uuid
                    + " for user " + user.getName(), e);
        } finally {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x0");
			IOUtils.closeQuietly(in);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x1");
			IOUtils.closeQuietly(out);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x2_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x0");
			if (folder != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x10x00x0");
				try {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x10x00x00x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x10x00x00x0");
					folder.close(false);
                } catch (MessagingException e) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x10x00x10x00x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x10x00x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x10x00x1_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7211f61ff0x40xb0x20x20x10x00x10x1");
                }
            }
        }
    }

    /**
     * Override this to create customized servlets
     */
    protected void handleAttachmentData(HttpServletRequest req, Message message,
            String attachmentName, InputStream is, OutputStream os) throws Exception {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d8771");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x60x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x7_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x6_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x40x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x50x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x5_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x70x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x70x00x0");
		IOUtils.copy(is, os);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x70x10x0_____org_apache_hupa_server_servlet_DownloadAttachmentServlet_java0x0e5d84ac7746d87710x70x1");
		IOUtils.closeQuietly(os);
    }
}
