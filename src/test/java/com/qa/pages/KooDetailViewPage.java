package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utils.TestUtils;

import io.cucumber.java.en.Then;

public class KooDetailViewPage extends BasePage {
	TestUtils utils = new TestUtils();

	@FindBy(xpath="//android.widget.TextView[@text='Feed']")
	public WebElement feedTab;

	@FindBy(id="com.koo.app:id/clProfile")
	public WebElement userProfileIcon;
	
	@FindBy(id="com.koo.app:id/likes_text")
	public WebElement LikesText;
	

	@FindBy(id="com.koo.app:id/edit_profile_button")
	public WebElement edit_profile_button;

	@FindBy(id="com.koo.app:id/topic_title_textview")
	public WebElement kooDetail;

	@FindBy(id="com.koo.app:id/layout_profile")
	public WebElement kooUserProfileLayout;

	@FindBy(id="com.koo.app:id/koo_imageview")
	public WebElement kooIcon;

	@FindBy(id="com.koo.app:id/back_imageview")
	public WebElement backButton;

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.koo.app:id/toolbar_title' and @text='Koos']")
	public WebElement kooHeadrText;

	@FindBy(xpath="//android.widget.TextView[@text='Refreshing your feedâ€¦']")
	public WebElement refreshScreenMessage;

	@FindBy(id="com.koo.app:id/koo_time_creation_tv")
	public WebElement timeOfCreation;

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.koo.app:id/channel_name_textview' and @index='0']")
	public WebElement kooCreatorName;

	@FindBy(id="com.koo.app:id/channel_handle_textview")
	public WebElement kooCreatorHandle;

	@FindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.ImageButton[@index='0']")
	public WebElement backButtonAtTheLikePage;

	@FindBy(xpath="//android.view.ViewGroup[@index='1']/android.widget.ImageButton[@index='0']")
	public WebElement backButtonAtTheVideoPage;

	@FindBy(xpath="//android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='1']")
	public WebElement noOFPostDoneByUser;

	@FindBy(id="com.koo.app:id/played_duration_textview")
	public WebElement durationOfVideoPlayed;

	@FindBy(id="com.koo.app:id/channel_imageview")
	public WebElement kooCreatorProfilePic;

	@FindBy(id="com.koo.app:id/iv_options_more")
	public WebElement twoDotButton;

	@FindBy(xpath="//android.widget.TextView[@text='Follow']")
	public WebElement followButton;

	@FindBy(xpath="//android.widget.TextView[@text='People']")
	public WebElement peopleTab;

	@FindBy(id="com.koo.app:id/like_imageview")
	public WebElement likeButton;

	@FindBy(id="com.koo.app:id/btnFollowView")
	public WebElement followingButton ;

	@FindBy(id="com.koo.app:id/floating_button_layout")
	public WebElement goToFeedButton ;

	@FindBy(id="com.koo.app:id/comment_imageview")
	public WebElement commentButton;

	@FindBy(id="com.koo.app:id/rekoo_imageview")
	public WebElement rekooButton;

	@FindBy(id="com.koo.app:id/rt_without_content")
	public WebElement rekooConfirm;

	@FindBy(id="com.koo.app:id/generic_share_iv")
	public WebElement shareButton;

	@FindBy(id="com.koo.app:id/like_textview")
	public WebElement likeCountText;

	@FindBy(id="com.koo.app:id/comment_textview")
	public WebElement commentCountText;

	@FindBy(id="com.koo.app:id/rekoo_textview")
	public WebElement rekooCountText;

	@FindBy(xpath="//android.widget.TextView[@text='Re-Koos']")
	public WebElement rekooText;

	@FindBy(id="com.koo.app:id/follow_status_imageview")
	public WebElement followStatusIcon;

	@FindBy(id="com.koo.app:id/creation_view")
	public WebElement commentBox;

	@FindBy(id="com.koo.app:id/comment_imageview")
	public WebElement commentIcon;

	@FindBy(id="com.koo.app:id/comment_channel_imageview")
	public WebElement userProfileUnderCommentBox;

	@FindBy(id="com.koo.app:id/post_text_view")
	public WebElement writeYourCommentTextBox;

