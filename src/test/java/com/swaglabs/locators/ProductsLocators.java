package com.swaglabs.locators;

import org.openqa.selenium.By;

public class ProductsLocators {
	
	public static By assertIsOnProductsPage() {
		return By.xpath("//span[text()[contains(.,'Products')]]");
	}
}
