package C25_Input_Output_Stream;

import java.io.FileInputStream;

import java.io.FileOutputStream;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Input_Output_Stream {
	
	public WebDriver driver;
	
	public String str;
	
  @Test
  public void Functionality() throws Exception {
	  
	  
	  //Read the data from the input file
	FileInputStream fi = new FileInputStream("C:\\Users\\anush\\OneDrive\\Desktop\\MTC_Input_Stream.xls");
	      Workbook w = Workbook.getWorkbook(fi);
	      Sheet s = w.getSheet("MTC");
	      
	 //create the result file under the result folder
	    FileOutputStream fo = new FileOutputStream("D:\\Mtcresults\\Resultoutput.xls");
	    WritableWorkbook wb = Workbook.createWorkbook(fo);
	    WritableSheet ws = wb.createSheet("Results", 0);
	    
	for (int i = 0; i < s.getRows(); i++) {
		
	//Enter user name,password and click on sign in by taking data from input file
		
		driver.findElement(By.name("username")).sendKeys(s.getCell(0, i).getContents());
		
		driver.findElement(By.name("password")).sendKeys(s.getCell(1, i).getContents());
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		
		// validate signout, if avilable asssign pass to str, else assign fail to str
		
		try {
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/p[1]")).click();
			
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[4]/a[1]")).click();
			  
			String str = "Pass";
			System.out.println(str);
			
			
			} catch (Exception e) {
			String str = "fail";
			System.out.println(str);
		}
		
		
	
	//Add str value to the result file under result column
	
	    
		jxl.write.Label result = new jxl.write.Label(2, i, str);
	    ws.addCell(result);
	    
	//Add input data to the result file
	    
	for (int j = 0; j < s.getColumns(); j++) {
		
		
		
		System.out.println(s.getCell(j, i).getContents());
		jxl.write.Label l = new jxl.write.Label(j, i, s.getCell(j, i).getContents());
		ws.addCell(l);
		
	}
		
	}
	
	
	
	//Add to the heading
	jxl.write.Label un = new jxl.write.Label(0,0,"username");
	
	jxl.write.Label pw = new jxl.write.Label(1,0,"Password");
	
	jxl.write.Label rs = new jxl.write.Label(2,0,"Results");
	
	ws.addCell(un);
	
	ws.addCell(pw);
	
	ws.addCell(rs);
	
	//write and close the result fail
	
	wb.write();
	wb.close();
	
	
	
	}
	

@BeforeTest

     public void beforetest() {
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
			
	}

@AfterTest

public void aftertest() {
	
	
}
     
}





