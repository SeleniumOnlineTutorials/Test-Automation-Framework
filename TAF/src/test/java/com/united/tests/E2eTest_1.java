package com.united.tests;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.unitedPages.BookFlightPage;
import com.unitedPages.HomePage;
import com.unitedPages.TravellerInformationPage;
import com.unitedUtils.BrowserInitialization;
import com.unitedUtils.ConfigFileReading;
import com.unitedUtils.WebDriverWaitHelper;

public class E2eTest_1 {
	public static WebDriver driver=null;
	public static HomePage hpage;
	public static ConfigFileReading configFileReading;
	public BookFlightPage bpage;
	public TravellerInformationPage tpage;
	
	@Test
	public  void Test1() throws InterruptedException {
		configFileReading=new ConfigFileReading();
		driver=BrowserInitialization.launchApplication(configFileReading);
		
		hpage=PageFactory.initElements(driver, HomePage.class);
		bpage=PageFactory.initElements(driver, BookFlightPage.class);
		hpage.trip("oneway");
		hpage.enterOrigin("Houstan");
		hpage.enterDestination("Boston");
		hpage.enterDate("Jun 12");
		hpage.clickOnFindFlights();
		System.out.println("my changes");
		bpage.selectFlight();
		tpage.enterTravelInformation();
	}
	
	@AfterTest
	public void closeSession(){
		driver.quit();
	}
	

}
