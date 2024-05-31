package com.crm.ExtendFileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile 
{
	 public static String propertyFile(String key) throws IOException 
	   {
		   //create object of property file
		   Properties prop = new Properties();
		   
		   //Create object of FileInputStream class
		   FileInputStream fis = new FileInputStream("src\\test\\resources\\importantDetails.properties");
		   
		   //Load the data of properties file in given path
			 prop.load(fis);
			
		    //get the data from properties file
			String data = prop.getProperty(key);
			 
			//get the value
			return data;
	   }
}
