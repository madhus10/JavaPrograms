package default1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class PageTestClass {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		DriverInit instanceDriver = DriverInit.getInstance();
		driver = instanceDriver.openBrowser();
	}

	@Test
	public void DriverInit() {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
