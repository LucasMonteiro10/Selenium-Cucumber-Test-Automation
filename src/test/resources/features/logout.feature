Feature: Logout

    Scenario: Logout of the site
        Given I am on the products page
        When I click on 3 bars button
        And I click on Logout button
        Then I should be redirected to the login page