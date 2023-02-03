package com.qa.pages;

import static org.junit.Assert.assertFalse; 

import java.sql.Driver;  
import java.util.List;

import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Enums;
import com.qa.pages.Filters.Languages;
import com.qa.utils.TestUtils;

public class EditProfilePage extends BasePage{
	TestUtils utils = new TestUtils();
	PermissionHandlerPage permissions = new PermissionHandlerPage();
	
///// Header Section  /////
	
	/// Profile page///
	
	@FindBy(id = "com.koo.app:id/toolbar_profile")
	public WebElement HomeMainScreen;
	
	@FindBy(id ="com.koo.app:id/clProfile")
	public WebElement Profileicon;
	
	@FindBy(id = "com.koo.app:id/toolbar_heading_textview")
	public WebElement ProfileNameHeading;
	
	//@FindBy(xpath = "//android.view.ViewGroup[@index='1']/android.widget.FrameLayout[@index='0']")
	//public WebElement ProfilePic;

	@FindBy(id = "com.koo.app:id/channel_imageview")
	public WebElement ProfilePic;
	
	@FindBy(id="com.koo.app:id/channel_name_textview")
	public WebElement ProfileName;
	
	@FindBy(id="com.koo.app:id/handle_name_textview")
	public WebElement ProfileHandelName;
	
	@FindBy(id ="com.koo.app:id/edit_profile_button")
	public WebElement EditProfileButton;
	
	/// Edit Profile Page /////
	
	@FindBy(id="com.koo.app:id/toolbar_heading_textview")
	public WebElement ProfileNameHeader;
	
	@FindBy(xpath="//android.widget.ImageButton")
	public WebElement ProfileBackButton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Edit Profile']")
	public WebElement EditProfileText;
	
	@FindBy(id ="com.koo.app:id/name_textview")
	public WebElement ProfileNameText;
	
	@FindBy(id ="com.koo.app:id/profile_image_frame")
	public WebElement ProfileImage;
	
	@FindBy(id ="com.koo.app:id/change_imageview")
	public WebElement CameraIcon;

	@FindBy(id ="com.koo.app:id/handle_name_textview")
	public WebElement ProfessionTextAtProfileName;
	
	@FindBy(id="com.koo.app:id/float_name")
	public WebElement NameFieldTitle;
	
	@FindBy(id="com.koo.app:id/et_name")
	public WebElement NameTextField;
	
	@FindBy(id="com.koo.app:id/iv_person")
	public WebElement PersonIcon;
	
	@FindBy(id="com.koo.app:id/float_handle")
	public WebElement HandelFieldTitle;
	
	@FindBy(id="com.koo.app:id/et_handle")
	public WebElement HandelTextField;
	
	@FindBy(id="com.koo.app:id/iv_handle")
	public WebElement HandelIcon;
	
	@FindBy(id="com.koo.app:id/float_profession")
	public WebElement ProfessionFieldTitle;
	
	@FindBy(id="com.koo.app:id/tv_profession")
	public WebElement ProfessionTextField;
	
	@FindBy(id="com.koo.app:id/iv_profession")
	public WebElement ProfessionIcon;
	
	@FindBy(id="com.koo.app:id/float_currentLocation")
	public WebElement CurrentLocationFieldTitle;
	
	@FindBy(id="com.koo.app:id/tv_currentLocation")
	public WebElement CurrentLocationTextField;
	
	@FindBy(id="com.koo.app:id/iv_currentLocation")
	public WebElement CurrentLocationIcon;
	
	@FindBy(id="com.koo.app:id/float_location")
	public WebElement LocationFieldTitle;
	
	@FindBy(id="com.koo.app:id/tv_location")
	public WebElement LocationTextField;
	
	@FindBy(id="com.koo.app:id/iv_location")
	public WebElement LocationIcon;
	
	@FindBy(id="com.koo.app:id/float_bio")
	public WebElement BioFieldTitle;
	
	@FindBy(id="com.koo.app:id/tv_bio_expandable")
	public WebElement BioTextField;
	
	@FindBy(id="com.koo.app:id/iv_bio")
	public WebElement BioIcon;
	
	@FindBy(id="com.koo.app:id/float_dob")
	public WebElement DOBFieldTitle;
	
	@FindBy(id="com.koo.app:id/tv_dob")
	public WebElement DOBTextField;
	
	@FindBy(id="com.koo.app:id/iv_dob")
	public WebElement DOBIcon;
	
	@FindBy(id="com.koo.app:id/float_website")
	public WebElement WebsiteFieldTitle;
	
	@FindBy(id="com.koo.app:id/tv_website")
	public WebElement WebsiteTextField;
	
	@FindBy(id="com.koo.app:id/iv_website")
	public WebElement WebsiteIcon;
	
	@FindBy(id="com.koo.app:id/float_email")
	public WebElement EmailFieldTitle;
	
	@FindBy(id="com.koo.app:id/tv_mail")
	public WebElement EmailTextField;
	
	@FindBy(id="com.koo.app:id/iv_email")
	public WebElement EmailIcon;
	
	@FindBy(id="com.koo.app:id/float_gender")
	public WebElement GenderSelectTitle;
	
	@FindBy(id="com.koo.app:id/radio_gender")
	public WebElement GenderSelectionField;
	
	@FindBy(id="com.koo.app:id/iv_gender")
	public WebElement GenderSelectionIcon;
	
	@FindBy(id="com.koo.app:id/float_marital_status")
	public WebElement MaritalStatusFieldTitle;
	
	@FindBy(id="com.koo.app:id/radio_marital_status")
	public WebElement MaritalSelectionField;
	
