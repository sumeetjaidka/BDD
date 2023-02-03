@allTests @HashTagDetails
Feature: Hastag Detail Screen

  Background: 
    Given I select English Language as App language
    Then I check if first install help menu is available
    #Then I am logged in into Koo Ap using country code "United States" and Mobile number "1111100032"
    Then I am logged in to Koo App using test account with mobile number "1111100032"
    Then I verify by tapping on Skip/Continue button.
   
  @Testcase1_HastagDetailsScreen @RegressionSuite 
  Scenario: Verifing Hastag Detail Screen diffrent features
    Then I Verify by tapping on any hashtag in hashtags screen,user should navigate to respective Hashtag Details Screen.
    Then I Verify at the bottom of Hashtag Details Screen, Koo using respective hashtag button should be displayed.
    Then I Verify by tapping back button in Hashtag details screen,user should navigate back to Hashtags Screen.
    Then I Verify the share icon should be displayed in Hashtag Details Screen and Verify share icon should be tappable.
    Then I Verify by tap on mobile back button / outside the share via popup, popup should get closed.
    Then I Verify in  Koo using respective hashtag , respective hashtag should be same as header Hashtag text in the screen.
    Then I Verify by tap on  Koo using respective hashtag  button, user should navigate to MLK Koo Creation screen with respective hashtag and VKB should open.
    Then I Verify by tap on App back button in MLK Koo Creation screen, Discard popup should be displayed with "No" and "Yes" option.
    Then I Verify by tap on Mobile back button in MLK Creation screen, VKB should close.
    Then I Verify user can perform scroll action in Hashtag details screen.
    Then I Verify all the Koos with respective hashtags should be displayed.
    Then I Verify by tap on any Koo card, user should land on to Koo details screen and verify by tap on mobile back button / app back button in Koo details screen, user should land back to respective Hashtag Details Screen.
    Then I Verify on scrolling towards end of the Koos, soon below the Koo View Trending Koos button should be displayed.
    Then I Verify by tap on view trending koo button user should navingte to trending koos with 24 hour and also very by tap on app back button user should land to feed screen.
    Then I Verify below View Trending Koos button in Hashtag Details Screen, Trending Tags section should be displayed and Verify the section should be displayed with navigation arrow mark.
    Then I Verify by tap on Trending tags section navigation arrow mark, user navigates to respective Hashtag screen.
    Then I Verify by tap on Create Koo icon in Trending Tags section, user should navigate to MLK Creation screen with respective hashtag and VKB should open.
    #Then I Verify by tap on mobile back button in Hashtag screen, user navigates to Feed screen.

  @Testcase27
  Scenario: Verifing Hastag Detail Screen and mentions screen
    Then I Verify by tapping on any hashtag in hashtags screen,user should navigate to respective Hashtag Details Screen.
    Then I click on the respective hashtag mention and it moves to respective mentioned profile
    Then I Tapping on back button user should navigate back to the home screen.
