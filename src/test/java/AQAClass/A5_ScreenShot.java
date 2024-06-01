package AQAClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.hc.core5.http.nio.support.AsyncServerFilterChainExchangeHandlerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class A5_ScreenShot {
	public WebDriver driver;
	
	
  @Test
  public void ScreenShot() throws Exception {
	  
	//click on click me button
		 driver.findElement(By.id("alertButton")).click();
		 
		 String str = driver.switchTo().alert().getText();
		
		 System.out.println();
		 
		 Thread.sleep(3000);
		 
		 driver.switchTo().alert().accept();
		 
	
	  String Images = "alert";
	  
		File scrfiFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		org.openqa.selenium.io.FileHandler.copy(scrfiFile, new File("C:\\Users\\anush\\OneDrive\\Desktop\\Aneeksha"+Images+".png"));
		
 
}
  @BeforeTest
  public void beforeTest()  {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/alerts");
	  driver.manage().window().maximize();
	  
	  
	 // String Images = "openurl";
	  
		//File scrfiFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//org.openqa.selenium.io.FileHandler.copy(scrfiFile, new File("C:\\Users\\anush\\OneDrive\\Desktop\\Aneeksha"+Images+".png"));
		
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
