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
import java.io.OutputStream;

import javax.mail.Folder;
import javax.mail.Message;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.hupa.server.IMAPStoreCache;
import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.domain.User;

import com.google.inject.Inject;
import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

/**
 * Handle viewing of message source
 */
public class MessageSourceServlet extends HttpServlet {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243da80e3df0x4_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243da80e3df0x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243da80e3df0x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243da80e3df0x3_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243da80e3df_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243da80e3df0x2");
	}
	

	private static final long serialVersionUID = 1245563204035792963L;
    private IMAPStoreCache cache;
    private Log logger;

    @Inject
    public MessageSourceServlet(IMAPStoreCache cache, Log logger) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x20x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x2_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x3_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243b03592800x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243b0359280_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243b03592800x2_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243b03592800x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d24316cc54ff0x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d24316cc54ff0x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d24316cc54ff_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d24316cc54ff0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x30x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x30x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x0");
		this.cache = cache;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x30x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d2436c36fcff0x30x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x0");
		this.logger = logger;
    }

    /**
     * Handle to write back the requested attachment
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x20x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x2_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x4_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x30x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x3_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x00x10x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x00x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x00x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x00x10x00x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x00x10x00x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x00x0");
		User user = (User) request.getSession().getAttribute(SConsts.USER_SESS_ATTR);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x10x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x10x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x1");
		String message_uuid = request.getParameter(SConsts.PARAM_UID);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x2_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x20x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x20x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x20x10x0");
		String folderName = request.getParameter(SConsts.PARAM_FOLDER);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x30x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x30x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x3");
		OutputStream outs = null;
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x4");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x00x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x00x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x00x0");
			long uid = Long.parseLong(message_uuid);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x10x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x10x1");
			IMAPStore store = cache.get(user);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x20x10x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x20x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x20x10x00x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x20x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x2_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x20x10x0");
			IMAPFolder f = (IMAPFolder) store.getFolder(folderName);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x3_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x30x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x30x0");
			if (f.isOpen() == false) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x30x10x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x30x10x0");
				f.open(Folder.READ_ONLY);
            }

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x40x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x40x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x4_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x40x1");
			Message m = f.getMessageByUID(uid);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x50x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x5");
			response.setContentType("text/plain");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x6_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x60x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x60x00x0");
			outs = response.getOutputStream();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x70x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x7");
			m.writeTo(outs);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x80x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x8");
			outs.flush();

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x9_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x90x0");
			if (f.isOpen()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x90x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x90x10x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x00x90x10x0");
				f.close(false);
            }
        } catch (Exception e) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x00x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x00x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x00x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x0");
			String msg = "Unable to get raw content of msg for user " + user + " in folder " + folderName + " with uid " + message_uuid;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x10x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x1");
			logger.error(msg, e);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x20x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x2_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x10x10x20x00x0");
			throw new ServletException(msg, e);
        } finally {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x20x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243211f61ff0x40x40x20x00x0");
			IOUtils.closeQuietly(outs);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x2_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x3_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x4_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x20x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x1_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe291");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x40x0_____org_apache_hupa_server_servlet_MessageSourceServlet_java0x078e1d243946fe2910x40x00x0");
		doGet(request, response);
    }

}
