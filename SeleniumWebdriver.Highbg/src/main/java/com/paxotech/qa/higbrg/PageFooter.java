package com.paxotech.qa.higbrg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class PageFooter extends PageBasehigbrdg{
	private WebElement Fotter;
	
		public WebElement showaFooter(String FotterText){
		Fotter=driver.findElement(By.xpath(".//*[@id='left_content']//*[text()=\""+FotterText+"\"]"));
		String footer=Fotter.getText();
		Assert.assertEquals(footer, FotterText);
		System.out.println(footer);
		Fotter.sendKeys(FotterText);
		return Fotter;
		}
		public WebElement showaFooterright(String FotterText){
			Fotter=driver.findElement(By.xpath(".//*[@id='right_content']//*[text()=\""+FotterText+"\"]"));
			String footer=Fotter.getText();
			Assert.assertEquals(footer, FotterText);
			System.out.println(footer);
			Fotter.sendKeys(FotterText);
			return Fotter;
}
	
	public PageFooter(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	


	
}
