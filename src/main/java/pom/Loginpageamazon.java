package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageamazon {
	@FindBy(xpath="//span[text()='Hello, Sign in']")private WebElement signinbutton;
	@FindBy(xpath="//input[@type=\"email\"]")private WebElement username;
	@FindBy(xpath="//input[@type=\"email\"]//following::input[3]")private WebElement button;
	
	
	WebDriver driver;
	public Loginpageamazon(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickonsignin() {
		signinbutton.click();
	}
	public void usernamee(String name) {
		username.sendKeys(name);
	}
	public void continuebutton() {
		button.click();
	}
	
}
