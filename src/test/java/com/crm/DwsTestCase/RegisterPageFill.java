package com.crm.DwsTestCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClassUtility.BaseClass;
import com.crm.ExtendFileUtility.ExcelFileRegister;
import com.crm.PomFile.Register;

@Listeners(com.crm.ListenersClass.ExtendReport.class)
public class RegisterPageFill extends BaseClass
{
  @Test
  public void register() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  //log out
	  driver.findElement(By.xpath("//a[text()='Log out']")).click();
	  Thread.sleep(2000);
	  //create object register page model
	  Register r1 = new Register(driver);
	  
	  //click on register link
	  r1.registerLink();;
	  
	  ExcelFileRegister.readDataExcel();
	  //enter value
	  r1.selectGender();
	  r1.enterFirstNm(ExcelFileRegister.name);
	  r1.enterlaststNm(ExcelFileRegister.lasNam);
	  r1.enteremail(ExcelFileRegister.email);
	  r1.password1(ExcelFileRegister.pass);
	  r1.confirmPassword1(ExcelFileRegister.conPass);
	  
	  //click on register button
	  r1.clickRegister();
	  
  }
}
