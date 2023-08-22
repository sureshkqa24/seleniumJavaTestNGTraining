package mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	
	
	@FindBy(id = "user-name")
	WebElement loginUsername;
	
	@FindBy(id = "password")
	WebElement loginPassword;
	
	@FindBy(id = "login-button")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void LoginIntoApplication()
	{
		loginUsername.sendKeys("standard_user");
		loginPassword.sendKeys("secret_sauce");
		loginButton.click();
	}
	
	

}
