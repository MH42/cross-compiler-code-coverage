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
import java.io.Serializable;
import java.util.Date;

import org.apache.hupa.shared.domain.Settings;
import org.apache.hupa.shared.domain.User;

/**
 * User which will get used for login to the IMAP and SMTP account
 *
 *
 */
public class UserImpl implements User, Serializable {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b6bbf34a8_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b6bbf34a80x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b6bbf34a80x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b6bbf34a80x3_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b6bbf34a80x4_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b6bbf34a80x1");
	}
	
	public UserImpl(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b87ea5dfc0x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b87ea5dfc0x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b87ea5dfc_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b87ea5dfc0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b372b1cda0x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b372b1cda0x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b372b1cda_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b372b1cda0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b66a36e770x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b66a36e770x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b66a36e770x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b66a36e77");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b6ae99955_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b6ae999550x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b6ae999550x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b6ae999550x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b5baa61e40x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b5baa61e40x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b5baa61e40x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b5baa61e4");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b3cc1d5a4_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b3cc1d5a40x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b3cc1d5a40x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b3cc1d5a40x1");
	}
	
	private static final long serialVersionUID = 7172612434659286225L;

    private String id;


    private String name;
    private String password;
    private Date loginDate;
    private boolean auth;
    private Settings settings;

    public String getId() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b53111d710x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b53111d71_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b53111d710x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b53111d710x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b53111d710x20x00x0");
		if(id != null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b53111d710x20x00x00x1");
		if(!(id != null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b53111d710x20x00x00x2");
		return id != null ? id : name;
    }

    public void setId(String id) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b12572de10x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b12572de10x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b12572de10x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b12572de10x3_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b12572de1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b12572de10x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b12572de10x30x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b12572de10x30x00x0");
		this.id = id;
    }
    /**
     * The name of the User
     *
     * @param name
     */
    public void setName(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7ba801f04b0x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba801f04b0x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba801f04b0x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba801f04b0x20x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba801f04b0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7ba801f04b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7ba801f04b0x30x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba801f04b0x30x00x0_____org_apache_hupa_shared_data_UserImpl_java0x0");
		this.name = name;
    }

    /**
     * Get name of the User
     *
     * @return name
     */
    public String getName() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7bfa98c1fd0x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bfa98c1fd0x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bfa98c1fd0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7bfa98c1fd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7bfa98c1fd0x20x0");
		return name;
    }

    /**
     * Set the Password of the User
     *
     * @param password
     */
    public void setPassword(String password) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b40524bf70x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b40524bf70x20x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b40524bf70x3_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b40524bf70x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b40524bf70x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b40524bf7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b40524bf70x30x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b40524bf70x30x0_____org_apache_hupa_shared_data_UserImpl_java0x0");
		this.password = password;
    }

    /**
     * Get the Password of the User
     *
     * @return password
     */
    public String getPassword() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7bcb899730");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7bcb8997300x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bcb8997300x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bcb8997300x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7bcb8997300x20x0");
		return password;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7ba7edc6080x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba7edc6080x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba7edc608_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba7edc6080x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7ba7edc6080x20x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba7edc6080x20x0");
		return getName();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object object) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x20x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x0");
		if (object instanceof UserImpl) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x00x00x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x00x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x00x00x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x00x00x00x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x00x00x00x00x00x0");
			if (((UserImpl) object).getName().equals(getName())) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x00x10x00x10x0");
				return true;
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2b02646c0x30x1");
		return false;
    }

    public int hashCode() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7bdda947280x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bdda947280x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bdda94728_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bdda947280x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7bdda947280x20x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bdda947280x20x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7bdda947280x20x00x00x0");
		return getName().hashCode();
    }
    /**
     * Get the Date on which the User was logged in the last time
     *
     * @return loginDate
     */
    public Date getLoginDate() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7ba1b86f4a0x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba1b86f4a0x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7ba1b86f4a0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7ba1b86f4a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7ba1b86f4a0x20x0");
		return loginDate;
    }

    /**
     * Set if the User was successful authenticated
     *
     * @param auth
     */
    public void setAuthenticated(boolean auth) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x3_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x20x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x30x0_____org_apache_hupa_shared_data_UserImpl_java0x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x30x00x0");
		this.auth = auth;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x30x1");
		if (auth) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x30x10x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x30x10x00x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x30x10x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x30x10x00x00x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b230321c10x30x10x00x00x00x00x0");
			loginDate = new Date();
        }
    }

    /**
     * Get if the User was successful authenticated
     *
     * @return auth
     */
    public boolean getAuthenticated() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b11cc69960x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b11cc69960x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b11cc69960x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b11cc6996");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b11cc69960x20x0");
		return auth;
    }

    public void setSettings(Settings settings) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2aed8dc8_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2aed8dc80x3_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2aed8dc80x20x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2aed8dc80x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2aed8dc80x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2aed8dc80x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7b2aed8dc80x30x00x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7b2aed8dc80x30x0_____org_apache_hupa_shared_data_UserImpl_java0x0");
		this.settings = settings;
    }

    public Settings getSettings() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7baf3875370x1_____org_apache_hupa_shared_data_UserImpl_java0x06066de7baf3875370x2_____org_apache_hupa_shared_data_UserImpl_java0x06066de7baf3875370x0_____org_apache_hupa_shared_data_UserImpl_java0x06066de7baf387537");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_shared_data_UserImpl_java0x06066de7baf3875370x20x0");
		return settings;
    }
}
