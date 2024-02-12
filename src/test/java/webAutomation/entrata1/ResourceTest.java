package webAutomation.entrata1;

import org.testng.annotations.Test;

public class ResourceTest extends ProductTest {

	@Test(priority=4)
	public void resouceTest() {
		ResourcePage rpage = new ResourcePage(driver);
		rpage.assertionValidation();
	}
	
}
