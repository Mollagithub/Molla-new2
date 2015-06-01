package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.WebDriver;

import com.paxotech.freamework.BuyNowPage;
import com.paxotech.freamework.BuyNowmultiproduct;
import com.paxotech.freamework.BuySearchLink;
import com.paxotech.freamework.CreditCardanBillingAddress;
import com.paxotech.freamework.HomePage;
import com.paxotech.freamework.LoginPage;
import com.paxotech.freamework.RegstationPage;
import com.paxotech.freamework.TabnameArraySelectmanu;

public class Applicationreturn {
	
		private WebDriver driver;
			
			private HomePagereturn homePagereturn = null;
			private LoginPagereturn loginPagereturn = null;
			private RegistrationPagereturn registrationPage=null;
			private BuyNowbyPuroducetName buyNowbyPuroducetName=null;
			private Merchander merchander=null;
			private ShoopingCart shoopingCart=null;
			//private CreditCardanBillingAddress creditCardanBillingAddress=null;			
			private Assertions assertions= null;
			private CheckoutBillingandshiping checkout=null;
			private CreditCardinfo credCard=null;

			
			public Applicationreturn(WebDriver driver) {
				this.driver = driver;
			}
			
			
			public HomePagereturn homePagereturn(){
				if(homePagereturn == null){
					homePagereturn = new HomePagereturn(driver);
				}
				
				return homePagereturn;
			}
			
			public LoginPagereturn loginPagereturn(){
				if(loginPagereturn == null){
					loginPagereturn = new LoginPagereturn(driver);
				}
				
				return loginPagereturn;
			}
			public RegistrationPagereturn registrationPage(){
				if(registrationPage==null){
					registrationPage=new RegistrationPagereturn(driver);
				}
				return registrationPage;
			}
			public BuyNowbyPuroducetName buyNowbyPuroducetName(){
				if(buyNowbyPuroducetName==null){
					buyNowbyPuroducetName=new BuyNowbyPuroducetName(driver);
				}
				return buyNowbyPuroducetName;
			}
			public Merchander merchander(){
				if(merchander==null){
					merchander=new Merchander(driver);
				}
				return merchander;
			}
			public ShoopingCart shoopingCart(){
				if(shoopingCart==null){
					shoopingCart=new ShoopingCart(driver);
				}
				return shoopingCart;
			}
			public Assertions assertions(){
				if(assertions==null){
					assertions=new Assertions(driver);
				}
				return assertions;
			}
			public CheckoutBillingandshiping checkout(){
				if(checkout==null){
					checkout=new CheckoutBillingandshiping(driver);					
				}
				return checkout;
				
			}
			public CreditCardinfo CreditCard(){
				if(credCard==null){
					credCard=new CreditCardinfo(driver);					
				}
				return credCard;
			}

	
}
