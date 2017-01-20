package com.jira.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.jira.pages.LoginPage;

public class LoginPageTest {
    WebDriver driver;
    LoginPage jira;
	
    @BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "c:\\BDrivers\\chromedriver.exe"); 
    	driver=new ChromeDriver();
    	driver.get("<jira url>");
    	
    	jira=new LoginPage(driver);
    }
	
	@Test
	public void login1Test () {
		jira.enterUserName("<jira login>");
		jira.goNext();
		jira.enterPassword("<jira password>");
		jira.clickLogin();
	}
	
	@AfterTest
	public void login2Test(ITestResult result) {
		if(result.isSuccess()) {
			System.out.println("SUCCESSFULL");
		} else {
			System.out.println("FAILURE");
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
	}
}
