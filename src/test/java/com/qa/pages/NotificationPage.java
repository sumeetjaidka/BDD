package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utils.TestUtils;

public class NotificationPage extends BasePage {
	TestUtils utils = new TestUtils();

	@FindBy(id = "com.koo.app:id/iv_notification")
	public WebElement notificationIcon;

	@FindBy(id = "com.koo.app:id/toolbar_profile")
	public WebElement HomeMainScreen;

	@FindBy(id = "com.koo.app:id/notification_preferences")
	public WebElement notificationSettng;

	@FindBy(xpath = "//android.widget.TextView[@text='Notification Preferences']")
	public WebElement notificationSettingPage;

	@FindBy(xpath = "//android.widget.TextView[@text='MY KOOS - REACTIONS ON MY KOOS']")
	public WebElement section1;

	@FindBy(xpath = "//android.widget.TextView[@text='KOOS FROM PEOPLE I FOLLOW']")
	public WebElement section2;

	@FindBy(xpath = "//android.widget.TextView[@text='DAILY STATS']")
	public WebElement section3;

	@FindBy(xpath = "//android.widget.TextView[@text='TRENDING KOOS']")
	public WebElement section4;

	@FindBy(xpath = "//android.widget.TextView[@text='TRENDING NEWS']")
	public WebElement section5;

	@FindBy(xpath = "//android.widget.TextView[@text='MENTION KOO']")
	public WebElement section6;

	@FindBy(xpath = "//android.widget.TextView[@text='NEW FOLLOWERS']")
	public WebElement section7;

	@FindBy(xpath = "//android.widget.TextView[@text='DIRECT MESSAGE']")
	public WebElement section8;

	@FindBy(xpath = "//android.widget.TextView[@text='PEOPLE RECOMMENDATIONS']")
	public WebElement section9;

	@FindBy(xpath = "//android.widget.TextView[@text='TRENDING CONTENT RECOMMENDATIONS']")
	public WebElement section10;

	@FindBy(xpath = "//android.widget.TextView[@text='ACTIVITIES FROM PEOPLE I FOLLOW']")
	public WebElement section11;

