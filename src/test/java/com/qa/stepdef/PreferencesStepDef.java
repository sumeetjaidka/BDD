package com.qa.stepdef;

import com.qa.pages.PreferencesPage;

import io.cucumber.java.en.Then;

public class PreferencesStepDef {
	
	@Then("^Verify user is able to see the preference screen after the image upload screen in onboarding process.")
	public void VerifyUserIsAbleToSeeThePreferenceScreenAfterTheImageUploadScreenInOnboardingProcess() throws InterruptedException {
		new PreferencesPage().VerifyUserIsAbleToSeeThePreferenceScreenAfterTheImageUploadScreenInOnboardingProcess();
	}
	
	@Then("^Verify all the data in the preference screen and informative texts are appearing from backend.")
	public void VerifyAllTheDataInThePreferenceScreenandInformativeTextsAreAppearingFromBackend() throws InterruptedException {
		new PreferencesPage().VerifyAllTheDataInThePreferenceScreenandInformativeTextsAreAppearingFromBackend();
	}
	
	@Then("^Verify user is able to select and deselect single or multiple preferences/interests by tapping on the text or on the check box.")
	public void VerifyUserisAbleToSelectandDeselectSingleMultiplePreferencesInterestsByTappingTheTextOnTheCheckox() throws InterruptedException {
		new PreferencesPage().VerifyUserisAbleToSelectandDeselectSingleMultiplePreferencesInterestsByTappingTheTextOnTheCheckox();
	}
	
	@Then("^Verify selected preferences should have selected check box and others to have empty check boxes.")
	public void VerifySelectedPreferencesShouldHaveSelectedCheckBoxandOtherstoHaveEmptyCheckBoxes() throws InterruptedException {
		new PreferencesPage().VerifySelectedPreferencesShouldHaveSelectedCheckBoxandOtherstoHaveEmptyCheckBoxes();
	}
	
	@Then("^Verify After the user selects some preferences in the onboarding flow the text of the button should change to continue instead of Skip/continue.")
	public void VerifyAftertheuserselectsSomePreferencesInTheOnboardingFlowTheTextOfTheButtonShouldChangetoContinueInsteadofSkipcontinue() throws InterruptedException {
		new PreferencesPage().VerifyAftertheuserselectsSomePreferencesInTheOnboardingFlowTheTextOfTheButtonShouldChangetoContinueInsteadofSkipcontinue();
	}
	
	@Then("^Verify on tapping Skip Continue user should move to next screen or feed.")
	public void VerifyonTappingSkipContinueUserShouldMovetoNextScreenorFeed() throws InterruptedException {
		new PreferencesPage().VerifyonTappingSkipContinueUserShouldMovetoNextScreenorFeed();
	}
	
	@Then("^Verify on selecting one or few preferences and tapping on \"Skip / Continue\" button or witing for 15 seconds user should navigate to next screen/feed.")
	public void VerifyUserShouldMoveToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor15SecondsWithPerformingAnyActionsSelections() throws Exception {
		new PreferencesPage().VerifyUserShouldMoveToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor15SecondsWithPerformingAnyActionsSelections();
	}
	
	@Then("^Verify once after selecting any preference from onboarding or peoples tab user should not see onboarding preference screen.")
	public void VerifyOnceAfterSelectingAnyPreferenceFromOnboardingorPeoplesTabUserShouldNotSeeOnboardingPreferenceScreen() throws Exception {
		new PreferencesPage().VerifyOnceAfterSelectingAnyPreferenceFromOnboardingorPeoplesTabUserShouldNotSeeOnboardingPreferenceScreen();
	}
	
	@Then("^Verify user should move to feed or next screen if the user stays on preference screen for 30 seconds without performing any actions/selections.")
	public void VerifyUserShouldMoveToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor30SecondsWithoutPerformingAnyActionsSelections() throws Exception {
		new PreferencesPage().VerifyUserShouldMoveToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor30SecondsWithoutPerformingAnyActionsSelections();
	}
	
	@Then("^Verify Your preferences widget at the top on peoples tab.")
	public void VerifyYourPreferencesWidgetAtTheTopOnPeoplesTab() throws InterruptedException {
		new PreferencesPage().VerifyYourPreferencesWidgetAtTheTopOnPeoplesTab();
	}
	
	@Then("^Verify all the preferences/interests selected while onboarding to be present in the widget in the same order as in onboarding screen.")
	public void VerifyAllThePreferencesInterestsSelectedWhileOnboardingToBePresentInTheWidgetInTheSameOrderAsInOnboardingScreen() throws InterruptedException {
		new PreferencesPage().VerifyAllThePreferencesInterestsSelectedWhileOnboardingToBePresentInTheWidgetInTheSameOrderAsInOnboardingScreen();
	}
	
