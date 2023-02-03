
@MLKCreation @Regression18
Feature: MutliLingual KooCreation
  I want to use this template for my feature file
  
  Background: 
    #Given User is on Language Selection Screen
    #When I selects English as Language
    #Then I Verify user navigate to Login screen
    #Then I Click on Sign In With Email option to login
    #Then I Enter New Email id "updoertesting1234" and click on Proceed
    #Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
    #Then I verify by tapping on Skip/Continue button.
    #Then I verify by tapping on Skip/Continue button.
    Given I select English Language as App language
    Then I am logged in to Koo App using test account with mobile number "1111100036"
    Then I verify by tapping on Skip/Continue button.
    Then I verify by tapping on Skip/Continue button.

  @MLK
  Scenario: Creation of Koo using all languages
		Then I create a new "Hindi" Koo From English Language.
		Then I create a new "Tamil" Koo From English Language.
		Then I create a new "Kannada" Koo From English Language.
	  Then I create a new "Telugu" Koo From English Language.
	  Then I create a new "Marathi" Koo From English Language.
		Then I create a new "Bangla" Koo From English Language.
		Then I create a new "Gujarati" Koo From English Language.
   	Then I Create Koo with English Hindi Tamil Languages and verify them.
    Then I Create a Koo with all Language and verify them.
		
		@MLK @KooCombinationInDifflang
  Scenario: Creation of Different combination of Koo using all languages
		Then I create a Koo in "Hindi" language with combination of Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link.
		Then I create a Koo in "Hindi" language with combination of Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link
		Then I create a Koo in "Tamil" language with combination of Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link.
		Then I create a Koo in "Tamil" language with combination of Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link
		Then I create a Koo in "Kannada" language with combination of Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link.
		Then I create a Koo in "Kannada" language with combination of Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link
		Then I create a Koo in "Telugu" language with combination of Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link.
		Then I create a Koo in "Telugu" language with combination of Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link
		Then I create a Koo in "Marathi" language with combination of Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link.
		Then I create a Koo in "Marathi" language with combination of Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link
		Then I create a Koo in "Bangla" language with combination of Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link.
		Then I create a Koo in "Bangla" language with combination of Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link
		Then I create a Koo in "Gujarati" language with combination of Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link.
		Then I create a Koo in "Gujarati" language with combination of Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link
	