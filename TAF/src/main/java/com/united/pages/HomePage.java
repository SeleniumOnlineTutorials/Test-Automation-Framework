package com.united.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver=null;
	
	public HomePage(WebDriver driver){
		
	}
	
	@FindBy(how=How.ID, id="roundtrip")
	WebElement roundtrip;
	
	@FindBy(how=How.ID, id="oneway")
	WebElement oneway;
	
	@FindBy(how=How.ID, id="bookFlightOriginInput")
	WebElement origin;
	
	@FindBy(how=How.ID, id="bookFlightDestinationInput")
	WebElement destination;
	
	@FindBy(how=How.ID, id="DepartDate")
	WebElement date;
	
	@FindBy(how=How.XPATH, xpath="//div[@id='passengerSelector']/div")
	WebElement travellers;
	
	@FindBy(how=How.XPATH, xpath="//span[contains(@class,'ListBox-ListBox__dropdownArrow')]")
	WebElement cabinType;
	
	@FindBy(how=How.XPATH, xpath="//button/span[text()='Find flights']")
	WebElement findFlights;
	
	@FindBy(how=How.XPATH, xpath="//button[@aria-label='Substract one Seniors']")
	WebElement addButtonScenior;
	
	@FindBy(how=How.XPATH, xpath="//li[text()='Economy']")
	WebElement economy;
	
	@FindBy(how=How.XPATH, xpath="//li[text()='Premium economy']")
	WebElement premiumEconomy;
	
	@FindBy(how=How.XPATH, xpath="//li[text()='Business or First']")
	WebElement bussinessFirst;
	
	
	public void enterOrigin(String originCity)
	{
		origin.clear();
		origin.sendKeys(originCity);
	}
	public void enterDestination(String destinationCity)
	{
		destination.clear();
		destination.sendKeys(destinationCity);
	}
	public void enterDate(String journeyDate){
		date.clear();
		date.sendKeys(journeyDate);
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
}
