package com.webOrder.testPages;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.pages.LoginPage1;
import com.webOrders.base.BaseClass;
import com.webOrders.resources.ScreenShots;

public class ForgotPassword extends BaseClass {
	LoginPage1 loginpage;
	ScreenShots scr;
  public ForgotPassword() throws IOException {
		super();
		loginpage = new LoginPage1();
		scr = new ScreenShots();
	}

@Test(priority = 1)
  public void verify_clickOnBrowse_Menu() throws InterruptedException {
	loginpage.clickOnBrowse_Menu();
  }
@Test(priority = 2)
public void verify_clickOnLogin() throws InterruptedException {
	loginpage.clickOnLogin();
}
@Test(priority = 3)
public void verify_clickOnForgotPassword() {
	loginpage.clickOnForgotPassword();
}
@Test(priority = 4)
public void verify_enterDetailsInEmail() throws InterruptedException {
	loginpage.enterDetailsInEmail("harsha@fininfocom.com");
}
@Test(priority = 5)
public void verify_clickOnSubmit() {
	loginpage.clickOnSubmit();
}
@BeforeClass
public void Browser_init() {
	initlization();
	System.out.println("forgotpassword..");
}
@AfterMethod
	public void screenshots_failedtcs(ITestResult result) {
		scr.screenshots_failedtcs(result);
	
	}
}
