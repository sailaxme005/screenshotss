package com.webOrder.testPages;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.pages.LoginPage1;
import com.webOrder.pages.SignUpPage;
import com.webOrders.base.BaseClass;
import com.webOrders.resources.ScreenShots;

public class SignUpPageTest extends BaseClass{
	LoginPage1 loginpage;
	ScreenShots scr;
	SignUpPage signup;
  public SignUpPageTest() throws IOException {
		super();
		loginpage = new LoginPage1();
		scr = new ScreenShots();
		signup = new SignUpPage();
	}
@Test(priority =1)
  public void verify_clickOnBrowse_Menu() throws InterruptedException{
	loginpage.clickOnBrowse_Menu();
  }
@Test(priority = 2)
public void verify_clickOnLogin() throws InterruptedException {
	loginpage.clickOnLogin();
}
@Test(priority = 3)
public void verify_clickOnSignUp_login() throws IOException {
	loginpage.clickOnSignUp_login();
}
@Test(priority = 4)
public void verify_fillUpSignup() {
	signup.fillUpSignup(prop.getProperty("Name"), prop.getProperty("Email1"), prop.getProperty("password"), prop.getProperty("confirm_password"), prop.getProperty("Phone"));
}
@Test(priority = 5)
public void verify_clickOnSignMeUp() {
	signup.clickOnSignMeUp();
}
@Test(priority = 6)
public void verify_clickOnContinueAsGuest() {
	signup.clickOnContinueAsGuest();
}
  @BeforeClass
  public void Browser_init() {
	  initlization();
	  System.out.println("signup page..");
  }
  @AfterMethod
 	public void screenshots_failedtcs(ITestResult result) {
 		scr.screenshots_failedtcs(result);
 	
 	}
}
