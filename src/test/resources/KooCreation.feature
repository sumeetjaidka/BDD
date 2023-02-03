@koocreationfull @allTests
Feature: Koo Creation Scenrios

  Background:
    #Given User is on Language Selection Screen
    # When I selects English as Language
    # Then I Verify user navigate to Login screen
    # Then I Click on Sign In With Email option to login
    # Then I Enter Email id "updoertesting1234" and click on Proceed
    #Then I Receive Otp from "updoertesting1234@gmail.com", "Test@1234" and "Your Koo OTP"and enter it into OTP Field
     Given I select English Language as App language
    Then I am logged in to Koo App using test account with mobile number "1111100014"
    Then I verify by tapping on Skip/Continue button.

	 @RegressionSuites @Testcase1 @UIVerification
	 Scenario: Verifyng Koo Creation section
 		Given After login I am on the Homescreen
 		Then I Verify Whats on your mind text is displayed in the selected language
 		Then I navigate to Koo Creation screen
 		Then I Verify the post button on the top right of the screen
 		Then I Verify the back button on the top left of the screen
 		Then I Verify the text, audio and video icon below the koo title box
 		Then I Verify the link, images and title character count at the bottom of the screen
 		Then I Verify the profile picture to the left of the title box

	  @RegressionSuites @KooNavigations
  Scenario: Verifying Koo Navigations Features
   	Given After login I am on the Homescreen
   	Then I Verify Whats on your mind text is displayed in the selected language
  	Then I navigate to Koo Creation screen
  	Then I Verify on tapping on title field keyboard should open and on tapping anywhere else apart from keyboard and title field it should disappear.
    Then I Verify on tapping on mic or video icon for the first time user should get permissions popup after allowing user should navigate to recording screen.
    Then I Verify on tapping on images icon user should navigate to gallery and on tapping on back button user should navigate to koo creation screen
		#Then I verify on tapping on link icon user should get a attach link sub-window and on clicking on cancel button user should navigate to koo creation screen
		#Then I verify on tapping comments off icon user should navigate to comment preferences screen.


	@RegressionSuites @KooTitle
  Scenario: Verifing Koo Title Features
   	Given After login I am on the Homescreen
   	Then I Verify Whats on your mind text is displayed in the selected language
   	Then I navigate to Koo Creation screen
    Then I Verify user is able to add title from minimum of one to maximum of fourhundred characters and I Verify post button is enabled on entering characters in the title field.
    Then I Verify entered text is transcripted in selected language.
    Then I Verify user is able to add hashtags and the suggestion list should be displayed and user should be able to select any one from the list or add own hashtag.
    Then I Verify user is able to mention any user and the suggestion list should be displayed and user should be able to select any one from the list.
    Then I Verify user is able to post koo only by attaching link.

    @Testcase1_KooCreation  @RegressionSuites
  Scenario: Verifing Trending Hastags diffrent features
    Then I Verify Whats on your mind text is displayed in the selected language
    Then I Verify user is able to add title from minimum of one to maximum of fourhundred characters and I Verify post button is enabled on entering characters in the title field.
    Then I Verify entered text is transcripted in selected language.
    Then I Verify user is able to add hashtags and the suggestion list should be displayed and user should be able to select any one from the list or add own hashtag.
    Then I Verify user is able to mention any user and the suggestion list should be displayed and user should be able to select any one from the list.
    Then I Verify GIF icon at the bottom of koo creation screen.
    Then I Verify the post button on the top right of the screen
    Then I Verify the back button on the top left of the screen
    Then I Verify the text, audio and video icon below the koo title box
    Then I Verify the link, images and title character count at the bottom of the screen
    Then I Verify user is able to see youtube icon at bottom of the screen.
    Then I Verify the profile picture to the left of the title box
    Then I Verify on tapping on title field keyboard should open and on tapping anywhere else apart from keyboard and title field it should disappear.
    Then I Verify on tapping on mic or video icon for the first time user should get permissions popup after allowing user should navigate to recording screen.
    Then I Verify on tapping on images icon user should navigate to gallery and on tapping on back button user should navigate to koo creation screen
    #Verifing link youtube link and post scenerios
    Then I Verify on long press in the link field user is able to paste the copied link.
    Then I Verify on tapping the cancel button beside the link field the field should be cleared.
    Then I Verify on typing or pasting any link save button is enabled.
    Then I Verify on tapping on cancel button the link field is closed.
    Then I Verify user is able to post koo only by attaching link.
    Then I Verify user is able to post koo only by entering title.
    #comment prefece one added to the step
    Then I Verify user is able to rekoo with comment on tapping on rekoo button and selecting rekoo with comment.
    Then I Verify user is able to comment on tapping on comment button.
    # Verifing Poll feature scenarios
    Then I Verify user is able to see the poll icon at the bottom of the screen and Verify on tapping poll icon user should navigate to poll creation screen.
    Then I Verify on title box by default poll title should be empty.
    Then I Verify on selecting audio or video options while poll creation, poll creation should be disabled.
    Then I Verify by default there should be two poll options tapping on plus icon options box should increase.
    Then I Verify there should be cancel button on options section.
    Then I Verify by default poll duration should be one day.
    Then I Verify user is able to enter upto thirty-five characters on options box.
    Then I After entering the text inside options box and tapping on cancel button a pop-up should display.
    Then I Verify user should not be able to post poll without title.
    Then I Verify user should able to edit poll until there are no action on poll.
    Then I Verify after refreshing the feed screen posted koos should not disappear.
    Then I Verify if the user is able to add a link in title field.


   @RegressionSuites @Videokoorecording
 		Scenario: Video koo recording
 		Then I Verify user should be able to see Video recording option on the koo create text box.
 		Then I Verify on tapping Video icon, user should navigate to Video recording screen and Record video permission popup should show.
 		Then I Verify on tapping device back user should navigate back to Koo create screen.
 		Then I Verify Video recording screen should show in full screen by default along with rear camera view.
 		Then I Verify user should be able to record video for min of 3 seconds and max of 1 minute.
 		Then I Verify on tapping Camera switch button, recording screen should switch to front camera and vice versa.
 		Then I Verify on tapping close button device back button popup should show with the text.
 		Then I Verify on tapping Preview button user should navigate to video preview screen along with following options.
 		Then I Verify on tapping back button device back button user should navigate back to video recording screen.
 		Then I Verify on tapping play button, recorded video clip should start playing.
 		Then I Verify on tapping Save button in video recording screen, user should navigate to Koo create screen and recorded video should show as attached.
 		Then I Verify following options should show on the attached recorded video in koo creation screen.
 		Then I Verify on tapping Edit button, user should navigate to Video Edit screen and verify following things in Edit screen.

     @RegressionSuites @AddingVideofromGallery
 Scenario: Adding Video from Gallery
 		Then I Verify user is able to tap on add video button.
 		Then I Verify user should be able to select any of the gallery type.
 		Then I Verify edit, remove and play buttons on the added video.
 		Then I Veriy on tapping edit button user should navigate to preview screen.
 		Then I Verify on tapping play button user should land on preview screen and video should start playing automatically.
 		Then I Verify on tapping cancel button the added video should disappear from koo creation screen.
 		Then I Verify user should not be able to post a koo only by adding a video Without title.

 		 @audiorecoding  @RegressionSuite
  Scenario: Audio koo recording
  	Then I Verify user profile picture is displayed above the mic button.
  	Then I Verify on starting the recording the timer is displayed above the recording button and after 4sec of recording restart button should appear and save button should be enabeled.
    Then I Verify user is able to pause the recording on tapping on pause button.
    Then I Verify on tapping on restart button conformation popup is displayed.
    Then I Verify before saving the recorded video user is able to preview the recorded audio as well as fully recorded length.
    Then I Verify user is able to crop the audio from the preview screen.

     @ImageKoocreationGallery  @RegressionSuite
 Scenario: Image Koo creation (Gallery)
 		Then I Verify user is able to see image upload icon on the koo creation screen.
 		Then I Verify on tapping any perticular image from the gallery, user should navigate to koo creation with the selected image.
 		#Then I Verify the edit and the cancel button on the image.

 		@MultipleImageSelection  @RegressionSuite
 		Scenario: Multiple Image Selection
 		Then I Verify the Add image button at the bottom untill user adds maximum of 4 images.
 #		Then I Verify on long pressing on any image also user should be able to select multiple images.

 @ImageFromCamera  @RegressionSuite
  Scenario: Image From Camera
  	Then I Verify user is able to tap the camera icon.
  	Then I Verify user should ba able to switch between front and back camera and take a picture.
  	Then I Verify user is able to switch on and of the flash while using back camera.
  	Then I Verify on tapping back /cancel button from camera screen user should land on gallery screen.
  	Then I Verify on capturing the image done and cancel button with image cropper should appear.
  	#Done is not shown in v 94.7
	#Then I Verify on tapping on done after cropping or without cropping user should land on koo creation screen with the captured image.
  	Then I Verify user should not be able to post a koo without adding title.
