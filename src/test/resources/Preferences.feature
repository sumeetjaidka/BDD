@Preferences @Regression18
Feature: ON Board Preferences

	Background: 
    Given User is on Language Selection Screen
     When I selects English as Language
     Then I Verify user navigate to Login screen
     Then I Click on Sign In With Email option to login
    Then I Enter New Email id "updoertesting1234" and click on Proceed
    Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
     #Given I select English Language as App language
    #Then I am logged in to Koo App using test account with mobile number "1111100036"
    

  @OnBoard
  Scenario: On Board
   Then Verify user is able to see the preference screen after the image upload screen in onboarding process. 
   Then Verify all the data in the preference screen and informative texts are appearing from backend.
   Then Verify user is able to select and deselect single or multiple preferences/interests by tapping on the text or on the check box.
   Then Verify selected preferences should have selected check box and others to have empty check boxes.
   Then Verify After the user selects some preferences in the onboarding flow the text of the button should change to continue instead of Skip/continue.
   Then Verify on tapping Skip Continue user should move to next screen or feed.
   Then Verify on selecting one or few preferences and tapping on "Skip / Continue" button or witing for 15 seconds user should navigate to next screen/feed.
   Then Verify once after selecting any preference from onboarding or peoples tab user should not see onboarding preference screen.
   Then Verify user should move to feed or next screen if the user stays on preference screen for 30 seconds without performing any actions/selections.

  @PeopleTab
  Scenario: People Tab
  Then Verify Your preferences widget at the top on peoples tab.
  Then Verify all the preferences/interests selected while onboarding to be present in the widget in the same order as in onboarding screen.
  Then Verify Add more button at the end.
  Then Verify Add more button should  not be present in the widget in case of no onboarding preferences selected.
  
  
  @PeoplePrefrenceScreen @OnBoard
  Scenario: People Prefrence Screen
  Then Verify on tapping Add more button user should navigate to people preferences screen.
  Then Verify onboarding selected preferences should have prefilled selected check box and others to have empty check boxes.
  Then Verify user is able to scroll through the preferences properly.
  Then Verify the selection or deselection state should be auto saved on every interaction on the button.
  Then Verify respective profile pictures to be displayed below all the preferences.
  Then Verify user should navigate to people screen on tapping the back button situated beside the Your preferences text header.
  
 @PreferenceDetailsScreen @OnBoard
  Scenario: Preference Details Screen
  Then Verify on tapping on any of the preference user should navigate to preference detail screen.
  Then Verify user should see the list of individual profiles creators related to the preference interest.
  Then Verify user is able to scroll through the profiles properly.
  Then Verify user should be able to follow or unfollow individual profiles.
  Then Verify on tapping on Add to preferences user should see a conformation toast message.
  Then Verify on tapping on Add to preferences the check box should be enabled and text to change to prefered.
  Then Verify on tapping on back button user should navigate back to People preferences screen. 
  Then Verify selected check box for respective preference.
  Then Verify on tapping done button user should navigate back to peoples screen and the selected preference should reflect in the Your preferences widget.
