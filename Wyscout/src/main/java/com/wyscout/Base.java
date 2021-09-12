package com.wyscout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	static WebDriver driver;

	public static WebDriver setup(String browser) throws Exception {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Wyscout_Automation\\Wyscout\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} else {
			throw new Exception("Browser is not correct");

		}

		return driver;
	}
}
