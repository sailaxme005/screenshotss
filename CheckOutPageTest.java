package com.webOrder.testPages;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.pages.CheckOutPage;
import com.webOrder.pages.CheckOutPage_payment;
import com.webOrder.pages.MenuWeb;
import com.webOrder.pages.OrderTypePage;
import com.webOrders.base.BaseClass;
import com.webOrders.resources.ScreenShots;

public class CheckOutPageTest extends BaseClass {
	OrderTypePage ordertype;
	ScreenShots scr;
	MenuWeb menuweb;
	OrderTypePageTest ordertypetest;
	CheckOutPage checkoutpage;
	CheckOutPage_payment checkpayments;
  public CheckOutPageTest() throws IOException {
		super();
		
	}
  @BeforeClass(groups = {"checkout"})
  public void initilizeBrowser1() throws IOException {
	 
	  ordertype = new OrderTypePage();
		scr = new ScreenShots();
		menuweb = new MenuWeb();
	  ordertypetest = new OrderTypePageTest();
	  checkoutpage = new CheckOutPage();
	  checkpayments = new CheckOutPage_payment();
  }

@Test(priority = 1,groups = {"checkout"})
  public void verify_clickOnContinueAsGuest() {
	checkoutpage.clickOnContinueAsGuest();
  }
@Test(priority = 2,groups = {"checkout"})
public void verify_enterDetails() {
	checkoutpage.enterDetails(prop.getProperty("Name"), prop.getProperty("Email"), prop.getProperty("Phone"));
	System.out.println("details entered");
}
@Test(priority = 3,groups = {"checkout"})
public void verify_clickOnNext() throws IOException {
	checkoutpage.clickOnNext();
	
}
@Test(priority = 4,groups= {"checkout"})
public void verify_clickOnAddItem() {
	  checkpayments.clickOnAddItem();
}
@Test(priority = 5,groups= {"checkout"})
public void verify_POD() {
	  checkpayments.POD();
}
@Test(priority = 6,groups= {"checkout"})
public void verify_paymentment() {
	  checkpayments.paymentment();
}
@AfterMethod(groups = {"checkout"})
	public void screenshots_failedtcs(ITestResult result) {
		scr.screenshots_failedtcs(result);
		
	
	}
}
