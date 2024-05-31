package com.crm.ExtendFileUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile 
{
	public static String recName;
	public static String recEmail;
	public static String senName;
	public static String senEmail;
	public static String message;
	public static String quantity;
	
	public static void readDataExcel() throws EncryptedDocumentException, IOException
	{
		//create object of file and enter the path of file
		  File path = new File("C:\\Users\\SIS\\Desktop\\Selenium Notes\\Advanced Selenium\\giftCard.xlsx");
		  
		  //Create object of fileinputstream  and pass the path of file
		  FileInputStream fis = new FileInputStream(path);
		  
		  //Move the control to the excel file
		 Workbook wb = WorkbookFactory.create(fis); 
		  
		  //get control on sheet 1
		  Sheet sheet = wb.getSheet("Sheet1");
		  
		  //get the email id of first cell
		   recName = sheet.getRow(0).getCell(0).toString();
		   recEmail = sheet.getRow(1).getCell(0).toString();
		   senName = sheet.getRow(2).getCell(0).toString();
		   senEmail = sheet.getRow(3).getCell(0).toString();
		   message = sheet.getRow(4).getCell(0).toString();
		   quantity= sheet.getRow(5).getCell(0).toString();
		   
		 
	}
	
}