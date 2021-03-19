package com.automation.pom.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	protected WebDriver driver = null;

	@BeforeTest
	public void openBrowser() throws Exception {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		Thread.sleep(2000);

	}

	@AfterTest
	public void closeBrowser() {

		driver.quit();
	}

}
