package com.paxotech.freamework.returnmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ShoopingCart extends PageBase{
	private WebElement items;
	private WebElement Remove;
	private WebElement quentity;
	private WebElement update;
	private WebElement promotcode;
	private WebElement promtion;
	private WebElement conShopping;

	public WebElement showitem(){
		items=driver.findElement(By.id("cartLink"));
		delayFor(3000);
		items.click();
		return items;
	}
	public WebElement showRemove(){
		Remove=driver.findElement(By.xpath("//*[@class='cartLinkBtn remove_from_cart']"));
		Remove.click();
		return Remove;
	}
	public WebElement showQunt(String num){
		quentity=driver.findElement(By.xpath("//*[@class='quantityInput']"));
		quentity.clear();
		quentity.sendKeys(num);
		delayFor(2000);
		return quentity;
	}
	public WebElement showupdated(){
		update=driver.findElement(By.xpath("//*[@class='updateQuantity']"));
		update.click();
		delayFor(2000);
		return update;
	}
		public WebElement showcontinueshoping(){
		conShopping=driver.findElement(By.xpath("//*[@id='cart_total']/a/span"));
		conShopping.click();
		return conShopping;
	}

	public WebElement showPromocode(String nom){
		promotcode=driver.findElement(By.id("promoCode"));
		promotcode.clear();
		promotcode.sendKeys(nom);
		return promotcode;
	}

	public WebElement showPromo(){
		promtion=driver.findElement(By.id("addPromo"));
		promtion.click();
		return promtion;
	}


	public ShoopingCart(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

}
