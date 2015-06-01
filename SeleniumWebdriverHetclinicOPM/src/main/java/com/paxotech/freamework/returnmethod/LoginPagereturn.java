package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPagereturn extends PageBase{
	private WebElement EmailTextbox;
	private WebElement PasswordTextbox;
	private WebElement LoginButton;
	
	public WebElement username(String username){
		EmailTextbox=driver.findElement(By.name("j_username"));
		EmailTextbox.sendKeys(username);
		return EmailTextbox;
	}
	public WebElement password(String password){		
		PasswordTextbox=driver.findElement(By.name("j_password"));
		PasswordTextbox.sendKeys(password);
		return PasswordTextbox;	
	}

	public WebElement ShowLoginButton(){		
		LoginButton=driver.findElement(By.xpath("//*[@id='login']//input[@type='submit']"));
		return LoginButton;	
	}

	public LoginPagereturn(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

}
