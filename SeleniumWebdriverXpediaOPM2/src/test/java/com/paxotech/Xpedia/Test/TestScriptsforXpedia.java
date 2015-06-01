package com.paxotech.Xpedia.Test;

import static org.junit.Assert.*;

import org.codehaus.groovy.ast.expr.SpreadExpression;
import org.junit.Test;

import com.paxotech.qa.Xpedia.HomePage;
import com.paxotech.qa.Xpedia.RegestrationPage;
import com.paxotech.qa.Xpedia.ScriptsBase;

public class TestScriptsforXpedia extends ScriptsBase{


	                         
	@Test
	public void test1(){
		Xpredia().homePage().showAccountinfopage();
		Xpredia().homePage().showAccountinfopage();
		Xpredia().regestrationPage().ShowNamebutton("Muhammad", "Molla","arif_s211@yahoo.com","molla1234","molla1234");
		Xpredia().homePage().verification1("Create an account");
		Xpredia().regestrationPage().verification2("Expedia");
		
	}
	@Test
	public void test2(){
		Xpredia().homePage().showAccountinfopage();
		Xpredia().homePage().showAccountinfopage();
		Xpredia().logPage().Logininfo("arif_s211@yahoo.com", "molla1234");
		Xpredia().logPage().verification("Hello, Muhammad");
	}
	@Test
	public void test3(){
		Xpredia().homePage().showAccountinfopage();
		Xpredia().hotetTicket().serchHotel("Dallas-Fort Worth International Airport (DFW), Texas, United States of America");
		Xpredia().hotetTicket().creatDate("04/28/2015");
		Xpredia().hotetTicket().creatoutDate("05/20/2015");
		Xpredia().hotetTicket().addGust("1 adult, 0 children");
		Xpredia().hotetTicket().ShowserchTxtBx();
		Xpredia().hotetTicket().verification("91 hotels near Dallas-Fort Worth International Airport (DFW)");
		Xpredia().hotBooking().showhotelbokin();
		Xpredia().hotBooking().bookinghotel();
		Xpredia().hotBooking().addroom("4");
		Xpredia().hotBooking().showAdults("2");
		Xpredia().hotBooking().addchildren("3");
		Xpredia().hotBooking().showupdate();
		Xpredia().hotBooking().finalbook();
		Xpredia().hotBooking().showlastname("Muhammad molla");
		Xpredia().hotBooking().showphone("16463633708");
		Xpredia().hotBooking().showccnomber("345679708904");
		Xpredia().hotBooking().addMonth("08-Aug");
		Xpredia().hotBooking().addyear("2017");
		Xpredia().hotBooking().addsqnom("555");
		Xpredia().hotBooking().addname("Muhammad A Molla");
		Xpredia().hotBooking().addzipcode("10477");
		Xpredia().hotBooking().addEmil("arif_s211@yahoo.com");		
		Xpredia().hotBooking().showsubmitbutton();
		Xpredia().hotBooking().verification("Please enter a valid card number.");
		

	}

}
