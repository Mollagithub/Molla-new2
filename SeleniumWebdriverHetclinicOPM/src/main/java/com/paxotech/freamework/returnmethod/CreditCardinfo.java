package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CreditCardinfo extends PageBase{
	private WebElement CCnomber;
	private WebElement CCholderName;
	private WebElement CCexpdate;
	private WebElement Paymentmethod;
	private WebElement Completchkout;
	private WebElement CREDITcvv;


	
	
	
	public WebElement Addccnomber(String TextCCno){
		CCnomber=driver.findElement(By.name("CREDIT_CARD_NUMBER"));
		CCnomber.sendKeys(TextCCno);
		return CCnomber;
	}
	public WebElement CvvNomber(String Textccvno){
		CREDITcvv=driver.findElement(By.name("CREDIT_CARD_CVV"));
		CREDITcvv.sendKeys(Textccvno);
		return CREDITcvv;
	}
	public WebElement AddccholderName(String TextName){
		CCholderName=driver.findElement(By.id("nameOnCard"));
		CCholderName.sendKeys(TextName);
		return CCholderName;
	}

	public WebElement AddeExpDate(String Textexpdate){
		CCexpdate=driver.findElement(By.name("CREDIT_CARD_EXP_DATE"));
		CCexpdate.sendKeys(Textexpdate);
		return CCexpdate;
	}

	public WebElement Showpaymethod(){
		Paymentmethod=driver.findElement(By.id("paymentMethod_cod"));
		Paymentmethod.click();
		return Paymentmethod;
	}

	public WebElement Showfinalckout(){
		Completchkout=driver.findElement(By.xpath("//*[@id='complete_checkout']/input[1]"));
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				Completchkout, "color: yellow;  border: 4px solid red;");
		Completchkout.click();
		return Completchkout;
	


			}


	public CreditCardinfo(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	

}
