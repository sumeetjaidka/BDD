@allTests
Feature: Registration Scenarios

  @RegressionSuites
  Scenario Outline: Validate the registration process through email
    Given User is on Language Selection Screen
    When I selects English as Language
    Then I Verify user navigate to Login screen
    Then I Click on Sign In With Email option to login
    Then I Enter Email id "<username>" and click on Proceed
    Then I Receive Otp from "<email>", "<password>" and "<subject>"and enter it into OTP Field
    Then I Verify User is registered successfully

    Examples: 
      | username        | email                     | password    | subject      |
      | rajubugreporter | rajubugreporter@gmail.com | raju@updoer | Your Koo OTP |

  @RegressionSuites
  Scenario Outline: Validate the registration process through Mobile Phone
    Given User is on Language Selection Screen
    When I selects English as Language
    Then I Verify user navigate to Login screen
    Then I Enter Mobile country Code "<CountryCode>" and Mobile number "<mobilenum>" and click on Proceed
    Then I Receive Otp from Mobile and enter it
    Then I Verify User is registered successfully

    Examples: 
      | CountryCode   | mobilenum  |
      | United States | 4153389516 |
