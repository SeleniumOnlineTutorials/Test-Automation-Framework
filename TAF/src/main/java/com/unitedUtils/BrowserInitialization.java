package com.unitedUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialization {
		
	public static WebDriver driver=null;
	
	ConfigFileReading configFileReading=null;
	public static WebDriver launchApplication(ConfigFileReading configFileReading){
		System.out.println("my changes");
		if(configFileReading.getBrowser("Browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver",configFileReading.getDriverPath("DriverPath") );
			driver=new ChromeDriver();
		}
		
		driver.get(configFileReading.getAppUrl("Url"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		return driver;
		
	}
	
}
