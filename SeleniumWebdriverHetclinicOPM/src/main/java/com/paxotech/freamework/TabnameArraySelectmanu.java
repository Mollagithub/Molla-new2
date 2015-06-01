package com.paxotech.freamework;

import java.util.Iterator;
import java.util.List;

import junit.framework.Assert;

import org.apache.jackrabbit.util.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.thoughtworks.selenium.webdriven.commands.GetText;




public class TabnameArraySelectmanu extends PageBase{
	private WebElement tagName;
	private WebElement buyNowbutton;
	private WebElement Image;

	public String 	TabName;
	
	public void showallmanu(){	
	
	
		List<WebElement> list = driver.findElements(By
				.xpath("//*[@id='content']/nav/ul/li/a"));
		int count = list.size();	
		for (int i = 0; i < count; i++) {
			WebElement item = list.get(i);
			String ItemName= item.getText();
			String TabName="MERCHANDISE";
		
			if (TabName=="MERCHANDISE"){	
		Assert.assertEquals(TabName, ItemName);
			{
				System.out.println("True");
				System.out.println("The tab found "+ TabName);
				item.click();
			
			}
			System.out.println("Not found");
		
			}
		}
		}
	
	

	public WebElement showtagmanu(String souces){
		tagName=driver.findElement(By.xpath("//*[text()=\""+souces+"\"]"));
		return tagName;
		
	}
	public WebElement showbuynow(){
		buyNowbutton=driver.findElement(By.xpath("//*[@id='products']/li[1]/div[1]/a/img"));
		return buyNowbutton;
	}
	public WebElement selectimage(){
				 Image = driver.findElement(By.xpath("//*[@class='image']['Hawt Like a Habanero Shirt'][1]/a/img"));		
		return Image;
			}
	
	

	public TabnameArraySelectmanu(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

}
