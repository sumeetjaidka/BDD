package com.qa.stepdef;

import com.qa.pages.HastagDetail;

import io.cucumber.java.en.Then;

public class HastagDetailsStepsDef {

	@Then("I Verify by tapping on any hashtag in hashtags screen,user should navigate to respective Hashtag Details Screen.")
	public void i_verify_by_tapping_on_any_hashtag_in_hashtags_screen_user_should_navigate_to_respective_hashtag_details_screen()
			throws Exception {
		new HastagDetail()
				.verify_by_tapping_on_any_hashtag_in_hashtags_screen_user_should_navigate_to_respective_hashtag_details_screen();
	}

	@Then("I Verify at the bottom of Hashtag Details Screen, Koo using respective hashtag button should be displayed.")
	public void i_verify_at_the_bottom_of_hashtag_details_screen_koo_using_respective_hashtag_button_should_be_displayed() {
		new HastagDetail().verifyAtTheBottomOfHashtagDetailsScreenKooUsingRespectiveHashtagButtonShouldBeDisplayed();
	}

	@Then("I Verify by tapping back button in Hashtag details screen,user should navigate back to Hashtags Screen.")
	public void i_verify_by_tapping_back_button_in_hashtag_details_screen_user_should_navigate_back_to_hashtags_screen() {
		new HastagDetail()
				.verify_by_tapping_back_button_in_hashtag_details_screen_user_should_navigate_back_to_hashtags_screen();
	}

	@Then("I Verify the share icon should be displayed in Hashtag Details Screen and Verify share icon should be tappable.")
	public void i_verify_the_share_icon_should_be_displayed_in_hashtag_details_screen_and_verify_share_icon_should_be_tappable()
			throws InterruptedException {
		new HastagDetail()
				.verify_the_share_icon_should_be_displayed_in_hashtag_details_screen_and_verify_share_icon_should_be_tappable();
	}

	@Then("I Verify by tap on mobile back button / outside the share via popup, popup should get closed.")
	public void i_verify_by_tap_on_mobile_back_button_outside_the_share_via_popup_popup_should_get_closed()
			throws InterruptedException {
		new HastagDetail().verify_by_tap_on_mobile_back_button_outside_the_share_via_popup_popup_should_get_closed();
	}

	@Then("I Verify in  Koo using respective hashtag , respective hashtag should be same as header Hashtag text in the screen.")
	public void i_verify_in_koo_using_respective_hashtag_respective_hashtag_should_be_same_as_header_hashtag_text_in_the_screen()
			throws Exception {
		new HastagDetail()
				.verify_in_koo_using_respective_hashtag_respective_hashtag_should_be_same_as_header_hashtag_text_in_the_screen();
	}

	@Then("I Verify by tap on  Koo using respective hashtag  button, user should navigate to MLK Koo Creation screen with respective hashtag and VKB should open.")
	public void i_verify_by_tap_on_koo_using_respective_hashtag_button_user_should_navigate_to_mlk_koo_creation_screen_with_respective_hashtag_and_vkb_should_open() {
		new HastagDetail()
				.verify_by_tap_on_koo_using_respective_hashtag_button_user_should_navigate_to_mlk_koo_creation_screen_with_respective_hashtag_and_vkb_should_open();
	}

	@Then("I Verify by tap on App back button in MLK Koo Creation screen, Discard popup should be displayed with {string} and {string} option.")
	public void i_verify_by_tap_on_app_back_button_in_mlk_koo_creation_screen_discard_popup_should_be_displayed_with_and_option(
			String string, String string2) throws InterruptedException {
		new HastagDetail()
				.verify_by_tap_on_app_back_button_in_mlk_koo_creation_screen_discard_popup_should_be_displayed_with_and_option();
	}

	@Then("I Verify by tap on Mobile back button in MLK Creation screen, VKB should close.")
	public void i_verify_by_tap_on_mobile_back_button_in_mlk_creation_screen_vkb_should_close()
			throws InterruptedException {
		new HastagDetail().verify_by_tap_on_mobile_back_button_in_mlk_creation_screen_vkb_should_close();
	}

	@Then("I Verify by tap on any Koo card, user should land on to Koo details screen and verify by tap on mobile back button / app back button in Koo details screen, user should land back to respective Hashtag Details Screen.")
	public void i_verify_by_tap_on_any_koo_card_user_should_land_on_to_koo_details_screen_and_verify_by_tap_on_mobile_back_button_app_back_button_in_koo_details_screen_user_should_land_back_to_respective_hashtag_details_screen()
			throws InterruptedException {
		new HastagDetail().verify_by_tap_on_any_koo_card_user_should_land_on_to_koo_details_screen();
	}

