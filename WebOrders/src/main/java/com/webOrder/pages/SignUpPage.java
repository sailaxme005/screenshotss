package com.webOrder.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webOrders.base.BaseClass;
import com.webOrders.resources.TestUtils;

public class SignUpPage extends BaseClass {
	By Name_signup = By.xpath("//*[@id=\"uname1\"]");
	By Email_signup = By.xpath("//*[@id=\"uemail1\"]");
	By pwd_signup = By.xpath("//*[@id=\"upwd1\"]");
	By confirmPwd_signup = By.xpath("//*[@id=\"upwdcnf1\"]");
	By Phone_signup = By.xpath("//*[@id=\"uphone1\"]");
	By acceptTC_signup = By.id("std_flag1");
	By Tickbox_signup = By.id("prm_flag1");
	By SignMeUp_signup = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[2]/div/div/div/div[3]/div/div/div[2]");
	By ContinueAsGuest_signup = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[2]/div/div/div/div[3]/div/div/div[1]/button");
	
	public SignUpPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	public void fillUpSignup(String name,String email, String password, String Cnfpasswd, String Phone) {
//	WebDriverWait wait =  new WebDriverWait(driver,30);
//	wait.until(ExpectedConditions.elementToBeSelected(Name_signup));
	driver.findElement(Name_signup).sendKeys(name);
	driver.findElement(Email_signup).sendKeys(email);
	driver.findElement(pwd_signup).sendKeys(password);
	driver.findElement(confirmPwd_signup).sendKeys(Cnfpasswd);
	driver.findElement(Phone_signup).sendKeys(Phone);
	//driver.findElement(acceptTC_signup).click();
	driver.findElement(Tickbox_signup).click();
	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	

	}
	public void clickOnSignMeUp() {
		driver.findElement(SignMeUp_signup).click();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}
	public void clickOnContinueAsGuest() {
		driver.findElement(ContinueAsGuest_signup).click();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		
	}

}
