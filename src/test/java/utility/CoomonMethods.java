package utility;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import webAutomation.entrata1.BaseTest;

public class CoomonMethods extends BaseTest {

	public void getWebElementText(String xpathkey) {
		String textOfWebElement = driver.findElement(By.xpath(locatrs.getProperty(xpathkey))).getText();
		System.out.println(textOfWebElement);
	}

	// Click method
	public void clickWebElement(String xpathkey) {
		driver.findElement(By.xpath(locatrs.getProperty(xpathkey))).click();
	}

	// Clear method
	public void clearWebElementData(String xpathkey) {
		driver.findElement(By.xpath(locatrs.getProperty(xpathkey))).clear();
	}

	// Enter data
	public void enterWebElementData(String xpathkey, String testdata) {
		driver.findElement(By.xpath(locatrs.getProperty(xpathkey))).sendKeys(tstdata.getProperty(testdata));
	}

	// Navigate back
	public void NavigateToBackScreen() {
		driver.navigate().back();
	}

	// Mouse Hover actions
	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(locatrs.getProperty(xpathkey)))).build().perform();
	}

	// Logger method
	public void handleLogger(String className, String loggerText) {
		Logger logger = Logger.getLogger(className);
		PropertyConfigurator.configure(config.getProperty("Log4JProperty"));
		logger.info(loggerText);
	}

}
