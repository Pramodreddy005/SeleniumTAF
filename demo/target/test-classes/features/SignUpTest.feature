@Browser1
Feature: Sign Up test

Scenario Outline: Test The Browser Functionality
    When the user navigates to url '<testCase>'
    Then user tests the SignUp Functionality '<testCase>'
 
 Examples:
    | testCase        |               
    | signUpTest      |
