package com.paxotech.qa;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.paxotech.freamework.HomePage;
import com.paxotech.freamework.ScriptBase;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScript extends ScriptBase {

	@Test
	public void test1() {
		// Verification1
		System.out.println("Verification (Title) [1]");
		String title = driver.getTitle();
		System.out.println(title);
		assertEquals("Broadleaf Demo - Heat Clinic", title);
		// verification2
		System.out.println("Verification 2");
		heatclinic().homePage().verifyNameTage("HOME", "HOT SAUCES",
				"MERCHANDISE", "CLEARANCE", "NEW TO HOT SAUCE?", "FAQS");
		// Regestration
		heatclinic().homePage().showRegistrationLink();
		heatclinic().regstationPage().showReginfo("molla@yahoo.com",
				"Muhammad", "Molla", "molla1234", "molla1234");
	

	}

	@Test
	public void test2() {
		// login
		heatclinic().homePage().showLoginPage();
		heatclinic().loginPage().login("molla@yahoo.com", "molla1234");
		heatclinic().homePage().verifyUserName("Muhammad");

		// verification
		WebElement loginLink = driver.findElement(By
				.xpath("//*[@id='cart_info']/a[1]/span"));
		assertNotNull(loginLink);
		boolean isdisplayed = loginLink.isDisplayed();
		assertTrue(isdisplayed);
	}

	@Test
	public void test3() {
		// login invalid user
		heatclinic().homePage().showLoginPage();
		heatclinic().loginPage().login("mmolla@yahoo.com", "molla1234");
				WebElement loginLink = driver.findElement(By
				.xpath("//*[@id='cart_info']/a[1]/span"));
		assertNotNull(loginLink);
		boolean isdisplayed = loginLink.isDisplayed();
		assertTrue(isdisplayed);
		heatclinic()
				.homePage()
				.verifyErrormsg("The e-mail address and/or password entered do not match our records. Please try again");

	}

	@Test
	public void test4() {
		heatclinic().homePage().showLoginPage();
		heatclinic().loginPage().login("molla@yahoo.com", "mmolla1234");
		WebElement loginLink = driver.findElement(By
				.xpath("//*[@id='cart_info']/a[1]/span"));
		assertNotNull(loginLink);
		boolean isdisplayed = loginLink.isDisplayed();
		assertTrue(isdisplayed);
		heatclinic()
				.homePage()
				.verifyErrormsg(
						"The e-mail address and/or password entered do not match our records. Please try again");

	}

	@Test
	public void test5() {

		heatclinic().homePage().showLoginPage();
		heatclinic().loginPage().login("molla@yahoo.com", "molla1234");
		heatclinic().buyNowPage().buynowlink();
		heatclinic().buyNowPage().showitems();
		heatclinic().homePage().verificationAmount("$9.48");
		heatclinic().buyNowPage().showcheckout();
		heatclinic().buyNowPage().addShoppinginfo("Muhammad", "MOlla",
				"6463633708", "1225 white plains road",
				"1225 white plains road", "Bronx", "NY", "10472");
		heatclinic().buyNowPage().Shopinginfo();
		heatclinic().buyNowPage().showCreditcardinfo("5178057638339797", "596",
				"Muhammad A Molla", "12/15");		
		heatclinic().homePage().verificationsucessmag("Success!");
		heatclinic().homePage().verificationpoweraddvt("POWERED BY BROADLEAF COMMERCE");
	}

	@Test
	public void test6() {
		heatclinic().homePage().showLoginPage();
		heatclinic().loginPage().login("molla@yahoo.com", "molla1234");

		heatclinic().buyNowmultiproduct().showallprouduct();
		heatclinic().buyNowPage().showcheckout();
		heatclinic().creditCardanBillingAddress().addShoppinginfo("Muhammad", "MOlla",
				"6463633708", "1225 white plains road",
				"1225 white plains road", "Bronx", "NY", "10472");
		heatclinic().buyNowPage().Shopinginfo();
		heatclinic().creditCardanBillingAddress().showCreditcardinfo("5178057638339797", "596",
				"Muhammad A Molla", "12/15");
		heatclinic().homePage().verificationsucessmag("Success!");
	}

	@Test
	public void test7() {
		heatclinic().homePage().showLoginPage();
		heatclinic().loginPage().login("molla@yahoo.com", "molla1234");
		heatclinic().homePage().search("Hot Sauces");
		heatclinic().buySearchLink().showSearchButton();
		heatclinic().homePage().veryfiNameall("Blair's");
		heatclinic().buySearchLink().selectkeybyArraywithVerification();
		heatclinic().buySearchLink().showhotrage();
		heatclinic().buySearchLink().showbuynowButton();
		heatclinic().creditCardanBillingAddress().addShoppinginfo("Muhammad", "MOlla",
				"6463633708", "1225 white plains road",
				"1225 white plains road", "Bronx", "NY", "10472");
		heatclinic().buyNowPage().Shopinginfo();
		heatclinic().creditCardanBillingAddress().showCreditcardinfo("5178057638339797", "596",
				"Muhammad A Molla", "12/15");

	}
	@Test
	public void test8(){
		heatclinic().tabnameArraySelectmanu().showtagmanu("Merchandise").click();
		//heatclinic().tabnameArraySelectmanu().showbuynow().click();
		heatclinic().tabnameArraySelectmanu().selectimage().click();
	}
	
}
