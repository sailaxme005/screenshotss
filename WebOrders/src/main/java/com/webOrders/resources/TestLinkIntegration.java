package com.webOrders.resources;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

public class TestLinkIntegration extends TestListenerAdapter {
	WebDriver driver;
	public static String DEV_KEY ="89cd4edc74d7f2935c87b358e6072ff6";
	public static String url = "http://35.223.207.87/lib/api/xmlrpc/v1/xmlrpc.php";
//	 String testProject ="Test_TestLink";
//	  String testPlan="Test_TestLink_Plan";
//	  String testCase="Test_TestLink_Url_Tc";
//	  String build="Test_TestPlan_Build1.0";
//	  String notes=null;
//	  String result=null; 
	public static void reportResult(String TestProject, String TestPlan,String TestCase, String Build, String Notes, String Result) throws TestLinkAPIException {
		TestLinkAPIClient api = new TestLinkAPIClient(DEV_KEY, url);
		api.reportTestCaseResult(TestProject, TestPlan, TestCase, Build, Notes, Result);
	}

}
