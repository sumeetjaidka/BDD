@Testcase78
Feature: Verify Show more and less in settings for self and other user
Scenario: Show more and less
Given I select English Language as App language
Then I check if first install help menu is available
Then I am logged in to Koo App using test account with mobile number "1111100014"
Then I verify by tapping on Skip/Continue button.
When I click on Profile button
Then I Click More Info & Less info buttons should on user details tag.
Then I Tapping on back button user should navigate back to the home screen.
Then I Click on search Icon on Home Page
Then I Input other profile name
Then I click on searched text
Then I Click More Info & Less info buttons should on user details tag.
Then I Tapping on back button user should navigate back to the home screen.


  @Testcase50
  Scenario: Block public profile
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.
    Then I Click on search Icon on Home Page
    Then I search public profile name
    Then I click on searched text
    Then I click on block button
    Then I click on Ok button
    Then I Click Back Button
    Then I click On Back To HomeButton
    Then I Click On Home Button
    When I click on Profile button
    Then I verify that setting button is visible and clickable
    Then I Click On  Manage Unblock Button
    Then I Click On Unblock Button


  @Testcase51
  Scenario: Verify bottom bar should contain home, explore,search, message and notification button
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.
    Then I Click On Home Button
    Then I Verify by tapping on any hashtag in hashtags screen,user should navigate to respective Hashtag Details Screen.
    Then I click on Hash tag Back Button
    Then I Click on search Icon on Home Page
    Then I click On Back To HomeButton
    Then I Click On MessageIcon Home
    Then I Click On BackArrow Message button
    Then I Click On NotificationIcon Home
    Then I Click On Home Button



@Testcase22
Scenario: Verify on tapping public profile name & profile picture, user should navigate to respective public profile.
  Given I select English Language as App language
  Then I check if first install help menu is available
  Then I am logged in to Koo App using test account with mobile number "1111100014"
  Then I verify by tapping on Skip/Continue button.
  Then I Click on search Icon on Home Page
  Then I search public profile name
  Then I click on searched text
  Then I click On Back To HomeButton
  Then I click on Profile Photo
  Then I click On Back To HomeButton

  @Testcase21
  Scenario: Validate the Feed UI
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.
    Then I Verify the Profile picture at the left top of the screen.
    Then Verify koo icon at the top center of the screen.
    Then Verify after scroll to bottom, End of Feed banner should be shown with Follow Poeple button.



