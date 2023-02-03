@allTests @TrendingHashtags
Feature: Trending Hastags Scenrios

  Background: 
    # Given User is on Language Selection Screen
    # When I selects English as Language
    # Then I Verify user navigate to Login screen
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "updoertesting1234" and click on Proceed
    #Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100032"
    Then I verify by tapping on Skip/Continue button.

  @RegressionSuite @Testcase1_TrendingTags
  Scenario: Verifing Trending Hastags diffrent features
    Then I Verify on tapping Hastag icon from the bottom bar user should navigate to Trending Hashtags Screen
    Then I Verify there should be trending tags on trending hashtags screen with blue colour
    Then I Verify below the hashtag there should be profile pictures of koo creator who is creating the koo with the respective hashtag
    Then I Verify there should plus icon button next to every hashtag
    Then I Verify all the hashtags UI should be in one group with divider line below every hashtag
    Then I Verify only five profile pictures of koo creators should show below every hashtag
    Then I Verify tapping plus icon button next to every hashtag user should navigate to koo creation screen and respective hashtag should auto populate with cursor pointing and keypad in open state
    Then I Verify on entering text inside koo creation title and then tapping app/device back button from koo creation screen confirmation popup should show with yes or no
    Then I Verify on tapping no user should be on koo creation screen
    Then I Verify on tapping yes user should back to trending hashtags screen
    Then I Verify on tapping respective hashtag user should navigate to detailed screen and koos should show with that hashtag
    Then I Verify there should be koo creation fab icon, on tapping it user should navigate to koo creation screen and cursor should highlight with keypad open
    Then I Verify user should be able to scroll the screen
    Then I Verify on dragging the screen down Pull down to refresh and Release to refresh text should show and on releasing screen should refresh
    Then I Verify on tapping app/device back button form detailed screen user should land on Trending Hashtags screen

#In the news section don't show always in the koo app therefore it might fail sometimes
  #Version 94.6 is not having news section, enable it when required
   @RegressionSuite @Testcase2_NewsHastags
  Scenario: Verifing In The News Hastags diffrent features
Then I Verify In The News section should show only if there are any hashtags is trending from news profiles
Then I Verify there should be trending tags on In the news screen with blue colour.
   Then I Verify news profile pictures should before every hashtag.
    Then I Verify below the hashtag there should be profile pictures of koo creator who is creating the koo with the respective hashtag
    Then I Verify all the hashtags UI should be in one group with divider line below every hashtag
    Then I Verify there should plus icon button next to every hashtag
    Then I Verify tapping plus icon button next to every hashtag user should navigate to koo creation screen and respective hashtag should auto populate with cursor pointing and keypad in open state
    Then I Verify on entering text inside koo creation title and then tapping app/device back button from koo creation screen confirmation popup should show with yes or no
    Then I Verify on tapping no user should be on koo creation screen
    Then I Verify on tapping yes user should back to trending hashtags screen
    Then I Verify on tapping respective hashtag user should navigate to detailed screen and koos should show with that hashtag
    Then I Verify there should be koo creation fab icon, on tapping it user should navigate to koo creation screen and cursor should highlight with keypad open
    Then I Verify on tapping app back button form detailed screen users should land on In The News screen
    Then I Verify on dragging the screen down Pull down to refresh and Release to refresh text should show and on releasing screen should refresh
