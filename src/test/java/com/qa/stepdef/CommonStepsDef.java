package com.qa.stepdef;

import com.qa.pages.LanguageSelectionPage;
import com.qa.pages.LoginPage;
import com.qa.pages.Search;
import com.qa.pages.SettingsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommonStepsDef {

	@Then("^I select English Language as App language$")
	public void selectEngilshLanguage() throws InterruptedException {
		new LanguageSelectionPage().waitForLanguageScreen();
		new LanguageSelectionPage().clickOnEnglishLanguage();
	}

	@Then("^I check if first install help menu is available$")
	public void checkFirstInstallHelpMenuAndDismiss() throws InterruptedException {
		new LoginPage().firstInstallOptions();
	}

	@Then("^I am logged in into Koo App using country code \"([^\"]*)\" and Mobile number \"([^\"]*)\"$")
	public void logInUsingMobileNumber(String countrycode, String mobnumber) throws Exception {
		new LoginPage().waitForLoginScreen();
		new LoginPage().enterMobileNumber(countrycode, mobnumber);
//    	new LoginPage().enterReceivedOTPFromMobile();
	}

	@Then("^I am logged in to Koo App using test account with mobile number \"([^\"]*)\"$")
	public void logInUsingTestMobileNumber(String mobnumber) throws InterruptedException {
		new LoginPage().waitForLoginScreen();
		new LoginPage().enterTestMobileNumber(mobnumber);
		new LoginPage().enterTestOTPFromMobile();
		new Search().iverifyUserIsRegistered();
	}

	@Then("^I am logged in to Koo App using country code \"([^\"]*)\" and test account with mobile number \"([^\"]*)\"$")
	public void logInUsingTestMobileNumberAndCountryCode(String countryName,String mobnumber) throws Exception {
		new LoginPage().waitForLoginScreen();
		new LoginPage().selectCountryCodeOption(countryName);
		new LoginPage().enterTestMobileNumber(mobnumber);
		new LoginPage().enterTestOTPFromMobile();
		new Search().iverifyUserIsRegistered();
	}

}
