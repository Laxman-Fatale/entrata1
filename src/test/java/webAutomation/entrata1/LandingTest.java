package webAutomation.entrata1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LandingTest extends BaseTest {
	
	@BeforeSuite
	public void launchBrowser() throws Exception {
		initialization();
		setUp();
	}
	
	@Test(priority=1)
	public void landingTest() throws Exception {
		LandingPage lp = new LandingPage(driver);
		lp.verifyTitle();
		lp.acceptHomePageCookies();
		lp.clickOnSignInButton();
		lp.clickOnWatchDemo();
	}
}
