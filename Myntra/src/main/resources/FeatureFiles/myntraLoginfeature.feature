Feature: myntra Login Feature

Scenario: myntra Login with Wrong username and weong password

Given myntra lign page is launched
When user input wrong "UserID" and wrong "password"
Then user should recieve an error message

