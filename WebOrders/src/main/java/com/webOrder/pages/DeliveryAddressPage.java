package com.webOrder.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.webOrders.base.BaseClass;

public class DeliveryAddressPage extends BaseClass{
	By Find_Address = By.id("search_pincode_addr");
	By Change_postcode = By.xpath("//*[@id=\"tab2\"]/div[2]/div/div[1]/div/div[2]/button[1]");
	By Change_postCode1 = By.xpath("//*[@id=\"tab2\"]/div[2]/div/div[1]/div/div[2]/button[1]");
	By Custom_address = By.xpath("//*[@id=\"manuall_btn\"]");
	By Street = By.id("suggestions");
	By City = By.id("delivery_city");
	By Door = By.id("delivery_doorno");
	By Change_PostCode = By.id("postcode_change");
	By Change_Proceed = By.xpath("//*[@id=\"pincode_popup\"]/div/div/div/div/div/div/div[2]/div/div/div[2]/button");
	By Address = By.id("delivery_addr");
	//By City1 = By.id("delivery_city");
	By Next = By.xpath("//*[@id=\"tab2\"]/div[3]/div/div/div/button");

	public DeliveryAddressPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnFindAddress() {
		driver.navigate().refresh();
		driver.findElement(Find_Address).click();
	}
	public void clickOnChangeAddress() {
		driver.navigate().refresh();
		driver.findElement(Change_postCode1).click();
	}
	public void enterPostCode(String postcode) {
		driver.findElement(Change_PostCode).sendKeys(postcode);
	}
	public void clickOnProceedInChangePostcode() {
		driver.findElement(Change_Proceed).click();
	}
	public void clickOnCustomAddress() {
		driver.navigate().refresh();
	driver.findElement(Custom_address).click();	
	}
	public void enterStreet(String street) {
		driver.findElement(Address).sendKeys(street);
	}
	public void enterAddress(String address) {
		driver.findElement(Address).sendKeys(address);
	}
	public void enterCity(String city) {
		driver.findElement(City).sendKeys(city);
	}
	public void enterDoor(String door) {
		driver.findElement(Door).sendKeys(door);
	}
	public void validateStreet() {
		WebElement list =driver.findElement(Street);
		Select dropdown = new Select(list);
		dropdown.selectByIndex(0);
	}
	public void validateCity() {
		driver.findElement(City).getText();
	}
	public void clickOnNext() {
		driver.findElement(Next).click();
	}

}
