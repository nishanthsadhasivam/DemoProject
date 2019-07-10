package Cucumber.PomTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UtilityClass {
	static WebDriver driver;

	public static WebDriver startBrowser(String browsername,String url)
	{
		
		{
			System.setProperty("webdriver.chrome.driver", "C:\\nishanth\\Driver\\Drivers\\chromedriver.exe\\");
	        driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}