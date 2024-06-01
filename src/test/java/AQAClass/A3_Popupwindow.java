package AQAClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class A3_Popupwindow {
	public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	// Clicks on Separate windows
	  driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	  
	  //click button
	  
	 driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	 
	 //come back to Parent window handle
      
	 String backtoparentwindow = driver.getWindowHandle();
	 
	//handling Child window 
	 
	 for(String childWindowHandle : driver.getWindowHandles() ) {
		 
	 }
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(3000);
	 
	// Again Switch focus back to Parent window
	 
	 driver.switchTo().window(backtoparentwindow);
	 
	 Thread.sleep(10000);
	 
	// Clicks on Home_Button
	 driver.findElement(By.linkText("Home")).click();
	 
	 Thread.sleep(3000);
	   
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  	  
  }

  @AfterTest
  public void afterTest() {
  }

}
