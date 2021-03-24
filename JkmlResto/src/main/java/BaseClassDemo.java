import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClassDemo {
	public	AppiumDriver driver;
	public	Properties prop;
		public BaseClassDemo() throws IOException {
			prop = new Properties();
			FileInputStream ip =  new FileInputStream("C:\\Users\\Bala koti\\eclipse-workspace\\JkmlResto\\config\\config.properties");
			prop.load(ip);
			}
		
		public void initilization() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", prop.getProperty("platformName", "platform is andriod"));
		dc.setCapability("platformVersion", prop.getProperty("platformVersion"));
		dc.setCapability("deviceName", prop.getProperty("deviceName"));
		dc.setCapability("udid", prop.getProperty("udid"));
		dc.setCapability("appPackage", prop.getProperty("appPackage"));
		dc.setCapability("appActivity", prop.getProperty("appActivity"));
		URL url = new URL("http://127.0.0.1:4723/wd/hub"); 
		 driver = new AppiumDriver<MobileElement>(url, dc);
		}
				

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BaseClassDemo b = new BaseClassDemo();
		b.initilization();

	}

}
