package com.qa.stepdef;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

import com.qa.pages.LoginPage;
import com.qa.pages.Search;
import io.cucumber.java.en.Then;

public class SearchStepDef {

	@Then("^I verify by tapping on Skip/Continue button.")
	public void iVerifyByTapOnSkip() throws InterruptedException {
		new Search().iverifyUserIsRegistered();
	}

	@Then("^I Verify by tap on Search icon user should navigate to search screen with VKB open and Cursor should be blinking in search field")
	public void user_Tap_On_Search_Icon_And_Navigates_To_Search_Screen() throws Exception {
		new Search().user_Tap_On_Search_Icon_And_Navigates_To_Search_Screen();
	}

	@Then("^I Verify by tap on App back button, VKB should close and user should navigate back to respective Home tab screen from where he came.")
	public void clickOnAppBackButton() throws Exception {
		new Search().clickOnAppBackButton();

	}

	@Then("^I Verify by tap on Mobile back button, VKB should close and again tap on mobile back button user should navigate back to respective Home tab screen from where he came.")
	public void clickAndroidDeviceBackBttn() throws Exception {
		new Search().AndroidDeviceBackBttn();
	}

	@Then("^I Search for user \"([^\"]*)\" and verify search results.")
	public void iVerifySearchFieldAndSearchResult(String searchValue) throws Exception {
		new Search().VerifySearchFieldAndSearchResult(searchValue);

	}

	@Then("^I Search user name with first \"([^\"]*)\" and verify results")
	public void iVerifyFirstNameAndVerifyResult(String FirstName) throws InterruptedException {
		new Search().iVerifyFirstNameAndVerifyResult(FirstName);
	}

	@Then("^I Search last name with first \"([^\"]*)\" and verify results")
	public void iVerifyLastNameAndVerifyResult(String LastName) throws InterruptedException {
		new Search().iverifyLastNameAndVerifyRsult(LastName);

	}

	@Then("^I Search handle name with first \"([^\"]*)\" and verify results")
	public void iVerifyHandleNameAndVerifyResult(String HandleName) throws InterruptedException {
		new Search().iverifyHandleNameAndVerifyRsult(HandleName);
	}

	@Then("^I Search handle name with @ \"([^\"]*)\" and verify search results")
	public void iVerifywithAttheRateHandleNameAndVerifyResult(String HandleName1) throws InterruptedException {
		new Search().iverifywithAttheRateHandleNameAndVerifyRsult(HandleName1);

	}

