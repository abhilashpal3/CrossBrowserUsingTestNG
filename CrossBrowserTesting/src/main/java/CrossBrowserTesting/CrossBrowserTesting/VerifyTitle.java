package CrossBrowserTesting.CrossBrowserTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;

	@Test
	@Parameters("browser")
	public void verifyPageTitle(String browserName) throws InterruptedException {

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\RequiredFilesUtility\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get("https://phptravels.com/demo/");
		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\RequiredFilesUtility\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get("https://phptravels.com/demo/");

		}

	}
}
