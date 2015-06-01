package com.paxotech.controller;

import org.openqa.selenium.WebDriver;

public class ControllerBase {

	protected WebDriver driver = null;
	
	public ControllerBase(WebDriver driver) {
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
