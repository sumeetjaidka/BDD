package com.qa.stepdef;

import com.qa.pages.KooCreationPage;
import com.qa.pages.KooDetailViewPage;

import io.cucumber.java.en.Then;

public class KooDetailViewStepDef {
	
	@Then("I Verify on tapping Koo title user should navigate to the Koo details screen.")
	public void i_verify_on_tapping_koo_title_user_should_navigate_to_the_koo_details_screen() throws InterruptedException {
		new KooDetailViewPage().verify_on_tapping_koo_title_user_should_navigate_to_the_koo_details_screen();
	}

	@Then("I Verify on top of the Koo details screen back button, Koos text and Koo Icon should display.")
	public void i_verify_on_top_of_the_koo_details_screen_back_button_koos_text_and_koo_icon_should_display() throws InterruptedException {
		new KooDetailViewPage().verify_on_top_of_the_koo_details_screen_back_button_koos_text_and_koo_icon_should_display();
	}

	@Then("I Verify on tapping top Koo icon, User should navigate to the feed and feed should refresh.")
	public void i_verify_on_tapping_top_koo_icon_user_should_navigate_to_the_feed_and_feed_should_refresh() throws InterruptedException {
		new KooDetailViewPage().verify_on_tapping_top_koo_icon_user_should_navigate_to_the_feed_and_feed_should_refresh();
	}

	@Then("I Verify profile picture, name, handle, profession, small follow button, drop down menu and time of creation is displayed on every card and for non followed users follow button must be is present.")
	public void i_verify_profile_picture_name_handle_profession_small_follow_button_drop_down_menu_and_time_of_creation_is_displayed_on_every_card_and_for_non_followed_users_follow_button_must_be_is_present() throws InterruptedException {
	//	new KooDetailViewPage().scrollToMLKKoo();
		new KooDetailViewPage().verify_profile_picture_name_handle_profession_small_follow_button_drop_down_menu_and_time_of_creation_is_displayed_on_every_card_and_for_non_followed_users_follow_button_must_be_is_present();
	}
	
	@Then("I Verify profile picture, name, handle, profession, small follow button, drop down menu and time of creation is displayed on every card and for non followed users follow button must be is present in MLK.")
	public void i_verify_profile_picture_name_handle_profession_small_follow_button_drop_down_menu_and_time_of_creation_is_displayed_on_every_card_and_for_non_followed_users_follow_button_must_be_is_present_inMLK() throws InterruptedException {
		new KooDetailViewPage().scrollToMLKKoo();
		new KooDetailViewPage().verify_profile_picture_name_handle_profession_small_follow_button_drop_down_menu_and_time_of_creation_is_displayed_on_every_card_and_for_non_followed_users_follow_button_must_be_is_present();
	}

	@Then("I Verify all the created koo content is displayed in the parent koo card.")
	public void i_verify_all_the_created_koo_content_is_displayed_in_the_parent_koo_card() throws InterruptedException {
		new KooDetailViewPage().verify_all_the_created_koo_content_is_displayed_in_the_parent_koo_card();
	}

	@Then("I Verify like and rekoo text is displayed with the count if there are any likes and rekoos on the koo.")
	public void i_verify_like_and_rekoo_text_is_displayed_with_the_count_if_there_are_any_likes_and_rekoos_on_the_koo() throws Exception {
		new KooDetailViewPage().verify_like_and_rekoo_text_is_displayed_with_the_count_if_there_are_any_likes_and_rekoos_on_the_koo();
	}

	@Then("I Verify the comment, rekoo, like, share buttons should be present below the koo content.")
	public void i_verify_the_comment_rekoo_like_share_buttons_should_be_present_below_the_koo_content() {
		new KooDetailViewPage().verify_the_comment_rekoo_like_share_buttons_should_be_present_below_the_koo_content();
	}

	@Then("I Verify the comment box should display at the bottom of the Koo details screen along with the profile icon.")
	public void i_verify_the_comment_box_should_display_at_the_bottom_of_the_koo_details_screen_along_with_the_profile_icon() throws Exception {
		new KooDetailViewPage().verify_the_comment_box_should_display_at_the_bottom_of_the_koo_details_screen_along_with_the_profile_icon();
	}

	@Then("I Verify on tapping comment bottom comment box, Comment creation screen along with thread should display.")
	public void i_verify_on_tapping_comment_bottom_comment_box_comment_creation_screen_along_with_thread_should_display() throws InterruptedException {
		new KooDetailViewPage().verify_on_tapping_comment_bottom_comment_box_comment_creation_screen_along_with_thread_should_display();
	}

