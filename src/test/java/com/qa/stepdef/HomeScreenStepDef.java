package com.qa.stepdef;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeScreenStepDef {
	
	String feedTab = "Feed";
	String peopleTab = "People";
	
	@Given("^After login I am on the Homescreen$")
	public void verifyProfilePicture() {
		new HomePage().verifyTheProfilePicture();
	}
	
	@Then("I Verify the Profile picture at the left top of the screen.")
	public void i_verify_the_profile_picture_at_the_left_top_of_the_screen() {
		new HomePage().verifyTheProfilePicture();
	}

	@Then("Verify koo icon at the top center of the screen.")
	public void verify_koo_icon_at_the_top_center_of_the_screen() {
		new HomePage().verifyTheKooIcon();
	}

	@Then("Verify trending koos icon on the top right of the screen.")
	public void verify_trending_koos_icon_on_the_top_right_of_the_screen() {
		new HomePage().verifyTheTrendingKooIcon();
	}

	@Then("^Verify the feed, people tab for selected user in respective language.$")
	public void verifyFeedsPeople_etc() {
		new HomePage().verifyFeed(feedTab);
		new HomePage().verifyPeopleText(peopleTab);
	}

	@Then("Verify Koo cretion text box with plus icon below home screen tabs headers.")
	public void verify_koo_cretion_text_box_with_icon_below_home_screen_tabs_headers() {
		new HomePage().verify_koo_cretion_text_box_with_icon_below_home_screen_tabs_headers();
	}   

	@Then("Verify the Feed, People tab and Cricket tab in respective languages")
	public void verify_the_feed_people_tab_and_cricket_tab_in_respective_languages() {
	    
	}
	@Then("Verify on scrolling down in feed people you can follow list should be present")
	public void verify_on_scrolling_down_in_feed_list_should_be_present() throws Exception {
		new HomePage().verifyOnScrollingFeedSeePeopleYouCanFollow();
	}

	@Then("Verify after scroll to bottom, End of Feed banner should be shown with Follow Poeple button.")
	public void verify_after_scroll_to_bottom_banner_should_be_shown_with_button() throws Exception {
		new HomePage().verify_after_scroll_to_bottom_banner_should_be_shown_with_button();
	}

	@Then("Verify Koo creation button should show as FAB icon in Home, Explore, Public profile and Notifications screens.")
	public void verify_koo_creation_button_should_show_as_fab_icon_in_home_explore_public_profile_and_notifications_screens() {
		new HomePage().verify_koo_creation_button_should_show_as_fab_icon_in_home_explore_public_profile_and_notifications_screens();
	}

	@Then("Verify Koo create FAB icon should show as +Koo in respective languages.")
	public void verify_koo_create_fab_icon_should_show_as_in_respective_languages() throws Exception {
		new HomePage().verify_koo_create_fab_icon_should_show_as_in_respective_languages();
	}

	@Then("Verify Koo create FAb icon should on show with plus icon for English & tamil languages.")
	public void verify_koo_create_f_ab_icon_should_on_show_with_icon_for_english_tamil_languages() {
		new HomePage().verify_koo_create_f_ab_icon_should_on_show_with_icon_for_english_tamil_languages();
	}

	@Then("For English users it should show inside circular button.")
	public void for_english_users_it_should_show_inside_circular_button() {
	   
	}

	@Then("For Tamil users it should show inside oval shaped button.")
	public void for_tamil_users_it_should_show_inside_oval_shaped_button() {
	   
	}

	@Then("Verify Auido primer should play on navigating to feed screen after some time, soon after login.")
	public void verify_auido_primer_should_play_on_navigating_to_feed_screen_after_some_time_soon_after_login() {
	   
	}

	@Then("Verify Until Audio primer completes koo creation button FAB icon should not show on feed screen.")
	public void verify_until_audio_primer_completes_koo_creation_button_fab_icon_should_not_show_on_feed_screen() {
	   
	}
	
	

	@Then("Verify Trending hashtags list Should not show on Feed screen for new user and Should start showing on Feed after following one user.")
	public void verify_trending_hashtags_list_should_not_show_on_feed_screen_for_new_user_and_should_start_showing_on_feed_after_following_one_user() throws Exception {
		new HomePage().verify_trending_hashtags_list_should_not_show_on_feed_screen_for_new_user_and_should_start_showing_on_feed_after_following_one_user();
	}
	@Then("Verify blink on Top 50 Bulk follow button in feed screen.")
	public void verify_blink_on_top_bulk_follow_button_in_feed_screen() throws Exception {
		new HomePage().verify_blink_on_top_bulk_follow_button_in_feed_screen();
	}

	@Then("Verify on scrolling the screen user is able to see trending koos button")
	public void verify_on_scrolling_the_screen_user_is_able_to_see_trending_koos_button() throws Exception {
		new HomePage().verify_on_scrolling_the_screen_user_is_able_to_see_trending_koos_button();
	}

	@Then("Verify on scrolling down the complete feed screen, Keep following user for seeing Feed text should show.")
	public void verify_on_scrolling_down_the_complete_feed_screen_keep_following_user_for_seeing_feed_text_should_show() {
	   
	}

	@Then("Verify all the tabs in Home screen for one day old user-Feed, People, Following, Trending, New, Latest, Polls, Popular, Cricket and Videos.")
	public void verify_all_the_tabs_in_home_screen_for_one_day_old_user_feed_people_following_trending_new_latest_polls_popular_cricket_and_videos() throws Exception {
		new HomePage().verify_all_the_tabs_in_home_screen_for_one_day_old_user_feed_people_following_trending_new_latest_polls_popular_cricket_and_videos();
	}
	
	@Then("I Verify on tapping each segment user should enter SBF detail screen, which displays list of profiles to be followed in that category.")
	public void i_verify_on_tapping_each_segment_user_should_enter_sbf_detail_screen_which_displays_list_of_profiles_to_be_followed_in_that_category() throws InterruptedException {
		
		new HomePage().i_verify_on_tapping_each_segment_user_should_enter_sbf_detail_screen_which_displays_list_of_profiles_to_be_followed_in_that_category();
	}

	@Then("I Verify user should be able to follow profile inside SBF detail screen.")
	public void i_verify_user_should_be_able_to_follow_profile_inside_sbf_detail_screen() throws InterruptedException {
		new HomePage().verify_user_should_be_able_to_follow_profile_inside_sbf_detail_screen();
	}

	@Then("I Verify Koo team video of respectie language should be displayed on feed & user should be able to react on that koo.")
	public void i_verify_koo_team_video_of_respectie_language_should_be_displayed_on_feed_user_should_be_able_to_react_on_that_koo() throws Exception {
		new HomePage().i_verify_koo_team_video_of_respectie_language_should_be_displayed_on_feed_user_should_be_able_to_react_on_that_koo();
	}

	@Then("I Verify sample koos feed below Koo team video, for non English users.")
	public void i_verify_sample_koos_feed_below_koo_team_video_for_non_english_users() {
	    
	}

	@Then("I Verify Koo team profile should be followed by default for non English users.")
	public void i_verify_koo_team_profile_should_be_followed_by_default_for_non_english_users() throws Exception {
		new HomePage().i_verify_koo_team_profile_should_be_followed_by_default_for_non_english_users();
	}

	@Then("I Verify after following ine profile, sample feed should disappear on feed screen.")
	public void i_verify_after_following_ine_profile_sample_feed_should_disappear_on_feed_screen() {
		new HomePage().i_verify_after_following_ine_profile_sample_feed_should_disappear_on_feed_screen();
	}

	@Then("I Verify Discover relavent people section should show on feed, for available sections in resspective languages.")
	public void i_verify_discover_relavent_people_section_should_show_on_feed_for_available_sections_in_resspective_languages() {
	   
	}

	@Then("I Verify End of Feed banner woth follow people button, at the bottom of feed screen.")
	public void i_verify_end_of_feed_banner_woth_follow_people_button_at_the_bottom_of_feed_screen() {
		new HomePage().i_verify_end_of_feed_banner_woth_follow_people_button_at_the_bottom_of_feed_screen();
	}

	@Then("I Verify on tapping follow people button on end of feed banner, user should land on peole tab.")
	public void i_verify_on_tapping_follow_people_button_on_end_of_feed_banner_user_should_land_on_peole_tab() {
	    
	}

	@Then("I Verify channel creation popup should be displayed on tapping on rekoo, posting comment & creating koo.")
	public void i_verify_channel_creation_popup_should_be_displayed_on_tapping_on_rekoo_posting_comment_creating_koo() {
		new HomePage().i_verify_channel_creation_popup_should_be_displayed_on_tapping_on_rekoo_posting_comment_creating_koo();
	}

	@Then("I Verify on tapping on follow button from any section twentyfive profiles should be folowed and the respective card should disappear.")
	public void i_verify_on_tapping_on_follow_button_from_any_section_twentyfive_profiles_should_be_folowed_and_the_respective_card_should_disappear() {
		new HomePage().i_verify_on_tapping_on_follow_button_from_any_section_twentyfive_profiles_should_be_folowed_and_the_respective_card_should_disappear();
	}

	@Then("I Verify after following one profile all the koos from the user should show on feed.")
	public void i_verify_after_following_one_profile_all_the_koos_from_the_user_should_show_on_feed() {
		new HomePage().i_verify_after_following_one_profile_all_the_koos_from_the_user_should_show_on_feed();
	}

	@Then("I Verify after following one person, new user feed structure should disappear & latest koo by followed account should show on top of the feed.")
	public void i_verify_after_following_one_person_new_user_feed_structure_should_disappear_latest_koo_by_followed_account_should_show_on_top_of_the_feed() {
		new HomePage().i_verify_after_following_one_person_new_user_feed_structure_should_disappear_latest_koo_by_followed_account_should_show_on_top_of_the_feed();
	}

	@Then("I Verify unfollowing all the profiles, new user feed stucture should be shown.")
	public void i_verify_unfollowing_all_the_profiles_new_user_feed_stucture_should_be_shown() throws InterruptedException {
		
		new HomePage().i_verify_unfollowing_all_the_profiles_new_user_feed_stucture_should_be_shown();
	}

	@Then("I Verify on following any user {string} button should show and tapping on it feed should refresh.")
	public void i_verify_on_following_any_user_button_should_show_and_tapping_on_it_feed_should_refresh(String string) {
	    
	}

	@Then("I Verify on top of feed {string} carousel with profile cards to follow.")
	public void i_verify_on_top_of_feed_carousel_with_profile_cards_to_follow(String string) {
	    
	}

	
	
	@Given("I logout from the account")
	public void logOut() {
		new HomePage().logOutFromAccount();
	}

	@Given("I Verify the feed structure in the following order for newly installed user and People you can follow careosule in the first position with infinite profile suggestions.")
	public void i_verify_the_feed_structure_in_the_following_order_for_newly_installed_user_and_people_you_can_follow_careosule_in_the_first_position_with_infinite_profile_suggestions() throws Exception {
		
		new HomePage().i_verify_the_feed_structure_in_the_following_order_for_newly_installed_user_and_people_you_can_follow_careosule_in_the_first_position_with_infinite_profile_suggestions();
	}

	@Then("I Follow people button and Top fifty Bulk Follow button For non English languages.")
	public void i_follow_people_button_and_top_fifty_bulk_follow_button_for_non_english_languages() throws InterruptedException {
		new HomePage().i_follow_people_button_and_top_fifty_bulk_follow_button_for_non_english_languages();
	}

	@Then("I Segment Bulk follow carousels \\(Only for Kannada & Hindi languages).")
	public void i_segment_bulk_follow_carousels_only_for_kannada_hindi_languages() {
		//new HomePage().i_segment_bulk_follow_carousels_only_for_kannada_hindi_languages();
	}
//For The new koo user
	@Then("I  Koo team demo video for respective language and Discover Relavent Poeple section and Sample feed \\(For non english languages).")
	public void i_koo_team_demo_video_for_respective_language_and_discover_relavent_poeple_section_and_sample_feed_for_non_english_languages() throws Exception {
		new HomePage().i_koo_team_demo_video_for_respective_language_and_discover_relavent_poeple_section_and_sample_feed_for_non_english_languages();
		//new HomePage().logOutFromAccount();
	}

	@Then("I Verify on top of feed people you can follow carousel with profile cards to follow.")
	public void i_verify_on_top_of_feed_carousel_with_profile_cards_to_follow() throws Exception {
		new HomePage().i_verify_on_top_of_feed_carousel_with_profile_cards_to_follow();
	}

	@Then("I Verify the profile cards on feed carousels should not shuffel for new users it should only start once the user is {int} days old.")
	public void i_verify_the_profile_cards_on_feed_carousels_should_not_shuffel_for_new_users_it_should_only_start_once_the_user_is_days_old(Integer int1) {
		//new HomePage().
	}

	@Then("I Verify on following a profile on feed for the first time, user should get View New Feed button & tapping on it feed should refresh.")
	public void i_verify_on_following_a_profile_on_feed_for_the_first_time_user_should_get_view_new_feed_button_tapping_on_it_feed_should_refresh() {
		new HomePage().i_verify_on_following_a_profile_on_feed_for_the_first_time_user_should_get_view_new_feed_button_tapping_on_it_feed_should_refresh();
	}

	@Then("I Verify on following any user New Koos button should show and tapping on it feed should refresh.")
	public void i_verify_on_following_any_user_button_should_show_and_tapping_on_it_feed_should_refresh() {
		//new HomePage().i_verify_on_following_any_user_button_should_show_and_tapping_on_it_feed_should_refresh();
	}

	@Then("I Verify Follow People button below people you can follow carousel & tapping on it user should land on people tab.")
	public void i_verify_follow_people_button_below_people_you_can_follow_carousel_tapping_on_it_user_should_land_on_people_tab() throws Exception {
		new HomePage().i_verify_follow_people_button_below_people_you_can_follow_carousel_tapping_on_it_user_should_land_on_people_tab();
		new HomePage().logOutFromAccount();
	}
	
	
	
	@Then("^Verify the home, explore, search, chat, and notification buttons at the bottom of the screen.$")
	public void verifyTheHomeExplore() throws InterruptedException {
		new HomePage().verifyTheHomeExplorer();
	}

	@Then("^Verify the koo cards of the followed users should be present in the feed.$")
	public void verifyTheKooCards() {
		new HomePage().verifyTheKooCards();
	}

	@Then("^Verifty in feed \"([^\"]*)\" list should be present$")
	public void verifyOnScrollingFeed(String txt) {
		
	}

	@Then("^Verify at the end of feed Keep following users for seeing feed message should be displayed.$")
	public void verifyFeedMessage() {
		new HomePage().verifyFeedMessage();
	}

	@Then("^Verify Find your friends button and people you may know section-After giving contacts permission in feed and people tab.$")
	public void verifyFindYourFriends() throws Exception {
		new HomePage().verifyFindFriendsIsPresentAfterScrolling();
	}

	@Then("^Verify on tapping trending koos button user should navigate to respective screen.$")
	public void verifyOnTappingTrendingKoosButton() throws InterruptedException {
		new HomePage().verifyOnClickRefreshOfKooIcon();
	}



//	Validate the New User Flow

//	verify navigations of Koo App 
	@Then("^Verify on tapping on the profile picture user is navigated to profile screen and on pressing back button user should navigate back to feed.$")
    public void verifyProfiilePictureClick() throws InterruptedException {
       new HomePage().
       	verifyProfilePictureClick();
    }
	@Then("^Verify on tapping koo icon user is navigated to top of the feed and the feed should get refreshed.$")
	public void verifyRefreshOnKooIconClick() throws InterruptedException {
		new HomePage().verifyOnClickRefreshOfKooIcon();
	}
	
	@Then("^Verify on tapping trending koos icon user should navigate to ternding koo screen and on tapping back button user should ba navigated back to feed$")
	public void verifyTappingOnTrendingKoosIconUserNavigateToKooScreen() throws Exception {
		new HomePage().
			verifyOnClickKooIconUserNavigatedToKooScreen();
	}
	
	@Then("^Verify on tapping home icon user is navigated to top of the feed and the feed should get refreshed.$")
	public void verifyOnTappingHomeIconUserNavigatedToTopOfTheFeed() throws InterruptedException {
		new HomePage().
			verifyOnTappingToHomeIconUserNavigatedToTopOfFeed();
	}
	
	@Then("^Verify on tapping on the search button user is navigated to search screen and on pressing back button user should navigate back to feed.$")
	public void verifyOnSearchButtonClickNavigateToSearchScreenThenBackButtonToHomeScreen() {
		new HomePage().
			verifyOnTappingToHomeIconUserNavigatedToTopOfFeed();
	}
	
	@Then("^Verify on tapping on the Chat button user is navigated to chat screen and on pressing back button user should navigate back to feed.$")
	public void verifyOnTappingOnChatButtonIsNavigatedToChatScreenPressingBackButtonNavigatesToHomeScreen() throws Exception {
		new HomePage().
			verifyOnTappingOnChatButtonIsNavigatedToChatScreenPressingBackButtonNavigatesToHomeScreen();
	}
	
	@Then("^Verify on tapping on the notification button user is navigated to notification screen and on pressing back button user should navigate back to feed.$")
	public void verifyOnNotificationButtonNavigatesToNotificationScreenThenBackButtonNavigatesToHomeScreen() throws Exception {
		new HomePage().
		verifyOnNotificationButtonNavigatesToNotificationScreenThenBackButtonNavigatesToHomeScreen();
	}
	
	@Then("^Verify on tapping on the people user is navigated to people screen and on pressing feed button user should land back on feed.$")
	public void verifyTapOnPeopleButtonNavigateUserToPeopleScreenPressingFeedNavigateToFeedScreen() throws Exception {
		new HomePage().
			verifyTapOnPeopleButtonNavigateUserToPeopleScreenPressingFeedNavigateToFeedScreen();
	}
	
	@Then("^Verify tapping on Trending tab for one day old users , Trending tab should be displayed  and tapping back user should land on feed screen$")
	public void verifyTapOnTrendingButtonNavigateToTrendingPageTapOnBackButtonNavigateToFeedScreen() throws Exception {
		new HomePage().
			verifyTapOnTrendingButtonNavigateToTrendingPageTapOnBackButtonNavigateToFeedScreen();
	}
	
	@Then("Verify on tapping on the view more button from any list user is navigated to respective screen and on pressing back button user should navigate back to feed.")	
    public void verifyOnTappingOnTheViewMoreButtonFromAnyListUserIsNavigatedToRespectiveScreenAndOnPressingBackButtonUserShouldNavigateBackToFeed() throws Exception {
	new HomePage().FromAnyListUserIsNavigatedToRespectiveScreenAndOnPressingBackButtonUserShouldNavigateBackToFeed();
	//verifyOnTappingOnTheViewMoreButtonFromAnyListUserIsNavigatedToRespectiveScreenAndOnPressingBackButtonUserShouldNavigateBackToFeed();
	}
	

	@Then("Verify justification text and comment threads should not be displayed in any of the other tabs execpt feeds tab")
	public void verifyJustificationTextAndCommentThreadsShouldNotBeDisplayedInAnyOfTheOtherTabsExecptFeedsTab() throws InterruptedException {
		new HomePage().verifyJustificationTextAndCommentThreadsShouldNotBeDisplayedInAnyOfTheOtherTabsExecptFeedsTab();
	}

	@Then("Verify koos should be displayed as per the timestamps\\(latest koo first) in all of the home tabs")
	public void verifyKoosShouldBeDisplayedAsPerTheTimestampsLatestKooFirstInAllOfTheHomeTabs() {
		new HomePage().verifyKoosShouldBeDisplayedAsPerTheTimestampsLatestKooFirstInAllOfTheHomeTabs();
	}
	
// Verify Koo Card functionality
	@Then("^Verify profile picture, name, handel, profession and time of koo creation should be displayed on every koo card.")
	public void verifyProfilePicNameHandelProfessionTimeOfKooCreated() throws Exception {
		new HomePage().verifyProfilePicNameHandelProfessionTimeOfKooCreated();
	}
	
	@Then("^Verify for non followed user follow button should be displayed.")
	public void verifyForNonFollowedUseFollowButtonDisplay() throws InterruptedException {
		new HomePage().verifyForNonFollowedUseFollowButtonDisplay();
	}

	
	@Then("^Verify the created koo content should be present on the koo card.")
	public void VerifyKooContentOnKooCard() throws InterruptedException{
		new HomePage().VerifyKooContentOnKooCard();
	}
	
	@Then("^Verify the comment, rekoo, like, share buttons should be present below the koo content.")
	public void VerifyCommentLikeRekooShareButtonOnKooContent() throws Exception {
		new HomePage().VerifyCommentLikeRekooShareButtonOnKooContent();
	}
	
	@Then("^Verify on tapping on profile picture, name or handel user should be navigated to the koo creators profile.")
	public void VerifyTappingProfileNameHandelNavigateToProfileDeail() throws InterruptedException{
		new HomePage().VerifyTappingProfileNameHandelNavigateToProfileDeail();
	}
	
	@Then("^Verify on tapping on the play button on audio or video koo card it should start to play.")
	public void VerifyTappingPlayButtonOnKooCardToStart() throws Exception{
		new HomePage().VerifyTappingPlayButtonOnKooCardToStart();
	}
	
	@Then("^Verify on tapping on the image koo it should open in full screen.")
	public void VerifytappingImageToOpenFullScreen() throws InterruptedException{
		new HomePage().VerifytappingImageToOpenFullScreen();
	}
	
	@Then("^Verify on tapping on news link it should navigate to perticular news item.")
	public void VerifytappingNewsLinkAndNavugateToParticularLink() throws Exception{
		new HomePage().VerifytappingNewsLinkAndNavugateToParticularLink();
	}
	
	@Then("^Verify on rekooed koo cards rekoo icon along with \"Username rekkoed\" should be displayed.")
	public void VerifyRekooIconFunctionality() throws Exception{
		new HomePage().VerifyRekooIconFunctionality();
	}
	
	@Then ("^Verify if koo contains any comments that comment should be displayed.")
	public void VerifyCommentsPresent() throws Exception{
		new HomePage().VerifyCommentsPresent();
	}
	
	@Then("^Verify on tapping on hash tags present in koo title user should navigate to koo present with perticular hashtags")
	public void VerifyHashtagPresentandNavigateToParticularHashtag() throws InterruptedException{
		new HomePage().VerifyHashtagPresentandNavigateToParticularHashtag();
	}
	
	@Then("^Verify on tapping on back button user should navigate back to feed.")
	public void VerifybackButtonandContinue() throws InterruptedException {
		new HomePage().VerifybackButtonandContinue();
	}
	
	@Then("^Verify in comments screen parent koo creator profile pic should be displayed along with Replying to @user handel should be displayed and on dragging the screen down the parent koo should be displayed with profile picture, name and handel")
	public void VerifybyTappingoncommentAndThenOnCommentField() throws Exception {
		new HomePage().VerifybyTappingoncommentAndThenOnCommentField();
	}
	
	@Then("^Verify on tapping on comment icon on koo card user should navigate to comments screen and on tapping on back button user should navigate back to feed.")
	public void VerifybyTappingoncommentAndThennavigateBackToFeed() throws Exception {
		new HomePage().VerifybyTappingoncommentAndThennavigateBackToFeed();
	}
		
	@Then("^Verify on tapping on rekoo icon user should get a bottom bar with rekoo, rekoo with comment options should be displayed.")
	public void VerifybyTappingonReeKooButton() throws Exception {
		new HomePage().VerifybyTappingonReeKooButton();
	}
	
	@Then("^Verify on tapptng on rekoo with comment, rekoo with comment screen should be displayed and on pressing back button user should navigate to feed screen.")
	public void VerifybyTappingonReeKoowithcommentButton() throws Exception {
		new HomePage().VerifybyTappingonReeKoowithcommentButton();
	}
	
	@Then("^Verify on tapptng on share icon whats app send to screen should be displayed and on pressing back button user should navigate to feed screen.")
	public void VerifybyTappingonWhatsAppShareButton() throws Exception {
		new HomePage().VerifybyTappingonWhatsAppShareButton();
	}
	
	@Then("^Verify on tapping on rekoo or rekoo with comment form the botton bar the perticular koo should be rekooed and the rekoo icon should turn green andcount should increase by 1.")
	public void VerifybyTappingonReeKooButtonGetIncreasedByOne() throws Exception {
		new HomePage().VerifybyTappingonReeKooButtonGetIncreasedByOne();
	}
	
	@Then("^Verify on tapping on like button the like button should turn to blue color and the count should increase by 1.")
	public void VerifybyTappingonlikeButtonGetIncreasedByOne() throws InterruptedException {
		new HomePage().VerifybyTappingonlikeButtonGetIncreasedByOne();
	}
	
	@Then("^Verify on posting a comment on koo comment count should increase.")
	public void VerifybyPostingCommentAndKooCommentIncrease() throws Exception {
		new HomePage().VerifybyPostingCommentAndKooCommentIncrease();
	}
	
	@Then("^Verify user should be able to see comments bar once user has spent 3 seconds on koo.")
	public void VerifybyPostingCommentAfterPostingComment() throws InterruptedException {
		new HomePage().VerifybyPostingCommentAfterPostingComment();
	}
	
	@Then("^Verify on tapping on show threads user should navigate to koo detail view which contains all the comments to the koo")
	public void VerifybyTappingThreadsAndNavigateToKooDetailedComments() throws Exception {
		new HomePage().VerifybyTappingThreadsAndNavigateToKooDetailedComments();
	}
	
	@Then("^Verify on tapping comments bar user should navigate to koo creations screen where user can comment for respective koo")
	public void VerifybyTappingCommentFieldsOfFeeds() throws InterruptedException {
		new HomePage().VerifybyTappingCommentFieldsOfFeeds();
	}
	
	@Then("^Verify after posting the new koo share koo through facebook button should show below the posted koos with blink.")
	public void VerifyAfterPostingNewKooFaceBookButtonAppear() throws InterruptedException {
		new HomePage().VerifyAfterPostingNewKooFaceBookButtonAppear();
	}
	
	@Then("^Verify on tapping it should navigate to respective page and shared koo link should display.")
	public void VerifyFacebookButtonFunctionality() throws InterruptedException {
		new HomePage().VerifyFacebookButtonFunctionality();
	}
	
	@Then("^Verify by tapping on Poll tag.")
	public void VerifypollsUndePollTag() throws InterruptedException  {
		new HomePage().VerifypollsUndePollTag();
	}
	
	@Then("^Verify posted poll should show on feed along with percentage and poll end date.")
	public void VerifyPollTagCreationAndVerifyAtFeeds() throws InterruptedException  {
		new HomePage().VerifyPollTagCreationAndVerifyAtFeeds();
	}
	
	@Then("^Verify on tapping poll title, poll options, votes section and poll duration user should navigate to koo detailed screen and is able to see below icons below polls, Comment, rekoo, like, facebook and whatsapp share icons")
	public void VerifyTappingOnDifferentPartsOfCreatedPoll() throws InterruptedException {
		new HomePage().VerifyTappingOnDifferentPartsOfCreatedPoll();
	}
	
	@Then("^Verify user should be able to vote only once for each poll.")
	public void VerifyUserShouldAbelVoteOnlyOnceForEachPoll() throws InterruptedException {
		new HomePage().VerifyUserShouldAbelVoteOnlyOnceForEachPoll();
	}
	
	@Then("Verify user is able to see below icons below polls.")
	public void VerifyUserIsAbleToSeeBelowIconsBelowPolls() throws InterruptedException {
		new HomePage().VerifyUserIsAbleToSeeBelowIconsBelowPolls();		
	}
	
	@Then("verify by deleting the generated poll.")
	public void VerifyByDeletingTheGeneratedPoll() throws InterruptedException {
		new HomePage().VerifyByDeletingTheGeneratedPoll();	
	}
	
	@Then("Verify more like this button should be displayed when users have posted a koo with hashtags which have ML recommendations.")
	public void VerifyByCreatingKooUSingHashTagInIt() throws Exception {
		new HomePage().VerifyByCreatingKooUSingHashTagInIt();	
	}
	
	@Then("Verify tapping on more like this button users should land to that particular hashtag screen")
	public void VerifyTappingOnMoreLikeThisButtonUsersShouldLandToThatParticularHashtagScreen() throws InterruptedException {
		new HomePage().VerifyTappingOnMoreLikeThisButtonUsersShouldLandToThatParticularHashtagScreen();	
	}
	
	@Then("Verify on tapping share icon, share sheet should open options popup with available app on the user's device.")
	public void VerifyOnTappingShareIconShareSheetShouldOpenOptionsPopupWithAvailableAppOnTheUserDevice() throws InterruptedException {
		new HomePage().VerifyOnTappingShareIconShareSheetShouldOpenOptionsPopupWithAvailableAppOnTheUserDevice();	
	}
	
	@Then("Verify for followed user Koo dropdown unfollow option should display & tapping on it confirmation popup should be shown.")
	public void VerifyForFollowedUserKooDropdownUnfollowOptionShouldDisplay() throws Exception {
		new HomePage().VerifyForFollowedUserKooDropdownUnfollowOptionShouldDisplay();	
	}
	
	@Then("Verify on tapping Report Koo, Koo Report screen with report koo options should open.")
	public void VerifyOnTappingReportKooKooReportScreenWithReportKooOptionsShouldOpen() throws InterruptedException {
		new HomePage().VerifyOnTappingReportKooKooReportScreenWithReportKooOptionsShouldOpen();	
	}
	
	@Then("Verify on tapping Block option, block pop up should appear.")
	public void VerifyOnTappingBlockOptionBlockPopUpShouldAppear() throws InterruptedException {
		new HomePage().VerifyOnTappingBlockOptionBlockPopUpShouldAppear();	
	}
	
	@Then("Verify on tapping Report User, User Report screen with report user options should open.")
	public void VerifyOnTappingReportUser() throws InterruptedException {
		new HomePage().VerifyOnTappingReportUser();	
	}

	
//	People you can follow
	
	@Then("^Verify the people you can follow list should be present after every few koo cards.$")
	public void peopleYouCanFollowText() throws InterruptedException {
		new HomePage().
			peopleYouCanFollowText();
	}
	
	@Then("^Verify at the end of the list Follow people card is displayed and tapping anywhere on that card user should be navigated to peoples screen.$")
	public void verifyEndListFollowPeopleCardPresentNavigatesToPeopleScreen() throws InterruptedException {
		new HomePage().
			verifyEndListFollowPeopleCardPresentNavigatesToPeopleScreen();
	}
	
	@Then("^Verify on tapping any where on the card except follow button user is navigated to perticular public profile.$")
	public void verifyOnTappingOnCardNavigatesToProfile() throws InterruptedException {
		new HomePage().verifyOnTappingOnCardNavigatesToProfile();
	}
	
	
	//Report User
	
	@Then("Verify report user option is shown on every koo card except own koos.")
	public void verify_report_user_option_is_shown_on_every_koo_card_except_own_koos() throws Exception {
		new HomePage().verify_report_user_option_is_shown_on_every_koo_card_except_own_koos();
	}

	@Then("Verify user should be able to report user from feed, public profile, koo detail screens and other all screens, by tap on Report user in Koo card options.")
	public void verify_user_should_be_able_to_report_user_from_feed_public_profile_koo_detail_screens_and_other_all_screens_by_tap_on_in_koo_card_options() throws InterruptedException {
		new HomePage().verify_user_should_be_able_to_report_user_from_feed_public_profile_koo_detail_screens_and_other_all_screens_by_tap_on_in_koo_card_options();
	}
	
	@Then("Verify by tap on Report user option in Koo card, user should navigate to Report user screen.")
	public void verify_by_tap_on_report_user_option_in_koo_card_user_should_navigate_to_report_user_screen() {
		new HomePage().verify_by_tap_on_report_user_option_in_koo_card_user_should_navigate_to_report_user_screen();
	}

	@Then("Verify in Report user screen all the reasons should be listed and profile,username and user Bio of respective user should be displayed below the header.")
	public void verify_in_report_user_screen_all_the_reasons_should_be_listed_and_profile_username_and_user_bio_of_respective_user_should_be_displayed_below_the_header() {
		new HomePage().verify_in_report_user_screen_all_the_reasons_should_be_listed_and_profile_username_and_user_bio_of_respective_user_should_be_displayed_below_the_header();
	}

	@Then("Verify App back button should be displayed and by tap on app back button\\/mobile back button, user should navigate back to the respective screen with Koo card.")
	public void verify_app_back_button_should_be_displayed_and_by_tap_on_app_back_button_mobile_back_button_user_should_navigate_back_to_the_respective_screen_with_koo_card() {
		new HomePage().verify_app_back_button_should_be_displayed_and_by_tap_on_app_back_button_mobile_back_button_user_should_navigate_back_to_the_respective_screen_with_koo_card();
	}

	@Then("Verify the reasons listed should be as following: Cyberbullying, Insulting or Intimidating, Shared my or someone elses private information Spamming, Scamming and Phishing, Intellectual Property Infringement, Self Injury or Suicide, Conducts Illegal Activities, Pretending to be me or someone else , Something Else, Not Interested\\\\/ Not Relevant")
	public void verify_the_reasons_listed_should_be_as_following_cyberbullying_insulting_or_intimidating_shared_my_or_someone_elses_private_information_spamming_scamming_and_phishing_intellectual_property_infringement_self_injury_or_suicide_conducts_illegal_activities_pretending_to_be_me_or_someone_else_something_else_not_interested_not_relevant() {
		new HomePage().verify_the_reasons_listed_should_be_present();
	}

	@Then("Verify user should be able to report user by tap on the listed reasons.")
	public void verify_user_should_be_able_to_report_user_by_tap_on_the_listed_reasons() {
		new HomePage().verify_user_should_be_able_to_report_user_by_tap_on_the_listed_reasons();
	}

	@Then("Verify by tap on any listed reasons, Our team will review it and take an action text message should be displayed.")
	public void verify_by_tap_on_any_listed_reasons_our_team_will_review_it_and_take_an_action_text_message_should_be_displayed() {
		new HomePage().verify_by_tap_on_any_listed_reasons_our_team_will_review_it_and_take_an_action_text_message_should_be_displayed();
	}

	@Then("Verify the reported user should be shown in reported user tab in dashboard.")
	public void verify_the_reported_user_should_be_shown_in_reported_user_tab_in_dashboard() {
	    
	}

	@Then("Verify on reporting the user, the particular user should not show to the reported user.")
	public void verify_on_reporting_the_user_the_particular_user_should_not_show_to_the_reported_user() {
	  
	}

	@Then("Verify if user reports the same account again, a toast message saying You have already reportes this user should be shown.")
	public void verify_if_user_reports_the_same_account_again_a_toast_message_saying_you_have_already_reportes_this_user_should_be_shown() {
	    
	}
	
	//reported koo
	
	@Then("Verify report koo option is shown on every koo card except own koos.")
	public void VerifyReportKooOptionIsShownOnEveryKooCardExceptOwnKoos() throws Exception {
		new HomePage().VerifyReportKooOptionIsShownOnEveryKooCardExceptOwnKoos();
	}
	
	@Then("Verify user should be able to report koo from various pages.")
	public void VerifyUserShouldBeAbleToReportKooFromVariousPages() throws Exception {
		new HomePage().VerifyUserShouldBeAbleToReportKooFromVariousPages();
	}
	
	@Then("Verify the reasons listed under Report Koo menu.")
	public void VerifyTheReasonslistedUnderReportKooMenu() throws Exception {
		new HomePage().VerifyTheReasonslistedUnderReportKooMenu();
	}
	
	@Then("Verify user should be able to report koo by tap on the listed reasons.")
	public void VerifyUserShouldBeAbleToReportKooByTapOnTheListedReasons() throws Exception {
		new HomePage().VerifyUserShouldBeAbleToReportKooByTapOnTheListedReasons();
	}
	
	
//out of network
	@Then("Verify OON should show according to time of reaction done on actual koo and not according to acutal koo.")
	public void verifyOONShouldShowAccordingToTimeOfReactionDoneOnActualKoo() throws InterruptedException {
	   new HomePage().verifyOONShouldShowAccordingToTimeOfReactionDoneOnActualKoo();
	}


	@Then("Verify One reaction time is considered on OON koo when there are multile reactions on same koo.")
	public void verifyOneReactionTimeIsConsideredOnOONKooWhenThereAreMultileReactionsOnSameKoo() {
	   
	}

	@Then("Veirfy Justification text should show on OON koo according to the reaction made.")
	public void veirfyJustificationTextShouldShowOnOONKooAccordingToTheReactionMade() {
	   
	}

	@Then("Verify on following OON Koo creator, should show based on the koo created time once after feed refresh.")
	public void verifyOnFollowingOONKooCreatorShouldShowBasedOnTheKooCreatedTimeOnceAfterFeedRefresh() {
	   
	}

	@Then("Verify on following OON Koo, justification text should not show.")
	public void verifyOnFollowingOONKooJustificationTextShouldNotShow() {
	   
	}

	

	@Then("Verify when different users does reaction on OON koo, justification text should show 1st two reactor's names along with type of reaction.")
	public void verifyWhenDifferentUsersDoesReactionOnOONKooJustificationTextShouldShow1stTwoReactorSNamesAlongWithTypeOfReaction() {
	}

	@Then("Veirfy justification text should show only for Out Of Network koos & not for following users koos.")
	public void veirfyJustificationTextShouldShowOnlyForOutOfNetworkKoosNotForFollowingUsersKoos() {
		new HomePage().veirfyJustificationTextShouldShowOnlyForOutOfNetworkKoosNotForFollowingUsersKoos();
	}
	
	@Then("Verify tapping on People,Trending ,Latest, Following, New ,Polls ,Vidoes and popular for one day old users , Poeple tab caorusel content should be displayed  and tapping back user should land on feed screen")
	public void verify_tapping_on_people_trending_latest_following_new_polls_vidoes_and_popular_for_one_day_old_users_poeple_tab_caorusel_content_should_be_displayed_and_tapping_back_user_should_land_on_feed_screen() {
		new HomePage().verify_tapping_on_people_trending_latest_following_new_polls_vidoes_and_popular_for_one_day_old_users_poeple_tab_caorusel_content_should_be_displayed_and_tapping_back_user_should_land_on_feed_screen();
	}
	
//coursoual part	
	@Then("user is in feed screen")
	public void user_is_in_feed_screen() throws Exception {
		new HomePage() .user_is_in_feed_screen();
	}
	
	@Then("I verify that people you can follow should display")
	public void i_verify_that_people_you_can_follow_should_display() throws Exception {
		new HomePage().i_verify_that_people_you_can_follow_should_display();
	}
	
	@Then("I verify that popular should display on feed page")
	public void i_verify_that_popular_should_display_on_feed_page() throws Exception {
		new HomePage().verifyPopular();
	}

	@Then("I verify that newspapers and channels display on feed.")
	public void i_verify_that_newspapers_and_channels_display_on_feed() throws InterruptedException {
		new HomePage().i_verify_that_newspapers_and_channels_display_on_feed();
	}

	@Then("I verify the entertaniment should be shown")
	public void i_verify_the_entertaniment_should_be_shown() throws Exception {
		new HomePage().i_verify_the_entertaniment_should_be_shown() ;
	}

	@Then("I verify that Politicians should display")
	public void i_verify_that_politicians_should_display() throws Exception {
		new HomePage().i_verify_that_politicians_should_display();
	}

	@Then("I verify jornalist should be shown")
	public void i_verify_jornalist_should_be_shown() throws InterruptedException {
		new HomePage().i_verify_jornalist_should_be_shown();
	}

	@Then("I verify poets and authors should display")
	public void i_verify_poets_and_authors_should_display() throws Exception {
		new HomePage().i_verify_poets_and_authors_should_display();
	}

	@Then("I verify new is displayed.")
	public void i_verify_new_is_displayed() {
		new HomePage().i_verify_new_is_displayed();
	}
	
	@Then("I verify government services is displayed")
	public void i_verify_government_services_is_displayed() {
		new HomePage().i_verify_government_services_is_displayed();
	}

	@Then("I verify government officials should display")
	public void i_verify_government_officials_should_display() {
		new HomePage().i_verify_government_officials_should_display();
	}

	@Then("I verify on sports is displayed")
	public void i_verify_on_sports_is_displayed() {
		new HomePage().i_verify_on_sports_is_displayed();
	}

	@Then("I verify interesting accounts should shown")
	public void i_verify_interesting_accounts_should_shown() {
		new HomePage().i_verify_interesting_accounts_should_shown();
	}

	@Then("I verify cricket should displayed")
	public void i_verify_cricket_should_displayed() {
		new HomePage().i_verify_cricket_should_displayed();
	}
	
	@Then("I verify the business should display")
	public void i_verify_the_business_should_display() {
		new HomePage().i_verify_the_business_should_display();
	}

	@Then("I verify that humor is displayed")
	public void i_verify_that_humor_is_displayed() {
		new HomePage().i_verify_that_humor_is_displayed();
	}

	@Then("I verify cheif minister of india is displayed")
	public void i_verify_cheif_minister_of_india_is_displayed() throws Exception {
	     new HomePage().i_verify_cheif_minister_of_india_is_displayed();
	}
	
	//change all the remaning as homepage only
	@Then("I verify interesting people should displayed")
	public void i_verify_interesting_people_should_displayed() {
	    new HomePage().i_verify_interesting_people_should_displayed();
	}
	
	@Then("I verify recently joined is displayed on feed page")
	public void i_verify_recently_joined_is_displayed_on_feed_page() {
	    new HomePage().i_verify_recently_joined_is_displayed_on_feed_page();
	}

	@Then("I verify spiritual leaders is displayed")
	public void i_verify_spiritual_leaders_is_displayed() {
	    new HomePage(). i_verify_spiritual_leaders_is_displayed();
	}

	@Then("I verify user scroll the profiles on carousels")
	public void i_verify_user_scroll_the_profiles_on_carousels() {
	    new HomePage().i_verify_user_scroll_the_profiles_on_carousels();
	}

	@Then("I verify user click on follow the profile and respective profile disappear after refresh the feed screen.")
	public void i_verify_user_click_on_follow_the_profile_and_respective_profile_disappear_after_refresh_the_feed_screen() throws InterruptedException {
	    new HomePage().i_verify_user_click_on_follow_the_profile_and_respective_profile_disappear_after_refresh_the_feed_screen();
	}

	@Then("I verify that unfollowed people should show on both feed and people detail screen")
	public void i_verify_that_unfollowed_people_should_show_on_both_feed_and_people_detail_screen() throws Exception {
	    new HomePage().i_verify_that_unfollowed_people_should_show_on_both_feed_and_people_detail_screen();
	}

	@Then("I verify following button should change in people detail screen")
	public void i_verify_following_button_should_change_in_people_detail_screen() {
	    new HomePage().i_verify_following_button_should_change_in_people_detail_screen();
	}

	@Then("I verify on tapping any profile navigate to respective profile page and tapping on the back button.")
	public void i_verify_on_tapping_any_profile_navigate_to_respective_profile_page_and_tapping_on_the_back_button() throws Exception {
	    new HomePage().i_verify_on_tapping_any_profile_navigate_to_respective_profile_page_and_tapping_on_the_back_button();
	}

	//new by sumeet
	@Given("I Verify the feed structure in the following order for newly installed user without selecting interest.")
	public void i_verify_the_feed_structure_in_the_following_order_for_newly_installed_user_without_selecting_interests() throws Exception {

		new HomePage().i_verify_the_feed_structure_in_the_following_order_for_newly_installed_user_and_people_you_can_follow_careosule_in_the_first_position_with_infinite_profile_suggestions();
	}
	@Then("I Follow people button and Top fifty Bulk Follow button For English languages.")
	public void i_follow_people_button_and_top_fifty_bulk_follow_button_for_english_languages() throws InterruptedException {
		new HomePage().i_follow_people_button_and_top_fifty_bulk_follow_button_for_english_languages();
	}
	@Then("I Verify on top of feed, infinite people carousel with profile cards to follow.")
	public void verify_on_top_of_feed_carousel_with_profile_cards_to_follow() throws Exception {
		new HomePage().verify_on_top_of_feed_carousel_with_profile_cards_to_follow();
	}

	@Then("I Click Back Button")
	public void verifyOnClickBackButton() throws Exception {
		new HomePage().verifyOnClickBackButton();
	}

	@Then("I click On Back To HomeButton")
	public void verifyclickOnBackToHomeButton() throws Exception {
		new HomePage().verifyclickOnBackToHomeButton();
	}



	@Then("I Click On Home Button")
	public void verifyClickOnHomeButton() throws Exception {
		new HomePage().verifyClickOnHomeButton();
	}

	@Then("I Click On Cancel Button")
	public void verifyClickOnCancelButton() throws Exception {
		new HomePage().verifyClickOnCancelButton();
	}

	@Then("I Click On  Manage Unblock Button")
	public void verifyClickOnManageUnblockButton() throws Exception {
		new HomePage().verifyClickOnManageUnblockButton();
	}

	@Then("I Click On Unblock Button")
	public void verifyClickOnUnblockButton() throws Exception {
		new HomePage().verifyClickOnUnblockButton();
	}

	@Then("I Click On MessageIcon Home")
	public void verifyClickOnMessageIconHome() throws Exception {
		new HomePage().verifyClickOnMessageIconHome();
	}

	@Then("I Click On BackArrow Message button")
	public void verifyClickOnBackArrowMessagebutton() throws Exception {
		new HomePage().verifyClickOnBackArrowMessagebutton();
	}

	@Then("I Click On NotificationIcon Home")
	public void verifyClickOnNotificationIconHome() throws Exception {
		new HomePage().verifyClickOnNotificationIconHome();
	}





}
