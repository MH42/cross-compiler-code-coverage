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
import org.apache.hupa.shared.domain.MessageAttachment;

/**
 * Attachment of a message
 *
 *
 */
public class MessageAttachmentImpl implements MessageAttachment {

    public MessageAttachmentImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bbe325701_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bbe3257010x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bbe3257010x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bbe3257010x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b89368e1d0x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b89368e1d_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b89368e1d0x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b89368e1d0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b6ae999550x1_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b6ae99955_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b6ae999550x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b6ae999550x0");
	}
	


	private String contentType;
    private int size;
    private String name;

    /**
     * Set the name of the attachment
     *
     * @param name
     */
    public void setName(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049ba801f04b0x20x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049ba801f04b0x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049ba801f04b0x3_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049ba801f04b0x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049ba801f04b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049ba801f04b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049ba801f04b0x30x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049ba801f04b0x30x00x0");
		this.name = name;

    }

    /**
     * Return the name of the attachment
     *
     * @return name
     */
    public String getName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bfa98c1fd0x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bfa98c1fd0x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bfa98c1fd0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bfa98c1fd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bfa98c1fd0x20x0");
		return name;
    }

    /**
     * Set the content-type of the attachment
     *
     * @param contentType
     */
    public void setContentType(String contentType) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bcb6656370x1_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bcb6656370x20x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bcb6656370x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bcb6656370x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bcb6656370x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bcb665637");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bcb6656370x30x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049bcb6656370x30x00x0");
		this.contentType = contentType;
    }

    /**
     * Return the content-type of the attachment
     *
     * @return cType
     */
    public String getContentType() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b67af0bd7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b67af0bd70x1_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b67af0bd70x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b67af0bd70x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b67af0bd70x20x0");
		return contentType;
    }

    /**
     * Return whether the attachment is an image
     *
     * @return cType
     */
    public boolean isImage() {
          InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a80x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a80x1_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a80x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a80x20x00x00x1_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a80x20x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a80x20x00x00x10x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a80x20x00x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b908dc3a80x20x00x00x0");
		return contentType != null && contentType.toLowerCase().startsWith("image/");
    }

    /**
     * Set the content size in bytes
     *
     * @param size
     */
    public void setSize(int size) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b2a7c63a0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b2a7c63a00x3_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b2a7c63a00x1_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b2a7c63a00x20x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b2a7c63a00x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b2a7c63a00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b2a7c63a00x30x00x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b2a7c63a00x30x0");
		this.size = size;
    }

    /**
     * Return the content size in bytes
     *
     * @return size
     */
    public int getSize() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1cff8fb7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1cff8fb70x2_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1cff8fb70x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1cff8fb70x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1cff8fb70x20x0");
		return size;
    }

    @Override
    public void setImage(boolean image) {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1f30600b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1f30600b0x1_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1f30600b0x3_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1f30600b0x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1f30600b0x20x0_____org_apache_hupa_shared_data_MessageAttachmentImpl_java0x06cb3049b1f30600b0x2");
        //FIXME just for MessageSendActivity's NullPointerException, with adding the RequestContext's create List<MeeageAttachment>
    }


}
