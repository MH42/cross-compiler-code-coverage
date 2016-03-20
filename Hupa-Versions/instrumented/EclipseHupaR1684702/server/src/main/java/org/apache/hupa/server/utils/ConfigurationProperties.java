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

package org.apache.hupa.server.utils;


import tc3.desktop.InstrumentationLoggerProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Enumeration of valid configuration properties
 */
public enum ConfigurationProperties {
    // Mandatory configuration properties
    IMAP_SERVER_ADDRESS("IMAPServerAddress", true, null),
    SMTP_SERVER_ADDRESS("SMTPServerAddress", true, null),
    IMAP_SERVER_PORT("IMAPServerPort", false, "143"),
    SMTP_SERVER_PORT("SMTPServerPort", false, "25"),

    // Optional configuration properties
    IMAP_CONNECTION_POOL_SIZE("IMAPConnectionPoolSize", false, "4"),
    IMAP_CONNECTION_POOL_TIMEOUT("IMAPConnectionPoolTimeout", false, "300000"),
    IMAPS("IMAPS", false, "false"),
    TRUST_STORE("TrustStore", false, ""),
    TRUST_STORE_PASSWORD("TrustStorePassword", false, ""),
    DEFAULT_SENT_FOLDER("DefaultSentFolder", false, "\\Sent"),
    DEFAULT_TRASH_FOLDER("DefaultTrashFolder", false, "\\Trash"),
    DEFAULT_DRAFTS_FOLDER("DefaultDraftsFolder", false, "\\Drafts"),
    DEFAULT_INBOX_FOLDER("DefaultInboxFolder", false, "INBOX"),
    POST_FETCH_MESSAGE_COUNT("PostFetchMessageCount", false, "0"),
    SESSION_DEBUG("SessionDebug", false, "false"),
    SMTP_AUTH("SMTPAuth", false, "true"),
    SMTPS("SMTPS", false, "false"),
    TRUST_SSL("TrustSSL", false, "false"),

    // Used only in demo mode
    USERNAME("Username", false, null),
    PASSWORD("Password", false, null);

    private String property;
    private boolean mandatory;
    private String propValue;

