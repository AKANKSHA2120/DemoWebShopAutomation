package WelcomePage;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.pom.WelcomePage;

import BaseClass.LoginBaseClass;

public class FollowUs extends LoginBaseClass
{
    @Test
    public void clickLink() throws InterruptedException
    {
    	//create object of welcome page
    	WelcomePage w1 = new WelcomePage(driver);
    	
    	//get parentWindowHandle
    	String parent = driver.getWindowHandle();
    	
    	w1.clickFacebook();
    	driver.switchTo().window(parent);
    	Thread.sleep(2000);
    	
    	w1.clickTwitter();
    	driver.switchTo().window(parent);
    	Thread.sleep(2000);
    	
    	w1.clickRss();
    	driver.switchTo().window(parent);
    	driver.navigate().back();
    	Thread.sleep(2000);
    	
    	w1.clickYoutube();
        driver.switchTo().window(parent);
    	Thread.sleep(2000);
    	
    	w1.clickGoogle();
    	driver.switchTo().window(parent);
    	Thread.sleep(2000);
    	 
    }
	
    
}
