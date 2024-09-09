package com.swaglabs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swaglabs.locators.ProductsLocators;

public class ProductsPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public ProductsPage(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public void assertIsOnProductsPage() {
		wait.until(ExpectedConditions.presenceOfElementLocated(ProductsLocators.assertIsOnProductsPage()));
		
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(ProductsLocators.assertIsOnProductsPage()));
            System.out.println("Element is present.");
        } catch (Exception e) {
            System.out.println("Element is not present.");
        }
	}
}
