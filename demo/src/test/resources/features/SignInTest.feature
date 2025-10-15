@Browser1
Feature: Sign In test

Scenario Outline: Test The Sign In Functionality
    When the user navigates to url '<testCase>'
    Then user tests the SignIn Functionality '<testCase>'
 
 Examples:
    | testCase        |               
    | signInTest      |
