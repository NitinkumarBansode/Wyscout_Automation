package com.wyscout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public void loginbrowser() throws Exception {
		driver = Base.setup("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://platformrc.wyscout.com/app/?");
		driver.findElement(By.id("login_username")).sendKeys("nlbansode@gmail.com");
		driver.findElement(By.id("login_password")).sendKeys("pw_IndiaTest!");
		driver.findElement(By.id("login_button")).click();
		System.out.println("Login successsully");

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// to close the browser
		driver.close();
	}

	public static void main(String[] args) {

		try {
			new LoginPage().loginbrowser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
