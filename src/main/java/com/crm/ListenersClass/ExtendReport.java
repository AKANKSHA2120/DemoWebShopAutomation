package com.crm.ListenersClass;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReport implements ITestListener
{
   public ExtentSparkReporter spark;
   public ExtentReports report;
   public ExtentTest test;
   
	@Override
	public void onTestStart(ITestResult result) {
		 String name = result.getMethod().getMethodName();
		 test=report.createTest(name);
		 System.out.println("OnTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 System.out.println("OnTestSuccess");
		 String name = result.getMethod().getMethodName();
		 test.log(Status.PASS, name+" "+"is passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		  System.out.println("OnTestFailure");
		  String name = result.getMethod().getMethodName();
			 test.log(Status.FAIL, name+" is Failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 System.out.println("OnTestSkipped");
		 String name = result.getMethod().getMethodName();
		 test.log(Status.SKIP, name+" "+"is Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		 System.out.println("OnStart");
		 //create path of file
			File path = new File(".//ExtentReport/ExReport.html");
			spark = new ExtentSparkReporter(path);
			
			//config the report
			spark.config().setDocumentTitle("DemoWebShop");
			spark.config().setReportName("Manikandan sir");
			spark.config().setTheme(Theme.STANDARD);
			
			//create object of report
			report = new ExtentReports();
			report.setSystemInfo("OS", "Windows 10");
			report.setSystemInfo("Browser", "Google Chrome");
			report.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		 System.out.println("OnFinish");
		 report.flush();
	}
  
}
