package webAutomation.entrata1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LandingPage {

	WebDriver driver;
	
	By pageText=By.xpath("//div[@class='hero-left']//h1[contains(text(),'Enabling efficient operations')]");
	By signIn = By.xpath("//a[@class='button-default outline-dark-button']");
	By acceptCookies = By.xpath("//button[@id='rcc-confirm-button']");
	By watchDemo = By.xpath("//div[@class='hero-left']//a[@title='Watch Demo Button'][normalize-space()='Watch Demo']");
	
	//Constructor
	public LandingPage (WebDriver driver) {
		this.driver=driver;
	}
	
	//Assertion to validate the Webpage Content
	public void verifyTitle() {
		String expectedHomePageTitle = "Enabling efficient operations";
		String homepagetTitle=driver.findElement(pageText).getText();		
		System.out.println("Welcome to "+homepagetTitle);
		Assert.assertEquals(homepagetTitle, expectedHomePageTitle);	
		System.out.println("Assetion Matched");
		
	} 
	
	//Accept Cookies 
	public void acceptHomePageCookies() {
		driver.findElement(acceptCookies).click();
	}
	
	//Click in SignIn CTA
	public void clickOnSignInButton() throws InterruptedException  {
		driver.findElement(signIn).click();
		Thread.sleep(3000);
		//Navigate back to parent screen
		driver.navigate().back();
	}

	//Click on WatchDemo
	public void clickOnWatchDemo() {
		driver.findElement(watchDemo).click();
	}
}
