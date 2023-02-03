package com.qa.pages;

import java.sql.Driver;
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Enums;
import com.qa.pages.Filters.Languages;
import com.qa.utils.TestUtils;

public class Search extends BasePage {
	TestUtils utils = new TestUtils();

	@FindBy(id = "com.koo.app:id/layout_search")
	public WebElement SearchButton;

	@FindBy(id = "com.koo.app:id/action_bar_et_search")
	public WebElement SearchField;

	@FindBy(xpath = "//android.widget.ImageButton")
	public WebElement BackButton;

	@FindBy(id = "com.koo.app:id/voice_search_image_view")
	public WebElement MicButton;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']")
	public WebElement PeopleButton;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']")
	public WebElement HashtagButton;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='2']")
	public WebElement KooButton;

	@FindBy(id = "com.koo.app:id/toolbar_profile")
	public WebElement HomeScreen;

	@FindBy(id = "com.koo.app:id/search_view_pager")
	public WebElement SearchPage;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']")
	public WebElement PeopleSearched1;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	public WebElement PeopleSearched2;

	@FindBy(id = "com.koo.app:id/bt_continue")
	public WebElement SkipButton;

	@FindBy(xpath = "//android.webkit.WebView")
	public WebElement UpdateNotification;

	@FindBy(xpath = "//android.widget.ImageView[@index='1']")
	public WebElement CloseButton;

	@FindBy(xpath = "//android.view.ViewGroup[@index='2']")
	public WebElement peopledetails;

	@FindBy(xpath = "//android.widget.FrameLayout[@index='0']")
	public WebElement Peopleimage;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public WebElement Peoplename;

	@FindBy(xpath = "//android.widget.TextView[@index='4']")
	public WebElement People;

	@FindBy(id = "com.koo.app:id/layout_close")
	public WebElement BacktoSearch;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='0']")
	public WebElement Hashtag1;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']")
	public WebElement Hashtag2;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement HashtagBackButton;

	@FindBy(id = "com.koo.app:id/toolbar_title")
	public WebElement Kootitle;

	@FindBy(id = "com.koo.app:id/koo_imageview")
	public WebElement KooIcon;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement KooBackButton;

	@FindBy(xpath = "//android.view.ViewGroup")
	public WebElement KooSearch1;

	@FindBy(id = "com.koo.app:id/fl_action_bar_cancel")
	public WebElement CancelButton;

	@FindBy(xpath = "//android.widget.RelativeLayout")
	public List<WebElement> AllSearchREsult;

	@FindBy(id = "com.koo.app:id/noInternetView")
	public WebElement noInternetOnResult;

	@FindBy(id = "com.koo.app:id/imgOffline")
	public WebElement noInternetIcon;

	@FindBy(id = "com.koo.app:id/tvOfflineMsg")
	public WebElement OfflineMsg;

	@FindBy(id = "com.google.android.googlequicksearchbox:id/intent_api_recognizer")
	public WebElement GooglrOfflinePopUp;

	@FindBy(id = "com.google.android.googlequicksearchbox:id/intent_api_text")
	public WebElement GooglrOfflineMsg;

	@FindBy(id = "com.koo.app:id/no_internet_layout")
	public WebElement NoInternetHomeScreen;

	@FindBy(id = "android.widget.TextView[@index='1']")
	public WebElement NoInternetHomeScreenText;

	@FindBy(id = "com.google.android.googlequicksearchbox:id/transcription_google_logo")
	public WebElement Googlelogo;

	@FindBy(id = "com.google.android.googlequicksearchbox:id/transcription_mic_image_indicator_background")
	public WebElement GoogleMic;

	@FindBy(xpath = "//android.widget.ImageView[@index=1]")
	public WebElement update_PopUp;

	//new by sumeet
	@FindBy(id = "com.koo.app:id/textView2")
	public WebElement ProfileToFollow;

	@FindBy(id = "com.koo.app:id/layout_search")
	public WebElement SearchIconHome;

	// made by sumeet
	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public WebElement searchedText;

	@FindBy(id = "com.koo.app:id/block_button")
	public WebElement BlockButton;

	@FindBy(id = "android:id/button1")
	public WebElement OkButton ;

	@FindBy(id = "com.koo.app:id/channel_imageview")
	public WebElement ProfilePhoto ;




	public Search() {
	}

	public void waitforHomeScreen() {
		waitForVisibility(HomeScreen);
	}

	public void user_Tap_On_Search_Icon_And_Navigates_To_Search_Screen() throws Exception {
		Thread.sleep(3000);
		if (isElementPresent(CloseButton)) {
			click(CloseButton);
		}
		Assert.assertTrue(isKeyPadShown());
		click(SearchButton);
		waitForVisibility(SearchPage);
		Assert.assertTrue(isElementPresent(SearchPage));
		Thread.sleep(2000);
		closePopUp();
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(MicButton));
		Assert.assertTrue(isElementPresent(SearchField));
		Assert.assertTrue(isElementPresent(PeopleButton));
		Assert.assertTrue(isElementPresent(HashtagButton));
		Assert.assertTrue(isElementPresent(KooButton));

	}

	public void closePopUp() throws Exception {
		Thread.sleep(2000);
		if (isElementPresent(update_PopUp)) {
			click(update_PopUp);
		}

	}

	public void clickOnAppBackButton() throws InterruptedException {
		waitForVisibility(BackButton);
		click(BackButton);
		Thread.sleep(2000);
		Assert.assertFalse(!isKeyPadShown());
		waitForVisibility(HomeScreen);
		Assert.assertTrue(isElementPresent(HomeScreen));
	}

	public void VerifySearchFieldAndSearchResult(String searchValue) throws Exception {
		user_Tap_On_Search_Icon_And_Navigates_To_Search_Screen();
		click(SearchField);
		SearchField.clear();
		SearchField.sendKeys(searchValue);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(PeopleSearched1));
		// Assert.assertTrue(isElementPresent(PeopleSearched2));

	}

	public void AndroidDeviceBackBttn() throws Exception {
		user_Tap_On_Search_Icon_And_Navigates_To_Search_Screen();
		waitForVisibility(SearchField);
		Thread.sleep(3000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(3000);
		Assert.assertFalse(!isKeyPadShown());
		clickAndroidDeviceBackBttn();
		waitForVisibility(HomeScreen);
		Assert.assertTrue(isElementPresent(HomeScreen));

	}

	public void iVerifyFirstNameAndVerifyResult(String FirstName) throws InterruptedException {
		waitForVisibility(SearchField);
		click(SearchField);
		SearchField.clear();
		SearchField.sendKeys(FirstName);
		clickAndroidDeviceBackBttn();
		waitForVisibility(PeopleSearched2);
		Assert.assertTrue(isElementPresent(PeopleSearched1));
		Assert.assertTrue(isElementPresent(PeopleSearched2));

	}

	public void iverifyUserIsRegistered() throws InterruptedException {
		//Thread.sleep(4000);
		if (isElementPresent(SkipButton)) {
			click(SkipButton);
		}
		Thread.sleep(4000);
		//	click(SkipButton);

	}

	public void iverifyLastNameAndVerifyRsult(String LastName) {
		waitForVisibility(SearchField);
		click(SearchField);
		SearchField.clear();
		SearchField.sendKeys(LastName);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(PeopleSearched1));
		Assert.assertTrue(isElementPresent(PeopleSearched2));

	}

	public void iverifyHandleNameAndVerifyRsult(String HandleName) throws InterruptedException {
		waitForVisibility(SearchField);
		click(SearchField);
		Thread.sleep(1000);
		SearchField.clear();
		SearchField.sendKeys(HandleName);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(PeopleSearched1));
		// Assert.assertTrue(isElementPresent(PeopleSearched2));

	}

	public void iverifywithAttheRateHandleNameAndVerifyRsult(String HandleName1) throws InterruptedException {
		waitForVisibility(SearchField);
		// click(SearchField);
		Thread.sleep(1000);
		SearchField.clear();
		SearchField.sendKeys(HandleName1);
		// clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(PeopleSearched1));
		Assert.assertTrue(isElementPresent(PeopleSearched2));

	}

	public void iVerifyUserandHandleNameWithUPPERCASEAndlowercase(String searchValue1, String searchValue2,
																  String HandleName2, String HandleName3) throws InterruptedException {
		Thread.sleep(3000);
		waitForVisibility(SearchField);
		// click(SearchField);
		SearchField.clear();
		SearchField.sendKeys(searchValue1);
		// clickAndroidDeviceBackBttn();

	}

	public void iverifybyClearingAndWriteAgain(String searchValue) throws InterruptedException {
		Thread.sleep(6000);
		click(SearchField);
		SearchField.clear();
		SearchField.sendKeys(searchValue);
		Assert.assertTrue(isElementPresent(PeopleSearched1));

	}

	public void iVerifySearchedProfileandCameBack(String searchValue) throws InterruptedException {
		Thread.sleep(6000);
		iverifybyClearingAndWriteAgain(searchValue);
		Thread.sleep(6000);
		waitForVisibility(PeopleSearched1);
		click(Peoplename);
		Thread.sleep(8000);
		Assert.assertTrue(isElementPresent(Peopleimage));
		Assert.assertTrue(People.getText().equalsIgnoreCase(searchValue));
		click(BacktoSearch);

	}

	public void clickonSearchButtonandVerifySearchUI() throws Exception {
		user_Tap_On_Search_Icon_And_Navigates_To_Search_Screen();
		Thread.sleep(6000);
		Assert.assertTrue(isElementPresent(MicButton));
		Assert.assertTrue(isElementPresent(SearchField));
		Assert.assertTrue(isElementPresent(PeopleButton));
		Assert.assertTrue(isElementPresent(HashtagButton));
		Assert.assertTrue(isElementPresent(KooButton));

	}

	public void ClickonHashtagButtonAndVerifyHashtagScreen() throws InterruptedException {
		Thread.sleep(6000);
		click(HashtagButton);
		Thread.sleep(6000);
		click(SearchField);
		SearchField.clear();
		SearchField.sendKeys("#In");
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(Hashtag1));
		Assert.assertTrue(isElementPresent(Hashtag2));

	}

	public void iVerifyResultListScrollable() throws InterruptedException {
		swipeToSeeDownsideElementsOfScreen(2);
		swipeToSeeUpsideElementsOfScreen(2);

	}

	public void iVerifyNavigateHashtagScreenAndNavigateBack() throws InterruptedException {
		Thread.sleep(3000);
		click(Hashtag1);
		click(HashtagBackButton);
		Thread.sleep(4000);
		Assert.assertTrue(isElementPresent(Hashtag1));
		Assert.assertTrue(isElementPresent(Hashtag2));

	}

	public void iVerifyHashtagDetailVKBShouldCloseandVerifyHashtagDetailScreen() throws InterruptedException {
		Thread.sleep(4000);
		click(Hashtag1);
		Thread.sleep(3000);
		Assert.assertFalse(!isKeyPadShown());
		Thread.sleep(5000);
		swipeToSeeDownsideElementsOfScreen(2);
		swipeToSeeUpsideElementsOfScreen(2);

	}

	public void iVerifyBackToHashtagDetailToSearchScreenandCurserBlinkingInSearchField() throws InterruptedException {
		click(HashtagBackButton);
		Thread.sleep(6000);
		Assert.assertTrue(SearchField.getText().equalsIgnoreCase("#In"));
		clear(SearchField);
		Assert.assertTrue(isKeyPadShown());
		Thread.sleep(6000);
		PeopleButton.click();
		Thread.sleep(6000);
		Assert.assertTrue(isKeyPadShown());
		Thread.sleep(4000);
		Assert.assertTrue(isElementPresent(SearchField));
		Thread.sleep(6000);

	}

	public void iVerifyForKooTitle() throws InterruptedException {
		click(KooButton);
		Thread.sleep(6000);
		Assert.assertTrue(isKeyPadShown());
		Assert.assertTrue(isElementPresent(SearchField));
		clear(SearchField);
		SearchField.sendKeys("Sushil");
		Thread.sleep(6000);

	}

	public void iverifyTheKooSearchResult() throws InterruptedException {
		Assert.assertTrue(SearchField.getText().equalsIgnoreCase("Sushil"));
		clickAndroidDeviceBackBttn();
		swipeToSeeDownsideElementsOfScreen(2);
		swipeToSeeUpsideElementsOfScreen(2);
		Thread.sleep(6000);
		Assert.assertFalse(!isKeyPadShown());

	}

	public void iVerifyNavigateKooDetailsScreenNavigateBack() throws InterruptedException {
		Thread.sleep(6000);
		click(KooSearch1);
		Thread.sleep(10000);
		Assert.assertTrue(Kootitle.getText().equalsIgnoreCase("koos"));
		Assert.assertTrue(isElementPresent(KooIcon));
		Thread.sleep(3000);
		click(KooBackButton);
		Thread.sleep(3000);

	}

	public void iVerifyVKBOnNavigateKooDetailsScreenNavigateBack() throws InterruptedException {
		Thread.sleep(6000);
		click(KooSearch1);
		Thread.sleep(6000);
		Assert.assertTrue(Kootitle.getText().equalsIgnoreCase("koos"));
		Assert.assertTrue(isElementPresent(KooIcon));
		Assert.assertFalse(!isKeyPadShown());
		swipeToSeeDownsideElementsOfScreen(2);
		swipeToSeeUpsideElementsOfScreen(2);
//		click(KooBackButton);	
		clickAndroidDeviceBackBttn();

	}

	public void iVerifyOnCancleButtonOnSearchFieldAndVerifySearchFieldAndCancelButton() throws InterruptedException {
		Thread.sleep(4000);
		click(PeopleButton);
		click(SearchField);
		SearchField.clear();
		SearchField.sendKeys("Sushil Kumar");
		Thread.sleep(4000);
		Assert.assertTrue(SearchField.getText().equalsIgnoreCase("Sushil Kumar"));
		Assert.assertTrue(isElementPresent(CancelButton));
		Thread.sleep(3000);
		click(CancelButton);
		Thread.sleep(6000);
		Assert.assertTrue(isElementPresent(MicButton));
		Assert.assertFalse(SearchField.getText().equalsIgnoreCase("Sushil Kumar"));

	}

	public void iVerifySearchResultUI() throws InterruptedException {
		Thread.sleep(5000);
		SearchField.clear();
		SearchField.sendKeys("Sushil");
		Thread.sleep(3000);
		clickAndroidDeviceBackBttn();
		swipeToSeeDownsideElementsOfScreen(2);
		swipeToSeeUpsideElementsOfScreen(2);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(PeopleSearched1));
		Assert.assertTrue(isElementPresent(PeopleSearched2));
		Assert.assertTrue(isElementPresent(CancelButton));
		Thread.sleep(2000);

	}

	public void IVerifyGoogleVoiceScreenbyTappingOnMicIcon() throws InterruptedException {
		Thread.sleep(6000);
		click(CancelButton);
		Thread.sleep(4000);
		click(MicButton);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(Googlelogo));
		Assert.assertFalse(Googlelogo.getText().equalsIgnoreCase("Google"));
		Assert.assertTrue(isElementPresent(GoogleMic));
		clickAndroidDeviceBackBttn();

	}

	public void IverifyMicFunctionalityonOfflineMode() throws Exception {
		user_Tap_On_Search_Icon_And_Navigates_To_Search_Screen();
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(noInternetOnResult));
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(noInternetIcon));
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(OfflineMsg));
		Assert.assertTrue(OfflineMsg.getText().equalsIgnoreCase("You�re offline"));
		Thread.sleep(3000);
		click(MicButton);
		Thread.sleep(3000);
		Assert.assertFalse(!isKeyPadShown());
		Thread.sleep(6000);
		Assert.assertTrue(isElementPresent(GooglrOfflinePopUp));
		Assert.assertTrue(isElementPresent(GooglrOfflineMsg));
		Thread.sleep(2000);
		Assert.assertTrue(GooglrOfflineMsg.getText().equalsIgnoreCase("Network Not Connected"));
		clickAndroidDeviceBackBttn();

	}

	public void iVerifyBackbuttonOnleftsideScreenOnNoINTERNET() throws InterruptedException {
		// user_Tap_On_Search_Icon_And_Navigates_To_Search_Screen();
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(BackButton));

	}

	public void iVerifyTappingOnBackButtonAndNavigateToHomeScreenOnNOINTERNET() throws InterruptedException {
		Thread.sleep(3000);
		click(BackButton);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(NoInternetHomeScreen));
		Assert.assertTrue(
				NoInternetHomeScreenText.getText().equalsIgnoreCase("You�re offline, please check your internet"));

	}

	// new added by sumeet
	public void iverifyUserIsOnUpdatePictureScreen() throws InterruptedException {
		//Thread.sleep(4000);
		if (isElementPresent(SkipButton)) {
			Assert.assertTrue(SkipButton.getText() == "SKIP / CONTINUE");

		}
		Thread.sleep(4000);
		//	click(SkipButton);

	}

	public void iVerifySearchIconHome() throws Exception {
		Thread.sleep(2000);
		if (isElementPresent(SearchIconHome)) {
			Assert.assertTrue(isElementPresent(SearchIconHome));
			click(SearchIconHome);
		}
	}

	public void iVerifyInputotherprofilename() throws Exception {
		Thread.sleep(2000);
		if (isElementPresent(SearchField)) {
			Assert.assertTrue(isElementPresent(SearchField));
			SearchField.sendKeys("Tester1");
		}
	}

	public void iVerifysearchpublicprofilename() throws Exception {
		Thread.sleep(2000);
		if (isElementPresent(SearchField)) {
			Assert.assertTrue(isElementPresent(SearchField));
			SearchField.sendKeys("sambit patra");
		}
	}

	public void iVerifyIclickonsearchedtext() throws Exception {
		Thread.sleep(5000);
		click(searchedText);
		/*if (isElementPresent(searchedText)) {
			Assert.assertTrue(isElementPresent(searchedText));
			click(searchedText);
		}*/
	}


		public void waitforProfileFollowScreen () {
			waitForVisibility(ProfileToFollow);
		}

	public void iVerifyIclickonblockbutton() throws Exception {
		Thread.sleep(5000);

		if (isElementPresent(BlockButton)) {
			Assert.assertTrue(isElementPresent(BlockButton));
			click(BlockButton);
		}
	}

	public void iVerifyIclickonOkbutton() throws Exception {
		Thread.sleep(5000);

		if (isElementPresent(OkButton)) {
			Assert.assertTrue(isElementPresent(OkButton));
			click(OkButton);
		}
	}

	public void iVerifyIclickonProfilePhoto() throws Exception {
		Thread.sleep(5000);

		if (isElementPresent(ProfilePhoto)) {
			Assert.assertTrue(isElementPresent(ProfilePhoto));
			click(ProfilePhoto);
		}
	}






}
