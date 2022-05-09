
#author:anik@agile1tech.com

Feature: login panel
Background:
Given user is on the login page

@uat
Scenario: validating login panel with valid credentials



When user enters valid user name
And user enters valid password
And user clicks on the login button
Then user should be on the account page
And user should close the browser

@uat
Scenario: validating login panel with invalid credential

#Given: user is on the login page
When user enters invalid username
And user enters invalid password
And user clicks on the login button
Then user should not be login
And user should close the browser


Scenario: validating login panel with expired user

Given: user is on the login page
When user enters expaired username 
And user enters expaired password
And user clicks on the login button
Then user should not be login
And user should close the browser



