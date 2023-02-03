@allTests @Notification
Feature: Notification

  Background: 
    Given I select English Language as App language
    Then I check if first install help menu is available
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.

  @RegressionSuite @Notification
  Scenario: Notification Setting
    Then I Verify By Tapping on notification menu, notification page should be displayed
    Then I Verify notification screen should consits of section
    Then I Verify when show is enabled user should recieve all of the koos in notifications
    Then I logout to login with another account.
    Then I am logged in to Koo App using test account with mobile number "1111100032"
    #Then I Enter Email id "tupdoerchild3" and click on Proceed
    #Then I Receive Otp from "tupdoerchild3@gmail.com", "Tester@1234" and "Your Koo OTP"and enter it into OTP Field
    Then I Create Notification For tupdoer5.
    Then I logout to login with another account.
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    #Then I Enter Email id "tupdoer5" and click on Proceed
    #Then I Receive Otp from "tupdoer5@gmail.com", "Tester@1234" and "Your Koo OTP"and enter it into OTP Field
    Then I Verify By Tapping on notification menu, notification page should be displayed
    Then I Verify when show is disabled user should not recieve all of the koos in notifications
    Then I logout to login with another account.
    Then I am logged in to Koo App using test account with mobile number "1111100032"
    #Then I Enter Email id "tupdoerchild3" and click on Proceed
    #Then I Receive Otp from "tupdoerchild3@gmail.com", "Tester@1234" and "Your Koo OTP"and enter it into OTP Field
    Then I Create Notification2 For tupdoer5.
    Then I logout to login with another account.
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    #Then I Enter Email id "tupdoer5" and click on Proceed
    #Then I Receive Otp from "tupdoer5@gmail.com", "Tester@1234" and "Your Koo OTP"and enter it into OTP Field
   # Then I Verify By Tapping on notification menu, notification page should be displayed
