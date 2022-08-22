package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.jodah.failsafe.internal.util.Assert;

public class Addtocart {
	WebDriver driver;
	@FindBy(xpath="//span[@id=\"a-autoid-1\"]")private WebElement clickonproduct;
	@FindBy(xpath="//*[@id=\"add-to-cart-confirmation-image\"]/div/a/img")private WebElement verifyproduct;
	
	public Addtocart(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void addproducttocart() {
		clickonproduct.click();
	}
	public void verifyproductisvisible() {
		
		
	}
}
