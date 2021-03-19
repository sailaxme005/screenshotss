package com.webOrder.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webOrders.base.BaseClass;
import com.webOrders.resources.TestUtils;

public class OrderTypePage extends BaseClass{
By collection = By.id("collection_btn");

By Delivery = By.id("delivery_btn");

By postcode = By.id("postcode");

By radio_yes= By.id("preorder_yes_id");

By radio_no =  By.id("preorder_no_id");

By Browse_Menu = By.xpath("button[@class='one']");


By Proceed = By.xpath("//*[@id=\"order_type_display\"]/div[2]/div[4]/div/div/button[2]");
public OrderTypePage() throws IOException {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
public void clickOnCollections() {
	 driver.findElement(collection).click();
}
public void clickOnDelivery() {
	driver.findElement(Delivery).click();
	
	
}
public void enterPostCode(String Ps) {
	driver.findElement(postcode).sendKeys(Ps);
}
public boolean selectYes() {
	return driver.findElement(radio_yes).isEnabled();
}
public boolean selectNo() {
	return driver.findElement(radio_no).isEnabled();
}
public void clickOnBrowse() {
	driver.findElement(Browse_Menu).click();
}
public MenuWeb clickOnProceed() throws IOException {
	
	driver.findElement(Proceed).click();
	driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	return new MenuWeb();
}


}
