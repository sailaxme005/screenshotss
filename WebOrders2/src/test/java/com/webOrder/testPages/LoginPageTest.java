package com.webOrder.testPages;

import org.testng.annotations.Test;


import com.webOrder.pages.LoginPage1;
import com.webOrder.pages.OrderTypePage;
import com.webOrders.base.BaseClass;
import com.webOrders.resources.ScreenShots;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public class LoginPageTest extends BaseClass {
	OrderTypePage ordertype;
	LoginPage1 loginpage;
	ScreenShots scr;
  public LoginPageTest() throws IOException {
		super();
		ordertype = new OrderTypePage();
		loginpage = new LoginPage1();
		scr = new ScreenShots();

	}
  @Test(priority = 1)
  public void Verify_clickOnBrowse_Menu() throws IOException, InterruptedException {
	  loginpage.clickOnBrowse_Menu();
  }
  @Test(priority = 2)
  public void Verify_ClickOnLogin() throws InterruptedException {
	  loginpage.clickOnLogin();
	 // Assert.assertTrue(ExpectedConditions.ti, null);
  }
@Test(priority = 3)
  public void verify_clickOnLogincreds() throws IOException {
	loginpage.clickOnLogincreds(prop.getProperty("Email"), prop.getProperty("password"));
  }
  @BeforeSuite
  public void beforeSuite() {
	  initlization();
	  System.out.println("loginpage..");
  }
  @AfterMethod
	public void screenshots_failedtcs(ITestResult result) {
		scr.screenshots_failedtcs(result);
	
	}

}
