package com.automation.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	

		
	@FindBy (partialLinkText = "Logout")
	 private WebElement lnkLogout;
	
	public LogoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void logOut() {
		
		lnkLogout.click();
		
	}

}
