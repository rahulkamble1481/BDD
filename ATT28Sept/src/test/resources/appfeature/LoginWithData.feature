Feature: Login to app with Data
Scenario: validate with data

Given user should be at login page
When user enters usename as "user123"
And user enters password as "admin@123"
And user click on submit button
Then user should get logged into application
