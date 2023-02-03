package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utils.TestUtils;

public class PreferencesPage extends BasePage{
	TestUtils utils = new TestUtils();
	
	@FindBy(xpath="//android.widget.TextView[@text='Choose your interests']")
	public WebElement preferencesPage;
		
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.widget.ImageView[@index='0']")
	public WebElement newsTvPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.widget.CheckBox[@index='2']")
	public WebElement newsTvPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='News & Current Affairs']")
	public WebElement newsTvPreference;	
	
	@FindBy(xpath="//android.widget.TextView[@text='Popular On Koo']")
	public WebElement popularOnKooPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.widget.ImageView[@index='0']")
	public WebElement popularOnKooPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.widget.CheckBox[@index='2']")
	public WebElement popularOnKooPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Politicians']")
	public WebElement politicianspreference;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='6']/android.widget.ImageView[@index='0']")
	public WebElement politicianspreferenceIcon;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='6']/android.widget.CheckBox[@index='2']")
	public WebElement politicianspreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Entertainment']")
	public WebElement entertainmentPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement entertainmentPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='0']/android.widget.CheckBox[@index='2']")
	public WebElement entertainmentPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Poets and Authors']")
	public WebElement poetsandAuthorsPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='5']/android.widget.ImageView[@index='0']")
	public WebElement poetsandAuthorsPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='5']/android.widget.CheckBox[@index='2']")
	public WebElement poetsandAuthorsPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Journalists']")
	public WebElement journalistsPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='9']/android.widget.ImageView[@index='0']")
	public WebElement journalistsPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='9']/android.widget.CheckBox[@index='2']")
	public WebElement journalistsPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Sports']")
	public WebElement sportsPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='3']/android.widget.ImageView[@index='0']")
	public WebElement sportsPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='3']/android.widget.CheckBox[@index='2']")
	public WebElement sportsPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Spiritual Leaders']")
	public WebElement spiritualLeadersPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='10']/android.widget.ImageView[@index='0']")
	public WebElement spiritualLeadersPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='10']/android.widget.CheckBox[@index='2']")
	public WebElement spiritualLeadersPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Government Services']")
	public WebElement governmentServicesPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='4']/android.widget.ImageView[@index='0']")
	public WebElement governmentServicesPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='4']/android.widget.CheckBox[@index='2']")
	public WebElement governmentServicesPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Government Officials']")
	public WebElement governmentOfficialsPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='8']/android.widget.ImageView[@index='0']")
	public WebElement governmentOfficialsPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='8']/android.widget.CheckBox[@index='2']")
	public WebElement governmentOfficialsPreferenceChkBox;
	
	@FindBy(xpath="//android.widget.TextView[@text='Cricketers']")
	public WebElement cricketersPreference;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='7']/android.widget.ImageView[@index='0']")
	public WebElement cricketersPreferenceIcon;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='7']/android.widget.CheckBox[@index='2']")
	public WebElement cricketersPreferenceChkBox;
	
	@FindBy(id = "com.koo.app:id/bt_continue")
	public WebElement SkipButton;
	
	@FindBy(xpath="//android.widget.TextView[@text='People']")
	public WebElement peopleScreenTab;
	
	@FindBy(xpath="//android.widget.TextView[@text='Your Preferences']")
	public WebElement prefrenceSection;
	
	@FindBy(xpath="//android.widget.TextView[@text='Add More']")
	public WebElement addMoreButton;
	
	@FindBy(xpath="//android.widget.TextView[@text='People preferences']")
	public WebElement peoplePreferencesPage;
	
	@FindBy(id="com.koo.app:id/bt_continue")
	public WebElement doneButton;
	
	@FindBy(xpath="//androidx.viewpager.widget.ViewPager[@index='1']/android.widget.RelativeLayout[@index='0']/androidx.viewpager.widget.ViewPager[@index='1']/android.view.ViewGroup[@index='0']/android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']")
	public WebElement selectedPrefrences1;
	
	@FindBy(xpath="//androidx.viewpager.widget.ViewPager[@index='1']/android.widget.RelativeLayout[@index='0']/androidx.viewpager.widget.ViewPager[@index='1']/android.view.ViewGroup[@index='0']/android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']")
	public WebElement selectedPrefrences2;
	
	@FindBy(xpath="//android.widget.TextView[@text='Add Preferences']")
	public WebElement addPrefrencesButton;
	
	@FindBy(id="com.koo.app:id/profile_images")
	public WebElement profilePictures;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='0']/android.widget.RelativeLayout[@index='3']")
	public WebElement entertainmentProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='1']/android.widget.RelativeLayout[@index='3']")
	public WebElement popularOnKooProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='2']/android.widget.RelativeLayout[@index='3']")
	public WebElement newsTvChannelsProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='3']/android.widget.RelativeLayout[@index='3']")
	public WebElement sportsProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='4']/android.widget.RelativeLayout[@index='3']")
	public WebElement governmentServicesProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='5']/android.widget.RelativeLayout[@index='3']")
	public WebElement postAndAuthorProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='6']/android.widget.RelativeLayout[@index='3']")
	public WebElement politiciansProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='7']/android.widget.RelativeLayout[@index='3']")
	public WebElement cricketersProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='8']/android.widget.RelativeLayout[@index='3']")
	public WebElement governmentOfficialsProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='8']/android.widget.RelativeLayout[@index='3']")
	public WebElement journalistProfilePicture;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.view.ViewGroup[@index='9']/android.widget.RelativeLayout[@index='3']")
	public WebElement spiritualLeadersProfilePicture;
	
	@FindBy(id="com.koo.app:id/backArrow")
	public WebElement backButton;
	
	@FindBy(id="com.koo.app:id/container")
	public List<WebElement> listOfIndividual;
	
	@FindBy(id="com.koo.app:id/btnFollowView")
	public List<WebElement> followButtons;
	
	@FindBy(id="com.koo.app:id/channel_name_textview")
	public List<WebElement> names;
	
	@FindBy(id="com.koo.app:id/tvHandle")
	public List<WebElement> handleNames;
	
	@FindBy(id="com.koo.app:id/tvHeadline")
	public List<WebElement> professions;
	
	@FindBy(id="com.koo.app:id/channel_imageview")
	public List<WebElement> profileImages;
	
	@FindBy(id = "android:id/button1")
	public WebElement yesBttnOnUnfollowConfirmationMsg;
	
	@FindBy(id = "android:id/button2")
	public WebElement noBttnOnUnfollowConfirmationMsg;
	
	@FindBy(xpath="//android.widget.TextView[@text='Following']")
	public WebElement followingButton ;
	
	@FindBy(xpath="//android.widget.TextView[@text='Follow']")
	public WebElement followButton;
	
	@FindBy(xpath="//android.widget.CheckBox[@text='Add to preferences']")
	public WebElement addToPrefrencesChkBox;
	
	@FindBy(xpath="//android.widget.CheckBox[@text='Preferred']")
	public WebElement PrefrencesChkBox;
	
	@FindBy(xpath="//android.view.ViewGroup[@index='0']/android.widget.ImageButton[@index='0']")
	public WebElement peoplePrefrencesBackButton;

	//new by sumeet
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox[@index='2']")
	public WebElement politicsInteresetPreferenceChkBox;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.CheckBox[@index='2']")
	public WebElement humourAndMemeInterestPreferenceChkBox;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.CheckBox[@index='2']")
	public WebElement newsAndCurrentAffairsInterestPreferenceChkBox;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.CheckBox[@index='2']")
	public WebElement sportsInterestPreferenceChkBox;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[5]/android.widget.CheckBox[@index='2']")
	public WebElement devotionAndSpiritualityInterestPreferenceChkBox;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]/android.widget.CheckBox[@index='2']")
	public WebElement cricketInterestPreferenceChkBox;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]/android.widget.CheckBox[@index='2']")
	public WebElement moviesInterestPreferenceChkBox;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]/android.widget.CheckBox[@index='2']")
	public WebElement entertainmentInterestPreferenceChkBox;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[9]/android.widget.CheckBox[@index='2']")
	public WebElement fashionAndBeautyInterestPreferenceChkBox;

	@FindBy(id = "com.koo.app:id/skip_btn")
	public WebElement SkipContinueButton;

	public PreferencesPage() {
		
	}

	public void VerifyUserIsAbleToSeeThePreferenceScreenAfterTheImageUploadScreenInOnboardingProcess() throws InterruptedException {
		new Search().iverifyUserIsRegistered();
		waitForVisibility(preferencesPage);
		Assert.assertTrue(isElementPresent(preferencesPage));
		
	}
	
	public void PreferencesIcons() throws InterruptedException{
		waitForVisibility(newsTvPreferenceIcon);
		Assert.assertTrue(isElementPresent(newsTvPreferenceIcon));
		Assert.assertTrue(isElementPresent(popularOnKooPreferenceIcon));
		Assert.assertTrue(isElementPresent(politicianspreferenceIcon));
		Assert.assertTrue(isElementPresent(entertainmentPreferenceIcon));
		Assert.assertTrue(isElementPresent(poetsandAuthorsPreferenceIcon));
		Assert.assertTrue(isElementPresent(journalistsPreferenceIcon));
		Assert.assertTrue(isElementPresent(sportsPreferenceIcon));
		Assert.assertTrue(isElementPresent(spiritualLeadersPreferenceIcon));
		Assert.assertTrue(isElementPresent(governmentServicesPreferenceIcon));
		Assert.assertTrue(isElementPresent(governmentOfficialsPreferenceIcon));
		Assert.assertTrue(isElementPresent(cricketersPreferenceIcon));
	}
	
	public void PreferencesCheckBoxes() throws InterruptedException{
		waitForVisibility(newsTvPreferenceChkBox);
		Assert.assertTrue(isElementPresent(newsTvPreferenceChkBox));
		Assert.assertTrue(isElementPresent(popularOnKooPreferenceChkBox));
		Assert.assertTrue(isElementPresent(politicianspreferenceChkBox));
		Assert.assertTrue(isElementPresent(entertainmentPreferenceChkBox));
		Assert.assertTrue(isElementPresent(poetsandAuthorsPreferenceChkBox));
		Assert.assertTrue(isElementPresent(journalistsPreferenceChkBox));
		Assert.assertTrue(isElementPresent(sportsPreferenceChkBox));
		Assert.assertTrue(isElementPresent(spiritualLeadersPreferenceChkBox));
		Assert.assertTrue(isElementPresent(governmentServicesPreferenceChkBox));
		Assert.assertTrue(isElementPresent(governmentOfficialsPreferenceChkBox));
		Assert.assertTrue(isElementPresent(cricketersPreferenceChkBox));
	}

	public void VerifyAllTheDataInThePreferenceScreenandInformativeTextsAreAppearingFromBackend() throws InterruptedException {
		waitForVisibility(newsTvPreference);
		Assert.assertTrue(isElementPresent(newsTvPreference));
		Assert.assertTrue(isElementPresent(popularOnKooPreference));
		Assert.assertTrue(isElementPresent(politicianspreference));
		Assert.assertTrue(isElementPresent(entertainmentPreference));
		Assert.assertTrue(isElementPresent(poetsandAuthorsPreference));
		Assert.assertTrue(isElementPresent(journalistsPreference));
		Assert.assertTrue(isElementPresent(sportsPreference));
		Assert.assertTrue(isElementPresent(spiritualLeadersPreference));
		Assert.assertTrue(isElementPresent(governmentServicesPreference));
		Assert.assertTrue(isElementPresent(governmentOfficialsPreference));
		Assert.assertTrue(isElementPresent(cricketersPreference));
		PreferencesIcons();
		PreferencesCheckBoxes();
	}

	public void VerifyUserisAbleToSelectandDeselectSingleMultiplePreferencesInterestsByTappingTheTextOnTheCheckox() throws InterruptedException {
		click(entertainmentPreference);
		Thread.sleep(1000);
		click(entertainmentPreference);
		Thread.sleep(1000);
		click(governmentOfficialsPreferenceChkBox);
		Thread.sleep(1000);
		click(governmentOfficialsPreferenceChkBox);
		Thread.sleep(1000);
		click(politicianspreferenceChkBox);
		Thread.sleep(1000);
		click(sportsPreference);
		Thread.sleep(1000);
		click(politicianspreferenceChkBox);
		Thread.sleep(1000);
		click(sportsPreference);
		Thread.sleep(1000);
		
	}

	public void VerifySelectedPreferencesShouldHaveSelectedCheckBoxandOtherstoHaveEmptyCheckBoxes() throws InterruptedException {
		click(poetsandAuthorsPreference);
		Assert.assertTrue(!newsTvPreferenceChkBox.isSelected());
		Assert.assertTrue(!politicianspreferenceChkBox.isSelected());
		Assert.assertTrue(!entertainmentPreferenceChkBox.isSelected());
		Assert.assertTrue(!journalistsPreferenceChkBox.isSelected());
		Assert.assertTrue(!sportsPreferenceChkBox.isSelected());
		Assert.assertTrue(!spiritualLeadersPreferenceChkBox.isSelected());
		Assert.assertTrue(!governmentServicesPreferenceChkBox.isSelected());
		Assert.assertTrue(!governmentOfficialsPreferenceChkBox.isSelected());
		Assert.assertTrue(!cricketersPreferenceChkBox.isSelected());
		
	}

	public void VerifyAftertheuserselectsSomePreferencesInTheOnboardingFlowTheTextOfTheButtonShouldChangetoContinueInsteadofSkipcontinue() throws InterruptedException {
		click(poetsandAuthorsPreference);
		Thread.sleep(2000);
		String beforetext = (SkipButton.getText());
		Assert.assertTrue(beforetext.equalsIgnoreCase("Skip / Continue"));
		click(entertainmentPreferenceChkBox);
		Thread.sleep(2000);
		String aftertext = (SkipButton.getText());
		Assert.assertTrue(aftertext.equalsIgnoreCase("Continue"));
		Assert.assertTrue(aftertext!=beforetext);
	}

	public void VerifyonTappingSkipContinueUserShouldMovetoNextScreenorFeed() throws InterruptedException {
		new Search().iverifyUserIsRegistered();
		new Search().waitforHomeScreen();
		
	}

	public void VerifyUserShouldMoveToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor15SecondsWithPerformingAnyActionsSelections() throws Exception {
		new NotificationPage().ILogoutToLoginWithAnotherAccountToCreateNotification();
		new LoginPage().waitForLoginScreen();
		new LoginPage().enterTestMobileNumber("1111100036");
		new LoginPage().enterTestOTPFromMobile();
		Thread.sleep(2000);
		waitForVisibility(preferencesPage);
		Assert.assertTrue(isElementPresent(preferencesPage));
		click(politicianspreference);
		Thread.sleep(15000);
		new Search().waitforHomeScreen();
	}

	public void VerifyOnceAfterSelectingAnyPreferenceFromOnboardingorPeoplesTabUserShouldNotSeeOnboardingPreferenceScreen() throws Exception {
		new NotificationPage().ILogoutToLoginWithAnotherAccountToCreateNotification();
		new LoginPage().waitForLoginScreen();
		new LoginPage().enterTestMobileNumber("1111100036");
		new LoginPage().enterTestOTPFromMobile();
		Assert.assertTrue(!isElementPresent(preferencesPage));
		new Search().waitforHomeScreen();
		waitForVisibility(peopleScreenTab);
		click(peopleScreenTab);
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(addMoreButton));
		click(addMoreButton);
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(peoplePreferencesPage));
		click(politicianspreference);
		waitForVisibility(doneButton);
		click(doneButton);
		new Search().waitforHomeScreen();
		
	}

	public void VerifyUserShouldMoveToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor30SecondsWithoutPerformingAnyActionsSelections() throws Exception {
		new NotificationPage().ILogoutToLoginWithAnotherAccountToCreateNotification();
		new LoginPage().waitForLoginScreen();
		new LoginPage().clickOnSignInWithEmail();
		new LoginPage().enterNewEmailID("updoertesting1234");
		new LoginPage().enterReceivedOTPFromEmail("updoertesting1234@gmail.com", "Test@1234", "Your Koo OTP");
		VerifyUserIsAbleToSeeThePreferenceScreenAfterTheImageUploadScreenInOnboardingProcess();
		Thread.sleep(30000);
		new Search().waitforHomeScreen();
	}

	public void VerifyYourPreferencesWidgetAtTheTopOnPeoplesTab() throws InterruptedException {
		VerifyUserIsAbleToSeeThePreferenceScreenAfterTheImageUploadScreenInOnboardingProcess();
		Assert.assertTrue(isElementPresent(preferencesPage));
		click(politicianspreference);
		click(entertainmentPreference);
		new Search().iverifyUserIsRegistered();
		new Search().waitforHomeScreen();
		waitForVisibility(peopleScreenTab);
		click(peopleScreenTab);
		waitForVisibility(prefrenceSection);
		prefrenceSection.getLocation();
		Assert.assertTrue(isElementPresent(prefrenceSection));
		
	}

	public void VerifyAllThePreferencesInterestsSelectedWhileOnboardingToBePresentInTheWidgetInTheSameOrderAsInOnboardingScreen() throws InterruptedException {
		waitForVisibility(politicianspreference);
		Assert.assertTrue(politicianspreference.getText().equalsIgnoreCase("Politicians"));
		waitForVisibility(entertainmentPreference);
		Assert.assertTrue(entertainmentPreference.getText().equalsIgnoreCase("Entertainment"));
	}

	public void VerifyAddMoreButtonAtTheEnd() throws InterruptedException {
		waitForVisibility(addMoreButton);
		Assert.assertTrue(isElementPresent(addMoreButton));
		Assert.assertTrue(!isElementPresent(addPrefrencesButton));
	}

	public void VerifyAddMoreButtonShouldNotBePresentInTheWidgetInCaseOfNoOnboardingPreferencesSelected() throws Exception {
		new NotificationPage().ILogoutToLoginWithAnotherAccountToCreateNotification();
		new LoginPage().waitForLoginScreen();
		new LoginPage().clickOnSignInWithEmail();
		new LoginPage().enterNewEmailID("updoertesting1234");
		new LoginPage().enterReceivedOTPFromEmail("updoertesting1234@gmail.com", "Test@1234", "Your Koo OTP");
		VerifyUserIsAbleToSeeThePreferenceScreenAfterTheImageUploadScreenInOnboardingProcess();
		new Search().iverifyUserIsRegistered();
		new Search().waitforHomeScreen();
		waitForVisibility(peopleScreenTab);
		click(peopleScreenTab);
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(prefrenceSection));
		Assert.assertTrue(isElementPresent(addPrefrencesButton));
		Assert.assertTrue(!isElementPresent(addMoreButton));	
		
	}

	public void VerifyOnTappingAddMoreButtonUserShouldNavigateToPeoplePreferencesScreen() throws InterruptedException {
		VerifyYourPreferencesWidgetAtTheTopOnPeoplesTab();
		VerifyAddMoreButtonAtTheEnd();
		click(addMoreButton);
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(peoplePreferencesPage));
		
	}

	public void VerifyOnboardingSelectedPreferencesShouldHavePrefilledSelectedCheckBoxAndOthersToHaveEmptyCheckBoxes() throws InterruptedException {
		Assert.assertTrue(!poetsandAuthorsPreferenceChkBox.isSelected());
		Assert.assertTrue(!newsTvPreferenceChkBox.isSelected());
		Assert.assertTrue(!journalistsPreferenceChkBox.isSelected());
		Assert.assertTrue(!sportsPreferenceChkBox.isSelected());
//		Assert.assertTrue(spiritualLeadersPreferenceChkBox.isSelected());
		Assert.assertTrue(!governmentServicesPreferenceChkBox.isSelected());
		Assert.assertTrue(!governmentOfficialsPreferenceChkBox.isSelected());
		click(politicianspreference);
		click(entertainmentPreference);
		Assert.assertTrue(!politicianspreference.isSelected());
		Assert.assertTrue(!entertainmentPreference.isSelected());
		click(entertainmentPreference);
		
	}

	public void VerifyUserIsAbleToScrollThroughThePreferencesProperly() throws InterruptedException {
		swipeToSeeDownsideElementsOfScreen(1);
		Thread.sleep(2000);
		swipeToSeeUpsideElementsOfScreen(1);
		
	}

	public void VerifyTheSelectionOrDeselectionStateShouldBeAutoSavedOnEveryInteractionOnTheButton() throws InterruptedException {
		Thread.sleep(2000);
		click(entertainmentPreference);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		swipeToSeeUpsideElementsOfScreen(2);
		Thread.sleep(1000);
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(addPrefrencesButton));
		Assert.assertTrue(!isElementPresent(addMoreButton));
		click(addPrefrencesButton);
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(peoplePreferencesPage));
		click(politicianspreference);
		click(entertainmentPreference);
		clickAndroidDeviceBackBttn();
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(entertainmentPreference));
		Assert.assertTrue(isElementPresent(politicianspreference));
		Assert.assertTrue(isElementPresent(addMoreButton));	
		click(addMoreButton);
		waitForVisibility(peoplePreferencesPage);
		click(politicianspreference);
		click(entertainmentPreference);
	
	}

	public void VerifyRespectiveProfilePicturesToBeDisplayedBelowAllThePreferences() throws InterruptedException {
		waitForVisibility(profilePictures);
		Assert.assertTrue(isElementPresent(entertainmentProfilePicture));
		Assert.assertTrue(isElementPresent(popularOnKooProfilePicture));
		Assert.assertTrue(isElementPresent(newsTvChannelsProfilePicture));
		Assert.assertTrue(isElementPresent(sportsProfilePicture));
		Assert.assertTrue(isElementPresent(governmentServicesProfilePicture));
		Assert.assertTrue(isElementPresent(postAndAuthorProfilePicture));
		Assert.assertTrue(isElementPresent(politiciansProfilePicture));
		Assert.assertTrue(isElementPresent(cricketersProfilePicture));
		Assert.assertTrue(isElementPresent(governmentOfficialsProfilePicture));
		swipeToDownsideTillElementPresent(spiritualLeadersProfilePicture, 2);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(journalistProfilePicture));
	
	}

	public void VerifyUserShouldNavigatetoPeopleScreenonTappingTheBackButtonSituatedBesideTheYourPreferencesTextHeader() throws InterruptedException {
		waitForVisibility(backButton);
		Assert.assertTrue(isElementPresent(backButton));
		click(backButton);
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(addPrefrencesButton));
		Assert.assertTrue(!isElementPresent(addMoreButton));
		
	}

	public void VerifyOnTappingOnAnyOfThePreferenceUserShouldNavigateToPreferenceDetailScreen() throws InterruptedException {
		VerifyUserIsAbleToSeeThePreferenceScreenAfterTheImageUploadScreenInOnboardingProcess();
		new Search().iverifyUserIsRegistered();
		new Search().waitforHomeScreen();
		waitForVisibility(peopleScreenTab);
		click(peopleScreenTab);
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(prefrenceSection));
		Assert.assertTrue(isElementPresent(addPrefrencesButton));
		click(addPrefrencesButton);
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(peoplePreferencesPage));
		Assert.assertTrue(isElementPresent(entertainmentProfilePicture));
		click(entertainmentProfilePicture);
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(popularOnKooProfilePicture));
		click(popularOnKooProfilePicture);
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		waitForVisibility(peoplePreferencesPage);
		click(entertainmentProfilePicture);
	}

	public void VerifyUserShouldSeeTheListOfIndividualProfilesCreatorsRelatedToThePreferenceInterest() throws InterruptedException {
		int numofList = listOfIndividual.size();
		for(int i =0; i<numofList;i++) {
			Assert.assertTrue(isElementPresent(followButtons.get(i)));
			Assert.assertTrue(isElementPresent(names.get(i)));
//			Assert.assertTrue(isElementPresent(handleNames.get(i)));
			Assert.assertTrue(isElementPresent(profileImages.get(i)));
		}
		
	}

	public void VerifyUserIsAbleToScrollThroughTheProfilesProperly() throws InterruptedException {
		VerifyUserIsAbleToScrollThroughThePreferencesProperly();
		
	}

	public void VerifyUserShouldBeAbletoFolloworUnfollowIndividualProfiles() throws InterruptedException {
		Thread.sleep(1000);
		waitForVisibility(followButton);
		click(followButton);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(followingButton));
		click(followingButton);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(noBttnOnUnfollowConfirmationMsg));
		Assert.assertTrue(isElementPresent(yesBttnOnUnfollowConfirmationMsg));
		click(yesBttnOnUnfollowConfirmationMsg);
		Thread.sleep(2000);
	}

	public void VerifyonTappingonAddToPreferencesUserShouldSeeaConformationToastMessage() throws InterruptedException {
		waitForVisibility(addToPrefrencesChkBox);
		Assert.assertTrue(isElementPresent(addToPrefrencesChkBox));
		Assert.assertTrue(addToPrefrencesChkBox.getText().equalsIgnoreCase("Add to preferences"));
		click(addToPrefrencesChkBox);
		Thread.sleep(2000);
	}

	public void VerifyonTappingonAddtoPreferencesTheCheckBoxShouldbeEnabledAndTexttoChangetoPrefered() throws InterruptedException {
		waitForVisibility(PrefrencesChkBox);
		Assert.assertTrue(isElementPresent(PrefrencesChkBox));
		Assert.assertTrue(PrefrencesChkBox.getText().equalsIgnoreCase("Preferred"));
		Thread.sleep(2000);
		
	}

	public void VerifyonTappingonBackButtonUserShouldNavigateBacktoPeoplePreferencesScreen() throws InterruptedException {
		waitForVisibility(peoplePrefrencesBackButton);
		Assert.assertTrue(isElementPresent(peoplePrefrencesBackButton));
		click(peoplePrefrencesBackButton);
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(peoplePreferencesPage));	
	}

	public void VerifySelectedCheckBoxForRespectivePreference() throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(entertainmentPreference));
		
	}

	public void VerifyOnTappingDoneButtonUserShouldNavigateBackToPeoplesScreenAndTheSelectedPreferenceShouldReflectInTheYourPreferencesWidget() throws InterruptedException {
		Thread.sleep(2000);
		new Search().iverifyUserIsRegistered();
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(prefrenceSection));
		waitForVisibility(entertainmentPreference);
		Assert.assertTrue(entertainmentPreference.getText().equalsIgnoreCase("Entertainment"));
		VerifyAddMoreButtonAtTheEnd();
		click(addMoreButton);
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(peoplePreferencesPage));
		click(entertainmentPreference);
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(prefrenceSection));
		Assert.assertTrue(isElementPresent(addPrefrencesButton));
		Assert.assertTrue(!isElementPresent(addMoreButton));	
		
		
	}
	public void VerifyUserisAbleToSelectandDeselectSingleMultipleInterestsByTappingOnTheCheckbox() throws InterruptedException {
		click(politicsInteresetPreferenceChkBox);
		Thread.sleep(5000);
		click(politicsInteresetPreferenceChkBox);
		Thread.sleep(1000);

		click(humourAndMemeInterestPreferenceChkBox);
		Thread.sleep(1000);
		click(humourAndMemeInterestPreferenceChkBox);
		Thread.sleep(1000);

		click(newsAndCurrentAffairsInterestPreferenceChkBox);
		Thread.sleep(1000);
		click(newsAndCurrentAffairsInterestPreferenceChkBox);
		Thread.sleep(1000);

		click(sportsInterestPreferenceChkBox);
		Thread.sleep(1000);
		click(sportsInterestPreferenceChkBox);
		Thread.sleep(1000);

		click(devotionAndSpiritualityInterestPreferenceChkBox);
		Thread.sleep(1000);
		click(devotionAndSpiritualityInterestPreferenceChkBox);
		Thread.sleep(1000);

		click(cricketInterestPreferenceChkBox);
		Thread.sleep(1000);
		click(cricketInterestPreferenceChkBox);
		Thread.sleep(1000);

		click(moviesInterestPreferenceChkBox);
		Thread.sleep(1000);
		click(moviesInterestPreferenceChkBox);
		Thread.sleep(1000);

		click(entertainmentInterestPreferenceChkBox);
		Thread.sleep(1000);
		click(entertainmentInterestPreferenceChkBox);
		Thread.sleep(1000);

		click(fashionAndBeautyInterestPreferenceChkBox);
		Thread.sleep(1000);
		click(fashionAndBeautyInterestPreferenceChkBox);
		Thread.sleep(1000);
	}
	public void VerifySelectedInteresetPreferencesShouldHaveSelectedCheckBoxandOtherstoHaveEmptyCheckBoxes() throws InterruptedException {
		click(politicsInteresetPreferenceChkBox);
		Assert.assertTrue(!humourAndMemeInterestPreferenceChkBox.isSelected());
		Assert.assertTrue(!newsAndCurrentAffairsInterestPreferenceChkBox.isSelected());
		Assert.assertTrue(!sportsInterestPreferenceChkBox.isSelected());
		Assert.assertTrue(!devotionAndSpiritualityInterestPreferenceChkBox.isSelected());
		Assert.assertTrue(!cricketInterestPreferenceChkBox.isSelected());
		Assert.assertTrue(!moviesInterestPreferenceChkBox.isSelected());
		Assert.assertTrue(!entertainmentInterestPreferenceChkBox.isSelected());
		Assert.assertTrue(!fashionAndBeautyInterestPreferenceChkBox.isSelected());

	}
	public void VerifyAftertheuserselectsSomeInterestPreferencesTheTextOfTheButtonShouldChangetoContinueInsteadofSkipcontinue() throws InterruptedException {
		click(politicsInteresetPreferenceChkBox);
		Thread.sleep(2000);
		String beforetext = (SkipContinueButton.getText());
		Assert.assertTrue(beforetext.equalsIgnoreCase("Skip / Continue"));
		click(humourAndMemeInterestPreferenceChkBox);
		Thread.sleep(2000);
		String aftertext = (SkipContinueButton.getText());
		Assert.assertTrue(aftertext.equalsIgnoreCase("Continue"));
		click(SkipContinueButton);
		}

	public void VerifyUserShouldNavigateToFeedOrNextScreenifTheUserStaysonPreferenceScreenFor15SecondsWithPerformingAnyActionsSelections() throws Exception {
		new NotificationPage().ILogoutToLoginWithAnotherAccountToCreateNotification();
		new LoginPage().waitForLoginScreen();
		new LoginPage().enterTestMobileNumber("1111100036");
		new LoginPage().enterTestOTPFromMobile();
		Thread.sleep(2000);
		waitForVisibility(preferencesPage);
		Assert.assertTrue(isElementPresent(preferencesPage));
		click(entertainmentInterestPreferenceChkBox);
		Thread.sleep(15000);
		new Search().waitforHomeScreen();
	}

	public void VerifyOnceAfterSelectingAnyInterestPreferenceorPeopleTabUserShouldNotSeeOnboardingPreferenceScreen() throws Exception {
		new NotificationPage().ILogoutToLoginWithAnotherAccountToCreateNotification();
		new LoginPage().waitForLoginScreen();
		new LoginPage().enterTestMobileNumber("1111100036");
		new LoginPage().enterTestOTPFromMobile();
		Assert.assertTrue(!isElementPresent(preferencesPage));
		new Search().waitforHomeScreen();
		waitForVisibility(peopleScreenTab);
		click(peopleScreenTab);
		waitForVisibility(prefrenceSection);
		Assert.assertTrue(isElementPresent(addMoreButton));
		click(addMoreButton);
		waitForVisibility(peoplePreferencesPage);
		Assert.assertTrue(isElementPresent(peoplePreferencesPage));
		click(politicsInteresetPreferenceChkBox);
		waitForVisibility(doneButton);
		click(doneButton);
		new Search().waitforHomeScreen();

	}

	//new by sumeet
	public void VerifyonTappingSkipContinueUserShouldMovetoProfileToFollowScreen() throws InterruptedException {
		new Search().iverifyUserIsRegistered();
		new Search().waitforProfileFollowScreen();
	}
	public void VerifyUserIsOnHomeScreeWithoutSelectingInterestByClickingSkipcontinue() throws InterruptedException {

		Thread.sleep(5000);
		click(SkipContinueButton);
	}
}