    private ConfigurationProperties (String property, boolean mandatory, String propValue) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafcd357c160x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafcd357c160x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafcd357c160x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafcd357c16");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf8ee13e000x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf8ee13e000x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf8ee13e000x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf8ee13e00");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x30x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x3_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x4_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x20x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafc238e9b3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf112bb791");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf269fe3730x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf269fe3730x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf269fe3730x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf269fe373");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafa8ac20cc");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf13a73f66");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaffa746f70");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf2974cddf");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafe20cf0ed");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf356878ba");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf4a349acd");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaff6e09d24");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafdd2ade35");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafc3775177");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafa29cbffe");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf5f67b0e4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf2065d63b");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaff0354987");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf5a1fb3c3");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf733ee6d4");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafe7238d33");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf3df2880a");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x40x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x40x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0");
		this.property = property;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x40x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x40x1");
		this.mandatory = mandatory;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x40x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf930d7c6b0x40x20x0");
		this.propValue = propValue;
    }

    /**
     * Return a ConfigurationProperties enumeration that matches the passed command.
     *
     * @param property
     *            The property to use for lookup.
     * @return the ConfigurationProperties enumeration that matches the passed property, or null
     *         if not found.
     */
    public static ConfigurationProperties lookup(String property) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x4_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x3_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x30x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x0");
		if (property != null) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x0");
			for (ConfigurationProperties confProp : values()) {
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x20x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x20x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x20x00x00x0");
				if (confProp.getProperty().equalsIgnoreCase(property)) {
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x20x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x00x10x00x20x00x10x0");
					return confProp;
				}
			}
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf53d4d5c80x40x1");
		return null;
    }

    /**
     * Return the name of property.
     *
     * @return the name of property.
     */
    public String getProperty() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf2294f9a8");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf2294f9a80x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf2294f9a80x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf2294f9a80x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf2294f9a80x20x0");
		return this.property;
    }

    /**
     * Return if property is mandatory
     *
     * @return true if mandatory else false.
     */
    public boolean isMandatory() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafe5b7914e");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafe5b7914e0x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafe5b7914e0x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafe5b7914e0x2");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcafe5b7914e0x20x0");
		return this.mandatory;
    }

    /**
     * Return the value of the property.
     *
     * @return the value of the property.
     */
    public String getPropValue() {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf691cf1d9");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf691cf1d90x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf691cf1d90x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf691cf1d90x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf691cf1d90x20x0");
		return this.propValue;
    }

    /**
     * Test for mandatory properties, complete with default values when
     * missing, and avoid unknown properties.
     */
    public static void validateProperties(Properties properties) {

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf27310062");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x30x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x4_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x3_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x0");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x00x00x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x00x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x00x10x00x00x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x00x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x00x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x00x10x00x00x0");
		List<String> errors = new ArrayList<String>();

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x1");
		// Test for mandatory and complete properties with default values when
        // missing
        for (ConfigurationProperties confProps : ConfigurationProperties.values()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x00x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x00x1");
			String propName = confProps.getProperty();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x10x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x10x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x10x0");
			String propValue = confProps.getPropValue();
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x20x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x20x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x20x1");
			Object value = properties.get(propName);
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x3");
			if (confProps.isMandatory()) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x10x0");
				if (value == null) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x10x00x1");
					InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x10x00x10x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x10x00x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x10x00x10x0");
					errors.add("The mandatory Property '"
                            + confProps.getProperty() + "' is not set.");
                }
            } else if (value == null && propValue != null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x20x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x20x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x10x20x30x20x10x00x0");
				properties.setProperty(propName, propValue);
            }
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x0");
		// Test for unknown properties set in configuration
        for (Object key : properties.keySet()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x2");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x00x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x00x00x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x00x0");
			if (ConfigurationProperties.lookup((String) key) == null) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x00x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x00x10x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x00x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x20x20x00x10x0");
				errors.add("The Property '" + key
                        + "' is unknown");
            }
        }
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x3_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x30x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x30x0");
		if (!errors.isEmpty()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x30x10x00x00x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x30x10x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x30x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x30x10x00x00x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf273100620x40x30x10x0");
			throw new IllegalArgumentException("Error validating configuration : \n" + properties + "\n" +  errors.toString());
        }
    }

    /**
     * Loads and validate a properties file.
     *
     * @param configDir
     * @param name
     * @return
     */
    public static Properties loadProperties(String name) {
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e93");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x4_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x3_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x30x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x1");
		InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x00x0");
		if (name == null) {
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x00x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x00x10x0");
			return null;
		}

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x10x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x10x0");
		Properties properties = null;
        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x20x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x20x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x2_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x20x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x20x10x00x0");
		File file = new File(name);

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x3_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x0");
		if (file.exists()) {
            InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x1");
			InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x00x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x00x0");
			FileInputStream fis = null;
            try {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x00x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x00x0");
				properties = new Properties();
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x10x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x10x0");
				fis = new FileInputStream(file);
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x20x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x00x2");
				properties.load(fis);
            } catch (Exception e) {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x10x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x1");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x10x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x10x10x00x0");
				properties = null;
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x10x10x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x10x10x10x0");
				e.printStackTrace();
            } finally {
                InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x2");
				InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x0");
				if (fis != null) {
                    InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x1");
					try {
                        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x10x0");
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x10x00x00x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x10x00x00x0");
						fis.close();
                    } catch (IOException e) {
						InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x10x00x10x00x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x10x00x10x0_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x10x00x10x1_____org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x30x10x10x20x00x10x00x1");
                        // Empty on purpose
                    }
                }
            }
        }

        InstrumentationLoggerProvider.get().instrument("org_apache_hupa_server_utils_ConfigurationProperties_java0x0716edcaf46b62e930x40x4");
		return properties;
    }
}