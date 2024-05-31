package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage 
{
  //create default constructor
	public AddToCartPage()
	{
		
	}
	
	//create parameterized constructor
	public AddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Find all targeted elements by using @FindBy annotation
	private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
	WebElement digitalLink;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement addToCart1;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[2]")
	WebElement addToCart2;
	
	private @FindBy(xpath="(//input[@value='Add to cart'])[3]")
	WebElement addToCart3;
	
	//method
	
	public void clickDigital()
	{
		digitalLink.click();
	}
	
	public void addCart1()
	{
		addToCart1.click();
	}
	
	public void addCart2()
	{
		addToCart2.click();
	}
	
	public void addCart3()
	{
		addToCart3.click();
	}
	
	
}
