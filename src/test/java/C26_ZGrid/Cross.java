package C26_ZGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross {
	
 public WebDriver driver;
  @Test
  @Parameters("browser")
  public void VerifyTitlepage(String browserName) {
	 // ----if----
	  if (browserName.equalsIgnoreCase("Chrome")) {
		  
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  
	}
	  //-----elseif------
	  else if (browserName.equalsIgnoreCase("FireFox")) {
		  
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  
		  }
	  
	    
  }
}
