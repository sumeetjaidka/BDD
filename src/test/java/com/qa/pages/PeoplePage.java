package com.qa.pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Enums;
import com.qa.pages.Filters.DiscoverProfession;
import com.qa.utils.TestUtils;

public class PeoplePage extends BasePage {
	TestUtils utils = new TestUtils();

	@FindBy(xpath = "//android.widget.TextView[@text='People']")
	public WebElement peopleTab;


	@FindBy(xpath = "//android.widget.TextView[@text='Feed']")
	public WebElement feedTab;

	@FindBy(id = "com.koo.app:id/top_user_title")
	public WebElement discoverReleventPeopleHeadr;

	@FindBy(id = "com.koo.app:id/super_expert_item_layout")
	public WebElement profileTab;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public WebElement peopleName;

	@FindBy(xpath = "//android.widget.TextView[@index='0']")
	public WebElement peopleYouCanFollowbttn;

	@FindBy(id = "com.koo.app:id/title")
	public List<WebElement> discoverProfession;

	@FindBy(id = "com.koo.app:id/tv_search_for_profession")
	public WebElement searchForProfessionSearchBox;

	@FindBy(id = "com.koo.app:id/toolbar_title")
	public WebElement professionCategoryHeader;

	@FindBy(id = "com.koo.app:id/single_line_edit")
	public WebElement searchBoxProfessionCategory;

	@FindBy(id = "com.koo.app:id/single_line_edit")
	public WebElement typeOfSearchText;

	@FindBy(id = "com.koo.app:id/single_line_edit")
	public WebElement typeOfSearchWaterMark;

	@FindBy(id = "com.koo.app:id/tv_profession")
	public WebElement searchedResult;

	@FindBy(id = "com.koo.app:id/tv_profession")
	public List<WebElement> listofProfession;

	@FindBy(id = "com.koo.app:id/tv_profession")
	public WebElement specalizedProfession;

	@FindBy(id = "com.koo.app:id/container")
	public List<WebElement> speclaizedListofProfessionl;

	@FindBy(id = "com.koo.app:id/container")
	public WebElement specalizedProfessionlName;

	@FindBy(xpath = "//android.widget.ImageButton[@index='0']")
	public WebElement backButton;

	@FindBy(id = "com.koo.app:id/layout_close")
	public WebElement backButtonForSpecalizedUserprofile;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']")
	public WebElement noResultFoundMessage;

	@FindBy(id = "com.koo.app:id/channel_imageview")
	public WebElement userProfilePic;

	@FindBy(id = "com.koo.app:id/btnFollowView")
	public WebElement followButton;

	@FindBy(id = "com.koo.app:id/handle_name_textview")
	public WebElement userKooHandle;

	@FindBy(id = "com.koo.app:id/profession_textview")
	public WebElement profeesionDetail;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public WebElement usernameDetail;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.TextView[@index='0']")
	public WebElement usernameDetailAtPeoplePage;

	@FindBy(id = "com.koo.app:id/btnFollowView")
	public WebElement followingButton;

	@FindBy(id = "android:id/button1")
	public WebElement confirmPopUpMessageForUnfollow;

	@FindBy(id = "com.koo.app:id/floating_button_layout")
	public WebElement goToFeedButton;

	@FindBy(id = "com.koo.app:id/feed_recycler_view")
	public WebElement feedPage;

	@FindBy(xpath = "//android.widget.ImageView[@index='1']")
	public WebElement closePopUpMessage;

	@FindBy(xpath = "//android.view.View[@index='0']")
	public WebElement verifyPopUPMessage;

	@FindBy(id = "android:id/button2")
	public WebElement noBttnOnUnfollowConfirmationMsg;

	@FindBy(id = "android:id/button1")
	public WebElement yesBttnOnUnfollowConfirmationMsg;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']")
	public WebElement viewMoreBttn;

	@FindBy(xpath = "//com.koo.app:id/super_expert_item_layout")
	public List<WebElement> listOfProfileInTheCarousaL;

	@FindBy(xpath = "//android.widget.TextView[@text='Find your friends on Koo']")
	public WebElement findYourFriendsOnKoobttn;

	@FindBy(xpath = "//android.widget.TextView[@text='Invite Friends']")
	public WebElement InviteFriendsButton;

	@FindBy(id = "com.koo.app:id/super_expert_item_layout")
	public WebElement forwardArrowMarkInCateogtyCarsouls;

	@FindBy(xpath = "//com.koo.app:id/header_text[@index='Index']")
	public List<WebElement> categoryCarousalsTopic;

