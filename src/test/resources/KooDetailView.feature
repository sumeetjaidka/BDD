@allTests @KooDetailView @Regression2
Feature: Koo Detail Screen

  Background: 
    Given I select English Language as App language
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.

 @RegressionSuite  @TestCase1_KooDetailView @KooDetail1
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
#    #Image Detail Screen
    Then I Verify on tapping image in the Koo card user should navigate to the image full view screen.
    Then I Verify Full image should display on tapping image in the Koo card
    Then I Verify Back button, download image on top of the image full view screen.
    Then I Verify Like, comment, rekoo and share button should display below the image in the image full view screen.
    Then I Verify Write Your Comment pre-populated text should display in the bottom comment bar.
    Then I Verify on tapping comment bar, Keypad should open along with audio, video, character count and post button.
    Then I Verify the post button should be in the disable state when the comment box is blank.
    Then I Verify after entering charater post button should be in the enable state.
     
     @RegressionSuite @TestCase2_KooDetailView @KooDetail
     Scenario: Verifing KooDetail View MLK features
    # Verifing MLKKooDetail View diffrent features
		Given After login I am on the Homescreen
       #using a different function instead of Koo creation functions
		Then I navigate to Koo Landing page
		Then I create a new MLK koo
    Then I Verify on tapping MLK Koo title user should navigate to the Koo details screen.
    Then I Verify on top of the MLK Koo details screen back button, Koos text and Koo Icon should display.
    Then I Verify on tapping top Koo icon, User should navigate to the feed and feed should refresh.
    Then I Verify profile picture, name, handle, profession, small follow button, drop down menu and time of creation is displayed on every card and for non followed users follow button must be is present in MLK.
    Then I Verify the user logged in language Koo should show in the Koo details on the MLK Koo.
    Then I Verify user can switch the available language option on the MLK Koo in the Koo details screen.
    Then I Verify on tapping MLK Koo title user should navigate to the Koo details screen.
    Then I Verify like and rekoo text is displayed with the count if there are any likes and rekoos on the MLK koo.
    Then I Verify the comment, rekoo, like, share buttons should be present below the MLK Koo content.
    Then I Verify the comment box should display at the bottom of the Koo details screen along with the profile icon.
    Then I Verify on tapping on like or rekoo text the likers list and rekooers list is displayed.
    Then I Verify the comment box should display at the bottom of the Koo details screen along with the profile icon.
    Then I Verify on tapping comment bottom comment box, Comment creation screen along with thread should display.
    Then I Verify on tapping on like or rekoo text the likers list and rekooers list is displayed.
   
    #Video Detail Screen #These scenerio will fail in case of test account
   @RegressionSuite @TestCase3_KooDetailView @KooDetail
     Scenario: Verifying Video Koo section
     Given After login I am on the Homescreen
    Then I Verify on tapping video in the Koo card user should navigate to the video full view screen.
    Then I Verify Full video should display on tapping video in the Koo card
    Then I Verify Back button, on top of the video full view screen.
    Then I Verify Like, comment, rekoo and share button should display below the image in the image full view screen.
    Then I Verify Write Your Comment pre-populated text should display in the bottom comment bar.
    Then I Verify on tapping comment bar, Keypad should open .