#

  	@RegressionSuites @kooCombination
  Scenario: Koo creation combinations
  	#Then I Verify user is able to post koo only by recording video.
  	#Then I Verify user is able to post koo only by attaching image or images.
  	Then I Verify user is able to post koo by adding in combinations of title and audio.
  	Then I Verify user is able to post koo by adding in combinations of title and video.
  	Then I Verify user is able to post koo by adding in combinations of title and link.
  	Then I Verify user is able to post koo by adding in combinations of audio and link.
    Then I Verify user is able to post koo by adding in combinations of audio and images.
  	Then I Verify user is able to post koo by adding in combinations of title, video and link.
    Then I Verify user is able to post koo by adding in combinations of title, audio and link.
    Then I Verify user is able to post koo by adding in combinations of title, audio and images.
    Then I Verify user is able to post koo by adding in combinations of title, video and images.

 @Rekoowithcomment  @RegressionSuites
 Scenario: Rekoo with comment
 		Then I Verify user is able to rekoo with comment on tapping on rekoo button and selecting rekoo with comment
		Then I Verify user is able to rekoo with comment by adding text, audio, video, link and image.
		Then I Verify user is able to rekoo with comment by adding a comment with the combination of all.

 @Comment  @RegressionSuites
  Scenario: comment
  	Then I Verify user is able to comment on tapping on comment button
  	Then I Verify user is able to create and post comment by adding text, audio, video, link and image.
  	Then I Verify user is able to create and post comment by adding a comment with the combination of all.


 @RegressionSuites @CommentsOff
 Scenario: Comments Off
 		Then I Verify Koo comments off feature for scenarios for Edit Koo feature.
 		Then I Verify on selecting everyone all the users using koo app they can comment on that respective koo.

 @RegressionSuites @GIFImages
 Scenario: GIF Images
 		Then I Verify on tapping GIF icon GIF images should load and display.
 		Then I Verify on tapping any of the GIF image respective image should show on koo creation screen.


  @Testcase2_KooCreation  @RegressionSuite
  Scenario: Verifying MultiLingual Koo Creation Scenerios
    #Then  I Verify user is able to perform like, rekoo, comment, rekoo with comment etc on all MLK koos and Verify the reacted koos on reactors profile.
    Then I Verify Translate form original language button shown in Active languages title box and On tapping the button translates text from original language should load in title.
    Then I Verify number indication on post button - number of languages koo is created.
    Then I Verify Available in these many languages text should show on the koo card in feed as well as on koo detailed screen with blue colour and globe icon
    Then I Verify after posting an MLK, if user edits koo in particular language & change content in another language, that koo should appear in latest updated language.
    Then I Verify posted koos should show individually on profile screen with language indication button.
    Then I Verify User should be able to import Hastag from original language & should be in Blue colour.
    Then I User should be able to import links attached in koo title from original language & should be in blue colour.
    Then I Verify If user Indian Eng user posts in Nigerian Eng, Koo should not show on Indian Eng feed.
    Then I If user Nigerian Eng user posts in Indian Eng, Koo should not show on Nigerian Eng feed.
    Then I Verify User should be able to create poll with min two and max four options.

  @Testcase3_KooCreation @KooCreation2  @RegressionSuite
  Scenario: Verifing LanguageSelection Koo Creation Scenerios
    Then I Verify on changing the language from language selection screen and back to current language posted koos should not disappear on feed screen.
    Then I On tapping koo creation button user should land on Multi Lingual Koo creation screen from:- Feed,Own Profile,create Your first koo button
    Then I Verify user should be able to delete individual koo from profile screen and koo detailed screen.
    Then I Verify on tapping plus button user should navigate to language selection screen there should be Active and Others Language
    Then I Verify remaining languages should show on other languages section with empty checkbox.
  #  Then I Verify koo creation title box should move on swiping with respective language highlighting.
    Then I Verify on selecting the language from others section, selected languages should add on active languages list with checkbox enabled and language ordering toggle button.
    Then I Verify unavailable languages should show on other languages section with empty checkbox and coming soon button.
    Then I Verify on tapping unavailable(Coming Soon) languages on language selection screen no action should happen
    Then I Verify tapping Done button on language selection screen user should navigate to koo creation screen with all the added languages.
    Then I Verify Whats on your mind text should in respective languages.
    Then I Verify on deselecting the language from active languages section respective language should show on other languages section with checkbox disabled on language selection screen tapping proceed button respective language should disappear on koo creation screen.
    Then I Verify there should be two countries on language selection screen India and Nigeria.
    Then I Verify on select language screen on selecting Indian country indian language options should show On selecting Nigeria country nigerian language options should show
    Then I Verify after switching the country India and Nigeria active languages section should be empty
    Then I Verify user should be able to select both Indian & Nigerian languages for MLK creation
    Then I Verify action buttons should show for respective language koos on feed screen, profile screen and koo detailed screen -Like, Rekoo, Comment & Rekoo with comment
    Then I Verify koos count should increase on profile screen based on the languages user is creating.

     @Testcase4_KooCreation  @RegressionSuite
  Scenario: Verifying LanguageSelection Koo Creation Scenerios4
    Then Verify post button should not enable only on adding media from bottom bar.
    Then Verify user should be able to create Koo with Following Combinations: Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link
    Then Verify user should be able to create Koo with Following Combinations: Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link
    Then Verify user is able to add different types of media in different languages.
    Then Verify user should be able to able view preview of added media in MLK creation screen and user should able to play audio,vidoe,open and the attach link and see the added images.
    Then Verify Import Audio/Video/Link/Imagesl from original language button On tapping the button media from original langauge should load.
    Then Verify Profile picture icon on top of koo creation title box.
    Then I am logged in to Koo App using test account with mobile number "1111100034"
    Then Once updating updated profile should reflect instead of profile picture icon.

    @MultiLingualKooNotification  @RegressionSuite
  Scenario: Verify Multi Lingual Koo Notification
    Then Verify notifications should come for all the created koos.
    Then Verify the comment, rekoo, rekoo with comment on the creators profile.
    Then I am logged in to Koo App using test account with mobile number "1111100033"
    Then I login in into other follower account
     Then I am logged in to Koo App using test account with mobile number "1111100034"
    Then I Verify Like,Rekoo and comments
    #Then Verify user should be able to switch between the different languages in koo details screen.
    Then Verify user is able to follow/unfollow user after navigating to koo details screen by tapping on notifications.
    Then Verify on tapping on notifications user should navigate to respective koo details screen

