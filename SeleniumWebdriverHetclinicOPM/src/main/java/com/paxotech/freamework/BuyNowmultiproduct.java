package com.paxotech.freamework;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuyNowmultiproduct extends PageBase{
	
	@FindBy(how=How.XPATH,using="//*[@id='content']/nav/ul/li[3]/a")
	WebElement manubarselect;
	@FindBy(how=How.XPATH,using="//*[@id='products']/li[1]/div[3]/div/form/input[4]")
	WebElement product1;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions100']/div/ul/li[1]/ul/li[2]/div")
	WebElement clour;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions100']/div/ul/li[2]/ul/li[4]/div/a")
	WebElement size;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions100']/div/ul/li[3]/ul/li/input")
	WebElement personalname;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions100']/input")
	WebElement buyinputButton;


	@FindBy(how=How.XPATH,using="//*[@id='products']/li[2]/div[3]/div/form/input[4]")
	WebElement product2;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions200']/div/ul/li[1]/ul/li[2]/div/a")
	WebElement clour2;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions200']/div/ul/li[2]/ul/li[2]/div/a")
	WebElement size2;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions200']/input")
	WebElement buyinputButton2;

	@FindBy(how=How.XPATH,using="//*[@id='products']/li[3]/div[3]/div/form/input[4]")
	WebElement product3;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions300']/div/ul/li[1]/ul/li[1]/div/a")
	WebElement clour3;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions300']/div/ul/li[2]/ul/li[3]/div/a")
	WebElement size3;
	@FindBy(how=How.XPATH,using="//*[@id='productOptions300']/input")
	WebElement buyinputButton3;

	@FindBy(how=How.XPATH,using="//*[@id='content']/nav/ul/li[4]/a")
	WebElement manubarClearnes;
	@FindBy(how=How.XPATH,using="//*[@id='products']/li[1]/div[3]/div[2]/form/input[4]")
	WebElement product4;
	@FindBy(how=How.XPATH,using="//*[@id='products']/li[2]/div[3]/div[2]/form/input[4]")
	WebElement product5;


	@FindBy(how=How.ID,using="cartLink")
	WebElement items5;
	/*@FindBy(how=How.XPATH,using="//*[@id='productRow243']//a")
	WebElement removeitem;
	@FindBy(how=How.XPATH,using="//*[@id='productRow231']/td[3]/form/input[4]")
	WebElement updateditem;
	*/
	@FindBy(how=How.XPATH,using="//*[@id='checkout']/a")
	WebElement Checkout;
	
	public void showallprouduct(){
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				manubarselect, "color: yellow;  border: 4px solid blue;");
		this.manubarselect.click();
		
		JavascriptExecutor light1 = (JavascriptExecutor) driver;
		light1.executeScript("arguments[0].setAttribute('style', arguments[1])",
				product1, "color: yellow;  border: 4px solid blue;");
		this.product1.click();
		this.clour.click();
		this.size.click();
		this.personalname.sendKeys("Molla");
		this.buyinputButton.click();
		JavascriptExecutor light2 = (JavascriptExecutor) driver;
		light2.executeScript("arguments[0].setAttribute('style', arguments[1])",
				product2, "color: yellow;  border: 4px solid blue;");
		this.product2.click();
		this.clour2.click();
		this.size2.click();
		this.buyinputButton2.click();

		
		JavascriptExecutor light3 = (JavascriptExecutor) driver;
		light3.executeScript("arguments[0].setAttribute('style', arguments[1])",
				product3, "color: yellow;  border: 4px solid blue;");
		this.product3.click();
		this.clour3.click();
		this.size3.click();
		this.buyinputButton3.click();

		this.manubarClearnes.click();
		this.product4.click();
		this.product5.click();
		JavascriptExecutor items5 = (JavascriptExecutor) driver;
		light3.executeScript("arguments[0].setAttribute('style', arguments[1])",
				product3, "color: yellow;  border: 4px solid blue;");

		this.items5.click();
		//this.removeitem.click();
		//this.updateditem.click();
	}
				public void verification3(String Susccessmsg){
			String verification = driver.findElement(By.xpath("//*[@id='order_confirmation']/h2/span")).getText();
			System.out.println(verification);
			Assert.assertEquals(Susccessmsg, verification);
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public BuyNowmultiproduct(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

}
