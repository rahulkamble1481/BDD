Feature: Opening bank account
Scenario: opening bank account with nominee
Given User is at account page
When user enters the following data
|firstname|lastname|email|phone|
|Eris|smith|erissmith@gmail.com|9988776655|
|Robert|jackso|robertjacksn@gmaial.com|1122334455|
And user clicks on submit button
Then Aapplication should get submitted
