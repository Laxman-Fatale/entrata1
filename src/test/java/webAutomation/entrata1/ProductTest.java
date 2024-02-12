package webAutomation.entrata1;

import org.testng.annotations.Test;

public class ProductTest extends FormTest {
	
	@Test(priority=3)
	public void productTest() throws Exception {
		ProductPage pp = new ProductPage(driver);
		//Thread.sleep(2000);
		pp.clickOnProductDropDown();
		//Thread.sleep(1000);
		//pp.scrollDown();
		pp.click2();
	}

}
