import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.webOrders.base.BaseClass;

public class CartCheckOutPage extends BaseClass {
By Checkout = By.xpath("//*[@id=\"cart_view\"]/div[1]/div[3]/div[3]/div[4]/a/div");
WebElement CheckOut;
	public CartCheckOutPage() throws IOException {
		super();
		
	}

}
