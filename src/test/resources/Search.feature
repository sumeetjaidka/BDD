@allTests @Search
Feature: Search Functional
  I want to use this template for my feature file

  Background: 
    Given I select English Language as App language
    # Then I am logged in into Koo App using country code "United States" and Mobile number "4153389516"
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.
    Then I Verify by tap on Search icon user should navigate to search screen with VKB open and Cursor should be blinking in search field

  @RegressionSuite @search
  Scenario Outline: People Functional
    Then I Verify by tap on App back button, VKB should close and user should navigate back to respective Home tab screen from where he came.
    Then I Verify by tap on Mobile back button, VKB should close and again tap on mobile back button user should navigate back to respective Home tab screen from where he came.
    Then I Search for user "<searchValue>" and verify search results.
    Then I Search user name with first "<FirstName>" and verify results
    Then I Search last name with first "<LastName>" and verify results
    Then I Search handle name with first "<HandleName>" and verify results
    Then I Search handle name with @ "<HandleName1>" and verify search results
    Then I Search user name and handle name with Uppercase and Lowercase letters "<searchValue1>" "<searchValue2>" "<HandleName2>" "<HandleName3>" and verify search results
    Then I Search user name and clear the search results and "<searchValue>" again search for the same username and handle.
    Then I Verify navigation to searched user profile "<searchValue>", navigate back to search screen and verify search results be present as earlier
    ## HashTag Functionality ##
    Then I Verify by clicking on HashtagButton and Search for any of "# In".
    Then I Verify the results list should be scrollable.
    Then I Verify navigation hashtag detail screen and navigate back.
    Then I Verify on navigating to Hashtag detail screen, VKB should close and user should land on respective Hashtag Deatil screen.
    Then I Verify on navigating back from Hashtag detail screen to Search screen hashtag tab, VKB should open and cursor should be blinking next to hashtag in search field.
    ##  Koo Functionality ##
    Then I Search for a koo title.
    Then I Verify the results.
    Then I Verify navigation to koo detail screen and navigate back.
    Then I Verify the VKB on navigation to koo detail screen and navigate back.
    ## mic Functionality ##
    Then I Verify when user taps on cancel button, the text present in search field should be erased and cancel button should not display.
    Then I Verify search results UI
    Then I Verify google voice screen should open after tapping on mic icon.

    ## Device Data is off ##
    #Then I Tapping on mic icon Can not search as you are offline message should show and  In search screen No internet ui should show
    #Then I Verify the backbutton present in search screen left corner of the screen header.
    #Then I Verify by tapping on back button arrow mark user should navigate to home/feed screen.
    Examples: 
      | searchValue       |  | FirstName |  | LastName   |  | HandleName |  | HandleName1 |  | HandleName2 |  | HandleName3 |  | searchValue1      |  | searchValue2      |
      | Sushil Kumar Modi |  | Sushil    |  | Kumar Modi |  | sushilmodi |  | @sushilmodi |  | @SUSHILMODI |  | @sushilmodi |  | SUSHIL KUMAR MODI |  | sushil kumar modi |
