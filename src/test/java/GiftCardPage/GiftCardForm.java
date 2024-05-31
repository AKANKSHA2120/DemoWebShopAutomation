package GiftCardPage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.crm.pom.GiftCardsPage;

import BaseClass.LoginBaseClass;

public class GiftCardForm extends LoginBaseClass
{
	@Parameters({"receiverName","receiverEmail","senderName","senderEmail","quantity"})
  @Test
  public void giftCard(String receiverName,String receiverEmail,String senderName,String senderEmail,String quantity) throws InterruptedException
  {
	  //create object gift card page model
		GiftCardsPage g1 = new GiftCardsPage(driver);
		
		//call all method
		g1.clickLink();
		
		g1.clickAddToCart();
		Thread.sleep(2000);
		
		g1.enterRecNm(receiverName);
		g1.enterRecEmail(receiverEmail);
		g1.enterSenNm(senderName);
		g1.enterSendEmail(senderEmail);
		g1.enterQuantity(quantity);
		
		Thread.sleep(2000);
		
		g1.clickAddButton();
		
  }
}
