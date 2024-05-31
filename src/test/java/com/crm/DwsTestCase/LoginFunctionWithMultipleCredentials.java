package com.crm.DwsTestCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClassUtility.BaseClass;
import com.crm.ExtendFileUtility.ExcelFileLogin;
import com.crm.PomFile.Login;

@Listeners(com.crm.ListenersClass.ExtendReport.class)
public class LoginFunctionWithMultipleCredentials extends BaseClass
{
	
   @Test(dataProvider = "login")
   public void loginCredential(String username,String password)
   {
	   //create object of login page model
	   Login l1 = new Login(driver);
	   
	   l1.logout();
	   
	   //click on login link
	   l1.loginLink1();
	   
	   //enter the value
	   l1.enterEmail(username);
	   l1.enterPassword(password);
	   
	   //click on remember me icon
	   l1.clickReme();
	   
	   //click on login button
	   l1.clickLogin();
   }
   @DataProvider(name="login")
   public Object[][] sender() throws EncryptedDocumentException, IOException
   {
	  //call the method dws Login
	   return ExcelFileLogin.webShopLogin();   
   }
   
    
}
