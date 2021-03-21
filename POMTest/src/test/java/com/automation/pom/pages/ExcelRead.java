package com.automation.pom.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelRead {

	@Test(dataProvider = "getTestData")
	public void dpTest(int no, String name, double sal) {

		System.out.println("No  :  " + no + "\n" + "Name :  " + name + "\n" + "Sal :  " + sal);

	}

	@DataProvider(name = "getTestData")
	public Object[][] getTestData() {

		Object[][] data = { { 1, "sri", 150000.00 } };
		return data;
	}

	@Test
	public void readExcel() throws Exception {

		File file = new File("d:\\TestData2.xlsx");

		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = WorkbookFactory.create(fileInputStream);

		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet0");

		//System.out.println(sheet.getPhysicalNumberOfRows());

		Row row = sheet.getRow(0);

		//System.out.println(row.getPhysicalNumberOfCells());

		for (int rowcount = sheet.getFirstRowNum(); rowcount <= sheet.getLastRowNum(); rowcount++) {
			for (int columncount = sheet.getRow(rowcount).getFirstCellNum(); columncount < sheet.getRow(rowcount).getLastCellNum(); columncount++) {
				System.out.println(sheet.getRow(rowcount).getCell(columncount));

			}

		}
		workbook.close();

	}

}
