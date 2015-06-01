package com.paxotech.qa.higbrg;

import org.openqa.selenium.WebDriver;

public class Applicationhigbrdg {
	

	protected WebDriver driver;
	private HomePage homePage;
	private PgeHeader pageHeader;
	private PageFooter pageFooter;
	public Applicationhigbrdg(WebDriver driver) {
		this.driver = driver;
	}

	
	public PgeHeader pageHeader(){
		if(pageHeader==null){
			pageHeader=new PgeHeader(driver);
		}
		return pageHeader;
	}
	public HomePage homePage(){
		if(homePage==null){
			homePage=new HomePage(driver);			
		}
		return homePage;
	}
	public PageFooter pageFooter(){
		if(pageFooter==null){
			pageFooter=new PageFooter(driver);			
		}
		return pageFooter;
	}
	

}
