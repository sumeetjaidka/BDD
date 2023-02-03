package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends BasePage {

	@FindBy(id = "com.koo.app:id/img_my_profile")
	public WebElement profileButton;

	@FindBy(id = "com.koo.app:id/fl_settings")
	public WebElement settingsButton;

	@FindBy(id = "com.koo.app:id/close_button")
	public WebElement shareProfileCloseButton;

	@FindBy(xpath = "//android.widget.TextView[@text='ACCOUNT']")
	public WebElement accountText;

	@FindBy(xpath = "//android.widget.TextView[@text='OTHERS']")
	public WebElement othersText;

	@FindBy(xpath = "//android.widget.TextView[@text='Edit Profile']")
	public WebElement editProfileButton;

	@FindBy(xpath = "//android.widget.ImageButton[@index=0]")
	public WebElement editProfileBackButton;

	@FindBy(id = "com.koo.app:id/layout_close")
	public WebElement backButton;

	// @FindBy(xpath = "//android.widget.TextView[@text='खाता प्रबंधन']")
	@FindBy(id = "com.koo.app:id/toolbar")
	public WebElement khataPrabnadhakText;

	@FindBy(xpath = "//android.view.ViewGroup[@index='0']/android.widget.ImageButton[@index='0']")
	public WebElement langBackButton;

	@FindBy(xpath = "//android.widget.ImageButton[@index=0]")
	public WebElement backButtonSearchPage;

	@FindBy(xpath = "//android.widget.TextView[@text='Language']")
	public WebElement languageButton;

	@FindBy(xpath = "//android.widget.TextView[@text='(Hindi)']")
	public WebElement switchToHindiLang;

	@FindBy(xpath = "//android.widget.TextView[@text='भाषा']")
	public WebElement hindiLanguage;

	@FindBy(xpath = "//android.widget.TextView[@text='(English)']")
	public WebElement switchToEnglishLang;

	@FindBy(xpath = "//android.widget.TextView[@text='फीड']")
	public WebElement feedInHindi;

	@FindBy(xpath = "//android.widget.TextView[@text='Manage Blocked Users']")
	public WebElement blockedUserButton;

	@FindBy(id = "com.koo.app:id/block_button")
	public WebElement blockButton;

	@FindBy(id = "com.koo.app:id/backArrow")
	public WebElement settingBackButton;

	@FindBy(id = "com.koo.app:id/layout_search")
	public WebElement searchButton;

	@FindBy(xpath = "//android.widget.EditText[@text='Search']")
	public WebElement searchBar;

	@FindBy(xpath = "//android.widget.TextView[@text='Tiger Shroff']")
	// @FindBy(id="com.koo.app:id/toolbar_heading_textview")
	public WebElement searchResults;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	public WebElement popUpYes;

	@FindBy(xpath = "//android.widget.TextView[@text='Tiger Shroff']")
	public WebElement blockedUser;

	@FindBy(xpath = "//android.widget.TextView[@text='Unblock']")
	public WebElement unblockButton;

	@FindBy(xpath = "//android.widget.TextView[@text='View Profile']")
	public WebElement viewProfileButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Tiger Shroff']")
	public WebElement userNameViewProfile;

	@FindBy(xpath = "//android.widget.ImageView[@index=1]")
	public WebElement update_PopUp;

	@FindBy(xpath = "//android.widget.ImageView[@index=1]")
	public WebElement rateStarPopUp;

	@FindBy(xpath = "//android.widget.TextView[@text='Add Account']")
	public WebElement addAccountButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Apply for a Verified Account']")
	public WebElement verifiedAccount;

	@FindBy(id = "com.android.chrome:id/close_button")
	public WebElement closeVerifyAccountForm;

	@FindBy(id = "com.koo.app:id/logout_layout")
	public WebElement logOutButton;

	@FindBy(id = "com.koo.app:id/submit_view")
	public WebElement logoutConfirm;

	@FindBy(id = "com.koo.app:id/tvCancel")
	public WebElement cancelConfirm;

	@FindBy(id = "com.koo.app:id/clProfile")
	public WebElement newUser_ProfileButton;

	@FindBy(id = "com.koo.app:id/settings_holder")
	public WebElement newUser_SettingsButton;

	@FindBy(id = "com.koo.app:id/login_button")
	public WebElement againLogIn;

	@FindBy(id = "android:id/button1")
	public WebElement okButton;

	@FindBy(id = "com.koo.app:id/notification_layout")
	public WebElement notificationButton;

	@FindBy(id = "com.koo.app:id/receive_switch")
	public WebElement switchButton;

	@FindBy(id = "com.koo.app:id/sound_switch")
	public WebElement soundButton;

	@FindBy(id = "com.koo.app:id/expand_switch")
	public WebElement pop_upOnScreen;

	@FindBy(id = "com.koo.app:id/tv_category")
	public WebElement labelText;

	@FindBy(xpath = "//android.widget.ImageButton[@index=0]")
	public WebElement notificationBackButton;

	@FindBy(id = "android:id/button1")
	public WebElement yesButton;

	@FindBy(id = "android:id/button2")
	public WebElement cancelButton;

	@FindBy(id = "com.koo.app:id/whatsapp_switch")
	public WebElement whatsAppSwitch;

	@FindBy(id = "com.koo.app:id/feedback_layout")
	public WebElement helpButton;

	@FindBy(id = "com.android.chrome:id/close_button")
	public WebElement closeInstructionsPage;

	@FindBy(id = "com.koo.app:id/compliance_layout")
	public WebElement complianceButton;

	@FindBy(id = "com.koo.app:id/privacy_layout")
	public WebElement privacyButton;

	@FindBy(id = "com.koo.app:id/about_layout")
	public WebElement aboutUsButton;

	@FindBy(id = "com.koo.app:id/terms_layout")
	public WebElement termsAndPolicyButton;

	@FindBy(id = "com.koo.app:id/guidelines_layout")
	public WebElement communityGuidelines;

	@FindBy(id = "com.koo.app:id/delete_account_layout")
	public WebElement deleteAccount;

	@FindBy(id = "com.koo.app:id/cancel_view")
	public WebElement deleteCancel;

	@FindBy(id = "com.koo.app:id/submit_view")
	public WebElement deleteConfirm;

	//made by sumeet
	@FindBy(id = "com.koo.app:id/feedback_imageview")
	public WebElement help;

	@FindBy(id = "com.koo.app:id/img_my_profile")
	public WebElement profileButtonChild;

	public void updatePopUp() throws Exception {
		Thread.sleep(4000);
		if (isElementPresent(update_PopUp)) {
			click(update_PopUp);
			Thread.sleep(2000);
		}

	}

	public void ratingKooPopUp() throws Exception {

		if (isElementPresent(rateStarPopUp)) {
			click(rateStarPopUp);
		}

	}

	public void iClickOnProfileButton() throws Exception {
		updatePopUp();
		waitForVisibility(profileButton);
		click(profileButton);
	}

	public void iVerifyAndClickOnSettingsButton() throws Exception {

		waitForVisibility(settingsButton);
		Assert.assertTrue(isElementPresent(settingsButton));
		click(settingsButton);

	}

	public void iVerifyAccountAndOtherButton() {
		waitForVisibility(accountText);
		Assert.assertTrue(isElementPresent(accountText));

		Assert.assertTrue(isElementPresent(othersText));
	}

	public void clickOnEditProfileButton() throws Exception {
		waitForVisibility(editProfileButton);
		if (isElementPresent(editProfileButton)) {
			click(editProfileButton);
		}
	}

	public void iVerifyLanguageSwitchingViaEditProfileScreen() throws Exception {
		waitForVisibility(editProfileBackButton);
		click(editProfileBackButton);

		waitForVisibility(languageButton);
		click(languageButton);

		waitForVisibility(switchToHindiLang);
		click(switchToHindiLang);

		Thread.sleep(5000);

		updatePopUp();

		waitForVisibility(feedInHindi);
		Assert.assertTrue(isElementPresent(feedInHindi));

	}

	public void verifyBlockList() throws Exception {
		if (isElementPresent(profileButton)) {
			click(profileButton);
			waitForVisibility(settingsButton);
			click(settingsButton);
			updatePopUp();
			Thread.sleep(2000);

			if (isElementPresent(khataPrabnadhakText)) {
				waitForVisibility(langBackButton);
				click(langBackButton);
			}

			waitForVisibility(hindiLanguage);
			click(hindiLanguage);
			updatePopUp();
			waitForVisibility(switchToEnglishLang);
			click(switchToEnglishLang);
			updatePopUp();
			Thread.sleep(5000);

			if (isElementPresent(searchButton)) {
				click(searchButton);
				waitForVisibility(searchBar);
				click(searchBar);
				sendKeys(searchBar, "Tiger Shroff");

				waitForVisibility(searchResults);
				click(searchResults);

				waitForVisibility(blockButton);
				click(blockButton);

				waitForVisibility(popUpYes);
				click(popUpYes);

				waitForVisibility(backButton);

				click(backButton);
				click(backButtonSearchPage);

				updatePopUp();

				waitForVisibility(profileButton);
				if (isElementPresent(profileButton)) {
					click(profileButton);

					waitForVisibility(settingsButton);
					click(settingsButton);

					waitForVisibility(blockedUserButton);
					click(blockedUserButton);
					waitForVisibility(blockedUser);
					Assert.assertTrue(isElementPresent(blockedUser));

					waitForVisibility(unblockButton);
					click(unblockButton);
					waitForVisibility(viewProfileButton);
					click(viewProfileButton);
					Thread.sleep(2000);
					waitForVisibility(searchResults);
					waitForVisibility(backButton);
					click(backButton);
					waitForVisibility(editProfileBackButton);
					click(editProfileBackButton);

				} else
					throw new Exception("Element" + profileButton + "is not present on the screen.");
			}
		}
	}

	public void verifyAccountButton() throws Exception {

		waitForVisibility(verifiedAccount);
		click(verifiedAccount);

		Thread.sleep(5000);

		waitForVisibility(closeVerifyAccountForm);
		click(closeVerifyAccountForm);

	}

	public void tapOnAddAccountButton() throws Exception {

		updatePopUp();
		waitForVisibility(profileButton);
		click(profileButton);
		waitForVisibility(settingsButton);
		Assert.assertTrue(isElementPresent(settingsButton));
		click(settingsButton);
		waitForVisibility(addAccountButton);
		Assert.assertTrue(isElementPresent(addAccountButton));
		click(addAccountButton);
	}

	public void verifyLogOut() throws Exception {

		waitForVisibility(logOutButton);
		Assert.assertTrue(isElementPresent(logOutButton));
		click(logOutButton);

		waitForVisibility(cancelConfirm);
		Assert.assertTrue(isElementPresent(cancelConfirm));
		click(cancelConfirm);
//		System.out.println("Clicked on" + cancelConfirm + "Button");

		Thread.sleep(5000);

		waitForVisibility(logOutButton);
		Assert.assertTrue(isElementPresent(logOutButton));
		click(logOutButton);
//		System.out.println("Clicked on"+ logOutButton + " Button");

		waitForVisibility(logoutConfirm);
		Assert.assertTrue(isElementPresent(logoutConfirm));
		click(logoutConfirm);
//		System.out.println("Clicked on" + logoutConfirm + "Button");
	}

	public void verifyDeletionProfileFunctionality() throws Exception {
		Thread.sleep(5000);
		// updatePopUp();

		swipeToSeeUpsideElementsOfScreen(1);

		waitForVisibility(deleteAccount);
		click(deleteAccount);

		waitForVisibility(deleteCancel);
		Assert.assertTrue(isElementPresent(deleteCancel));
		click(deleteCancel);

		Thread.sleep(4000);

		waitForVisibility(deleteAccount);
		click(deleteAccount);
		waitForVisibility(deleteConfirm);
		Assert.assertTrue(isElementPresent(deleteConfirm));

		Assert.assertTrue(isElementPresent(deleteCancel));
		click(deleteCancel);
	}

	public void logInAgain() throws Exception {
		try {
			if (isElementPresent(againLogIn)) {
				click(againLogIn);
			} else {
				Thread.sleep(5000);
				if (isElementPresent(againLogIn)) {

					click(againLogIn);

					Thread.sleep(5000);

					waitForVisibility(okButton);
					click(okButton);

				} else {
					throw new Exception("Element" + againLogIn + "is not visible.");
				}
			}
		} catch (Exception e) {
			e.getCause();
		}
	}

	public void clickNotificationButton() throws Exception {

//		
//		
//		Assert.assertTrue(isElementPresent(labelText));
//		
////		Assert.assertTrue(isElementPresent(section1ShowButton));
//		if(switchButton.getText().equalsIgnoreCase("ON"))
//		{
//			click(switchButton);
////			Assert.assertTrue(isElementPresent(ConfirmationMessage));
//			waitForVisibility(yesButton);
//			click(yesButton);
//			Assert.assertTrue(switchButton.getText().equalsIgnoreCase("OFF"));
//		}
////		scrollToElement(section2, "up");
////		Assert.assertTrue(isElementPresent(section2));
//		Assert.assertTrue(isElementPresent(soundButton));
//		if(soundButton.getText().equalsIgnoreCase("ON"))
//		{
//			click(soundButton);
////			Assert.assertTrue(isElementPresent(ConfirmationMessage));
//			Assert.assertTrue(isElementPresent(yesButton));
//			click(yesButton);
//			Assert.assertTrue(soundButton.getText().equalsIgnoreCase("OFF"));
//		}
////		scrollToElement(section4, "up");
////		Assert.assertTrue(isElementPresent(section3));
//		Assert.assertTrue(isElementPresent(pop_upOnScreen));
//		if(pop_upOnScreen.getText().equalsIgnoreCase("ON"))
//		{
//			click(pop_upOnScreen);
////			Assert.assertTrue(isElementPresent(ConfirmationMessage));
//			Assert.assertTrue(isElementPresent(yesButton));
//			click(yesButton);
//			Assert.assertTrue(pop_upOnScreen.getText().equalsIgnoreCase("OFF"));
//		}
//		
//		if(switchButton.isEnabled()) {
//			click(switchButton);
//			waitForVisibility(yesButton);
//			click(yesButton);
//		}
//		
//		if(soundButton.isEnabled()) {
//			
//			click(soundButton);
//			waitForVisibility(yesButton);
//			click(yesButton);
//		}
//		else if(isElementPresent(soundButton)) {
//			click(soundButton);
//		}
//		
//		if(pop_upOnScreen.isEnabled()) {
//			click(pop_upOnScreen);
//			waitForVisibility(yesButton);
//			click(yesButton);
//		}
//		
//		else if (isElementPresent(pop_upOnScreen)) {
//			click(pop_upOnScreen);
//		}
//		
//
////		if (isElementPresent(switchButton)) {
////			click(switchButton);
////
////			Thread.sleep(2000);
////			Assert.assertTrue(isElementPresent(yesButton));
////			click(yesButton);
////		} else
////			throw new Exception("Element not found.");
////
////		if (isElementPresent(soundButton)) {
////			click(soundButton);
////		} else
////			throw new Exception("Element not found.");
////
////		if (isElementPresent(pop_upOnScreen)) {
////			click(pop_upOnScreen);
////		} else
////			throw new Exception("Element not found.");
	}

	public void verifyWhatsAppToggle() throws Exception {

		waitForVisibility(notificationButton);
		click(notificationButton);

		click(notificationBackButton);
		Thread.sleep(5000);
		swipeToSeeDownsideElementsOfScreen(1);

		if (isElementPresent(whatsAppSwitch)) {
			click(whatsAppSwitch);

			System.out.println(whatsAppSwitch.isSelected());
		}
	}

	public void helpButton() {

		waitForVisibility(helpButton);
		click(helpButton);

		waitForVisibility(closeInstructionsPage);
		click(closeInstructionsPage);
	}

	public void verifyComplianceButton() {
		waitForVisibility(complianceButton);
		click(complianceButton);

		waitForVisibility(closeInstructionsPage);
		click(closeInstructionsPage);
	}

	public void verifyPrivacyPolicies() {
		waitForVisibility(privacyButton);
		click(privacyButton);

		waitForVisibility(closeInstructionsPage);
		click(closeInstructionsPage);
	}

	public void verifyAboutUs() {
		waitForVisibility(aboutUsButton);
		click(aboutUsButton);

		waitForVisibility(closeInstructionsPage);
		click(closeInstructionsPage);
	}

	public void verifyTermsAndPolicy() {
		waitForVisibility(termsAndPolicyButton);
		click(termsAndPolicyButton);

		waitForVisibility(closeInstructionsPage);
		click(closeInstructionsPage);
	}

	public void verifyCommunityGuidelines() {
		waitForVisibility(communityGuidelines);
		click(communityGuidelines);

		waitForVisibility(closeInstructionsPage);
		click(closeInstructionsPage);
	}

//made by sumeet
	public void help() {

		waitForVisibility(help);
		Assert.assertTrue(isElementPresent(help));
		click(help);
	}

	public void VerifyclickonProfilebuttonofchild() throws InterruptedException {

		waitForVisibility(profileButtonChild);
		Assert.assertTrue(isElementPresent(profileButtonChild));
		click(profileButtonChild);
	}
}