	@Then("^Verify Add more button at the end.")
	public void VerifyAddMoreButtonAtTheEnd() throws InterruptedException {
		new PreferencesPage().VerifyAddMoreButtonAtTheEnd();
	}
	
	@Then("^Verify Add more button should  not be present in the widget in case of no onboarding preferences selected.")
	public void VerifyAddMoreButtonShouldNotBePresentInTheWidgetInCaseOfNoOnboardingPreferencesSelected() throws Exception {
		new PreferencesPage().VerifyAddMoreButtonShouldNotBePresentInTheWidgetInCaseOfNoOnboardingPreferencesSelected();
	}
	
	@Then("^Verify on tapping Add more button user should navigate to people preferences screen.")
	public void VerifyOnTappingAddMoreButtonUserShouldNavigateToPeoplePreferencesScreen() throws InterruptedException {
		new PreferencesPage().VerifyOnTappingAddMoreButtonUserShouldNavigateToPeoplePreferencesScreen();
	}
	
	@Then("^Verify onboarding selected preferences should have prefilled selected check box and others to have empty check boxes.")
	public void VerifyOnboardingSelectedPreferencesShouldHavePrefilledSelectedCheckBoxAndOthersToHaveEmptyCheckBoxes() throws InterruptedException {
		new PreferencesPage().VerifyOnboardingSelectedPreferencesShouldHavePrefilledSelectedCheckBoxAndOthersToHaveEmptyCheckBoxes();
	}
	
	@Then("^Verify user is able to scroll through the preferences properly.")
	public void VerifyUserIsAbleToScrollThroughThePreferencesProperly() throws InterruptedException {
		new PreferencesPage().VerifyUserIsAbleToScrollThroughThePreferencesProperly();
	}
	
	@Then("^Verify the selection or deselection state should be auto saved on every interaction on the button.")
	public void VerifyTheSelectionOrDeselectionStateShouldBeAutoSavedOnEveryInteractionOnTheButton() throws InterruptedException {
		new PreferencesPage().VerifyTheSelectionOrDeselectionStateShouldBeAutoSavedOnEveryInteractionOnTheButton();
	}
	
	@Then("^Verify respective profile pictures to be displayed below all the preferences.")
	public void VerifyRespectiveProfilePicturesToBeDisplayedBelowAllThePreferences() throws InterruptedException {
		new PreferencesPage().VerifyRespectiveProfilePicturesToBeDisplayedBelowAllThePreferences();
	}
	
	@Then("^Verify user should navigate to people screen on tapping the back button situated beside the Your preferences text header.")
	public void VerifyUserShouldNavigatetoPeopleScreenonTappingTheBackButtonSituatedBesideTheYourPreferencesTextHeader() throws InterruptedException {
		new PreferencesPage().VerifyUserShouldNavigatetoPeopleScreenonTappingTheBackButtonSituatedBesideTheYourPreferencesTextHeader();
	}
	
	@Then("^Verify on tapping on any of the preference user should navigate to preference detail screen.")
	public void VerifyOnTappingOnAnyOfThePreferenceUserShouldNavigateToPreferenceDetailScreen() throws InterruptedException {
		new PreferencesPage().VerifyOnTappingOnAnyOfThePreferenceUserShouldNavigateToPreferenceDetailScreen();
	}
	
	@Then("^Verify user should see the list of individual profiles creators related to the preference interest.")
	public void VerifyUserShouldSeeTheListOfIndividualProfilesCreatorsRelatedToThePreferenceInterest() throws InterruptedException {
		new PreferencesPage().VerifyUserShouldSeeTheListOfIndividualProfilesCreatorsRelatedToThePreferenceInterest();
	}
	
	@Then("^Verify user is able to scroll through the profiles properly.")
	public void VerifyUserIsAbleToScrollThroughTheProfilesProperly() throws InterruptedException {
		new PreferencesPage().VerifyUserIsAbleToScrollThroughTheProfilesProperly();
	}
	
	@Then("^Verify user should be able to follow or unfollow individual profiles.")
	public void VerifyUserShouldBeAbletoFolloworUnfollowIndividualProfiles() throws InterruptedException {
		new PreferencesPage().VerifyUserShouldBeAbletoFolloworUnfollowIndividualProfiles();
	}
	
	@Then("^Verify on tapping on Add to preferences user should see a conformation toast message.")
	public void VerifyonTappingonAddToPreferencesUserShouldSeeaConformationToastMessage() throws InterruptedException {
		new PreferencesPage().VerifyonTappingonAddToPreferencesUserShouldSeeaConformationToastMessage();
	}
	