	@FindBy(xpath = "//android.widget.TextView[@text='ACTIVITIES FROM PEOPLE I FOLLOW']")
	public WebElement section12;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section1ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section2ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section3ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section4ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section5ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section6ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section7ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section8ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section9ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section10ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section11ShowButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='3']/android.widget.Switch[@index='2']")
	public WebElement section12ShowButton;

	@FindBy(id = "com.koo.app:id/circular_fab")
	public WebElement createKooFAB_Button;

	@FindBy(id = "com.koo.app:id/post_text_view")
	public WebElement CreatePollField;

	@FindBy(id = "com.koo.app:id/post_button")
	public WebElement PollPostButton;

	@FindBy(id = "com.koo.app:id/fl_settings")
	public WebElement setting;

	@FindBy(id = "com.koo.app:id/clProfile")
	public WebElement Profileicon;

	@FindBy(id = "com.koo.app:id/toolbar_heading_textview")
	public WebElement ProfileNameHeading;

	@FindBy(id = "android:id/message")
	public WebElement ConfirmationMessage;

	@FindBy(id = "android:id/button1")
	public WebElement YesConfirmationButton;

	@FindBy(id = "com.koo.app:id/otp_edit_text")
	public WebElement txtFieldMobileOTP;

	@FindBy(id = "com.koo.app:id/button_verify")
	public WebElement bttn_Verify;

	public NotificationPage() {

	}

	public void IVerifyByTappingOnNotificationMenuNotificationPageShouldBeDisplayed() throws InterruptedException {
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		swipeToSeeUpsideElementsOfScreen(2);
		waitForVisibility(notificationIcon);
		Assert.assertTrue(isElementPresent(notificationIcon));
		click(notificationIcon);
		waitForVisibility(notificationSettng);
		Assert.assertTrue(isElementPresent(notificationSettng));
		click(notificationSettng);
		waitForVisibility(notificationSettingPage);
		Assert.assertTrue(isElementPresent(notificationSettingPage));

	}

	public void IVerifyNotificationScreenShouldConsitsOfSection() throws Exception {
		scrollToElement(section1, "up");
		waitForVisibility(section1);
		Assert.assertTrue(isElementPresent(section1));
		scrollToElement(section2, "up");
		Assert.assertTrue(isElementPresent(section2));
		scrollToElement(section3, "up");
		Assert.assertTrue(isElementPresent(section3));
		scrollToElement(section4, "up");
		Assert.assertTrue(isElementPresent(section4));
		scrollToElement(section5, "up");
		Assert.assertTrue(isElementPresent(section5));
		scrollToElement(section6, "up");
		Assert.assertTrue(isElementPresent(section6));
		scrollToElement(section7, "up");
		Assert.assertTrue(isElementPresent(section7));
		scrollToElement(section8, "up");
		Assert.assertTrue(isElementPresent(section8));
		scrollToElement(section9, "up");
		Assert.assertTrue(isElementPresent(section9));
		scrollToElement(section10, "up");
		Assert.assertTrue(isElementPresent(section10));
		scrollToElement(section11, "up");
		Assert.assertTrue(isElementPresent(section11));
		scrollToElement(section12, "up");
		Assert.assertTrue(isElementPresent(section12));

	}

	public void IVerifyWhenShowIsEnabledUserShouldRecieveAllOfTheKoosInNotifications() throws Exception {
		swipeToSeeUpsideElementsOfScreen(7);
		scrollToElement(section1, "up");
		Assert.assertTrue(isElementPresent(section1));
		Assert.assertTrue(isElementPresent(section1ShowButton));
		if (section1ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section1ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section1ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section2, "up");
		Assert.assertTrue(isElementPresent(section2));
		Assert.assertTrue(isElementPresent(section2ShowButton));
		if (section2ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section2ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section2ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section4, "up");
		Assert.assertTrue(isElementPresent(section3));
		Assert.assertTrue(isElementPresent(section3ShowButton));
		if (section3ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section3ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section3ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section5, "up");
		Assert.assertTrue(isElementPresent(section4));
		Assert.assertTrue(isElementPresent(section4ShowButton));
		if (section4ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section4ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section4ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section6, "up");
		Assert.assertTrue(isElementPresent(section5));
		Assert.assertTrue(isElementPresent(section5ShowButton));
		if (section5ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section5ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section5ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section7, "up");
		Assert.assertTrue(isElementPresent(section6));
		Assert.assertTrue(isElementPresent(section6ShowButton));
		if (section6ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section6ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section6ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section8, "up");
		Assert.assertTrue(isElementPresent(section7));
		Assert.assertTrue(isElementPresent(section7ShowButton));
		if (section7ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section7ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section7ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section9, "up");
		Assert.assertTrue(isElementPresent(section8));
		Assert.assertTrue(isElementPresent(section8ShowButton));
		if (section8ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section8ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section8ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section10, "up");
		Assert.assertTrue(isElementPresent(section9));
		Assert.assertTrue(isElementPresent(section9ShowButton));
		if (section9ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section9ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section9ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section10, "up");
		Assert.assertTrue(isElementPresent(section10));
		Assert.assertTrue(isElementPresent(section10ShowButton));
		if (section10ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section10ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section10ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section12, "up");
		Assert.assertTrue(isElementPresent(section11));
		Assert.assertTrue(isElementPresent(section11ShowButton));
		if (section11ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section11ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section11ShowButton.getText().equalsIgnoreCase("ON"));
		}
		scrollToElement(section12, "up");
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(section12));
		Assert.assertTrue(isElementPresent(section12ShowButton));
		if (section12ShowButton.getText().equalsIgnoreCase("OFF")) {
			click(section12ShowButton);
			Thread.sleep(1000);
			Assert.assertTrue(section12ShowButton.getText().equalsIgnoreCase("ON"));
		}
		clickAndroidDeviceBackBttn();
	}

	public void ILogoutToLoginWithAnotherAccountToCreateNotification() throws InterruptedException {
		click(Profileicon);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(setting));
		new ProfilePage().IVerifyByLoggingOut();
