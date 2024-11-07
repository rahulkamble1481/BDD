@campaigns
Feature: sending email camplaign
@Sanity 
Scenario: Create campaign
Given user should at campaign page
When user creates campaign button
And User enters the information
Then campaign should get created

@regression
Scenario: Schedule campaign
Given  user should at campaign page
When user click on edit campaign
And user enter the schedule time
Then campaign get scheduled

@functional
Scenario: validate sent campaign
Given user should at campaign page
When use click on sent campaign
Then user should see the count of email triggered
