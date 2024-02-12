package webAutomation.entrata1;


import org.testng.annotations.Test;

public class FormTest extends LandingTest {
	
//	private WebDriver driver;
//
//	public FormTest(WebDriver driver) {
//		this.driver=driver;
//		// TODO Auto-generated constructor stub
//	}

	@Test(priority=2)
	public void formTest() throws Exception {
	//	landingTest();
		FormPage fp = new FormPage(driver);
	//	Thread.sleep(3000);
		fp.clickOnFirstName();
		fp.userFirstName("Laxman");
		fp.clickLastName();
		fp.enterLastName("Fatale");
		fp.clickOnEmail();
		fp.enterEmailId("abcd");
		fp.clickOnCompanyName();
		fp.enterCompanyName("Entrata");
		fp.clickOnPhoneNumber();
		fp.enterPhoneNumber("8830050554");
		fp.clickOnUnitCount();
		fp.enterUnitCount("5");
		fp.clickOnJobTitle();
		fp.enterJobTitle("SDET");	
		fp.navigateToLandingPage();
	}

}
