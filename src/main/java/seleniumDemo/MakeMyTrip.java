package seleniumDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MakeMyTrip {
    public static void main(String[] args) throws InterruptedException {
    	
    	WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.makemytrip.com/");
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@id='webengage-notification-container']/iframe")));
        
        d.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
        
        //d.switchTo().defaultContent();
		/*
		 * WebElement s_city = d.findElement(By.id("fromCity"));
		 * wait.until(ExpectedConditions.visibilityOf(s_city));
		 * System.out.println(s_city.getAttribute("innerText")); Actions actions = new
		 * Actions(d); s_city.sendKeys("BOM");
		 */
// List<WebElement> all_cities = d.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li"));
// wait.until(ExpectedConditions.visibilityOfAllElements(all_cities));
// for (WebElement single_city : all_cities) {
// if (single_city.getAttribute("innerText").contains("Mumbai")) {
// single_city.click();
// break;
// }
// }
           d.close();
        }
    }