	@Then("^Verify on tapping on Add to preferences the check box should be enabled and text to change to prefered.")
	public void VerifyonTappingonAddtoPreferencesTheCheckBoxShouldbeEnabledAndTexttoChangetoPrefered() throws InterruptedException {
		new PreferencesPage().VerifyonTappingonAddtoPreferencesTheCheckBoxShouldbeEnabledAndTexttoChangetoPrefered();
	}
	
	@Then("^Verify on tapping on back button user should navigate back to People preferences screen.")
	public void VerifyonTappingonBackButtonUserShouldNavigateBacktoPeoplePreferencesScreen() throws InterruptedException {
		new PreferencesPage().VerifyonTappingonBackButtonUserShouldNavigateBacktoPeoplePreferencesScreen();
	}
	
	@Then("^Verify selected check box for respective preference.")
	public void VerifySelectedCheckBoxForRespectivePreference() throws InterruptedException {
		new PreferencesPage().VerifySelectedCheckBoxForRespectivePreference();
	}
	
	@Then("^Verify on tapping done button user should navigate back to peoples screen and the selected preference should reflect in the Your preferences widget.")
	public void VerifyOnTappingDoneButtonUserShouldNavigateBackToPeoplesScreenAndTheSelectedPreferenceShouldReflectInTheYourPreferencesWidget() throws InterruptedException {
		new PreferencesPage().VerifyOnTappingDoneButtonUserShouldNavigateBackToPeoplesScreenAndTheSelectedPreferenceShouldReflectInTheYourPreferencesWidget();
	}
	
	// new by sumeet
	@Then("^Verify user is able to select and deselect single or multiple preferences/interests by clicking on the text or on the check box.")
	public void VerifyUserisAbleToSelectandDeselectSingleMultipleInterestsByTappingTheTextOnTheCheckox() throws InterruptedException {
		new PreferencesPage().VerifyUserisAbleToSelectandDeselectSingleMultipleInterestsByTappingOnTheCheckbox();
	}

	@Then("^Verify selected interest preferences should have selected check box and others to have empty check boxes.")
	public void VerifySelectedInteresetPreferencesShouldHaveSelectedCheckBoxandOtherstoHaveEmptyCheckBoxes() throws InterruptedException {
		new PreferencesPage().VerifySelectedInteresetPreferencesShouldHaveSelectedCheckBoxandOtherstoHaveEmptyCheckBoxes();
	}

	@Then("^Verify After the user selects some Interest preferences the text of the button should change to continue instead of Skip/continue.")
	public void VerifyAftertheuserselectsSomeInterestPreferencesTheTextOfTheButtonShouldChangetoContinueInsteadofSkipcontinue() throws InterruptedException {
		new PreferencesPage().VerifyAftertheuserselectsSomeInterestPreferencesTheTextOfTheButtonShouldChangetoContinueInsteadofSkipcontinue();
	}

	@Then("^Verify on selecting one or few interest preferences and tapping on \"Skip / Continue\" button or waiting for 15 seconds user should navigate to next screen/feed.")
	public void VerifyUserShouldNavigateToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor15SecondsWithPerformingAnyActionsSelections() throws Exception {
		new PreferencesPage().VerifyUserShouldNavigateToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor15SecondsWithPerformingAnyActionsSelections();
	}

	@Then("^Verify once after selecting any interest preference from onboarding or people tab user should not see preference screen.")
	public void VerifyOnceAfterSelectingAnyInterestPreferenceFromOnboardingorPeoplesTabUserShouldNotSeeOnboardingPreferenceScreen() throws Exception {
		new PreferencesPage().VerifyOnceAfterSelectingAnyInterestPreferenceorPeopleTabUserShouldNotSeeOnboardingPreferenceScreen();
	}
	//new by sumeet
	@Then("^Verify on tapping Skip Continue user should move to profile to follow screen.")
	public void VerifyonTappingSkipContinueUserShouldMovetoProfileToFollowScreen() throws InterruptedException {
	new PreferencesPage().VerifyonTappingSkipContinueUserShouldMovetoProfileToFollowScreen();
	}

	@Then("^Verify user navigates to feed screen without selecting any interest.")
	public void VerifyUserGoesToFeedScreenWithoutAnyInterestSelectedAndPeopleFollowed() throws InterruptedException {
		new PreferencesPage().VerifyUserIsOnHomeScreeWithoutSelectingInterestByClickingSkipcontinue();
	}
}