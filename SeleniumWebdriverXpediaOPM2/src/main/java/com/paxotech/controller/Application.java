package com.paxotech.controller;

import org.openqa.selenium.WebDriver;

import com.paxotech.qa.Xpedia.HotelandTicket;

public class Application {

	private WebDriver driver;
	
	private HomePageController homePage = null;
	private LoginPageController loginPage = null;
	private HotelandTicket hotelandTicket=null;
	
	public Application(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public HomePageController homePage(){
		if(homePage == null){
			homePage = new HomePageController(driver);
		}
		
		return homePage;
	}
	
	public LoginPageController loginPage(){
		if(loginPage == null){
			loginPage = new LoginPageController(driver);
		}
		
		return loginPage;
	}
	public HotelandTicket hotetTicket(){
		if(hotelandTicket==null){
			hotelandTicket=new HotelandTicket(driver);
		}
		return hotelandTicket;
	}
	

}
