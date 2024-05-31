package com.crm.DwsTestCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClassUtility.BaseClass;
import com.crm.ExtendFileUtility.ExcelFile;
import com.crm.PomFile.GiftCart;

@Listeners(com.crm.ListenersClass.ExtendReport.class)
public class VerifyGiftCard extends BaseClass
{
  @Test
  public void read() throws EncryptedDocumentException, IOException  
  {
	   //create object of GiftCart page model
	    GiftCart g1 = new GiftCart(driver);
	    
	    //click on giftCart link
	    g1.clickLink();
	    
	    //Click on add to cart button
	    g1.clickAddToCart();
	    
	    //verify by using webElement
	    WebElement addToCart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
	    
	    Assert.assertTrue(addToCart.isDisplayed());
	    
	    //enter the value
	    ExcelFile.readDataExcel();
	    
	    g1.enterRecNm(ExcelFile.recName);
	    g1.enterRecEmail(ExcelFile.recEmail);
	    g1.enterSenNm(ExcelFile.senName);
	    g1.enterSendEmail(ExcelFile.senEmail);
	    g1.enterMessage(ExcelFile.message);
	    g1.enterQuantity(ExcelFile.quantity);
	    
	    //click on add to cart button
	    g1.clickAddButton();
	    
	    //click on shopping cart
	    g1.shoppingCart();
	    
	    //verify product is present or not
	    WebElement gift = driver.findElement(By.xpath("(//a[text()='$5 Virtual Gift Card'])[2]"));
	    
	    Assert.assertTrue(gift.isDisplayed());
	    
	    System.out.println("$5 gift is present in cart");
	    
	    
	    
	    
  }
}
