Feature: manage profile functionality
Background: 
                                           //background keyword is used to take the common steps from all scenario
Given I have logged into the application
And I am at homepage


Scenario: Addition of profile
When I clicked on add button
And I entered the data
Then profile should get added

Scenario: updation of profile
When i click on edit button
And i update the data
Then profile should get update

Scenario: Deletion of profile
When I clicked on delete button
Then profile Should get delete
                                       