package BHilevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class B14_FlipkartGeneric {
	
	public WebDriver driver;
	
	public Actions action;
	
	public void Generic(String str) {
		action = new Actions(driver);
		WebElement element1 = driver.findElement(By.xpath(str));
		action.moveToElement(element1).build().perform();

		
		
	}
	
	
  @Test
  public void clickable() {
		
		for (int i = 1; i <= 1; i++) {
			//generic("//*[@id=\"container\"]/div/div[2]/div/div/span["+i+"]");
			
		}
	  
	 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_6e4a74ea-2e12-472a-9bcc-96b15185a3d3_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
	  driver.manage().window().maximize();
  }
  

  @AfterTest
  public void afterTest() {
  }

}
