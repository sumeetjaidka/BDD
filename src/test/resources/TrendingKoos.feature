@allTests
Feature: Trending koos

  Background: 
    Given I select English Language as App language
    Then I check if first install help menu is available
    # Then I am logged in into Koo App using country code "United States" and Mobile number "4153389516"
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.

  @RegressionSuite @Trending
  Scenario: Trending koos functionality
    Then Trending Koos icon should display on top right corner of the feed.
    Then On tapping trending Koos icon user should navigate to the Trending Koos screen and screen should refresh.
    Then On top left corner of the trending Koos screen Back button should display.
    Then On top centre on the Trending Koos screen Header should display.
    Then On tapping back button in the trending Koos screen user should should navigate back to the feed screen.
    Then On top right corner of the trending Koos screen Refresh button should display.
    Then Bottom of the Trending Koos screen Koo creation button should display.
    Then On tapping botton Koo create button in Trending Koo screen user should navigate to the Koo creation screen.
    Then On navigating to the Trending Koos screen Small and the big follow button should blip.
    Then Verify on tapping any Koo in the Trending Koos screen user should navigate to the Koos details screen.
    Then Click on Follow button, small follow button should disaapeared and the person should be followed.
    Then Click on small follow button, follow button should disappears and the person should be followed.
