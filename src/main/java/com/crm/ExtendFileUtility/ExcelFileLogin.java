package com.crm.ExtendFileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelFileLogin 
{
	
	public static Object[][] webShopLogin() throws EncryptedDocumentException, IOException
	   {
		   //create object [][] class  of object
		   Object[][] obj = new Object[2][2];
		   
		   //create object of FileInputStream
		    FileInputStream fis = new FileInputStream("C:\\Users\\SIS\\Desktop\\Selenium Notes\\Advanced Selenium\\WebShopLogin.xlsx");
		 
		     //Move the control to the excel file
			 Workbook wb = WorkbookFactory.create(fis); 
			  
		    //get control on sheet 1
		     Sheet sheet = wb.getSheet("Sheet1");
		     
		    //get the email id of first cell
		      obj[0][0]= sheet.getRow(0).getCell(0).toString();
			  obj[0][1] = sheet.getRow(0).getCell(1).toString();
			  
			  obj[1][0]= sheet.getRow(1).getCell(0).toString();
			  obj[1][1] = sheet.getRow(1).getCell(1).toString();
		    
		      return obj;   
	   }
	   
}
