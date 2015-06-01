package com.paxotech.freamework;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuySearchLink extends PageBase{
	
	@FindBy(how=How.ID,using="search_button")
	WebElement searchButton;
	@FindBy(how=How.XPATH,using="//*[@id='options']/div[5]/a/img")
	WebElement GettheEcantial;
	@FindBy(how=How.XPATH,using="//*[@id='options']/div[1]/ul/li[1]/a")
	WebElement allcountrymade;
	@FindBy(how=How.XPATH,using="//*[@id='options']/div[1]/h3/a[1]")
	WebElement Edit;
	@FindBy(how=How.XPATH,using="//*[@id='facet-mfg']/form/li/label")
	WebElement Allname;
	@FindBy(how=How.XPATH,using="//*[@id='facet-mfg']/form/input[3]")
	WebElement submitQuery;
	@FindBy(how=How.XPATH,using="//*[@id='options']/div[2]/ul/li[1]/a")	
	WebElement heatRange;
	@FindBy(how=How.XPATH,using="//*[@id='options']/div[3]/ul/li[2]/a")
	WebElement pricerange;
	@FindBy(how=How.XPATH,using="//*[@id='products']/li[1]/div[3]/div[2]/form/input[4]")
	WebElement BuyNowButton;
	@FindBy(how=How.ID,using="cartLink")
	WebElement items;
	@FindBy(how=How.XPATH,using="//*[@id='checkout']/a")
	WebElement Checkout;
	

	public void showSearchButton(){
		this.searchButton.click();
		this.GettheEcantial.click();
		this.allcountrymade.click();
		this.Edit.click();
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				Allname, "color: yellow;  border: 4px solid blue;");
		this.Allname.getText();
		
	}
	public void selectkeybyArraywithVerification() {
		String[] nameExpected = {"Blair's","Brazos Legends", "D. L. Jardine's", "Dave's Gourmet", "Figueroa Brothers", "Garden Row","Salsa Express", "Spice Exchange", "The Heat Clinic"};
				List<WebElement> list = driver.findElements(By
				.xpath("//*[@id='facet-mfg']/form/li/label"));
		int count = list.size();
		String[] tabNamesActual = new String[count];
		for (int i = 0; i < count; i++) {
			WebElement item = list.get(i);			
			String text = item.getText();
			tabNamesActual[i] = text;	
			list.get(i).click();
			list.get(7).click();
			System.out.println(text);			
		}
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				submitQuery, "color: yellow;  border: 4px solid blue;");

		this.submitQuery.click();
		
		assertArrayEquals(nameExpected, tabNamesActual);
	}
	public void showhotrage(){
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				heatRange, "color: yellow;  border: 4px solid blue;");
		
		this.heatRange.click();
		this.pricerange.click();
	}
	public void showbuynowButton(){
		this.BuyNowButton.click();
		this.items.click();
		this.Checkout.click();
		
	}
    	public BuySearchLink(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this); 
	}
	


}
