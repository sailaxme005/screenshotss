package com.webOrder.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.AbstractParallelWorker.Arguments;
import org.testng.util.TimeUtils;

import com.webOrders.base.BaseClass;

public class LoginPage1 extends BaseClass {
	//Object Repository
	By Browse_Menu = By.xpath("//*[@id=\"order_type_display\"]/div[2]/div[4]/div/div/button[1]");
	By Login = By.xpath("/html/body/div[4]/div/div/div/div[3]/div");
	By Email = By.id("user_email1");
	By password = By.id("user_pwd1");
	By Login_login = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[1]/div/div/div/div[3]/div/div/div[2]/button");
	By SignUp_login = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[1]/div/div/div/div[3]/div/div/div[1]/button");
	By ForgotPassword = By.id("fb-pwd");
	By Email_fp = By.xpath("//input[@type='text'][contains(@id,'f1')]");
	By Submit = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[4]/div/div/div/div[3]/div/div/div[2]/button");
	By Login_fp = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[4]/div/div/div/div[3]/div/div/div[1]/button");
	//Object Initialization
	public LoginPage1() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnBrowse_Menu() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//	    WebElement BrowseMenuElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"order_type_display\"]/div[2]/div[4]/div/div/button[1]")));
//	    BrowseMenuElement.click();			
//	    Thread.sleep(10000);
		WebElement ClickOnBrowse_Menu = driver.findElement(Browse_Menu);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ClickOnBrowse_Menu);
		 Thread.sleep(6000);
	}
	public void clickOnLogin() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
//	    WebElement LoginElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div/div/div/div[3]/div")));
//	    LoginElement.click();
	   
		WebElement Login_Menu = driver.findElement(Login);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",Login_Menu );
		

	}
	public void clickOnLogincreds(String email, String pwd) {
		driver.findElement(Email).sendKeys(email);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(Login_login).click();
		
		
	}
	public void clickOnForgotPassword() {
		WebElement ele = driver.findElement(ForgotPassword);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(ele)).click();
		
	}
	
	public void enterDetailsInEmail(String email) throws InterruptedException {
		Thread.sleep(10000);
	//	WebElement Email_fp1 =driver.findElement(Email_fp);
//		WebDriverWait wait3 = new WebDriverWait(driver, 20);
//		wait3.until(ExpectedConditions.elementToBeSelected(Email_fp1));
//		Email_fp1.sendKeys(email);
		WebElement email1 = driver.findElement(Email_fp);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",email1 );
		email1.sendKeys(email);
	}
	public void clickOnSubmit() {
	
		WebElement submit = driver.findElement(Submit);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(submit)).click();
		
				
	}
	public void clickOnLogInFp() {
		driver.findElement(Login_fp).click();
	}
	public SignUpPage clickOnSignUp_login() throws IOException{
		driver.findElement(SignUp_login).click();
		
		

		return new SignUpPage();
		
	}

}
