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

package org.apache.hupa.shared.data;


import tc3.shared.InstrumentationLoggerProvider;
import java.util.ArrayList;
import java.util.List;

import org.apache.hupa.shared.domain.MailHeader;
import org.apache.hupa.shared.domain.MessageAttachment;
import org.apache.hupa.shared.domain.SmtpMessage;

public class SmtpMessageImpl extends AbstractMessageImpl implements SmtpMessage {
    public SmtpMessageImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4980x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4980x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4980x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498372ea08c0x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498372ea08c0x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498372ea08c0x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498372ea08c");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498e87b45950x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498e87b45950x10x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498e87b45950x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498e87b45950x10x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498e87b45950x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498e87b4595");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4981a20a7bb0x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4981a20a7bb0x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4981a20a7bb0x10x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4981a20a7bb0x10x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4981a20a7bb_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4981a20a7bb0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x20x00x00x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x20x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x20x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x10x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x20x00x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a202c17d0x10x0");
	}
	

	private List<String> bcc;
    private String text;
    private List<MessageAttachment> messageAttachments;
    private List<MailHeader> mailHeaders = new ArrayList<MailHeader>();

    @Override
	public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc608");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x00x10x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x00x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x00x10x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x00x0");
		StringBuffer bccList = new StringBuffer("");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x0");
		if (bcc != null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x10x00x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x10x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x10x0");
			for (String s : bcc) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x10x00x10x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x10x00x10x00x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x10x10x00x10x0");
				bccList.append(s).append(" ");
			}
		}

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x20x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x20x10x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x20x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x20x10x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x2");
		StringBuffer attachNames = new StringBuffer("");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x3_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x30x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x30x00x0");
		for (MessageAttachment m : messageAttachments) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x30x10x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x30x10x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x30x10x00x00x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x30x10x00x00x0");
			attachNames.append(m.getName()).append(" ");
		}

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x40x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x4_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x40x00x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x40x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a7edc6080x20x40x00x2");
		return super.toString() + " Bcc='" + bccList.toString() + "'\nAttachments=" + attachNames.toString()
                + "'\nMessage:\n" + text;
    }

    @Override
	public List<String> getBcc() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49810713051");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498107130510x10x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498107130510x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498107130510x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498107130510x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498107130510x10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498107130510x20x0");
		return bcc;
    }
    @Override
	public void setBcc(List<String> bcc) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x20x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x20x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x3_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x20x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x30x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498ffefcdbe0x30x00x0");
		this.bcc = bcc;
    }

    /**
     * Set the body text of the content
     *
     * @param text
     */
    @Override
	public void setText(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a5851856");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a58518560x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a58518560x20x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a58518560x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a58518560x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a58518560x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a58518560x30x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498a58518560x30x0");
		this.text = text;
    }

    /**
     * Return the body text of the content
     *
     * @return The text
     */
    @Override
	public String getText() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987412d4e2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987412d4e20x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987412d4e20x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987412d4e20x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987412d4e20x20x0");
		return text;
    }

    /**
     * Set the attachments
     *
     * @param aList
     */
    @Override
	public void setMessageAttachments(List<MessageAttachment> aList) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x20x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x20x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x20x00x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x3_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f17");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x30x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c498fe7a9f170x30x00x0");
		this.messageAttachments = aList;
    }

    /**
     * Return the attachments
     *
     * @return aList
     */
    @Override
	public List<MessageAttachment> getMessageAttachments() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4988d9ada190x10x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4988d9ada190x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4988d9ada190x10x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4988d9ada190x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4988d9ada190x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4988d9ada19");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4988d9ada190x20x0");
		return messageAttachments;
    }

    @Override
    public List<MailHeader> getMailHeaders() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987b23bd7b0x10x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987b23bd7b0x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987b23bd7b0x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987b23bd7b0x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987b23bd7b0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987b23bd7b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c4987b23bd7b0x20x0");
		return mailHeaders;
    }

    @Override
    public void setMailHeaders(List<MailHeader> mailHeaders) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b03366");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x20x00x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x1_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x2_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x3_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x20x0_____org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x20x00x1");
		if(mailHeaders == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x30x00x00x10x1");
		if(!(mailHeaders == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x30x00x00x10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_SmtpMessageImpl_java0x04ff3c49822b033660x30x00x00x1");
		this.mailHeaders = mailHeaders == null ? new ArrayList<MailHeader>(): mailHeaders;
    }

}
