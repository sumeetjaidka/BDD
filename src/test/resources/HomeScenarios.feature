@allTests @HomeScreen
Feature: Home Screen Scenarios

  Background: 
		Given I select English Language as App language
    #Then I am logged in into Koo Ap using country code "United States" and Mobile number "1111100032"
    Then I am logged in to Koo App using test account with mobile number "1111100032 "
    Then I verify by tapping on Skip/Continue button.
  #Then I Click on Sign In With Email option to login
  #Then I Enter Email id "updoertesting1234" and click on Proceed
  #Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
  Then I verify by tapping on Skip/Continue button.
 

   @RegressionSuite @RegressionSuiteFeedUI @Home
  Scenario: Validate the Feed UI
    Given After login I am on the Homescreen
    Then I Verify the Profile picture at the left top of the screen.
    Then Verify koo icon at the top center of the screen.
    Then Verify trending koos icon on the top right of the screen.
    Then Verify the Feed, People tab and Cricket tab in respective languages
    Then Verify Koo cretion text box with plus icon below home screen tabs headers.
    Then Verify the home, explore, search, chat, and notification buttons at the bottom of the screen.
    Then Verify the koo cards of the followed users should be present in the feed.
    Then Verify on scrolling down in feed people you can follow list should be present
    Then Verify after scroll to bottom, End of Feed banner should be shown with Follow Poeple button.
    Then Verify Koo creation button should show as FAB icon in Home, Explore, Public profile and Notifications screens.
    Then Verify Koo create FAB icon should show as +Koo in respective languages.
    Then Verify Koo create FAb icon should on show with plus icon for English & tamil languages.
    #Then Verify Auido primer should play on navigating to feed screen after some time, soon after login.
    #Then Verify Until Audio primer completes koo creation button FAB icon should not show on feed screen.
    #Then Verify blink on Top 50 Bulk follow button in feed screen.
    Then Verify Find your friends button and people you may know section-After giving contacts permission in feed and people tab.
    Then Verify on scrolling the screen user is able to see trending koos button
    #Then Verify on scrolling down the complete feed screen, Keep following user for seeing Feed text should show.
    Then Verify all the tabs in Home screen for one day old user-Feed, People, Following, Trending, New, Latest, Polls, Popular, Cricket and Videos.


  @RegressionSuite @RegressionSuiteKooAppkkNavigation @Home
  Scenario: Verify Navigations on Koo app
    Then Verify on tapping on the profile picture user is navigated to profile screen and on pressing back button user should navigate back to feed.
    Then Verify on tapping koo icon user is navigated to top of the feed and the feed should get refreshed.
    Then Verify on tapping trending koos icon user should navigate to ternding koo screen and on tapping back button user should ba navigated back to feed
    Then Verify on tapping home icon user is navigated to top of the feed and the feed should get refreshed.
    Then Verify on tapping on the search button user is navigated to search screen and on pressing back button user should navigate back to feed.
    Then Verify on tapping on the Chat button user is navigated to chat screen and on pressing back button user should navigate back to feed.
    Then Verify on tapping on the notification button user is navigated to notification screen and on pressing back button user should navigate back to feed.
    Then Verify on tapping on the people user is navigated to people screen and on pressing feed button user should land back on feed.
    Then Verify tapping on Trending tab for one day old users , Trending tab should be displayed  and tapping back user should land on feed screen
    #Then Verify on tapping on cricket tab button user should navigate to cricket tab, cricket related koos should show and on tapping on back button user should navigate back to feed.
    #Then Verify on tapping on koo card(koo title) user should navigate to koo detail view and on pressing back button user should navigate back to feed.
   # Then Verify on tapping on the view more button from any list user is navigated to respective screen and on pressing back button user should navigate back to feed.
    Then Verify tapping on People,Trending ,Latest, Following, New ,Polls ,Vidoes and popular for one day old users , Poeple tab caorusel content should be displayed  and tapping back user should land on feed screen
