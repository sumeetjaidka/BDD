package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrendingKoosPage extends BasePage {

	@FindBy(id = "com.koo.app:id/trending_feed_imageview")
	public WebElement koosIcon;

	@FindBy(id = "com.koo.app:id/btnBack")
	public WebElement backButton;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement kooBackButton;

	@FindBy(id = "com.koo.app:id/layout_close")
	public WebElement userBackButton;

	@FindBy(id = "com.koo.app:id/tvPageTitle")
	public WebElement trendingKoosText;

	@FindBy(id = "com.koo.app:id/btnRefresh")
	public WebElement refreshButton;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public List<WebElement> userName;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public WebElement userTitle;

	@FindBy(id = "com.koo.app:id/koo_using_hashtag_text")
	public WebElement kooCreateButton;

	@FindBy(id = "com.koo.app:id/post_button")
	public WebElement postButton;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement createKooScreenBackButton;

	@FindBy(id = "com.koo.app:id/btn_follow_big")
	public WebElement bigFollowButton;

	@FindBy(id = "com.koo.app:id/follow_status_imageview")
	public WebElement smallFollowButton;

	@FindBy(id = "com.koo.app:id/topic_title_textview")
	public WebElement kooPost;

	@FindBy(id = "com.koo.app:id/toolbar_title")
	public WebElement kooTitle;

	@FindBy(id = "com.koo.app:id/btn_follow_layout")
	public WebElement followingButton;

	@FindBy(id = "android:id/button1")
	public WebElement confirmYesButton;

	public void kooIconDisplayed() throws Exception {
		new SettingsPage().updatePopUp();
		waitForVisibility(koosIcon);
		Assert.assertTrue(isElementPresent(koosIcon));
	}

	public void clickOnTrendingKoosButton() {
		waitForVisibility(koosIcon);
		click(koosIcon);
	}

	public void isBackButtonPresent() {
		waitForVisibility(backButton);
		Assert.assertTrue(isElementPresent(backButton));
	}

	public void isTrendingKoosTextPresent() {

		waitForVisibility(trendingKoosText);
		Assert.assertTrue(isElementPresent(trendingKoosText));
	}

	public void isUserOnFeedScreen() throws Exception {

		waitForVisibility(backButton);
		click(backButton);

		new SettingsPage().updatePopUp();
		waitForVisibility(new HomePage().feedTab);
		Assert.assertTrue(isElementPresent(new HomePage().feedTab));
	}

	public void verifyRefreshButtonPrescence() throws Exception {
		new SettingsPage().updatePopUp();
		waitForVisibility(koosIcon);
		click(koosIcon);
		waitForVisibility(refreshButton);
		Assert.assertTrue(isElementPresent(refreshButton));
	}

	public void refreshButtonClick() {
		Assert.assertTrue(isElementPresent(refreshButton));

		waitForVisibility(refreshButton);
		click(refreshButton);
	}

//	public void scrollAndRefresh() throws InterruptedException {
//		click(refreshButton);
//		String name = userName.get(0).getText();
//		System.out.println("List of name: -----------------------" +name);
//		swipeFromUpToBottom();
//		click(refreshButton);
//		String nameXpath = "//android.widget.TextView[@text='" +name+"']";
//		
//		String sameName = getDynamicVariable(nameXpath).getText();
//		System.out.println("List of name: -----------------------" +sameName);
//		Thread.sleep(5000);
//		Assert.assertEquals(name, sameName);
//	}

	public void kooCreationButtonPrescence() {
		waitForVisibility(kooCreateButton);

	}

	public void kooCreateScreen() {
		click(kooCreateButton);
		waitForVisibility(postButton);
		Assert.assertTrue(isElementPresent(postButton));
	}

	public void bigFollowButton() throws InterruptedException {
		waitForVisibility(createKooScreenBackButton);
		click(createKooScreenBackButton);
		Thread.sleep(2000);
		swipeToDownsideTillElementPresent(bigFollowButton, 10);
		Assert.assertTrue(isElementPresent(bigFollowButton));
	}

	public void navigateToKooDetailScreen() {
		swipeToSeeUpsideElementsOfScreen(1);
		waitForVisibility(kooPost);
		click(kooPost);
		waitForVisibility(kooTitle);
		Assert.assertTrue(isElementPresent(kooTitle));
	}

	public void bigFollowButtonUser() throws Exception {
		waitForVisibility(kooBackButton);
		click(kooBackButton);

		Thread.sleep(2000);
		swipeToDownsideTillElementPresent(bigFollowButton, 10);
		waitForVisibility(bigFollowButton);
		click(bigFollowButton);
		Thread.sleep(2000);
//		swipeToSeeUpsideElementsOfScreen(1);
//		Thread.sleep(5000);
		swipeToUpsideTillElementPresent(userTitle, 10);
		click(userTitle);

		waitForVisibility(followingButton);
		Assert.assertTrue(isElementPresent(followingButton));

		click(followingButton);
		waitForVisibility(confirmYesButton);
		click(confirmYesButton);

		waitForVisibility(userBackButton);
		click(userBackButton);

	}

	public void smallFollowButton() throws Exception {

		swipeToUpsideTillElementPresent(smallFollowButton, 10);
		Thread.sleep(3000);
		click(smallFollowButton);

		click(userTitle);

		waitForVisibility(followingButton);
		Assert.assertTrue(isElementPresent(followingButton));

		click(followingButton);

		waitForVisibility(confirmYesButton);
		click(confirmYesButton);

	}

}
