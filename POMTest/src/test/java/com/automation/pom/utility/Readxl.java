package com.automation.pom.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Readxl {

	@Test

	public Object[][] getTestData() throws Exception {
		// String una, String pswrd, String fna, String lna, String gen, Sring dy,
		// String mo, String yr, String ci, String pn

		Object[][] data = null;

		File file = new File("D:\\Testdata2.xlsx");

		FileInputStream fis = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheet = workbook.getSheet("Sheet2");

		Row row = sheet.getRow(0);

		System.out.println("No of rows:" + sheet.getPhysicalNumberOfRows());

		System.out.println("No of columns:" + row.getPhysicalNumberOfCells());

		data = new Object[sheet.getPhysicalNumberOfRows() - 1][row.getPhysicalNumberOfCells() - 1];

		data[0][0] = sheet.getRow(0).getCell(0).toString();

		System.out.println(data[0][0]);
		System.out.println(sheet.getRow(0).getCell(1).toString());
		System.out.println(sheet.getRow(0).getCell(2).toString());
		System.out.println(sheet.getRow(0).getCell(3).toString());

		return data;

	}

}
