Feature: login functionality
Scenario: login to application

Given I am at the login page
When I entered the credentials
And I clicked on login button
Then I should be able to login

Scenario: validate title
Given I am at landing page
Then title should get validated