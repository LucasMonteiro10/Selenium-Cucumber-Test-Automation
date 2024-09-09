package com.swaglabs.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.ProductsPage;
import com.swaglabs.utils.Hooks;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	private WebDriver driver;
	private WebDriverWait wait;
	private LoginPage loginPage;
	
	public LoginSteps() {
		this.driver = Hooks.driver;
		this.wait = Hooks.wait;
		this.loginPage = new LoginPage(driver, wait);
	}
	
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		driver.get("https://www.saucedemo.com/");
	}
	
	@When("I enter the following values on login form")
	public void i_enter_the_following_values_on_login_form(DataTable dataTable) {
		loginPage.waitForLoginPageIsFullyLoaded();
		
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		for (Map<String, String> row : data) {
			String field = row.get("Field");
			String value = row.get("Value");
			
			switch (field) {
				case "Username":
					loginPage.fillUsername(value);
					break;
				case "Password":
					loginPage.fillPassword(value);
					break;
				default:
					throw new IllegalArgumentException("Invalid field: " + field);
			}
		}
	}
	
    @And("I click on the Login button")
	public void i_click_on_the_login_button() {
    	loginPage.clickOnLoginButton();
    }
    
}
