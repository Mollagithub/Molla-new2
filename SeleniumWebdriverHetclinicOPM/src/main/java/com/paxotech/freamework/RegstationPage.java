package com.paxotech.freamework;

import junit.framework.Assert;

import org.apache.jackrabbit.webdav.WebdavRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegstationPage extends PageBase {
	@FindBy(how=How.NAME ,using="customer.emailAddress")
	private WebElement emailAddress;

	@FindBy(how=How.NAME,using="customer.firstName")
	private WebElement firstName;
	@FindBy(how=How.NAME,using="customer.lastName")
	private WebElement lastName;
	@FindBy(how=How.NAME,using="password")
	private WebElement password;
	@FindBy(how=How.NAME,using="passwordConfirm")
	private WebElement confPassword;
	//@FindBy(how=How.ID,using="create-account-expedia-policy")
	//private WebElement agree;
	@FindBy(how=How.XPATH,using="//*[@id='registrationForm']/div[6]/input")
	private WebElement RegtButton;

		 
	public RegstationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	
	
	
	public void showReginfo(String emailText,String FName,String LName,String Password,String conPassword){
			
		this.emailAddress.sendKeys(emailText);
		this.firstName.sendKeys(FName);
		this.lastName.sendKeys(LName);
		this.password.sendKeys(Password);
		this.confPassword.sendKeys(conPassword);
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", RegtButton, "color: yellow;  border: 4px solid blue;"); 		

		this.RegtButton.click();
	
	}
	public void verification(String showemag){
		String emag=driver.findElement(By.xpath(".//*[@id='blc_brand']/a/img")).getText();
				System.out.println(emag);
				JavascriptExecutor light=(JavascriptExecutor)driver;
				light.executeScript("arguments[0].setAttribute('style', arguments[1])", emag, "color: yellow;  border: 4px solid blue;"); 		
				Assert.assertEquals(showemag, emag);
				
	}


}
