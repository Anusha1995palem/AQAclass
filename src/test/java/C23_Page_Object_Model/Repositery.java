package C23_Page_Object_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Repositery {
	
public static WebDriver driver;

public static void login() {
	
	//driver.findElement(Locators.Username1).sendkeys(Testdata.Username1);
	//driver.findElement(Locators.password).sendkeys(Testdata.Password);
	//driver.findElements(Locators.login).click();
	
	driver.findElement(Locators.Username1).sendKeys(Testdata.Username1);
	driver.findElement(Locators.Password).sendKeys(Testdata.Password);
	driver.findElement(Locators.login).click();
}

@BeforeTest

public static void setup() {

	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(Testdata.url);
	driver.manage().window().maximize();
		
}	

@AfterTest
public static void aftertest() {
	
}
}
