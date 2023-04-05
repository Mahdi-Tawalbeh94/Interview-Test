import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Parameeters {
	
	WebDriver driver=new ChromeDriver();
	Random rand = new Random();
	SoftAssert ass =new SoftAssert();
	
	@BeforeTest
	public void mySetup() {
		driver.get("https://www.almosafer.com/en");
		
		
	}

}
