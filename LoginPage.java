package com.jira.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	private By unameInput=By.id("username");
	private By nextButton=By.id("login-submit");
	private By passInput=By.id("password");
	private By loginButton=nextButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName(String uname) {
		driver.findElement(unameInput).sendKeys(uname);
	}
	
	public void goNext() {
		driver.findElement(nextButton).click();
	}
	
	public void enterPassword(String passwd) {
    	WebElement we=driver.findElement(passInput);
    	WebDriverWait wait=new WebDriverWait(driver,20);
    	wait.until(ExpectedConditions.visibilityOf(we));
    	we.sendKeys(passwd);
	}
	
	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
	
	public void log_into_jira(String uname,String passwd) {
		enterUserName(uname);
		goNext();
		enterPassword(passwd);
		clickLogin();
	}
	public By getUnameInput() {
		return unameInput;
	}
	public void setUnameInput(By unameInput) {
		this.unameInput = unameInput;
	}
	public By getNextButton() {
		return nextButton;
	}
	public void setNextButton(By nextButton) {
		this.nextButton = nextButton;
	}
	public By getPassInput() {
		return passInput;
	}
	public void setPassInput(By passInput) {
		this.passInput = passInput;
	}
	public By getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(By loginButton) {
		this.loginButton = loginButton;
	}
	
}
