package com.automation.pom.tests;


import org.testng.annotations.Test;

import com.automation.pom.base.baseClass;
import com.automation.pom.pages.LoginPage;
import com.automation.pom.pages.LogoutPage;
import com.automation.pom.pages.RegisterPage;
import com.automation.pom.utility.SnapShot;

public class TC_01_POM_Record extends baseClass{

	@Test
public void recordDetails() throws Exception {
	
	
	LoginPage lp = new LoginPage(driver);
	lp.login();
	
	SnapShot.getScreenshot(driver);
	
	RegisterPage rp = new RegisterPage(driver);
	
	rp.regPage("ABC","DEF","Male","10","March","2020","Guntur");
	
	
	
	SnapShot.getScreenshot(driver);
	
	LogoutPage lop = new LogoutPage(driver);
	
	Thread.sleep(3000);
	
	lop.logOut();
	
	SnapShot.getScreenshot(driver);
	
	Thread.sleep(3000);
	
}

	
}
