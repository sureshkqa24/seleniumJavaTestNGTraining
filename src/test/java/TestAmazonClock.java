import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazonClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int lowestPrice =0;
		int newPrice=0;
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//span[text()='Under ₹2,000']")).click();
		
		List<WebElement> priceLists = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<String> priceList = priceLists.stream().map(el -> el.getText()).toList();

		System.out.println(priceList);
		
		for(String price : priceList)
		{
			price = price.replaceAll(",", "");
			newPrice = Integer.parseInt(price);
			if(lowestPrice < newPrice )
				lowestPrice = newPrice;
		}
		
		System.out.println(" The Lowest price for the watch is "+lowestPrice);
		
		driver.close();
	}

}
