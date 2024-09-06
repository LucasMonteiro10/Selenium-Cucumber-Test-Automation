Feature: Checkout Process

    Scenario: Complete a purchase successfully
        Given I have at least one product in the cart
        When I click the "Checkout" button
        And I fill the information table with the following values
        | Field           | Value   |
        | First Name      | Matt    |
        | Last Name       | Murdock |
        | Zip/Postal Code | Matt    |                
        And I click the "Continue" button
        And I click the "Finish" button
        Then I should see a purchase success message
