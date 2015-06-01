package com.paxotech.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.model.LoginPageModel;

public class LoginPageController extends ControllerBase {
	
	private LoginPageModel loginPageModel;
	
	public LoginPageController(WebDriver driver) {
		super(driver);
		loginPageModel = new LoginPageModel(driver);
	}


	public void login(String userid, String password){
		loginPageModel.getEmailTextbox().sendKeys(userid);
		loginPageModel.getPasswordTextbox().sendKeys(password);
		loginPageModel.getLoginButton().click();
		delayFor(2000);
	}
	

}
