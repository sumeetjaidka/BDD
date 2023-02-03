@allTests @multiaccount
Feature: Multi Account Scenarios

  Background: 
    Given I select English Language as App language
    Then I check if first install help menu is available
    # Then I am logged in into Koo App using country code "United States" and Mobile number "4153389516"
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.

  #Then I verify by tapping on Skip/Continue button.
  #		Given User is on Language Selection Screen
  #When I selects English as Language
  #Then I Verify user navigate to Login screen
  #Then I Click on Sign In With Email option to login
  #Then I Enter Email id "tupdoer5" and click on Proceed
  #Then I Receive Otp from "tupdoer5@gmail.com", "Tester@1234" and "Your Koo OTP"and enter it into OTP Field
  #Then I Verify User is registered successfully
  #
  @RegressionSuite @multiaccount
  Scenario Outline: MultiAccount
    Then I Verify tapping on user stats icon user should go to user screen.
    Then I Verify user should be on settings screen and there should be add account button.
    Then I Verify on tapping add account button user should navigate to enter phone number screen.
    Then I am logged in to Koo App using test account with mobile number "1111100034"
    # Then I Enter OTP in OTP Text Field.
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoerchild1" and click on Proceed
    #Then I Receive Otp from "tupdoerchild1@gmail.com", "Tester@1234" and "Your Koo OTP"and enter it into OTP Field
    #Then I Verify User is registered successfully
    Then I Verify tapping on user stats icon to add two more account.
    Then I Verify user navigate to Login screen
    Then I am logged in to Koo App using test account with mobile number "1111100035"
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoerchild2" and click on Proceed
    #Then I Receive Otp from "tupdoerchild2@gmail.com", "Tester@1234" and "Your Koo OTP"and enter it into OTP Field
    #Then I Verify User is registered successfully
    Then I Verify tapping on user stats icon to add two more account.
    Then I Verify user navigate to Login screen
    Then I am logged in to Koo App using test account with mobile number "1111100036"
    #  Then I Enter OTP in OTP Text Field.
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoerchild3" and click on Proceed
    #Then I Receive Otp from "tupdoerchild3@gmail.com", "Tester@1234" and "Your Koo OTP"and enter it into OTP Field
    #Then I Verify User is registered successfully
    Then I Verify by Swappimg between the user.
    Then I Verify user is able to logout from child account from settings screen.
    Then I Verify user should not be able to add same account twice.
    Then I Verify user navigate to Login screen
   # Then I am logged in to Koo App using test account with mobile number "1111100036"
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoer5" and click on Proceed
    Then I Verify user should not be able to add same mobile number "1111100036" twice and get alert message.
