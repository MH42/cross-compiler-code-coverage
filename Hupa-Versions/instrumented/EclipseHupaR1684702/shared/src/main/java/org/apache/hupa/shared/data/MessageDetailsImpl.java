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

import org.apache.hupa.shared.SConsts;
import org.apache.hupa.shared.domain.MailHeader;
import org.apache.hupa.shared.domain.MessageAttachment;
import org.apache.hupa.shared.domain.MessageDetails;

public class MessageDetailsImpl implements MessageDetails{

    public MessageDetailsImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f50x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f50x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5e2577dd70x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5e2577dd70x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5e2577dd70x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5e2577dd7");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5ce15802a0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5ce15802a0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5ce15802a0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5ce15802a");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5372ea08c0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5372ea08c0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5372ea08c_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5372ea08c0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a20a7bb0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a20a7bb0x10x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a20a7bb0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a20a7bb0x10x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a20a7bb0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a20a7bb");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x10x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x20x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x20x00x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x20x00x00x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x10x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a202c17d0x20x0");
	}
	
	private String text;
    private List<MessageAttachment> messageAttachments;
    private long uid;
    private String raw;
    private List<MailHeader> mailHeaders = new ArrayList<MailHeader>();


    public List<MailHeader> getMailHeaders() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57b23bd7b0x10x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57b23bd7b_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57b23bd7b0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57b23bd7b0x10x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57b23bd7b0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57b23bd7b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57b23bd7b0x20x0");
		return mailHeaders;
    }


    public void setMailHeaders(List<MailHeader> mailHeaders) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x20x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x20x00x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x3_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b03366");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x30x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f522b033660x30x00x0");
		this.mailHeaders = mailHeaders;
    }


    public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a7edc608_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a7edc6080x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a7edc6080x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a7edc6080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a7edc6080x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a7edc6080x20x00x00x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a7edc6080x20x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a7edc6080x20x00x00x0");
		return "uid=" + String.valueOf(getUid()) +
        " text.length=" + (text != null ? text.length() : 0) +
        " raw.length=" + (raw != null ? raw.length() : 0) +
        " attachments=" + (messageAttachments != null ? messageAttachments.size() : 0) +
        " headers=" + mailHeaders.size();
    }


    public long getUid() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5249819540x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5249819540x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5249819540x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f524981954");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5249819540x20x0");
		return uid;
    }

    public void setUid(long uid) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51ada8409_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51ada84090x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51ada84090x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51ada84090x3_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51ada84090x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51ada84090x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51ada84090x30x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51ada84090x30x00x0");
		this.uid = uid;
    }

    /**
     * Set a raw String representation of the header
     *
     * @param raw
     */
    public void setRawHeader(String raw) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58a41bc1b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58a41bc1b0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58a41bc1b0x3_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58a41bc1b0x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58a41bc1b0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58a41bc1b0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58a41bc1b0x30x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58a41bc1b0x30x00x0");
		this.raw = raw;
    }

    /**
     * Return a raw String representation of the header
     *
     * @return raw
     */
    public String getRawHeader() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5f2e0ad790x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5f2e0ad790x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5f2e0ad790x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5f2e0ad79");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5f2e0ad790x20x0");
		return raw;
    }


    /**
     * Set the body text of the content
     *
     * @param text
     */
    public void setText(String text) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a58518560x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a58518560x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a58518560x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a58518560x3_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a58518560x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a5851856");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a58518560x30x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5a58518560x30x00x0");
		this.text = text;
    }

    /**
     * Return the body text of the content
     * @return The text
     */
    public String getText() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57412d4e20x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57412d4e20x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57412d4e20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57412d4e2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57412d4e20x20x0");
		return text;
    }

    /**
     * Set the attachments
     *
     * @param messageAttachments
     */
    public void setMessageAttachments(List<MessageAttachment> messageAttachments) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x20x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x20x00x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x30x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f57799e68f0x30x0");
		this.messageAttachments = messageAttachments;
    }

    /**
     *
     * @return the In-Reply-To header field.
     */
    public String getInReplyTo() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5df65272e0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5df65272e0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5df65272e0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5df65272e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5df65272e0x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5df65272e0x20x00x0");
		return getHeaderValue(SConsts.HEADER_IN_REPLY_TO);
    }

    public String getHeaderValue(String key) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x00x0");
		for (MailHeader h : getMailHeaders()) {
           InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x20x00x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x20x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x20x0");
		if (h.getName().equals(key)) {
               InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x20x00x10x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x00x20x00x10x0");
			return h.getValue();
           }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5651ed76a0x30x1");
		return null;
    }

    /**
     *
     * @return the References header field.
     */
    public String getReferences() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f52ac8fe840x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f52ac8fe840x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f52ac8fe840x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f52ac8fe84");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f52ac8fe840x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f52ac8fe840x20x00x0");
		return getHeaderValue(SConsts.HEADER_REFERENCES);
    }

    public String getMessageId() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f59dfec8c80x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f59dfec8c80x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f59dfec8c80x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f59dfec8c8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f59dfec8c80x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f59dfec8c80x20x00x0");
		return getHeaderValue(SConsts.HEADER_MESSAGE_ID);
    }

    /**
     * Return the attachments
     *
     * @return aList
     */
    public List<MessageAttachment> getMessageAttachments() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58d9ada190x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58d9ada190x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58d9ada190x10x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58d9ada190x10x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58d9ada190x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58d9ada19");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f58d9ada190x20x0");
		return messageAttachments;
    }


    public boolean equals(Object obj) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x00x0");
		if (obj instanceof MessageDetailsImpl) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x00x00x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x00x00x00x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x00x00x00x00x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x00x00x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x00x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x0");
			if (((MessageDetailsImpl)obj).getUid() == getUid()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x00x10x00x10x0");
				return true;
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f51a1ed2a00x30x1");
		return false;
    }

    public int hashCode() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x2_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda94728");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x20x00x10x00x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x20x00x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x20x00x10x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x20x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x20x00x0");
		Long l = Long.valueOf(getUid());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x20x1_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x20x10x0_____org_apache_hupa_shared_data_MessageDetailsImpl_java0x0f0c5a9f5dda947280x20x10x00x0");
		return l.intValue() * 16;
    }
}
