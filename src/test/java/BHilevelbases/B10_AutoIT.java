package BHilevelbases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

public class B10_AutoIT {
	
	public WebDriver driver;
	
	
	
  @Test
  public void operation() {
	  
	  WebElement ele1 = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	  
	  ele1.sendKeys("C:\\Users\\anush\\OneDrive\\Desktop\\Anuusa.exe");
	  
	  
	  
  }
  
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
	  
  }
  
  

}
