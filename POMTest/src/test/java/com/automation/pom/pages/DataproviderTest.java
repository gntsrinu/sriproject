package com.automation.pom.pages;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTest {
	
	@Test(dataProvider = "getTestData")
	public void dpTest(int no, String name, double sal) {
		
		

				
		System.out.println("No  :  " +no + "\n" + "Name :  " +name +"\n" +"Sal :  " +sal);
		
	}

	
@DataProvider(name = "getTestData")
public Object[][] getTestData(){
	
	Object[][] data = {{1,"sri",150000.00}};
	return data;
}
	
	
}
