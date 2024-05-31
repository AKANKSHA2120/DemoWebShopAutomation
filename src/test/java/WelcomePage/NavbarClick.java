package WelcomePage;

import org.testng.annotations.Test;

import com.crm.pom.WelcomePage;

import BaseClass.OpenWebShopClass;

public class NavbarClick extends OpenWebShopClass
{
    @Test
    public void clickOn()
    {
    	//create object of Welcome page
    	WelcomePage w1 = new WelcomePage(driver);
    	
    	//call all method
    	w1.clickBook();
    	w1.clickComputer();
    	w1.clickElectronics();
    	w1.clickAppreal();
    	w1.clickDigital();
    	w1.clickJewellary();
    	w1.clickGiftCard();
    }
}
