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
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import com.google.inject.Inject;

@SuppressWarnings("deprecation")
public class MockHttpSession implements HttpSession{
    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9e8a5d150x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9e8a5d15_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9e8a5d150x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9e8a5d150x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9e8a5d150x3");
	}
	

	private Map<String,Object> attributeMap = new HashMap<String, Object>();
    private Map<String,Object> valueMap = new HashMap<String, Object>();
    private long cTime;
    private String id;
    private static int seq = 0;

    @Inject
    public MockHttpSession() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x19076def5_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x19076def50x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x19076def50x10x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x19076def50x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x19076def50x10x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x20x00x00x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x20x00x00x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x10x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x20x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x10x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db6d0abbf0x20x00x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x10x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x20x00x00x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e50_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x10x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x20x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x20x00x00x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8ddbef4e500x20x00x00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d87ea5dfc0x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d87ea5dfc_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d87ea5dfc0x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d87ea5dfc0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9f5308400x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9f530840_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9f5308400x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d9f5308400x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x10x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x10x00x00x0");
		cTime = System.currentTimeMillis();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x10x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x10x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x10x10x00x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d82056b8d0x10x10x00x10x0");
		this.id = MockConstants.SESSION_ID + "-" + seq++;
    }

    public Object getAttribute(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d4e2370260x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d4e2370260x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d4e2370260x3_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d4e2370260x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d4e2370260x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d4e237026");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d4e2370260x30x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d4e2370260x30x00x0");
		return attributeMap.get(name);
    }


    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Enumeration getAttributeNames() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x1");
		return new Enumeration() {
            Iterator it = attributeMap.keySet().iterator();
            public boolean hasMoreElements() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x15e4418350x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x15e4418350x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x15e441835_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x15e4418350x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x15e4418350x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x15e4418350x20x00x0");
				return it.hasNext();
            }

            public Object nextElement() {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x13270dbe70x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x13270dbe70x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x13270dbe70x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x13270dbe7");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x13270dbe70x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d5238e4f00x20x00x00x13270dbe70x20x00x0");
				return it.next();
            }

        };
    }

    public long getCreationTime() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dd0e9643d0x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dd0e9643d0x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dd0e9643d0x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dd0e9643d");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dd0e9643d0x20x0");
		return cTime;
    }

    public String getId() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d53111d710x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d53111d71_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d53111d710x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d53111d710x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d53111d710x20x0");
		return id;
    }

    public long getLastAccessedTime() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de40d8bac0x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de40d8bac0x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de40d8bac_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de40d8bac0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de40d8bac0x20x0");
		return 0;
    }

    public int getMaxInactiveInterval() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db11cdbde0x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db11cdbde0x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db11cdbde_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db11cdbde0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db11cdbde0x20x0");
		return 0;
    }

    public ServletContext getServletContext() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d324ec2680x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d324ec268_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d324ec2680x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d324ec2680x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d324ec2680x20x0");
		return null;
    }

    public HttpSessionContext getSessionContext() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d35e61b960x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d35e61b960x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d35e61b96_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d35e61b960x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d35e61b960x20x0");
		return null;
    }

    public Object getValue(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db671f72b0x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db671f72b0x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db671f72b0x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db671f72b0x3_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db671f72b_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db671f72b0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db671f72b0x30x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db671f72b0x30x00x0");
		return valueMap.get(name);
    }

    public String[] getValueNames() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d85733997_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x00x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x00x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x00x10x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x00x00x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x00x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x00x10x00x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x00x10x00x00x1");
		List<String> names = new ArrayList<String>();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x10x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x10x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x10x00x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x10x10x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x10x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x1");
		Iterator<String> it = valueMap.keySet().iterator();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x20x0");
		while (it.hasNext()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x20x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x20x10x00x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x20x10x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x20x10x00x0");
			names.add(it.next());
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x30x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x3_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x30x00x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x30x00x00x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x30x00x00x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d857339970x20x30x00x0");
		return names.toArray(new String[names.size()]);
    }

    public void invalidate() {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db3426d49_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db3426d490x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db3426d490x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db3426d490x0");
    }

    public boolean isNew() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3eab7b7_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3eab7b70x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3eab7b70x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3eab7b70x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3eab7b70x20x0");
		return false;
    }

    public void putValue(String name, Object value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x4_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x3_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x30x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x40x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8df3d3c5ec0x40x0");
		valueMap.put(name, value);
    }

    public void removeAttribute(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db90e88b50x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db90e88b50x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db90e88b50x3_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db90e88b50x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db90e88b50x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db90e88b5");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db90e88b50x30x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8db90e88b50x30x0");
		attributeMap.remove(name);
    }

    public void removeValue(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d20414259_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d204142590x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d204142590x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d204142590x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d204142590x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d204142590x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d204142590x30x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8d204142590x30x0");
		valueMap.remove(name);

    }

    public void setAttribute(String name, Object value) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x4_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd35_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x30x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x40x00x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8de3c2dd350x40x0");
		attributeMap.put(name, value);
    }

    public void setMaxInactiveInterval(int interval) {
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dfccf8a840x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dfccf8a840x20x0_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dfccf8a840x3_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dfccf8a840x2_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dfccf8a840x1_____org_apache_hupa_server_mock_MockHttpSession_java0x082056b8dfccf8a84");
        // TODO Auto-generated method stub

    }

}
