package com.paxotech.qa.returnmethod;

import org.junit.Test;

import com.paxotech.freamework.returnmethod.ScriptsBasereturn;

public class TestScriptmethod extends ScriptsBasereturn{
	
	@Test
	public void test1() {
		heatclinicreturn().homePagereturn().showRegistratonlink();
		heatclinicreturn().registrationPage().emailBox("molla1@yahoo.com");
		heatclinicreturn().registrationPage().firstNameBox("Arif");
		heatclinicreturn().registrationPage().lastNameBox("Molla");
		heatclinicreturn().registrationPage().passwordBox("molla1234");
		heatclinicreturn().registrationPage().conPasswordBox("molla1234");
		//heatclinicreturn().registrationPage().registerButton().click();
	}
	@Test
	public void test2(){
		heatclinicreturn().homePagereturn().showloginlink();
		heatclinicreturn().loginPagereturn().username("arif_s211@yahoo.com");
		heatclinicreturn().loginPagereturn().password("molla1234");
		//heatclinicreturn().assertions().veryfiloginusername("Molla");
		heatclinicreturn().loginPagereturn().ShowLoginButton().click();
		heatclinicreturn().assertions().verifyErrormsg("The e-mail address and/or password entered do not match our records. Please try again");
	}
	@Test
	public void test3(){
		heatclinicreturn().homePagereturn().showbuynowHome("Home");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Dead Scotch").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Hot Sauce").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Armageddon").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Blackening Sauce").click();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().assertions().verifyShoppingTax("Subtotal does not yet include applicable tax or shipping and handling charges");
		heatclinicreturn().assertions().verifyShopignTag("ITEM", "QUANTITY", "PRICE","TOTAL SAVINGS", "TOTAL");
		heatclinicreturn().assertions().verifyPromocodeErmsg("");
		heatclinicreturn().shoopingCart().showPromocode("123456789");
		heatclinicreturn().shoopingCart().showPromo();
		heatclinicreturn().shoopingCart().showRemove();
		//heatclinicreturn().assertions().veryfisubtotal("$22.97");
		//heatclinicreturn().shoopingCart().showQunt("2");
		heatclinicreturn().shoopingCart().showupdated();
		heatclinicreturn().shoopingCart().showcontinueshoping();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Dead Scotch").click();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().assertions().veryfisubtotal("$29.96");
		heatclinicreturn().checkout().showcheckoutbutton();
		heatclinicreturn().checkout().showEditButton();
		System.out.println("Editnow");
		heatclinicreturn().checkout().showcheckoutbutton();
		System.out.println("Checkout");
		heatclinicreturn().assertions().showcrMsgs("Checkout as guest by filling in an email or log in to your account. You can also register a new account.");


		



	}
	@Test
	public void test4(){
		heatclinicreturn().homePagereturn().showbuynowHome("Hot Sauces");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Sweet Death Sauce").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Dead Habanero").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Bonnet Hot Sauce").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Roasted").click();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().assertions().verifyPromocodeErmsg("");
		heatclinicreturn().assertions().veryfisubtotal("$30.96");
		heatclinicreturn().checkout().showcheckoutbutton();
		heatclinicreturn().checkout().showEditButton();
		heatclinicreturn().shoopingCart().showRemove();
		heatclinicreturn().shoopingCart().showcontinueshoping();
		heatclinicreturn().homePagereturn().showbuynowHome("Hot Sauces");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Bull Snort Smokin' Toncils Hot Sauce").click();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().checkout().showcheckoutbutton();
		heatclinicreturn().assertions().showcrMsgs("Checkout as guest by filling in an email or log in to your account. You can also register a new account.");
		heatclinicreturn().assertions().showordersummry("Subtotal");
		heatclinicreturn().assertions().showsmarytgname("$23.96");
		
		

		
	}
	@Test
	public void test5(){
		heatclinicreturn().homePagereturn().showbuynowHome("Merchandise");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Hawt Like a Habanero Shirt (Women's)").click();
		heatclinicreturn().merchander().showclour("Black");
		heatclinicreturn().merchander().showsize("M");
		heatclinicreturn().buyNowbyPuroducetName().showbuynow();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Heat Clinic Mascot (Women's)").click();
		heatclinicreturn().merchander().showclour("Red");
		heatclinicreturn().merchander().showsize("M");
		heatclinicreturn().buyNowbyPuroducetName().showbuynow();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Day of the Dead Chipotle Hot Sauce").click();	
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Hawt Like a Habanero Shirt (Men's)").click();
		heatclinicreturn().merchander().showclour("Red");
		heatclinicreturn().merchander().showsize("M");
	    heatclinicreturn().merchander().showname("molla");
		heatclinicreturn().buyNowbyPuroducetName().showbuynow();
		heatclinicreturn().shoopingCart().showitem();

	}
	@Test
	public void test6(){
		heatclinicreturn().homePagereturn().showbuynowHome("Clearance");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Green").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Blazin").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Jalepeno").click();
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Roasted").click();				
	}
	@Test
	public void test7(){
		heatclinicreturn().homePagereturn().showloginlink();
		heatclinicreturn().loginPagereturn().username("molla1@yahoo.com");
		heatclinicreturn().loginPagereturn().password("molla1234");
		heatclinicreturn().loginPagereturn().ShowLoginButton().click();
		heatclinicreturn().assertions().veryfiloginusername("Arif");		
		heatclinicreturn().homePagereturn().showbuynowHome("New to Hot Sauce?");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Hurtin' Jalepeno").click();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().checkout().showcheckoutbutton();
		heatclinicreturn().checkout().Firstname("Arif");
		heatclinicreturn().checkout().Lastname("molla");
		heatclinicreturn().checkout().Phone("0176421164");
		heatclinicreturn().checkout().Address1("1225 white plains road, apt 627");
		heatclinicreturn().checkout().Address2("1225 white plains road, apt 627");
		heatclinicreturn().checkout().Addcity("Bronx");
		heatclinicreturn().checkout().Addstate("NY");
		heatclinicreturn().checkout().Addpostcode("10472");
		heatclinicreturn().checkout().AddressSave();
		heatclinicreturn().checkout().usesameShopinginfo();
		heatclinicreturn().checkout().AddShippingmethod();
		heatclinicreturn().checkout().AddselectShipping();
		heatclinicreturn().CreditCard().Addccnomber("123456789");
		heatclinicreturn().CreditCard().CvvNomber("555");
		heatclinicreturn().CreditCard().AddccholderName("Muhammad A Molla");
		heatclinicreturn().CreditCard().AddeExpDate("12/17");
		heatclinicreturn().CreditCard().Showpaymethod();
		heatclinicreturn().CreditCard().Showfinalckout();
		heatclinicreturn().assertions().verificationOrdernom();

		
		
	}
	@Test
	public void test8(){
		heatclinicreturn().homePagereturn().showbuynowHome("FAQs");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Habanero").click();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().merchander().showclour("Black");
		heatclinicreturn().merchander().showsize("M");
		heatclinicreturn().buyNowbyPuroducetName().showbuynow();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().shoopingCart().showRemove();

	}
	@Test
	public void test9(){
		heatclinicreturn().assertions().verifyTitel("Broadleaf Demo - Heat Clinic");
		heatclinicreturn().assertions().veryfilaguage("United States");
		heatclinicreturn().assertions().veryfilaguage("United Kingdom");
		heatclinicreturn().assertions().veryfilaguage("Mexico");
		heatclinicreturn().assertions().veryfilaguage("Spain");
		heatclinicreturn().assertions().veryfilaguage("France");
		heatclinicreturn().assertions().veryfiLoinlink();
		heatclinicreturn().assertions().veryfiRegLink();
		heatclinicreturn().assertions().veryfiCrtLink();
		heatclinicreturn().assertions().verifyNameTage("HOME","HOT SAUCES","MERCHANDISE","CLEARANCE", "NEW TO HOT SAUCE?", "FAQS");
		heatclinicreturn().assertions().verifypoweraddvt("POWERED BY BROADLEAF COMMERCE");
		heatclinicreturn().assertions().verifyallname("All Rights Reserved");
		heatclinicreturn().assertions().verifyalladdname("Copyright 2013 Broadleaf Commerce");
		heatclinicreturn().assertions().verifyalladd("Copyright 2013 The Heat Clinic");
		heatclinicreturn().homePagereturn().showloginlink();
		heatclinicreturn().loginPagereturn().username("molla1@yahoo.com");
		heatclinicreturn().loginPagereturn().password("molla1234");
		heatclinicreturn().loginPagereturn().ShowLoginButton().click();
		heatclinicreturn().assertions().veryfiloginusername("Arif");
		heatclinicreturn().homePagereturn().showbuynowHome("Home");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Dead Scotch").click();
		heatclinicreturn().homePagereturn().showbuynowHome("Hot Sauces");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Sweet Death Sauce").click();
		heatclinicreturn().homePagereturn().showbuynowHome("Merchandise");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Hawt Like a Habanero Shirt (Women's)").click();
		heatclinicreturn().merchander().showclour("Black");
		heatclinicreturn().merchander().showsize("M");
		heatclinicreturn().buyNowbyPuroducetName().showbuynow();
		heatclinicreturn().homePagereturn().showbuynowHome("Clearance");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Green").click();
		heatclinicreturn().homePagereturn().showbuynowHome("New to Hot Sauce?");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Hurtin' Jalepeno").click();
		heatclinicreturn().homePagereturn().showbuynowHome("FAQs");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Habanero").click();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().merchander().showclour("Black");
		heatclinicreturn().merchander().showsize("M");
		heatclinicreturn().buyNowbyPuroducetName().showbuynow();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().assertions().verifyShoppingTax("Subtotal does not yet include applicable tax or shipping and handling charges");
		heatclinicreturn().assertions().verifyShopignTag("ITEM", "QUANTITY", "PRICE","TOTAL SAVINGS", "TOTAL");
		heatclinicreturn().assertions().verifyPromocodeErmsg("");
		heatclinicreturn().shoopingCart().showPromocode("123456789");
		heatclinicreturn().assertions().verifyPromocodeErmsg("");
		heatclinicreturn().assertions().veryfisubtotal("$58.44");
		heatclinicreturn().checkout().showcheckoutbutton();
		heatclinicreturn().checkout().showEditButton();
		heatclinicreturn().shoopingCart().showRemove();
		heatclinicreturn().shoopingCart().showcontinueshoping();
		heatclinicreturn().homePagereturn().showbuynowHome("Hot Sauces");
		heatclinicreturn().buyNowbyPuroducetName().showbuyButton("Bull Snort Smokin' Toncils Hot Sauce").click();
		heatclinicreturn().shoopingCart().showitem();
		heatclinicreturn().checkout().showcheckoutbutton();
		heatclinicreturn().assertions().showordersummry("Subtotal");
		heatclinicreturn().assertions().showsmarytgname("$55.44");
		heatclinicreturn().checkout().Firstname("Arif");
		heatclinicreturn().checkout().Lastname("molla");
		heatclinicreturn().checkout().Phone("6463633708");
		heatclinicreturn().checkout().Address1("1225 white plains road, apt 627");
		heatclinicreturn().checkout().Address2("1225 white plains road, apt 627");
		heatclinicreturn().checkout().Addcity("Bronx");
		heatclinicreturn().checkout().Addstate("NY");
		heatclinicreturn().checkout().Addpostcode("10472");
		heatclinicreturn().checkout().AddressSave();
		heatclinicreturn().checkout().usesameShopinginfo();
		heatclinicreturn().checkout().AddShippingmethod();
		heatclinicreturn().checkout().AddselectShipping();
		heatclinicreturn().CreditCard().Addccnomber("123456789");
		heatclinicreturn().CreditCard().CvvNomber("555");
		heatclinicreturn().CreditCard().AddccholderName("Muhammad A Molla");
		heatclinicreturn().CreditCard().AddeExpDate("12/17");
		heatclinicreturn().CreditCard().Showpaymethod();
		heatclinicreturn().CreditCard().Showfinalckout();
		heatclinicreturn().assertions().verificationOrdernom();
	}
	
	

}
