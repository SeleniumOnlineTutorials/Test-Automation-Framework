package com.united.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInitialization {
		
	WebDriver driver=null;
	
	
	public void launchApplication(String browser){
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium Jars\\chroome new\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("https://www.united.com/en/us");
		driver.manage().window().maximize();
		
		
	}
	
}
