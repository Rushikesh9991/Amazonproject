package amazonproject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Placeorder extends Loginpagetest {
	
	
	@BeforeTest
	public void openamazonwebpage() {
		Loginpagetest lp=new Loginpagetest();
		lp.openbrowser();
	}
	@Test
	public void placeorder() {
		
		
	}
	

}
