package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  //create default constructor
	public LoginPage()
	{
		
	}
	
	//create parameterized constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Find the targeted element
	private @FindBy(xpath="//a[text()='Log in']")
	WebElement loginLink;
	
	private @FindBy(id="Email")
	WebElement email;
	
	private @FindBy(id="Password")
	WebElement password;
	
	private @FindBy(xpath="//input[@value='Log in']")
	WebElement loginButton;
	
	//create methods
	public void loginLink1()
	{
		loginLink.click();
	}
	
	public void enterEmail(String value)
	{
		email.sendKeys(value);
	}
	
	public void enterPassword(String value)
	{
		password.sendKeys(value);
	}
	
	public void clickLogin()
	{
		loginButton.click();
	}
}
