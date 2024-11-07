Feature: Order information
Scenario: Fetch currently placed order information
Given user should be logged in
When user clicks on order button
Then user redirects to orders page
When user clicks on current order
Then user should see current order infrmation

Scenario: Fetch cancelled order
Given user should be logged in 
When user clicks on order button
Then user redirects to orders page
When user clicks on cancel order
Then user should see cancelled order information
