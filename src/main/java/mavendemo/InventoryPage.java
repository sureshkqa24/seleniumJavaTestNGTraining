package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {
	
	@FindBy(xpath = "//div[text()='Swag Labs']")
	WebElement header;
	
	public InventoryPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isInventiryPageDisplayed()
	{
		return header.isDisplayed();
	}

	

}
