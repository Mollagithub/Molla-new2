package com.paxotech.freamework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptBase {
protected WebDriver driver;
	
	private Application heatclinic;
	

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://qa1.paxotech.com/heatclinic/");
		
	}
	
	
	public Application heatclinic(){
		if(heatclinic == null){
			heatclinic = new Application(driver);
		}
		return heatclinic;
	}
	
	

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}


}
