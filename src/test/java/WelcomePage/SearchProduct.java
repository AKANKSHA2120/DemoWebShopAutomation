package WelcomePage;

import org.testng.annotations.Test;

import com.crm.pom.WelcomePage;

import BaseClass.OpenWebShopClass;

public class SearchProduct extends OpenWebShopClass
{
  @Test
  public void search() throws InterruptedException
  {
	  //create object of WelcomePage
	  WelcomePage w1 = new WelcomePage(driver);
	  
	  //call the method
	  w1.serachBar("Believe");
	  Thread.sleep(2000);
	  
	  w1.searchButtonClick();
  }
}
