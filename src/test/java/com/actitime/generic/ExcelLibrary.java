package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary implements AutoConstant
{
	public static String getCellValue(String sheet, int row , int cell) throws IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String cellValue =wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellValue;
	}
	
//	public String setCellValue(String sheet, int row , int cell) throws IOException
//	{
//		FileInputStream fis = new FileInputStream(excelpath);
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		String cellValue =wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
//		return cellValue;
//	}
	
	
}
