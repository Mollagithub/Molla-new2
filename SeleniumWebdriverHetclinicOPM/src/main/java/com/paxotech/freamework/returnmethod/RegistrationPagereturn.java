package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPagereturn extends PageBase{




   
	private WebElement emailBox;
	private WebElement firstNameBox;
	private WebElement lastNameBox;
	private WebElement passwordBox;
	private WebElement conPasswordBox;
	private WebElement registerButton;
	
	
	public WebElement emailBox(String email){
		emailBox=driver.findElement(By.id("customer.emailAddress"));
		emailBox.sendKeys(email);
				return emailBox;
	}
				
	public WebElement firstNameBox(String firstName){
		firstNameBox=driver.findElement(By.id("customer.firstName"));
		firstNameBox.sendKeys(firstName);
		return firstNameBox;
		
	}
				
	public WebElement lastNameBox(String lastName){
			lastNameBox=driver.findElement(By.id("customer.lastName"));
			lastNameBox.sendKeys(lastName);
			return lastNameBox;
			}
	
		
	
	public WebElement passwordBox(String password){
		passwordBox=driver.findElement(By.id("password"));
		passwordBox.sendKeys(password);
		return passwordBox;
		}
	
	public WebElement conPasswordBox(String conPassword){
		conPasswordBox=driver.findElement(By.id("passwordConfirm"));
		conPasswordBox.sendKeys(conPassword);
		return conPasswordBox;
	}

	public WebElement registerButton(){
		registerButton=driver.findElement(By.xpath("//*[@value='Register']"));
		registerButton.click();
		return registerButton;
	}
	
	 public RegistrationPagereturn(WebDriver driver) {
			super(driver);
			PageFactory.initElements(this.driver, this);
		}

		

}
