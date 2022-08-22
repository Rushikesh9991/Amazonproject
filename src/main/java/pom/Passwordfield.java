package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Passwordfield {
	
	@FindBy(xpath="//input[@type=\"password\"]")private WebElement paas;
	@FindBy(xpath="//input[@type=\"password\"]//following::input[@id='signInSubmit']")private WebElement signupbutton;
	
	public Passwordfield(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterpassword(String name) {
		paas.sendKeys(name);
		
	}
	public void clickonsifnup() {
		signupbutton.click();
	}
	
	
	

}
