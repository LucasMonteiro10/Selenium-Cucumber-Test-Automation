Feature: Login functionality

		@working
    Scenario: Login with valid credentials
        Given I am on the login page
        When I enter the following values on login form
        | Field    | Value         |
        | Username | standard_user |
        | Password | secret_sauce  |
        And I click on the Login button
#        Then I should be redirected to the main page

    Scenario: Login with invalid credentials
        Given I am on the login page
        When I enter the following values on login credentials form
        | Field    | Value          |
        | Username | invalid_user   |
        | Password | wrong_password |        
        And I click on the Login button
        Then I should see an error message "Epic sadface: Username and password do not match any user in this service"

    Scenario: Login with blank credentials
        Given I am on the login page
        And I click on the Login button
        Then I should see an error message "Epic sadface: Username is required"
