package com.unitedUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReading {

	private Properties props=null;
	private String configFilePath=System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\config.properties";
	public ConfigFileReading(){
		try{
			FileInputStream fi=new FileInputStream(configFilePath);
			props=new Properties();
			try {
				props.load(fi);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		catch(FileNotFoundException fe){
			fe.printStackTrace();
		}
	}

	public String getDriverPath(String driverPath){

		return props.getProperty(driverPath);
	}
	public String getBrowser(String browser){

		return props.getProperty(browser);
	}
	public String getAppUrl(String url){

		return props.getProperty(url);
	}
	public String getImplicitWait(String wait){

		return props.getProperty(wait);
	}
}
