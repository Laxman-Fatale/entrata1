package webAutomation.entrata1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ResourcePage {

	WebDriver driver;

	By ResoureseText = By.xpath("//h2[normalize-space()='Resource Center']");

	public ResourcePage(WebDriver driver) {
		this.driver = driver;
	}

	public void assertionValidation() {
		String expResouceText = "Resource Center";
		String eText = driver.findElement(ResoureseText).getText();
		Assert.assertEquals(eText, expResouceText);
		System.out.println("Assertion Pass");

	}
}
