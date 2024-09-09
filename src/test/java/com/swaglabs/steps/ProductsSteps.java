package com.swaglabs.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swaglabs.pages.ProductsPage;
import com.swaglabs.utils.Hooks;

import io.cucumber.java.en.Then;

public class ProductsSteps {
	private WebDriver driver;
	private WebDriverWait wait;
	private ProductsPage productsPage;
	
	public ProductsSteps() {
		this.driver = Hooks.driver;
		this.wait = Hooks.wait;
		this.productsPage = new ProductsPage(driver, wait);
	}
	
    @Then("I should be redirected to the products page") 
    public void i_should_be_redirected_to_the_products_page(){
    	productsPage.assertIsOnProductsPage();
    }
}
