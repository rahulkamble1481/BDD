Feature: placing order feature
Scenario: Order Confirmation
Given I should be at the product page
When I click on add to cart button
Then product should get add to cart
When I click on place order
Then Order should get placed
