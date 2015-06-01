package com.paxotech.qa.higbrg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PgeHeader extends PageBasehigbrdg{
	private WebElement hompage;
	public WebElement showHomepage(String tagnameHome){
		hompage=driver.findElement(By.xpath("//*[text()=\""+tagnameHome+"\"]"));
		delayFor(2000);
		hompage.sendKeys(tagnameHome);
		return hompage;
	}

	public PgeHeader(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	public void verifyPageTitle(String expected){
		String title = driver.getTitle();
		Assert.assertEquals(title, expected);
	}
	public void verifynowuHomePage(String Contital){
		WebElement containttital=driver.findElement(By.xpath("//*[@id='content']/div[2]"));
		String containttital1=containttital.getText();
		Assert.assertEquals(containttital1, Contital);
		
	}
	public void verifynowurightPage(String Contital){
		WebElement containttital=driver.findElement(By.xpath(".//*[@id='left_column']/header/h1"));
		String containttital1=containttital.getText();
		Assert.assertEquals(containttital1, Contital);
		
	}


	
	

	
}