	@FindBy(xpath="//android.widget.TextView[@text='Write Your Comment...']")
	public WebElement writeYourCommentText;	

	@FindBy(xpath="android.widget.EditText[@text='Write a comment']")
	public WebElement writeYourCommentTextInProfile;	

	@FindBy(id="com.koo.app:id/likes_count_parent")
	public WebElement likesCount;

	@FindBy(id="com.koo.app:id/like_textview")
	public WebElement likesCountText;

	@FindBy(id="com.koo.app:id/rekoo_count_parent")
	public WebElement rekooCount;

	@FindBy(id="com.koo.app:id/rekoo_textview")
	public WebElement rekooCountOnFeedPage;

	@FindBy(id="com.koo.app:id/undo_rekoo_without_content")
	public WebElement unDoRekoo;

	@FindBy(id="com.koo.app:id/reactors_images_rl")
	public WebElement rekooReacterPeopleProfile;

	@FindBy(xpath="//android.widget.TextView[@text='More like this']")
	public WebElement moreLikeThisProfile;

	@FindBy(xpath="//android.widget.RelativeLayout[@index='2']/android.widget.ImageView[@index='0']")
	public WebElement userProfileOfReeKoo;	

	@FindBy(xpath="//android.widget.TextView[@text='Comments']")
	//@FindBy(id="com.koo.app:id/header_text")
	public WebElement commentsHeadr;

	@FindBy(xpath="//android.widget.TextView[@text='What's on your mind...']")
	public WebElement whatsYourMindText;

	@FindBy(xpath="//android.widget.TextView[@text='No more comments']")
	public WebElement noMoreComments;	

	@FindBy(xpath="//android.widget.TextView[@text='No more comments']")
	public WebElement noMoreCommentsMsg;	

	@FindBy(xpath="//android.widget.TextView[@text='More Koos by this user']")
	public WebElement moreKoosByThisUser;

	@FindBy(xpath="//android.widget.TextView[@text='1d']")
	public WebElement lastThreeDaysKooByTheUser;

	@FindBy(id="com.koo.app:id/more_tv_layout")
	public WebElement viewMoreButton;

	@FindBy(xpath="//android.widget.RelativeLayout[@index='0']")
	public WebElement likesButtonForNavigateToProfile;

	@FindBy(xpath="//android.widget.LinearLayout[@index='2']/android.widget.TextView[@index='0']")
	//@FindBy(id="com.koo.app:id/koo_using_hashtag_text")
	public WebElement hastTagTitleAtTheBottomOfScreen;

	@FindBy(id="com.koo.app:id/single_image")
	public WebElement imageOnKooCard;

	@FindBy(id="com.koo.app:id/image_view")
	public WebElement fullImage;

	@FindBy(xpath="//android.view.ViewGroup[@index='2']/android.widget.ImageButton[@index='0']")
	public WebElement imageBackButton;

	@FindBy(id="com.koo.app:id/layout_close")
	public WebElement backButtonInUserProfile;

	@FindBy(id="com.koo.app:id/menu_pic_download")
	public WebElement downloadImageButton;

	@FindBy(id="com.koo.app:id/iv_mic")
	public WebElement micButton;

	@FindBy(id="com.koo.app:id/iv_video")
	public WebElement videoButton;

	@FindBy(id="com.koo.app:id/thumbnail_imageview")
	public WebElement videoOnFeedPage;

	@FindBy(xpath="//android.widget.TextView[@text='Videos']")
	public WebElement videosTab;	

	@FindBy(id="com.koo.app:id/iv_fullscreen")
	public WebElement videoFullScreenButton;

	@FindBy(id="com.koo.app:id/play_view")
	public WebElement playPauseButton;

	@FindBy(id="com.koo.app:id/koo_edit")
	public WebElement writeYourComment;

	@FindBy(xpath="//android.widget.EditText[@text='Write Your Comment...']")
	public WebElement writeYourCommentOnImagePage;	

	@FindBy(id="com.koo.app:id/content_duration_view")
	public WebElement videoContentDuration;	

	@FindBy(id="com.koo.app:id/character_count_textview")
	public WebElement characterCount;

