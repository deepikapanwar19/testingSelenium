package basePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BaseClass {
	private WebDriver driver;

	public void openBrowser(String appURL,WebDriver driver) {
		
			driver.get(appURL);
			driver.manage().window().maximize();
		}
	
	public WebDriver initializeDriver(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Driver-Selenium\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\Driver-Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("microsoftEdge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Driver-Selenium\\msedgedriver.exe");
			driver = new EdgeDriver();

		}
		return driver; 
	}

	public void tearDown() {
		driver.quit();
		
	}

}
