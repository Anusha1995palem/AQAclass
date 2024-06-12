package AQAClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(AQAClass.LisetnerClass.class)
public class LisetnerDemo {
	
	public WebDriver driver;
	
	
  @Test(priority=1)
  public void testpass() {
	  
	  System.out.println("Passed test case");
	  Assert.assertTrue(true);
	  }
	
  @Test(priority=2)
  public void testfailed() {
	  
	  System.out.println("Failed test case");
	  Assert.assertTrue(false);     
	  
  }
  
	
  @Test(priority=3)
  public void testskipped() {
	  
	  System.out.println("Skipped test case");
	  throw new SkipException("skip exception throw....");
	  
	  
}
}