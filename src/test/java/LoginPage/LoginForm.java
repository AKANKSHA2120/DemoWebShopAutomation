package LoginPage;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.pom.LoginPage;

import BaseClass.OpenWebShopClass;
import ReadData.ReadPropertyLogin;

public class LoginForm extends OpenWebShopClass
{
  @Test
  public void login() throws IOException
  {
	  //Get the data form property file
	  String email = ReadPropertyLogin.propertyFile("email");
	  String password = ReadPropertyLogin.propertyFile("password");
	  
	  //create object of LoginPageModel
	  LoginPage l1 = new LoginPage(driver);
	  
	  //call all the method
	  l1.loginLink1();
	  l1.enterEmail(email);
	  l1.enterPassword(password);
	  l1.clickLogin();
	  
  }
}
