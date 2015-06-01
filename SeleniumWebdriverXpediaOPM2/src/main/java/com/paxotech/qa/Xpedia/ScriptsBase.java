package com.paxotech.qa.Xpedia;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ScriptsBase {
	protected WebDriver driver;
	private ApplicationBase Xpredia;
	
	
	@Before
	public void setUp() throws Exception{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.expedia.com/");
	}
	
	
	public ApplicationBase Xpredia(){
		if(Xpredia == null){
			Xpredia = new ApplicationBase(driver);
		}
		return Xpredia;
	}
	
	@After
	public void tearDown() throws Exception{
		driver.close();
		driver.quit();
	}

}
