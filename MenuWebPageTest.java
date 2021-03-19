package com.webOrder.testPages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.pages.CheckOutPage;
import com.webOrder.pages.MenuWeb;
import com.webOrder.pages.OrderTypePage;
import com.webOrders.base.BaseClass;
import com.webOrders.resources.ScreenShots;

public class MenuWebPageTest extends BaseClass {
	OrderTypePage ordertype;
	ScreenShots scr;
	MenuWeb menuweb;
	OrderTypePageTest ordertypetest;
	CheckOutPage checkoutpage;
  public MenuWebPageTest() throws IOException {
		super();
		
	}
@Test(priority = 1,groups = {"Food"})
  public void Verify_clickOnFoodMenu() {
	menuweb.clickOnFoodMenu();
  }
@Test(priority = 2,groups = {"Food"})
public void Verify_clickOnItemMod() {
	menuweb.clickOnItemMod();
}
@Test(priority = 3,groups = {"Food"})
public void Verify_selectIDM1() {
	menuweb.selectIDM1();
}
@Test(priority = 4,groups = {"Food"})
public void Verify_clickOnAddCart() {
	menuweb.clickOnAddCart();
}
@Test(priority = 5,groups = {"Food"})
public void Verify_selectIDM2() {
	menuweb.selectIDM2();
}
@Test(priority = 6,groups = {"Food"})
public void verify_clickOnAddCart() {
	menuweb.clickOnAddCart();
}
@Test(priority = 7,groups = {"Food"})
public void verify_CheckOutAmount() throws IOException {
	
	 menuweb.CheckOut();
	
	//Assert.assertEquals(actual, "");
	
}
  @BeforeClass(groups = {"Food"})
  public void initilizeBrowser() throws IOException {
	  
	  ordertype = new OrderTypePage();
		scr = new ScreenShots();
		menuweb = new MenuWeb();
	  ordertypetest = new OrderTypePageTest();
	  checkoutpage = new CheckOutPage();
	  }
  @AfterMethod(groups = {"Food"})
 	public void screenshots_failedtcs(ITestResult result) {
 		scr.screenshots_failedtcs(result);
 		
 	
 	}
}
