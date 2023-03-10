@allTests
@Login
Feature: Login Scenarios

@RegressionSuites
  Scenario: Validate the Language Selection Screen
    Given User is on Language Selection Screen
    Then I Verify content language UI consists of all languages in the screen view
    Then I Verify "Select Language" text should show on top of the screen
    Then I Verify view languages of section should contain India and Nigeria
   # Then I Verify by default India should be selected
    Then I verify that on tapping on Nigeria, Nigerian languages should appear
    Then I Verify the languages should be devided into two groups, Available Languages and Coming soon respectively
    Then I Verify user should be able to scroll the Languages screen
    #Then I Verify none of the languages should be selected by default
    #Then I Verify on selecting any of the language, selected image button should fill the colour with the yellow color
    Then I Verify user should be able to select only one language at a time
    Then I Verify on tapping disabled languages or inform me button user is navigated to Enter phone number screen
 #   Then I verify double tap on device back exist from Koo app.
 #  Then I Verify on selecting any language the contents is showing in respective language
 

@RegressionSuites
  Scenario Outline: Validate Enter Phone number screen and OTP enter screen
  	Given User is on Language Selection Screen
  	When I selects English as Language
    Then I Verify user navigate to Login screen
  	Then I verify Koo logo and "<headingText>" text should show on top of the enter phone number screen
  	
  	Examples:
  	|headingText|
  	|The Voices of India|