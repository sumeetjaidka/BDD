@allTests @HomeNewUser
Feature: Home Screen New User Scenarios.

  Background: 
    Given User is on Language Selection Screen
    When I selects English as Language
    Then I Verify user navigate to Login screen
    Then I Click on Sign In With Email option to login
    Then I Enter New Email id "updoertesting1234" and click on Proceed
    #Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
    Then I verify by tapping on Skip/Continue button.

  Scenario: Validate the New User flow
    @RegressionSuiteForNewUser @RegressionSuite 
  Scenario: Verify ForNewUser
  	Then Verify Trending hashtags list Should not show on Feed screen for new user and Should start showing on Feed after following one user.
  	Given I Verify the feed structure in the following order for newly installed user and People you can follow careosule in the first position with infinite profile suggestions.
    Then I Follow people button and Top fifty Bulk Follow button For non English languages.
    #Then I Segment Bulk follow carousels (Only for Kannada & Hindi languages).
    Then I  Koo team demo video for respective language and Discover Relavent Poeple section and Sample feed (For non english languages).
    Then I Click on Sign In With Email option to login
    Then I Enter New Email id "updoertesting1234" and click on Proceed
    Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
    Then I verify by tapping on Skip/Continue button.
   # Then I Verify Koo team profile should be followed by default for non English users.
    Then I Verify on tapping each segment user should enter SBF detail screen, which displays list of profiles to be followed in that category.
    Then I Verify user should be able to follow profile inside SBF detail screen.
    Then I Verify on top of feed people you can follow carousel with profile cards to follow.
   