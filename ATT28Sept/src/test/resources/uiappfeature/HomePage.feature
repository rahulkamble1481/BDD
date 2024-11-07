Feature: Home page functionality

Scenario: validation of title of page
Given I am at landing page
Then page title should contains "Shopping"


Scenario: Verify cart icon
Given I am at landing page
Then cart icon should get displayed


Scenario: checkout the deals section
Given I am at landing page
When I click on toys deals
Then toys deals section should open