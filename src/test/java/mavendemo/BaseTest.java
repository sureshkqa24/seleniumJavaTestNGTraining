package mavendemo;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void beforeDemo()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void afterDemo()
	{
		ScreenshotUtilty sc = new ScreenshotUtilty(driver);
		sc.takeScreenShot();
		driver.close();
	}

}
