package com.paxotech.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageModel extends ModelBase {


	@FindBy(how = How.NAME, using = "signin-loginid") 
	private WebElement emailTextbox;
	
	
	@FindBy(how = How.NAME, using = "signin-password") 
	private WebElement passwordTextbox;
	 
	private WebElement loginButton ;
	
	
	public LoginPageModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}


	public WebElement getEmailTextbox() {
		return emailTextbox;
	}


	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}


	public WebElement getLoginButton() {
		loginButton = waitForElementDisplayed(By.xpath("//*[@id='submitButton']"), 60);
		if (loginButton == null){
			throw new RuntimeException("Sorry Sigin button is not found");
		}
		
		return loginButton;
	}

	
	

}
