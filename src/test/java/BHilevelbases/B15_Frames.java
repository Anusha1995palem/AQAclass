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

public class B15_Frames {
	
	public WebDriver driver;
	
	public Actions action;
	
  @Test
  public void f() {
	  
	// iframe concept
	  
	  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	  
	// Element which needs to drag.

	  WebElement DragFrom = driver.findElement(By.id("draggable"));
	  
	// Element which needs to drop.

	  WebElement Dragto = driver.findElement(By.id("droppable"));
	  
	// Using Action class for drag and drop.

	  action = new Actions(driver);
	  
	// Dragged and dropped.

	  action.dragAndDrop(DragFrom, Dragto).build().perform();
	  
	//Back to Out of the frame

	  driver.switchTo().parentFrame();
	  
	  driver.findElement(By.linkText("Demos")).click();
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
