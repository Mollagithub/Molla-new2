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

public class HotelBooking extends PageBase{
	
	protected WebDriver driver=null;
	@FindBy(how=How.XPATH,using="//*[@id='hotel0']/a/div[2]/ul[1]/li[3]/span/strong")
	private WebElement hotelbooking;
	@FindBy(how=How.ID,using="mock-book-button")
	private WebElement booking;
	@FindBy(how=How.XPATH,using="//*[@id='lead-price']/a[1]")
	private WebElement rate;
	@FindBy(how=How.XPATH,using="//*[@id='availability-form']/fieldset/div[1]/label/select")
	private WebElement room;
	@FindBy(how=How.XPATH,using="//*[@id='availability-form']/fieldset/div[1]/div/fieldset/label[1]/select")
	private WebElement adutls;
	@FindBy(how=How.XPATH,using="//*[@id='availability-form']/fieldset/div[1]/div/fieldset/label[2]/select")
	private WebElement children;
	@FindBy(how=How.ID,using="update-availability-button")
	private WebElement update;
	@FindBy(how=How.XPATH,using="//*[@id='rooms-and-rates']/article[2]/table/tbody[2]/tr[2]/td[5]/form/div[1]/button")
	private WebElement finalbooking;
	@FindBy (how=How.XPATH,using="//*[@class='text contact-primary']//input")
	private WebElement firstandlastname;
	@FindBy(how=How.ID,using="phone-number-room-0")
	private WebElement phone;
	@FindBy(how=How.ID,using="radio-business")
	private WebElement Perpus;
	@FindBy(how=How.XPATH,using="//*[@id='payments']/fieldset/ul/li[1]/a")
	private WebElement Creditcard;
	@FindBy(how=How.XPATH,using="//*[@id='payment-type-creditcard']/div[3]/form/fieldset/div[1]/div/div[3]/div/label[1]/input[1]")
	private WebElement ccnomber;
	@FindBy(how=How.XPATH,using="//*[@id='payment-type-creditcard']/div[3]/form/fieldset/div[1]/div/div[3]/div/fieldset/label[1]/select")
	private WebElement Month;
	@FindBy(how=How.XPATH,using="//*[@id='payment-type-creditcard']/div[3]/form/fieldset/div[1]/div/div[3]/div/fieldset/label[2]/select")
	private WebElement year;
	@FindBy(how=How.ID,using="new_card_security_code")
	private WebElement scqnomber;
	@FindBy(how=How.XPATH,using="//*[@id='payment-type-creditcard']/div[3]/form/fieldset/div[1]/div/div[3]/div/label[4]/input")
	private WebElement cardholerName;
	@FindBy(how=How.XPATH,using="//*[@id='payment-type-creditcard']/div[3]/form/fieldset/div[1]/div/div[3]/div/label[5]/input")
	private WebElement Zipcodeno;
	@FindBy(how=How.XPATH,using="//*[@id='email']/div[1]/fieldset/label/input")
	private WebElement Eamiladd;
	@FindBy(how=How.ID,using="complete-booking")
	private WebElement submitbutton;
	

	
	
	public HotelBooking(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	public void showhotelbokin(){
		hotelbooking.click();
		
		//Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		//Perform the click operation that opens new window

		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}

		
	    // Perform the actions on new window
	    String text = driver.findElement(By.id("mock-book-button")).getText();
	    System.out.println(text);
		
	}
	
	public void addroom(String nomber) {
		this.room.click();
		Select addroomcombo=new Select(room);
		addroomcombo.selectByVisibleText(nomber);		
	}
	public void showAdults(String person) {
		this.adutls.click();
		Select addperson=new Select(adutls);
		addperson.selectByVisibleText(person);		
	}
	public void addchildren(String person) {
		this.children.click();
		Select addchildren=new Select(children);
		addchildren.selectByVisibleText(person);		
	}
	public void showupdate(){
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", update, "color: yellow;  border: 4px solid blue;"); 		
		this.update.click();
		
	}
	public void bookinghotel(){
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", booking, "color: yellow;  border: 4px solid blue;"); 		
		this.booking.click();
	}
	public void finalbook(){
		this.finalbooking.click();
	}
	public void showlastname(String text){
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", firstandlastname, "color: green;  border: 4px solid blue;");
		this.firstandlastname.sendKeys(text);
	}
	public void showphone(String text){
		JavascriptExecutor light=(JavascriptExecutor)driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])", phone, "color: red;  border: 4px solid blue;");
		this.phone.sendKeys(text);
	}
	public void showradiob(){
		this.Perpus.click();
	}
	public void showcc(){
		this.Creditcard.click();
	}
	public void showccnomber(String text){
		this.ccnomber.sendKeys(text);
	}
	public void addMonth(String text) {
		this.Month.click();
		Select monthcombo=new Select(Month);
		monthcombo.selectByVisibleText(text);		
	}

	public void addyear(String text) {
		this.year.click();
		Select yearcombo=new Select(year);
		yearcombo.selectByVisibleText(text);		
	}
	public void addsqnom(String text){
		this.scqnomber.sendKeys(text);
	}
	public void addname(String text){
		this.cardholerName.sendKeys(text);
	}
	public void addzipcode(String text){
		this.Zipcodeno.sendKeys(text);
	}
	public void addEmil(String text){
		this.Eamiladd.sendKeys(text);
	}
	public void showsubmitbutton(){
		this.submitbutton.click();
	}
	
	public void verification(String actuattext){
		WebElement allname=driver.findElement(By.id("validation-msg-card_number"));
		String text=allname.getText();
		System.out.println(text);
		Assert.assertEquals(text, actuattext);
	}
	


}
