package seleniumDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions action = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement src = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		
		WebElement dest = driver.findElement(By.id("trash"));
		
		//action.dragAndDrop(src, dest).perform();
		
		System.out.println(src.getLocation().getX());
		System.out.println(src.getLocation().getY());
		
		
		//action.moveToElement(dest).clickAndHold().click().perform()
		Thread.sleep(5000);
		driver.close();

	}

}