	@Then("I Verify user can perform scroll action in Hashtag details screen.")
	public void i_verify_user_can_perform_scroll_action_in_hashtag_details_screen() throws InterruptedException {
		new HastagDetail().verify_user_can_perform_scroll_action_in_hashtag_details_screen();
	}

	@Then("I Verify all the Koos with respective hashtags should be displayed.")
	public void i_verify_all_the_koos_with_respective_hashtags_should_be_displayed() throws InterruptedException {
		new HastagDetail().verify_all_the_koos_with_respective_hashtags_should_be_displayed();
	}

	@Then("I Verify on scrolling towards end of the Koos, soon below the Koo View Trending Koos button should be displayed.")
	public void i_verify_on_scrolling_towards_end_of_the_koos_soon_below_the_koo_button_should_be_displayed()
			throws Exception {
		new HastagDetail().verify_on_scrolling_towards_end_of_the_koos_soon_below_the_koo_button_should_be_displayed();
	}

	@Then("I Verify by tap on  button, user should navigate to Trending Koos hours screen.")
	public void i_verify_by_tap_on_button_user_should_navigate_to_trending_koos_hours_screen(String string,
			Integer int1) throws Exception {
		new HastagDetail().verify_by_tap_on_button_user_should_navigate_to_trending_koos_hours_screen();
	}

	@Then("I Verify by tap on view trending koo button user should navingte to trending koos with 24 hour and also very by tap on app back button user should land to feed screen.")
	public void iVerifyByTapOnAppOrMobileBackButtonInScreenUserShouldLandOnFeedScreen() throws InterruptedException {
		new HastagDetail()
				.verify_by_tap_on_app_mobile_back_button_in_trending_koos_hours_screen_user_should_land_on_feed_screen();
	}

	@Then("I Verify below View Trending Koos button in Hashtag Details Screen, Trending Tags section should be displayed and Verify the section should be displayed with navigation arrow mark.")
	public void i_verify_below_view_trending_koos_button_in_hashtag_details_screen_trending_tags_section_should_be_displayed_and_verify_the_section_should_be_displayed_with_navigation_arrow_mark()
			throws Exception {
		new HastagDetail()
				.verify_by_tapping_on_any_hashtag_in_hashtags_screen_user_should_navigate_to_respective_hashtag_details_screen();
		new HastagDetail()
				.verify_below_view_trending_koos_button_in_hashtag_details_screen_trending_tags_section_should_be_displayed_and_verify_the_section_should_be_displayed_with_navigation_arrow_mark();
	}

	@Then("I Verify by tap on Trending tags section navigation arrow mark, user navigates to respective Hashtag screen.")
	public void i_verify_by_tap_on_trending_tags_section_navigation_arrow_mark_user_navigates_to_respective_hashtag_screen()
			throws InterruptedException {
		new HastagDetail()
				.verify_by_tap_on_trending_tags_section_navigation_arrow_mark_user_navigates_to_respective_hashtag_screen();
	}

	@Then("I Verify by tap on mobile back button in Hashtag screen, user navigates to Feed screen.")
	public void i_verify_by_tap_on_mobile_back_button_in_hashtag_screen_user_navigates_to_feed_screen()
			throws Exception {
		new HastagDetail().verify_by_tap_on_mobile_back_button_in_hashtag_screen_user_navigates_to_feed_screen();
	}

	@Then("I Verify by tap on Create Koo icon in Trending Tags section, user should navigate to MLK Creation screen with respective hashtag and VKB should open.")
	public void i_verify_by_tap_on_create_koo_icon_in_trending_tags_section_user_should_navigate_to_mlk_creation_screen_with_respective_hashtag_and_vkb_should_open()
			throws InterruptedException {
		new HastagDetail()
				.verify_by_tap_on_create_koo_icon_in_trending_tags_section_user_should_navigate_to_mlk_creation_screen_with_respective_hashtag_and_vkb_should_open();

	}
// made by sumeet
	@Then("I click on the respective hashtag mention and it moves to respective mentioned profile")
	public void iVerifyclickontherespectivehashtagmentionanditmovestorespectivementionedprofile()
			throws Exception {
		new HastagDetail()
				.iVerifyclickontherespectivehashtagmentionanditmovestorespectivementionedprofile();
	}

	@Then("I click on Hash tag Back Button")
	public void iVerifyclickonHashtagBackButton()
			throws Exception {
		new HastagDetail()
				.iVerifyclickonHashtagBackButton();
	}



}
