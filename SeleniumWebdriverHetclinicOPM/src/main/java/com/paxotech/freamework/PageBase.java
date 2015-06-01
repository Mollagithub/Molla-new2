package com.paxotech.freamework;

import org.openqa.selenium.WebDriver;

public class PageBase {
protected WebDriver driver = null;
	
	public PageBase(WebDriver driver) {
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
