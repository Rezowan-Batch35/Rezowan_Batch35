@Smoke @Regression 
Feature: online banking login feature
description: 

@Positive @TC_LP-18
Scenario: Check login fnction with valid credential 
Given Open the browser 
And Go to application URL
When put valid username
And put valid password
And click login 
Then check sign out button


@Negative @TC_LP-19
Scenario: Check login fnction with Invalid credential 
Given Open the browser 
And Go to application URL
When put invalid username
And put invalid password
And click login
Then click sign out button 