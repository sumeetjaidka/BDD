@allTests
@Sanity1
#@KooCreationAndUpdate
Feature: Create Koo, Rekoo and delete koo, koo detail
  Background:
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100036"
    Then I verify by tapping on Skip/Continue button.

  @Testcase25
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
   # Then I Verify all the comments on the koo should be displayed below the parent koo one below other according to the timeline basics and Verify below parent Koo Comments and the More Koos by this user/Similar Koos sections should be present
    Then I Verify other posted Koos of that user should displayed in the More Koos by this user section.
    Then I Verify user is able to navigate to public or own profile on tapping on profile from likers and rekooers list.

    @Testcase26
    Scenario: Verify Show thread button should show when the koo has comments.
    Then I Verify the comment box should display at the bottom of the Koo details screen along with the profile icon.
    Then I Verify on tapping comment bottom comment box, Comment creation screen along with thread should display.
    Then I Verify on tapping on like or rekoo text the likers list and rekooers list is displayed.

  @Testcase37&47
  Scenario: Verifying Koo creation and deletion section
    Given After login I am on the Homescreen
    Then I Verify Whats on your mind text is displayed in the selected language
    Then I navigate to Koo Creation screen
    Then I Verify user is able to post koo by adding MyfirstKoo as title and it is visible on Feed Screen.
    Then I Verify user is able to rekoo with comment on tapping on rekoo button and selecting rekoo with comment
    Then I Verify user is able to delete its own created koo.

  @Testcase60
  Scenario: Profile Settings Screen
    When I click on Profile button
    Then I verify that setting button is visible and clickable
    Then I tap on Helpbtn

  @Testcase39
  Scenario: Verify whether the header Profile picture, Trending koo & koo logo shows on the Home screen.
    Given After login I am on the Homescreen
    Then I Verify the Profile picture at the left top of the screen.
    Then Verify koo icon at the top center of the screen.
    Then Verify trending koos icon on the top right of the screen.

  @Testcase48
  Scenario: Verify Report koo
    Then Verify report koo option is shown on every koo card except own koos.
    Then Verify user should be able to report koo from various pages.
    Then Verify the reasons listed under Report Koo menu.
    Then Verify user should be able to report koo by tap on the listed reasons.

  @Testcase76
  Scenario: Verify Koo comments off feature
    Then I Verify Koo comments off feature for scenarios for Edit Koo feature.
    Then I Verify on selecting everyone all the users using koo app they can comment on that respective koo.

  @Testcase36
  Scenario: Koo creation combinations
    Then I Verify user is able to post koo by adding in combinations of title and audio.

  @Testcase24&20
  Scenario: Koo card
    Given After login I am on the Homescreen
    Then I Verify Whats on your mind text is displayed in the selected language
    Then I navigate to Koo Creation screen
    Then I Verify user is able to post koo by adding MyfirstKoo as title and it is visible on Feed Screen.
    Then I Verify user is able to see image upload icon on the koo creation screen and select the image from gallary.
    Then I Verify user is able to input title
    Then I verify user should be able to create poll with title
    Then I Verify user is able to rekoo with comment on tapping on rekoo button and selecting rekoo with comment
    Then I Verify user is able to rekoo with comment by adding text, audio, video, link and image.
    Then I Verify user is able to rekoo with comment by adding a comment with the combination of all.

  @Testcase19
  Scenario: Koo card
  Given After login I am on the Homescreen
  Then I Verify Whats on your mind text is displayed in the selected language
  Then I navigate to Koo Creation screen
  Then I Verify user is able to post koo by adding MyfirstKoo as title and it is visible on Feed Screen.


  @Testcase38
  Scenario:
  Given After login I am on the Homescreen
  Then I Verify user should not be able to post poll without title.
  Then I Verify User should be able to create poll with min two and max four options.

  @Testcase33
  Scenario: Audio koo recording
    Then I Verify user profile picture is displayed above the mic button.
    Then I Verify on starting the recording the timer is displayed above the recording button and after 4sec of recording restart button should appear and save button should be enabeled.
    Then I Verify user is able to pause the recording on tapping on pause button.
    Then I Verify on tapping on restart button conformation popup is displayed.
    Then I Verify before saving the recorded video user is able to preview the recorded audio as well as fully recorded length.
    Then I Verify user is able to crop the audio from the preview screen.
