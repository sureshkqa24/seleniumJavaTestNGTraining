package mavendemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	

	@Test(priority = -1)
	public void testWebdriverDemo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.applitools.com/app.html");
		
		List<WebElement> listsAddition = driver.findElements(By.xpath("//span[@class='text-success']"));
		List<WebElement> listsSubstraction = driver.findElements(By.xpath("//span[@class='text-danger']"));
		
		double sumOfCredits = 0;
		double sumOfDebits = 0;
		double totalSum = 0;
		
		for(WebElement el : listsAddition)
		{
			System.out.println(el.getText().replaceAll("[USD,+ ]", ""));
			sumOfCredits = sumOfCredits + Double.parseDouble(el.getText().replaceAll("[USD,+ ]", ""));
		}
		
		for(WebElement el : listsSubstraction)
		{
			System.out.println(el.getText().replaceAll("[ USD,-]", ""));
			
			sumOfDebits = sumOfDebits + Double.parseDouble(el.getText().replaceAll("[ USD,-]", ""));
		}
		
		totalSum = sumOfCredits - sumOfDebits;
		
		System.out.println("Total sum is "+totalSum);
		
		driver.close();
	}

	


}
