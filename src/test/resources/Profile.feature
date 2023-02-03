@allTests
@ProfileSection
Feature: Profile Functional
  I want to use this template for my feature file

  Background: 
     Given I select English Language as App language
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.
  # Then I verify by tapping on Skip/Continue button.
    #Then I verify by tapping on Skip/Continue button.
    #Given User is on Language Selection Screen
    #When I selects English as Language
    #Then I Verify user navigate to Login screen
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoer" and click on Proceed
    #Then I Receive Otp from "tupdoer@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
    Then I navigate to Profile page and verify Profile page basic elements

  @RegressionSuite @Profile
  Scenario Outline: Header UI Functionality of Profile page
    Then I Verify tapping on user stats icon user should go to user stats screen.
    Then I Tapping on the stats icons, user should navigate to stats screen and tapping on back button on the header or device back button user should navigate back to the profile screen.
    Then I Verify tapping on share icon sharing icon, share pop up should open & contain following Share Koo header text; Twitter icon, Whatsapp Status icon; Facebook icon; Whatsapp icon.
    Then I Verify tapping on each button, respective actions should happen:1. Cancel button - popup should close; 2. Share icons - naviagte o respective platforms.
    Then User Stats, Profile Share and Settings buttons should be on the right top corner of the screen.
    Then I Verify tapping on profile image user should enter full screen & profle image should be displayed.
    Then I Veirfy below the header profile details, next to profile image, Edit Profile button should show on the right side.

    Then I Verify the Profile Details things below the profile image in order.
    
    
    ## Follower and Following Section   ####
    @RegressionSuite @Profile
    Scenario Outline: Follower and Following Section
    Then I Verify followers and following button to be displayed below work experience Followers on the left and following on the right.
    Then I Verify Count on followers & following buttons, and 5 profile images on both followers & following buttons Images should be from respective list
    Then I Verify user should be able to tap on followers & following buttons & should enter respective screen
    Then I Verify users name should be displayed in list along with profile images follow unfollow buttons.
    Then I Verify Functionality of Search Field on each section of Followers as well as Following.
  
    ##     User Stats     ####
    @RegressionSuite @Profile
    Scenario Outline: User Stats
    Then I Verify user should be able to enter user stats screen on tapping stats icon in profiel header, also verifying the Stats Screen Functionality.
  
    ###    Koos Tab section     ####
    @RegressionSuite @Profile @KooTab
    Scenario Outline: Verify Koos Tab feature
  	Given I am on Profile page and I can see Koo Icon, Like icon and comment as Header in Koo section
  	##Then I verify Tips for Creators is showing in profile whether Koo is created or not
  	Then I verify Koo Cards present in Profile section and if not then create multiple koos
  	Then I Verify in tapping the koo card, user should enter koo detail screen
  	Then I verify the latest Koo should show on top
  	Then I verify all options present in Koo card
  #	Then I verify  user can perform like, comment, rekoo, share, open drop down menu, actions on the koos card in koos tab.
   	Then I verify on tapping comment button, user should navigate to comment creation screen
   	Then I verify No koo UI by deleting existing koo if present
   	
   	@RegressionSuite @requestKoo @Profile
   	Scenario Outline: Verify Request Koo Feature
   	Given I am on Profile page and I can see Koo Icon, Like icon and comment as Header in Koo section
   	Then I verify by logging out.
   	Then I Click on Sign In With Email option to login
     Then I Enter New Email id "updoertesting1234" and click on Proceed
    Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
    Then I verify by tapping on Skip/Continue button.
    Then I navigate to Profile page and verify Profile page basic elements
    Then I get the handle name and logged in back to another account to see this public profile
    
   	
    #Then I Verify public user Profile, if a public user has not created koos.
    ############   Like Tab ############
    @RegressionSuite @Profile @LikeTab
    Scenario Outline: Like Tab
    Then I Verify liked koos should display on liked section also Newly liked koos should show on top.
    Then I Verify the koos present in liked section.
    Then I verify by Tapping on the Koo In Liked Section.
    #Then I Verify if there is no koos there should be trending koos button and Verify tapping on trending koos button user should navigate to trending koos screen.
    #################  ReeKoo Comment Tab ###############
    @RegressionSuites @Profile @Reeko
    Scenario Outline: ReeKoo Comment Tab
    Then I Verify user should able to comment, reekoo and ther counts as well as whatsaap share Functionality.
    Then I Verify tapping on any rekoo user should navigate to koos detailed screen and by Tapping on header back button or device back button user should navigate to Rekoos and Comments Section.
    #####         Mentions Tab         #####
    Then I Verify User-A mentioned koos should display in User-B mentions section on profile.
    Then I verify by logging out.
    #		Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoer3" and click on Proceed
    #Then I Receive Otp from "tupdoer3@gmail.com", "AnuCj98@" and "Your Koo OTP"and enter it into OTP Field
    Then I am logged in to Koo App using test account with mobile number "1111100032"
   # Then I Verify tapping on user stats icon user should go to user stats screen.
    Then I Verify mentioned koos should display in User-B mentions section on profile
    Then I verify by logging out.
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoer" and click on Proceed
    #Then I Receive Otp from "tupdoer@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
   	Then I Verify User-A deleted mentions should not show on User-B mentions section on profile.
    Then I verify by logging out.
    Then I am logged in to Koo App using test account with mobile number "1111100032"
     #Then I Click on Sign In With Email option to login
    #Then I Enter Email id "tupdoer3" and click on Proceed
    #Then I Receive Otp from "tupdoer3@gmail.com", "AnuCj98@" and "Your Koo OTP"and enter it into OTP Field
    Then I Verify deleted mentions should not show on User-B mentions section on profile.




