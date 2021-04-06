package com.webOrder.testPages;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webOrder.pages.CartCheckOutPage;
import com.webOrder.pages.ContinueAsGuestPage;
import com.webOrder.pages.DeliveryAddressPage;
import com.webOrder.pages.ItemsPage;
import com.webOrder.pages.OrderTypePage;
import com.webOrders.base.BaseClass;
import com.webOrders.resources.ScreenShots;

public class DeliveryAddressPageTest extends BaseClass{
	OrderTypePage ordertype;
	ItemsPage itemspage;
	CartCheckOutPage cartcheckout;
	ContinueAsGuestPage continueasguest;
	DeliveryAddressPage deliveryaddresspage;
	ScreenShots scr;
  public DeliveryAddressPageTest() throws IOException {
		super();
		ordertype = new OrderTypePage();
		itemspage = new ItemsPage();
		cartcheckout = new CartCheckOutPage();
		continueasguest = new ContinueAsGuestPage();
		deliveryaddresspage = new DeliveryAddressPage();
		scr = new ScreenShots();
	}

@Test(priority = 1)

  public void verify_ClickOnProceed() throws IOException, InterruptedException {
	ordertype.clickOnDelivery();
	ordertype.enterPostCode(prop.getProperty("Postcode"));
	ordertype.clickOnProceed();
  }
@Test(priority =2)
public void verify_clickOnItems() throws InterruptedException {
	itemspage.clickOnItemsCat();
	itemspage.clickOnItemAdd();
	//itemspage.clickOnAddMore();
	itemspage.clickOnAddCartButton();
}
@Test(priority = 3)
public void verify_clickOnCartCheckOut() {
	cartcheckout.clickOnCartCheckOut();
}
@Test(priority =  4)
public void verify_clickOnContinuAsGuest() {
	continueasguest.clickOnContinuAsGuest();
	continueasguest.enterDetails(prop.getProperty("Name"), prop.getProperty("Email1"), prop.getProperty("Phone"));
	continueasguest.clickOnNext();
}
//@Test(priority = 6)
//public void verify_clickOnFindAddress() {
//	deliveryaddresspage.clickOnFindAddress();
//	deliveryaddresspage.validateStreet();
//	deliveryaddresspage.validateCity();
//	deliveryaddresspage.enterDoor(prop.getProperty("Door_Flat"));
//	deliveryaddresspage.clickOnNext();
//}
//@Test(priority =  5)
//public void verify_clickOnChangeAddress() {
//	deliveryaddresspage.clickOnChangeAddress();
//	deliveryaddresspage.enterPostCode(prop.getProperty("Change_PostCode"));
//	deliveryaddresspage.clickOnProceedInChangePostcode();
//}
@Test(priority = 5)
public void verify_clickOnCustomAddress() {
	deliveryaddresspage.clickOnCustomAddress();
	deliveryaddresspage.enterStreet(prop.getProperty("New_Address"));
	deliveryaddresspage.enterCity(prop.getProperty("New_City"));
	deliveryaddresspage.enterDoor(prop.getProperty("Door_Flat"));
	deliveryaddresspage.clickOnNext();
}
@BeforeClass
public void Browser_initilization() {
	initlization();
}
@AfterMethod
public void screenshots_failedtcs(ITestResult result) {
	scr.screenshots_failedtcs(result);

}
}
