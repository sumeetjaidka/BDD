package com.qa.stepdef;

import com.qa.pages.EditProfilePage;
import com.qa.pages.LoginPage;
import com.qa.pages.MultiAccountPage;
import com.qa.pages.ProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MultiAccountStepDef {
	@Then("^I Verify tapping on user stats icon user should go to user screen.")
	public void IVerifyTappingUserStatsIconAndVerifyStatsScreen() throws InterruptedException {
		new MultiAccountPage().IVerifyTappingUserStatsIconAndVerifyStatsScreen();
	}

	@Then("^I Verify user should be on settings screen and there should be add account button.")
	public void IVerifyUserShouldBeOnSettingsScreenAndThereShouldBeAddAccountButton() throws InterruptedException {
		new MultiAccountPage().IVerifyUserShouldBeOnSettingsScreenAndThereShouldBeAddAccountButton();
	}

	@Then("^I Verify on tapping add account button user should navigate to enter phone number screen.")
	public void IVerifyOnTappingAddAccountButtonUserShouldNavigateToEnterPhoneNumberScreen()
			throws InterruptedException {
		new MultiAccountPage().IVerifyOnTappingAddAccountButtonUserShouldNavigateToEnterPhoneNumberScreen();
	}

	@Then("^I Verify tapping on user stats icon to add two more account.")
	public void IVerifyTappingOnUserStatsIconToAddTwoMoreAccount() throws InterruptedException {
		new MultiAccountPage().IVerifyTappingOnUserStatsIconToAddTwoMoreAccount();
	}

	@Then("^I Verify by Swappimg between the user.")
	public void IVerifyBySwappingBetweenTheUser() throws Exception {
		new MultiAccountPage().IVerifyBySwappingBetweenTheUser();
	}

	@Then("^I Verify user is able to logout from child account from settings screen.")
	public void IVerifyByLoggingOutFromChildAccount() throws Exception {
		new MultiAccountPage().IVerifyByLoggingOutFromChildAccount();
	}

	@Then("^I Verify user should not be able to add same account twice.")
	public void VerifyUserShouldNotBeAbleToAddSameAccountTwice() throws Exception {
		new MultiAccountPage().VerifyUserShouldNotBeAbleToAddSameAccountTwice();
	}

	@Then("^I Verify user should not be able to add same mobile number \"([^\"]*)\" twice and get alert message.")
	public void IVerifyForAlertMessage(String mobnumber) throws InterruptedException {
		new LoginPage().enterTestMobileNumber(mobnumber);
		new MultiAccountPage().IVerifyForAlertMessage();
	}

}