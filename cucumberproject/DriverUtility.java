package skeliton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility
{
	 public static WebDriver getDriver(String browser)
	{
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
		
		 return new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\selenium\\drivers\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if (browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","C:\\selenium\\drivers\\IEDriverServer.exe" );
			return new InternetExplorerDriver();
		}
		else 
		{
			return null;
		}
	}

}
