package com.qa.stepdef;

import org.junit.Assert;

import com.qa.pages.TrendingTags;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrendingTagsSteps {

	@When("^I Verify on tapping Hastag icon from the bottom bar user should navigate to Trending Hashtags Screen")
	public void iverifyHastTagIconAtTheBottomBarNavigateToTrendingHastagScreen() throws InterruptedException {
		new TrendingTags().verifyHastTagIconAtTheBottomBarNavigateToTrendingHastagScreen();
	}

	@Then("^I Verify there should be trending tags on trending hashtags screen with blue colour")
	public void iverifyListOfTreadingTags() throws InterruptedException {
		new TrendingTags().verifyListOfTreadingTags();
	}

	@Then("^I Verify below the hashtag there should be profile pictures of koo creator who is creating the koo with the respective hashtag")
	public void iVerifyProfilePicturesOfCreater() {
		new TrendingTags().verifyProfilePicturesOfCreater();
	}

	@Then("^I Verify only five profile pictures of koo creators should show below every hashtag")
	public void iverifyFiveProfilePictureUnderTrendingTags() {
		new TrendingTags().verifyFiveProfilePictureUnderTrendingTags();
	}

	@Then("^I Verify there should plus icon button next to every hashtag")
	public void iVerifyPlusButton() {
		new TrendingTags().verifyPlusButton();
	}

	@Then("^I Verify tapping plus icon button next to every hashtag user should navigate to koo creation screen and respective hashtag should auto populate with cursor pointing and keypad in open state")
	public void iverifyClickOnPlusButtonNavigateToKooCreationScreen() throws InterruptedException {
		new TrendingTags().verifyClickOnPlusButtonNavigateToKooCreationScreen();
	}

	@Then("^I Verify on entering text inside koo creation title and then tapping app/device back button from koo creation screen confirmation popup should show with yes or no")
	public void iVerifyAfterEnteringTextInsideKooCreationTitleBoxTappingOnAppDeviceBackButtonFromKooCreationScreenConfirmationPopupShouldShowWithYesOrNo()
			throws InterruptedException {
		new TrendingTags()
				.verifyAfterEnteringTextInsideKooCreationTitleBoxTappingOnAppDeviceBackButtonFromKooCreationScreenConfirmationPopupShouldShowWithYesOrNo();
	}

	@Then("^I Verify on tapping yes user should back to trending hashtags screen")
	public void iVerifyAndClickOnYesButton() throws InterruptedException {
		new TrendingTags().verifyAndClickOnYesButton();
	}

	@Then("^I Verify on tapping no user should be on koo creation screen")
	public void iVerifyAndClickOnNoButton() {
		new TrendingTags().verifyAndClickOnNoButton();
	}

	@Then("^I Verify on tapping respective hashtag user should navigate to detailed screen and koos should show with that hashtag")
	public void iVerifyClickONRespectiveHastagUserShouldNavigateToDetailedScreen() throws InterruptedException {
		new TrendingTags().verifyClickONRespectiveHastagUserShouldNavigateToDetailedScreen();
	}

	@Then("^I Verify on tapping app/device back button form detailed screen user should land on Trending Hashtags screen")
	public void iVerifyAndClickOnBackButtonOnRespectiveHastTagScreen() throws InterruptedException {
		new TrendingTags().verifyAndClickOnBackButtonOnRespectiveHastTagScreen();
	}

	@Then("I Verify on tapping plus icon button next to every hashtag user should navigate to koo creation screen and respective hashtag should auto populate with cursor pointing and keypad in open state")
	public void iVerifyOnTappingPlusIconButtonNextToEveryHashtagUserShouldNavigateToKooCreationScreenAndRespectiveHashtagShouldAutoPopulateWithCursorPointingAndKeypadInOpenState()
			throws InterruptedException {
		new TrendingTags().verifyOnTappingPlusIconButtonHashtagUserShouldNavigateToKooCreationScreen();
	}

	@Then("I Verify there should be koo creation fab icon, on tapping it user should navigate to koo creation screen and cursor should highlight with keypad open")
	public void iVerifyThereShouldBeKooCreationFabIconOnTappingItUserShouldNavigateToKooCreationScreenAndCursorShouldHighlightWithKeypadOpen()
			throws InterruptedException {
		new TrendingTags()
				.verifyThereShouldBeKooCreationFabIconOnTappingItUserShouldNavigateToKooCreationScreenAndCursorShouldHighlightWithKeypadOpen();
	}

	@Then("I Verify all the hashtags UI should be in one group with divider line below every hashtag")
	public void iVerifyAllTheHashtagsUIShouldBeInOneGroupWithDividerLineBelowEveryHashtag() {
		new TrendingTags().verifyAllTheHashtagsUIShouldBeInOneGroupWithDividerLineBelowEveryHashtag();
	}

	@Then("I Verify user should be able to scroll the screen")
	public void iVerifyUserShouldBeAbleToScrollTheScreen() throws InterruptedException {
		new TrendingTags().verifyUserShouldBeAbleToScrollTheScreen();
	}

	@Then("I Verify on dragging the screen down Pull down to refresh and Release to refresh text should show and on releasing screen should refresh")
	public void iVerifyOnDraggingTheScreenDownAndReleaseToRefreshTextShouldShowAndOnReleasingScreenShouldRefresh()
			throws InterruptedException {
		new TrendingTags()
				.verifyOnDraggingTheScreenDownAndReleaseToRefreshTextShouldShowAndOnReleasingScreenShouldRefresh();
	}

	@Then("I Verify In The News section should show only if there are any hashtags is trending from news profiles")
	public void iVerifyInTheNewsSectionShouldShowOnlyIfThereAreAnyHashtagsIsTrendingFromNewsProfiles() {
		new TrendingTags().verifyInTheNewsSectionShouldShowOnlyIfThereAreAnyHashtagsIsTrendingFromNewsProfiles();
	}

	@Then("I Verify there should be trending tags on In the news screen with blue colour.")
	public void iVerifyThereShouldBeTrendingTagsOnInTheNewsScreenWithBlueColour() throws InterruptedException {
		new TrendingTags().verifyListOfTreadingTags();
	}

	@Then("I Verify news profile pictures should before every hashtag.")
	public void iVerifyNewsProfilePicturesShouldBeforeEveryHashtag() {
		new TrendingTags().verifyProfilePicturesOfCreater();
	}

	@Then("I Verify on tapping profile picture user should navigate to respective profile screen")
	public void iVerifyOnTappingProfilePictureUserShouldNavigateToRespectiveProfileScreen()
			throws InterruptedException {
		new TrendingTags().verifyAndClickOnProfilePictureOfTheCreator();
	}

	@Then("I Verify on tapping app back button from profile screen user should navigate to In the News screen")
	public void iVerifyOnTappingAppDeviceBackButtonFromProfileScreenUserShouldNavigateToInTheNewsScreen()
			throws InterruptedException {
		new TrendingTags().verifyOnTappingAppDeviceBackButtonFromProfileScreenUserShouldNavigateToInTheNewsScreen();
	}

	@Then("I Verify on tapping app back button form detailed screen users should land on In The News screen")
	public void iVerifyOnTappingAppDeviceBackButtonFormDetailedScreenUserShouldLandOnInTheNewsScreen()
			throws InterruptedException {
		new TrendingTags().verifyOnTappingAppDeviceBackButtonFromProfileScreenUserShouldNavigateToInTheNewsScreen();
	}

}
