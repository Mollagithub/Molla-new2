package com.paxotech.freamework;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import junit.framework.Assert;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageBase {

	@FindBy(how = How.XPATH, using = "//*[@id='cart_info']/a[1]/span")
	private WebElement loginLink;
	@FindBy(how = How.XPATH, using = "//*[@id='cart_info']/a[2]/span")
	private WebElement RegisterLink;

	@FindBy(how = How.NAME, using = "q")
	private WebElement searchTextbox;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void showLoginPage() {
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				loginLink, "color: yellow;  border: 4px solid blue;");

		loginLink.click();
	}

	public void showRegistrationLink() {
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				RegisterLink, "color: yellow;  border: 4px solid blue;");

		RegisterLink.click();
	}

	public void verifyUserName(String name) {

		WebElement userName = driver.findElement(By
				.xpath("//*[@id='cart_info']//a[@class='my-account']"));
		String text = userName.getText();
		Assert.assertEquals(text, name);
		// assertThat(text, is(equal(name)));

	}

	public void verifyNameTage(String string, String string2, String string3,
			String string4, String string5, String stirng6) {
		String[] tabNameExpected = { "HOME", "HOT SAUCES", "MERCHANDISE",
				"CLEARANCE", "NEW TO HOT SAUCE?", "FAQS" };
		List<WebElement> list = driver.findElements(By
				.xpath("//*[@id='content']/nav/ul/li/a"));
		int count = list.size();

		String[] tabNamesActual = new String[count];
		for (int i = 0; i < count; i++) {
			WebElement item = list.get(i);
			String text = item.getText();
			tabNamesActual[i] = text;
			System.out.println(text);
		}

		assertArrayEquals(tabNameExpected, tabNamesActual);

	}
	public void verificationAmount(String amount){
		String verification = driver.findElement(By.id("subtotal")).getText();
		System.out.println(verification);
		Assert.assertEquals(amount, verification);
		
	}
	public void verificationOrdernom(String conOrder){
		String verification = driver.findElement(By.xpath("//*[@id='order_confirmation']/h3")).getText();
		System.out.println(verification);
		Assert.assertEquals(conOrder, verification);
		
	}
	public void verificationsucessmag(String Susccessmsg){
		String verification = driver.findElement(By.xpath("//*[@id='order_confirmation']/h2/span")).getText();
		System.out.println(verification);
		Assert.assertEquals(Susccessmsg, verification);
		
	}
	public void verificationpoweraddvt(String powerdby){
		String veryfiProductname = driver.findElement(By.xpath("//*[@id='blc_brand']/a/h4/span")).getText();
		System.out.println(veryfiProductname);
		Assert.assertEquals(powerdby, veryfiProductname);
		
	}

	public void verifyErrormsg(String Errormsg) {
		String verification = driver.findElement(
				By.xpath("//*[@id='login']//span/p")).getText();
		System.out.println(verification);		
		Assert.assertEquals(Errormsg, verification);		
	}
	public void veryfiNameall(String Name){
		String allname=driver.findElement(By.xpath("//*[@id='facet-mfg']/form/li/label")).getText();
		System.out.println(allname);
		Assert.assertEquals(Name, allname);
		
	}
	
	public void search(String textToSearch) {
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				searchTextbox, "color: red;  border: 4px solid blue;");

		searchTextbox.clear();
		searchTextbox.sendKeys(textToSearch);
	}

}
