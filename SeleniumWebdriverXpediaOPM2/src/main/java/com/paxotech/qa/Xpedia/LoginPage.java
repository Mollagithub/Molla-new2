package com.paxotech.qa.Xpedia;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageBase {
	protected WebDriver driver=null;
	
	@FindBy(how=How.NAME,using="signin-loginid")
	private WebElement Username;
	@FindBy(how=How.NAME,using="signin-password")
	private WebElement Password;
	@FindBy(how=How.XPATH,using="//*[@id='submitButton']")
	private WebElement LogButton;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	public void Logininfo(String Textusernae,String Textpassword){
		this.Username.sendKeys(Textusernae);
		this.Password.sendKeys(Textpassword);
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", LogButton, "color: yellow;  border: 4px solid blue;"); 
		this.LogButton.click();
	}
	public void verification(String usernme){
		WebElement wellcomename=driver.findElement(By.id("header-account-menu"));
		String text=wellcomename.getText();
		System.out.println(text);
		Assert.assertEquals(text, usernme);
	}
	

	

}
