@allTests
Feature: Verify and Validate the functionalities of Settings Screen

  Background: 
    Given I select English Language as App language
    Then I check if first install help menu is available
    # Then I am logged in into Koo App using country code "United States" and Mobile number "4153389516"
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.

  @RegressionSuite @Settings
  Scenario: Settings Screen
    When I click on Profile button
    Then I verify that setting button is visible and clickable
    Then I verify that the Account and Others section is present on the settings screen.
    Then Clicking on edit profile menu , user should navigate to edit profile
    Then Select a language and wait for toast language updated successfully and redirection to home page.
    Then I verify that the blocked users are present in manage block users list.
    When I tap on verified account button, navigate to form and close
    Then I tap on Whats app updates toggle button
    Then I tap on Help button
    Then I tap on Compliance button
    Then I tap on Privacy button
    Then I tap on About Us button
    Then I tap on Terms and Policy button
    Then I tap on Community Guidelines
    Then I verify that delete button is present and clickable.
    Then I click on logout button and check the log out pop-up.
    #Given User is on Language Selection Screen
    #When I selects English as Language
    Then I Verify user navigate to Login screen
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I tap on add account screen, user should naviagte to enter mobile number screen.
    #Given User is on Language Selection Screen
    #When I selects English as Language
    Then I Verify user navigate to Login screen
    Then I close the application.
