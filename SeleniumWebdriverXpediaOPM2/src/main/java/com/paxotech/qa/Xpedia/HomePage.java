package com.paxotech.qa.Xpedia;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase{
	private WebDriver driver=null;
	
		
	/*@FindBy(how=How.XPATH,using="//*[@id='join-rewards-close-btn']")
	private WebElement popup;*/
	@FindBy(how=How.ID,using="header-account-menu")
	private WebElement Accoutninfo;
	@FindBy(how=How.ID,using="header-account-register")
	private WebElement createAccoutlink;
	@FindBy(how=How.ID,using="header-account-signin")
	public WebElement siginLink; 
	@FindBy(how=How.XPATH,using="//*[@id='tab-hotel-tab']/span[3]")
	public WebElement hotelticik;
	@FindBy(how=How.XPATH,using="//*[@id='tab-package-tab']/span[3]/span[2]")
	public WebElement hotelflight;

	
	
	public HomePage(WebDriver driver){
		super(driver);
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
		
		
	}
	/*public void popUp(){
		popup.click();
	}*/
	public void showAccountinfopage(){
		this.Accoutninfo.click();
		this.createAccoutlink.click();
		this.siginLink.click();
		this.hotelticik.click();
	}
	/*public void ShowCrateAcctpage(){
		createAccoutlink.click();
	}
	public void showsiginLink(){
		siginLink.click();
	}
		public void showhotelTicket(){
		hotelticik.click();
	}
*/	
	
	public void varification(String Name){
		
		 WebElement logoname=driver.findElement(By.id("header-logo"));
		String Text=logoname.getText();
		System.out.println(logoname);
		Assert.assertEquals(Text, Name);
		}
	public void verification1(String msgs){
		String titel= driver.getTitle();
		System.out.println(titel);
		Assert.assertEquals(msgs, titel);
	}

	
	
	
		
	
	
	

}
