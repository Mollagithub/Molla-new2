package com.paxotech.qa;

import org.testng.annotations.Test;

import com.paxotech.qa.higbrg.ScriptBasehigbrdg;
public class TestHigbrdg extends ScriptBasehigbrdg{
	@Test
	public void test1(){
		Heatclinic().homePage().showhomepage();
		Heatclinic().homePage().showloginlink();
		Heatclinic().pageHeader().showHomepage("Home").click();
		Heatclinic().pageHeader().verifynowuHomePage("THE HEAT CLINIC'S TOP SELLING SAUCES");
		Heatclinic().pageHeader().showHomepage("Hot Sauces").click();
		Heatclinic().pageHeader().verifynowurightPage("Viewing Hot Sauces (1 - 15 of 19)");
		Heatclinic().pageHeader().showHomepage("Merchandise").click();
		Heatclinic().pageHeader().verifynowurightPage("Viewing Merchandise (1 - 6 of 6)");
		Heatclinic().pageHeader().showHomepage("Clearance").click();
		Heatclinic().pageHeader().verifyPageTitle("Clearance - Broadleaf Demo - Heat Clinic");
		Heatclinic().pageHeader().verifynowurightPage("Viewing Clearance (1 - 5 of 5)");
		Heatclinic().pageHeader().showHomepage("New to Hot Sauce?").click();
		System.out.println("Sorry we didnt upload the page yet");
		Heatclinic().pageHeader().verifynowurightPage("");
		Heatclinic().pageHeader().showHomepage("FAQs").click();
		System.out.println("Sorry we didnt upload the page yet");
		Heatclinic().pageHeader().verifynowurightPage("");

	}
	@Test
	public void test2(){
		Heatclinic().pageFooter().showaFooter("Copyright 2013 The Heat Clinic").click();
		Heatclinic().pageFooter().showaFooter("Privacy Policy").click();
		Heatclinic().pageFooter().showaFooterright("All Rights Reserved");
		Heatclinic().pageFooter().showaFooterright("Customer Service");


	}
	
	

}
