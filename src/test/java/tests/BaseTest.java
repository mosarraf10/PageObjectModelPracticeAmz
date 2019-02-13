package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import junit.framework.Assert;

public class BaseTest {

	public WebDriver driver;
	String expectedURL = "https://www.amazon.com/";

	@BeforeClass
	public void getSetUp() {

		String os = System.getProperty("os.name").toLowerCase();
		String userDir = System.getProperty("user.dir");
		String winDriver = System.getProperty(userDir + "\\Drivers\\chromedriver.exe");
		String macDriver = System.getProperty(userDir + "/Drivers/chromedriver");

		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver", macDriver);
		} else {
			System.setProperty("webdriver.chrome.driver", winDriver);
		}

		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void getURL() {
		driver.navigate().to(expectedURL);
		String actualURL = driver.getCurrentUrl();
		System.out.println("Validating URL");
		System.out.println();
		try {
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Actual URL matches Expected URL");
		} catch (Exception e) {
			System.out.println("Actual URL DOES NOT match Expected URL");
		}
	}

	@AfterMethod
	public void segregateTests() {
		System.out.println("The test has run");
	}

	@AfterClass
	public void closeBrowsers() {
		driver.close();
		driver.quit();
	}
}
