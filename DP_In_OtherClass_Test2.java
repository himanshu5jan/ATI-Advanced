package testng.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import testng.src.TestDataProviders2;

public class DP_In_OtherClass_Test2 {
	
	@Test(dataProviderClass=TestDataProviders2.class,dataProvider="dp1")
	public void NegativeScenarioTests(String name, int age) {
		System.out.println("**********Sample Test 2**************");
		System.out.println("Arg 1 (name) : "+name);
		System.out.println("Arg 2 (age): "+age);
	}
	
	@Test(dataProviderClass=TestDataProviders2.class,dataProvider="dp1")
	public void positiveScenarioTests(String role, String link, String flag) {
		System.out.println("**********Sample Test 1**************");
		System.out.println("Arg 1 (role): "+role);
		System.out.println("Arg 2 (link): "+link);
		System.out.println("Arg 3 (status): "+flag);
	}
	
	@AfterMethod
	public void afterTest(ITestResult result) {
		//get test result
		boolean resultValue=result.isSuccess();
		//get testmethodname
		String testMethodName=result.getName();
		if(result.getStatus() == ITestResult.FAILURE) {
			//if successful 
			System.out.println("Test Case Result : "+resultValue);
			System.out.println("Test Case Method Name : "+testMethodName);
		
		} else {
			//if failed
			System.out.println("Test Case Result : "+resultValue);
			System.out.println("Test Case Method Name : "+testMethodName);
		}
	}
	
	

}
