package com.paxotech.qa.higbrg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBasehigbrdg{
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	private WebElement loginglink;
	@FindBy(how = How.XPATH,using = "//*[@id='content']/div[2]")
	private WebElement contentTitle;
	
	public void showhomepage(){
		contentTitle.click();
	}
	public WebElement showloginlink(){
		loginglink=driver.findElement(By.xpath(".//*[@id='cart_info']/a[1]/span"));
		loginglink.click();
		return loginglink;
	}
	
	
	
	
	
	

}
