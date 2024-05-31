package AddToCartPage;

import org.testng.annotations.Test;

import com.crm.pom.AddToCartPage;

import BaseClass.LoginBaseClass;
import BaseClass.OpenWebShopClass;

public class AddToCartForm extends LoginBaseClass
{
  @Test()
  public void addToCart() throws InterruptedException
  {
	  //create object of addtocart page model
	  AddToCartPage add = new AddToCartPage(driver);
	  
	  //call all method
	  add.clickDigital();
	  add.addCart1();
	  Thread.sleep(2000);
	  add.addCart2();
	  Thread.sleep(2000);
	  add.addCart3();
  }
}
