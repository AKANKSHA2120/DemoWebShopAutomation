package RegisterPage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.pom.RegisterPage;

import BaseClass.OpenWebShopClass;

public class RegisterForm extends OpenWebShopClass
{
	@Parameters({"firstName","lastName","email","password","conPassword"})
   @Test
   public void register(String firstName,String lastName,String email,String password,String conPassword)
   {
	   //create object of register page model
	   RegisterPage rp = new RegisterPage(driver);
	   
	   //click on register link
	   rp.registerLink();
	   
	   //call all method
	   rp.selectGender();
	   rp.enterFirstNm(firstName);
	   rp.enterlaststNm(lastName);
	   rp.enteremail(email);
	   rp.password1(password);
	   rp.confirmPassword1(conPassword);
	   rp.clickRegister();
   }
}
