package com.paxotech.qa.Xpedia;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelandTicket extends PageBase{
	protected WebDriver driver = null;
	
	
	@FindBy(how=How.ID,using="hotel-destination")
	private WebElement Hoteldestination;
	@FindBy(how=How.ID,using="hotel-checkin")
	private WebElement checkinDate;
	@FindBy(how=How.ID,using="hotel-checkout")
	private WebElement checkoutDate;
	@FindBy(how=How.ID,using="hotel-1-guests")
	private WebElement adultGust;
	@FindBy(how=How.ID,using="search-button")
	private WebElement serchTextBox;
		
	public HotelandTicket(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}

	
	public void serchHotel(String TextDestination){
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", Hoteldestination, "color: yellow;  border: 4px solid blue;"); 
		this.Hoteldestination.sendKeys(TextDestination);
	}
	public void creatDate(String textDate){
		this.checkinDate.sendKeys(textDate);
	}
	public void creatoutDate(String texouttDate){
		this.checkoutDate.sendKeys(texouttDate);
	}
	public void addGust(String Text){
		//this.adultGust.click();
		
		Select addGustCombo = new Select(adultGust);
		addGustCombo.selectByVisibleText(Text);
		
		

		
	}
	public void ShowserchTxtBx(){
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", serchTextBox, "color: yellow;  border: 4px solid blue;"); 
		serchTextBox.click();	
		//WindowHanle
		String myWindowHandle = driver.getWindowHandle();
		driver.switchTo().window(myWindowHandle);


	}
	public void verification(String Name){
		WebElement allname=driver.findElement(By.xpath("//*[@id='hotelResultTitle']/h1"));
		String text=allname.getText();
		System.out.println(text);
		Assert.assertEquals(text, Name);
	}
	public void verification2(String hotelName){
		WebElement allname=driver.findElement(By.className("section-header-main"));
		String text2=allname.getText();
		System.out.println(text2);
		
		Assert.assertEquals(text2, hotelName);
	}


	
	

}