	@Then("I Verify on tapping follow button user is able to follow, and the follow button should disappear.")
	public void i_verify_on_tapping_follow_button_user_is_able_to_follow_and_the_follow_button_should_disappear() throws InterruptedException {
		new KooDetailViewPage().verify_on_tapping_follow_button_user_is_able_to_follow_and_the_follow_button_should_disappear();
	}

	@Then("I Verify on tapping on like or rekoo text the likers list and rekooers list is displayed.")
	public void i_verify_on_tapping_on_like_or_rekoo_text_the_likers_list_and_rekooers_list_is_displayed() throws Exception {
		new KooDetailViewPage().verify_on_tapping_on_like_or_rekoo_text_the_likers_list_and_rekooers_list_is_displayed();
	}
	
	@Then("I Verify all the comments on the koo should be displayed below the parent koo one below other according to the timeline basics and Verify below parent Koo Comments and the More Koos by this user\\/Similar Koos sections should be present.")
	public void i_verify_all_the_comments_on_the_koo_should_be_displayed_below_the_parent_koo_one_below_other_according_to_the_timeline_basics_and_verify_below_parent_koo_comments_and_the_more_koos_by_this_user_similar_koos_sections_should_be_present() throws Exception {
		new KooDetailViewPage().verify_all_the_comments_on_the_koo_should_be_displayed_below_the_parent_koo_one_below_other_according_to_the_timeline_basics();	
	}
	
