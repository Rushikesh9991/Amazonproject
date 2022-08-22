package pom;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectproduct {
	@FindBy(xpath="	//a[@id=\"nav-cart\"]")private WebElement addtocart;
	
	


public Selectproduct(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void addtocartt() {
	addtocart.click();

	
}




}