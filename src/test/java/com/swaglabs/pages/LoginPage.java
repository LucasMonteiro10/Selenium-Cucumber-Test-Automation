package com.swaglabs.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swaglabs.locators.LoginLocators;

public class LoginPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void waitForLoginPageIsFullyLoaded() {
		ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};
		
	}	

	public void fillUsername(String value) {
		wait.until(ExpectedConditions.presenceOfElementLocated(LoginLocators.userNameField()));
		
		driver.findElement(LoginLocators.userNameField()).sendKeys(value);;
	}

	public void fillPassword(String value) {
		wait.until(ExpectedConditions.presenceOfElementLocated(LoginLocators.passwordField()));
		
		driver.findElement(LoginLocators.passwordField()).sendKeys(value);;
	}

	public void clickOnLoginButton() {
		wait.until(ExpectedConditions.presenceOfElementLocated(LoginLocators.loginButton()));
		
		driver.findElement(LoginLocators.loginButton()).click();
	}
	
}
