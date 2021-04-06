package com.webOrder.testPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.pages.OrderTypePage;
import com.webOrders.base.BaseClass;
import com.webOrders.resources.Retry;
import com.webOrders.resources.TestLinkIntegration;

import testlink.api.java.client.TestLinkAPIResults;

public class DemoTc extends BaseClass {
	OrderTypePage ordertype;
	 String testProject ="Web_Order";
	  String testPlan="Web_Orders_TestPlan";
	  String testCase="Check_Order_Type_Page_Screen_Functionality";
	  String build="Web_Orders_Build";
	  String notes=null;
	  String result=null;
	public DemoTc() throws IOException {
		super();
		ordertype = new OrderTypePage();
		
	}
	@BeforeClass
	public void Browser_initilization() {
		initlization();
	}
	@Test(retryAnalyzer = Retry.class)
	public void DemoMethod() throws Exception {

		try {

			ordertype.clickOnDelivery();
			
//			Actions builder = new Actions(driver);
//			builder.moveToElement(avatar).build().perform();

//			WebDriverWait wait = new WebDriverWait(driver, 5);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("figcaption")));
//
			System.out.println("####################################################################");
			result = TestLinkAPIResults.TEST_PASSED;
			notes = getOSBrowserDetails();

		} catch (Exception e) {

			result = TestLinkAPIResults.TEST_FAILED;
			notes = e.getMessage();
			e.printStackTrace();

		} catch (AssertionError e) {

			String message = e.getMessage();
			System.out.println(message);
			result = TestLinkAPIResults.TEST_FAILED;
			notes = e.getMessage();
			e.printStackTrace();
			Assert.fail();

		} finally {

			System.out.println("Updating TestCase Execution Status in TestLink");
			TestLinkIntegration.reportResult(testProject, testPlan, testCase, build, notes, result);
		}

	}
	private String getOSBrowserDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
