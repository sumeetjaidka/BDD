@allTests
@Sanity
Feature:  language Selection screen
  @Testcase1237
  Scenario: Validate the Language Selection Screen
    Given User is on Language Selection Screen
    Then I check if first install help menu is available
    Then I Verify content language UI consists of all languages in the screen view
    Then I Verify "Select Language" text should show on top of the screen
    Then I Verify view languages of section should contain India and Nigeria
    Then I verify that on tapping on Nigeria, Nigerian languages should appear
    Then I Verify user should be able to select only one language at a time
    Then I Verify on tapping disabled languages or inform me button user is navigated to Enter phone number screen

#  @Testcase8
#  Scenario: Email scenario
#
#    Given I select English Language as App language
#   Then I check if first install help menu is available
#    Then I am logged in to Koo App using country code "Canada" and test account with mobile number "1111100036"
#
#    #Then I Click on Sign In With Email option to login
#      # Then I Enter Email id "updoertesting1234" and click on Proceed
#    #Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
#    Then I Verify new user navigate to Update Profile Picture screen
#    Then I verify by tapping on Skip/Continue button.

  @Testcase9&10
  Scenario: Interest selection scenario
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using country code "Canada" and test account with mobile number "1111100036"
    Then I verify by tapping on Skip/Continue button.

    Then Verify user is able to see the preference screen after the image upload screen in onboarding process.
    Then Verify user is able to select and deselect single or multiple preferences/interests by clicking on the text or on the check box.
    Then Verify selected interest preferences should have selected check box and others to have empty check boxes.
    Then Verify After the user selects some Intereset preferences the text of the button should change to continue instead of Skip/continue.
    Then Verify on tapping Skip Continue user should move to profile to follow screen.

  @FollowUnfollowPeople
  Scenario: Follow Unfollow people screen

    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using country code "Canada" and test account with mobile number "1111100036"
    Then I verify by tapping on Skip/Continue button.
    Then Verify selected interest preferences should have selected check box and others to have empty check boxes.
    Then Verify After the user selects some Interest preferences the text of the button should change to continue instead of Skip/continue.

    Then Verify user should see the list of individual profiles creators related to the preference interest.
    Then Verify user is able to scroll through the profiles properly.
    Then Verify user should be able to follow or unfollow individual profiles.

  @FeedStructureForNewUser
  Scenario: Verify Feed structure for new user
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using country code "Canada" and test account with mobile number "1111100036"
    Then I verify by tapping on Skip/Continue button.
    Then Verify user navigates to feed screen without selecting any interest.
    Then I Verify on top of feed, infinite people carousel with profile cards to follow.


