package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		
		driver.manage().window().maximize();
		
		WebElement iframediv =  driver.findElement(By.xpath("//li[text()='iFrame']"));
		
		iframediv.click();
		
		driver.switchTo().frame("globalSqa");
		
		Thread.sleep(3000);
		WebElement imgInsideFrame = driver.findElement(By.xpath("//div[@class='portfolio_animator_class']//img"));
		
		imgInsideFrame.click();
		
		driver.switchTo().defaultContent();
		
		WebElement openNewTab = driver.findElement(By.xpath("//a[text()='Home']"));
		openNewTab.click();
		
		driver.close();

	}

}
