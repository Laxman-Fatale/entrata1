package webAutomation.entrata1;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
	
	WebDriver driver;

	By FirstName = By.xpath("//input[@name='FirstName']");
	By LastName=By.xpath("//input[@id='LastName']");
	By EmailId=By.xpath("//input[@id='Email']");
	By CompanyName=By.xpath("//input[@id='Company']");
	By PhoneNumber=By.xpath("//input[@id='Phone']");
	By UnitCount=By.xpath("//select[@id='Unit_Count__c']");
	By JobTitle=By.xpath("//input[@id='Title']");
	
	
	//Constructor
	public FormPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Click on FirstName
	public void clickOnFirstName() {
		driver.findElement(FirstName).click();
	}
	
	public void userFirstName(String firstName) {
		driver.findElement(FirstName).sendKeys(firstName);
	}
	
	//Click on LastName
	public void clickLastName() {
		driver.findElement(LastName).click();
//		handleLogger("FormPage", "Clicked on Last Name");
	}


	public void enterLastName(String lastName) {
		driver.findElement(LastName).sendKeys(lastName);
//		handleLogger("FormPage", "Last Name Entered");
	}

	//Click on EmailId
	public void clickOnEmail() {
		driver.findElement(EmailId).click();
//		handleLogger("FormPage", "Clicked on Email");
	}

	public void enterEmailId(String emailId) {
		driver.findElement(EmailId).sendKeys(emailId);
//		handleLogger("FormPage", "Email Id Entered");
	}

	//Click on CompanyName
	public void clickOnCompanyName() {
		driver.findElement(CompanyName).click();
//		handleLogger("FormPage", "Clicked on Company Name");
	}

	public void enterCompanyName(String comapnyName) {
		driver.findElement(CompanyName).sendKeys(comapnyName);
//		handleLogger("FormPage", "Company Name Entered");
	}

	//Click on PhoneNumber
	public void clickOnPhoneNumber() {
		driver.findElement(PhoneNumber).click();
//		handleLogger("FormPage", "Clicked on Phone Number");
	}

	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(PhoneNumber).sendKeys(phoneNumber);
//		handleLogger("FormPage", "Phone Number Entered");
	}

	//Click on UnitCount
	public void clickOnUnitCount() {
		driver.findElement(UnitCount).click();
//		handleLogger("FormPage", "Clicked on Unit Count");
	}

	public void enterUnitCount(String unitCount) {
		driver.findElement(UnitCount).sendKeys(unitCount);
//		handleLogger("FormPage", "Unit Count Entered");
	}

	//Click on JobTitle
	public void clickOnJobTitle() {
		driver.findElement(JobTitle).click();
//		handleLogger("FormPage", "Clicked on Job Title");
	}

	public void enterJobTitle(String jobTitle) {
		driver.findElement(JobTitle).sendKeys(jobTitle);
//		handleLogger("FormPage", "Application Filled");

	}
	
	//Navigate to default screen
	public void navigateToLandingPage() {
		driver.navigate().back();
	}

	public void handleLogger(String className, String loggerText) {
		Logger logger = Logger.getLogger(className);
		PropertyConfigurator.configure("./resources/log4j.properties");
		logger.info(loggerText);
	}
}
