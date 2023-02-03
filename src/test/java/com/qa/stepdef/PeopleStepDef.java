package com.qa.stepdef;

import com.qa.pages.LanguageSelectionPage;
import com.qa.pages.LoginPage;
import com.qa.pages.PeoplePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PeopleStepDef {

	@When("^User click on Peoples tab and I Verify \"([^\"]*)\" Headr is present$")
	public void clickingOnPeoplesTab(String peopleHeader) throws InterruptedException {
		new PeoplePage().verifyPeopleTabOnHomeScreen("Discover Relevant People");
	}

	@Then("^I Verify Discover Relevent People with all the sections are present$")
	public void verifyAllSectionsOfDiscoverReleventPeople() throws InterruptedException {
		new PeoplePage().verifyDiscoverReleventPeople();
	}

	@Then("^I Verify that \"([^\"]*)\" text box is displayed$")
	public void iVerifySearchForProfessionSearchBox(String searchboxText) {
		new PeoplePage().verifySearchForProfessionSearchbox(searchboxText);
	}

	@Then("^I Verify on tapping search text box user should navigate to \"([^\"]*)\" screen$")
	public void verifyTappingSearchTextBox(String headertext) throws InterruptedException {
		new PeoplePage().verifyProfessionCategory(headertext);
	}

	@Then("^I Verify \"([^\"]*)\" water mark should be displayed inside the search box$")
	public void iVerifyTypeOfSearchWaterMark(String watermarktext) {
		new PeoplePage().verifyTypeOfSearchWaterMark(watermarktext);
	}

	@Then("^I Verify list of profession should show with forward arrow mark and search text box at the top$")
	public void verifyListOfProfession() {
		new PeoplePage().verifyListOfProfession();
	}

	@Then("^I Verify by tap on app back button / mobile back button, user should navigate back to People tab screen$")
	public void verifyBackButtonAndPeopleTab() throws InterruptedException {
		// new PeoplePage().verifyPeopleTabOnHomeScreen("Discover Relevant People");
		new PeoplePage().clickOnBackButtonAndVerifyPeopleTab();
	}

	@Then("^I Verify by tap on tick mark icon, no action should be performed$")
	public void iClickOnYellowTickMark() throws InterruptedException {
		new PeoplePage().clickOnYellowTickMark();
	}

	@When("^I Verify Search for \"([^\"]*)\" profession in search box, searched results list should show$")
	public void verifyListOfProfessional(String profession) throws InterruptedException {
		new PeoplePage().verifyListofResultFromProfessionalSearchBox(profession);
	}

	@Then("^I Verify by tap on any searched profession results, user should navigate to \"([^\"]*)\" Profession Details screen$")
	public void verifyRespectiveProfessionDetail(String profession) throws InterruptedException {
		new PeoplePage().verifySpecifiedProfessionalList(profession);

	}

	@Then("^I Verify by tap on app back button/mobile back button in respective Profession Details screen, user should navigate back to Profession category screen$")
	public void verifybackbuttonNavigateToProfessionalCategoryScreen() throws InterruptedException {
		new PeoplePage().verifyBackButtonNaviagteToProfessionalCategoryHeadr();
	}

	@Then("^I Verify in respective Profession Details screen, respective profession user profiles with username,profession if user has set and follow button should be displayed$")
	public void iVerifyDescriptionOfProfessional() {
		new PeoplePage().verifyDescriptionOfProfessional();
	}

	@Then("^I Verify when searched profession does not match any of the profession list, \"([^\"]*)\" should be displayed$")
	public void verifyInvalidProfession(String profession) {
		new PeoplePage().verifyWithInvalidProfessionInSearchBox(profession);
	}

	@Then("^I Verify by tap on app back button or mobile back button in respective profile screen, user should navigate back to profession details screen$")
	public void verifyUserProfileBackButton() throws InterruptedException {
		new PeoplePage().verifyAndNavigateBackToprofessiondetailsScreen();
	}

	@When("^I Verify by performing Follow action in respective profile screen and navigating back to profession details screen, Follow state should change to Following state$")
	public void verifyFollowOnRespectiveUserProfile() throws InterruptedException {
		new PeoplePage().searchProfession();

	}

	@Then("I Verify by tap on Follow button in profession details screen, follow state should change to following and Go to feed button should show")
	public void i_verify_by_tap_on_follow_button_in_profession_details_screen_follow_state_should_change_to_following_and_go_to_feed_button_should_show()
			throws InterruptedException {
		new PeoplePage().verifyFollowButtonAtProfessionalDeatilScreenAndFeedButton();
	}

	@Then("I Verify by tap on Go to feed button, user should navigate to feed screen and feed should refresh and followed user koos should display")
	public void i_verify_by_tap_on_go_to_feed_button_user_should_navigate_to_feed_screen_and_feed_should_refresh_and_followed_user_koos_should_display()
			throws InterruptedException {
		new PeoplePage().verifyAndNavigateToFeedsPage();
	}

	@Then("I Verify by tap on Following button in profession details screen, unfollow popup with NO and YES confirmation should be displayed")
	public void i_verify_by_tap_on_following_button_in_profession_details_screen_unfollow_popup_with_no_and_yes_confirmation_should_be_displayed()
			throws InterruptedException {
		// new PeoplePage().verifyConfirmationPopUpMessageDuringUnfollow();
	}

	@Then("I Verify by tap on No in the popup, popup should get closed and user should be on the same profession details screen and Following button state should not change to Follow")
	public void i_verify_by_tap_on_no_in_the_popup_popup_should_get_closed_and_user_should_be_on_the_same_profession_details_screen_and_following_button_state_should_not_change_to_follow()
			throws InterruptedException {
		// new PeoplePage().verifyConfirmationPopUpMessageDuringUnfollow();
		new PeoplePage().verifyNobuttonPopUpMessage();
	}

	@Then("I Verify by tap on Yes in the popup, popup should get closed and Following button state should change to Follow button state")
	public void i_verify_by_tap_on_yes_in_the_popup_popup_should_get_closed_and_following_button_state_should_change_to_follow_button_state()
			throws InterruptedException {
		// new PeoplePage().verifyConfirmationPopUpMessageDuringUnfollow();
		new PeoplePage().verifyYesButtonPopUpMessage();
	}

	@Then("I Verify by tap on Find your Friends on Koo button, user should navigate to Invite screen with Allow Koo to access your contacts? popup with Allow and Deny options")
	public void i_verify_by_tap_on_find_your_friends_on_koo_button_user_should_navigate_to_invite_screen_with_allow_koo_to_access_your_contacts_popup_with_allow_and_deny_options()
			throws Exception {

	}

	@Then("I Verify by tap on Deny option in the popup, device contacts should not show on invite screen and user should navigate back to People tab screen on Find your friends button")
	public void i_verify_by_tap_on_deny_option_in_the_popup_device_contacts_should_not_show_on_invite_screen_and_user_should_navigate_back_to_people_tab_screen_on_find_your_friends_button()
			throws InterruptedException {
		new PeoplePage().VerifyClickOnDenyOptionUserShouldNaviageToPeopleTab();
	}

	@Then("^I Verify by tap on \"([^\"]*)\" button in profession details screen, follow state should change to following and \"([^\"]*)\" button should show$")
	public void verifyFollowAtProfessionalDeatilScreen() throws InterruptedException {
		new PeoplePage().verifyFollowButtonAtProfessionalDeatilScreenAndFeedButton();
	}

	@Then("^I Verify by tap on user profile,username,profession and anywhere else except follow button, user should navigate to respective profile screen$")
	public void iVerifyTappingExceptFollowButtonNavigateToRespectiveProfile() throws InterruptedException {
		new PeoplePage().verifyTappingExceptFollowButtonNavigateToRespectiveProfile();
	}

	@Then("^I Verify user should be able to scroll in respective profession details screen$")
	public void scrollIntoRespectiveProfile() {
		new PeoplePage().verifyScrolldownInRespectiveProfessionalField();
	}

	@Then("^I Verify back button in invite screen and by tap on app back button/mobile back button, user should land on People tab screen$")
	public void iVerifyAndClickOnBackButtonInInviteScreen() throws InterruptedException {
		new PeoplePage().verifyAndClickOnBackButtonNaviagetBackToPeopleScreen();
	}

	@Then("^I Verify profile picture, name, handle, profession, follow button should be displayed on all carousal card$")
	public void iverifyProfilePicture_Name_Handle_Profession_Follow_buttonShouldBeDisplayedOnAllCrousalCard()
			throws Exception {
		new PeoplePage().verifyProfilePicture_Name_Handle_Profession_Follow_buttonShouldBeDisplayedOnAllCrousalCard();
	}

	@Then("I Verify Find your Friends on Koo and Invite Friends button should show in People tab screen and I Verify by tap on Find your Friends on Koo button, user should navigate to Invite screen with Allow Koo to access your contacts? popup with Allow and Deny options")
	public void i_verify_find_your_friends_on_koo_and_invite_friends_button_should_show_in_people_tab_screen_and_i_verify_by_tap_on_find_your_friends_on_koo_button_user_should_navigate_to_invite_screen_with_allow_koo_to_access_your_contacts_popup_with_allow_and_deny_options()
			throws Exception {
		new PeoplePage().ClickOnFindYourFriendAndVerifyAllowAndDenyInThePopUp();
	}

	@Then("I Verify Search for your friends and family? search box is displayed with this water mark text inside it")
	public void i_verify_search_for_your_friends_and_family_search_box_is_displayed_with_this_water_mark_text_inside_it() {
		new PeoplePage().verifyWaterMarkInSearchBox();
	}

	@Then("I Verify by tap on Invite Friends button in People tab screen, Share Koo screen should be displayed with twitter, facebook, whatsapp status and whatsapp icons and verify Cancel button should be displayed in Share Koo screen icon")
	public void i_verify_by_tap_on_invite_friends_button_in_people_tab_screen_share_koo_screen_should_be_displayed_with_twitter_facebook_whatsapp_status_and_whatsapp_icons_and_verify_cancel_button_should_be_displayed_in_share_koo_screen_icon()
			throws Exception {
		new PeoplePage().verifyAfterClickOnInviteButtonAndVerifyShareKoo();
	}

	@Then("I Verify by tap the searchBox, VKB should open")
	public void i_verify_by_tap_on_settings_in_popup_vkb_should_open() {
		new PeoplePage().verifySearchFunctionAndVirtualKeyBoard();
	}

}
