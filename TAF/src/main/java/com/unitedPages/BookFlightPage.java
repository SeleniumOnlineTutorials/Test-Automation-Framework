package com.unitedPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.unitedUtils.WebDriverWaitHelper;

public class BookFlightPage {
	WebDriver driver=null;
	Actions act=null;
	JavascriptExecutor js=null;
	public WebDriverWaitHelper webdriverwait;
	public BookFlightPage(WebDriver driver){
		this.driver=driver;	
		act = new Actions(driver);
		webdriverwait=new WebDriverWaitHelper(driver);
	}
	
	
	@FindBy(how=How.XPATH, xpath="(//div[@aria-describedby='ECONOMY']//button)[1]")
	public WebElement flightSelect;
	
	@FindBy(how=How.XPATH, xpath="//div[contains(@class,'FareWheel-styles__fareWheelContainer')]")
	WebElement fareWheel;
	
	public void selectFlight(){
		webdriverwait.waitForElement(fareWheel);
		act.moveToElement(flightSelect).click().build().perform();
		//flightSelect.click();
	}

}
