package default1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInit {

	public WebDriver driver;
	private static DriverInit instanceDriver = null;

	private DriverInit() {

	}

	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"H:\\Learn_Automation\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		return driver;
	}

	public static DriverInit getInstance() {
		if (instanceDriver == null)
			instanceDriver = new DriverInit();
		return instanceDriver;

	}

}
