@SmokeTest @Regression
Feature: Luma application login function
  description: acceptance criteria= test should pass

  @LP-18 @Positave
  Scenario: Check login with valid credential
    Given Go to applicaion in QA
    When click sign in button
    And put valid user
    And put valid password
    And click sgin in
    Then check sgin out button
