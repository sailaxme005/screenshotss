package com.webOrder.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.webOrders.base.BaseClass;
import com.webOrders.resources.TestUtils;

public class ContinueAsGuestPage extends BaseClass{

By Name_CAG = By.xpath("//input[contains(@name,'guest_name')]");
By Email_CAG = By.xpath("//input[contains(@name,'guest_email')]");
By Phone_CAG = By.xpath("//input[contains(@name,'guest_phone')]");
By radio_CAG = By.id("prm_flag21");
By ContinueAsGuest = By.xpath("//button[@onclick='guest_signup();'][contains(.,'Checkout As Guest')]");
By login = By.xpath("//*[@id=\"login_popup\"]/div/div/div/div/div[3]/div/div/div/div[3]/div/div/div[1]/button");
	public ContinueAsGuestPage() throws IOException {
		super();
		
	}
	public void enterDeatilsinContinueAsGuest(String name, String Email,String phone) {
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		WebElement Name_CAG1 = driver.findElement(Name_CAG);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",Name_CAG1 );
		Name_CAG1.sendKeys(name);

//	WebElement name_cag =	driver.findElement(Name_CAG);
//	WebDriverWait wait1 = new WebDriverWait(driver, 20);
//	wait1.until(ExpectedConditions.visibilityOfElementLocated(Name_CAG));
//	name_cag.sendKeys(name);
	
		WebElement Email_CAG1 = driver.findElement(Email_CAG);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()",Email_CAG1 );
		Email_CAG1.sendKeys(Email);
		//driver.findElement(Email_CAG).sendKeys(Email);
		WebElement Phone_CAG1 = driver.findElement(Phone_CAG);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("arguments[0].click()",Phone_CAG1 );
		Phone_CAG1.sendKeys(phone);
//		
		//driver.findElement(Phone_CAG).sendKeys(phone);
		//driver.findElement(radio_CAG).click();
		
	}
	public void clickOnContinueAsGuest_CAG() {
		WebElement ContinueAsGuest1 = driver.findElement(ContinueAsGuest);
		JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("arguments[0].click()",ContinueAsGuest1 );
		
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}
	

}
