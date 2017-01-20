package com.jira.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jira.pages.LoginPage;

public class LoginPageTest2 {

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
    public void jiraLoginTest() {
    	jira.log_into_jira("<username>", "<password>");
    }
    
	
}