	@FindBy(id="com.koo.app:id/iv_marital_status")
	public WebElement MaritalStatusIcon;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='13']/android.widget.LinearLayout[@index='1']")
	public WebElement SocialLinksTitle;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='13']/android.widget.LinearLayout[@index='1']")
	public WebElement SocialLinksField;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='13']/android.widget.LinearLayout[@index='0']")
	public WebElement ShareLinksIcon;
	
	@FindBy(id="com.koo.app:id/iv_social_facebook")
	public WebElement FacebookLink;
	
	@FindBy(id="com.koo.app:id/iv_social_twitter")
	public WebElement TwitterLink;
	
	@FindBy(id="com.koo.app:id/iv_social_linkedin")
	public WebElement LinkedinLink;
	
	@FindBy(id="com.koo.app:id/float_mobile")
	public WebElement MobileNoFieldTitle;
	
	@FindBy(id="com.koo.app:id/tv_mobile_number")
	public WebElement MobileNoTextField;
	
	@FindBy(id="com.koo.app:id/iv_mobile")
	public WebElement MobileIcon;
	
	//@FindBy(xpath="//android.widget.LinearLayout[@index='14']/android.widget.TextView[@index='1']")
	@FindBy(xpath = "//android.widget.TextView[@text='Qualifications']")
	public WebElement QualificationTitle;
	
	@FindBy(id="com.koo.app:id/qualification_add_new")
	public WebElement AddQualiFicationButton;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='14']/android.widget.LinearLayout[@index='0']")
	public WebElement QualificationIcon;
	
	//@FindBy(xpath="//android.widget.LinearLayout[@index='15']/android.widget.TextView[@index='1']")
	@FindBy(xpath = "//android.widget.TextView[@text='Work Experience']")
	public WebElement ExperienceTitle;
	
	@FindBy(id="com.koo.app:id/exp_add_new")
	public WebElement AddExperienceButton;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='15']/android.widget.TextView[@index='1']")
	public WebElement ExperienceIcon;
	
	/// camera page///
	
	//@FindBy(xpath ="//android.view.ViewGroup[@index='1']/android.widget.ImageButton[@index='0']")
	//public WebElement CameraBackButton;

	@FindBy(id="com.koo.app:id/layout_controls")
	public WebElement Cameraicon;

	@FindBy(id="com.koo.app:id/album_image")
	public WebElement CameraButton;

	@FindBy(id="com.koo.app:id/album_name")
	public WebElement galleryscreen;

	@FindBy(id="com.koo.app:id/back_imageview")
	public WebElement gallerybackbutton;

	@FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	public WebElement CameraBackButton;
	
	//// Back Button ///
	
	@FindBy(xpath="//android.widget.ImageButton")
	public WebElement BackButton;
	
	/// All ///
	
	@FindBy(id="com.koo.app:id/toolbar_title")
	public WebElement Pageheader;
	
	@FindBy(id="com.koo.app:id/single_line_edit")
	public WebElement Inputfield;
	
	//@FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	public WebElement CameraPermission;
	
	@FindBy(id="com.android.permissioncontroller:id/permission__message")
	public WebElement CameraPermissionMessage;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_message")
	public WebElement CameraPermissionMessage2;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	public WebElement CameraPermission2;
	
	@FindBy(id="android:id/message")
	public WebElement LocationPermision;

	@FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	public WebElement permission1;

	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	public WebElement permission2;

	@FindBy(id="android:id/button1")
	public WebElement LocationOkButton;

	@FindBy(id="com.koo.app:id/tv_profession")
	public WebElement Handlesuggest;
	
	@FindBy(id="com.koo.app:id/multiline_edit")
	public WebElement BioInputField;
	
	@FindBy(id="com.koo.app:id/header_text")
	public WebElement LinkHeaders;
	
	@FindBy(id="com.koo.app:id/phone_no_textview_subtitle")
	public WebElement Enter_Your_Phone_Number_Page;
	
	@FindBy(id="com.koo.app:id/save_button")
	public WebElement SaveChangesButton;
	
	@FindBy(id="com.koo.app:id/tv_profession")
	public WebElement LocationSuggestion;
	
	@FindBy(id="com.koo.app:id/edit_social")
	public WebElement SocialLinkField;
	
	@FindBy(id="com.koo.app:id/save_link_view")
	public WebElement SaveLinkButton;
	
	@FindBy(id ="com.koo.app:id/profession_textview")
	public WebElement ProfessionText;
	
	@FindBy(id="android:id/date_picker_header_year")
	public WebElement CalenderYear;
	
	@FindBy(id="android:id/date_picker_header_date")
	public WebElement CalenderDate;
	
	@FindBy(id="android:id/prev")
	public WebElement CalenderPreviousButton;
	
	@FindBy(id="android:id/next")
	public WebElement CalenderNextButton;
	
	@FindBy(id="android:id/month_view")
	public  WebElement MonthDates;
	
	@FindBy(id="android:id/date_picker_year_picker")
	public WebElement ListOfYears;
	
	@FindBy(id="android:id/button2")
	public WebElement CalenderCancle;
	
	@FindBy(id="android:id/button1")
	public WebElement CalenderOk;
	
	@FindBy(xpath = "//android.widget.ListView[@index='0']/android.widget.TextView[@index='2']")
	public WebElement YearSelected;
	
	@FindBy(xpath = "//android.view.View[@index='1']/android.view.View[@index='2']")
	public WebElement DateSelected;
	
	@FindBy(id = "com.koo.app:id/open_link_view")
	public WebElement OpenLinkButton;
	
	@FindBy(id = "com.koo.app:id/clear_text")
	public WebElement ClearLinkButton;
	
	@FindBy(id="com.android.chrome:id/toolbar")
	public WebElement Page;
	
	@FindBy(id="com.android.chrome:id/url_bar")
	public WebElement UrlBar;
	
	@FindBy(id="com.android.chrome:id/close_button")
	public WebElement ChromeCloseButton;
	
	@FindBy(id="android.view.View")
	public WebElement TwitterIcon;
	
	@FindBy(id="com.koo.app:id/action_remove")
	public WebElement DeleteButton;
	
	
	////// Qualification and Work Experience //////
	
	@FindBy(id="com.koo.app:id/title")
	public WebElement EnterCertification;
	
	@FindBy(id="com.koo.app:id/institution")
	public WebElement EnterInstitution;
	
	@FindBy(id="com.koo.app:id/duration_from")
	public WebElement YearOfPassing;
	
	@FindBy(id="com.koo.app:id/duration_to")
	public WebElement YearOfPassingTo;
	
	@FindBy(id="com.koo.app:id/exp_current_switch")
	public WebElement CurrentlyButton;
	
	@FindBy(id="com.koo.app:id/no_qualification")
	public WebElement NoQualificationText;
	
	@FindBy(id="com.koo.app:id/no_experience")
	public WebElement NoExperienceText;
	
	
	
	///// Validation Message and Mark //////
	
	@FindBy(id="com.koo.app:id/textinput_error")
	public WebElement VallidationMessage;
	
	@FindBy(id="com.koo.app:id/text_input_error_icon")
	public WebElement VallidationIcon;
	
	@FindBy(id="android:id/message")
	public WebElement LocationVallidationMessage;
	
	@FindBy(id="android:id/button1")
	public WebElement LocationVallidationButton;
	
	
	//////  Profile Page //////
	
	@FindBy(id ="com.koo.app:id/profession_textview")
	public WebElement ProfileProfessionText;
	
	@FindBy(id ="com.koo.app:id/description_textview")
	public WebElement ProfileDescriptionText;
	
	@FindBy(id ="com.koo.app:id/tv_location")
	public WebElement UserLocation;
	
	@FindBy(id ="com.koo.app:id/tv_joining")
	public WebElement KooJoiningDate;
	
	@FindBy(id ="com.koo.app:id/tv_gender")
	public WebElement GenderText;
	
	@FindBy(id ="com.koo.app:id/tv_maritalstatus")
	public WebElement MaritalStatus;
	
	@FindBy(id ="com.koo.app:id/tv_dob")
	public WebElement UserDOB;
	

	@FindBy(id ="com.koo.app:id/tv_facebook")
	public WebElement UserFacebook;

	@FindBy(id ="com.koo.app:id/tv_twitter")
	public WebElement UserTwitter;

	@FindBy(id ="com.koo.app:id/tv_linkedin")
	public WebElement UserLinkedIn;
	
	@FindBy(id ="com.koo.app:id/tv_youtube")
	public WebElement UserLink;
	
	@FindBy(id="com.koo.app:id/description_textview")
	public WebElement UserDescription;
	
	@FindBy(id ="com.koo.app:id/read_more")
	public WebElement ReadMoreButton;
	
	@FindBy(id ="com.koo.app:id/show_more_text")
	public WebElement MoreInfoButton;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='14']/androidx.recyclerview.widget.RecyclerView[@index='1']/android.view.ViewGroup[@index='0']")
	public WebElement Qualification1;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='14']/androidx.recyclerview.widget.RecyclerView[@index='1']/android.view.ViewGroup[@index='0']")
	public WebElement Qualification2;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='15']/androidx.recyclerview.widget.RecyclerView[@index='1']/android.view.ViewGroup[@index='0']")
	public WebElement Experience1;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='15']/androidx.recyclerview.widget.RecyclerView[@index='1']/android.view.ViewGroup[@index='1']")
	public WebElement Experience2;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='14']/androidx.recyclerview.widget.RecyclerView[@index='1']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='2']")
	public WebElement QualificationEditButton;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index=15]/androidx.recyclerview.widget.RecyclerView[@index='1']/android.view.ViewGroup[@index='0']/android.widget.ImageView[@index='2']")
	public WebElement ExperienceEditButton;
	
	@FindBy(id="com.koo.app:id/iv_dob_switch")
	public WebElement DoBToggleSwitch;
	
	@FindBy(id="com.koo.app:id/iv_dob_year_switch")
	public WebElement DobYearSwitch;
	
	@FindBy(id="com.koo.app:id/login_header")
	public WebElement EmailLogInPAge;


	
	
	
	
	
	
	
	
	
	public EditProfilePage(){
	}
	

	public void goToProfilePage() throws InterruptedException {
		Thread.sleep(5000);
		waitForVisibility(HomeMainScreen);		
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		waitForVisibility(Profileicon);
		click(Profileicon);
		waitForVisibility(ProfileNameHeading);
	}
	
	
	public void IverifyEditProfileTextAndBackButtonOnHeader() throws InterruptedException {
		goToProfilePage();
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(ProfilePic));
		Assert.assertTrue(isElementPresent(ProfileName));
		Assert.assertTrue(isElementPresent(ProfileHandelName));
		Assert.assertTrue(isElementPresent(EditProfileButton));
		Assert.assertTrue(isElementPresent(ProfileNameHeader));
		click(EditProfileButton);
		waitForVisibility(ProfileBackButton);
		Assert.assertTrue(isElementPresent(ProfileBackButton));
		Assert.assertTrue(isElementPresent(EditProfileText));
		Assert.assertTrue(isElementPresent(ProfileNameText));
		Assert.assertTrue(isElementPresent(ProfileImage));
		Assert.assertTrue(isElementPresent(CameraIcon));
		Assert.assertTrue(isElementPresent(ProfessionTextAtProfileName));
		//swipeToSeeDownsideElementsOfScreen(3);		
	}


	public void IverifyBelowFollowingFieldsInEditProfile() throws InterruptedException {
		waitForVisibility(NameFieldTitle);
		Assert.assertTrue(isElementPresent(NameFieldTitle));
		Assert.assertTrue(isElementPresent(NameTextField));
		Assert.assertTrue(isElementPresent(PersonIcon));
		Assert.assertTrue(isElementPresent(HandelFieldTitle));
		Assert.assertTrue(isElementPresent(HandelTextField));
		Assert.assertTrue(isElementPresent(HandelIcon));
		Assert.assertTrue(isElementPresent(ProfessionFieldTitle));
		Assert.assertTrue(isElementPresent(ProfessionTextField));
		Assert.assertTrue(isElementPresent(ProfessionIcon));
		Assert.assertTrue(isElementPresent(CurrentLocationFieldTitle));
		Assert.assertTrue(isElementPresent(CurrentLocationTextField));
		Assert.assertTrue(isElementPresent(CurrentLocationIcon));
		Assert.assertTrue(isElementPresent(LocationFieldTitle));
		Assert.assertTrue(isElementPresent(LocationTextField));
		Assert.assertTrue(isElementPresent(LocationIcon));
		waitForVisibility(BioFieldTitle);
		Assert.assertTrue(isElementPresent(BioFieldTitle));
		Assert.assertTrue(isElementPresent(BioTextField));
		Assert.assertTrue(isElementPresent(BioIcon));
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(DOBFieldTitle));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(DOBIcon));
		Assert.assertTrue(isElementPresent(WebsiteFieldTitle));
		Assert.assertTrue(isElementPresent(WebsiteTextField));
		Assert.assertTrue(isElementPresent(WebsiteIcon));
		Assert.assertTrue(isElementPresent(EmailFieldTitle));
		Assert.assertTrue(isElementPresent(EmailTextField));
		Assert.assertTrue(isElementPresent(EmailIcon));
		Assert.assertTrue(isElementPresent(MobileNoFieldTitle));
		Assert.assertTrue(isElementPresent(MobileNoTextField));
		Assert.assertTrue(isElementPresent(MobileIcon));
		//swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(GenderSelectionField));
		Assert.assertTrue(isElementPresent(GenderSelectionIcon));
		Assert.assertTrue(isElementPresent(GenderSelectTitle));
		Assert.assertTrue(isElementPresent(MaritalStatusFieldTitle));
		Assert.assertTrue(isElementPresent(MaritalSelectionField));
		Assert.assertTrue(isElementPresent(MaritalStatusIcon));
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(SocialLinksField);
		//Assert.assertTrue(isElementPresent(SocialLinksTitle));
		Assert.assertTrue(isElementPresent(SocialLinksField));
		Assert.assertTrue(isElementPresent(ShareLinksIcon));
		Assert.assertTrue(isElementPresent(FacebookLink));
		Assert.assertTrue(isElementPresent(TwitterLink));
		Assert.assertTrue(isElementPresent(QualificationTitle));
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(AddQualiFicationButton);
		Assert.assertTrue(isElementPresent(AddQualiFicationButton));
		//Assert.assertTrue(isElementPresent(QualificationIcon));
		if(isElementPresent(NoQualificationText)) {
			Assert.assertTrue(NoQualificationText.getText().equalsIgnoreCase("No qualifications added"));
		}
		
		Assert.assertTrue(isElementPresent(ExperienceTitle));
		Assert.assertTrue(isElementPresent(AddExperienceButton));
		//Assert.assertTrue(isElementPresent(ExperienceIcon));
		if(isElementPresent(NoExperienceText)) {
			Assert.assertTrue(NoExperienceText.getText().equalsIgnoreCase("No work experience added"));
		}
		
	}


	public void IverifyTappingCameraIconFunctionalityAndComingBack() throws InterruptedException {
		Thread.sleep(2000);
		swipeToSeeUpsideElementsOfScreen(3);
		waitForVisibility(ProfileImage);
		Assert.assertTrue(isElementPresent(ProfileImage));
		click(ProfileImage);
		Thread.sleep(6000);
		masterPermissionHandler();
		/*if(isElementPresent(CameraPermission));
		{
			Assert.assertTrue(isElementPresent(CameraPermission));
			click(CameraPermission);
			Thread.sleep(4000);
			//waitForVisibility(CameraPermission2);
			//Assert.assertTrue(isElementPresent(CameraPermission2));
			//click(CameraPermission);
			//Thread.sleep(2000);
		}
	/*	waitForVisibility(CameraBackButton);
		Assert.assertTrue(isElementPresent(CameraBackButton));
		Assert.assertTrue(isElementPresent(CameraButton));
		click(CameraBackButton);
		Thread.sleep(1000);
		*/
		waitForVisibility(galleryscreen);
		Assert.assertTrue(isElementPresent(gallerybackbutton));
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(CameraButton));
		click(CameraButton);
		Thread.sleep(1000);
		if(isElementPresent(CameraPermission));
		{
			Assert.assertTrue(isElementPresent(CameraPermission));
			click(CameraPermission);
			Thread.sleep(2000);
		}

		waitForVisibility(CameraBackButton);
		Assert.assertTrue(isElementPresent(CameraBackButton));
		click(CameraBackButton);
		Thread.sleep(1000);
		//clickAndroidDeviceBackBttn();
		waitForVisibility(gallerybackbutton);
		click(gallerybackbutton);
		Thread.sleep(1000);
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		waitForVisibility(ProfileBackButton);
		Assert.assertTrue(isElementPresent(ProfileBackButton));
		Assert.assertTrue(isElementPresent(EditProfileText));
		Assert.assertTrue(isElementPresent(ProfileNameText));
		Assert.assertTrue(isElementPresent(ProfileImage));
		Assert.assertTrue(isElementPresent(CameraIcon));
		Assert.assertTrue(isElementPresent(ProfessionTextAtProfileName));
		click(CameraIcon);
		Thread.sleep(2000);
		if(isElementPresent(CameraPermission));
		waitForVisibility(gallerybackbutton);
		click(gallerybackbutton);
		//clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		waitForVisibility(ProfileBackButton);
		Assert.assertTrue(isElementPresent(ProfileBackButton));
		Assert.assertTrue(isElementPresent(EditProfileText));
		Assert.assertTrue(isElementPresent(ProfileNameText));
		Assert.assertTrue(isElementPresent(ProfileImage));
		Assert.assertTrue(isElementPresent(CameraIcon));
		Assert.assertTrue(isElementPresent(ProfessionTextAtProfileName));
	}

	public void masterPermissionHandler() throws InterruptedException {
		//this function takes care of permissions being shown in any order, add more permission types to accommodate devices
		try {
			if(isElementPresent(permission1)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
				Thread.sleep(2000);
			}
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
				Thread.sleep(2000);
			}
			if(isElementPresent(permission1)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
				Thread.sleep(2000);
			}
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
				Thread.sleep(2000);
			}
		}catch (Exception e) {
			System.out.println("None of the permission types matched ");
			e.getStackTrace();
		}
		return;
	}
	public void IverifyTappingOnVariousFieldOnEditProfileAndComingBack() throws InterruptedException {
		waitForVisibility(NameTextField);
		Assert.assertTrue(isElementPresent(NameTextField));
		click(NameTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Name"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isElementPresent(BackButton));
		clickAndroidDeviceBackBttn();
		click(BackButton);
		waitForVisibility(HandelTextField);
		Assert.assertTrue(isElementPresent(HandelTextField));
		click(HandelTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Handle"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isElementPresent(BackButton));
		clickAndroidDeviceBackBttn();
		click(BackButton);
		waitForVisibility(ProfessionTextField);
		Assert.assertTrue(isElementPresent(ProfessionTextField));
		click(ProfessionTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Profession"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertFalse(!isElementVisible(DeleteButton));
		clickAndroidDeviceBackBttn();
		click(BackButton);
		waitForVisibility(CurrentLocationTextField);
		Assert.assertTrue(isElementPresent(CurrentLocationTextField));
		Assert.assertTrue(isElementPresent(LocationTextField));
		click(LocationTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Location"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertFalse(!isElementVisible(DeleteButton));
		clickAndroidDeviceBackBttn();
		swipeToSeeDownsideElementsOfScreen(3);
		swipeToSeeUpsideElementsOfScreen(3);
		click(BackButton);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(BioTextField);
		Assert.assertTrue(isElementPresent(BioTextField));
		click(BioTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Bio"));
		Assert.assertTrue(isElementPresent(BioInputField));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertFalse(!isElementVisible(DeleteButton));
		clickAndroidDeviceBackBttn();
		click(BackButton);
		waitForVisibility(DOBTextField);
		Assert.assertTrue(isElementPresent(DOBTextField));
		click(DOBTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Date of Birth"));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertFalse(!isElementVisible(DeleteButton));
		click(BackButton);
		waitForVisibility(WebsiteTextField);
		Assert.assertTrue(isElementPresent(WebsiteTextField));
		click(WebsiteTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Website"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementVisible(DeleteButton));
		clickAndroidDeviceBackBttn();
		click(BackButton);
		waitForVisibility(EmailTextField);
		Assert.assertTrue(isElementPresent(EmailTextField));
		//click(EmailTextField);		
		Assert.assertTrue(isElementPresent(MobileNoTextField));		
//		Assert.assertTrue(MobileNoTextField.getText().equalsIgnoreCase("Enter your phone number"));
		click(MobileNoTextField);
		Thread.sleep(2000);
		/////// If User Is Not LogedIn With Phone Number//////
		try {
			if (isElementPresent(Enter_Your_Phone_Number_Page))
			{
				waitForVisibility(Enter_Your_Phone_Number_Page);
				Assert.assertTrue(isElementPresent(Enter_Your_Phone_Number_Page));
				Assert.assertTrue(Enter_Your_Phone_Number_Page.getText().equalsIgnoreCase("Enter your phone number"));
				Thread.sleep(2000);
				clickAndroidDeviceBackBttn();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(SocialLinksField);
		Assert.assertTrue(isElementPresent(SocialLinksField));
		Assert.assertTrue(isElementPresent(ShareLinksIcon));
		Assert.assertTrue(isElementPresent(FacebookLink));
		click(FacebookLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Facebook"));
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		if(!isElementPresent(TwitterLink)) {
			clickAndroidDeviceBackBttn();
		}
		
		waitForVisibility(TwitterLink);
		Assert.assertTrue(isElementPresent(TwitterLink));
		click(TwitterLink);
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		if(!isElementPresent(TwitterLink)) {
			clickAndroidDeviceBackBttn();
		}
//		waitForVisibility(LinkHeaders);
//		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Twitter"));
//		clickAndroidDeviceBackBttn();
		waitForVisibility(LinkedinLink);
		Assert.assertTrue(isElementPresent(LinkedinLink));
		click(LinkedinLink);
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
//		if(!isElementPresent(TwitterLink)) {
//			clickAndroidDeviceBackBttn();
//		}
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("LinkedIn"));
		clickAndroidDeviceBackBttn();
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(QualificationTitle);
		Assert.assertTrue(isElementPresent(QualificationTitle));
		Assert.assertTrue(isElementPresent(AddQualiFicationButton));
	    click(AddQualiFicationButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Qualifications"));
		clickAndroidDeviceBackBttn();
		click(BackButton); 
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(ExperienceTitle);
		Assert.assertTrue(isElementPresent(ExperienceTitle));
		Assert.assertTrue(isElementPresent(AddExperienceButton));
		click(AddExperienceButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Work Experience"));
		clickAndroidDeviceBackBttn();
		click(BackButton); 
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		Thread.sleep(2000);
		
	}



	public void IverifyTappingOnSaveChangesButtonAndComingBackFunctionality() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(4);
		waitForVisibility(NameTextField);
		Assert.assertTrue(isElementPresent(NameTextField));
		click(NameTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Name"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("Adam");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		click(SaveChangesButton);
		waitForVisibility(HandelTextField);
		Assert.assertTrue(isElementPresent(HandelTextField));
		click(HandelTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Handle"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("adam.1234");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		if (isElementPresent(Handlesuggest));{
			click(Handlesuggest);
		}
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		click(SaveChangesButton);
		Thread.sleep(3000);
		waitForVisibility(ProfessionTextField);
		Assert.assertTrue(isElementPresent(ProfessionTextField));
		click(ProfessionTextField);
		Thread.sleep(2000);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Profession"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("QA Analyst");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		click(SaveChangesButton);
		waitForVisibility(CurrentLocationTextField);
		Assert.assertTrue(isElementPresent(CurrentLocationTextField));
		Assert.assertTrue(isElementPresent(LocationTextField));
		click(LocationTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Location"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("Delhi");
		clickAndroidDeviceBackBttn();
		waitForVisibility(LocationSuggestion);
		click(LocationSuggestion);
		waitForVisibility(BackButton);
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		click(SaveChangesButton);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(BioTextField);
		Assert.assertTrue(isElementPresent(BioTextField));
		click(BioTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Bio"));
		Assert.assertTrue(isElementPresent(BioInputField));
		BioInputField.clear();
		BioInputField.sendKeys("I am The Host");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		click(SaveChangesButton);
		waitForVisibility(DOBTextField);
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(WebsiteTextField));
		click(WebsiteTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Website"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("www.kooapp.com");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		//clickAndroidDeviceBackBttn();
		SaveChangesButton.click();
		//clickAndroidDeviceBackBttn();
		waitForVisibility(EmailTextField);
		Assert.assertTrue(isElementPresent(EmailTextField));
		Assert.assertTrue(isElementPresent(MobileNoTextField));
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(SocialLinksField);
		Assert.assertTrue(isElementPresent(SocialLinksField));
		Assert.assertTrue(isElementPresent(ShareLinksIcon));
		Assert.assertTrue(isElementPresent(FacebookLink));
		click(FacebookLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Facebook"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Thread.sleep(2000);
		SocialLinkField.clear();
		SocialLinkField.sendKeys("public/Adam-Adams");
		clickAndroidDeviceBackBttn();
		waitForVisibility(SaveLinkButton);
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		waitForVisibility(TwitterLink);
		Assert.assertTrue(isElementPresent(TwitterLink));
		click(TwitterLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Twitter"));
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(SocialLinkField));
		SocialLinkField.clear();
		SocialLinkField.sendKeys("ScottAdamsSays?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
		clickAndroidDeviceBackBttn();
		waitForVisibility(SaveLinkButton);
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		waitForVisibility(LinkedinLink);
		Assert.assertTrue(isElementPresent(LinkedinLink));
		click(LinkedinLink);
		waitForVisibility(LinkHeaders);
		Thread.sleep(2000);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("LinkedIn"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		SocialLinkField.clear();
		SocialLinkField.sendKeys("company/adamtek");
		clickAndroidDeviceBackBttn();
		waitForVisibility(SaveLinkButton);
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(QualificationTitle);
		Assert.assertTrue(isElementPresent(QualificationTitle));
		Assert.assertTrue(isElementPresent(AddQualiFicationButton));
	    click(AddQualiFicationButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Qualifications"));
		Assert.assertTrue(isElementPresent(EnterCertification));
		EnterCertification.clear();
		EnterCertification.sendKeys("B.Tech");
		Assert.assertTrue(isElementPresent(EnterInstitution));
		EnterInstitution.clear();
		EnterInstitution.sendKeys("J.S.S.A.T.E.N");
		Assert.assertTrue(isElementPresent(YearOfPassing));
		YearOfPassing.clear();
		YearOfPassing.sendKeys("2012");
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		click(SaveChangesButton); 
		Thread.sleep(2000);
		waitForVisibility(Qualification1);
		Assert.assertTrue(isElementPresent(Qualification1));
		Assert.assertTrue(isElementPresent(QualificationEditButton));
		Assert.assertTrue(isElementPresent(ExperienceTitle));
		Assert.assertTrue(isElementPresent(AddExperienceButton));
		click(AddExperienceButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Work Experience"));
		Assert.assertTrue(isElementPresent(EnterCertification));
		EnterCertification.clear();
		EnterCertification.sendKeys("Software Developer");
		Assert.assertTrue(isElementPresent(EnterInstitution));
		EnterInstitution.clear();
		EnterInstitution.sendKeys("DRDO");
		Assert.assertTrue(isElementPresent(YearOfPassing));
		YearOfPassing.clear();
		YearOfPassing.sendKeys("2015");
		Assert.assertTrue(isElementPresent(YearOfPassingTo));
		YearOfPassingTo.clear();
		YearOfPassingTo.sendKeys("2017");
		Assert.assertTrue(isElementPresent(CurrentlyButton));
		click(CurrentlyButton);
		click(CurrentlyButton);
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		click(SaveChangesButton); 
		waitForVisibility(Experience1);
		Assert.assertTrue(isElementPresent(Experience1));
		Assert.assertTrue(isElementPresent(ExperienceEditButton));
		Assert.assertTrue(isElementPresent(EditProfileText));
		swipeToSeeUpsideElementsOfScreen(3);
		
		
		///   editing all the value of the text filed and trying to save them //////
		
		
		waitForVisibility(NameTextField);
		Assert.assertTrue(isElementPresent(NameTextField));
		click(NameTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Name"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isKeyPadShown());
		Inputfield.clear();
		Inputfield.sendKeys("GilChrist");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertFalse(!isElementVisible(DeleteButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		waitForVisibility(HandelTextField);
		Assert.assertTrue(isElementPresent(HandelTextField));
		click(HandelTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Handle"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isKeyPadShown());
		Inputfield.clear();
		Inputfield.sendKeys("gil.123");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertFalse(!isElementVisible(DeleteButton));
		clickAndroidDeviceBackBttn();
		click(BackButton);
		waitForVisibility(ProfessionTextField);
		Assert.assertTrue(isElementPresent(ProfessionTextField));
		click(ProfessionTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Profession"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isKeyPadShown());
		Inputfield.clear();
		Inputfield.sendKeys("Software Developer");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		waitForVisibility(CurrentLocationTextField);
		Assert.assertTrue(isElementPresent(CurrentLocationTextField));
		Assert.assertTrue(isElementPresent(LocationTextField));
		click(LocationTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Location"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isKeyPadShown());
		Inputfield.clear();
		Inputfield.sendKeys("Goa");
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		click(LocationSuggestion);
		waitForVisibility(BackButton);
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		click(SaveChangesButton);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(BioTextField);
		Assert.assertTrue(isElementPresent(BioTextField));
		click(BioTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Bio"));
		Assert.assertTrue(isElementPresent(BioInputField));
		Assert.assertTrue(isKeyPadShown());
		BioInputField.clear();
		BioInputField.sendKeys("believe in your Dreams!!!");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		waitForVisibility(DOBTextField);
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(WebsiteTextField));
		click(WebsiteTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Website"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isKeyPadShown());
		Inputfield.clear();
		Inputfield.sendKeys("www.kooapp.com");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		waitForVisibility(EmailTextField);
		Assert.assertTrue(isElementPresent(EmailTextField));
		Assert.assertTrue(isElementPresent(MobileNoTextField));
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(SocialLinksField);
		Assert.assertTrue(isElementPresent(SocialLinksField));
		Assert.assertTrue(isElementPresent(ShareLinksIcon));
		Assert.assertTrue(isElementPresent(FacebookLink));
		click(FacebookLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Facebook"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isKeyPadShown());
		Thread.sleep(2000);
		SocialLinkField.clear();
		SocialLinkField.sendKeys("adamosmayev");
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		waitForVisibility(TwitterLink);
		Assert.assertTrue(isElementPresent(TwitterLink));
		click(TwitterLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Twitter"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isKeyPadShown());
		SocialLinkField.clear();
		SocialLinkField.sendKeys("bryanadams?lang=en");
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		waitForVisibility(LinkedinLink);
		Assert.assertTrue(isElementPresent(LinkedinLink));
		click(LinkedinLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("LinkedIn"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isKeyPadShown());
		SocialLinkField.clear();
		SocialLinkField.sendKeys("in/adamdanyal");
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(AddQualiFicationButton);
		//Assert.assertTrue(isElementPresent(QualificationTitle));
		Assert.assertTrue(isElementPresent(AddQualiFicationButton));
	    click(AddQualiFicationButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Qualifications"));
		Assert.assertTrue(isElementPresent(EnterCertification));
		Assert.assertTrue(isKeyPadShown());
		EnterCertification.clear();
		EnterCertification.sendKeys("Mtech");
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(EnterInstitution));
		EnterInstitution.clear();
		EnterInstitution.sendKeys("IIT Roorkee");
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(YearOfPassing));
		YearOfPassing.clear();
		YearOfPassing.sendKeys("1994");
		Assert.assertTrue(isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		click(SaveChangesButton); 
		Thread.sleep(2000);
		if(isElementVisible(Qualification1)) {
			Assert.assertTrue(isElementPresent(Qualification1));
			Assert.assertTrue(isElementPresent(QualificationEditButton));
			if(isElementVisible(Qualification2)) {
				Assert.assertTrue(isElementPresent(Qualification2));

			}
			
		}
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(AddExperienceButton);
		Assert.assertTrue(isElementPresent(AddExperienceButton));
		click(AddExperienceButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Work Experience"));
		Assert.assertTrue(isElementPresent(EnterCertification));
		Assert.assertTrue(isKeyPadShown());
		EnterCertification.clear();
		EnterCertification.sendKeys("Robotics");
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(EnterInstitution));
		EnterInstitution.clear();
		EnterInstitution.sendKeys("University Of Oxford");
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(YearOfPassing));
		YearOfPassing.clear();
		YearOfPassing.sendKeys("1998");
		Assert.assertTrue(isElementPresent(YearOfPassingTo));
		YearOfPassingTo.clear();	
		Assert.assertTrue(isElementPresent(CurrentlyButton));
		click(CurrentlyButton);
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		click(SaveChangesButton); 
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(EditProfileText));
		if(isElementVisible(Experience1)) {
			Assert.assertTrue(isElementPresent(Experience1));
			Assert.assertTrue(isElementPresent(ExperienceEditButton));
			if(isElementVisible(Experience2)) {
				Assert.assertTrue(isElementPresent(Experience2));

			}
			
		}
		Thread.sleep(2000);
		
	}


	public void IverifySaveButtonDisabelUntillMin3CharacterIsNotEntered() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(3);
		waitForVisibility(NameTextField);
		Assert.assertTrue(isElementPresent(NameTextField));
		String NameTextBefore = (NameTextField.getText());
		click(NameTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Name"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isKeyPadShown());
		Inputfield.clear();
		Assert.assertTrue(isElementPresent(VallidationIcon));
		Assert.assertTrue(VallidationMessage.getText().equalsIgnoreCase("Please enter more than 3 letters"));
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Inputfield.sendKeys("A");
		Assert.assertTrue(isElementPresent(VallidationIcon));
		Assert.assertTrue(VallidationMessage.getText().equalsIgnoreCase("Please enter more than 3 letters"));
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Inputfield.sendKeys("Ar");
		Assert.assertTrue(isElementPresent(VallidationIcon));
		Assert.assertTrue(VallidationMessage.getText().equalsIgnoreCase("Please enter more than 3 letters"));
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Inputfield.sendKeys("Aru");
		String InputField = (Inputfield.getText());
		Assert.assertTrue(isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		click(BackButton);
		waitForVisibility(NameTextField);
		String NameTextAfter = (NameTextField.getText());
		Thread.sleep(2000);
		//Assert.assertTrue(NameTextAfter!=InputField);
		if (NameTextBefore==NameTextAfter)
		{
			Thread.sleep(4000);
	     	Assert.assertTrue(isElementPresent(EditProfileText));
			Thread.sleep(6000);
		}
		Assert.assertTrue(isElementPresent(NameTextField));
		String NameTextBefore1 = (NameTextField.getText());
		click(NameTextField);
		waitForVisibility(Inputfield);
		Inputfield.sendKeys("Aru");
		String InputFieldchange = (Inputfield.getText());
		Assert.assertTrue(isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		waitForVisibility(NameTextField);
		String NameTextAfter1 = (NameTextField.getText());
		//Assert.assertTrue(NameTextAfter!=InputField);
		if (NameTextBefore1!=NameTextAfter1)
		{
			if (NameTextAfter1==InputFieldchange) 
			{
				waitForVisibility(EditProfileText);
		     	Assert.assertTrue(isElementPresent(EditProfileText));
				
			}
			
		}
	}


	public void IVerifyUserShouldbeabletoenter30charactersorlessthanthatbutnotmorethan() throws InterruptedException{
		waitForVisibility(ProfessionFieldTitle);
		Assert.assertTrue(isElementPresent(ProfessionFieldTitle));
		Assert.assertTrue(isElementPresent(ProfessionTextField));
		String NameTextBefore = (ProfessionTextField.getText());
		click(ProfessionTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Profession"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("AI and Machine Learning Engineering ( Contains more than 30 Character )");
		String InputFieldchange = (Inputfield.getText());
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		click(SaveChangesButton);
		Thread.sleep(2000);
		String NameTextAfter = (ProfessionTextField.getText());
		Thread.sleep(2000);
		//Assert.assertTrue(NameTextAfter!=InputField);
		if (NameTextBefore!=NameTextAfter)
		{
			if (NameTextAfter==InputFieldchange) 
			{
				Thread.sleep(2000);
		     	Assert.assertTrue(isElementPresent(EditProfileText));
				Thread.sleep(2000);
				
			}
			
		}
		clickAndroidDeviceBackBttn();
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(ProfilePic));
		Assert.assertTrue(isElementPresent(ProfileName));
		Assert.assertTrue(isElementPresent(ProfileHandelName));
		Assert.assertTrue(isElementPresent(ProfessionText));
		String NameTextAfter1 = (ProfessionText.getText());
		if (NameTextAfter1==InputFieldchange) 
		{
			Thread.sleep(2000);
	     	Assert.assertTrue(isElementPresent(EditProfileButton));
			
		}
		click(EditProfileButton);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(EditProfileText));
		
	}


	public void IVerifyCurrentLocationFieldFunctionalityandItsPopUP() throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibility(CurrentLocationFieldTitle);
		Assert.assertTrue(isElementPresent(CurrentLocationFieldTitle));
		Assert.assertTrue(isElementPresent(CurrentLocationTextField));
		Assert.assertTrue(isElementPresent(CurrentLocationIcon));
		click(CurrentLocationTextField);
		Thread.sleep(2000);
		if(isElementPresent(LocationVallidationMessage))
		{
			Assert.assertTrue(isElementPresent(LocationVallidationMessage));
			Assert.assertTrue(isElementPresent(LocationVallidationButton));
			click(LocationVallidationButton);
			Thread.sleep(2000);
			try{
				permissions.masterPermissionHandler();

			}
			catch (Exception e)
			{

			}
			waitForVisibility(LocationFieldTitle);
			Assert.assertTrue(isElementPresent(LocationFieldTitle));
			Assert.assertTrue(isElementPresent(LocationTextField));
			Assert.assertTrue(isElementPresent(LocationIcon));

		/*	Assert.assertTrue(isElementPresent(LocationVallidationMessage));
			Assert.assertTrue(isElementPresent(LocationVallidationButton));
			click(LocationVallidationButton);
			Thread.sleep(2000);
			if(isElementPresent(CameraPermission));
			{
				Assert.assertTrue(isElementPresent(CameraPermission));
				click(CameraPermission);
				waitForVisibility(LocationFieldTitle);
				Assert.assertTrue(isElementPresent(LocationFieldTitle));
				Assert.assertTrue(isElementPresent(LocationTextField));
				Assert.assertTrue(isElementPresent(LocationIcon));
			}*/
		}

	}


	public void IVerifyuserisabletoupdateBioUsing1000characters() throws InterruptedException {
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(BioFieldTitle);
		Assert.assertTrue(isElementPresent(BioFieldTitle));
		Assert.assertTrue(isElementPresent(BioTextField));
		Assert.assertTrue(isElementPresent(BioIcon));
		click(BioTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Bio"));
		Assert.assertTrue(isElementPresent(BioInputField));
		Assert.assertTrue(isKeyPadShown());
		BioInputField.clear();
		BioInputField.sendKeys("A while back I needed to count the amount of letters that a piece of text in an email template had (to avoid passing any character limits). Unfortunately, I could not think of a quick way to do so on my macbook and I therefore turned to the Internet. There were a couple of tools out there, but none of them met my standards and since I am a web designer I thought: why not do it myself and help others along the way? And... here is the result, hope it helps out! You can copy and paste your text with the characters to count in the text area above, or you can type your characters and words into the text area. The counter will be updated instantly, displaying the amount of characters, words, sentences, paragraphs and whitespace in your text, not to mention that the keyword density (which you can configure from the options menu) is also displayed. Character Count Online is a free online character and word counting tool.\r\n"
				+ "All results are immediately shown and it is ridiculously easy to use and of course, the service is completely free.");
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		click(BioInputField);
		BioInputField.clear();
		BioInputField.sendKeys("A while back I needed to count the amount of letters that a piece of text in an email template had (to avoid passing any character limits). Unfortunately, I could not think of a quick way to do so on my macbook and I therefore turned to the Internet. There were a couple of tools out there, but none of them met my standards and since I am a web designer I thought: why not do it myself and help others along the way? And... here is the result, hope it helps out! You can copy and paste your text with the characters to count in the text area above, or you can type your characters and words into the text area. The counter will be updated instantly, displaying the amount of characters, words, sentences, paragraphs and whitespace in your text, not to mention that the keyword density (which you can configure from the options menu) is also displayed. Character Count Online is a free online character and word counting tool.\r\n"
				+ "All results are");
		Assert.assertTrue(isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		Thread.sleep(2000);
		
		
	}


	public void IVerifyontappingDateofBirthfieldGoogledefaultCalendershouldopen() throws InterruptedException {
		waitForVisibility(DOBFieldTitle);
		Assert.assertTrue(isElementPresent(DOBFieldTitle));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(DOBIcon));
		click(DOBTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Date of Birth"));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		click(BackButton);
		Thread.sleep(2000);
		
	}


	public void IVerifyuserisabletoselectanyofthepreviousdatesnotbeforedatesfromcalender() throws InterruptedException {
		waitForVisibility(DOBFieldTitle);
		Assert.assertTrue(isElementPresent(DOBFieldTitle));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(DOBIcon));
		String DOBText = (DOBTextField.getText());
		click(DOBTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Date of Birth"));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementVisible(DoBToggleSwitch));
		Assert.assertFalse(!isElementVisible(DobYearSwitch));
		String DOBTextBefore = (DOBTextField.getText());
		click(DOBTextField);
		waitForVisibility(CalenderYear);
		Assert.assertTrue(isElementPresent(CalenderYear));
		Assert.assertTrue(isElementPresent(CalenderDate));
		Assert.assertTrue(isElementPresent(CalenderPreviousButton));
		Assert.assertTrue(isElementPresent(CalenderCancle));
		Assert.assertTrue(isElementPresent(CalenderOk));
		Assert.assertTrue(CalenderCancle.getText().equalsIgnoreCase("CANCEL"));
		Assert.assertTrue(CalenderOk.getText().equalsIgnoreCase("OK"));
		Assert.assertTrue(isElementPresent(MonthDates));
		click(CalenderYear);
		waitForVisibility(CalenderCancle);
		Assert.assertTrue(isElementPresent(CalenderCancle));
		Assert.assertTrue(isElementPresent(CalenderOk));
		Assert.assertTrue(CalenderCancle.getText().equalsIgnoreCase("CANCEL"));
		Assert.assertTrue(CalenderOk.getText().equalsIgnoreCase("OK"));
		swipeToSeeUpsideElementsOfScreen(2);
		waitForVisibility(YearSelected);
		Assert.assertTrue(isElementPresent(YearSelected));
		click(YearSelected);
		waitForVisibility(CalenderCancle);
		Assert.assertTrue(CalenderCancle.getText().equalsIgnoreCase("CANCEL"));
		Assert.assertTrue(CalenderOk.getText().equalsIgnoreCase("OK"));
		Assert.assertTrue(isElementPresent(MonthDates));
		Assert.assertTrue(isElementPresent(CalenderPreviousButton));
		Assert.assertTrue(isElementPresent(CalenderNextButton));
		click(CalenderPreviousButton);
		waitForVisibility(MonthDates);
		Assert.assertTrue(isElementPresent(MonthDates));
		click(CalenderPreviousButton);
		waitForVisibility(MonthDates);
		Assert.assertTrue(isElementPresent(MonthDates));
		click(CalenderPreviousButton);
		waitForVisibility(MonthDates);
		Assert.assertTrue(isElementPresent(MonthDates));
		click(CalenderNextButton);
		waitForVisibility(MonthDates);
		Assert.assertTrue(isElementPresent(MonthDates));
		Assert.assertTrue(isElementPresent(DateSelected));
		Assert.assertTrue(isEnabled(DateSelected));
		if(isEnabled(DateSelected))
		{
			click(DateSelected);
			Thread.sleep(2000);
			click(CalenderOk);
			String DOBTextAfter = (DOBTextField.getText());
			if(DOBTextBefore!=DOBTextAfter)
			{
				Assert.assertTrue(isEnabled(SaveChangesButton));
				Assert.assertTrue(isElementVisible(DoBToggleSwitch));
				Assert.assertFalse(!isElementVisible(DobYearSwitch));
				click(DoBToggleSwitch);
				waitForVisibility(DoBToggleSwitch);
				Assert.assertTrue(isElementVisible(DoBToggleSwitch));
				Assert.assertTrue(isElementVisible(DobYearSwitch));
				click(SaveChangesButton);
				Thread.sleep(2000);
			}
			if (DOBText==DOBTextAfter) 
			{
				waitForVisibility(DoBToggleSwitch);
		     	Assert.assertTrue(isElementPresent(EditProfileButton));
		     	Thread.sleep(4000);
				
			}
			
		}
		
		
		
	}


	public void IVerifyOpenLinkButtonUnderSocialMediaSection() throws InterruptedException {
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(SocialLinksField);
		Assert.assertTrue(isElementPresent(SocialLinksField));
		Assert.assertTrue(isElementPresent(ShareLinksIcon));
		Assert.assertTrue(isElementPresent(FacebookLink));
		click(FacebookLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Facebook"));
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isElementPresent(OpenLinkButton));
		Assert.assertTrue(isElementPresent(ClearLinkButton));
		Assert.assertTrue(isKeyPadShown());
		clickAndroidDeviceBackBttn();
		Assert.assertFalse(!isKeyPadShown());
		click(OpenLinkButton);
		Thread.sleep(4000);
		waitForVisibility(UrlBar);
		Assert.assertTrue(isElementPresent(Page));
		Assert.assertTrue(isElementPresent(UrlBar));
		Assert.assertFalse(UrlBar.getText().equalsIgnoreCase("m.facebook.com"));
		Assert.assertTrue(isElementPresent(ChromeCloseButton));
		click(ChromeCloseButton);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Facebook"));
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isElementPresent(OpenLinkButton));
		Assert.assertTrue(isElementPresent(ClearLinkButton));
		clickAndroidDeviceBackBttn();
		waitForVisibility(TwitterLink);
		Assert.assertTrue(isElementPresent(TwitterLink));
		click(TwitterLink);
		waitForVisibility(SocialLinkField);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isElementPresent(OpenLinkButton));
		Assert.assertTrue(isElementPresent(ClearLinkButton));
		Assert.assertTrue(isKeyPadShown());
		clickAndroidDeviceBackBttn();
		Assert.assertFalse(!isKeyPadShown());
		click(OpenLinkButton);
		Thread.sleep(4000);
		waitForVisibility(UrlBar);
		Assert.assertTrue(isElementPresent(Page));
		Assert.assertTrue(isElementPresent(UrlBar));
		Assert.assertTrue(UrlBar.getText().equalsIgnoreCase("mobile.twitter.com"));
		Assert.assertTrue(isElementPresent(ChromeCloseButton));
		click(ChromeCloseButton);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Twitter"));
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isElementPresent(OpenLinkButton));
		Assert.assertTrue(isElementPresent(ClearLinkButton));
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(LinkedinLink));
		click(LinkedinLink);
		waitForVisibility(LinkHeaders);
		Thread.sleep(2000);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("LinkedIn"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isElementPresent(OpenLinkButton));
		Assert.assertTrue(isElementPresent(ClearLinkButton));
		Assert.assertTrue(isKeyPadShown());
		clickAndroidDeviceBackBttn();
		Assert.assertFalse(!isKeyPadShown());
		click(OpenLinkButton);
		Thread.sleep(4000);
		waitForVisibility(UrlBar);
		Assert.assertTrue(isElementPresent(Page));
		Assert.assertTrue(isElementPresent(UrlBar));
		Assert.assertTrue(UrlBar.getText().equalsIgnoreCase("linkedin.com"));
		Assert.assertTrue(isElementPresent(ChromeCloseButton));
		click(ChromeCloseButton);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Linkedin"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		Assert.assertTrue(isElementPresent(OpenLinkButton));
		Assert.assertTrue(isElementPresent(ClearLinkButton));
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		
	}
	
	


	

	public void IVerifyDeletebuttonFunctionalityoneveryfieldpage() throws InterruptedException {
		//waitForVisibility(ProfileBackButton);
		//click(ProfileBackButton);
		waitForVisibility(ProfilePic);
		Assert.assertTrue(isElementPresent(ProfilePic));
		Assert.assertTrue(isElementPresent(ProfileName));
		Assert.assertTrue(isElementPresent(ProfileHandelName));
		Assert.assertTrue(isElementPresent(ProfileProfessionText));
		Assert.assertTrue(isElementPresent(ProfileDescriptionText));
		Assert.assertTrue(isElementPresent(UserLocation));
		Assert.assertTrue(isElementPresent(KooJoiningDate));
		Thread.sleep(4000);
		
		if(isElementPresent(MoreInfoButton)) {
			click(MoreInfoButton);
			waitForVisibility(UserFacebook);
			Assert.assertTrue(isElementVisible(UserFacebook));
			Assert.assertTrue(isElementVisible(UserTwitter));
			Assert.assertTrue(isElementVisible(UserLinkedIn));
			Assert.assertTrue(MoreInfoButton.getText().equalsIgnoreCase("Less Info"));
			click(MoreInfoButton);
			Thread.sleep(4000);
			
		}
		Assert.assertFalse(!isElementVisible(UserDOB));
		Assert.assertFalse(!isElementVisible(UserFacebook));
		Assert.assertFalse(!isElementVisible(UserTwitter));
		Assert.assertFalse(!isElementVisible(UserLinkedIn));
		Thread.sleep(2000);
		
		if(isElementPresent(ReadMoreButton)) {
			click(ReadMoreButton);
			waitForVisibility(ProfileDescriptionText);
			Assert.assertTrue(isElementPresent(ProfileDescriptionText));
			click(ReadMoreButton);
		}
		
		
		
	}
	
	public void IVerifyontappingclearlinkbuttontheenteredlinkshouldbecleared() throws InterruptedException{
		waitForVisibility(EditProfileButton);
		click(EditProfileButton);
		swipeToSeeDownsideElementsOfScreen(3);
		waitForVisibility(SocialLinksField);
		Assert.assertTrue(isElementPresent(SocialLinksField));
		Assert.assertTrue(isElementPresent(ShareLinksIcon));
		Assert.assertTrue(isElementPresent(FacebookLink));
		Assert.assertTrue(isEnabled(FacebookLink));
		click(FacebookLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Facebook"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		if(SocialLinkField.getText().equalsIgnoreCase("e.g koo")) {
			Assert.assertFalse(isElementPresent(OpenLinkButton));
			Assert.assertFalse(isElementPresent(ClearLinkButton));
			sendKeys(SocialLinkField, "public/Adam-Adams");
			Thread.sleep(1000);
			Assert.assertTrue(isElementPresent(OpenLinkButton));
			Assert.assertTrue(isElementPresent(ClearLinkButton));
			
		}
		
		if(isKeyPadShown()) {
			clickAndroidDeviceBackBttn();
			Thread.sleep(1000);
		}
		
		click(ClearLinkButton);
		waitForVisibility(SaveLinkButton);
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		waitForVisibility(FacebookLink);
		Assert.assertTrue(isEnabled(FacebookLink));
		Assert.assertTrue(isElementPresent(TwitterLink));
		Assert.assertTrue(isEnabled(TwitterLink));
		click(TwitterLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("TWitter"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		if(SocialLinkField.getText().equalsIgnoreCase("e.g koo")) {
			Assert.assertFalse(isElementPresent(OpenLinkButton));
			Assert.assertFalse(isElementPresent(ClearLinkButton));
			sendKeys(SocialLinkField, "ScottAdamsSays?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
			Thread.sleep(1000);
			Assert.assertTrue(isElementPresent(OpenLinkButton));
			Assert.assertTrue(isElementPresent(ClearLinkButton));
			
		}
		
		
		Assert.assertTrue(isElementPresent(OpenLinkButton));
		Assert.assertTrue(isElementPresent(ClearLinkButton));
		if(isKeyPadShown()) {
			clickAndroidDeviceBackBttn();
		}
		
		click(ClearLinkButton);
		waitForVisibility(SaveLinkButton);
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		Assert.assertTrue(isEnabled(TwitterLink));
		Assert.assertTrue(isElementPresent(LinkedinLink));
		Assert.assertTrue(isEnabled(LinkedinLink));
		click(LinkedinLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("LinkedIn"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		if(SocialLinkField.getText().equalsIgnoreCase("e.g koo")) {
			Assert.assertFalse(isElementPresent(OpenLinkButton));
			Assert.assertFalse(isElementPresent(ClearLinkButton));
			sendKeys(SocialLinkField, "company/adamtek");
			Thread.sleep(1000);
			Assert.assertTrue(isElementPresent(OpenLinkButton));
			Assert.assertTrue(isElementPresent(ClearLinkButton));
			
		}
		
		Assert.assertTrue(isElementPresent(OpenLinkButton));
		Assert.assertTrue(isElementPresent(ClearLinkButton));
		Assert.assertTrue(isKeyPadShown());
		clickAndroidDeviceBackBttn();
		Assert.assertFalse(!isKeyPadShown());
		click(ClearLinkButton);
		waitForVisibility(SaveLinkButton);
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		Assert.assertTrue(isEnabled(LinkedinLink));
		Assert.assertTrue(isElementPresent(SocialLinksField));
		Assert.assertTrue(isElementPresent(ShareLinksIcon));
		Assert.assertTrue(isEnabled(LinkedinLink));
		Assert.assertTrue(isEnabled(TwitterLink));
		Assert.assertTrue(isEnabled(FacebookLink));
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
	}


	public void IVerifyByDeletingtheSavedQualificationandSavedExperience() throws InterruptedException {
		waitForVisibility(QualificationEditButton);
		Assert.assertTrue(isElementPresent(QualificationEditButton));
		Assert.assertTrue(isElementPresent(ExperienceEditButton));
		click(QualificationEditButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Qualifications"));
		Assert.assertTrue(isElementPresent(EnterCertification));
		Assert.assertTrue(isKeyPadShown());
		Assert.assertTrue(isElementPresent(EnterInstitution));
		Assert.assertTrue(isElementPresent(YearOfPassing));
		Assert.assertTrue(isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertTrue(isElementVisible(DeleteButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		click(DeleteButton);
		waitForVisibility(LocationOkButton);
		Assert.assertTrue(isElementPresent(LocationOkButton));
		Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
		click(LocationOkButton);
		waitForVisibility(EditProfileText);
		waitForVisibility(QualificationEditButton);
		Assert.assertTrue(isElementPresent(QualificationEditButton));
		Assert.assertTrue(isElementPresent(ExperienceEditButton));
		click(QualificationEditButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Qualifications"));
		Assert.assertTrue(isElementPresent(EnterCertification));
		Assert.assertTrue(isKeyPadShown());
		Assert.assertTrue(isElementPresent(EnterInstitution));
		Assert.assertTrue(isElementPresent(YearOfPassing));
		Assert.assertTrue(isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertTrue(isElementVisible(DeleteButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		click(DeleteButton);
		waitForVisibility(LocationOkButton);
		Assert.assertTrue(isElementPresent(LocationOkButton));
		Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
		click(LocationOkButton);
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		Assert.assertTrue(isElementVisible(Qualification2));
		Assert.assertFalse(!isElementVisible(Qualification1));
		Assert.assertTrue(isElementPresent(ExperienceEditButton));
		click(ExperienceEditButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Work Experience"));
		Assert.assertTrue(isElementPresent(EnterCertification));
		Assert.assertTrue(isKeyPadShown());
		Assert.assertTrue(isElementPresent(EnterInstitution));
		Assert.assertTrue(isElementPresent(YearOfPassing));
		Assert.assertTrue(isElementPresent(YearOfPassingTo));
		Assert.assertTrue(isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertTrue(isElementVisible(DeleteButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		click(DeleteButton);
		waitForVisibility(LocationOkButton);
		Assert.assertTrue(isElementPresent(LocationOkButton));
		Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
		click(LocationOkButton);
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		Assert.assertTrue(isElementVisible(Qualification2));
		Assert.assertFalse(!isElementVisible(Qualification1));
		Assert.assertTrue(isElementPresent(ExperienceEditButton));
		click(ExperienceEditButton);
		waitForVisibility(Pageheader);
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Work Experience"));
		Assert.assertTrue(isElementPresent(EnterCertification));
		Assert.assertTrue(isKeyPadShown());
		Assert.assertTrue(isElementPresent(EnterInstitution));
		Assert.assertTrue(isElementPresent(YearOfPassing));
		Assert.assertTrue(isElementPresent(YearOfPassingTo));
		Assert.assertTrue(isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertTrue(isElementVisible(DeleteButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		click(DeleteButton);
		waitForVisibility(LocationOkButton);
		Assert.assertTrue(isElementPresent(LocationOkButton));
		Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
		click(LocationOkButton);
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		Assert.assertTrue(isElementVisible(Experience2));
		Assert.assertFalse(!isElementVisible(Experience1));
		Thread.sleep(6000);
	}


	public void IVerifyDeletedLinksShouldNotAppearonProfileTab() throws InterruptedException {
		waitForVisibility(ProfileBackButton);
		click(ProfileBackButton);
		waitForVisibility(ProfilePic);
		Assert.assertTrue(isElementPresent(ProfilePic));
		Thread.sleep(4000);
		if(isElementPresent(MoreInfoButton)) {
			click(MoreInfoButton);
			Thread.sleep(2000);
			//waitForVisibility(UserFacebook);
			Assert.assertFalse(isElementPresent(UserFacebook));
			Assert.assertFalse(isElementPresent(UserTwitter));
			Assert.assertFalse(isElementPresent(UserLinkedIn));
			Assert.assertTrue(MoreInfoButton.getText().equalsIgnoreCase("Less Info"));
			click(MoreInfoButton);
			Thread.sleep(4000);
			
		}

		if(isElementPresent(ReadMoreButton)) {
			click(ReadMoreButton);
			waitForVisibility(ProfileDescriptionText);
			Assert.assertTrue(isElementPresent(ProfileDescriptionText));
			click(ReadMoreButton);
		}
	}


	public void IverifybyDeletingWebsiteTextfieldshoulddisappearonprofilepage() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(1);
		waitForVisibility(EditProfileButton);
		click(EditProfileButton);
		waitForVisibility(NameFieldTitle);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(WebsiteFieldTitle));
		Assert.assertTrue(isElementPresent(WebsiteTextField));
		Assert.assertTrue(isElementPresent(WebsiteIcon));
		click(WebsiteTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Website"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isKeyPadShown());
		Assert.assertTrue(isElementPresent(BackButton));
		if(Inputfield.getText().equalsIgnoreCase("Enter your Website")) {
			Assert.assertFalse(isElementPresent(DeleteButton));
			sendKeys(Inputfield, "wwww.kooapp.com");
			click(SaveChangesButton);
			click(WebsiteTextField);
			waitForVisibility(Pageheader);
		}
		Assert.assertTrue(isElementPresent(DeleteButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		click(DeleteButton);
		waitForVisibility(LocationOkButton);
		Assert.assertTrue(isElementPresent(LocationOkButton));
		Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
		click(LocationOkButton);
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		click(ProfileBackButton);
		waitForVisibility(ProfilePic);
		Assert.assertFalse(isElementPresent(WebsiteTextField));
		Thread.sleep(4000);
		
			
	}


	public void IverifybyDeletingProfessionalTextfieldshoulddisappearonprofilepage() throws InterruptedException {
		waitForVisibility(EditProfileButton);
		click(EditProfileButton);
		waitForVisibility(NameFieldTitle);
		
		Assert.assertTrue(isElementPresent(ProfessionFieldTitle));
		Assert.assertTrue(isElementPresent(ProfessionTextField));
		Assert.assertTrue(isElementPresent(ProfessionIcon));
		click(ProfessionTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Profession"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Assert.assertTrue(isKeyPadShown());
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		if(Inputfield.getText().equalsIgnoreCase("Enter your Profession or Passion")) {
			Assert.assertFalse(isElementPresent(DeleteButton));
			sendKeys(Inputfield, "Accountant");
			click(SaveChangesButton);
			Thread.sleep(2000);
			click(ProfessionTextField);
			waitForVisibility(Pageheader);
		}
		
		
		Assert.assertTrue(isElementPresent(DeleteButton));
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		click(DeleteButton);
		waitForVisibility(LocationOkButton);
		Assert.assertTrue(isElementPresent(LocationOkButton));
		Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
		click(LocationOkButton);
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		click(ProfileBackButton);
		waitForVisibility(ProfilePic);
		Assert.assertFalse(isElementPresent(ProfileProfessionText));
		Thread.sleep(2000);
		if(isElementVisible(MoreInfoButton)) {
			click(MoreInfoButton);
			Thread.sleep(1000);
			Assert.assertFalse(isElementPresent(ProfileProfessionText));
			Assert.assertTrue(MoreInfoButton.getText().equalsIgnoreCase("Less Info"));
			click(MoreInfoButton);
			Thread.sleep(4000);
			
		}
	
	}


	public void IverifybyDeletingLocationTextfieldshoulddisappearonprofilepage() throws InterruptedException {
		waitForVisibility(EditProfileButton);
		click(EditProfileButton);
		waitForVisibility(NameFieldTitle);
		Assert.assertTrue(isElementPresent(CurrentLocationFieldTitle));
		Assert.assertTrue(isElementPresent(CurrentLocationTextField));
		Assert.assertTrue(isElementPresent(CurrentLocationIcon));
		Assert.assertTrue(isElementPresent(LocationFieldTitle));
		Assert.assertTrue(isElementPresent(LocationTextField));
		Assert.assertTrue(isElementPresent(LocationIcon));
		click(LocationTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Location"));
		Assert.assertTrue(isElementPresent(Inputfield));
		if(isKeyPadShown()) {
			clickAndroidDeviceBackBttn();
			Thread.sleep(1000);
		}
		
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		if(Inputfield.getText().equalsIgnoreCase("Select your City")) {
			Assert.assertFalse(isElementPresent(DeleteButton));
			sendKeys(Inputfield, "Delhi");
			//clickAndroidDeviceBackBttn();
			click(LocationSuggestion);
			click(SaveChangesButton);
			Thread.sleep(500);
			click(LocationTextField);
			waitForVisibility(Pageheader);
		}
		
		
		Assert.assertTrue(isElementPresent(DeleteButton));
		click(DeleteButton);
		waitForVisibility(LocationOkButton);
		Assert.assertTrue(isElementPresent(LocationOkButton));
		Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
		click(LocationOkButton);
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		click(ProfileBackButton);
		waitForVisibility(ProfilePic);
		Assert.assertFalse(isElementPresent(UserLocation));
		Thread.sleep(1000);
		if(isElementVisible(MoreInfoButton)) {
			click(MoreInfoButton);
			Thread.sleep(4000);
			Assert.assertFalse(isElementPresent(UserLocation));
			Assert.assertTrue(MoreInfoButton.getText().equalsIgnoreCase("Less Info"));
			click(MoreInfoButton);
			Thread.sleep(1000);
			
		}		
	}


	public void IverifybyDeletingBioTextfieldshoulddisappearonprofilepage() throws InterruptedException {
		waitForVisibility(EditProfileButton);
		click(EditProfileButton);
		waitForVisibility(NameFieldTitle);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(BioFieldTitle);
		Assert.assertTrue(isElementPresent(BioFieldTitle));
		Assert.assertTrue(isElementPresent(BioTextField));
		Assert.assertTrue(isElementPresent(BioIcon));
		click(BioTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Bio"));
		Assert.assertTrue(isElementPresent(BioInputField));
		Assert.assertTrue(isKeyPadShown());
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		Assert.assertTrue(isElementPresent(DeleteButton));
		clickAndroidDeviceBackBttn();
		click(DeleteButton);
		waitForVisibility(LocationOkButton);
		Assert.assertTrue(isElementPresent(LocationOkButton));
		Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
		click(LocationOkButton);
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		click(ProfileBackButton);
		waitForVisibility(ProfilePic);
		Assert.assertTrue(isElementPresent(ProfilePic));
		Assert.assertTrue(isElementPresent(ProfileName));
		Assert.assertTrue(isElementPresent(ProfileHandelName));
		Assert.assertFalse(!isElementVisible(ProfileProfessionText));
		Assert.assertFalse(!isElementVisible(ProfileDescriptionText));
		Assert.assertFalse(!isElementVisible(UserLocation));
		Assert.assertFalse(!isElementVisible(WebsiteTextField));
		Assert.assertTrue(isElementPresent(KooJoiningDate));
		Thread.sleep(4000);
		if(!isElementVisible(MoreInfoButton))
		{
			Assert.assertFalse(!isElementVisible(MoreInfoButton));
			
		}
		else {
			Assert.assertTrue(isElementPresent(MoreInfoButton));
		}
		if(isElementVisible(MoreInfoButton)) {
			click(MoreInfoButton);
			waitForVisibility(UserFacebook);
			Assert.assertFalse(!isElementVisible(UserFacebook));
			Assert.assertFalse(!isElementVisible(UserTwitter));
			Assert.assertFalse(!isElementVisible(UserLinkedIn));
			Assert.assertTrue(MoreInfoButton.getText().equalsIgnoreCase("Less Info"));
			click(MoreInfoButton);
			Thread.sleep(4000);
			
		}
		Assert.assertFalse(!isElementVisible(UserDOB));
		Assert.assertFalse(!isElementVisible(UserFacebook));
		Assert.assertFalse(!isElementVisible(UserTwitter));
		Assert.assertFalse(!isElementVisible(UserLinkedIn));
		Thread.sleep(2000);
		if(!isElementVisible(ReadMoreButton))
		{
			Assert.assertFalse(!isElementVisible(ReadMoreButton));
			
		}
		else {
			Assert.assertTrue(isElementPresent(ReadMoreButton));
		}
		if(isElementVisible(ReadMoreButton)) {
			click(ReadMoreButton);
			waitForVisibility(ProfilePic);
			Assert.assertFalse(!isElementVisible(ProfileDescriptionText));
			click(ReadMoreButton);
		}
		
	}


	public void IverifybyDeletingDOBTextfieldshoulddisappearonprofilepage() throws InterruptedException {
		waitForVisibility(EditProfileButton);
		click(EditProfileButton);
		waitForVisibility(NameFieldTitle);
		Thread.sleep(2000);
		waitForVisibility(BioFieldTitle);
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(DOBFieldTitle));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(DOBIcon));
		click(DOBTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Date of Birth"));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(BackButton));
		
		if(isElementPresent(DeleteButton)) {
			click(DeleteButton);
			waitForVisibility(LocationOkButton);
			Assert.assertTrue(isElementPresent(LocationOkButton));
			Assert.assertTrue(LocationOkButton.getText().equalsIgnoreCase("YES"));
			click(LocationOkButton);
			waitForVisibility(EditProfileText);
		}
		else {
			clickAndroidDeviceBackBttn();
		}
		waitForVisibility(EditProfileText);
		Assert.assertTrue(isElementPresent(EditProfileText));
		swipeToSeeUpsideElementsOfScreen(1);
		Thread.sleep(1000);
		click(ProfileBackButton);
		waitForVisibility(ProfilePic);
		Thread.sleep(2000);
		if(isElementPresent(MoreInfoButton))
		{
			click(MoreInfoButton);
			Assert.assertFalse(isElementPresent(UserDOB));
		}		
	}


	public void IVerifyByEnteringTheDetailsAgain() throws InterruptedException {
		waitForVisibility(EditProfileButton);
		click(EditProfileButton);
		waitForVisibility(NameTextField);
		Assert.assertTrue(isElementPresent(NameTextField));
		click(NameTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Name"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("Adam");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		waitForVisibility(HandelTextField);
		Assert.assertTrue(isElementPresent(HandelTextField));
		click(HandelTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Handle"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("adam.1234");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		if (isElementPresent(Handlesuggest));{
			click(Handlesuggest);
		}
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		Thread.sleep(2000);
		waitForVisibility(ProfessionTextField);
		Assert.assertTrue(isElementPresent(ProfessionTextField));
		click(ProfessionTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Profession"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("QA Analyst");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		waitForVisibility(CurrentLocationTextField);
		Assert.assertTrue(isElementPresent(CurrentLocationTextField));
		Assert.assertTrue(isElementPresent(LocationTextField));
		click(LocationTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Location"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("Delhi");
		clickAndroidDeviceBackBttn();
		click(LocationSuggestion);
		waitForVisibility(BackButton);
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		click(SaveChangesButton);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		Thread.sleep(2000);
		waitForVisibility(BioTextField);
		Assert.assertTrue(isElementPresent(BioTextField));
		click(BioTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Bio"));
		Assert.assertTrue(isElementPresent(BioInputField));
		BioInputField.clear();
		BioInputField.sendKeys("I am The Host");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		click(SaveChangesButton);
		waitForVisibility(DOBTextField);
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(DOBIcon));
		String DOBText = (DOBTextField.getText());
		click(DOBTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Date of Birth"));
		Assert.assertTrue(isElementPresent(DOBTextField));
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(!isEnabled(SaveChangesButton));
		Assert.assertTrue(isElementVisible(DoBToggleSwitch));
		Assert.assertFalse(!isElementVisible(DobYearSwitch));
		String DOBTextBefore = (DOBTextField.getText());
		click(DOBTextField);
		waitForVisibility(CalenderYear);
		Assert.assertTrue(isElementPresent(CalenderYear));
		Assert.assertTrue(isElementPresent(CalenderDate));
		Assert.assertTrue(isElementPresent(CalenderPreviousButton));
		Assert.assertTrue(isElementPresent(CalenderCancle));
		Assert.assertTrue(isElementPresent(CalenderOk));
		Assert.assertTrue(CalenderCancle.getText().equalsIgnoreCase("CANCEL"));
		Assert.assertTrue(CalenderOk.getText().equalsIgnoreCase("OK"));
		Assert.assertTrue(isElementPresent(MonthDates));
		click(CalenderYear);
		waitForVisibility(CalenderCancle);
		Assert.assertTrue(isElementPresent(CalenderCancle));
		Assert.assertTrue(isElementPresent(CalenderOk));
		Assert.assertTrue(CalenderCancle.getText().equalsIgnoreCase("CANCEL"));
		Assert.assertTrue(CalenderOk.getText().equalsIgnoreCase("OK"));
		swipeToSeeUpsideElementsOfScreen(2);
		waitForVisibility(YearSelected);
		Assert.assertTrue(isElementPresent(YearSelected));
		click(YearSelected);
		waitForVisibility(CalenderCancle);
		Assert.assertTrue(CalenderCancle.getText().equalsIgnoreCase("CANCEL"));
		Assert.assertTrue(CalenderOk.getText().equalsIgnoreCase("OK"));
		Assert.assertTrue(isElementPresent(MonthDates));
		Assert.assertTrue(isElementPresent(CalenderPreviousButton));
		Assert.assertTrue(isElementPresent(CalenderNextButton));
		click(CalenderPreviousButton);
		waitForVisibility(MonthDates);
		Assert.assertTrue(isElementPresent(MonthDates));
		click(CalenderPreviousButton);
		waitForVisibility(MonthDates);
		Assert.assertTrue(isElementPresent(MonthDates));
		click(CalenderPreviousButton);
		waitForVisibility(MonthDates);
		Assert.assertTrue(isElementPresent(MonthDates));
		click(CalenderNextButton);
		waitForVisibility(MonthDates);
		Assert.assertTrue(isElementPresent(MonthDates));
		Assert.assertTrue(isElementPresent(DateSelected));
		Assert.assertTrue(isEnabled(DateSelected));
		if(isEnabled(DateSelected))
		{
			click(DateSelected);
			Thread.sleep(2000);
			click(CalenderOk);
			String DOBTextAfter = (DOBTextField.getText());
			if(DOBTextBefore!=DOBTextAfter)
			{
				Assert.assertTrue(isEnabled(SaveChangesButton));
				Assert.assertTrue(isElementVisible(DoBToggleSwitch));
				Assert.assertFalse(!isElementVisible(DobYearSwitch));
				click(DoBToggleSwitch);
				waitForVisibility(DoBToggleSwitch);
				Assert.assertTrue(isElementVisible(DoBToggleSwitch));
				Assert.assertTrue(isElementVisible(DobYearSwitch));
				click(SaveChangesButton);
				Thread.sleep(2000);
			}
			if (DOBText==DOBTextAfter) 
			{
				Thread.sleep(2000);
		     	Assert.assertTrue(isElementPresent(EditProfileButton));
		     	Thread.sleep(4000);
				
			}
			
		}
		Assert.assertTrue(isElementPresent(WebsiteTextField));
		click(WebsiteTextField);
		waitForVisibility(Pageheader);
		Assert.assertTrue(isElementPresent(Pageheader));
		Assert.assertTrue(Pageheader.getText().equalsIgnoreCase("Website"));
		Assert.assertTrue(isElementPresent(Inputfield));
		Inputfield.clear();
		Inputfield.sendKeys("www.kooapp.com");
		Assert.assertTrue(isElementPresent(BackButton));
		Assert.assertTrue(isElementPresent(SaveChangesButton));
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		click(SaveChangesButton);
		//clickAndroidDeviceBackBttn();
	//	waitForVisibility(EmailTextField);
		//Assert.assertTrue(isElementPresent(EmailTextField));
		//Assert.assertTrue(isElementPresent(MobileNoTextField));
		swipeToDownsideTillElementPresent(SocialLinksField, 3);
		//swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(SocialLinksField);
		Assert.assertTrue(isElementPresent(SocialLinksField));
		Assert.assertTrue(isElementPresent(ShareLinksIcon));
		Assert.assertTrue(isElementPresent(FacebookLink));
		click(FacebookLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Facebook"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		SocialLinkField.clear();
		SocialLinkField.sendKeys("public/Adam-Adams");
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		waitForVisibility(TwitterLink);
		Assert.assertTrue(isElementPresent(TwitterLink));
		click(TwitterLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("Twitter"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		SocialLinkField.clear();
		SocialLinkField.sendKeys("ScottAdamsSays?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		waitForVisibility(LinkedinLink);
		Assert.assertTrue(isElementPresent(LinkedinLink));
		click(LinkedinLink);
		waitForVisibility(LinkHeaders);
		Assert.assertTrue(LinkHeaders.getText().equalsIgnoreCase("LinkedIn"));
		Assert.assertTrue(isElementPresent(SocialLinkField));
		SocialLinkField.clear();
		SocialLinkField.sendKeys("company/adamtek");
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(SaveLinkButton));
		click(SaveLinkButton);
		
	}

	


	
	
		


	
	

}
