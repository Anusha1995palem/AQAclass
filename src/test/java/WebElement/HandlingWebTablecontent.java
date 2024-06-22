package WebElement;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class HandlingWebTablecontent {
	
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  
 //driver.findElement(By.xpath("//tbody/tr[6]/td[1]/input[1]")).click();
	  
	  Thread.sleep(3000);
	  
	  //driver.findElement(By.xpath("//tbody/tr[6]/td[5]/a[1]")).click();
	  
	  
	  //Handling WebTable Elements	
	  
	  //Clicks on selenium Check box
	  driver.findElement(By.xpath("//td[text()='Selenium']//preceding-sibling::td//input")).click();
	  
	  Thread.sleep(3000);
	  
	  //Clicks on Know More Link
	  driver.findElement(By.xpath("//td[text()='Selenium']//following-sibling::td[3]//a")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		  driver.get("https://seleniumpractise.blogspot.com/2021/08/");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
