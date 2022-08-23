package amazonproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pojo.Launchbrowser;
import pom.Addtocart;
import pom.Loginpageamazon;
import pom.Passwordfield;
import pom.Selectproduct;

public class Loginpagetest {
	

 
@Test
	public  void openbrowser() {
WebDriver driver=

		Launchbrowser.openbrowser("https://www.amazon.in/");
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Loginpageamazon lp=new Loginpageamazon(driver);
		
		
		lp.clickonsignin();
		
		lp.usernamee("rsonawane702@gmail.com");
		lp.continuebutton();
		Passwordfield psw=new Passwordfield(driver);
		psw.enterpassword("Rushi@123");
		psw.clickonsifnup();
		Selectproduct sd=new Selectproduct(driver);
		sd.addtocartt();
		Addtocart ad=new Addtocart(driver);
		ad.addproducttocart();
		
			
		
		
	}
	
	
}
