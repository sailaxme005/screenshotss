package com.webOrders.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.webOrders.resources.TestUtils;



public class BaseClass{
	public static WebDriver driver;
	public static Properties prop;
	public BaseClass() throws IOException {
		try {
			prop = new Properties();
			 FileInputStream ip = new FileInputStream("C:\\Users\\Bala koti\\eclipse-workspace\\WebOrders\\Config\\configs.properties");
			 prop.load(ip);
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public void initlization()  {
		String BrowserName = prop.getProperty("Browser");
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala koti\\eclipse\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Opend...");
			
		}else {
			System.out.println("no browser....");
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	    driver.get(prop.getProperty("URL"));
		
		driver.manage().window().maximize();
		
		
	}
}

