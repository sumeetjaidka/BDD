package com.qa.stepdef;

import com.qa.pages.ProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProfileStepDef {
	
	@Then("^I navigate to Profile page and verify Profile page basic elements")
	public void navigateToPofilePageAndVerifyElements() throws InterruptedException{
		new ProfilePage().iNavigateToProfileScreen();
		new ProfilePage().verifyProfilePageBasicElements();
	}
	
	@Then("^I Verify tapping on user stats icon user should go to user stats screen.")
	public void IVerifyTappingUserStatsIconAndVerifyStatsScreen() throws InterruptedException{
		new ProfilePage().IVerifyTappingUserStatsIconAndVerifyStatsScreen();
	}
	
	@Then("^I Tapping on the stats icons, user should navigate to stats screen and tapping on back button on the header or device back button user should navigate back to the profile screen.")
	public void iVerifyBackButtonAndDeviceBackButtonFunctionalityOnStatsScreen() throws InterruptedException {
		new ProfilePage().iVerifyBackButtonAndDeviceBackButtonFunctionalityOnStatsScreen();
	}
	
	@Then("^I Verify tapping on share icon sharing icon, share pop up should open & contain following Share Koo header text; Twitter icon, Whatsapp Status icon; Facebook icon; Whatsapp icon.")
	public void iVerifySharingElementsFunctionality() throws InterruptedException {
		new ProfilePage().iVerifySharingElementsFunctionality();
	}
	
	@Then("^I Verify tapping on each button, respective actions should happen:1. Cancel button - popup should close; 2. Share icons - naviagte o respective platforms.")
	public void iVerifyVariousSharingElementFunctionality() throws InterruptedException {
		new ProfilePage().iVerifyVariousSharingElementFunctionality();
	}
	
	@Then("^User Stats, Profile Share and Settings buttons should be on the right top corner of the screen.")
	public void iVerifySettingButtonandShareButtonOnUserStats() throws InterruptedException {
		new ProfilePage().iVerifySettingButtonandShareButtonOnUserStats();
	}
	
	@Then("^I Verify tapping on profile image user should enter full screen & profle image should be displayed.")
	public void iVerifyImageOnFullScreen() throws InterruptedException {
		new ProfilePage().iVerifyImageOnFullScreen();
	}
	
	@Then("^I Veirfy below the header profile details, next to profile image, Edit Profile button should show on the right side.")
	public void iVerifyEditProfileButton() throws InterruptedException {
		new ProfilePage().iVerifyEditProfileButton();
	}
	
	@Then("^I Verify More Info & Less info buttons should be shown below user details.")
	public void iVerifyMoreInfoAndLessInfoButton() throws InterruptedException {
		new ProfilePage().iVerifyMoreInfoAndLessInfoButton();
	}
	
	@Then("^I Verify the Profile Details things below the profile image in order.")
	public void iVerifyProfileDetailsthingsbelowtheprofileimage() throws InterruptedException {
		new ProfilePage().iVerifyProfileDetailsthingsbelowtheprofileimage();
	}
	
	@Then("^I Verify followers and following button to be displayed below work experience Followers on the left and following on the right.")
	public void iVerifyFollowerandFollowingButton() throws InterruptedException {
		new ProfilePage().iVerifyFollowerandFollowingButton();
	}
	
	@Then("^I Verify Count on followers & following buttons, and 5 profile images on both followers & following buttons Images should be from respective list")
	public void iVerifyCountonfollowersfollowingbuttons() throws InterruptedException {
		new ProfilePage().iVerifyCountonfollowersfollowingbuttons();
	}
	
	@Then("^I Verify user should be able to tap on followers & following buttons & should enter respective screen")
	public void IVerifyUserShouldBeAbleTotTaponFollowersFollowingButtonsAndShouldEnterRespectiveScreen() throws InterruptedException {
		new ProfilePage().IVerifyUserShouldBeAbleTotTaponFollowersFollowingButtonsAndShouldEnterRespectiveScreen();
	}
	
	@Then("^I Verify users name should be displayed in list along with profile images follow unfollow buttons.")
	public void IVerifyUsersNameShouldAppearInListAlongWithProfileImagesFollowUnfollowButtons() throws InterruptedException {
		new ProfilePage().IVerifyUsersNameShouldAppearInListAlongWithProfileImagesFollowUnfollowButtons();
	}
	
	@Then("^I Verify Functionality of Search Field on each section of Followers as well as Following.")
	public void IVerifyFunctionalityofSearchFieldOnEachSectionOfFollowersAsWellAsFollowing() throws InterruptedException {
		new ProfilePage().IVerifyFunctionalityofSearchFieldOnEachSectionOfFollowersAsWellAsFollowing();
	}
	
	@Then("^I Verify user should be able to enter user stats screen on tapping stats icon in profiel header, also verifying the Stats Screen Functionality.")
	public void IVerifyUserStatsScreenOnTappingStatsIconInProfielHeader() throws InterruptedException {
		new ProfilePage().IVerifyUserStatsScreenOnTappingStatsIconInProfielHeader();
	}
	
	@Given("^I am on Profile page and I can see Koo Icon, Like icon and comment as Header in Koo section")
	public void IVerifyKooIconLikeIconCommentIconAppearOnTheprofileTab() throws InterruptedException {
		new ProfilePage().IVerifyKooIconLikeCommentIconAppearOnTheprofileTab();
	}
	
	@Then("^I verify Tips for Creators is showing in profile whether Koo is created or not")
	public void IVerifyTipsForCreators() throws InterruptedException {
		new ProfilePage().iVerifyTipsForCreatorsAlwaysPresentInProfilePage();
	}
	
	@Then("^I verify Koo Cards present in Profile section and if not then create multiple koos")
	public void verifyKooCardPresent() throws InterruptedException {
		new ProfilePage().verifyIfKooCardsArePresent();
	}

	@Then("^I verify No koo UI by deleting existing koo if present")
	public void iVerifyNoKoosUI() throws InterruptedException {
		new ProfilePage().verifyNoKooUI();
	}
/*	@Then("^I Verify user should be able to see Create you first koo button with a smiley, in own profile, when they have not posted any koo, Verify by Tapping On it.")
	public void IVerifyUserShouldAbletoSeeCreateYouFirstKoobuttonWithSmileyInOwnProfileIfNotPostedAnyKoo() throws InterruptedException {
		new ProfilePage().IVerifyUserShouldAbletoSeeCreateYouFirstKoobuttonWithSmileyInOwnProfileIfNotPostedAnyKoo();
	}
	*/
	
	@Then("^I get the handle name and logged in back to another account to see this public profile")
	public void iVerifyRequestKooForPublicProfile() throws Exception {
		new ProfilePage().verifyRequestKooFeatureForPublicProfile();
	}
	
	@Then("^I Verify public user Profile, if a public user has not created koos.")
	public void IVreifyIfPublicUserHasNotCreatedAnykoos() throws InterruptedException {
		new ProfilePage().IVreifyIfPublicUserHasNotCreatedAnykoos();
	}
	
	@Then("^I verify all options present in Koo card")
	public void iVerifyAllOptionsInKooCard() throws InterruptedException {
		new ProfilePage().verifyAllOptionsInKooCard();
	}
	
	@Then("^I verify on tapping comment button, user should navigate to comment creation screen")
	public void IVerifyCommentButtonNavigatesToCommentScreen() throws InterruptedException {
		new ProfilePage().verifyCommentIconFeature();
	}
	
	@Then("^I verify the latest Koo should show on top")
	public void IVerifyKoosShouldShowInTimelineBasis() throws InterruptedException {
		new ProfilePage().verifyLatestKooIsDisplayingInTop();
	}
	
	@Then("^I Verify in tapping the koo card, user should enter koo detail screen")
	public void IVerifyInTappingTheKooCardUserShouldEnterKooDetailscreen() throws InterruptedException {
		new ProfilePage().IVerifyInTappingTheKooCardUserShouldEnterKooDetailscreen();
	}
	
	@Then("^I Verify koos should show in timeline basis.")
	public void IVerifyKoosShouldShowInTimelineBasisLatestKooShouldShowOnTop() throws InterruptedException {
		new ProfilePage().IVerifyKoosShouldShowInTimelineBasisLatestKooShouldShowOnTop();
	}
	
	@Then("^I Verify tapping on the option button delete koo should show.")
	public void IVerifyTappingOnTheOptionButtonDeleteKooShouldShow() throws InterruptedException {
		new ProfilePage().IVerifyTappingOnTheOptionButtonDeleteKooShouldShow();
	}
	
	@Then("^I Verify liked koos should display on liked section also Newly liked koos should show on top.")
	public void IVerifyLikedKoosShouldDisplayOnLikedSection() throws Exception {
		new ProfilePage().IVerifyLikedKoosShouldDisplayOnLikedSection();
	}
	
	@Then("^I Verify the koos present in liked section.")
	public void IVerifyTheKoosPresentInLikedSection() throws Exception {
		new ProfilePage().IVerifyTheKoosPresentInLikedSection();
	}
	
	@Then("^I verify by Tapping on the Koo In Liked Section.")
	public void IVerifyByTappingOnTheKooInLikedSection() throws InterruptedException {
		new ProfilePage().IVerifyByTappingOnTheKooInLikedSection();
	}
	
	@Then("^I Verify user should able to like and dislike the koo and verify respective count.")
	public void IVerifyUserShouldAbleToLikeAndDislikeTheKooAndVerifyRespectiveCount() throws Exception {
		new ProfilePage().IVerifyUserShouldAbleToLikeAndDislikeTheKooAndVerifyRespectiveCount();
	}
	
	@Then("^I Verify if there is no koos there should be trending koos button and Verify tapping on trending koos button user should navigate to trending koos screen.")
	public void IVerifyForTrendingKooButton() throws Exception {
		new ProfilePage().IVerifyForTrendingKooButton();
	}
	
	@Then("^I Verify user should able to comment, reekoo and ther counts as well as whatsaap share Functionality.")
	public void IVerifyUserShouldAbleToCommentToTheKooAndVerifyCommentCount() throws Exception {
		new ProfilePage().IVerifyUserShouldAbleToCommentToTheKooAndVerifyCommentCount();
	}
	
	@Then("^I Verify tapping on any rekoo user should navigate to koos detailed screen and by Tapping on header back button or device back button user should navigate to Rekoos and Comments Section.")
	public void IVerifyTappingOnAnyRekooUserShouldNavigateToKoosDetailedScreen() throws Exception {
		new ProfilePage().IVerifyTappingOnAnyRekooUserShouldNavigateToKoosDetailedScreen();
	}
	
	@Then("^I Verify tapping on the option button delete koo should show for user rekooed koos.")
	public void IVerifyTappingOnTheOptionButtonDeleteKooShouldShowForUserRekooedKoos() throws InterruptedException {
		new ProfilePage().IVerifyTappingOnTheOptionButtonDeleteKooShouldShowForUserRekooedKoos();
	}
	
	@Then("^I verify by logging out.")
	public void IVerifyByLoggingOut() throws Exception {
		new ProfilePage().IVerifyByLoggingOut();
	}
	
	@Then("^I Verify by tap on Search icon user.")
	public void IVerifyByTapOnSearchIconUser() throws Exception {
		new ProfilePage().IVerifyByTapOnSearchIconUser();
	}
	
	@Then("^I Verify Whole Functionality Of profile view icon.")
	public void IVerifyByDefaultProfileViewIconShouldNotShow() throws Exception {
		new ProfilePage().IVerifyByDefaultProfileViewIconShouldNotShow();
	}
	
	@Then("^I Verify User-A mentioned koos should display in User-B mentions section on profile.")
	public void IVerifyMentionTabFunctionality() throws Exception {
		new ProfilePage().IVerifyMentionTabFunctionality();
	}
	
	@Then("^I Verify mentioned koos should display in User-B mentions section on profile")
	public void IVerifyMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile() throws InterruptedException {
		new ProfilePage().iNavigateToProfileScreen();
		new ProfilePage().IVerifyMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile();
	} 
	
	@Then("^I Verify User-A deleted mentions should not show on User-B mentions section on profile.")
	public void IVerifyUserADeletedMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile() throws InterruptedException {
		new ProfilePage().iNavigateToProfileScreen();
		new ProfilePage().IVerifyUserADeletedMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile();
	} 
	
	@Then("^I Verify deleted mentions should not show on User-B mentions section on profile.")
	public void IVerifyDeletedMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile() throws InterruptedException {
		new ProfilePage().iNavigateToProfileScreen();
		new ProfilePage().IVerifyDeletedMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile();
	}

	@Then("^I verify by log out.")
	public void IVerifyByLogOut() throws Exception {
		new ProfilePage().IVerifyByLogOut();
	}

	//made by sumeet

	@Then("^I Click More Info & Less info buttons should on user details tag.")
	public void iVerifyMoreInfoAndLessInfoButtonSettings() throws InterruptedException {
		new ProfilePage().iVerifyMoreInfoAndLessInfoButtonSettings();
	}

	@Then("^I Tapping on back button user should navigate back to the home screen.")
	public void iVerifyTappingOnBackButtonUserShouldNavigateBack() throws Exception {
		new ProfilePage().iVerifyTappingOnBackButtonUserShouldNavigateBack();
	}

	@Then("^I click on Edit profile")
	public void iVerifyclickonEditprofile() throws Exception {
		new ProfilePage().iVerifyclickonEditprofile();
	}

	@Then("^I click on Save Button")
	public void iVerifyclickonSaveButton() throws Exception {
		new ProfilePage().iVerifyclickonSaveButton();
	}

	@Then("^I click on a Edit profile name field")
	public void iclickonaEditprofilenamefield() throws Exception {
		new ProfilePage().iclickonaEditprofilenamefield();
	}

	@Then("^I click on a line Edit input name")
	public void IclickonalineEditinputname() throws Exception {
		new ProfilePage().IclickonalineEditinputname();
	}

	@Then("^I click on handle name Button and input handlename")
	public void iclickonhandlenameButtonandinputhandlename() throws Exception {
		new ProfilePage().iclickonhandlenameButtonandinputhandlename();
	}
	@Then("^I click on profession name Button")
	public void iclickonprofessionnameButton() throws Exception {
		new ProfilePage().iclickonprofessionnameButton();
	}





}
