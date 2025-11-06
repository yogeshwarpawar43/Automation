package com.selenium.utiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	  private Properties properties;

	    // Constructor that accepts file path
	    public ConfigReader(String filePath) {
	        properties = new Properties();
	        try (FileInputStream fis = new FileInputStream(filePath)) {
	            properties.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // Method to get value
	    public String getProperty(String key) {
	        return properties.getProperty(key);
	    }

}
