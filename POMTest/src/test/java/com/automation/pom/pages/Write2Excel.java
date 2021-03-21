package com.automation.pom.pages;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write2Excel {

public static void main(String[] args) throws Exception {
	
	Workbook workbook = WorkbookFactory.create(true);
	
	org.apache.poi.ss.usermodel.Sheet sheet = workbook.createSheet("sheet9");
	
	Row row = sheet.createRow(0);
	
	row.createCell(0).setCellValue("Eno");
		
	row.createCell(1).setCellValue("Ename");
	
	row.createCell(2).setCellValue("Salary");
	
	FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\Sheet9.xlsx"));
	
	workbook.write(fileOutputStream);
	
	workbook.close();
	
	
		
}	
}