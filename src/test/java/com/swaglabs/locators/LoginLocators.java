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

	public static By errorMessage(String value) {
		return By.xpath(String.format("//h3[text() [contains(.,'%s')]]", value));
	}

}
