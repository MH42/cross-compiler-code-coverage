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

package org.apache.hupa.server.ioc;


import tc3.desktop.InstrumentationLoggerProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.ServletContextEvent;

import org.apache.commons.logging.Log;
import org.apache.hupa.server.ioc.demo.DemoGuiceServerModule;
import org.apache.hupa.server.utils.ConfigurationProperties;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceListener extends GuiceServletContextListener {

    static {
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecbe87f64a0x3_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecbe87f64a0x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecbe87f64a0x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecbe87f64a_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecbe87f64a0x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecbe87f64a0x4");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec8428b8ea0x4_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec8428b8ea0x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec8428b8ea0x3_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec8428b8ea0x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec8428b8ea0x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec8428b8ea");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca84b58660x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca84b5866_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca84b58660x4_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca84b58660x3_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca84b58660x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca84b58660x2");
	}
	
	public GuiceListener(){
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec0x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecb33ccaac0x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecb33ccaac_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecb33ccaac0x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecb33ccaac0x1");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ece7460ca00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ece7460ca0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ece7460ca00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ece7460ca00x2");
	  InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec277e25c50x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec277e25c50x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec277e25c5_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec277e25c50x0");
	}
	
	public static final String SYS_PROP_CONFIG_FILE = "hupa.config.file";
    public static final String CONFIG_FILE_NAME = "config.properties";
    public static final String CONFIG_DIR_IN_WAR = "WEB-INF/conf/";

    private String servletContextRealPath = "";

    protected Properties demoProperties = null;
    protected String demoHostName = null;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x20x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x3_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x00x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x00x0");
		servletContextRealPath = servletContextEvent.getServletContext().getRealPath("/");

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x0");
		// We get the mock classes using reflection, so as we can package Hupa
        // without mock stuff.
        try {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x00x00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x00x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x00x1");
			Class<?> mockConstants = Class.forName("org.apache.hupa.server.mock.MockConstants");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x10x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x10x00x00x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x10x00x00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x10x0");
			demoProperties = (Properties) mockConstants.getField("mockProperties").get(null);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x20x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x20x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x00x2");
			demoHostName = demoProperties.getProperty("IMAPServerAddress");
        } catch (Exception noDemoAvailable) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x10x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x10x1");
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ecc55b10fb0x30x20x0");
		super.contextInitialized(servletContextEvent);
    }

    @Override
    protected Injector getInjector() {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f66");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x00x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x00x0");
		Properties prop = loadProperties();
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x1");
		ConfigurationProperties.validateProperties(prop);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x20x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x20x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x20x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x20x10x00x0");
		boolean demo = prop.getProperty("IMAPServerAddress").equals(demoHostName);
        if(!(demo))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x30x10x00x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x30x10x0");
		if(demo)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x30x10x00x1");
		Module module = demo ? new DemoGuiceServerModule(prop) : new GuiceServerModule(prop);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x40x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x4_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x40x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x40x10x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x40x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x40x0");
		Injector injector = Guice.createInjector(module, new GuiceWebModule());

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x50x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x50x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x5");
		String msg = ">> Started HUPA ";
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x6");
		if (demo) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x60x0");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x60x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x60x00x0");
			msg += "in DEMO-MODE";
        } else {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x60x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x60x10x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x60x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x60x10x0");
			msg += "with configuration -> " + prop;
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x7_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x70x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x70x0");
		injector.getInstance(Log.class).info(msg);
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26eca6b84f660x20x8");
		return injector;
    }

    /**
     * Loads the first available configuration file.
     *
     * The preference order for the file is:
     * 1.- file specified in a system property (-Dhupa.config.file=full_path_to_file).
     * 2.- file in the user's home: $HOME/.hupa/config.properties.
     * 3.- global configuration in the os: /etc/default/hupa.
     * 4.- file provided in the .war distribution: "WEB-INF/conf/config.properties.
     * 5.- mock properties file which makes the Hupa work in demo mode.
     *
     * If the system property "mock-host" has been defined, and Hupa has been
     * packaged with the mock stuff, we always return the demo-mode
     * configuration.
     *
     */
    public Properties loadProperties() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf7");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x00x1");
		Properties properties = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x00x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x1");
		if (demoHostName == null || System.getProperty(demoHostName) == null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x00x00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x00x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x00x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x00x10x00x00x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x00x10x00x00x0");
			List<String> configurationList = new ArrayList<String>();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x10x0");
			configurationList.add(System.getProperty(SYS_PROP_CONFIG_FILE));
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x20x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x20x00x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x20x00x0");
			configurationList.add(System.getenv("HOME") + "/.hupa/" + CONFIG_FILE_NAME);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x3_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x30x0");
			configurationList.add("/etc/default/hupa");
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x4_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x40x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x40x00x0");
			configurationList.add(servletContextRealPath + "/" + CONFIG_DIR_IN_WAR + CONFIG_FILE_NAME);

            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x5");
			for (String name : configurationList) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x00x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x0");
				System.out.println(name);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x1_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x10x0_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x10x00x0");
				properties = ConfigurationProperties.loadProperties(name);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x2_____org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x20x0");
				if (properties != null) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x20x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x10x10x50x10x20x10x0");
					break;
                }
            }
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x20x0");
		if(!(properties == null))InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x20x00x2");
		if(properties == null)InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_ioc_GuiceListener_java0x0e50b26ec6c053bf70x20x20x00x1");
		return properties == null ? demoProperties : properties;
    }
}
