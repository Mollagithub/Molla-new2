package com.paxotech.model;

import java.sql.Driver;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HotelticketModel extends ModelBase{
	protected WebDriver driver=null;

	@FindBy(how=How.XPATH,using=".//*[@id='tab-hotel-tab']/span[3]")
	private WebElement Hotel;
	

	
	@FindBy(how=How.ID,using="hotel-destination")
	private WebElement Hoteldestination;
	

	public HotelticketModel(WebDriver driver) {
		super(driver);
		//this.driver=this;
		PageFactory.initElements(this.driver, this);
	}
	public void showHotel(){
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", Hotel, "color: yellow;  border: 4px solid blue;"); 

		this.Hotel.click();
		
	}
	
	public void serchHotel(String TextDestination){
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", Hoteldestination, "color: yellow;  border: 4px solid blue;"); 
		this.Hoteldestination.sendKeys(TextDestination);
	}

	

}
