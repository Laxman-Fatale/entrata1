package webAutomation.entrata1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {

	WebDriver driver;

	By ProductNavigation = By.xpath("(//div[@class='main-nav-link'])[1]");
	By ProductList = By.xpath("//div[@class='nav-group']//a[@class='fat-nav-header']");
	String productSelected = "Marketing & Leasing";
	String marketingElement = "Digital Marketing Services";
	By MarketingAndLeasing = By
			.xpath("//div[@class='nav-group']//a[@class='fat-nav-header'][normalize-space()='Marketing & Leasing']");
	By dropDownSubFields = By.xpath("//div[@class='nav-group']//a[@class='fat-nav-links']");
	By DigitalMarketing = By.xpath(
			"//div[@class='nav-group']//a[@class='fat-nav-links'][normalize-space()='Digital Marketing Services']");
	By ThemeGaralry = By.xpath("//a[normalize-space()='Theme Gallery']");
	By clickResource = By.xpath("//div[@class='header-nav-item']//a[@class='main-nav-link'][normalize-space()='Resources']");
	
	//Constructors
	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	
	//Clicking on Product DropDown 
	public void clickOnProductDropDown() throws Exception {
		WebElement productName = driver.findElement(ProductNavigation);
		Actions act = new Actions(driver);

		act.moveToElement(productName).build().perform();
		List<WebElement> listOfProductNames = driver.findElements(ProductList);
		System.out.println("Product Element Size Is : " + listOfProductNames.size());
		List<WebElement> productSubElemets = driver.findElements(dropDownSubFields);
		System.out.println("SubOptions size is : " + productSubElemets.size());
//		System.out.println("Outer loop");
		for (int i = 0; i < listOfProductNames.size(); i++) {
			if (listOfProductNames.get(i).getText().equalsIgnoreCase(productSelected)) {
//			System.out.println("Inner Loop");
				for (int j = 0; j <= productSubElemets.size(); j++) {
					if (productSubElemets.get(j).getText().equalsIgnoreCase("Digital Marketing Services")) {
						// System.out.println("Hello Inner loop");
//						productSubElemets.get(j).click();
						driver.findElement(DigitalMarketing).click();
						break;
					}
				}
				break;
			}
			System.out.println(driver.getTitle());
		}
	}

	public void click2() {
		driver.findElement(clickResource).click();
	}
	
//	//Scrolling Down
//	public void scrollDown() throws Exception {
//		Thread.sleep(1000);
////		WebElement scrollingElement = driver.findElement(ThemeGaralry);
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
////		jse.executeScript("arguments[0].scrollIntoView();", scrollingElement);
////		jse.executeScript("window.scrollBy(100,4900)");
////		jse.executeScript("window.scrollBy(1184, 4112)");
//	}

}
