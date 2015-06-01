package com.paxotech.freamework.returnmethod;



import static org.junit.Assert.assertArrayEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Assertions extends PageBase{
	private WebElement ordersummerySubtotal;
	private WebElement samaryprice;
	private WebElement prductname;
	private WebElement chkMsgs;

	
	
	public void verifyTitel(String Titel){
		String  text = driver.getTitle();
		System.out.println(text);
		assertEquals(text, Titel);
		}
	public WebElement veryfilaguage(String LanguageText){
		WebElement Laguage = driver.findElement(By.xpath("//img[contains(@alt,'"+LanguageText+"')]"));
		assertNotNull(Laguage);
		boolean LanguageText1 = Laguage.isDisplayed();
		assertTrue(LanguageText1);
		return Laguage;
}

	public WebElement veryfiLoinlink(){
		WebElement loginLink = driver.findElement(By.xpath("//*[@id='cart_info']//*[@href='/heatclinic/login']"));
		assertNotNull(loginLink);
		boolean isdisplayed = loginLink.isDisplayed();
		assertTrue(isdisplayed);
		return loginLink;
}
	public WebElement veryfiRegLink(){
		WebElement reglink = driver.findElement(By.xpath("//*[@id='cart_info']//*[@href='/heatclinic/register']"));
		assertNotNull(reglink);
		boolean linktext=reglink.isDisplayed();
		assertTrue(linktext);
		return reglink;
}
	public WebElement veryfiCrtLink(){
		WebElement cartlink = driver.findElement(By.xpath("//*[@id='cart_info']//*[@href='/heatclinic/cart']"));
		assertNotNull(cartlink);
		boolean linktext=cartlink.isDisplayed();
		assertTrue(linktext);
		return cartlink;
}
	
	public void verifyNameTage(String string, String string2, String string3,
			String string4, String string5, String stirng6) {
		String[] tabNameExpected = {string, string2,string3,string4,string5,stirng6};

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
		
			assertArrayEquals("Your varification dosnt found", tabNameExpected, tabNamesActual);
		
		
	}
	public WebElement veryfiloginusername(String acctualName){
		WebElement userName=driver.findElement(By.xpath("//*[@id='cart_info']//a[@class='my-account']"));
		String text=userName.getText();               
		Assert.assertEquals(text, acctualName);
		System.out.println(text);
		return userName;				
	}
	public void verifyErrormsg(String Errormsg) {
		WebElement verification = driver.findElement(By.xpath("//*[@id='login']//span/p"));
		String text=verification.getText();
		System.out.println(text);		
		Assert.assertEquals(text, Errormsg);
		
	}

	public WebElement veryfisubtotal(String acctualprice){
		WebElement price=driver.findElement(By.id("subtotal"));
		String text=price.getText();
		JavascriptExecutor light = (JavascriptExecutor) driver;
		light.executeScript("arguments[0].setAttribute('style', arguments[1])",
				price, "color: yellow;  border: 4px solid blue;");

		System.out.println(text);
		Assert.assertEquals(text, acctualprice);
		return price;
	}
	public WebElement verifypoweraddvt(String powerdby){
		WebElement addvertisment = driver.findElement(By.xpath("//*[@id='blc_brand']/a/h4/span"));
		String text=addvertisment.getText();
		System.out.println(text);
		Assert.assertEquals(text, powerdby);
		return addvertisment;
	}

	public WebElement verifyallname(String nametext){
		WebElement allname = driver.findElement(By.xpath("//*[@id='right_content']//*[text()='"+nametext+"']"));
		String text=allname.getText();
		System.out.println(text);
		Assert.assertEquals(text, nametext);
		return allname;
	}
	public WebElement verifyalladdname(String textadd){		
		WebElement addvername=driver.findElement(By.xpath("//*[@id='blc_brand']/p/span"));
		String text=addvername.getText();
		Assert.assertEquals(text,textadd);
		System.out.println(text);
		return addvername;
		
			}
	public WebElement verifyalladd(String text3){		
		WebElement addvername=driver.findElement(By.xpath("//*[@id='left_content']/span"));
		String text=addvername.getText();
		Assert.assertEquals(text,text3);
		System.out.println(text);
		return addvername;
		
	}
	public void verificationOrdernom(){
		String verification = driver.findElement(By.xpath("//*[@id='order_confirmation']/h3")).getText();
		System.out.println(verification);
	}
	public WebElement verifyShoppingTax(String Tax){
		WebElement handlinandTax=driver.findElement(By.xpath("//div[@id='cart_total']/p/span[1]"));
		String text=handlinandTax.getText();
		System.out.println(text);
		assertEquals(text, Tax);
		return handlinandTax;
	}
	public void verifyShopignTag(String string, String string2, String string3,
			String string4,String string5) {
		String[] tabNameExpected = {string, string2,string3,string4,string5};

			List<WebElement> list = driver.findElements(By
				.xpath("//*[@id='cart_products']/thead/tr/th/span[1]"));
		int count = list.size();

		String[] tabNamesActual = new String[count];
		for (int i = 0; i < count; i++) {
			WebElement item = list.get(i);
			String text = item.getText();
			System.out.println(text);
			tabNamesActual[i] = text;
			
			
		}
		
			assertArrayEquals("Your varification dosnt found", tabNameExpected, tabNamesActual);
		
		
	}
	public WebElement verifyPromocodeErmsg(String Promossg){
		WebElement Errormsg = driver.findElement(By.xpath("//*[@id='cart_promo_error']"));
		String text=Errormsg.getText();
		System.out.println(text);
		Assert.assertEquals(text, Promossg);
		return Errormsg;
	}

	public WebElement showordersummry(String Texttagname){
		ordersummerySubtotal=driver.findElement(By.xpath("//*[@id='checkout_total_table']//*[text()='"+Texttagname+"']"));
		String text=ordersummerySubtotal.getText();
		System.out.println(text);
		Assert.assertEquals(text, Texttagname);
		return ordersummerySubtotal;
	}
	public WebElement showsmarytgname(String Textprice){
		samaryprice=driver.findElement(By.xpath("//*[@id='checkout_total_table']/tbody/tr[2]/td[1]"));
		String text=samaryprice.getText();
		System.out.println(text);
		Assert.assertEquals(text, Textprice);
		return samaryprice;
	}

	public WebElement showsmaryprcie(String Textprodctname){
		prductname=driver.findElement(By.xpath(""));
		String text=prductname.getText();
		System.out.println(text);
		assertEquals(text, Textprodctname);
		return prductname;
	}
	public WebElement showcrMsgs(String Textmasg){
		chkMsgs=driver.findElement(By.xpath("//*[@class='group order-info edit-order-info']/p"));
		String text=chkMsgs.getText();
		System.out.println(text);
		assertEquals(text, Textmasg);
		chkMsgs.click();
		return chkMsgs;
	}
	public Assertions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	//*[@id='cart_products']/thead/tr/th/span
}
