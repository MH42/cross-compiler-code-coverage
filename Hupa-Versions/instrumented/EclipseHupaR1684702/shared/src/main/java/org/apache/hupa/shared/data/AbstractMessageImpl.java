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
import java.util.List;

public class AbstractMessageImpl{
    public AbstractMessageImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904b1e95cfd0x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904b1e95cfd_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904b1e95cfd0x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904b1e95cfd0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9040x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e16f3e5f0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e16f3e5f0x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e16f3e5f_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e16f3e5f0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904335ce16b0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904335ce16b0x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904335ce16b_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904335ce16b0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bdb480de_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bdb480de0x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bdb480de0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bdb480de0x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bdb480de0x10x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bdb480de0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9044374aaee0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9044374aaee0x10x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9044374aaee_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9044374aaee0x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9044374aaee0x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9044374aaee0x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d0x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d0x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d");
	}
	


	private String from;
    private String subject;
    private String replyto;
    private List<String> to;
    private List<String> cc;
    private boolean hasAttachment;

    @Override
	public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc608");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x00x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x00x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x00x10x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x00x0");
		StringBuffer toList = new StringBuffer("");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x1");
		if (to != null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x10x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x10x00x00x0");
			for (String s: to) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x10x00x10x00x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x10x00x10x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x10x10x00x10x0");
				toList.append(s).append(" ");
			}
		}

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x20x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x20x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x20x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x20x10x00x0");
		StringBuffer ccList = new StringBuffer("");
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x3");
		if (cc != null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x10x00x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x10x00x0");
			for (String s: cc) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x10x00x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x10x00x10x00x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x30x10x00x10x00x0");
				ccList.append(s).append(" ");
			}
		}

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x40x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904a7edc6080x20x4");
		return "From='" + from
             + "' To='" + toList.toString()
             + "' CC='" + ccList.toString()
             + "' ReplyTo='" + (replyto == null ? "": replyto)
             + "' Subject='" + subject
             + "' Attachments=" + hasAttachment;
    }


    public boolean hasAttachment() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d0x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ea21409d0x20x0");
		return hasAttachment;
    }

    public void setHasAttachments(boolean hasAttachments) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ca291f160x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ca291f160x3_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ca291f160x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ca291f16_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ca291f160x20x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ca291f160x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ca291f160x30x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904ca291f160x30x00x0");
		this.hasAttachment = hasAttachments;
    }

    /**
     * Set the From: header field
     *
     * @param from
     */
    public void setFrom(String from) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e93179f6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e93179f60x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e93179f60x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e93179f60x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e93179f60x3_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e93179f60x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e93179f60x30x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904e93179f60x30x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0");
		this.from = from;
    }

    /**
     * Return the From: header field
     *
     * @return from
     */
    public String getFrom() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bb865af0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bb865af00x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bb865af00x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bb865af00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904bb865af00x20x0");
		return from;
    }


    public void setCc(List<String> cc) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x3_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x20x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x20x00x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x20x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x30x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c8218bad0x30x00x0");
		this.cc = cc;
    }

    public List<String> getCc() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c76e8e990x10x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c76e8e99_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c76e8e990x10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c76e8e990x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c76e8e990x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c76e8e990x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904c76e8e990x20x0");
		return cc;
    }

    /**
     * Set the Subject: header field
     *
     * @param subject
     */
    public void setSubject(String subject) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9046e6e7b040x20x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9046e6e7b040x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9046e6e7b040x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9046e6e7b040x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9046e6e7b040x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9046e6e7b04");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9046e6e7b040x30x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9046e6e7b040x30x00x0");
		this.subject = subject;
    }

    /**
     * Return the Subject: header field
     *
     * @return subject
     */
    public String getSubject() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043ef042e50x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043ef042e50x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043ef042e50x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043ef042e5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043ef042e50x20x0");
		return subject;
    }

    public List<String> getTo() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043a0ed55c_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043a0ed55c0x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043a0ed55c0x10x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043a0ed55c0x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043a0ed55c0x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043a0ed55c0x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb9043a0ed55c0x20x0");
		return to;
    }

    public void setTo(List<String> to) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x20x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x20x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x20x00x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f243_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x3_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x30x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb90457a0f2430x30x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0");
		this.to = to;
    }

    public String getReplyto() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904805c7ad10x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904805c7ad10x2_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904805c7ad1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904805c7ad10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904805c7ad10x20x0");
		return replyto;
    }

    public void setReplyto(String replyto) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904cf1aff080x3_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904cf1aff080x1_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904cf1aff080x20x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904cf1aff080x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904cf1aff08_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904cf1aff080x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904cf1aff080x30x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0adedb904cf1aff080x30x00x0_____org_apache_hupa_shared_data_AbstractMessageImpl_java0x0");
		this.replyto = replyto;
    }


}
