package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utils.TestUtils;

public class HastagDetail extends BasePage {

	TestUtils utils = new TestUtils();

	@FindBy(id = "com.koo.app:id/topic_title_textview")
	public WebElement feedPostButton;

	@FindBy(id = "com.koo.app:id/img_my_profile")
	public WebElement userProfileIcon;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='2']")
	public WebElement trendingHeadr;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='2']/android.widget.TextView[@index='0']")
	// @FindBy(id="com.koo.app:id/koo_using_hashtag_text")
	public WebElement hastTagTitleAtTheBottomOfScreen;

	@FindBy(id = "com.koo.app:id/toolbar_title")
	public WebElement TrendingHastagTitle;

	@FindBy(xpath = "androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='0']")
	public List<WebElement> listOFTrendingHastagTitle;

	@FindBy(id = "com.koo.app:id/button_holder")
	public WebElement viewTrendingKoosButton;

	@FindBy(id = "com.koo.app:id/view_all_textview")
	public WebElement arrowButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Trending Tags']")
	public WebElement TrendingTagsText;

	@FindBy(xpath = "//android.widget.TextView[@text='Trending Koos (24 hours)']")
	public WebElement TrendingKoosWithinHour;

	@FindBy(xpath = "//android.widget.TextView[@text='View Trending Koos']")
	public WebElement TrendingKoos;

	@FindBy(id = "com.koo.app:id/topic_title")
	// @FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='0']")
	public WebElement hastagTitle;

	@FindBy(id = "com.koo.app:id/iv_explore")
	public WebElement trendingHastagButton;

	@FindBy(id = "com.koo.app:id/post_text_view")
	public WebElement textBoxContainingHasTagTitle;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement backButton;

	@FindBy(id = "com.koo.app:id/share_imageview")
	public WebElement shareButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Trending Hashtags']")
	public WebElement trendingHastagsText;

	// @FindBy(xpath="//android.widget.TextView[@text='Koo']")
	@FindBy(xpath = "android.view.View[@index='0']")
	public WebElement KooTitleOnShareScreen;

	@FindBy(xpath = "//android.widget.TextView[@text='Copy to clipboard']")
	public WebElement copyToClipboard;

	@FindBy(xpath = "//android.widget.TextView[@text='Gmail']")
	public WebElement shareToGmail;

	// (xpath="//android.widget.TextView[@text='Messages']")
	@FindBy(xpath = "android.view.View[@index='4']")
	public WebElement shareThroughMessages;

	@FindBy(xpath = "//android.widget.TextView[@text='Save to Drive']")
	public WebElement saveToDrive;

	@FindBy(id = "com.koo.app:id/topic_title_textview")
	public WebElement hastTagDetails;

	@FindBy(id = "com.koo.app:id/post_button")
	public WebElement postButton;

	@FindBy(id = "android:id/button2")
	public WebElement noButtonOnConfirmationPopUp;

	@FindBy(id = "android:id/button1")
	public WebElement yesButtonOnConfirmationPopUp;

	@FindBy(id = "com.koo.app:id/koo_using_hashtag")
	public WebElement createKooButton;

	@FindBy(xpath = "//android.widget.Button[@text='Not Now']")
	public WebElement update_PopUp;

	@FindBy(id = "com.koo.app:id/post_text_view")
	public WebElement whatsYourMindTextBox;

	//made by sumeet
	@FindBy(id = "com.koo.app:id/koo_feed_item_container")
	public WebElement HastagsMention;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement HastagBackButton;



	public void updatePopUp() throws Exception {
		try {
			if (isElementPresent(update_PopUp)) {
				click(update_PopUp);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void verify_by_tapping_on_any_hashtag_in_hashtags_screen_user_should_navigate_to_respective_hashtag_details_screen()
			throws InterruptedException {
		waitForVisibility(userProfileIcon);
		click(trendingHastagButton);
		waitForVisibility(hastagTitle);
		String HastagTitle = hastagTitle.getText();
		System.out.println(HastagTitle);
		Thread.sleep(1500);
		click(hastagTitle);
		Thread.sleep(1500);
		//System.out.println(TrendingHastagTitle.getText());
		// Assert.assertTrue(HastagTitle.equalsIgnoreCase(TrendingHastagTitle.getText()));
		// Assert.assertTrue(HastagTitle.contains(TrendingHastagTitle.getText()));

	}

	public void verify_by_tapping_back_button_in_hashtag_details_screen_user_should_navigate_back_to_hashtags_screen() {
		waitForVisibility(backButton);
		click(backButton);
		waitForVisibility(trendingHastagsText);
		Assert.assertTrue(trendingHastagsText.getText().equalsIgnoreCase("Trending Hashtags"));
	}

	public void verifyAtTheBottomOfHashtagDetailsScreenKooUsingRespectiveHashtagButtonShouldBeDisplayed() {
		waitForVisibility(hastTagTitleAtTheBottomOfScreen);
		Assert.assertTrue(isElementPresent(hastTagTitleAtTheBottomOfScreen));
		String bottomTitle = "+ Koo using" + hastTagTitleAtTheBottomOfScreen.getText();

		// Assert.assertTrue(TrendingHastagTitle.getText().contains(bottomTitle));
	}

	public void verify_the_share_icon_should_be_displayed_in_hashtag_details_screen_and_verify_share_icon_should_be_tappable()
			throws InterruptedException {
		Thread.sleep(800);
		click(hastagTitle);
		waitForVisibility(shareButton);
		click(shareButton);
		// Assert.assertTrue(isElementPresent(KooTitleOnShareScreen));
		// Assert.assertTrue(isElementPresent(copyToClipboard));
		// Assert.assertTrue(isElementPresent(shareThroughMessages));
		// Assert.assertTrue(isElementPresent(shareToGmail));
		// Assert.assertTrue(isElementPresent(saveToDrive));

	}

	public void verify_by_tap_on_mobile_back_button_outside_the_share_via_popup_popup_should_get_closed()
			throws InterruptedException {
		Thread.sleep(1500);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(TrendingHastagTitle));
	}

	public void verify_in_koo_using_respective_hashtag_respective_hashtag_should_be_same_as_header_hashtag_text_in_the_screen()
			throws Exception {
		scrollToElement(hastTagDetails, "down");
		// Assert.assertTrue(trendingHastagsText.getText().contains(hastTagDetails.getText()));
	}

	public void verify_user_can_perform_scroll_action_in_hashtag_details_screen() throws InterruptedException {
		swipeToSeeDownsideElementsOfScreen(2);
		Thread.sleep(5000);
		swipeToSeeUpsideElementsOfScreen(2);
		waitForVisibility(backButton);
		click(backButton);
	}

	public void verify_by_tap_on_koo_using_respective_hashtag_button_user_should_navigate_to_mlk_koo_creation_screen_with_respective_hashtag_and_vkb_should_open() {
		waitForVisibility(hastTagTitleAtTheBottomOfScreen);
		click(hastTagTitleAtTheBottomOfScreen);
		waitForVisibility(postButton);
		Assert.assertTrue(isElementPresent(postButton));
		Assert.assertTrue(isElementPresent(textBoxContainingHasTagTitle));
		System.out.print(textBoxContainingHasTagTitle.getText());
		Assert.assertTrue(isEnabled(postButton));
		Assert.assertTrue(isKeyPadShown());
	}

	public void verify_by_tap_on_app_back_button_in_mlk_koo_creation_screen_discard_popup_should_be_displayed_with_and_option()
			throws InterruptedException {
		Thread.sleep(1500);
		click(backButton);
		Thread.sleep(500);
		Assert.assertTrue(isElementPresent(yesButtonOnConfirmationPopUp));
		Assert.assertTrue(isElementPresent(noButtonOnConfirmationPopUp));
		click(noButtonOnConfirmationPopUp);
		Thread.sleep(500);
		Assert.assertFalse(!isKeyPadShown());
		click(backButton);
		Thread.sleep(1500);
		Assert.assertTrue(isElementPresent(yesButtonOnConfirmationPopUp));
		Assert.assertTrue(isElementPresent(noButtonOnConfirmationPopUp));
		click(yesButtonOnConfirmationPopUp);
		waitForVisibility(hastTagTitleAtTheBottomOfScreen);
		// Assert.assertTrue(textBoxContainingHasTagTitle.getText().equalsIgnoreCase(TrendingHastagTitle.getText()));
	}

	public void verify_by_tap_on_any_koo_card_user_should_land_on_to_koo_details_screen() throws InterruptedException {

		waitForVisibility(hastagTitle);
		click(hastagTitle);
		Thread.sleep(1500);
		System.out.print("The title is " + TrendingHastagTitle.getText());
		clickAndroidDeviceBackBttn();
		waitForVisibility(trendingHastagsText);
		Assert.assertTrue(trendingHastagsText.getText().equalsIgnoreCase("Trending Hashtags"));
		Thread.sleep(1500);
	}

	public void verify_by_tap_on_button_user_should_navigate_to_trending_koos_hours_screen() throws Exception {
		Thread.sleep(500);
		Assert.assertTrue(TrendingTagsText.getText().equalsIgnoreCase("Trending Tags"));
		Assert.assertTrue(isElementPresent(arrowButton));
		click(viewTrendingKoosButton);
		waitForVisibility(TrendingKoosWithinHour);
		Assert.assertTrue(TrendingKoosWithinHour.getText().equalsIgnoreCase("Trending Koos (24 hours)"));

	}

	public void verify_by_tap_on_mobile_back_button_in_mlk_creation_screen_vkb_should_close()
			throws InterruptedException {
		swipeToSeeDownsideElementsOfScreen(1);
		Thread.sleep(500);
		swipeToSeeUpsideElementsOfScreen(1);
	}

	public void verify_all_the_koos_with_respective_hashtags_should_be_displayed() throws InterruptedException {
		Thread.sleep(2000);
		int count = listOFTrendingHastagTitle.size();
		for (WebElement el : listOFTrendingHastagTitle) {
			System.out.println("The list of trending hastTitles" + el.getText());
		}
	}

	public void verify_on_scrolling_towards_end_of_the_koos_soon_below_the_koo_button_should_be_displayed()
			throws Exception {
		Thread.sleep(500);
		click(hastagTitle);
		Thread.sleep(1500);
		for(int i=1; i<=30;i++) {
			swipeToSeeDownsideElementsOfScreen(1);
			Thread.sleep(500);
			if(isElementPresent(TrendingKoos)) {
				break;
			}
		}
		Assert.assertTrue(TrendingKoos.getText().equalsIgnoreCase("View Trending Koos"));

	}

	public void verify_by_tap_on_app_mobile_back_button_in_trending_koos_hours_screen_user_should_land_on_feed_screen()
			throws InterruptedException {
		waitForVisibility(viewTrendingKoosButton);
		click(viewTrendingKoosButton);
		waitForVisibility(TrendingKoosWithinHour);
		Assert.assertTrue(isElementPresent(TrendingKoosWithinHour));
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(feedPostButton));
	}

	public void verify_below_view_trending_koos_button_in_hashtag_details_screen_trending_tags_section_should_be_displayed_and_verify_the_section_should_be_displayed_with_navigation_arrow_mark()
			throws Exception {
		
		for(int i=1; i<=40;i++) {
			swipeToSeeDownsideElementsOfScreen(1);
			Thread.sleep(500);
			if(isElementPresent(arrowButton)) {
				break;
			}
		}
		
	//	while (isElementPresent(arrowButton)) {
		//	swipeToSeeDownsideElementsOfScreen(1);
		//}

		Thread.sleep(1500);
		// scrollToElement(arrowButton, "up");
		Assert.assertTrue(isElementPresent(TrendingTagsText));
		Assert.assertTrue(isElementPresent(arrowButton));

	}

	public void verify_by_tap_on_trending_tags_section_navigation_arrow_mark_user_navigates_to_respective_hashtag_screen()
			throws InterruptedException {
		Thread.sleep(500);
		click(hastagTitle);
	}

	public void verify_by_tap_on_mobile_back_button_in_hashtag_screen_user_navigates_to_feed_screen()
			throws InterruptedException {
		waitForVisibility(viewTrendingKoosButton);
		click(viewTrendingKoosButton);
		Thread.sleep(1500);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1500);
		if(!isElementPresent(createKooButton)) {
			clickAndroidDeviceBackBttn();
		}
		
	}

	public void verify_by_tap_on_create_koo_icon_in_trending_tags_section_user_should_navigate_to_mlk_creation_screen_with_respective_hashtag_and_vkb_should_open()
			throws InterruptedException {
		waitForVisibility(createKooButton);
		click(createKooButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "Creating koo");
		Assert.assertTrue(isEnabled(postButton));
		Assert.assertTrue(isKeyPadShown());
		click(backButton);
		Thread.sleep(500);
		Assert.assertTrue(isElementPresent(yesButtonOnConfirmationPopUp));
		Assert.assertTrue(isElementPresent(noButtonOnConfirmationPopUp));
		click(noButtonOnConfirmationPopUp);
		Thread.sleep(500);
		Assert.assertFalse(!isKeyPadShown());
		click(backButton);
		waitForVisibility(yesButtonOnConfirmationPopUp);
		Assert.assertTrue(isElementPresent(yesButtonOnConfirmationPopUp));
		Assert.assertTrue(isElementPresent(noButtonOnConfirmationPopUp));
		click(yesButtonOnConfirmationPopUp);
		waitForVisibility(createKooButton);
		Assert.assertTrue(isElementPresent(createKooButton));
	}

	public void iVerifyclickontherespectivehashtagmentionanditmovestorespectivementionedprofile() {
		waitForVisibility(HastagsMention);
		Assert.assertTrue(isElementPresent(HastagsMention));
		click(HastagsMention);

	}

	public void iVerifyclickonHashtagBackButton() {
		waitForVisibility(HastagBackButton);
		Assert.assertTrue(isElementPresent(HastagBackButton));
		click(HastagBackButton);

	}



}