	@Then("I Verify other posted Koos of that user should displayed in the More Koos by this user section.")
	public void i_verify_other_posted_koos_of_that_user_should_displayed_in_the_more_koos_by_this_user_section() {
		try {
			new KooDetailViewPage().verify_other_posted_koos_of_that_user_should_displayed_in_the_more_koos_by_this_user_section();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Then("I Verify similar Koos should display in the similar koos section.")
	public void iVerifySimilarKoosShouldDisplayInTheSimilarKoosSection() {
		try {
			new KooDetailViewPage().verify_similar_koos_should_display_in_the_similar_koos_section();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("I Verify user is able to navigate to public or own profile on tapping on profile from likers and rekooers list.")
	public void i_verify_user_is_able_to_navigate_to_public_own_profile_on_tapping_on_profile_from_likers_and_rekooers_list() throws Exception {
		new KooDetailViewPage().verify_user_is_able_to_navigate_to_public_own_profile_on_tapping_on_profile_from_likers_and_rekooers_list();
	}
	
	@Then("I create a new MLK koo")
	public void createANewMLKKoo() throws Exception {
		new KooCreationPage().createMLKKoo();
	}
	
	@Then("I Verify on tapping MLK Koo title user should navigate to the Koo details screen.")
	public void i_verify_on_tapping_mlk_koo_title_user_should_navigate_to_the_koo_details_screen() throws Exception {
		new KooDetailViewPage().scrollToMLKKoo();
		new KooDetailViewPage().verify_on_tapping_mlk_koo_title_user_should_navigate_to_the_koo_details_screen();
	}

	@Then("I Verify on top of the MLK Koo details screen back button, Koos text and Koo Icon should display.")
	public void i_verify_on_top_of_the_mlk_koo_details_screen_back_button_koos_text_and_koo_icon_should_display() throws InterruptedException {
		new KooDetailViewPage().verify_on_top_of_the_koo_details_screen_back_button_koos_text_and_koo_icon_should_display(); ;
	}

	@Then("I Verify the user logged in language Koo should show in the Koo details on the MLK Koo.")
	public void i_verify_the_user_logged_in_language_koo_should_show_in_the_koo_details_on_the_mlk_koo() {
		new KooDetailViewPage().verify_the_user_logged_in_language_koo_should_show_in_the_koo_details_on_the_mlk_koo();
	}

	@Then("I Verify user can switch the available language option on the MLK Koo in the Koo details screen.")
	public void i_verify_user_can_switch_the_available_language_option_on_the_mlk_koo_in_the_koo_details_screen() throws Exception {
		new KooDetailViewPage().verify_user_can_switch_the_available_language_option_on_the_mlk_koo_in_the_koo_details_screen();
	}

	
	@Then("I Verify like and rekoo text is displayed with the count if there are any likes and rekoos on the MLK koo.")
	public void i_verify_like_and_rekoo_text_is_displayed_with_the_count_if_there_are_any_likes_and_rekoos_on_the_mlk_koo() throws Exception {
		new KooDetailViewPage().verify_on_tapping_on_like_or_rekoo_text_the_likers_list_and_rekooers_list_is_displayed_in_Mlk();
	}

	@Then("I Verify the comment, rekoo, like, share buttons should be present below the MLK Koo content.")
	public void i_verify_the_comment_rekoo_like_share_buttons_should_be_present_below_the_mlk_koo_content() throws Exception {
		new KooDetailViewPage().verify_on_tapping_on_like_or_rekoo_text_the_likers_list_and_rekooers_list_is_displayed_in_Mlk();
	}


	@Then("I Verify all the comments on the MLK Koo should be displayed below the parent koo one below other according to the timeline basics.")
	public void i_verify_all_the_comments_on_the_mlk_koo_should_be_displayed_below_the_parent_koo_one_below_other_according_to_the_timeline_basics() throws Exception {
		new KooDetailViewPage().verify_all_the_comments_on_the_mlk_koo_should_be_displayed_below_the_parent_koo_one_below_other_according_to_the_timeline_basics();
	}

	
	@Then("I Verify on tapping image in the Koo card user should navigate to the image full view screen.")
	public void i_verify_on_tapping_image_in_the_koo_card_user_should_navigate_to_the_image_full_view_screen() throws Exception {
		new KooDetailViewPage().verify_on_tapping_image_in_the_koo_card_user_should_navigate_to_the_image_full_view_screen();
	}
	@Then("I Verify Full image should display on tapping image in the Koo card")
	public void i_verify_full_image_should_display_on_tapping_image_in_the_koo_card() {
		new KooDetailViewPage().verify_full_image_should_display_on_tapping_image_in_the_koo_card();
	}

	@Then("I Verify Back button, download image on top of the image full view screen.")
	public void i_verify_back_button_download_image_on_top_of_the_image_full_view_screen() {
		new KooDetailViewPage().verify_back_button_download_image_on_top_of_the_image_full_view_screen();
	}

	@Then("I Verify Like, comment, rekoo and share button should display below the image in the image full view screen.")
	public void i_verify_like_comment_rekoo_and_share_button_should_display_below_the_image_in_the_image_full_view_screen() {
		new KooDetailViewPage().verify_like_comment_rekoo_and_share_button_should_display_below_the_image_in_the_image_full_view_screen();
	}


	@Then("I Verify Write Your Comment pre-populated text should display in the bottom comment bar.")
	public void i_verify_pre_populated_text_should_display_in_the_bottom_comment_bar() {
		new KooDetailViewPage().i_verify_pre_populated_text_should_display_in_the_bottom_comment_bar();
	}

	@Then("I Verify on tapping comment bar, Keypad should open along with audio, video, character count and post button.")
	public void i_verify_on_tapping_comment_bar_keypad_should_open_along_with_audio_video_character_count_and_post_button() {
		new KooDetailViewPage().verify_on_tapping_comment_bar_keypad_should_open_along_with_audio_video_character_count_and_post_button();
	}

	@Then("I Verify the post button should be in the disable state when the comment box is blank.")
	public void i_verify_the_post_button_should_be_in_the_disable_state_when_the_comment_box_is_blank() throws InterruptedException {
		new KooDetailViewPage().verify_the_post_button_should_be_in_the_disable_state_when_the_comment_box_is_blank();
	}

	@Then("I Verify after entering charater post button should be in the enable state.")
	public void i_verify_after_entering_charater_post_button_should_be_in_the_enable_state() throws InterruptedException {
		new KooDetailViewPage().verify_after_entering_charater_post_button_should_be_in_the_enable_state();
	}

	@Then("I Verify on tapping video in the Koo card user should navigate to the video full view screen.")
	public void i_verify_on_tapping_video_in_the_koo_card_user_should_navigate_to_the_video_full_view_screen() throws Exception {
		new KooDetailViewPage().verify_on_tapping_video_in_the_koo_card_user_should_navigate_to_the_video_full_view_screen();
	}

	@Then("I Verify Full video should display on tapping video in the Koo card")
	public void i_verify_full_video_should_display_on_tapping_video_in_the_koo_card() {
		new KooDetailViewPage().verify_full_video_should_display_on_tapping_video_in_the_koo_card();
	}
	
	@Then("I Verify on tapping comment bar, Keypad should open .")
	public void i_verify_on_tapping_comment_bar_keypad_should_open() {
		new KooDetailViewPage().verify_on_tapping_comment_bar_keypad_should_open();
	}
	
	
	@Then("I Verify Back button, on top of the video full view screen.")
	public void i_verify_back_button_on_top_of_the_video_full_view_screen() {
		new KooDetailViewPage().verify_back_button_on_top_of_the_video_full_view_screen();
	}
	
}
