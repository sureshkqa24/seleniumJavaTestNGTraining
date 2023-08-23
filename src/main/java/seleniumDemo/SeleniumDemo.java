package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// opening a browser
		//System.setProperty("webdriver.chrome.driver", "C:\\driverExe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/blog/2022/introducing-selenium-manager/");
		driver.manage().window().maximize();
		
		//WebElement element = driver.findElement(By.tagName("a"));
		
		By el = RelativeLocator.with(By.tagName("span")).below(By.xpath("//span[text()='2022']"));
		driver.findElement(el).click();
		
		//element.click();
		
		/*
		 * WebElement textBox = driver.findElement(By.cssSelector("#DocSearch-Input"));
		 * 
		 * textBox.sendKeys("demo");
		 */
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
