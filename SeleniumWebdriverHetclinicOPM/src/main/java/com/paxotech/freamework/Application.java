package com.paxotech.freamework;

import org.openqa.selenium.WebDriver;

public class Application {
private WebDriver driver;
	
	private HomePage homePage = null;
	private LoginPage loginPage = null;
	private RegstationPage regstationPage=null; 
	private BuyNowPage buyNowPage=null;
	private BuyNowmultiproduct buyNowmultiproduct=null;
	private BuySearchLink buySearchLink=null;
	private CreditCardanBillingAddress creditCardanBillingAddress=null;
	private TabnameArraySelectmanu tabnameArraySelectmanu= null;
		
	
		
	
	
	
	public Application(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public HomePage homePage(){
		if(homePage == null){
			homePage = new HomePage(driver);
		}
		
		return homePage;
	}
	
	public LoginPage loginPage(){
		if(loginPage == null){
			loginPage = new LoginPage(driver);
		}
		
		return loginPage;
	}
	public RegstationPage regstationPage(){
		if(regstationPage==null){
			regstationPage=new RegstationPage(driver);
		}
		return regstationPage;
	}
	public BuyNowPage buyNowPage(){
		if(buyNowPage==null){
			buyNowPage=new BuyNowPage(driver);
		}
		return buyNowPage;
	}
	public BuyNowmultiproduct buyNowmultiproduct(){
		if(buyNowmultiproduct==null){
			buyNowmultiproduct=new BuyNowmultiproduct(driver);
		}
		return buyNowmultiproduct;
	}
	public BuySearchLink buySearchLink(){
		if(buySearchLink==null){
			buySearchLink=new BuySearchLink(driver);
		}
		return buySearchLink;
	}
	public TabnameArraySelectmanu tabnameArraySelectmanu(){
		if(tabnameArraySelectmanu==null){
			tabnameArraySelectmanu=new TabnameArraySelectmanu(driver);
		}
		return tabnameArraySelectmanu;
	}

	public CreditCardanBillingAddress creditCardanBillingAddress(){
		if(creditCardanBillingAddress==null){
			creditCardanBillingAddress=new CreditCardanBillingAddress(driver);
		}
		return creditCardanBillingAddress;
	}
}
