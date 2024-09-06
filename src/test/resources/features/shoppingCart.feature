Feature: Shopping Cart

    Scenario: Add a product to the cart
        Given I am logged in and on the products page
        When I add the following products to cart
        | Product Name | Souce Labs Backpack |
        And I should see the number "1" next to the cart button
        And I click the cart button
        Then the following products should appear in the cart list
        | Product Name | Souce Labs Backpack |

    Scenario: Add multiple products to the cart
        Given I am logged in and on the products page
        When I add the following products to cart
        | Product Name | Souce Labs Backpack     |
        | Product Name | Souce Labs Bike Light   |
        | Product Name | Souce Labs Bolt T-Shirt |
        And I should see the number "3" next to the cart button
        And I click the cart button            
        Then the following products should appear in the cart list
        | Product Name | Souce Labs Backpack     |
        | Product Name | Souce Labs Bike Light   |
        | Product Name | Souce Labs Bolt T-Shirt |        

    Scenario: Remove a product from the cart
        Given I am logged in and on the products page
        When I add the following products to cart
        | Product Name | Souce Labs Backpack |
        And I should see the number "1" next to the cart button
        And I click the cart button            
        Then the following products should not appear in the cart list
        | Product Name | Souce Labs Backpack |
