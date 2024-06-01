package AQAClass;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class A9_Enhancing_StudentQAForm {
	public WebDriver driver;
	
  @Test
  public void registerform() throws Exception  {
	  
	  //firstname
	  driver.findElement(By.id("firstName")).sendKeys("Anusha");
	  //lastname
	  driver.findElement(By.id("lastName")).sendKeys("palem");
      //email
	  driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("anushareddypalem@gnail.com");
	  //gender
	  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")).click();
	  //mobilenumber
	  driver.findElement(By.id("userNumber")).sendKeys("9000828656");
	  //DOB
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  //month
	new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("December");
	//year
	new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1995");
	//day
	driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[2]")).click();
	//subjects
	driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
	driver.findElement(By.id("subjectsInput")).sendKeys(Keys.ENTER);
	
	  
	  //Submit
	  driver.findElement(By.id("submit")).click();	
	  Thread.sleep(3000);
	  Thread.sleep(3000);
			
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
