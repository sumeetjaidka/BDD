package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utils.EmailHelper;
import com.qa.utils.TestUtils;

public class MultiAccountPage extends BasePage {
	TestUtils utils = new TestUtils();

	@FindBy(id = "com.koo.app:id/fl_settings")
	public WebElement setting;

	@FindBy(id = "android:id/button1")
	public WebElement yesButton;

	@FindBy(id = "com.koo.app:id/tv_add_account")
	public WebElement addAccountButton;

	@FindBy(id = "com.koo.app:id/add_acc_imageview")
	public WebElement addAccountIcon;

	@FindBy(id = "com.koo.app:id/toolbar_profile")
	public WebElement HomeMainScreen;

	@FindBy(id = "com.koo.app:id/clProfile")
	public WebElement Profileicon;

	@FindBy(id = "com.koo.app:id/email_edittext")
	public WebElement txtfield_EnterEmailId;

	@FindBy(id = "com.koo.app:id/email_continue_button")
	public WebElement bttn_Proceed;

	@FindBy(id = "com.koo.app:id/email_otp_editext")
	public WebElement txtfield_EnterOTP;

	@FindBy(id = "com.koo.app:id/toolbar_heading_textview")
	public WebElement ProfileNameHeading;

	@FindBy(id = "com.koo.app:id/expand_profiles")
	public WebElement expandButton;

	@FindBy(id = "com.koo.app:id/tv_add_account")
	public WebElement addAccountButton2;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index='0']/android.widget.RelativeLayout[@index='0']")
	public WebElement user1;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index='0']/android.widget.RelativeLayout[@index='1']")
	public WebElement user2;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index='0']/android.widget.RelativeLayout[@index='2']")
	public WebElement user3;

	@FindBy(id = "com.koo.app:id/profile_holder")
	public WebElement profileButton;

	@FindBy(id = "com.koo.app:id/settings_holder")
	public WebElement settingButton;

	@FindBy(id = "com.koo.app:id/tv_manage_account")
	public WebElement manageAccButton;

	@FindBy(id = "com.koo.app:id/logout_imageview")
	public WebElement logoutTab;

	@FindBy(id = "android:id/message")
	public WebElement alertMessage;

	public MultiAccountPage() {

	}

	public void IVerifyTappingUserStatsIconAndVerifyStatsScreen() throws InterruptedException {
		Thread.sleep(5000);
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		Thread.sleep(4000);
		click(Profileicon);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));

	}

	public void IVerifyUserShouldBeOnSettingsScreenAndThereShouldBeAddAccountButton() throws InterruptedException {
		click(setting);
		Thread.sleep(2000);
		waitForVisibility(addAccountButton);
		Assert.assertTrue(isElementPresent(addAccountButton));
		Assert.assertTrue(isElementPresent(addAccountIcon));

	}

	public void IVerifyOnTappingAddAccountButtonUserShouldNavigateToEnterPhoneNumberScreen()
			throws InterruptedException {
		click(addAccountButton);
		Thread.sleep(2000);

	}

	public void IVerifyTappingOnUserStatsIconToAddTwoMoreAccount() throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		click(Profileicon);
		click(expandButton);
		waitForVisibility(addAccountButton2);
		Assert.assertTrue(isElementPresent(addAccountButton2));
		click(addAccountButton2);

	}

	public void IVerifyBySwappingBetweenTheUser() throws Exception {
		Thread.sleep(2000);
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		click(Profileicon);
		click(expandButton);
		waitForVisibility(user1);
		Assert.assertTrue(isElementPresent(user1));
		Assert.assertTrue(isElementPresent(user2));
		Assert.assertTrue(isElementPresent(user3));
		click(user1);
		// Thread.sleep(7000);
		
		waitForVisibility(HomeMainScreen);
		new SettingsPage().updatePopUp();
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		click(Profileicon);
		click(expandButton);
		waitForVisibility(user1);
		Assert.assertTrue(isElementPresent(user1));
		Assert.assertTrue(isElementPresent(user2));
		Assert.assertTrue(isElementPresent(user3));
		click(user1);
		Thread.sleep(2000);
		new SettingsPage().updatePopUp();
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		click(Profileicon);
		click(expandButton);
		waitForVisibility(user1);
		Assert.assertTrue(isElementPresent(user1));
		Assert.assertTrue(isElementPresent(user2));
		Assert.assertTrue(isElementPresent(user3));
		click(user1);
		Thread.sleep(2000);
		new SettingsPage().updatePopUp();
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		Thread.sleep(4000);
	}

	public void IVerifyByLoggingOutFromChildAccount() throws Exception {
		click(Profileicon);
		click(expandButton);
		click(user1);
		Thread.sleep(2000);
		new SettingsPage().updatePopUp();
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		click(Profileicon);
		waitForVisibility(profileButton);
		Assert.assertTrue(isElementPresent(profileButton));
		Assert.assertTrue(isElementPresent(settingButton));
		click(expandButton);
		Thread.sleep(2000);
		if (!isElementVisible(manageAccButton)) {
			click(expandButton);
			click(settingButton);
			Thread.sleep(2000);
			Assert.assertTrue(isElementPresent(logoutTab));
			click(logoutTab);
			waitForVisibility(HomeMainScreen);
			Assert.assertTrue(isElementPresent(HomeMainScreen));
			click(Profileicon);
		} else {
			click(user2);
			new SettingsPage().updatePopUp();
			waitForVisibility(HomeMainScreen);
			Assert.assertTrue(isElementPresent(HomeMainScreen));
			click(Profileicon);
			waitForVisibility(profileButton);
			Assert.assertTrue(isElementPresent(profileButton));
			Assert.assertTrue(isElementPresent(settingButton));
			click(settingButton);
			Thread.sleep(2000);
			Assert.assertTrue(isElementPresent(logoutTab));
			click(logoutTab);
			waitForVisibility(HomeMainScreen);
			Assert.assertTrue(isElementPresent(HomeMainScreen));
			click(Profileicon);

		}

	}

	public void VerifyUserShouldNotBeAbleToAddSameAccountTwice() throws Exception {
		click(expandButton);
		waitForVisibility(user1);
		Assert.assertTrue(isElementPresent(user1));
		Assert.assertTrue(isElementPresent(user2));
		Assert.assertFalse(!isElementVisible(user3));
		click(user1);
		new SettingsPage().updatePopUp();
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		click(Profileicon);
		click(expandButton);
		click(addAccountButton);
		Thread.sleep(2000);

	}

	public void IVerifyForAlertMessage() throws InterruptedException {
		waitForVisibility(alertMessage);
		Assert.assertTrue(isElementPresent(alertMessage));
		Assert.assertTrue(isElementPresent(yesButton));
		click(yesButton);
		Thread.sleep(500);
		clickAndroidDeviceBackBttn();
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));

	}

}
