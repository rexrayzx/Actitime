package com.generics.actitime;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.pages.actitime.ActitimeHomePage;
import com.pages.actitime.ActitimeLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant {
		public WebDriver driver;
		
		@BeforeClass
		public void openBrowser() {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
		}
		@BeforeMethod
		public void login() throws IOException {
			ActitimeLoginPage login=new ActitimeLoginPage(driver);
			login.loginMethod();
		}
		
		@AfterMethod
		public void logout() {
			ActitimeHomePage logout=new ActitimeHomePage(driver);
			logout.logoutMethod();
		}
		
		@AfterClass
		public void closeBrowser() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
}
