package com.jira.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	protected WebDriver driver;
    protected LoginPage jira;
	
    @BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "c:\\BDrivers\\chromedriver.exe"); 
    	driver=new ChromeDriver();
    	driver.get("http://himanshupandey.atlassian.net/");
    	
    	jira=new LoginPage(driver);
    }
    
    @AfterMethod
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
