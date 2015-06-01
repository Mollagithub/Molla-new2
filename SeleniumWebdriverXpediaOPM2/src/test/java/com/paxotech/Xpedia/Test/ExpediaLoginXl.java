package com.paxotech.Xpedia.Test;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.paxotech.qa.Xpedia.ScriptsBase;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;

@RunWith(DataProviderRunner.class)

public class ExpediaLoginXl extends ScriptsBase{
	
	
	@Test
	@DataProvider("hardcoted")
	public void test1(String email,String passweord,String name){
		Xpredia().homePage().showAccountinfopage();
		Xpredia().homePage().showAccountinfopage();
		Xpredia().logPage().Logininfo(email, passweord);
		Xpredia().homePage().varification(name);
	}	
	@DataProvider
	public static Object[][] hardcoted() {
		   
		Object[][] data;
		
		
		data =  new Object[][] {
				{ "arif_s211@yahoo.com","molla1234","Hello, Muhammad" },
				{ "arif_s211@yahoo.com","molla1234","Hello, Muhammad" }
		};
		return data;
		
	
		
		
	}

}
