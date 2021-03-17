package com.epos.utils;

import org.testng.annotations.Test;


	

	import java.io.IOException;

	import org.testng.ITestContext;
	import org.testng.ITestResult;
	import org.testng.TestListenerAdapter;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.markuputils.ExtentColor;
	import com.aventstack.extentreports.markuputils.MarkupHelper;
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class Listeners extends TestListenerAdapter {
	 
		public void onFinish(ITestContext testContext) {
			// TODO Auto-generated method stub
		  extent.flush();
			super.onFinish(testContext);
		}


	ExtentSparkReporter htmlreport;
	  ExtentReports extent;
	  ExtentTest testreport;
		public void onTestSuccess(ITestResult tr) {
			// TODO Auto-generated method stub
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
			//super.onTestSuccess(tr);
			System.out.println("test success");
		}


		public void onTestFailure(ITestResult tr) {
			// TODO Auto-generated method stub
			//super.onTestFailure(tr);
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
//			 String screenshotPath=System.getProperty("user.dir")+"\\Screenshots\\"+tr.getName()+".png";
//			  testreport.fail("Screenshot is below:" + testreport.addScreenCaptureFromPath(screenshotPath)); 
			 }
			


		public void onTestSkipped(ITestResult tr) {
			// TODO Auto-generated method stub
			//super.onTestSkipped(tr);
			testreport = extent.createTest(tr.getName());
			testreport.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.BLUE));
			System.out.println("test skipped");
		}

		
		public void onStart(ITestContext testcontext) {
			// TODO Auto-generated method stub
			htmlreport = new ExtentSparkReporter("C:/Users/Bala koti/Downloads/eclipse-practice/EposPom/extentreports/extent.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlreport);
			htmlreport.config().setDocumentTitle("EPOS Automation");
			
			//super.onTestStart(result);
			System.out.println(("test started"));
		}


	}



