package com.paxotech.qa.higbrg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class ScriptBasehigbrdg {
	protected WebDriver driver;

	protected Applicationhigbrdg Heatclinic;
	
	@BeforeMethod
	public void setUp()throws Exception{
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);		
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://qa1.paxotech.com/heatclinic/");
	}
	public Applicationhigbrdg Heatclinic(){
		if(Heatclinic == null){
			Heatclinic = new Applicationhigbrdg(driver);
		}
		return Heatclinic;
	}

	
	@AfterMethod
	public void tearDown(){
		driver.close();
		driver.quit();
	}

}
