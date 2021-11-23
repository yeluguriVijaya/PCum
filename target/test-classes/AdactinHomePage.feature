@P1 @LoginFunction
Feature: To validate login function

Background:
 Given User launch the browser and navigates to hotel booking app
 
 @TC01 @login @Regression
  Scenario: To validate login function with invalid username and valid password
    When User enters the credentials in hotel booking app
    And  User clicks the login button                   
    Then User validates the error message
   
   @TC02 @login @Smoke
  Scenario Outline: To validate login function with combinations of all credentials
    When User enters the "<userName>" and "<password>" in hotel booking app
    And  User clicks the login button                   
    Then User validates the error message 
 
Examples:
|userName|password|
|14562   |sdgd    |
|sgdv    |456789  |
|Hello   |852364  |