	@FindBy(id = "com.koo.app:id/fl_settings")
	public WebElement settingsbttn;

	@FindBy(xpath = "//android.widget.Button[@text='DENY']")
	public WebElement denyButton;

	@FindBy(xpath = "//android.widget.Button[@text='ALLOW']")
	public WebElement allowButton;

	@FindBy(xpath = "//android.widget.TextView[@index='1']")
	public WebElement inviteButton;

	@FindBy(xpath = "//android.widget.ImageButton[@index='1']")
	public WebElement backButtonToPeoplesPage;

	@FindBy(id = "com.koo.app:id/koo_imageview")
	public WebElement KooIcon;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement KooBackButton;

	@FindBy(xpath = "//android.view.ViewGroup")
	public WebElement KooSearch1;

	@FindBy(id = "com.koo.app:id/iv_search")
	public WebElement searchBttnHomePage;

	@FindBy(id = "com.koo.app:id/search")
	public WebElement searchBoxForYourFriendsAndFamily;

	@FindBy(xpath = "//android.widget.FrameLayout[@index='1']/android.widget.EditText[@index='0']")
	public WebElement searchYourFriendsAndFamily;

	@FindBy(id = "com.koo.app:id/rl_twitter")
	public WebElement twitterInvite;

	@FindBy(id = "com.koo.app:id/header_icon_right")
	public WebElement arrowButton;

	@FindBy(id = "com.koo.app:id/rl_whatsapp_status")
	public WebElement whatshappStatus;

	@FindBy(id = "com.koo.app:id/rl_facebook")
	public WebElement facebookInvite;

	@FindBy(id = "com.koo.app:id/rl_whatsapp")
	public WebElement whatsappInvite;

	@FindBy(id = "com.koo.app:id/close_button")
	public WebElement closeButtonOnShareScreen;

	@FindBy(id = "com.koo.app:id/imgBadge")
	public WebElement yellowTick;

	@FindBy(xpath = "//android.view.ViewGroup[@index='0']/android.widget.ImageButton[@index='0']")
	public WebElement backButtonInSearchPage;

	@FindBy(id = "com.google.android.gms:id/credentials_hint_picker_title")
	public WebElement hint_picker_title;
	@FindBy(id = "com.google.android.gms:id/cancel")
	public WebElement cancel;

	public void verifyPeopleTabOnHomeScreen(String headertext) throws InterruptedException {
		 Thread.sleep(2000);
		click(peopleTab);
		// Thread.sleep(4000);
		waitForVisibility(discoverReleventPeopleHeadr);
		Assert.assertTrue(discoverReleventPeopleHeadr.getText().equalsIgnoreCase(headertext));

	}

