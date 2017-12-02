package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingCompleteExcelSheetData {

	
	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\mw\\Desktop\\PallaviSelenium\\SeleniumBook1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i=0;i<rowcount;i++)
		{
			Row r = sheet.getRow(i);
			int cellcount = r.getLastCellNum();
			
		
		for(int j=0;j<cellcount;j++)
		{
			Cell c = r.getCell(j);
			String testdata = c.getStringCellValue();
			
			System.out.println(testdata+"");
			
		}
		
		
		System.out.println();
		}
	} 
	}
