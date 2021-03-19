package com.automation.pom.utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SnapShot {

	public static void getScreenshot(WebDriver driver) throws Exception {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		
		File trgtFile = new File("D:\\" + new Date().getTime() + ".jpg");
		
		org.openqa.selenium.io.FileHandler.copy(srcFile, trgtFile);
	}
	
	
}
