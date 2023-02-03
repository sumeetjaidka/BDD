package com.qa.stepdef;

import com.qa.pages.SettingsPage;
import io.cucumber.java.en.*;

public class SettingsStepDef extends SettingsPage {

	@When("^I click on Profile button$")
	public void iClickOnProfileButton() throws Exception {

		new SettingsPage().iClickOnProfileButton();
	}

	@Then("^I verify that setting button is visible and clickable$")
	public void iVerifySettingsButtonIsVisibleAndClickable() throws Exception {

		new SettingsPage().iVerifyAndClickOnSettingsButton();
	}

	@Then("I verify that the Account and Others section is present on the settings screen.")
	public void i_verify_that_the_account_and_others_section_is_present_on_the_settings_screen() throws Exception {

		iVerifyAccountAndOtherButton();
	}

	@Then("^Clicking on edit profile menu , user should navigate to edit profile$")
	public void clickOnEditProfileMenu() throws Exception {

		clickOnEditProfileButton();
	}

	@Then("^Select a language and wait for toast language updated successfully and redirection to home page.$")
	public void selectLanguage() throws Exception {

		iVerifyLanguageSwitchingViaEditProfileScreen();
	}

	@Then("^I verify that the blocked users are present in manage block users list.$")
	public void verifyManageBlockUserFunctionality() throws Exception {

		verifyBlockList();
	}

	@When("^I tap on verified account button, navigate to form and close$")
	public void applyForVerifiedAccount() throws Exception {

		new SettingsPage().verifyAccountButton();
	}

	@Then("^I verify that delete button is present and clickable.$")
	public void verifyDeleteButton() throws Exception {
		new SettingsPage().verifyDeletionProfileFunctionality();
	}

	@Then("^I click on logout button and check the log out pop-up.$")
	public void verifyLogOutAndPopUpFunctionalities() throws Exception {
		new SettingsPage().verifyLogOut();
		new SettingsPage().logInAgain();
	}

	@Then("^I tap on add account screen, user should naviagte to enter mobile number screen.$")
	public void verifyTapAddAccountButton() throws Exception {
		new SettingsPage().tapOnAddAccountButton();
	}

	@Then("^I tap on Notification button$")
	public void verifyNotificationButton() throws Exception {
		new SettingsPage().clickNotificationButton();
	}

	@Then("^I tap on Whats app updates toggle button$")
	public void verifyWhatsAppToggle() throws Exception {
		new SettingsPage().verifyWhatsAppToggle();
	}

	@Then("^I tap on Help button$")
	public void verifyHelpButton() {
		new SettingsPage().helpButton();
	}

	@Then("^I tap on Compliance button$")
	public void verifyCompliance() {
		new SettingsPage().verifyComplianceButton();
	}

	@Then("^I tap on Privacy button$")
	public void verifyPrivacy() {
		new SettingsPage().verifyPrivacyPolicies();
	}

	@Then("^I tap on About Us button$")
	public void verifyAboutUs() {
		new SettingsPage().verifyAboutUs();
	}

	@Then("^I tap on Terms and Policy button$")
	public void verifyTermsAndPolicy() {
		new SettingsPage().verifyTermsAndPolicy();
	}

	@Then("^I tap on Community Guidelines$")
	public void verifyCommunityGuidelines() {
		new SettingsPage().verifyCommunityGuidelines();
	}

	@Then("^I close the application.$")
	public void closeApplication() {
		closeApp();
	}

	// made by sumeet
	@Then("^I tap on Helpbtn")
	public void verifyHelp() {
		new SettingsPage().help();
	}

	@Then("^I click on Profile button of child$")
	public void VerifyclickonProfilebuttonofchild() throws InterruptedException {
		new SettingsPage().VerifyclickonProfilebuttonofchild();
	}

}