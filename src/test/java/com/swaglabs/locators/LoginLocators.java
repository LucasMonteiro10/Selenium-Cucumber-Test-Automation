package com.swaglabs.locators;

import org.openqa.selenium.By;

public class LoginLocators {

	public static By userNameField() {
		return By.id("user-name");
	}

	public static By passwordField() {
		return By.id("password");
	}

	public static By loginButton() {
		return By.id("login-button");
	}

}
