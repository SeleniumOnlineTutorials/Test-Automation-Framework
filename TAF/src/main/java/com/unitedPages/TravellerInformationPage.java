package com.unitedPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.unitedUtils.WebDriverWaitHelper;




public class TravellerInformationPage extends WebDriverWaitHelper{
	WebDriver driver=null;
	Actions act=null;
	Select sel=null;
	JavascriptExecutor js=null;
	
	///public WebDriverWait webdriverwait;
	public TravellerInformationPage(WebDriver driver){
		super(driver);
		this.driver=driver;	
		act = new Actions(driver);
		
		
	}
	@FindBy(how=How.NAME, name="rtiTraveler.travelers[0].firstName")
	WebElement fname;

	@FindBy(how=How.NAME, name="rtiTraveler.travelers[0].lastName")
	WebElement lname;

	@FindBy(how=How.XPATH, xpath="//input[@placeholder='DD']")
	WebElement date;

	@FindBy(how=How.XPATH, xpath="//input[@placeholder='YYYY']")
	WebElement year;

	@FindBy(how=How.XPATH, xpath="//label[text()='Month']/following::select[1]")
	WebElement birthMonth;

	@FindBy(how=How.XPATH, xpath="//label[@aria-label='Gender']/following::select[1]")
	WebElement gender;

	@FindBy(how=How.XPATH, xpath="//span[text()='Continue']/parent::button")
	WebElement continueBtn;

	public void enterFirstName(String Fname){
		fname.clear();
		fname.sendKeys(Fname);
	}

	public void enterLastName(String Lname){
		lname.clear();
		lname.sendKeys(Lname);
	}
	public void selectMonth(){
		sel= new Select(birthMonth);
		sel.selectByIndex(5);
	}
	public void selectGender(){
		sel= new Select(gender);
		sel.selectByIndex(1);
	}
	public void enterDay(String dd){
		date.clear();
		date.sendKeys(dd);
	}
	public void enterYear(String yyyy){
		year.clear();
		year.sendKeys(yyyy);
	}
	
	public void clickOnContinueButton(){
		act.moveToElement(continueBtn).build().perform();
		continueBtn.click();
	}
	
	public void enterTravelInformation(){
		waitForElement(continueBtn);
		enterFirstName("Sai");
		enterLastName("test");
		selectGender();
		selectMonth();
		enterDay("12");
		enterYear("1989");
		clickOnContinueButton();
	}
}
