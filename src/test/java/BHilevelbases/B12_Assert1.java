package BHilevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class B12_Assert1 {
	
	public WebDriver driver;
	
  @Test
  public void funoperation() {
	
	//Correct title is Welcome: Mercury Tours
		//We taking title as "Mercury Tours" to make the test fail
		  

	  String Actualtitle = "Mercury Tours";
	  String Expectedtitle = driver.getTitle();
	  System.out.println(Expectedtitle);
	  
	 
	  
	  //1st Statement 
		System.out.println("Welcome to selenium");
	  
		
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
