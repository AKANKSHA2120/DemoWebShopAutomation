package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
  //create default constructor
	public RegisterPage()
	{
		
	}
	
	//Create parmeterized constructor
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Find the all targeted element by using @FindBy annotation
	
	private @FindBy(xpath="//a[text()='Register']")
	WebElement registerLink;
	
	private @FindBy(id="gender-female")
	WebElement gender;
	
	private @FindBy(id="FirstName")
	WebElement firstName;
	
	private @FindBy(id="LastName")
	WebElement lastName;
	
	private @FindBy(id="Email")
	WebElement email;
	
	private @FindBy(id="Password")
	WebElement password;
	
	private @FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	private @FindBy(id="register-button")
	WebElement registerButton;
	
	
	//all methods
	
	public void registerLink()
	{
		registerLink.click();
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	public void enterFirstNm(String value)
	{
		firstName.sendKeys(value);
	}
	
	public void enterlaststNm(String value)
	{
		lastName.sendKeys(value);
	}
	
	public void enteremail(String value)
	{
		email.sendKeys(value);
	}
	
	public void password1(String value)
	{
		password.sendKeys(value);
	}
	
	public void confirmPassword1(String value)
	{
		confirmPassword.sendKeys(value);
	}
	
	public void clickRegister()
	{
		registerButton.click();
	}
	
	
	
}
