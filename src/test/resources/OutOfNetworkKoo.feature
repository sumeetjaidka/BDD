@allTests
Feature: Out Of Network flow for Feed screen

  Background: 
      Given I select English Language as App language
   # Then I am logged in into Koo App using country code "United States" and Mobile number "4153389516"
    Then I am logged in to Koo App using test account with mobile number "1111100014"
   Then I verify by tapping on Skip/Continue button.

  Scenario: Verify Out of network Flow
   	Given After login I am on the Homescreen
    Then Verify OON should show according to time of reaction done on actual koo and not according to acutal koo.
    Then Veirfy Justification text should show on OON koo according to the reaction made.
    Then Verify on following OON Koo creator, should show based on the koo created time once after feed refresh.
    Then Verify on following OON Koo, justification text should not show.
  #  Then Verify Jutification text should change when same user does more than 1 reaction after some time.
    Then Verify when different users does reaction on OON koo, justification text should show 1st two reactor's names along with type of reaction.
    Then Veirfy justification text should show only for Out Of Network koos & not for following users koos.
   