package com.crm.DwsTestCase;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClassUtility.BaseClass;
import com.crm.ExtendFileUtility.ExcelFileTwitter;
import com.crm.ExtendFileUtility.PropertyFile;
import com.crm.PomFile.WelcomePage;

@Listeners(com.crm.ListenersClass.ExtendReport.class)
public class TwitterPage extends BaseClass
{
  @Test 
  public void twitter() throws IOException, InterruptedException
  {
	  //verify page by using url
	  String givenData = PropertyFile.propertyFile("url");
	  String currentData = driver.getCurrentUrl();
	  
	  Assert.assertEquals(currentData, givenData);
	  System.out.println("Control present in demoWebShop page");
	  
	  //get current window handle
	  String parent = driver.getWindowHandle();
	  
	  //scroll down
	  Actions act = new Actions(driver);
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  
	  //create object of Welcome Page
	  WelcomePage w1 = new WelcomePage(driver);
	  
	  Thread.sleep(2000);
	  
	  //click on twitter link
	  w1.clickTwitter();
	  
	  //get current window handle
	  Set<String> child = driver.getWindowHandles();
	  child.remove(parent);
	  
	  for (String str : child) 
	  {
		driver.switchTo().window(str);
	  }
	  
	  //add explicit wait
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create account']")));
	  
	  //click on create account button
	  driver.findElement(By.xpath("//span[text()='Create account']")).click();
	  
	  ExcelFileTwitter.readDataExcel();
	  //enter the name
	  driver.findElement(By.xpath("//input[@name='name']")).sendKeys(ExcelFileTwitter.name);
	  
	  //click on email link
	  driver.findElement(By.xpath("//span[text()='Use email instead']")).click();
	  Thread.sleep(2000);
	  
	  //enter the email
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys(ExcelFileTwitter.email);
	  
	  //scroll down
	  act.keyDown(Keys.PAGE_DOWN).build().perform();
	  
	  //month
	  WebElement month = driver.findElement(By.id("SELECTOR_1"));
	  
	  //Create object of Select class
	  Select s1 = new Select(month);
	  s1.selectByVisibleText("February");
	  
	  //day
	  WebElement day = driver.findElement(By.id("SELECTOR_2"));
	  
	  Select s2 = new Select(day);
	  s2.selectByVisibleText("26");
	  
	  //year
	  WebElement year = driver.findElement(By.id("SELECTOR_3"));
	  
	  Select s3 = new Select(year);
	  s3.selectByVisibleText("1996");
	  
	  driver.close();
	  
	  //back control to dws web Page
	  driver.switchTo().window(parent);
	   
  }
}
