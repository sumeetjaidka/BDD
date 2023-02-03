package com.qa.stepdef;

import com.qa.pages.MultiAccountPage;
import com.qa.pages.NotificationPage;

import io.cucumber.java.en.Then;

public class NotificationStepDef {

	@Then("^I Verify By Tapping on notification menu, notification page should be displayed")
	public void IVerifyByTappingOnNotificationMenuNotificationPageShouldBeDisplayed() throws InterruptedException {
		new NotificationPage().IVerifyByTappingOnNotificationMenuNotificationPageShouldBeDisplayed();
	}

	@Then("^I Verify notification screen should consits of section")
	public void IVerifyNotificationScreenShouldConsitsOfSection() throws Exception {
		new NotificationPage().IVerifyNotificationScreenShouldConsitsOfSection();
	}

	@Then("^I Verify when show is enabled user should recieve all of the koos in notifications")
	public void IVerifyWhenShowIsEnabledUserShouldRecieveAllOfTheKoosInNotifications() throws Exception {
		new NotificationPage().IVerifyWhenShowIsEnabledUserShouldRecieveAllOfTheKoosInNotifications();
	}

	@Then("^I logout to login with another account.")
	public void ILogoutToLoginWithAnotherAccountToCreateNotification() throws Exception {
		new NotificationPage().ILogoutToLoginWithAnotherAccountToCreateNotification();
	}

	@Then("^I Create Notification For tupdoer5.")
	public void ICreateNotificationForTupdoer5() throws Exception {
		new NotificationPage().ICreateNotificationForTupdoer5();
	}

	@Then("^I Verify when show is disabled user should not recieve all of the koos in notifications")
	public void IVerifyWhenShowIsDisabledUserShouldNotRecieveAllOfTheKoosInNotifications() throws Exception {
		new NotificationPage().IVerifyWhenShowIsDisabledUserShouldNotRecieveAllOfTheKoosInNotifications();
	}

	@Then("^I Create Notification2 For tupdoer5.")
	public void ICreateNotification2ForTupdoer5() throws Exception {
		new NotificationPage().ICreateNotification2ForTupdoer5();
	}

}
