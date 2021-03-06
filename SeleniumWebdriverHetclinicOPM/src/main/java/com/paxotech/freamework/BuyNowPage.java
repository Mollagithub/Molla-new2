package com.paxotech.freamework;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuyNowPage extends PageBase{
	@FindBy(how=How.XPATH,using="//*[@id='products']/li[1]/div[3]/div[2]/form/input[4]")
	WebElement buynowButton;
	@FindBy(how=How.ID,using="cartLink")
	WebElement items;
	@FindBy(how=How.XPATH,using="//*[@id='checkout']/a")
	WebElement Checkout;
	@FindBy(how=How.NAME,using="address.firstName")
	WebElement Firstname;
	@FindBy(how=How.NAME,using="address.lastName")
	WebElement lastName;
	@FindBy(how=How.NAME,using="address.phonePrimary")
	WebElement Phone;
	@FindBy(how=How.NAME,using="address.addressLine1")
	WebElement Address1;
	@FindBy(how=How.NAME,using="address.addressLine2")
	WebElement Address2;
	@FindBy(how=How.NAME,using="address.city")
	WebElement city;
	@FindBy(how=How.NAME,using="address.state")
	WebElement state;
	@FindBy(how=How.NAME,using="address.postalCode")
	WebElement Postcode;
	@FindBy(how=How.XPATH,using="//*[@id='billing_info_form']/div[10]/input")
	WebElement save;
	@FindBy(how=How.ID,using="fulfillmentOptionId1")
	WebElement delivery;
	@FindBy(how=How.ID,using="select_shipping")
	WebElement Shipping;	
	@FindBy(how=How.NAME,using="CREDIT_CARD_NUMBER")
	WebElement CCnomber;
	@FindBy(how=How.NAME,using="CREDIT_CARD_CVV")
	WebElement CCVrfNomber;
	@FindBy(how=How.ID,using="nameOnCard")
	WebElement Crdholdername;
	@FindBy(how=How.NAME,using="CREDIT_CARD_EXP_DATE")
	WebElement Expdate;
	@FindBy(how=How.ID,using="paymentMethod_cod")
	WebElement deliveryRadiobtn;
	@FindBy(how=How.XPATH,using="//*[@id='complete_checkout']/input[1]")
	WebElement conpleteheckout;

		public void buynowlink(){
		this.buynowButton.click();
			}
	
		public void showitems(){
			JavascriptExecutor light = (JavascriptExecutor) driver;
			light.executeScript("arguments[0].setAttribute('style', arguments[1])",
					items, "color: yellow;  border: 4px solid blue;");

		this.items.click();
		
	}
		public void showcheckout(){
			JavascriptExecutor light = (JavascriptExecutor) driver;
			light.executeScript("arguments[0].setAttribute('style', arguments[1])",
					Checkout, "color: yellow;  border: 4px solid blue;");

			this.Checkout.click();
			
		}
		public void addShoppinginfo(String Fname,String Lname,String Phone,
				String address1,String address2,String city,String state,String postcode){
			this.Firstname.sendKeys(Fname);
			this.lastName.sendKeys(Lname);
			this.Address1.sendKeys(address1);
			this.Address2.sendKeys(address2);
			this.city.sendKeys(city);
			this.state.sendKeys(state);
			this.Postcode.sendKeys(postcode);
			JavascriptExecutor light = (JavascriptExecutor) driver;
			light.executeScript("arguments[0].setAttribute('style', arguments[1])",
					save, "color: yellow;  border: 4px solid blue;");
			this.save.click();
		}
		public void Shopinginfo(){
			WebElement usesameinfo=driver.findElement(By.id("use_billing_address"));
			usesameinfo.click();
			if(!driver.findElement(By.id("use_billing_address")).isSelected()){
				driver.findElement(By.id("use_billing_address")).click();
			}
		}
		public void showCreditcardinfo(String creditcnom,String Cverifinom,String CardholderName,String crexpDate){
			this.delivery.click();
			this.Shipping.click();
			this.CCnomber.sendKeys(creditcnom);
			this.CCVrfNomber.sendKeys(Cverifinom);
			this.Crdholdername.sendKeys(CardholderName);
			this.Expdate.sendKeys(crexpDate);
			this.deliveryRadiobtn.click();
			JavascriptExecutor light = (JavascriptExecutor) driver;
			light.executeScript("arguments[0].setAttribute('style', arguments[1])",
					conpleteheckout, "color: yellow;  border: 4px solid blue;");
			
			this.conpleteheckout.click();
			
			
			
		}
	

	public BuyNowPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
		

}