	public void verifyDiscoverReleventPeople() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(discoverProfession.size() > 1);
		String discoverprofession = "";
		for (WebElement el : discoverProfession) {
			discoverprofession = TestUtils.removeSpace(TestUtils.removeSpecialCharacters(el.getText()));
		//	Assert.assertTrue(Enums.getIfPresent(DiscoverProfession.class, discoverprofession).isPresent());
		}

	}

	public void cancelMobilePopup() {
		waitForVisibility(hint_picker_title);
		click(cancel);
	}

	public void verifySearchForProfessionSearchbox(String searchboxText) {
		waitForVisibility(searchForProfessionSearchBox);
		Assert.assertTrue(searchForProfessionSearchBox.getText().equals(searchboxText));
	}

	public void verifyProfessionCategory(String headertext) throws InterruptedException {
		click(searchForProfessionSearchBox);
		waitForVisibility(professionCategoryHeader);
		Assert.assertTrue(professionCategoryHeader.getText().contains(headertext));

	}

	public void verifyTypeOfSearchWaterMark(String text) {
		waitForVisibility(typeOfSearchText);
		Assert.assertTrue(typeOfSearchText.getText().equals(text));
	}

	public void verifyListOfProfession() {

		Assert.assertTrue(listofProfession.size() > 1);
		String professionList = "";
		for (WebElement el : listofProfession) {
			professionList = TestUtils.removeSpace(el.getText());
		}
	}

	public void clickOnBackButtonAndVerifyPeopleTab() throws InterruptedException {
		clickAndroidDeviceBackBttn();
		waitForVisibility(peopleTab);
		Assert.assertTrue(isElementPresent(peopleTab));
		waitForVisibility(discoverReleventPeopleHeadr);
	}

	public void verifyListofResultFromProfessionalSearchBox(String profession) throws InterruptedException {
		click(searchForProfessionSearchBox);
		// clear(searchBoxProfessionCategory);
		sendKeys(typeOfSearchText, profession);
		waitForVisibility(searchedResult);
		Assert.assertTrue(isElementPresent(searchedResult));
		Assert.assertTrue(searchedResult.getText().equalsIgnoreCase(profession));

	}

	public void verifySpecifiedProfessionalList(String profession) throws InterruptedException {
		click(searchedResult);
		Thread.sleep(1000);
		waitForVisibility(professionCategoryHeader);
		Assert.assertTrue(professionCategoryHeader.getText().equalsIgnoreCase(profession));
	}

	public void verifyWithInvalidProfessionInSearchBox(String profession) {
		clear(typeOfSearchText);
		sendKeys(typeOfSearchText, profession);
		waitForVisibility(searchedResult);
		Assert.assertTrue(searchedResult.getText().equals("No results found for " + profession));

	}

	public void verifyDescriptionOfProfessional() {
		waitForVisibility(followButton);
		Assert.assertTrue(isElementPresent(followButton));
		Assert.assertTrue(isElementPresent(userProfilePic));
		Assert.assertTrue(isElementPresent(usernameDetail));

	}

	public void verifyTappingExceptFollowButtonNavigateToRespectiveProfile() throws InterruptedException {
		click(peopleName);
		waitForVisibility(peopleName);
		Assert.assertTrue(isElementPresent(peopleName));
		Assert.assertTrue(isElementPresent(usernameDetail));
		Assert.assertTrue(isElementPresent(userProfilePic));

	}

	public void verifyBackButtonNaviagteToProfessionalCategoryHeadr() throws InterruptedException {
		Thread.sleep(1000);
		click(backButton);
		Thread.sleep(3000);
		waitForVisibility(professionCategoryHeader);
		Assert.assertTrue(professionCategoryHeader.getText().equalsIgnoreCase("Profession category"));
	}

	public void verifyAndNavigateBackToprofessiondetailsScreen() throws InterruptedException {
		Thread.sleep(1000);
		click(backButton);
		waitForVisibility(discoverReleventPeopleHeadr);
		Assert.assertTrue(isElementPresent(discoverReleventPeopleHeadr));

	}

	public void searchProfession() throws InterruptedException {
		waitForVisibility(peopleTab);
		click(peopleTab);
		click(searchForProfessionSearchBox);
		waitForVisibility(searchBoxProfessionCategory);
		clear(searchBoxProfessionCategory);
		sendKeys(searchBoxProfessionCategory, "Doctor");
		Thread.sleep(1000);
		waitForVisibility(specalizedProfession);
		Assert.assertTrue(isElementPresent(specalizedProfession));
		click(specalizedProfession);
		waitForVisibility(specalizedProfessionlName);
		Assert.assertTrue(isElementPresent(specalizedProfessionlName));
		click(specalizedProfessionlName);
		Thread.sleep(1500);
		waitForVisibility(followButton);
		click(followButton);
		waitForVisibility(followingButton);
		Assert.assertTrue(isElementPresent(followingButton));
		waitForVisibility(backButtonForSpecalizedUserprofile);
		waitForVisibility(followingButton);
		Assert.assertTrue(isElementPresent(followingButton));
		clickAndroidDeviceBackBttn();
		Thread.sleep(2500);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2500);
		clickAndroidDeviceBackBttn();

	}

	public void verifyFollowButtonFunctionalty() throws InterruptedException {
		Thread.sleep(5000);
		click(specalizedProfessionlName);
		Thread.sleep(2000);
		click(followButton);
		Assert.assertTrue(isElementPresent(followingButton));
		Thread.sleep(1000);
		click(backButtonForSpecalizedUserprofile);
		Assert.assertTrue(isElementPresent(followingButton));
		Thread.sleep(1000);
		click(confirmPopUpMessageForUnfollow);
	}

	public void verifyFollowButtonAtProfessionalDeatilScreenAndFeedButton() throws InterruptedException {
		waitForVisibility(peopleTab);
		click(peopleTab);
		Thread.sleep(1000);
		click(followButton);
		waitForVisibility(goToFeedButton);
		Assert.assertTrue(isElementPresent(followingButton));
		Assert.assertTrue(isElementPresent(goToFeedButton));
	}

	public void verifyAndNavigateToFeedsPage() throws InterruptedException {
		click(goToFeedButton);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(feedTab));
		waitForVisibility(peopleTab);
		click(peopleTab);
	}

	public void closePopup() {
		if (isElementPresent(verifyPopUPMessage)) {
			click(closePopUpMessage);
		}
	}

	public void verifyNobuttonPopUpMessage() throws InterruptedException {
		click(followingButton);
		waitForVisibility(noBttnOnUnfollowConfirmationMsg);
		Assert.assertTrue(isElementPresent(noBttnOnUnfollowConfirmationMsg));
		Assert.assertTrue(isElementPresent(yesBttnOnUnfollowConfirmationMsg));
		click(noBttnOnUnfollowConfirmationMsg);
		Thread.sleep(500);
		Assert.assertTrue(isElementPresent(followingButton));

	}

	public void verifyYesButtonPopUpMessage() throws InterruptedException {
		Thread.sleep(500);
		click(followingButton);
		waitForVisibility(yesBttnOnUnfollowConfirmationMsg);
		click(yesBttnOnUnfollowConfirmationMsg);
		waitForVisibility(followButton);
		Assert.assertTrue(isElementPresent(followButton));
	}

	public void verifyScrolldownInRespectiveProfessionalField() {
		try {

			swipeToSeeDownsideElementsOfScreen(2);
			Thread.sleep(2000);
			swipeToSeeUpsideElementsOfScreen(2);
			clickAndroidDeviceBackBttn();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	public void ClickOnFindYourFriendAndVerifyAllowAndDenyInThePopUp() throws Exception {
		waitForVisibility(peopleTab);
		click(peopleTab);
		swipeToDownsideTillElementPresent(InviteFriendsButton, 10);
		Thread.sleep(1500);
		Assert.assertTrue(isElementPresent(InviteFriendsButton));
		Assert.assertTrue(isElementPresent(inviteButton));
		click(findYourFriendsOnKoobttn);
		Thread.sleep(500);
		Assert.assertTrue(isElementPresent(denyButton));
		Assert.assertTrue(isElementPresent(allowButton));

	}

	public void VerifyClickOnDenyOptionUserShouldNaviageToPeopleTab() throws InterruptedException {
		click(denyButton);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(findYourFriendsOnKoobttn));
		click(findYourFriendsOnKoobttn);
		Thread.sleep(500);
		Assert.assertTrue(isElementPresent(denyButton));
		Assert.assertTrue(isElementPresent(allowButton));
		click(allowButton);
	}

	public void verify10PublicProfile() {
		Assert.assertTrue(listOfProfileInTheCarousaL.size() <= 10);
		for (WebElement el : listOfProfileInTheCarousaL) {
		}
		Assert.assertTrue(isElementPresent(viewMoreBttn));
		click(viewMoreBttn);
	}

	public void verifySearchFunctionAndVirtualKeyBoard() {
		click(searchBoxForYourFriendsAndFamily);
		Assert.assertTrue(isKeyPadShown());
		clickAndroidDeviceBackBttn();

	}

	public void verifyAndClickONFindYourFriendsOnKooButton() {
		click(findYourFriendsOnKoobttn);
	}

	public void verifyWaterMarkInSearchBox() {
		waitForVisibility(searchYourFriendsAndFamily);
		Assert.assertTrue(searchYourFriendsAndFamily.getText().equalsIgnoreCase("Search for your friends and family�"));
	}

	public void verifyAndClickOnBackButtonNaviagetBackToPeopleScreen() throws InterruptedException {
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(500);
		Assert.assertTrue(isElementPresent(peopleTab));
	}

	public void verifyAfterClickOnInviteButtonAndVerifyShareKoo() throws Exception {
		scrollToElement(InviteFriendsButton, "up");
		Thread.sleep(2000);
		scrollToElement(arrowButton, "up");
		click(InviteFriendsButton);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(whatsappInvite));
		Assert.assertTrue(isElementPresent(whatshappStatus));
		Assert.assertTrue(isElementPresent(facebookInvite));
		Assert.assertTrue(isElementPresent(twitterInvite));
		click(closeButtonOnShareScreen);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(peopleTab));
	}

	public void VerifyUserShouldsearchUsingUserNameHandleAndMobile() {
		click(searchBttnHomePage);

	}

	public void clickOnYellowTickMark() throws InterruptedException {
		swipeToUpsideTillElementPresent(usernameDetail, 10);
		click(usernameDetail);
		Thread.sleep(1000);
	}

	public void verifyProfilePicture_Name_Handle_Profession_Follow_buttonShouldBeDisplayedOnAllCrousalCard()
			throws Exception {
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(userProfilePic));
		Assert.assertTrue(isElementPresent(usernameDetail));
		Assert.assertTrue(isElementPresent(followButton));
		Assert.assertTrue(isElementPresent(userKooHandle));
		Thread.sleep(1000);
		click(backButtonForSpecalizedUserprofile);
	}
}
