@Testcase68
Feature: Verify Logout feature in both Parent & Child accounts.
Scenario: Logout feature
  Given I select English Language as App language
  Then I check if first install help menu is available
  Then I am logged in to Koo App using test account with mobile number "1111100014"
  Then I verify by tapping on Skip/Continue button.
  When I click on Profile button
  Then I verify that setting button is visible and clickable
  Then I Verify on tapping add account button user should navigate to enter phone number screen.
  Then I am logged in to Koo App using test account with mobile number "1111100036"
  When I click on Profile button
  Then I click on Profile button of child
  Then I verify that setting button is visible and clickable
  Then I verify by log out.
  When I click on Profile button
  Then I verify that setting button is visible and clickable
  Then I verify by log out.


  @Testcase32
  Scenario: Edit Profile feature
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.
    When I click on Profile button
    Then I click on Edit profile
    Then I click on a Edit profile name field
    Then I click on a line Edit input name
    Then I click on Save Button
    Then I click on profession name Button

  @Testcase28
  Scenario: Verifying tapping images on koo card, Image should open in full screen
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.
    Then I Verify on tapping Koo title user should navigate to the Koo details screen.
    Then I Verify on tapping image in the Koo card user should navigate to the image full view screen.
    Then I Verify Full image should display on tapping image in the Koo card