//		 new LoginPage().clickOnSignInWithEmail();

	}

	public void ICreateNotificationForTupdoer5() throws InterruptedException {
		waitForVisibility(createKooFAB_Button);
		Assert.assertTrue(isElementPresent(createKooFAB_Button));
		click(createKooFAB_Button);
		sendKeys(CreatePollField, "@adam.1234 how are you");
		//CreatePollField.sendKeys("@adam.1234 how are you");
//		CreatePollField.sendKeys("@parentone how are you");
		click(PollPostButton);
		Thread.sleep(2000);

	}

	public void IVerifyWhenShowIsDisabledUserShouldNotRecieveAllOfTheKoosInNotifications() throws Exception {
		//swipeToSeeUpsideElementsOfScreen(7);
		//scrollToElement(section1, "up");
		for(int i=1; i<=40;i++) {
			swipeToSeeUpsideElementsOfScreen(1);
			Thread.sleep(500);
			if(isElementPresent(section1)) {
				break;
			}
		}
		
		Assert.assertTrue(isElementPresent(section1));
		Assert.assertTrue(isElementPresent(section1ShowButton));
		if (section1ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section1ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			waitForVisibility(section1ShowButton);
			Assert.assertTrue(section1ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section2, "up");
		Assert.assertTrue(isElementPresent(section2));
		Assert.assertTrue(isElementPresent(section2ShowButton));
		if (section2ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section2ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			waitForVisibility(section2ShowButton);
			Assert.assertTrue(section2ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section4, "up");
		Assert.assertTrue(isElementPresent(section3));
		Assert.assertTrue(isElementPresent(section3ShowButton));
		if (section3ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section3ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section3ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section5, "up");
		Assert.assertTrue(isElementPresent(section4));
		Assert.assertTrue(isElementPresent(section4ShowButton));
		if (section4ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section4ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section4ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section6, "up");
		Assert.assertTrue(isElementPresent(section5));
		Assert.assertTrue(isElementPresent(section5ShowButton));
		if (section5ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section5ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section5ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section7, "up");
		Assert.assertTrue(isElementPresent(section6));
		Assert.assertTrue(isElementPresent(section6ShowButton));
		if (section6ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section6ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section6ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section8, "up");
		Assert.assertTrue(isElementPresent(section7));
		Assert.assertTrue(isElementPresent(section7ShowButton));
		if (section7ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section7ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section7ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section9, "up");
		Assert.assertTrue(isElementPresent(section8));
		Assert.assertTrue(isElementPresent(section8ShowButton));
		if (section8ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section8ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section8ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section10, "up");
		Assert.assertTrue(isElementPresent(section9));
		Assert.assertTrue(isElementPresent(section9ShowButton));
		if (section9ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section9ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section9ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section10, "up");
		Assert.assertTrue(isElementPresent(section10));
		Assert.assertTrue(isElementPresent(section10ShowButton));
		if (section10ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section10ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section10ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section12, "up");
		Assert.assertTrue(isElementPresent(section11));
		Assert.assertTrue(isElementPresent(section11ShowButton));
		if (section11ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section11ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Assert.assertTrue(section11ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		scrollToElement(section12, "up");
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(section12));
		Assert.assertTrue(isElementPresent(section12ShowButton));
		if (section12ShowButton.getText().equalsIgnoreCase("ON")) {
			click(section12ShowButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			waitForVisibility(section12ShowButton);
			Assert.assertTrue(section12ShowButton.getText().equalsIgnoreCase("OFF"));
		}
		clickAndroidDeviceBackBttn();
	}

	public void ICreateNotification2ForTupdoer5() throws InterruptedException {
		waitForVisibility(createKooFAB_Button);
		Assert.assertTrue(isElementPresent(createKooFAB_Button));
		click(createKooFAB_Button);
		sendKeys(CreatePollField, "@parentone how Do you Do is every thing allright ");
		click(PollPostButton);
		Thread.sleep(2000);

	}

}
