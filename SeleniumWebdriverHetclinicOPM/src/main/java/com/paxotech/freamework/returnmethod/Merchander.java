package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Merchander extends PageBase{
	private WebElement buynowmrcdnProduct;
	private WebElement clour;
	private WebElement size;
	private WebElement name;
	
	public WebElement showbuyButton(String ProductName){
		buynowmrcdnProduct=driver.findElement(By.xpath("//div[contains(text(),\""+ProductName+"\")]/../..//input[@type='submit']"));		
		delayFor(2000);
		return buynowmrcdnProduct;
	}

	public WebElement showclour(String clourtext){
		clour=driver.findElement(By.linkText(clourtext));
		clour.click();		
		return clour;
	}	
	public WebElement showsize(String sizetext){
		size=driver.findElement(By.linkText(sizetext));
		size.click();		
		return size;
	}
	public WebElement showname(String nametext){
		name=driver.findElement(By.xpath("//*[@class='product-options']//input/..//*['@value=\""+nametext+"\"']"));
		name.sendKeys(nametext);		
		return name;
	}
	public Merchander(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

}