	@FindBy(id="com.koo.app:id/post_button")
	public WebElement postButton;

	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	public WebElement englishlanguageButton;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='1']")
	public WebElement otherLanguagePost;

	@FindBy(id="com.koo.app:id/tv_available_lng_count")
	public WebElement aviliableInTheseManyLanguages;

	@FindBy(xpath = "//android.widget.TextView[@text='हिंदी']")
	public WebElement hindiLanguageButton;

	@FindBy(id = "android:id/button2")
	public WebElement noBttnOnUnfollowConfirmationMsg;

	@FindBy(id = "android:id/button1")
	public WebElement yesBttnOnUnfollowConfirmationMsg;


	public void
	verify_on_tapping_koo_title_user_should_navigate_to_the_koo_details_screen() throws InterruptedException {
		Thread.sleep(3000);
		waitForVisibility(feedTab);
		Thread.sleep(2000);
		if(isElementPresent(englishlanguageButton)) {
			swipeToSeeDownsideElementsOfScreen(1);
		}
		if(!isElementPresent(kooDetail)) {
			swipeToDownsideTillElementPresent(kooDetail, 1);
		}
		waitForVisibility(kooDetail);
		click(kooDetail);
	}

	public void scrollToMLKKoo() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(3);
		Thread.sleep(2000);
		if(!isElementPresent(englishlanguageButton)) {
			swipeToDownsideTillElementPresent(englishlanguageButton, 4);
		}
		waitForVisibility(englishlanguageButton);
		Assert.assertTrue(isElementPresent(englishlanguageButton));
		Thread.sleep(1000);
	}
	public void verify_on_tapping_mlk_koo_title_user_should_navigate_to_the_koo_details_screen() throws InterruptedException {

			
			waitForVisibility(kooDetail);
			click(kooUserProfileLayout);
			Thread.sleep(2000);
			waitForVisibility(kooIcon);
		
	}

	public void verify_on_top_of_the_koo_details_screen_back_button_koos_text_and_koo_icon_should_display() throws InterruptedException {
		Thread.sleep(4000);
		Assert.assertTrue(isElementPresent(kooIcon)); 
		Assert.assertTrue(isElementPresent(kooHeadrText)); 
		Assert.assertTrue(isElementPresent(backButton)); 
	}

	public void verify_on_tapping_top_koo_icon_user_should_navigate_to_the_feed_and_feed_should_refresh() throws InterruptedException {
		waitForVisibility(kooIcon);
		click(kooIcon);
		waitForVisibility(feedTab);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(feedTab)); 
	}

	public void verify_profile_picture_name_handle_profession_small_follow_button_drop_down_menu_and_time_of_creation_is_displayed_on_every_card_and_for_non_followed_users_follow_button_must_be_is_present() throws InterruptedException {
		Thread.sleep(1500);
		Assert.assertTrue(isElementPresent(timeOfCreation)); 
		Assert.assertTrue(isElementPresent(kooCreatorName));
		Assert.assertTrue(isElementPresent(kooCreatorHandle));
		Assert.assertTrue(isElementPresent(kooCreatorProfilePic));
		Assert.assertTrue(isElementPresent(twoDotButton));

	}
	public void verify_all_the_created_koo_content_is_displayed_in_the_parent_koo_card() throws InterruptedException {
		Thread.sleep(3000);
		waitForVisibility(feedTab);
		Thread.sleep(2000);
		if(isElementPresent(englishlanguageButton)) {
			swipeToSeeDownsideElementsOfScreen(1);
		}
		if(!isElementPresent(kooDetail)) {
			swipeToDownsideTillElementPresent(kooDetail, 1);
		}
		waitForVisibility(kooDetail);
		click(kooDetail);
		waitForVisibility(noOFPostDoneByUser);
		System.out.println("The no of koo post created by the user"+ noOFPostDoneByUser.getText() );
	}

	public void verify_like_and_rekoo_text_is_displayed_with_the_count_if_there_are_any_likes_and_rekoos_on_the_koo() throws Exception {
		if(!isElementPresent(writeYourCommentText)) {
			swipeToDownsideTillElementPresent(writeYourCommentText, 5);
		}
		if(!isElementPresent(likeButton)) {
			swipeToDownsideTillElementPresent(likeButton, 2);
		}
		Assert.assertTrue(isElementPresent(likeButton)); 
		Thread.sleep(2000);
		if(isElementPresent(likeCountText)) {
			System.out.println("The no of like in the koo"+ likeCountText.getText() );
		}
		
		Assert.assertTrue(isElementPresent(rekooButton)); 
		Thread.sleep(2000);
		if(isElementPresent(rekooCountText)) {
			System.out.println("The no of like in the koo"+ rekooCountText.getText() );
		}
	}

	public void verify_the_comment_rekoo_like_share_buttons_should_be_present_below_the_koo_content() {
		Assert.assertTrue(isElementPresent(commentButton)); 
		Assert.assertTrue(isElementPresent(rekooButton)); 
		Assert.assertTrue(isElementPresent(likeButton)); 
		Assert.assertTrue(isElementPresent(shareButton)); 
	}

	public void verify_the_comment_box_should_display_at_the_bottom_of_the_koo_details_screen_along_with_the_profile_icon() throws Exception {
		//scrollToElement(commentBox, "up");
		Assert.assertTrue(isElementPresent(commentBox)); 
	}

	public void verify_on_tapping_comment_bottom_comment_box_comment_creation_screen_along_with_thread_should_display() throws InterruptedException {
		click(commentBox);
		Thread.sleep(800);
		waitForVisibility(backButton);
		click(backButton);
	}

	public void verify_on_tapping_follow_button_user_is_able_to_follow_and_the_follow_button_should_disappear() throws InterruptedException {
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		waitForVisibility(peopleTab);
		click(peopleTab);
		click(followButton);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(followingButton));
		Assert.assertTrue(isElementPresent(goToFeedButton));
		click(goToFeedButton);
		waitForVisibility(peopleTab);
		click(peopleTab);
		click(followingButton);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(noBttnOnUnfollowConfirmationMsg));
		Assert.assertTrue(isElementPresent(yesBttnOnUnfollowConfirmationMsg));
		click(yesBttnOnUnfollowConfirmationMsg);
		waitForVisibility(feedTab);
		click(feedTab);
	}

	public void verify_on_tapping_on_like_or_rekoo_text_the_likers_list_and_rekooers_list_is_displayed() throws Exception  {
		//clickAndroidDeviceBackBttn();
		scrollToElement(writeYourCommentText, "up");
		waitForVisibility(likeButton);
		click(likeButton);
		Thread.sleep(3000);
		if(isElementPresent(likesCountText)) {
			System.out.println("The no of like in the koo"+ likesCountText.getText() );
			
		}
		if(isElementPresent(rekooCountOnFeedPage)) {
			System.out.println("The no of rekoo in the koo"+ rekooCountOnFeedPage.getText() );
		}
	}

	public void verify_on_tapping_on_like_or_rekoo_text_the_likers_list_and_rekooers_list_is_displayed_in_Mlk() throws Exception  {
		waitForVisibility(likeButton);
		scrollToElement(likeButton, "up");
		click(likeButton);
		Thread.sleep(500);
		if(isElementPresent(likesCountText)) {
			waitForVisibility(likesCountText);
			System.out.println("The no of like in the koo"+ likesCountText.getText() );
		}
		if(isElementPresent(rekooCountOnFeedPage)) {
		waitForVisibility(rekooCountOnFeedPage);
			System.out.println("The no of rekoo in the koo"+ rekooCountOnFeedPage.getText() );
		}
	}



	public void verify_user_is_able_to_navigate_to_public_own_profile_on_tapping_on_profile_from_likers_and_rekooers_list() throws Exception {
		
			Thread.sleep(1500);
			swipeToSeeUpsideElementsOfScreen(3);
			if(!isElementPresent(rekooText)) {
				swipeToDownsideTillElementPresent(rekooText, 3);
			}
			
			if(isElementPresent(rekooText)) {
				//waitForVisibility(userProfileOfReeKoo);
				click(rekooText);
				Thread.sleep(2000);
				if(!isElementPresent(kooCreatorName)) {
					swipeToUpsideTillElementPresent(kooCreatorName, 2);
				}
				waitForVisibility(kooCreatorName);
				click(kooCreatorName);
				Thread.sleep(5000);
				waitForVisibility(kooCreatorName);
				Assert.assertTrue(isElementPresent(kooCreatorName));
				Assert.assertTrue(isElementPresent(kooCreatorHandle));
				Thread.sleep(2500);
				waitForVisibility(backButtonInUserProfile);
				click(backButtonInUserProfile);
				Thread.sleep(3500);
				clickAndroidDeviceBackBttn();
				waitForVisibility(kooIcon);
				Thread.sleep(2500);
				clickAndroidDeviceBackBttn();
				
			}
	}



	public void verify_other_posted_koos_of_that_user_should_displayed_in_the_more_koos_by_this_user_section() throws Exception  {
		if(isElementPresent(moreKoosByThisUser)) {
			scrollToElement(lastThreeDaysKooByTheUser,"up");
			Thread.sleep(2000);
			Assert.assertTrue(isElementPresent(lastThreeDaysKooByTheUser));
			Thread.sleep(2000);
			swipeToSeeUpsideElementsOfScreen(2);
			Thread.sleep(2000);
			scrollToElement(rekooText,"down");
		}}

	public void verify_similar_koos_should_display_in_the_similar_koos_section() throws Exception {
		clickAndroidDeviceBackBttn();
		waitForVisibility(userProfileIcon);
		if(!isElementPresent(moreLikeThisProfile)) {
			swipeToDownsideTillElementPresent(moreLikeThisProfile, 5);
		}
		click(moreLikeThisProfile);
		waitForVisibility(hastTagTitleAtTheBottomOfScreen);
		Assert.assertTrue(isElementPresent(hastTagTitleAtTheBottomOfScreen));
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
	}

	public void verify_the_user_logged_in_language_koo_should_show_in_the_koo_details_on_the_mlk_koo() {
		Assert.assertTrue(isElementPresent(englishlanguageButton));
		Assert.assertTrue(isElementPresent(otherLanguagePost));
	}

	public void verify_user_can_switch_the_available_language_option_on_the_mlk_koo_in_the_koo_details_screen() throws Exception {
		waitForVisibility(aviliableInTheseManyLanguages);
		
			scrollToElement(hindiLanguageButton,"up");
			click(hindiLanguageButton);
			waitForVisibility(englishlanguageButton);
			Thread.sleep(1000);
			click(englishlanguageButton);

	}

	public void verify_all_the_comments_on_the_koo_should_be_displayed_below_the_parent_koo_one_below_other_according_to_the_timeline_basics() throws Exception {
		waitForVisibility(commentIcon);
		click(commentIcon);
		Thread.sleep(3000);
		if(isElementPresent(likesCount)){
			Assert.assertTrue(isElementPresent(likesCount));
		}
		try {
			if (isElementPresent(commentsHeadr)) {
				scrollToElement(moreKoosByThisUser,"up");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}	
		try {
			if (isElementPresent(noMoreComments)) {
				scrollToElement(commentsHeadr,"down");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}	

		try {
			if (isElementPresent(noMoreCommentsMsg)) {
				if(!isElementPresent(moreKoosByThisUser)) {
					swipeToDownsideTillElementPresent(moreKoosByThisUser, 1);
				}
				Assert.assertTrue(isElementPresent(moreKoosByThisUser));
				scrollToElement(moreKoosByThisUser,"up");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}	
	}
	public void verify_all_the_comments_on_the_mlk_koo_should_be_displayed_below_the_parent_koo_one_below_other_according_to_the_timeline_basics() throws Exception {
		scrollToElement(aviliableInTheseManyLanguages,"up");
		waitForVisibility(kooDetail);
		click(kooDetail);
		waitForVisibility(commentIcon);
		click(commentIcon);
		Assert.assertTrue(isElementPresent(likesCount));
		Assert.assertTrue(isElementPresent(rekooCount));
		try {
			if (isElementPresent(commentsHeadr)) {

				scrollToElement(moreKoosByThisUser,"up");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}	
		try {
			if (isElementPresent(noMoreComments)) {
				scrollToElement(commentsHeadr,"down");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}	

		try {
			if (isElementPresent(noMoreCommentsMsg)) {
				Assert.assertTrue(isElementPresent(moreKoosByThisUser));
				scrollToElement(moreKoosByThisUser,"up");
				Thread.sleep(1000);
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}	

	}


	public void verify_on_tapping_image_in_the_koo_card_user_should_navigate_to_the_image_full_view_screen() throws Exception {
		Thread.sleep(3500);
		if(!isElementPresent(imageOnKooCard)) {
			swipeToDownsideTillElementPresent(imageOnKooCard, 5);
		}
			click(imageOnKooCard);
			waitForVisibility(fullImage);
			Assert.assertTrue(isElementPresent(fullImage));
			Assert.assertTrue(isElementPresent(imageBackButton));
			Assert.assertTrue(isElementPresent(downloadImageButton));
		
		
	}

	public void verify_full_image_should_display_on_tapping_image_in_the_koo_card() {
		
	}

	public void verify_back_button_download_image_on_top_of_the_image_full_view_screen() {
		
	}

	public void verify_like_comment_rekoo_and_share_button_should_display_below_the_image_in_the_image_full_view_screen() {
		Assert.assertTrue(isElementPresent(likeButton));
		Assert.assertTrue(isElementPresent(commentButton));
		Assert.assertTrue(isElementPresent(rekooButton));
		Assert.assertTrue(isElementPresent(shareButton));
	}

	public void verify_on_tapping_comment_bar_keypad_should_open_along_with_audio_video_character_count_and_post_button() {
		waitForVisibility(writeYourCommentOnImagePage);
		click(writeYourCommentOnImagePage);
		waitForVisibility(postButton);
		Assert.assertTrue(isElementPresent(micButton));
		Assert.assertTrue(isElementPresent(videoButton));
		Assert.assertTrue(isElementPresent(characterCount));
		Assert.assertTrue(isElementPresent(postButton));
	}

	public void verify_the_post_button_should_be_in_the_disable_state_when_the_comment_box_is_blank() throws InterruptedException {
		Assert.assertFalse(isEnabled(postButton));
		Thread.sleep(1000);
	}

	public void i_verify_pre_populated_text_should_display_in_the_bottom_comment_bar() {
		Assert.assertTrue(writeYourCommentOnImagePage.getText().equalsIgnoreCase("Write Your Comment..."));
	}

	public void verify_after_entering_charater_post_button_should_be_in_the_enable_state() throws InterruptedException {
		waitForVisibility(writeYourCommentOnImagePage);
		sendKeys(writeYourComment,"checking the post");
		Thread.sleep(4000);
		Assert.assertTrue(isEnabled(postButton));
		waitForVisibility(imageBackButton);
		click(imageBackButton);
	}

	public void verify_on_tapping_comment_bar_keypad_should_open() {
		try {

			waitForVisibility(writeYourCommentOnImagePage);
			sendKeys(writeYourComment,"checking the post");
			Thread.sleep(100);
			clickAndroidDeviceBackBttn();
		} catch (InterruptedException e) {

			e.getStackTrace();
		}
	}


	public void verify_on_tapping_video_in_the_koo_card_user_should_navigate_to_the_video_full_view_screen() throws Exception {
			Thread.sleep(4000);
			waitForVisibility(videosTab);
			click(videosTab);
			scrollToElement(videoOnFeedPage,"up");
			waitForVisibility(videoOnFeedPage);
			click(videoOnFeedPage);
		
	}

	public void i_verify_on_tapping_comment_bar_keypad_should_open() {
		waitForVisibility(writeYourCommentOnImagePage);
		Assert.assertTrue(isElementPresent(aviliableInTheseManyLanguages));
		sendKeys(writeYourComment,"checking the post");
	}

	public void verify_full_video_should_display_on_tapping_video_in_the_koo_card() {
		try {
			waitForVisibility(videoFullScreenButton);
			Assert.assertTrue(isElementPresent(timeOfCreation));
			click(videoFullScreenButton);

			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
	}

	public void verify_back_button_on_top_of_the_video_full_view_screen() {
		Assert.assertTrue(isElementPresent(backButtonAtTheVideoPage));

	}

}



