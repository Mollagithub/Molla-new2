package com.paxotech.freamework.returnmethod;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptsBasereturn {
	
protected WebDriver driver;
	
	private Applicationreturn heatclinicreturn;
	

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		
		/*File chromeDriverFile = new File(System.getProperty("user.dir") +  "/driver/32/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());
		driver = new ChromeDriver();
*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://qa1.paxotech.com/heatclinic/");
		
	}
	
	
	public Applicationreturn heatclinicreturn(){
		if(heatclinicreturn == null){
			heatclinicreturn = new Applicationreturn(driver);
		}
		return heatclinicreturn;
	}
	
	

	@After
	public void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}




}
