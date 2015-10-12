package com.toolsqa.framework.dataaccess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;

import com.toolsqa.framework.logger.Logger;

public class ExcelReader {

	public static String getExcelData(String filePath, String sheetName, int rowNumber, int colNumber) 
	{
		try {
		XSSFWorkbook workBook;
		
			workBook = new XSSFWorkbook(filePath);
		
		System.out.println("SheetCount: " + workBook.getNumberOfSheets());
		
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		String retValue = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
		
		workBook.close();
		
		return retValue;
		}
		catch (Exception ex)
		{
		
			Logger.logFail("Failed to load file " + filePath);
		}
		return null;
	}
	
	public static void setExcelData(String filePath, String sheetName, int rowNumber, int colNumber, String value) 
	{
		try {
		FileInputStream file = new FileInputStream(new File(filePath));
	    XSSFWorkbook workBook;
	
		workBook = new XSSFWorkbook(file);
	
		System.out.println("SheetCount: " + workBook.getNumberOfSheets());
			
		XSSFSheet sheet = workBook.getSheet(sheetName);
		
		 
		
		XSSFRow row = sheet.getRow(rowNumber);
		
		if(row == null)
		{
			row = sheet.createRow(rowNumber);
		}
		XSSFCell cell = row.getCell(colNumber, XSSFRow.RETURN_BLANK_AS_NULL);

		 
		if(cell==null)
		{	
	    cell = row.createCell(colNumber);
		cell.setCellValue(value);
		}
	    else
		{
			cell.setCellValue(value);
		}
		file.close();
	
		workBook.write(new FileOutputStream(filePath));
		workBook.close();
	    } 
	catch (IOException e)
	     {
		e.printStackTrace();
		//Logger.logFail("Failed to write in the file " + filePath);
	     }
	}
}