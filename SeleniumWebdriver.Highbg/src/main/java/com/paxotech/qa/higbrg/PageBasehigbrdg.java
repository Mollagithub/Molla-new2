package com.paxotech.qa.higbrg;

import org.openqa.selenium.WebDriver;

public class PageBasehigbrdg {
	
	
protected WebDriver driver = null;
	
	public PageBasehigbrdg(WebDriver driver) {
		this.driver = driver;
	}

	
	public void delayFor(int time){
		 try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}


	

}
