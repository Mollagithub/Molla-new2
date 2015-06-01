package com.paxotech.freamework;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {
	@FindBy(how = How.NAME, using = "j_username")
	private WebElement emailTextbox;

	@FindBy(how = How.NAME, using = "j_password")
	private WebElement passwordTextbox;

	@FindBy(how = How.XPATH, using = "//*[@id='login']/div/form/div[3]/input")
	private WebElement loginButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void login(String userid, String password) {
		this.emailTextbox.sendKeys(userid);
		this.passwordTextbox.sendKeys(password);
		this.loginButton.click();
	}

	
}
