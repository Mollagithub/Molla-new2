package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public class BuyNowbyPuroducetName extends PageBase{
	private WebElement buynowProducts ;
	private WebElement FAQs;
		private WebElement buynow;
	
	

		
	public WebElement showbuyButton(String ProductName){
		buynowProducts=driver.findElement(By.xpath("//div[contains(text(),\""+ProductName+"\")]/../..//input[@type='submit']"));		
		delayFor(2000);
		return buynowProducts;
	}
		public WebElement showbuynow(){
		buynow=driver.findElement(By.xpath("//*[@class='product-options modal simplemodal-data']//*[@class='addToCart']"));
		buynow.click();
		delayFor(2000);
		return buynow;
	}	
	public WebElement showFAQclikhere(){
		FAQs=driver.findElement(By.xpath("//*[@id='left_column']/div[2]/h4/a"));
		FAQs.click();
		return FAQs;
	}
		



	/*
	public WebElement showDemo(){
		Demo=driver.findElement(By.id("quantityInput"));
		Demo.click();
		return Demo;
	}
	public WebElement showfirstname(String firstname){
		firstNametextbox=driver.findElement(By.id("firstName"));
		firstNametextbox.sendKeys(firstname);
		return firstNametextbox;
	}
	public WebElement showlastname(String lastname){
		lastNametextbox=driver.findElement(By.id("lastName"));
		lastNametextbox.sendKeys(lastname);
		return lastNametextbox;
	}
	public WebElement showEamil(String Email){
		emailtextbox=driver.findElement(By.id("email"));
		emailtextbox.sendKeys(Email);
		return emailtextbox;
	}
	public WebElement showcompanyname(String textcompanyname){
		companyname=driver.findElement(By.id("company"));
		companyname.sendKeys(textcompanyname);
		return companyname;
	}
	public WebElement showdemoButton(){
		demoButton=driver.findElement(By.xpath("//*[@id='demo-form']/fieldset/div[6]/div/input"));
		demoButton.click();
		return demoButton;
	}
*/	


	public BuyNowbyPuroducetName(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	

}
