package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;

public class ConfigUtil {

	private Log logger = null;
	Properties prop;

	public final String BROWSER;
	public final String URL;
	
	
	public   ConfigUtil(String fileName) {

		prop = new Properties();
		try {
			String filePath =System.getProperty("user.dir")+"/resources/"+fileName+".properties";
			System.out.println("filePath::"+ filePath);
			prop.load(new FileInputStream(filePath));
			
		} catch (FileNotFoundException e) {
			//logger.error("File not found -- please give correct file details");

		} catch (IOException e) {
			logger.error("Issue reading the given config properties file");

		}
		BROWSER = prop.getProperty("browser");
		URL = prop.getProperty("url"); 
	}

}
