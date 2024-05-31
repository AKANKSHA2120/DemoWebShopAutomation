package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

 

import ReadData.ReadPropertyFile1;

public class LoginBaseClass 
{
	 public WebDriver driver;
	 
	  @BeforeSuite
	  public void beforeSuite()
	  {
		   System.out.println("Connecting to Database");
	  }
	  @BeforeTest
	  public void beforeTest() throws EncryptedDocumentException, IOException
	  {
		   System.out.println("Precondition for Test Runner");
	  }
	  @BeforeClass
	  public void beforeClass() throws IOException
	  {
		  String browser1 = ReadPropertyFile1.propertyFile("browser");
		  
		   //Launch the browser
		    if("chrome".equalsIgnoreCase(browser1))
			  {
				  driver = new ChromeDriver();
			  }
			  else if("Firefox".equalsIgnoreCase(browser1))
			  {
				  driver = new FirefoxDriver();
			  }
			  else
			  {
				  driver = new EdgeDriver();
			  }
		   
		   //maximize the screen
		   driver.manage().window().maximize();
		   
		   //implicit wait
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		   
		   //navigate to url
		   String url1 = ReadPropertyFile1.propertyFile("url");
		   driver.get(url1);   
	  }
	  @BeforeMethod
	  public void beforeMethod() throws IOException
	  {
		  String username1 = ReadPropertyFile1.propertyFile("email");
		  
		  String password1 = ReadPropertyFile1.propertyFile("password");
		  
		   //click on login 
		   driver.findElement(By.xpath("//a[text()='Log in']")).click();
		   
		   //enter the username
		   driver.findElement(By.id("Email")).sendKeys(username1);
		   
		   //enter the password
		   driver.findElement(By.id("Password")).sendKeys(password1);
		   
		   //click on login button
		   driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  }
	  @AfterMethod
	  public void afterMethod()
	  {
		  //click on logout button
		  driver.findElement(By.xpath("//a[text()='Log out']")).click();
	  }
	  @AfterClass
	  public void afterClass()
	  {
		   //close the browser
		   driver.close();
	  }
	  @AfterTest
	  public void afterTest()
	  {
		   System.out.println("PostCondition for Test Runner");
	  }
	  @AfterSuite
	  public void afterSuite()
	  {
		   System.out.println("Disconnecting to Database");
	  }	  
}
