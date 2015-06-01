package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePagereturn extends PageBase{
	private WebElement resgistationLink;
	private WebElement logingLink;
	private WebElement buynowHome;
	

	public WebElement showRegistratonlink(){
		resgistationLink=driver.findElement(By.xpath("//*[@id='cart_info']/a[2]/span"));
		resgistationLink.click();
		return resgistationLink;
	}
	public WebElement showloginlink(){
		logingLink=driver.findElement(By.xpath("//*[@id='cart_info']/a[1]/span"));
		logingLink.click();
		return logingLink;
	}
	public WebElement showbuynowHome(String tagnameHome){
		buynowHome=driver.findElement(By.xpath("//*[text()=\""+tagnameHome+"\"]"));
		buynowHome.click();
		return buynowHome;
	}
	

	

	public HomePagereturn(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	
	

}
