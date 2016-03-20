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

package org.apache.hupa.client.widgets;


import tc3.shared.InstrumentationLoggerProvider;
import org.apache.hupa.shared.domain.ImapFolder;
import org.apache.hupa.widgets.event.EditEvent;
import org.apache.hupa.widgets.ui.EditableTreeItem;

public class IMAPTreeItem extends EditableTreeItem {
    protected String oldFullName;
    protected String oldName;

    public IMAPTreeItem(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e137130x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e137130x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e137130x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e13713_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e137130x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d041bb8f0x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d041bb8f0x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d041bb8f_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d041bb8f0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2520x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2520x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524ce130450x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524ce13045_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524ce130450x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524ce130450x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e137130x20x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e137130x20x0");
		setUserObject(folder);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e137130x20x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab25229e137130x20x10x0");
		setFolderText(folder);
    }

    @Override
    public void setSelected(boolean selected) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x3_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x00x0");
		super.setSelected(selected);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x0");
		if (isSelected()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x10x00x00x0");
			getWidget().addStyleName("hupa-IMAPFolder-selected");
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x20x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252b8dc89f20x30x10x20x00x0");
			getWidget().removeStyleName("hupa-IMAPFolder-selected");
        }
    }

    /**
     * Decrease the unseen messagecount of this folder
     */
    public void decreaseUnseenMessageCount() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252c32188fe0x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252c32188fe0x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252c32188fe0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252c32188fe");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252c32188fe0x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252c32188fe0x20x00x0");
		descreaseUnseenMessageCount(1);
    }

    public void setUnseenMessageCount(int cound) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be25_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x3_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x00x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x00x10x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x00x10x0");
		ImapFolder folder = (ImapFolder) getUserObject();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x10x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x10x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x1");
		int count = folder.getUnseenMessageCount();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x20x0");
		folder.setUnseenMessageCount(count);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2522716be250x30x3");
		setFolderText(folder);

    }

    /**
     * Decrease the unseen messagecount of this folder
     */
    public void descreaseUnseenMessageCount(int decreaseCount) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x3_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x00x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x00x10x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x00x10x0");
		ImapFolder folder = (ImapFolder) getUserObject();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x10x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x10x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x1");
		int count = folder.getUnseenMessageCount();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x2");
		if (count > 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x00x0");
			count = count - decreaseCount;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x10x0");
			if (count < 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x10x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x10x10x00x0");
				count = 0;
            }
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x2");
			folder.setUnseenMessageCount(count);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524776c12c0x30x20x10x3");
			setFolderText(folder);
        }
    }
    /**
     * Increase the unseen messagecount of this folder
     */
    public void increaseUnseenMessageCount() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2521e76ac8b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2521e76ac8b0x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2521e76ac8b0x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2521e76ac8b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2521e76ac8b0x20x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2521e76ac8b0x20x0");
		increaseUnseenMessageCount(1);
    }

    /**
     * Increase the unseen messagecount of this folder
     */
    public void increaseUnseenMessageCount(int increaseCount) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb1973");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x3_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x00x10x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x00x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x00x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x00x1");
		ImapFolder folder = (ImapFolder) getUserObject();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x10x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x10x10x0");
		int count = folder.getUnseenMessageCount();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x20x00x0");
		count = count + increaseCount;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x3");
		folder.setUnseenMessageCount(count);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x4_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252aafb19730x30x40x0");
		setFolderText(folder);
    }

    private void setFolderText(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x3_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x30x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x30x00x00x0");
		setText(getFolderName(folder));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x30x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2527e0b983e0x30x10x0");
		setUnseenMessageCountStyle(folder);
    }

    private void setUnseenMessageCountStyle(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e6216_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x00x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x00x10x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x00x10x00x0");
		boolean containsUnseen = (folder.getUnseenMessageCount() > 0);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x1");
		for (ImapFolder fold : folder.getChildren()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x20x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x20x00x00x0");
			if (fold.getUnseenMessageCount() > 0) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x20x00x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x20x00x10x00x0");
				containsUnseen = true;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x10x20x00x10x1");
				break;
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x2");
		if (containsUnseen) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x20x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x20x00x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x20x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x20x00x00x0");
			getWidget().addStyleName("hupa-IMAPFolder-unseen");
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x20x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x20x10x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252a92e62160x30x20x10x00x0");
			getWidget().removeStyleName("hupa-IMAPFolder-unseen");
        }
    }

    /**
     * Return the folder name to display in the TreeItem for the given
     * IMAPFolder
     *
     * @param folder
     * @return name
     */
    private String getFolderName(ImapFolder folder) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x3_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b75");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x0");
		if (folder.getUnseenMessageCount() > 0) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x00x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x00x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x00x10x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x00x10x00x00x1");
			return folder.getName() + " (" + folder.getUnseenMessageCount() + ")";
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252d4524b750x30x10x0");
		return folder.getName();
    }

    @Override
    public void setUserObject(Object obj) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x00x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x00x00x00x00x0");
		if ((obj instanceof ImapFolder) == false) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x00x10x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x00x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x00x10x0");
			throw new IllegalArgumentException("UserObject needs to be an instance of IMAPFolder");
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x10x00x00x0");
		setFolderText((ImapFolder) obj);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252184e136c0x30x2");
		super.setUserObject(obj);
    }

    @Override
    public void startEdit() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x00x10x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x00x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x00x10x0");
		ImapFolder folder = (ImapFolder) getUserObject();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x1");
		oldFullName = folder.getFullName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x20x00x0");
		oldName = folder.getName();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x3");
		showEditBox(oldName);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x40x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x40x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x40x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2524f1886e00x20x4");
		manager.fireEvent(new EditEvent(EditEvent.EventType.Start, oldFullName, null));
    }

    @Override
    public void cancelEdit() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e9118614");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x00x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x00x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x00x10x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x00x10x00x00x1");
		ImapFolder folder = ((ImapFolder) getUserObject());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x1");
		folder.setFullName(oldFullName);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x20x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x2");
		showItem(getFolderName(folder));

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x30x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x30x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x30x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab252e91186140x20x3");
		manager.fireEvent(new EditEvent(EditEvent.EventType.Cancel, oldFullName, null));

    }

    @Override
    public void stopEdit() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b3796");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x0");
		if (editBox.getText().length() < 1) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x10x00x0");
			// Empty folder name is not allowed!
            cancelEdit();
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x00x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x00x1");
			String newFolderName = editBox.getText();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x10x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x10x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x10x10x00x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x10x10x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x10x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x10x10x00x00x00x1");
			String newFullFolderName = oldFullName.substring(0, oldFullName.length() - oldName.length())
                    + newFolderName;
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x20x10x00x00x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x20x1_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x20x10x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x20x10x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x20x10x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x2_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x20x0");
			ImapFolder folder = ((ImapFolder) getUserObject());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x3_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x30x0");
			folder.setFullName(newFullFolderName);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x40x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x40x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x4");
			showItem(getFolderName(folder));

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x50x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x50x00x00x0_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x5_____org_apache_hupa_client_widgets_IMAPTreeItem_java0x0126ab2529b8b37960x20x00x20x50x00x0");
			manager.fireEvent(new EditEvent(EditEvent.EventType.Stop, oldFullName, newFullFolderName));
        }

    }
}
