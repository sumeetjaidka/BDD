@allTests
@Testcase17
Feature: Edit Profile and access location
  Background:
    Given I select English Language as App language
    #Then I Verify Google pop-up
    #Then I am logged in into Koo Ap using country code "United States" and Mobile number "1111100033"
    Then I am logged in to Koo App using test account with mobile number "1111200291"
    Then I verify by tapping on Skip/Continue button.

    #Given User is on Language Selection Screen
    #When I selects English as Language
    #Then I Verify user navigate to Login screen
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoer" and click on Proceed
    #Then I Receive Otp from "tupdoer@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
    #Then I Verify User is registered successfully

  @RegressionSuite @Editprofile
  Scenario: EditProfile Section
    Then I Verify Edit profile text with back button should show on the header.
    Then I Verify Below following text fields should present in Edit Profile screen.
    Then I Verify User should be able to see the device Current Location later verify Tapping on currecnt location, user should get allow location access popup.
    #Then I Verify Tapping on Save changes button after editing or updating the profile details, user should navigate to the Edit Profile screen.
    #Then I Verify By Deleting the Saved Qualification and Saved Experience.
 #####  vallidation error, Save button enabel disable,Delete Functionality of different Fields.    ####

  @KooCardDetails
  Scenario: Verifying KooDetail View diffrent features
    Then I Verify on tapping Koo title user should navigate to the Koo details screen.
    Then I Verify on top of the Koo details screen back button, Koos text and Koo Icon should display.
    Then I Verify on tapping top Koo icon, User should navigate to the feed and feed should refresh.
    Then I Verify profile picture, name, handle, profession, small follow button, drop down menu and time of creation is displayed on every card and for non followed users follow button must be is present.
    Then I Verify all the created koo content is displayed in the parent koo card.
    Then I Verify like and rekoo text is displayed with the count if there are any likes and rekoos on the koo.
    Then I Verify the comment, rekoo, like, share buttons should be present below the koo content.
    Then I Verify the comment box should display at the bottom of the Koo details screen along with the profile icon.
    Then I Verify on tapping comment bottom comment box, Comment creation screen along with thread should display.
    Then I Verify on tapping on like or rekoo text the likers list and rekooers list is displayed.

    Then I Verify all the comments on the koo should be displayed below the parent koo one below other according to the timeline basics and Verify below parent Koo Comments and the More Koos by this user/Similar Koos sections should be present.
    Then I Verify other posted Koos of that user should displayed in the More Koos by this user section.
    Then I Verify user is able to navigate to public or own profile on tapping on profile from likers and rekooers list.
    Then I Verify similar Koos should display in the similar koos section.
    Then I Verify on tapping follow button user is able to follow, and the follow button should disappear.