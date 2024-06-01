package AQAClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A7_INR_optionsvalidation {
	public WebDriver driver;
	
	
  @Test
  public void options() {

	  List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions();
	  System.out.println(allvalues.get(3).getText());
	  
	// Print all values from A to Z(Starting to ending)
  
	  for (int i = 0; i < allvalues.size(); i++) {
		  System.out.println(allvalues.get(i).getText());
		  
		  
		  // Checking Comparision with equalIgnoreCase or
		  // Contains(ValidationProspective)

		if (allvalues.get(i).getText().equalsIgnoreCase("18")) {
			System.out.println("its matched passed");
			
		} 
		
		else {
			
			System.out.println("Not Matched");

		}
		  
	  }	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/reg/");
	  driver.manage().window().maximize();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