#    Then I Click on Sign In With Email option to login
 #   Then I Enter New Email id "updoertesting1234" and click on Proceed
  #  Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
   # Then I verify by tapping on Skip/Continue button.
   # Then Verify justification text and comment threads should not be displayed in any of the other tabs execpt feeds tab
    #Then Verify koos should be displayed as per the timestamps(latest koo first) in all of the home tabs

  @RegressionSuite @KooCard @Home
  Scenario: Verify Koo Card functionality
    Then Verify profile picture, name, handel, profession and time of koo creation should be displayed on every koo card.
    Then Verify the created koo content should be present on the koo card.
    Then Verify the comment, rekoo, like, share buttons should be present below the koo content.
    Then Verify on tapping on profile picture, name or handel user should be navigated to the koo creators profile.
    Then Verify on tapping on the play button on audio or video koo card it should start to play.
    Then I Verify on tapping image in the Koo card user should navigate to the image full view screen.
    Then Verify on tapping on news link it should navigate to perticular news item.

  #  Then Verify on rekooed koo cards rekoo icon along with "Username rekkoed" should be displayed.
    Then Verify if koo contains any comments that comment should be displayed.
    Then Verify on tapping on back button user should navigate back to feed.
    Then Verify in comments screen parent koo creator profile pic should be displayed along with Replying to @user handel should be displayed and on dragging the screen down the parent koo should be displayed with profile picture, name and handel
    Then Verify on tapping on comment icon on koo card user should navigate to comments screen and on tapping on back button user should navigate back to feed.
    Then Verify on tapping on rekoo icon user should get a bottom bar with rekoo, rekoo with comment options should be displayed.
    Then Verify on tapptng on rekoo with comment, rekoo with comment screen should be displayed and on pressing back button user should navigate to feed screen.

    Then Verify on tapptng on share icon whats app send to screen should be displayed and on pressing back button user should navigate to feed screen.
    Then Verify on tapping on rekoo or rekoo with comment form the botton bar the perticular koo should be rekooed and the rekoo icon should turn green andcount should increase by 1.
    Then Verify on tapping on like button the like button should turn to blue color and the count should increase by 1.
    Then Verify on tapping comments bar user should navigate to koo creations screen where user can comment for respective koo
    Then Verify on posting a comment on koo comment count should increase.
    Then Verify user should be able to see comments bar once user has spent 3 seconds on koo.
    Then Verify on tapping on show threads user should navigate to koo detail view which contains all the comments to the koo
    Then Verify after posting the new koo share koo through facebook button should show below the posted koos with blink.
    Then Verify on tapping it should navigate to respective page and shared koo link should display.

	@RegressionSuite @KooCardPoll @Home
  Scenario: Verify Koo Card Poll Functionality
    Then Verify by tapping on Poll tag.
    Then Verify posted poll should show on feed along with percentage and poll end date.
    Then Verify on tapping poll title, poll options, votes section and poll duration user should navigate to koo detailed screen and is able to see below icons below polls, Comment, rekoo, like, facebook and whatsapp share icons
    Then Verify user should be able to vote only once for each poll.
    Then Verify user is able to see below icons below polls.
    #Then Verify user is able comment and rekoo with comment for the polls using below options.
    Then verify by deleting the generated poll.
    Then Verify more like this button should be displayed when users have posted a koo with hashtags which have ML recommendations.
    Then Verify tapping on more like this button users should land to that particular hashtag screen
    Then Verify on tapping share icon, share sheet should open options popup with available app on the user's device.
 #   Then Verify for followed user Koo dropdown unfollow option should display & tapping on it confirmation popup should be shown.
  #  Then Verify on tapping Report Koo, Koo Report screen with report koo options should open.
   # Then Verify on tapping Block option, block pop up should appear.
   # Then Verify on tapping Report User, User Report screen with report user options should open.


  @RegressionSuite @PeopleCanFollow @Home
  Scenario: Verify People you can follow
    Given After login I am on the Homescreen
    Then Verify the people you can follow list should be present after every few koo cards.
    Then Verify at the end of the list Follow people card is displayed and tapping anywhere on that card user should be navigated to peoples screen.
    Then Verify on tapping any where on the card except follow button user is navigated to perticular public profile.
 #   Then Verify on tapping follow button on the public profile the profile should disappear from the list and the koos and rekoos of perticular user should be displayed on the feed.
  #  Then Verify on tapping on follow button user navigates to peoples screen.


 @ReportKoo @RegressionSuite @ReportKoo @Home
  Scenario: Verify Report koo
		Then Verify report koo option is shown on every koo card except own koos.
		Then Verify user should be able to report koo from various pages.
		Then Verify the reasons listed under Report Koo menu.
		Then Verify user should be able to report koo by tap on the listed reasons.


  @RegressionSuiteForReporedtUser @RegressionSuite @Home
  Scenario: Verify Report User
    Then Verify report user option is shown on every koo card except own koos.
    Then Verify user should be able to report user from feed, public profile, koo detail screens and other all screens, by tap on Report user in Koo card options.
    Then Verify by tap on Report user option in Koo card, user should navigate to Report user screen.
    Then Verify in Report user screen all the reasons should be listed and profile,username and user Bio of respective user should be displayed below the header.
    Then Verify the reasons listed should be as following: Cyberbullying, Insulting or Intimidating, Shared my or someone elses private information Spamming, Scamming and Phishing, Intellectual Property Infringement, Self Injury or Suicide, Conducts Illegal Activities, Pretending to be me or someone else , Something Else, Not Interested\\/ Not Relevant
   # Then Verify App back button should be displayed and by tap on app back button/mobile back button, user should navigate back to the respective screen with Koo card.
    Then Verify user should be able to report user by tap on the listed reasons.
    ##Not clicking on report koo until a test data set for this can be established, any random koo is being reported and this includes koo by high profile users
    #Then Verify by tap on any listed reasons, Our team will review it and take an action text message should be displayed.

  # Then Verify the reported user should be shown in reported user tab in dashboard.
  # Then Verify on reporting the user, the particular user should not show to the reported user.
  #Then Verify if user reports the same account again, a toast message saying You have already reportes this user should be shown.


    @RegressionSuite @Home @FeedScreen
  Scenario: Verifying KooFeedScreen
  # List of the carousels should be shown below
    Given user is in feed screen
    Then I verify that people you can follow should display
    Then I verify that popular should display on feed page
    Then I verify that newspapers and channels display on feed.
    Then I verify the entertaniment should be shown
    Then I verify that Politicians should display
    Then I verify jornalist should be shown
    Then I verify poets and authors should display
    Then I verify new is displayed.
    Then I verify government services is displayed
    Then I verify government officials should display
    Then I verify on sports is displayed
    Then I verify interesting accounts should shown
    Then I verify cricket should displayed
    Then I verify the business should display
    Then I verify that humor is displayed
    Then I verify cheif minister of india is displayed
    Then I verify interesting people should displayed
    Then I verify recently joined is displayed on feed page
    Then I verify spiritual leaders is displayed
  #feedscreen carousels
    Then I verify user scroll the profiles on carousels
    Then I verify user click on follow the profile and respective profile disappear after refresh the feed screen.
    Then I verify that unfollowed people should show on both feed and people detail screen
    Then I verify following button should change in people detail screen
    Then I verify on tapping any profile navigate to respective profile page and tapping on the back button.

