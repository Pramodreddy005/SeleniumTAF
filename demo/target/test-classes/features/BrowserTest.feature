@Browser
Feature: Browser Testing

Scenario Outline: Test The Browser Functionality
    When the user navigates to '<url>'
    Then user checks the login Functionality
 
 Examples:
    | url        |               
    | https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm#|
