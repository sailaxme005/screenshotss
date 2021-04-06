package com.webOrder.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.webOrders.base.BaseClass;

public class ItemsPage extends BaseClass {
By ItemsCat = By.xpath("//*[@id=\"category_id_1\"]/p/span/small");
By ItemAdd = By.xpath("//*[@id=\"items\"]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/button");
By AddMore = By.xpath("//*[@id=\"item_v2\"]/div/div/div/div/div[3]/div/button/a[2]/span/svg");
By AddCartButton = By.xpath("//*[@id=\"item_v2\"]/div/div/div/div/div[4]/div/div/div/button");
	public ItemsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	public void clickOnItemsCat() throws InterruptedException {
		WebElement itemcart = driver.findElement(ItemsCat);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", itemcart);
		Thread.sleep(10000);
	}
	public void clickOnItemAdd() throws InterruptedException {
		WebElement add = driver.findElement(ItemAdd);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", add);
		Thread.sleep(10000);
	}
//	public void clickOnAddMore() {
//		for(int i=0; i<9; i++) {
//			driver.findElement(AddMore).click();
//		}
		
//	}
	public void clickOnAddCartButton() {
		driver.findElement(AddCartButton).click();
	}

}
