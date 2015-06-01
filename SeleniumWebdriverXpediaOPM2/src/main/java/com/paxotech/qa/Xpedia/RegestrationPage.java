package com.paxotech.qa.Xpedia;

import junit.framework.Assert;

import org.apache.jackrabbit.util.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegestrationPage extends PageBase{
	
		
	private WebDriver driver=null;
	
	@FindBy(how=How.ID,using="create-account-firstname")
	private WebElement firstName;
	@FindBy(how=How.ID,using="create-account-lastname")
	private WebElement lastName;
	@FindBy(how=How.ID,using="create-account-emailId")
	private WebElement emailAddress;
	@FindBy(how=How.ID,using="create-account-password")
	private WebElement password;
	@FindBy(how=How.ID,using="create-account-confirm-password")
	private WebElement confPassword;
	@FindBy(how=How.ID,using="create-account-expedia-policy")
	private WebElement agree;
	@FindBy(how=How.ID,using="create-account-submit-button")
	private WebElement CreateAccButton;
	
	public RegestrationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	public void ShowNamebutton(String nameText,String lastNmeText,String emailText,String passwordText,String ConPassword){
		this.firstName.sendKeys(nameText);
		this.lastName.sendKeys(lastNmeText);
		this.emailAddress.sendKeys(emailText);
		this.password.sendKeys(passwordText);
		this.confPassword.sendKeys(ConPassword);
		this.agree.click();
		this.CreateAccButton.click();
		delayFor(2000);
	}
	
		public void verification2(String msgs){
		
		String text=driver.findElement(By.id("alert-acount-already-exist")).getText();
		System.out.println(text);
		Assert.assertEquals("Account already exists.", text);
	}
	

}
