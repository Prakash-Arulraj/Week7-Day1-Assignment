Feature: Login To Testleaf Application

Scenario Outline: Login Possitive
Given Enter as Username <username>
Then Enter as Password <password>
And Click Login Button
Then Verify Home Page 
And Click Logout Button

Examples:
|username|password|
|DemoSalesManager|crmsfa|
