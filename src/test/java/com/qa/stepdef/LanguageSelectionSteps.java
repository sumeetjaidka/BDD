package com.qa.stepdef;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.Assert;

import com.qa.pages.LanguageSelectionPage;
import com.qa.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class LanguageSelectionSteps {

	@Given("^User is on Language Selection Screen$")
	public void userIsOnLanguageSelectionScreen() throws Throwable {

		new LanguageSelectionPage().waitForLanguageScreen();
	}

	@Then("^I Verify content language UI consists of all languages in the screen view$")
	public void iVerifyContentLanguageUI() throws Throwable {

		new LanguageSelectionPage().verifyAllLangugesOption();
	}

	@Then("^I Verify \"([^\"]*)\" text should show on top of the screen$")
	public void iVerifySelectLanguageText(String str) throws Throwable {

		new LanguageSelectionPage().verifySelectLanguageText(str);
	}

	@Then("^I Verify view languages of section should contain India and Nigeria$")
	public void iVerifyViewLanguageSection() throws Throwable {

		new LanguageSelectionPage().verifyLanguagesOfSection();
	}

	@Then("^I verify that on tapping on Nigeria, Nigerian languages should appear$")
	public void iVerifyNigerianLanguages() throws Throwable {

		new LanguageSelectionPage().verifyNigerianLanguages();
	}

	@Then("^I Verify the languages should be divided into two groups, Available Languages and Coming soon respectively$")
	public void iVerifyLanguageDivisionSections() {

		new LanguageSelectionPage().verifyLanguagesDivisionSectionOfNigerianLaguage();
		new LanguageSelectionPage().verifyLanguagesDivisionSectionOfIndianLaguage();
	}

	@Then("^I Verify user should be able to scroll the Languages screen$")
	public void iVerifyUserIsAbleToScrollDownToSeeLastLanguage() {

		new LanguageSelectionPage().scrollDownOnLanguageScreenToCheckIfLastLanguageDisplay();
	}

	@Then("^I Verify by default India should be selected$")
	public void iVerifyByDefaultIndiaIsSelected() throws URISyntaxException, IOException {
		new LanguageSelectionPage().verifyByDefaultIndiaIsSelected();
	}

	@Then("^I Verify user should be able to select only one language at a time$")
	public void iVerifyOnSelectingAnyLanguageItShouldRedirectToLoginScreen() throws InterruptedException {
		new LanguageSelectionPage().swipeUpside();
		new LanguageSelectionPage().clickOnEnglishLanguage();
		Thread.sleep(5000);
		new LoginPage().waitForLoginScreen();
		new LoginPage().clickOnLanguageSelectionButton();
		new LanguageSelectionPage().waitForLanguageScreen();
	}

	@Then("^I Verify on tapping disabled languages or inform me button user is navigated to Enter phone number screen$")
	public void iVerifyDisabledLanguageAndInformMeButton() throws InterruptedException {
		new LanguageSelectionPage().clickOnIndianLanguage();
		new LanguageSelectionPage().scrollDownOnLanguageScreenToCheckIfLastLanguageDisplay();
		new LanguageSelectionPage().clickOnInformMeButtonOfComingSoonLanguage("Oriya");
		new LoginPage().waitForLoginBttnInPopUp();
		//new LanguageSelectionPage().pressBackToNavigateBackToLanguageScreen();
		//new LanguageSelectionPage().clickOnLanguageSectionOfComingSoonLanguage("Oriya");
		//new LoginPage().waitForLoginBttnInPopUp();
		new LanguageSelectionPage().enterMobileNumberInPopUp();
		new LanguageSelectionPage().proceedButtonInPopUp();
		//new LoginPage().clickOnLanguageSelectionButton();
		//new LanguageSelectionPage().waitForLanguageScreen();
	}

	@Then("^I selects English as Language$")
	public void userSelectsEnglishLanguage() throws Throwable {

		new LanguageSelectionPage().clickOnEnglishLanguage();

	}

	@Then("^I Verify Google pop-up")
	public void googlepopup() throws InterruptedException {
			new LanguageSelectionPage().waitForgooglepop();

		}
	}


