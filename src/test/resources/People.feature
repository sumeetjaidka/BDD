@allTests
Feature: People Tab Scenerio

  Background: 
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100032"
    Then I verify by tapping on Skip/Continue button.

  @RegressionSuite @People
  Scenario: Verify on tapping people tab in Home screen tabs, user should navigate to people tab screen and verify Relevent People
    When User click on Peoples tab and I Verify "Discover Relevant People" Headr is present
    Then I Verify Discover Relevent People with all the sections are present
    Then I Verify that "Search for profession" text box is displayed
    Then I Verify on tapping search text box user should navigate to "Profession category" screen
    Then I Verify "Type to search" water mark should be displayed inside the search box
    Then I Verify list of profession should show with forward arrow mark and search text box at the top
    Then I Verify by tap on app back button / mobile back button, user should navigate back to People tab screen

  @RegressionSuite @People
  Scenario: Verify Search for any profession in search box searched results list should show and their details and when searched profession does not match any of the profession list, "No results found for" should be displayed
    When User click on Peoples tab and I Verify "Discover Relevant People" Headr is present
    When I Verify Search for "Doctor" profession in search box, searched results list should show
    Then I Verify by tap on any searched profession results, user should navigate to "Doctor" Profession Details screen
    Then I Verify in respective Profession Details screen, respective profession user profiles with username,profession if user has set and follow button should be displayed
    Then I Verify by tap on app back button/mobile back button in respective Profession Details screen, user should navigate back to Profession category screen
    Then I Verify when searched profession does not match any of the profession list, "Student" should be displayed
    Then I Verify by tap on app back button or mobile back button in respective profile screen, user should navigate back to profession details screen

  @RegressionSuite @People
  Scenario: Verify Follow/Unfollow button functionalty
    ## Getting user is blocked error in first scenario
    ## When I Verify by performing Follow action in respective profile screen and navigating back to profession details screen, Follow state should change to Following state
    Then I Verify by tap on Follow button in profession details screen, follow state should change to following and Go to feed button should show
    Then I Verify by tap on Go to feed button, user should navigate to feed screen and feed should refresh and followed user koos should display
    Then I Verify by tap on Following button in profession details screen, unfollow popup with NO and YES confirmation should be displayed
    Then I Verify by tap on No in the popup, popup should get closed and user should be on the same profession details screen and Following button state should not change to Follow
    Then I Verify by tap on Yes in the popup, popup should get closed and Following button state should change to Follow button state
    Then I Verify by tap on user profile,username,profession and anywhere else except follow button, user should navigate to respective profile screen
    Then I Verify user should be able to scroll in respective profession details screen
    Then I Verify Find your Friends on Koo and Invite Friends button should show in People tab screen and I Verify by tap on Find your Friends on Koo button, user should navigate to Invite screen with Allow Koo to access your contacts? popup with Allow and Deny options
    Then I Verify by tap on Deny option in the popup, device contacts should not show on invite screen and user should navigate back to People tab screen on Find your friends button
    Then I Verify Search for your friends and family? search box is displayed with this water mark text inside it
    Then I Verify by tap the searchBox, VKB should open
    Then I Verify back button in invite screen and by tap on app back button/mobile back button, user should land on People tab screen
    Then I Verify by tap on Invite Friends button in People tab screen, Share Koo screen should be displayed with twitter, facebook, whatsapp status and whatsapp icons and verify Cancel button should be displayed in Share Koo screen icon
    Then I Verify by tap on tick mark icon, no action should be performed
    Then I Verify profile picture, name, handle, profession, follow button should be displayed on all carousal card
