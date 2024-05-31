package com.crm.PomFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	//create default constructor
		public Login()
		{
			
		}
		
		//create parameterized constructor
		public Login(WebDriver driver)
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
		
		private @FindBy(xpath="//label[text()='Remember me?']")
		WebElement remember;
		
		private @FindBy(xpath="//a[text()='Forgot password?']")
		WebElement forgetPass;
		
		private @FindBy(xpath="//a[text()='Log out']")
		WebElement logout;
		
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
		
		public void clickReme()
		{
			remember.click();
		}
		
		public void forgetPas()
		{
			forgetPass.click();
		}
		
		public void logout()
		{
			logout.click();
		}
}
