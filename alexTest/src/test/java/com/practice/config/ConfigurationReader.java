package com.practice.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.practice.exceptions.ConfigException;

public class ConfigurationReader {

	//private static Logger LOGGER = new Logger();
	
	public static Properties readConfigFile() {
		try (InputStream input = new FileInputStream("src/test/resources/config.properties")) {

            Properties prop = new Properties();
            prop.load(input);

            return prop;
        } catch (IOException ex) {
            //LOGGER.debug(ex.getMessage());
            throw new ConfigException("Your configuration file cannot be read");
        }
	}
}
