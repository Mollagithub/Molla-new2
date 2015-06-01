package com.paxotech.qa.Xpedia;

import org.openqa.selenium.WebDriver;

public class ApplicationBase {
	private WebDriver driver;
	private HomePage homePage=null;
	private RegestrationPage regestrationPage=null;
	private LoginPage loginPage=null;
	private HotelandTicket hotelandTicket=null;
	private HotelBooking hotelBooking=null;
	private FlightandHotel flightandHotel=null;
	
		
	

	public ApplicationBase(WebDriver driver) {
		this.driver=driver;
		
	
	}
	public HomePage homePage(){
	if(homePage==null){
		homePage=new HomePage(driver);
		
	}
	return homePage;
		
	}	
	public RegestrationPage regestrationPage(){
		if(regestrationPage==null){
			regestrationPage=new RegestrationPage(driver);
		}
		return regestrationPage;
	}
	public LoginPage logPage(){
		if(loginPage==null){
			loginPage=new LoginPage(driver);
		}
		return loginPage;
	}
	public HotelandTicket hotetTicket(){
		if(hotelandTicket==null){
			hotelandTicket=new HotelandTicket(driver);
		}
		return hotelandTicket;
	}
	public HotelBooking hotBooking(){
		if(hotelBooking==null){
			hotelBooking=new HotelBooking(driver);
		}
		return hotelBooking;
	}
	public FlightandHotel flightandHotel(){
		if(flightandHotel==null){
			flightandHotel=new FlightandHotel(driver);
		}
		return flightandHotel;
	}



}
