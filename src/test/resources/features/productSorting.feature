Feature: Product Sorting

    Scenario: Sort products by ascending price
        Given I am on the products page
        When I select "Price (low to high)" in the sorting dropdown
        Then the products should be sorted from "Price (low to high)"
