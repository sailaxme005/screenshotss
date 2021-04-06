package webordertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abc {
	public static WebDriver driver;
	public void initlization()  {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bala koti\\eclipse\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome Opend...");
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc a = new Abc();
		a.initlization();
	}

}