	@Then("^I Search user name and handle name with Uppercase and Lowercase letters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" and verify search results")
	public void iVerifyUserandHandleNameWithUPPERCASEAndlowercase(String searchValue1, String searchValue2,
			String HandleName2, String HandleName3) throws InterruptedException {
		new Search().iVerifyUserandHandleNameWithUPPERCASEAndlowercase(searchValue1, searchValue2, HandleName2,
				HandleName3);
	}

	@Then("^I Search user name and clear the search results and \"([^\"]*)\" again search for the same username and handle.")
	public void iverifybyClearingAndWriteAgain(String searchValue) throws InterruptedException {
		new Search().iverifybyClearingAndWriteAgain(searchValue);
	}

	@Then("^I Verify navigation to searched user profile \"([^\"]*)\", navigate back to search screen and verify search results be present as earlier")
	public void iVerifySearchedProfileandCameBack(String searchValue) throws InterruptedException {
		new Search().iVerifySearchedProfileandCameBack(searchValue);

	}

	@Then("^I Verify by tap on Search icon user should navigate to search screen and verify Search UI")
	public void clickonSearchButtonandVerifySearchUI() throws Exception {
		new Search().clickonSearchButtonandVerifySearchUI();
	}

	@Then("^I Verify by clicking on HashtagButton and Search for any of \"# In\".")
	public void ClickonHashtagButtonAndVerifyHashtagScreen() throws InterruptedException {
		new Search().ClickonHashtagButtonAndVerifyHashtagScreen();
	}

	@Then("^I Verify the results list should be scrollable.")
	public void iVerifyResultListScrollable() throws InterruptedException {
		new Search().iVerifyResultListScrollable();
	}

	@Then("^I Verify navigation hashtag detail screen and navigate back.")
	public void iVerifyNavigateHashtagScreenAndNavigateBack() throws InterruptedException {
		new Search().iVerifyNavigateHashtagScreenAndNavigateBack();
	}

	@Then("^I Verify on navigating to Hashtag detail screen, VKB should close and user should land on respective Hashtag Deatil screen.")
	public void iVerifyHashtagDetailVKBShouldCloseandVerifyHashtagDetailScreen() throws InterruptedException {
		new Search().iVerifyHashtagDetailVKBShouldCloseandVerifyHashtagDetailScreen();
	}

	@Then("^I Verify on navigating back from Hashtag detail screen to Search screen hashtag tab, VKB should open and cursor should be blinking next to hashtag in search field.")
	public void iVerifyBackToHashtagDetailToSearchScreenandCurserBlinkingInSearchField() throws InterruptedException {
		new Search().iVerifyBackToHashtagDetailToSearchScreenandCurserBlinkingInSearchField();
	}

	@Then("^I Search for a koo title.")
	public void iVerifyForKooTitle() throws InterruptedException {
		new Search().iVerifyForKooTitle();
	}

	@Then("^I Verify the results.")
	public void iverifyTheKooSearchResult() throws InterruptedException {
		new Search().iverifyTheKooSearchResult();
	}

	@Then("^I Verify navigation to koo detail screen and navigate back.")
	public void iVerifyNavigateKooDetailsScreenNavigateBack() throws InterruptedException {
		new Search().iVerifyNavigateKooDetailsScreenNavigateBack();
	}

	@Then("^I Verify the VKB on navigation to koo detail screen and navigate back.")
	public void iVerifyVKBOnNavigateKooDetailsScreenNavigateBack() throws InterruptedException {
		new Search().iVerifyVKBOnNavigateKooDetailsScreenNavigateBack();
	}

	@Then("^I Verify when user taps on cancel button, the text present in search field should be erased and cancel button should not display.")
	public void iVerifyOnCancleButtonOnSearchFieldAndVerifySearchFieldAndCancelButton() throws InterruptedException {
		new Search().iVerifyOnCancleButtonOnSearchFieldAndVerifySearchFieldAndCancelButton();
	}

	@Then("^I Verify search results UI")
	public void iVerifySearchResultUI() throws InterruptedException {
		new Search().iVerifySearchResultUI();
	}

	@Then("^I Verify google voice screen should open after tapping on mic icon.")
	public void IVerifyGoogleVoiceScreenbyTappingOnMicIcon() throws InterruptedException {
		new Search().IVerifyGoogleVoiceScreenbyTappingOnMicIcon();
	}

	@Then("^I Tapping on mic icon Can not search as you are offline message should show and  In search screen No internet ui should show")
	public void IverifyMicFunctionalityonOfflineMode() throws Exception {
		new Search().IverifyMicFunctionalityonOfflineMode();
	}

	@Then("^I Verify the backbutton present in search screen left corner of the screen header.")
	public void iVerifyBackbuttonOnleftsideScreenOnNoINTERNET() throws InterruptedException {
		new Search().iVerifyBackbuttonOnleftsideScreenOnNoINTERNET();
	}

	@Then("^I Verify by tapping on back button arrow mark user should navigate to home/feed screen.")
	public void iVerifyTappingOnBackButtonAndNavigateToHomeScreenOnNOINTERNET() throws InterruptedException {
		new Search().iVerifyTappingOnBackButtonAndNavigateToHomeScreenOnNOINTERNET();
	}

	//new added by sumeet
	@Then("^I Verify new user navigate to Update Profile Picture screen$")
	public void newUserNavigatesToUpdateProfilePictureScreen() throws InterruptedException {
		new Search().iverifyUserIsOnUpdatePictureScreen();
	}

	@Then("^I Click on search Icon on Home Page$")
	public void iVerifySearchIconHome() throws Exception {
		new Search().iVerifySearchIconHome();
	}

	@Then("^I Input other profile name$")
	public void iVerifyInputotherprofilename() throws Exception {
		new Search().iVerifyInputotherprofilename();
	}

	@Then("^I search public profile name$")
	public void iVerifysearchpublicprofilename() throws Exception {
		new Search().iVerifysearchpublicprofilename();
	}

	@Then("^I click on searched text$")
	public void iVerifyIclickonsearchedtext() throws Exception {
		new Search().iVerifyIclickonsearchedtext();
	}

	@Then("^I click on block button$")
	public void iVerifyIclickonblockbutton() throws Exception {
		new Search().iVerifyIclickonblockbutton();
	}

	@Then("^I click on Ok button$")
	public void iVerifyIclickonOkbutton() throws Exception {
		new Search().iVerifyIclickonOkbutton();
	}

	@Then("^I click on Profile Photo$")
	public void iVerifyIclickonProfilePhoto() throws Exception {
		new Search().iVerifyIclickonProfilePhoto();
	}




}
