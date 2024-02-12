package webAutomation.entrata1;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	public static Properties config;
	public static Properties locatrs;
	public static Properties tstdata;
	public static Properties log4j;

	public BaseTest() {

	}

	public void initialization() throws Exception {

		// Configuration Property files implementation
		FileInputStream configInput = new FileInputStream("./Repository/configuration.properties");
		config = new Properties();
		config.load(configInput);

		// Locators property file implementation
		FileInputStream locatrsInput = new FileInputStream("./Repository/locators.properties");
		locatrs = new Properties();
		locatrs.load(locatrsInput);

		// TestData property file implementation
		FileInputStream tstdataInput = new FileInputStream("./Repository/testdata.properties");
		tstdata = new Properties();
		tstdata.load(tstdataInput);
		}

	public void setUp() {
		if (config.getProperty("Browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().driverVersion("121").setup();
			driver = new ChromeDriver();
		} else if (config.getProperty("Browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (config.getProperty("Browser").contentEquals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Browser details not found !!");
		}

		driver.manage().window().maximize(); // Maximizing the window
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(config.getProperty("URL"));
	}
	
	public void handleLogger(String className, String loggerText) {
		Logger logger = Logger.getLogger(className);
		PropertyConfigurator.configure(config.getProperty("Log4JProperty"));
		logger.info(loggerText);
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
