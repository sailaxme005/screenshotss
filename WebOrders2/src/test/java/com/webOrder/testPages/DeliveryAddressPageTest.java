package com.webOrder.testPages;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.pages.ItemsPage;
import com.webOrder.pages.OrderTypePage;
import com.webOrders.base.BaseClass;

public class DeliveryAddressPageTest extends BaseClass{
	OrderTypePage ordertype;
	ItemsPage itemspage;
  public DeliveryAddressPageTest() throws IOException {
		super();
		ordertype = new OrderTypePage();
		itemspage = new ItemsPage();
	}

@Test

  public void verify_ClickOnProceed() throws IOException {
	ordertype.clickOnDelivery();
	ordertype.clickOnProceed();
  }
public void verify_clickOnItems() {
	itemspage.clickOnItemsCat();
	itemspage.clickOnItemAdd();
	itemspage.clickOnAddMore();
	itemspage.clickOnAddCartButton();
}
@BeforeClass
public void Browser_initilization() {
	initlization();
}
}
