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
import java.util.Date;
import java.util.List;

import org.apache.hupa.shared.domain.Message;
import org.apache.hupa.shared.domain.Tag;

/**
 *
 *
 */
public class MessageImpl extends AbstractMessageImpl implements Message{

    public MessageImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870b43c4b820x10x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870b43c4b820x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870b43c4b820x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870b43c4b820x10x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870b43c4b82_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870b43c4b820x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e2577dd70x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e2577dd70x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e2577dd70x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e2577dd7");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87068d880f50x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87068d880f5_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87068d880f50x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87068d880f50x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870c16186ba0x10x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870c16186ba_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870c16186ba0x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870c16186ba0x10x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870c16186ba0x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870c16186ba0x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8709b6ef5a10x10x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8709b6ef5a10x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8709b6ef5a10x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8709b6ef5a1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8709b6ef5a10x10x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8709b6ef5a10x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf8_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf80x0");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf81eb17e51_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf8aac7ab6c_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf86eb0c612_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf8f2d73577_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf8a3c0b9f2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf86a38e764_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf8c0508fdb_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8702b004bf87d092ffa");
	}
	
	private List<String> extra;
    private long uid;
    private List<IMAPFlag> flags;
    private List<Tag> tags;
    private Date rDate;

    public enum IMAPFlag {
        SEEN, DELETED, RECENT, ANSWERED, JUNK, DRAFT, FLAGGED, USER
    }

    public void setFlags(List<IMAPFlag> flags) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x20x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x20x00x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x20x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x3_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x30x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87048e7d3b10x30x00x0");
		this.flags = flags;
    }

    public List<IMAPFlag> getFlags() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870bf72ecf20x10x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870bf72ecf20x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870bf72ecf20x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870bf72ecf20x10x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870bf72ecf2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870bf72ecf20x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870bf72ecf20x20x0");
		return flags;
    }

    public void setTags(List<Tag> tags) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x20x00x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x20x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x3_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a6_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x20x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x30x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870e44db1a60x30x00x0");
		this.tags = tags;
    }

    public List<Tag> getTags() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870ddb4207d0x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870ddb4207d0x10x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870ddb4207d0x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870ddb4207d_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870ddb4207d0x10x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870ddb4207d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870ddb4207d0x20x0");
		return tags;
    }

    public long getUid() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870249819540x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870249819540x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87024981954_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870249819540x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870249819540x20x0");
		return uid;
    }

    public void setUid(long uid) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701ada84090x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701ada84090x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701ada84090x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701ada8409_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701ada84090x3_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701ada84090x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701ada84090x30x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701ada84090x30x0_____org_apache_hupa_shared_data_MessageImpl_java0x0");
		this.uid = uid;
    }


    public void setReceivedDate(Date rDate) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a75a83030x20x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a75a83030x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a75a83030x3_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a75a8303_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a75a83030x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a75a83030x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a75a83030x30x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a75a83030x30x0_____org_apache_hupa_shared_data_MessageImpl_java0x0");
		this.rDate = rDate;
    }

    public Date getReceivedDate() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87019b2a53e0x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87019b2a53e_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87019b2a53e0x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87019b2a53e0x2");
		if(!(rDate == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87019b2a53e0x20x00x00x2");
		if(rDate == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87019b2a53e0x20x00x00x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87019b2a53e0x20x00x0");
		return rDate == null ? new Date(): rDate;
    }


    public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a7edc6080x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a7edc6080x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a7edc608_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a7edc6080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a7edc6080x20x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a7edc6080x20x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870a7edc6080x20x00x00x0");
		return String.valueOf(getUid());
    }

    public boolean equals(Object obj) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x3_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x20x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x0");
		if (obj instanceof MessageImpl) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x00x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x00x00x00x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x00x00x00x00x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x00x00x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x00x00x1");
			if (((MessageImpl)obj).getUid() == getUid()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x00x10x00x10x0");
				return true;
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a8701a1ed2a00x30x1");
		return false;
    }

    public int hashCode() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870dda947280x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870dda947280x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870dda94728_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870dda947280x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870dda947280x20x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870dda947280x20x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870dda947280x20x00x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870dda947280x20x00x00x00x0");
		return Long.valueOf(getUid()).hashCode();
    }

    @Override
    public void setExtra(List<String> extra) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x20x00x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x20x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x3_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x20x00x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec65");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x30x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a870787dec650x30x00x0");
		this.extra = extra;

    }

    @Override
    public List<String> getExtra() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87045098f8d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87045098f8d0x10x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87045098f8d0x2_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87045098f8d0x10x1_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87045098f8d0x0_____org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87045098f8d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_MessageImpl_java0x0baf6a87045098f8d0x20x0");
		return extra;
    }
}
