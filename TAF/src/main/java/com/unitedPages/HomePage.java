package com.unitedPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver=null;
	
	public HomePage(WebDriver driver){
		if(driver!=null)
		this.driver=driver;
	}
	
	@FindBy(how=How.ID, id="roundtrip")
	public WebElement roundtrip;
	
	@FindBy(how=How.ID, id="oneway")
	public WebElement oneway;
	
	@FindBy(how=How.ID, id="bookFlightOriginInput")
	public WebElement origin;
	
	@FindBy(how=How.ID, id="bookFlightDestinationInput")
	public WebElement destination;
	
	@FindBy(how=How.ID, id="DepartDate")
	public WebElement date;
	
	@FindBy(how=How.XPATH, xpath="//div[@id='passengerSelector']/div")
	public WebElement travellers;
	
	@FindBy(how=How.XPATH, xpath="//span[contains(@class,'ListBox-ListBox__dropdownArrow')]")
	public WebElement cabinType;
	
	@FindBy(how=How.XPATH, xpath="//button/span[text()='Find flights']")
	public WebElement findFlights;
	
	@FindBy(how=How.XPATH, xpath="//button[@aria-label='Substract one Seniors']")
	public WebElement addButtonScenior;
	
	@FindBy(how=How.XPATH, xpath="//li[text()='Economy']")
	public WebElement economy;
	
	@FindBy(how=How.XPATH, xpath="//li[text()='Premium economy']")
	public WebElement premiumEconomy;
	
	@FindBy(how=How.XPATH, xpath="//li[text()='Business or First']")
	public WebElement bussinessFirst;
	
	
	public void enterOrigin(String originCity) throws InterruptedException
	{
		origin.click();
		origin.clear();
		origin.sendKeys(originCity);
		Thread.sleep(5000);
	}
	public void enterDestination(String destinationCity) throws InterruptedException
	{
		destination.click();
		destination.clear();
		destination.sendKeys(destinationCity);
		Thread.sleep(5000);
	}
	public void enterDate(String journeyDate) throws InterruptedException{
		date.click();
		date.clear();
		date.sendKeys(journeyDate);
		Thread.sleep(5000);
	}
	public void selctDate(){
		
	}
	public void addScenior(){
		travellers.click();
		addButtonScenior.click();
	}
	
	public void selectCabinType(String cabin){
		cabinType.click();
		if(cabin.equalsIgnoreCase("economy")){
		 economy.click();	
		}
		else if(cabin.equalsIgnoreCase("premium economy")){
			 premiumEconomy.click();	
			}
		else if(cabin.equalsIgnoreCase("businnesfirst")){
			 bussinessFirst.click();	
			}
	
	}
	public void clickOnFindFlights(){
		findFlights.click();
	}
	
	public void trip(String triptype){
		if(triptype.equalsIgnoreCase("oneway"))
			oneway.click();
		else if(triptype.equalsIgnoreCase("roundtrip"))
			roundtrip.click();
	}
}
