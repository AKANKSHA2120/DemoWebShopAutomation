package com.crm.pom;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage 
{
	//default constructor
	public WelcomePage()
	{
		
	}
	
	//create constructor
   public WelcomePage(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   //NavBar targeted element
   private @FindBy(xpath="(//a[contains(text(),'Books')])[1]")
   WebElement book;
   
   private @FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
   WebElement computer;
   
   private @FindBy(xpath="(//a[contains(text(),'Electronics')])[1]")
   WebElement electronics;
   
   private @FindBy(xpath="(//a[contains(text(),'Apparel & Shoes')])[1]")
   WebElement appareal_shoes;
   
   private @FindBy(xpath="(//a[contains(text(),'Digital downloads')])[1]")
   WebElement digitalDownload;
   
   private @FindBy(xpath="(//a[contains(text(),'Jewelry')])[1]")
   WebElement jewelry;
   
   private @FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
   WebElement giftCards;
   
   //method
   public void clickBook()
   {
	   book.click();
   }
   
   public void clickComputer()
   {
	   computer.click();
   }
   
   public void clickElectronics()
   {
	   electronics.click();
   }
   
   public void clickAppreal()
   {
	   appareal_shoes.click();
   }
   
   public void clickDigital()
   {
	   digitalDownload.click();
   }
   
   public void clickJewellary()
   {
	   jewelry.click();
   }
   
   public void clickGiftCard()
   {
	   giftCards.click();
   }
   
   
   //Search Bar
   private @FindBy(id="small-searchterms")
   WebElement search_bar;
   
   //search button
   private @FindBy(xpath="//input[@value='Search']")
   WebElement search_button;
   
   //method
   public void serachBar(String value)
   {
	   search_bar.sendKeys(value);
   }
   
   public void searchButtonClick()
   {
	   search_button.click();
   }
   
   //follow us link
   
   //Find the targeted element by using findElement method
    private @FindBy(xpath="//a[text()='Facebook']")
    WebElement facebook1;
    
    private @FindBy(xpath="//a[text()='Twitter']")
    WebElement twitter1;
    
    private @FindBy(xpath="//a[text()='RSS']")
    WebElement rss1;
    
    private @FindBy(xpath="//a[text()='YouTube']")
    WebElement youtube1;
    
    private @FindBy(xpath="//a[text()='Google+']")
    WebElement google1;
    
    //method 
    public void clickFacebook()
    {
    	facebook1.click();
    }
    
    public void clickTwitter()
    {
    	twitter1.click();
    }
    
    public void clickRss()
    {
    	rss1.click();
    }
    
    public void clickYoutube()
    {
    	youtube1.click();
    }
    
    public void clickGoogle()
    {
    	google1.click();
    }
    
    
    
    
    
   
}
