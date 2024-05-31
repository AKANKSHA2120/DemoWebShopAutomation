package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardsPage 
{
  //Add default constructor
	public GiftCardsPage()
	{
		
	}
	
	//Add Parameterized constructor
	public GiftCardsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Find the targeted element By using @FindBy annotation
	private @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	WebElement giftCardLink;
	
	private @FindBy(xpath="//input[@value='Add to cart']")
	WebElement addToCart;
	
	private @FindBy(id="giftcard_1_RecipientName")
	WebElement receiverNm;
	
	private @FindBy(id="giftcard_1_RecipientEmail")
	WebElement receiverEmail;
	
	private @FindBy(id="giftcard_1_SenderName")
	WebElement senderNm;
	
	private @FindBy(id="giftcard_1_SenderEmail")
	WebElement senderEmail;
	
	private @FindBy(id="giftcard_1_Message")
	WebElement message;
	
	private @FindBy(id="addtocart_1_EnteredQuantity")
	WebElement quantity;
	
	private @FindBy(id="add-to-cart-button-1")
	WebElement addToCartButton;
	
	
	//method
	public void clickLink()
	{
		giftCardLink.click();
	}
	
	public void clickAddToCart()
	{
		addToCart.click();
	}
	
	public void enterRecNm(String value)
	{
		receiverNm.clear();
		receiverNm.sendKeys(value);
	}
	
	public void enterRecEmail(String value)
	{
		receiverEmail.clear();
		receiverEmail.sendKeys(value);
	}
	
	public void enterSenNm(String value)
	{
		senderNm.clear();
		senderNm.sendKeys(value);
	}
	
	public void enterSendEmail(String value)
	{
		senderEmail.clear();
		senderEmail.sendKeys(value);
	}
	
	public void enterQuantity(String value)
	{
		quantity.clear();
		quantity.sendKeys(value);
	}
	
	public void clickAddButton()
	{
		addToCartButton.click();
	}
	
	
}
