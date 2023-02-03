package com.qa.stepdef;

import com.qa.pages.TrendingKoosPage;

import io.cucumber.java.en.Then;

public class TrendingKoosStepDefinition extends TrendingKoosPage {

	@Then("^Trending Koos icon should display on top right corner of the feed.$")
	public void verifyTrendingKossIconPresent() throws Exception {
		kooIconDisplayed();
	}

	@Then("^On tapping trending Koos icon user should navigate to the Trending Koos screen and screen should refresh.$")
	public void verifyUserIsOnTrendingKoosScreen() {
		clickOnTrendingKoosButton();
	}

	@Then("^On top left corner of the trending Koos screen Back button should display.$")
	public void verifyBackButtonClickAble() {
		isBackButtonPresent();
	}

	@Then("^On top centre on the Trending Koos screen Header should display.$")
	public void verifyTrendingKoosTextVisible() {
		isTrendingKoosTextPresent();
	}

	@Then("^On tapping back button in the trending Koos screen user should should navigate back to the feed screen.$")
	public void verifyUserIsOnFeedScreen() throws Exception {
		isUserOnFeedScreen();
	}

	@Then("^On top right corner of the trending Koos screen Refresh button should display.$")
	public void verifyRefreshButton() throws Exception {
		verifyRefreshButtonPrescence();
	}

	@Then("^Bottom of the Trending Koos screen Koo creation button should display.$")
	public void verifyAddKooCreationButtonPresent() {
		kooCreationButtonPrescence();
	}

	@Then("^On tapping botton Koo create button in Trending Koo screen user should navigate to the Koo creation screen.$")
	public void tappingOnKooCreationButton() {
		kooCreateScreen();
	}

	@Then("^On navigating to the Trending Koos screen Small and the big follow button should blip.$")
	public void bigFollowButtonPresence() throws InterruptedException {
		bigFollowButton();
	}

	@Then("^Verify on tapping any Koo in the Trending Koos screen user should navigate to the Koos details screen.$")
	public void kooDetailScreen() {
		navigateToKooDetailScreen();
	}

	@Then("^Click on Follow button, small follow button should disaapeared and the person should be followed.$")
	public void bigButtonFollowUser() throws Exception {
		bigFollowButtonUser();
	}

	@Then("^Click on small follow button, follow button should disappears and the person should be followed.$")
	public void smallButtonFollowUser() throws Exception {
		smallFollowButton();
	}
}
