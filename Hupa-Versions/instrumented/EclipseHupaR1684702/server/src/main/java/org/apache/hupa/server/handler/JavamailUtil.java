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

package org.apache.hupa.server.handler;


import tc3.desktop.InstrumentationLoggerProvider;
import java.util.ArrayList;

import javax.mail.Flags;
import javax.mail.Flags.Flag;

import org.apache.hupa.shared.data.MessageImpl.IMAPFlag;

/**
 * Util class which helps to convert from hupa internal data representation to javamaill classes
 *
 */
public class JavamailUtil {

    public JavamailUtil(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4");
	}
	

	/**
     * Convert the given Flags to a ArrayList of IMAPFlags
     *
     * @param flags
     * @return imapFlags
     */
    public static ArrayList<IMAPFlag> convert(Flags flags) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x20x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x2_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x30x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x3_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x4_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x00x10x00x00x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x00x10x00x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x00x10x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x00x00x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x00x10x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x00x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x00x1");
		ArrayList<IMAPFlag> fList = new ArrayList<IMAPFlag>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x10x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x10x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x10x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x1");
		for (Flag flag : flags.getSystemFlags()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x10x20x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x10x20x00x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x10x20x0");
			fList.add(convert(flag));
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b41920f9c50x40x2");
		return fList;

    }

    public static IMAPFlag convert(Flag flag) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x4_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x30x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x3_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e380_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x0");
		if (flag.equals(Flag.SEEN)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x10x0");
			return IMAPFlag.SEEN;
        } else if (flag.equals(Flag.RECENT)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x10x0");
			return IMAPFlag.RECENT;
        } else if (flag.equals(Flag.ANSWERED)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x10x0");
			return IMAPFlag.ANSWERED;
        } else if (flag.equals(Flag.DELETED)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x10x0");
			return IMAPFlag.DELETED;
        } else if (flag.equals(Flag.DRAFT)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x10x0");
			return IMAPFlag.DRAFT;
        } else if (flag.equals(Flag.FLAGGED)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x20x10x0");
			return IMAPFlag.FLAGGED;
        } else if (flag.equals(Flag.USER)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x00x20x20x20x20x20x20x10x0");
			return IMAPFlag.USER;
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x10x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x10x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b46795e3800x40x10x00x1");
		throw new IllegalArgumentException("Flag not supported " + flag);
    }
    /**
     * Convert the given ArrayList of IMAPFlags to a Flags object
     *
     * @param imapFlags
     * @return flags
     */
    public static Flags convert(ArrayList<IMAPFlag> imapFlags) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x30x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x30x00x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x2_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x30x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x3_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x00x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x00x10x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x00x10x00x0");
		Flags iFlags = new Flags();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x10x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x10x0");
		for (IMAPFlag flag : imapFlags) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x10x10x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x10x10x00x00x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x10x10x00x0");
			iFlags.add(convert(flag));
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4c0172c0c0x40x2");
		return iFlags;
    }

    public static Flag convert(IMAPFlag flag) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x2_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x30x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x3_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x0");
		if (flag.equals(IMAPFlag.SEEN)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x10x0");
			return Flag.SEEN;
        } else if (flag.equals(IMAPFlag.RECENT)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x10x0");
			return Flag.RECENT;
        } else if (flag.equals(IMAPFlag.ANSWERED)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x20x10x0");
			return Flag.ANSWERED;
        } else if (flag.equals(IMAPFlag.DELETED)) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x00x20x20x20x10x0");
			return Flag.DELETED;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x1_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x10x0_____org_apache_hupa_server_handler_JavamailUtil_java0x0fc3a90b4e1ce712f0x40x10x00x0");
		throw new IllegalArgumentException("Flag not supported");

    }
}
