import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MyTestCases extends Parameeters {

//	@Test(invocationCount = 5)
//	public void checkTheWebsiteLanguage() {
//
//		String language[] = { "https://www.almosafer.com/ar", "https://www.almosafer.com/en" };
//
//
//		int RandomNum = rand.nextInt(0, 8000) % 2;
//		
//		driver.get(language[RandomNum]);
//		
//		
//		// check the website title
//		String act=driver.getTitle();
//		
//	 if (RandomNum==0) {
//		 ass.assertEquals(act, "المسافر: رحلات، فنادق، أنشطة ممتعة و تذاكر طيران");
//		
//	} else {
//		 ass.assertEquals(act, " Almosafer: Flights, Hotels, Activities & Airlines Ticket Booking");
//
//
//	}
//
//	}
	
//	@Test()
//	public void defaultCurr() {
//		String exp ="SAR";
//		WebElement curr=driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button"));
//		String act=curr.getText();
//		System.out.println(act);
//		
//		ass.assertNotEquals(act, exp);
//		ass.assertAll();
//		
//	}
	
//	@Test()
//	public void qitaf_logo() {
//	WebElement div=	driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[2]"));
//	
//	List<WebElement> L =div.findElements(By.tagName("svg"));
//	
//	System.out.println(L.size());
//	
//	String act=L.get(0).getAttribute("data-testid");
//	String exp="Footer__QitafLogo";
//	
//	ass.assertNotEquals(act, exp);
//	ass.assertAll();
//	
//	}

	@Test()
	public void visa_logo() {
		WebElement div=driver.findElement(By.xpath("//*[@id=\"__next\"]/footer/div[3]/div[3]/div[1]/div[2]/div/div[1]"));
		List<WebElement> logoes=div.findElements(By.tagName("svg"));
		
		System.out.println(logoes.size());
		
		for (int i = 0; i < logoes.size(); i++) {
			System.out.println(logoes.get(i).getAttribute("data-testid"));
			if (logoes.get(i).getAttribute("data-testid").equals("Footer__VisaCardLogo")) {
				
				System.out.println("Test done");
				
			}
		}
		
	}
}
