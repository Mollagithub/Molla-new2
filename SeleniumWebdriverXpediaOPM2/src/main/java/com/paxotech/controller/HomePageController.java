package com.paxotech.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.openqa.selenium.WebDriver;

import com.paxotech.model.HomePageModel;

public class HomePageController extends ControllerBase{

	private HomePageModel homePageModel;
	
	public HomePageController(WebDriver driver) {
		super(driver);
		homePageModel = new HomePageModel(driver);
	}

	
	public void showLoginPage(){
		homePageModel.getLoginLink().click();
	}
	
	
	public void verifyUserName(String name){
		 
		 String text = homePageModel.getUserName().getText();
		 
		 assertThat(text, is(equalTo(name)));
		 	 
	}
	
	
	public void search(String textToSearch){
		homePageModel.getSearchTextbox().clear();
		homePageModel.getSearchTextbox().sendKeys(textToSearch);
	}
	

}
