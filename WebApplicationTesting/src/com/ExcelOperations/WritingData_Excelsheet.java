package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData_Excelsheet {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\mw\\Desktop\\PallaviSelenium\\SeleniumBook1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row r = sheet.createRow(6);
		Cell c= r.createCell(0);
		
		c.setCellValue("Bengal");
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\mw\\Desktop\\PallaviSelenium\\SeleniumBook1.xlsx");
		  workbook.write(file1);
	}

}
