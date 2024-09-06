Feature: Login functionality

    Scenario: Login with valid credentials
        Given I am on the login page
        When I enter "standard_user" in the Username field
        And I enter "secret_sauce" in the Password field
        And I click on the "Login" button
        Then I should be redirected to the main page

    Scenario: Login with invalid credentials
        Given I am on the login page
        When I enter "invalid_user" in the Username field
        And I enter "wrong_password" in the Password field
        And I click on the "Login" button
        Then I should see an error message "Epic sadface: Username and password do not match any user in this service"

    Scenario: Login with blank credentials
        Given I am on the login page
        When I click on the "Login" button
        Then I should see an error message "Epic sadface: Username is required"
