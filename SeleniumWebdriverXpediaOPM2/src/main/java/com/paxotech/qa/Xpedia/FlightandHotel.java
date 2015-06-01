package com.paxotech.qa.Xpedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightandHotel extends PageBase{
	
	@FindBy(how=How.ID,using="package-fhc-label")
	public WebElement flightcarandticket;

	public FlightandHotel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	public void showflightandticket(){
		flightcarandticket.click();
	}

}
