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

package org.apache.hupa.server.mock;


import tc3.desktop.InstrumentationLoggerProvider;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.mail.FetchProfile;
import javax.mail.Flags;
import javax.mail.Flags.Flag;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.internet.MimeMessage;
import javax.mail.search.SearchTerm;

import com.sun.mail.imap.IMAPFolder;
import com.sun.mail.imap.IMAPStore;

public class MockIMAPFolder extends IMAPFolder {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb6842f820x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb6842f820x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb6842f820x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb6842f820x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb6842f820x4_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb6842f82");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3a02e72b0x4_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3a02e72b0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3a02e72b0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3a02e72b_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3a02e72b0x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3a02e72b0x3");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec24c124be0x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec24c124be_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec24c124be0x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec24c124be0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec24c124be0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec24c124be0x4");
	}
	

	public static final char SEPARATOR = '.';
    public static final String MOCK_DEFAULT_FOLDER = "";
    public static final String MOCK_MESSAGES_LOCATION = "mime/";

    public List<Message> messages = new ArrayList<Message>();
    private boolean closed = true;
    private boolean exists;

    public MockIMAPFolder(String fullName, IMAPStore store) {
        super(fullName, (MOCK_DEFAULT_FOLDER.equals(fullName) ? '\0' : SEPARATOR), store, false);
		if(MOCK_DEFAULT_FOLDER.equals(fullName))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x30x00x00x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x30x00x00x0");
		if(!(MOCK_DEFAULT_FOLDER.equals(fullName)))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x30x00x00x00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec15efa6870x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec15efa687_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec15efa6870x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec15efa6870x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f10x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5a1b1f8e0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x20x00x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x20x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec16f432f10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec0x0");
    }

    @Override
    public synchronized Message[] addMessages(Message[] mArray)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece33fe6e60x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece33fe6e6");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece33fe6e60x40x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece33fe6e60x40x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece33fe6e60x40x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece33fe6e60x40x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece33fe6e60x40x10x0");
		messages.addAll(Arrays.asList(mArray));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece33fe6e60x40x2");
		return mArray;
    }

    @Override
    public void appendMessages(Message[] msgs) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c0x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c0x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c0x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c0x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c0x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec7bfae14c0x30x00x0");
		addMessages(msgs);
    }

    @Override
    public synchronized void close(boolean expunge) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x4_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad89");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x40x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x40x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x40x1");
		if (expunge) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x40x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x40x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x40x10x00x0");
			expunge();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x40x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec979dad890x40x20x0");
		closed = true;
    }

    @Override
    public Folder[] list() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x10x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x10x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x00x00x0");
		List<MockIMAPFolder> folders = ((MockIMAPStore) store).getChilds(this);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x10x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec38b62be40x20x10x00x00x1");
		return folders.toArray(new Folder[folders.size()]);
    }

    @Override
    public synchronized void copyMessages(Message[] messages, Folder folder)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd58");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd580x5");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd580x50x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd580x50x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd580x50x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd580x50x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd580x50x10x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd580x50x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec3e56cd580x50x10x00x00x0");
		((MockIMAPFolder) folder).addMessages(messages);

    }

    public synchronized void loadDemoMessages(Session session) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x4_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x0");
		if (!exists()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x00x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x00x10x0");
			create(IMAPFolder.HOLDS_MESSAGES);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x00x10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x00x10x10x0");
			open(Folder.READ_WRITE);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x1");
		for(int i=0;;i++) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x00x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x00x0");
			String name = MOCK_MESSAGES_LOCATION + i + ".msg";
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x10x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x1");
			InputStream is =  Thread.currentThread().getContextClassLoader().getResourceAsStream(name);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x20x0");
			if (is == null) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x20x10x0");
				break;
			}
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x30x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x30x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eceb7cfebe0x40x10x20x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x10x0");
			addMessages(new Message[]{new MimeMessage(session, is)});
        }
    }

    @Override
    public synchronized boolean create(int type) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x4_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x0");
		if (exists()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x00x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x00x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x00x10x0");
			throw new MessagingException("Folder already exists!");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x1");
		exists = true;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x20x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x20x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x20x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd5edada10x40x20x00x0");
		return ((MockIMAPStore) store).save(this);
    }

    @Override
    public synchronized boolean delete(boolean recursive)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x40x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x40x00x0");
		exists = false;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x40x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x40x10x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x40x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x40x10x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2e16c4eb0x40x10x00x0");
		return ((MockIMAPStore) store).delete(this, recursive);
    }

    @Override
    public synchronized boolean exists() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f10x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f10x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4d68c8f10x30x0");
		return exists;
    }

    @Override
    public synchronized void fetch(Message[] msgs, FetchProfile fp)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2b6e2d360x5");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2b6e2d36");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2b6e2d360x50x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2b6e2d360x50x00x0");
		checkExists();
    }

    @Override
    public synchronized int getDeletedMessageCount() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf645ccde0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf645ccde0x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf645ccde0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf645ccde0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf645ccde");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf645ccde0x30x0");
		return 0;
    }

    @Override
    public Folder getFolder(String name) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecdc1b2a9e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecdc1b2a9e0x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecdc1b2a9e0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecdc1b2a9e0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecdc1b2a9e0x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecdc1b2a9e0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecdc1b2a9e0x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecdc1b2a9e0x30x0");
		return super.getFolder(name);
    }

    @Override
    public synchronized String getFullName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eca748d7d50x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eca748d7d50x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eca748d7d50x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eca748d7d50x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eca748d7d5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eca748d7d50x30x0");
		return fullName;
    }

    @Override
    public synchronized Message getMessage(int msgnum)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e8");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x1");
		if (messages.size() <= msgnum) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x10x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x10x10x0");
			throw new MessagingException();
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec9afbf9e80x40x2");
		return messages.get(msgnum);
    }

    @Override
    public synchronized Message getMessageByUID(long uid)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5dd57de20x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5dd57de2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5dd57de20x40x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5dd57de20x40x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5dd57de20x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5dd57de20x40x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5dd57de20x40x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5dd57de20x40x1");
		return getMessage((int)uid);
    }

    @Override
    public synchronized int getMessageCount() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb423511");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb4235110x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb4235110x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb4235110x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb4235110x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb4235110x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb4235110x30x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb4235110x30x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbb4235110x30x1");
		return messages.size();
    }

    @Override
    public synchronized Message[] getMessagesByUID(long uidstart, long uidend)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x5");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x50x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x50x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x50x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x50x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x50x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x50x10x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x50x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecf08776ae0x50x10x00x10x0");
		return getMessages((int)uidstart, (int)uidend);
    }

    @Override
    public synchronized Message[] getMessagesByUID(long[] uids)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x10x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x10x10x0");
		int ints[] = new int[uids.length];
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x2");
		for (int i = 0; i < uids.length; i++) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x30x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x30x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x20x30x0");
			ints[i] = (int)uids[i];
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec36c7066d0x40x30x0");
		return getMessages(ints);
    }

    @Override
    public synchronized String getName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecfa98c1fd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecfa98c1fd0x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecfa98c1fd0x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecfa98c1fd0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecfa98c1fd0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecfa98c1fd0x30x0");
		return name;
    }

    @Override
    public synchronized int getNewMessageCount() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbe661c64");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbe661c640x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbe661c640x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbe661c640x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbe661c640x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbe661c640x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbe661c640x30x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecbe661c640x30x1");
		return 0;
    }

    @Override
    public synchronized Folder getParent() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f881");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x30x00x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x30x00x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x30x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2ad5f8810x30x00x00x0");
		return ((MockIMAPStore) store).getParent(this);
    }

    @Override
    public void idle() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec1adbcc340x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec1adbcc340x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec1adbcc340x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec1adbcc34");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec1adbcc340x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec1adbcc340x20x0");
		checkExists();
    }

    @Override
    public synchronized boolean isOpen() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecca0690300x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecca0690300x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecca0690300x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecca0690300x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecca069030");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecca0690300x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecca0690300x30x00x0");
		return closed == false;
    }

    @Override
    public synchronized boolean isSubscribed() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec57e2faf3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec57e2faf30x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec57e2faf30x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec57e2faf30x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec57e2faf30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec57e2faf30x30x0");
		return true;
    }

    @Override
    public synchronized void open(int arg0) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x4_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x40x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x40x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecc668074f0x40x1");
		closed = false;
    }

    @Override
    public synchronized boolean renameTo(Folder f) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x40x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x40x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec62e389f60x40x1");
		return false;
    }

    @Override
    public synchronized Message[] search(SearchTerm arg0, Message[] arg1)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5ddf7257");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5ddf72570x5");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5ddf72570x50x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5ddf72570x50x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec5ddf72570x50x1");
		return arg1;
    }

    @Override
    public synchronized Message[] expunge() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece7405011");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x10x00x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x10x00x00x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece74050110x30x10x00x00x00x0");
		return expunge(messages.toArray(new Message[messages.size()]));
    }

    @Override
    public synchronized Message[] expunge(Message[] msgs)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x10x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x10x10x00x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x10x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x10x1");
		List<Message> mList = new ArrayList<Message>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x00x0");
		for (Message message : msgs) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x00x0");
			if (message.getFlags().contains(Flag.DELETED)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x00x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x00x10x00x0");
				if (messages.remove(message)) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x00x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x00x10x00x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x20x10x00x10x00x10x0");
					mList.add(message);
                }
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x30x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x30x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x30x00x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec4c37c85e0x40x30x00x0");
		return mList.toArray(new Message[mList.size()]);
    }

    @Override
    public synchronized Message[] search(SearchTerm search)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c88");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x10x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x10x10x00x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x10x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x1");
		ArrayList<Message> ret = new ArrayList<Message>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x20x0");
		for (Message m : messages) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x20x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x20x10x00x0");
			if (search.match(m)) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x20x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x20x10x00x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x20x10x00x10x0");
				ret.add(m);
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x30x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ece36e7c880x40x30x00x00x00x0");
		return ret.toArray(new Message[0]);
    }

    @Override
    public synchronized void setFlags(Message[] mArray, Flags flags,
            boolean value) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b0697");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x50x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x5_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x6");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x0");
		for (Message message : mArray) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x0");
			for (Message message2 : messages) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x10x00x0");
				if (message2.equals(message)) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x10x00x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x10x00x10x00x0");
					message2.setFlags(flags, value);
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecd50b06970x60x10x10x00x10x00x10x1");
					break;
                }
            }
        }
    }

    @Override
    public synchronized Message[] getMessages() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c414615");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x30x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x30x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x30x10x00x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x30x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x30x10x00x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x30x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec8c4146150x30x10x00x0");
		return messages.toArray(new Message[messages.size()]);

    }

    @Override
    public synchronized Message[] getMessages(int start, int end)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x5");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x10x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x10x10x00x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x10x10x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x10x00x0");
		Message[] array = new Message[end- --start];
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x00x1");
		for (int i=0; start<end; i++,start++) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x4");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x40x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x40x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x20x40x00x0");
			array[i] = messages.get(start);
		}
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec2f7dc1b20x50x3");
		return array;
    }

    @Override
    public synchronized Message[] getMessages(int[] ints)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x4");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x10x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x10x00x0");
		Message[] array = new Message[ints.length];

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x00x1");
		for (int i = 0; i < ints.length; i++) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x3");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x0");
			int mInt = ints[i];
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x10x00x1");
			if (mInt > messages.size() || mInt < 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x10x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x10x10x00x0");
				throw new MessagingException();
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x20x30x20x0");
			array[i] = messages.get(ints[i]);
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec6f7e044e0x40x3");
		return array;
    }

    @Override
    public Store getStore() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eccc87ba9b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eccc87ba9b0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eccc87ba9b0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eccc87ba9b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6eccc87ba9b0x20x0");
		return store;
    }

    @Override
    public synchronized void setFlags(int arg0, int arg1, Flags arg2,
            boolean arg3) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecddf825810x60x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecddf825810x6_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecddf825810x7");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecddf82581");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecddf825810x70x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecddf825810x70x00x0");
		checkExists();
    }

    @Override
    public synchronized void setFlags(int[] arg0, Flags arg1, boolean arg2)
            throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec150e5e1a");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec150e5e1a0x6");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec150e5e1a0x60x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec150e5e1a0x60x00x0");
		checkExists();
    }

    @Override
    public synchronized long getUID(Message message) throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x4_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x30x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x40x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x40x00x0");
		checkExists();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x40x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ec845cc3e10x40x1");
		return messages.indexOf(message);
    }

    @Override
    public synchronized int getUnreadMessageCount() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d13");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x3_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x2_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x00x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x00x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x0");
		int ret = getMessageCount();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x00x0");
		for (Message msg: messages) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x10x00x00x0");
			if (msg.getFlags().contains(Flag.SEEN)) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x10x00x10x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x10x10x00x10x00x0");
				ret --;
			}
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecadcf2d130x30x2");
		return ret;
    }

    @Override
    protected void checkExists() throws MessagingException {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x1_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x20x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x20x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x20x0");
		if (exists() == false) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x20x00x10x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x20x00x10x00x00x0_____org_apache_hupa_server_mock_MockIMAPFolder_java0x04f61b6ecb980a94b0x20x00x10x0");
			throw new MessagingException("Folder not exists");
        }
    }

}
