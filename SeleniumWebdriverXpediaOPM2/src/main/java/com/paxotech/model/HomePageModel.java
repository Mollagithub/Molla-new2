package com.paxotech.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageModel extends ModelBase{

	@FindBy(how=How.ID, using="header-account-menu")
	private WebElement loginLink;
	@FindBy(how=How.ID,using="header-account-signin")
	public WebElement siginLink; 
	@FindBy(how = How.NAME,using = "q")
	private WebElement searchTextbox;
	
	@FindBy(how = How.ID,using = "header-account-menu")
	private WebElement userName;
	@FindBy(how=How.XPATH,using="//*[@id='tab-hotel-tab']/span[3]")
	public WebElement hotelticik;

	
	public HomePageModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);

	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}

	public WebElement getUserName() {
		return userName;
	}
	public void showhotelTicket(){
		hotelticik.click();
	}

	

}
