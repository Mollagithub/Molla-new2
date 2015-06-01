package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckoutBillingandshiping extends PageBase{	
	private WebElement Checkout;
	private WebElement Edit;
	private WebElement FirstName;
	private WebElement LastName;
	private WebElement phone;
	private WebElement Adressone;
	private WebElement Adresstwo;
	private WebElement addcity;
	private WebElement addstate;
	private WebElement addspostcode;
	private WebElement addSave;
	private WebElement delevery;
	private WebElement Shipping;
	private WebElement usesameAddressinfo;
	

	
		
	
	public WebElement showcheckoutbutton(){
		Checkout=driver.findElement(By.xpath("//*[@id='checkout']/a"));
		Checkout.click();
		return Checkout;
	}
	public WebElement showEditButton(){
		Edit=driver.findElement(By.xpath("//*[@id='cartLink']"));
		Edit.click();
		return Edit;		
	}
	public WebElement Firstname(String addfirstname){
		FirstName=driver.findElement(By.name("address.firstName"));
		FirstName.sendKeys(addfirstname);
		return FirstName;		
	}
	public WebElement Lastname(String addlastname){
		LastName=driver.findElement(By.name("address.lastName"));
		LastName.sendKeys(addlastname);
		return LastName;		
	}
	public WebElement Phone(String addPhone){
		phone=driver.findElement(By.name("address.phonePrimary"));
		phone.sendKeys(addPhone);
		return phone;		
	}
	public WebElement Address1(String address1){
		Adressone=driver.findElement(By.name("address.addressLine1"));
		Adressone.sendKeys(address1);
		return Adressone;		
	}
	public WebElement Address2(String address2){
		Adresstwo=driver.findElement(By.name("address.addressLine1"));
		Adresstwo.sendKeys(address2);
		return Adresstwo;		
	}
	public WebElement Addcity(String city){
		addcity=driver.findElement(By.name("address.city"));
		addcity.sendKeys(city);
		return addcity;		
	}
	public WebElement Addstate(String State){
		addstate=driver.findElement(By.name("address.state"));
		addstate.sendKeys(State);
		return addstate;		
	}
	public WebElement Addpostcode(String postcode){
		addspostcode=driver.findElement(By.name("address.postalCode"));
		addspostcode.sendKeys(postcode);
		return addspostcode;		
	}
	public WebElement AddressSave(){
		addSave=driver.findElement(By.xpath("//*[@id='billing_info_form']/div[10]/input"));
		addSave.click();
		return addSave;	
	}
	public WebElement usesameShopinginfo(){
		usesameAddressinfo=driver.findElement(By.id("use_billing_address"));
		usesameAddressinfo.click();
		if(!driver.findElement(By.id("use_billing_address")).isSelected()){
			driver.findElement(By.id("use_billing_address")).click();
		}
		return usesameAddressinfo;
	}

	public WebElement AddShippingmethod(){
		delevery=driver.findElement(By.id("fulfillmentOptionId1"));
		delevery.click();
		return delevery;		
	}
	public WebElement AddselectShipping(){
		Shipping=driver.findElement(By.id("select_shipping"));
		Shipping.click();
		return Shipping;		
	}
		public CheckoutBillingandshiping(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

}
