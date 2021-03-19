package com.automation.pom.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.pom.base.baseClass;
import com.automation.pom.pages.LoginPage;
import com.automation.pom.pages.LogoutPage;
import com.automation.pom.pages.RegisterPage;
import com.automation.pom.utility.SnapShot;

public class TC_03_POM_Hybrid_Record extends baseClass {

	@Test(dataProvider = "getTestData")
	public void recordDetails(String fna, String lna, String gen, String date, String month, String year, String ciy) throws Exception {

		LoginPage lp = new LoginPage(driver);
		lp.login();

		SnapShot.getScreenshot(driver);

		RegisterPage rp = new RegisterPage(driver);
		
		rp.regPage(fna, lna, gen, date, month, year, ciy);
		
		//rp.regPage("ABC", "DEF", "Male", "10", "March", "2020", "Guntur");

		SnapShot.getScreenshot(driver);

		LogoutPage lop = new LogoutPage(driver);

		Thread.sleep(3000);

		lop.logOut();

		SnapShot.getScreenshot(driver);

		Thread.sleep(3000);

	}
	
	@DataProvider(name = "getTestData")
	public String[][] setTestData(){
		
		String[][] data = {{"ABC", "DEF", "Male", "10", "March", "2020", "Guntur"}};
		
		return data;
		
	}
	
	

}
