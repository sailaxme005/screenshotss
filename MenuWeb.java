package com.webOrder.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.webOrders.base.BaseClass;
import com.webOrders.resources.TestUtils;

public class MenuWeb extends BaseClass {
	By Food_Menu = By.xpath("//*[@id=\"accordion\"]/div[1]/div[1]/h4/a/p/span/small");
	By item_Mod = By.linkText("Item Mod");
	By IDM1_Choose = By.xpath("//*[@id=\"items\"]/div/div[2]/div/div/div[1]/div[2]/div/div[2]/div/button");
	By Add_Cart_IDM1 = By.xpath("//*[@id=\"addtocart\"]");
	By IDM2_Choose = By.xpath("//*[@id=\"items\"]/div/div[2]/div/div/div[3]/div[2]/div/div[2]/div/button");
	By Add_Cart_IDM2 = By.xpath("//*[@id=\"addtocart\"]");
	By CheckOut = By.xpath("//*[@id=\"checkout_total\"]/h3");
	
	public MenuWeb() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnFoodMenu() {
		driver.findElement(Food_Menu).click();
		System.out.println("Food Menu clicked..");
	}
	public void clickOnItemMod() {
		driver.findElement(item_Mod).click();
		System.out.println("item Mod clicked...");
	}
	public void selectIDM1() {
		driver.findElement(IDM1_Choose).click();
		System.out.println("IDM1 item selected...");
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICITY_WAIT, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Add_Cart_IDM1));
		System.out.println("Page load1 completed..");
	}
	public void selectIDM2() {
		driver.findElement(IDM2_Choose).click();
		System.out.println("IDM1 item selected...");
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		System.out.println("Page load2 completed..");
	}
	public void clickOnAddCart() {
		driver.findElement(Add_Cart_IDM1).click();
		driver.get(driver.getCurrentUrl());
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		System.out.println("Add Cart Clicked...");
	}
	public CheckOutPage CheckOut() throws IOException {
		
		
		String actual = driver.findElement(CheckOut).getText();
		
		System.out.println(actual);
		String expected = "�9.00";
		Assert.assertEquals(actual, expected);
		driver.findElement(CheckOut).click();
		//return ((WebElement) CheckOut).getText();
		return new CheckOutPage();
	}

}
