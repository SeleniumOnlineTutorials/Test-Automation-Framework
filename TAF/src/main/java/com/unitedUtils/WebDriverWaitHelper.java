package com.unitedUtils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitHelper {
	
	WebDriver driver=null;
	WebDriverWait wait=null;
	public WebDriverWaitHelper(WebDriver driver){
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(50));
	}
	
	public void waitForElement(WebElement we){
		wait.until(ExpectedConditions.elementToBeClickable(we));
	}

}
