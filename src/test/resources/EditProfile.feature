@allTests @EditProfile
Feature: Edit Profile
  I want to use this template for my feature file
  
  Background:
  	Given I select English Language as App language
    #Then I Verify Google pop-up
    #Then I am logged in into Koo Ap using country code "United States" and Mobile number "1111100033"
    Then I am logged in to Koo App using test account with mobile number "1111200291"
    Then I verify by tapping on Skip/Continue button.
    
    #Given User is on Language Selection Screen
    #When I selects English as Language
    #Then I Verify user navigate to Login screen
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoer" and click on Proceed
    #Then I Receive Otp from "tupdoer@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field 
    #Then I Verify User is registered successfully

  @RegressionSuite @Editprofile
  Scenario: EditProfile Section
    Then I Verify Edit profile text with back button should show on the header.
    Then I Verify Below following text fields should present in Edit Profile screen.
    Then I Verify Tapping on the camera icon on the placeholder user should navigate to camera screen and tapping on back button on the header or device back button user should navigate back to the edit profile screen.
    Then I Verify tapping on all fiels on edit profile, user should navigate to respective edit fileds.
    Then I Verify Tapping on Save changes button after editing or updating the profile details, user should navigate to the Edit Profile screen.
    Then I Verify By Deleting the Saved Qualification and Saved Experience.  
 #####  vallidation error, Save button enabel disable,Delete Functionality of different Fields.    ####
 

    Then I Verify User should enter at least minimum 3 characters in Name edit text field to save the changes, Save button should not enable until then.
    Then I Verify User should be able to enter 30 characters or less than that but not more than 30 characters in Profession text field.
    Then I Verify User should be able to see the device Current Location later verify Tapping on currecnt location, user should get allow location access popup.
    Then I Verify user is able to update Bio with 1000 characters, By tapping on save changes button toast message should display when user enters more than 1000 characters in Bio field.
    Then I Verify on tapping Date of Birth field Google default Calender should open.
    Then I Verify user is able to select any of the previous dates not before dates from calender.
    Then I Verify on tapping open link button user should be navigated to respective social media web page under Social Media Section.
    #Then I Verify Functionality on every field page and check on edit profile as well on profile page.
    
    @RegressionSuite @Editprofile @DeleteData
    Scenario: EditProfile Delete Functionality section
   
		Then I Verify on tapping clear link button the entered link should be cleared.
    Then I Verify Deleted Links Should Not Appear on Profile Tab
    Then I verify by Deleting Website Textfield, should not appear on profile page.
    Then I Verify On tapping delete button of Profession, confirmation popup should be shown & on deleting it should reflect in both edit profile & profile screens.
    Then I Verify On tapping delete button of Location Field, confirmation popup should be shown & on deleting it should reflect in both edit profile & profile screens.
   # Then I Verify On tapping delete button of Bio Field, confirmation popup should be shown & on deleting it should reflect in both edit profile & profile screens.
    Then I Verify On tapping delete button of DOB Field, confirmation popup should be shown & on deleting it should reflect in both edit profile & profile screens.
    Then I Verify by Entering the details again.
   

   
   
   
