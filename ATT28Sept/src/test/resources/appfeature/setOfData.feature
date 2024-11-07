Feature: signup functionality
Scenario Outline: signup to functionality

Given user is at signup page
When user enters the usernaame as "<name>" on form
And user enters the slotNumber as <slotnumber>
And user select the gender as "<gender>"
Then user gets created

Examples:
|name|slotnumber|gender|
|Rahul|1|Male|
|Ron|2|Male|
|Alex|3|Male|