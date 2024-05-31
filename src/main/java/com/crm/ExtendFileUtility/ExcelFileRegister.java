package com.crm.ExtendFileUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileRegister 
{
	public static String name;
	public static String lasNam;
	public static String email;
	public static String pass;
	public static String conPass;
	public static void readDataExcel() throws EncryptedDocumentException, IOException
	{
		//create object of file and enter the path of file
		  File path = new File("C:\\Users\\SIS\\Desktop\\Selenium Notes\\Advanced Selenium\\RegisterFile.xlsx");
		  
		  //Create object of fileinputstream  and pass the path of file
		  FileInputStream fis = new FileInputStream(path);
		  
		  //Move the control to the excel file
		  Workbook wb = WorkbookFactory.create(fis); 
		  
		  //get control on sheet 1
		  Sheet sheet = wb.getSheet("Sheet1");
		  
		  //get the email id of first cell
		    name = sheet.getRow(0).getCell(0).toString();
		    lasNam = sheet.getRow(1).getCell(0).toString();
		    email = sheet.getRow(2).getCell(0).toString();
		    pass = sheet.getRow(3).getCell(0).toString();
		    conPass= sheet.getRow(4).getCell(0).toString();
	}
		   
}
