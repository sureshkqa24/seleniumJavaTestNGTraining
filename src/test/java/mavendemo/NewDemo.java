package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewDemo {
	
	@Test
	public void testNewDemo()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().window().maximize();
		
		Select sel = new Select(driver.findElement(By.xpath("//div[@rel-title='Select Country']//select")));
		
		System.out.println("is multiple dropdown "+sel.isMultiple());
		
		driver.close();
	}

	@DataProvider(name="getData")
	public static Object[][] dataProviderDemo()
	{
		return new Object[][] {{"first value"},{"second value"},{"Third value"}};
	}
}
