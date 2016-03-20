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

package org.apache.hupa.server;


import tc3.desktop.InstrumentationLoggerProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.logging.Log;

import com.google.inject.Inject;

public class FileItemRegistry {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a49fe20d90x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a49fe20d90x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a49fe20d9_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a49fe20d90x1");
	}
	
	public Map<String,FileItem> map = new HashMap<String, FileItem>();
    private final Log logger;
    static int idCounter = 0;
    int registryId;

    @Override
	public String toString() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa7edc6080x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa7edc6080x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa7edc6080x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa7edc608");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa7edc6080x20x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa7edc6080x20x00x0");
		return "registryId=" + registryId +
               " nItems=" + map.size();
    }

    @Inject
    public FileItemRegistry(Log logger) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x10x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff6785");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa83d98cc0x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa83d98cc0x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6aa83d98cc");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x20x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x10x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x20x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x10x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x20x00x00x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x20x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x20x00x00x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb3040x10x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6af04cb304");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a16cc54ff0x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a16cc54ff0x3_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a16cc54ff0x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a16cc54ff0x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a16cc54ff");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a0x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x20x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x20x0_____org_apache_hupa_server_FileItemRegistry_java0x0");
		this.logger = logger;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x20x10x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x20x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a2bff67850x20x10x0");
		registryId  = idCounter++;
    }

    public void add(FileItem item) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x20x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x3_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c6");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x30x00x00x00x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x30x00x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x30x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x30x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x30x00x0");
		logger.debug("Store item " + item.getName() + " with name " + item.getFieldName());
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x30x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x30x10x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a177b55c60x30x10x0");
		map.put(item.getFieldName(), item);
    }

    public void remove(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f0x20x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f0x3_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f0x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f0x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f0x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f0x30x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f0x30x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a725fe03f0x30x00x0");
		remove(get(name));
    }

    public void remove(FileItem item) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x3_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x20x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x0");
		if (item != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x00x00x00x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x00x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x0");
			logger.debug("Remove item " + item.getName() + " with name " + item.getFieldName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x10x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x10x00x0");
			map.remove(item.getFieldName());
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a36f4d44e0x30x00x10x20x0");
			// Remove temporary stuff
            item.delete();
        }
    }

    public void clear() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x00x00x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x00x00x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x00x00x0");
		for (Entry<String,FileItem> e: map.entrySet()) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x20x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x20x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a168cbb2e0x20x00x20x0");
			remove(e.getValue());
		}
    }

    public FileItem get(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x3_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x20x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x30x00x00x00x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x30x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x30x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x30x00x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x30x00x00x00x00x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x30x00x00x0");
		logger.debug("Retrieve item " + name + " isNull=" + (map.get(name) == null));
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x30x1_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a66bff9fe0x30x10x0");
		return map.get(name);
    }

    public int size() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a89368e1d_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a89368e1d0x2_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a89368e1d0x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a89368e1d0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a89368e1d0x20x0_____org_apache_hupa_server_FileItemRegistry_java0x0e8bb1f6a89368e1d0x20x00x0");
		return map.size();
    }
}
