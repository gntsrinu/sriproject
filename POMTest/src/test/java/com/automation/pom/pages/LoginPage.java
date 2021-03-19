package com.automation.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id = "username")
	private WebElement txtUname;

	@FindBy(id = "password")
	private WebElement txtPassword;
	
	@FindBy(id = "Registration Desk")
	private WebElement lnkRegDesk;
	
	@FindBy(id = "loginButton")
	private WebElement btmLogIn;
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	public void login() {
		
		txtUname.sendKeys("Admin");
		
		txtPassword.sendKeys("Admin123");
		
		lnkRegDesk.click();
		
		btmLogIn.click();
		
		
	}
	
	
}
