package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectDemoTest extends BaseTest {
	
	
	@Test
	public void testLogin()
	{
		LoginPage loginpage = new LoginPage(driver);
		loginpage.LoginIntoApplication();
		
		InventoryPage inventoryPage = new InventoryPage(driver);
		Assert.assertTrue(inventoryPage .isInventiryPageDisplayed());
	}

}
