package BHilevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B12Assert2 {
	public WebDriver driver;
  @Test
  public void f() {
	//Correct title is sign on
			//We taking title as "sign in" to make the test fail
			  

	      String Actualtitle = "Sign In";
		  String Expectedtitle = driver.findElement(By.linkText("SIGN-ON")).getText();
		  System.out.println(Expectedtitle);
		  
		 
		  
		  //1st Statement 
			System.out.println("Sign In");
		  
			
			//2nd statement
			Assert.assertEquals(Actualtitle, Expectedtitle);
			
		
		  //3nd Statement
		  System.out.println("Assertion starts here...");
		  
		  //4t Statement
		  System.out.println("A blog for Software Testers");
		  
		  driver.quit(); 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
