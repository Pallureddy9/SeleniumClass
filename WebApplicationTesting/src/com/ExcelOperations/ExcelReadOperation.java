package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOperation {

	
	public static void main(String[] args) throws IOException 
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\mw\\Desktop\\PallaviSelenium\\SeleniumBook1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		Row r = sheet.getRow(2);
		Cell c = r.getCell(1);
		
		 double d = c.getNumericCellValue();
		 long l =(long)d;
		 String number=Long.toString(l);
		 
		 System.out.println(number);
		
				
	}

}
