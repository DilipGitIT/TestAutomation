package org.web.automation.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	
	public static String configfilereader(String Key){
		FileInputStream File = null;
		try {
			File = new FileInputStream("./Configfiles/configfile.properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(File);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop.get(Key).toString();
	}
	
	public static String ElementLocatoreader(String Key){
		FileInputStream File = null;
		try {
			File = new FileInputStream("./Configfiles/Elementlocator.properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(File);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop.get(Key).toString();
	}

}
