package com.crm.PomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddToCart 
{
	//create default constructor
		public AddToCart()
		{
			
		}
		
		//create parameterized constructor
		public AddToCart(WebDriver driver)
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
		
		private @FindBy(id="products-orderby")
		WebElement sortBy;
		
		private @FindBy(id="products-pagesize")
		WebElement display;
		
		private @FindBy(id="products-viewmode")
		WebElement viewAs;
		
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
		
		public void selectSort()
		{
			Select s = new Select(sortBy);
			s.selectByVisibleText("Name: A to Z");
		}
		
		public void selectDisplay()
		{
			Select s = new Select(display);
			s.selectByIndex(1);
		}
		
		public void selectView()
		{
			Select s = new Select(viewAs);
			s.selectByVisibleText("Grid");
		}
		
}
