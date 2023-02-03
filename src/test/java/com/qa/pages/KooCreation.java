package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utils.TestUtils;

import io.cucumber.java.en.Then;

public class KooCreation extends BasePage{

	TestUtils utils = new TestUtils();

	@FindBy(id="com.koo.app:id/circular_fab")
	public WebElement addButton;

	@FindBy(id="com.koo.app:id/speechToTextIcon")
	public WebElement textIcon;

	@FindBy(id="com.koo.app:id/audioTabIcon")
	public WebElement micIcon;

	@FindBy(id="com.koo.app:id/videoTabIcon")
	public WebElement videoIcon;

	@FindBy(id="com.koo.app:id/custom_tab_text")
	public WebElement englishIcon;

	@FindBy(id="com.koo.app:id/post_button")
	public WebElement postButton;

	@FindBy(id="com.koo.app:id/creator_iv")
	public WebElement profileIcon;

	@FindBy(id="com.koo.app:id/poll_record")
	public WebElement pollIcon;

	@FindBy(id="com.koo.app:id/settings_icon")
	public WebElement settingsIcon ;

	@FindBy(id="com.koo.app:id/et_choice_one")
	public WebElement pollCreationTextBox1;

	@FindBy(id="com.koo.app:id/post_text_view")
	public WebElement whatsYourMindText;

	@FindBy(id="com.koo.app:id/et_choice_two")
	public WebElement pollCreationTextBox2;

	@FindBy(id="com.koo.app:id/et_choice_one")
	public WebElement pollCreationText1;

	@FindBy(id="com.koo.app:id/et_choice_one")
	public WebElement pollCreationText2;

	@FindBy(id="com.koo.app:id/et_choice_three")
	public WebElement pollCreationTextBox3;

	@FindBy(id="com.koo.app:id/et_choice_four")
	public WebElement pollCreationTextBox4;

	@FindBy(id="com.koo.app:id/ic_close_poll")
	public WebElement closePollOptionButton;

	@FindBy(id="com.koo.app:id/tv_add_option")
	public WebElement addOptionButton;

	@FindBy(id="com.koo.app:id/back_imageview")
	public WebElement backButton;

	@FindBy(id="com.koo.app:id/layout_close")
	public WebElement backButtonInEditProfile;

	@FindBy(xpath="//android.widget.TextView[@index='0']")
	public WebElement enteredLanguageText;

	@FindBy(id="android:id/button1")
	public WebElement yesButtonOnConfirmationPopUp;

	@FindBy(id="android:id/button2")
	public WebElement noButtonOnConfirmationPopUp;

	@FindBy(id="com.koo.app:id/emoji")
	public WebElement emojiIcon;

	@FindBy(id="com.koo.app:id/post_text_view")
	public WebElement whatsYourMindTextBox;

	@FindBy(id="com.koo.app:id/custom_tab_text")
	public WebElement defaultLanguageText;

	@FindBy(xpath="//android.widget.TextView[@index='1']")
	public WebElement noOfPostCountInDiffrentLanguage;

	@FindBy(xpath="//android.view.ViewGroup")
	public List<WebElement> hastTagSuggestionList;

	@FindBy(xpath="//android.view.ViewGroup[@index='0']")
	public WebElement hastTagSuggestion;

	@FindBy(xpath="//android.widget.RelativeLayout[@index='0']")
	public WebElement userSuggestion;

	@FindBy(xpath="//android.view.ViewGroup")
	public List<WebElement> userSuggestionsList;

	@FindBy(id="com.koo.app:id/iv_add_link")
	public WebElement addlink;

	@FindBy(id="com.koo.app:id/character_count_textview")
	public WebElement charactarCountText;

	@FindBy(id="com.koo.app:id/post_text_view")
	public WebElement kooCreationTextBox;

	@FindBy(id="com.koo.app:id/link_editext")
	public WebElement attachLinkTextBox;

	@FindBy(id="com.koo.app:id/close_imageview")
	public WebElement closeTextBoxButton;

	@FindBy(id="com.android.packageinstaller:id/permission_deny_button")
	public WebElement denyButtonOnConfirmationPopup;

	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
	public WebElement allowButtonOnConfirmationPopup;

	@FindBy(id="com.koo.app:id/noButton")
	public WebElement denyRecordYourVoiceBttn;

	@FindBy(id="com.koo.app:id/yesButton")
	public WebElement AllowRecordYourVoiceBttn;

	@FindBy(id="com.koo.app:id/button_capture")
	public WebElement AudioRecordingButton;

	@FindBy(id="com.koo.app:id/close_imageview")
	public WebElement CancelAudioRecordingPopUp;

	@FindBy(id="com.koo.app:id/iv_add_image")
	public WebElement imageIcon;

	@FindBy(id="com.koo.app:id/album_name")
	public WebElement galleryText;

	@FindBy(id="com.koo.app:id/album_image")
	public WebElement cameraIcon;

	@FindBy(id="com.koo.app:id/album_title")
	public WebElement cameraText;

	@FindBy(id="com.koo.app:id/cancel_link_paste")
	public WebElement cancelLinkPasteInAttachLink;

	@FindBy(id="com.koo.app:id/save_link_view")
	public WebElement okButtonOnAttachLink;

	@FindBy(id="com.koo.app:id/rekoo_imageview")
	public WebElement rekooButton;

	@FindBy(id="com.koo.app:id/undo_rekoo_comment_imageview")
	public WebElement unDoRekooButton;

	@FindBy(id="com.koo.app:id/rt_with_content")
	public WebElement rekooWithComment;

	@FindBy(id="com.koo.app:id/comment_holder")
	public WebElement commentButton;

	@FindBy(id="com.koo.app:id/cursor_indicator")
	public WebElement commentTextBox;

	@FindBy(id="com.koo.app:id/topic_title_textview")
	public WebElement myPostTitle;

	@FindBy(id="com.koo.app:id/add_youtube_link")
	public WebElement youtubeLink;

	@FindBy(id="com.koo.app:id/tv_poll_duration")
	public WebElement pollLength;

	@FindBy(id="com.koo.app:id/header_text")
	public WebElement setPollDurationHeadr;

	@FindBy(id="com.koo.app:id/cancel_button")
	public WebElement cancelPollDurationButton;

	@FindBy(id="com.koo.app:id/set_button")
	public WebElement setPollDurationButton;

	@FindBy(id="com.koo.app:id/iv_options_more")
	public WebElement twoDotButton;

	@FindBy(xpath="//android.widget.LinearLayout[@index='1']")
	public WebElement editKooPollButton;

	@FindBy(id="com.koo.app:id/topic_title_textview")
	public WebElement postTitle;

	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='3']/android.widget.FrameLayout[@index='0']/android.widget.TextView[@index='0']")
	public WebElement pollText1;

	@FindBy(xpath="//android.widget.FrameLayout[@index='1']/android.widget.TextView[@index='1']")
	public WebElement pollText2;

	@FindBy(xpath="//android.widget.TextView[@index='1']")
	public WebElement optionCharctarCount;

	@FindBy(xpath="//android.widget.TextView[@index='7']")
	public WebElement kooTitleCount;

	@FindBy(id="com.koo.app:id/img_my_profile")
	public WebElement userProfileIcon;

	@FindBy(id="com.koo.app:id/ivAdd")
	public WebElement kooCreationButton;

	@FindBy(id="com.koo.app:id/add_language_iv")
	public WebElement addLanguageButton;

	@FindBy(id="com.koo.app:id/active_languages_tv")
	public WebElement activeLanguageHeadr;

	@FindBy(id="com.koo.app:id/other_languages_tv")
	public WebElement othersLanguageHeadr;

	@FindBy(xpath="//android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='0']/android.widget.CheckBox[@index='0']")
	public WebElement languageSelectionCheckBox;

	@FindBy(xpath="//android.widget.LinearLayout[@index='3']/android.view.ViewGroup/android.widget.CheckBox")
	public List<WebElement> listOfLanguageSelectionCheckobox;

	@FindBy(xpath="//android.widget.LinearLayout")
	public List<WebElement> listOfLanguageONKooCreationSCreen;

	@FindBy(xpath="//android.widget.LinearLayout[@index='3']/android.view.ViewGroup[@index='0']/android.widget.CheckBox[@index='0']")
	public WebElement otherLanguagesCheckBox;

	@FindBy(xpath="//android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='1']")
	public WebElement activeLanguagesCheckBox;

	@FindBy(id="com.koo.app:id/done_tv")
	public WebElement doneButton;

	@FindBy(id="com.koo.app:id/edit_profile_button")
	public WebElement edit_profile_button;

	@FindBy(id="com.koo.app:id/fl_settings")
	public WebElement settingsTab;

	@FindBy(id="com.koo.app:id/add_language_iv")
	public WebElement languageSelectionPlusIcon;

	@FindBy(id="com.koo.app:id/language_layout")
	public WebElement languageSelectionOnEditProfile;

	@FindBy(xpath="//android.widget.RelativeLayout[@index='1']/android.widget.RelativeLayout[@index='0']/android.widget.ImageView[@index='2']")
	public List<WebElement> tickButtonList;

	@FindBy(id="com.koo.app:id/nigeria_card")
	public WebElement nigeriaButton;

	@FindBy(id="com.koo.app:id/india_card")
	public WebElement IndiaButton;

	@FindBy(id="com.koo.app:id/language_name_script_nigeria")
	public WebElement nigeriaAvailiableLanguage;

	@FindBy(id="com.koo.app:id/channel_name_textview")
	public WebElement kooNigeriaOfficialHeadr;

	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	public WebElement languageButton;

	@FindBy(xpath = "//android.widget.TextView[@text='(Hindi)']")
	public WebElement hindiLanguageButton;

	@FindBy(xpath = "//android.widget.TextView[@text='(Coming Soon)']")
	public WebElement comingSoonText;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']")
	public WebElement kooCreationButtonForOtherLanguage;

	@FindBy(id="com.koo.app:id/translate_tv")
	public WebElement translateFromOrignalLangugeButton;

	@FindBy(id = "com.koo.app:id/all_koos_switch")
	public WebElement applyForAllKoosButton;

	@FindBy(xpath = "//android.widget.TextView[@index='1']")
	public WebElement commentPrefrencesHeadr;

	@FindBy(id="com.koo.app:id/backArrow")
	public WebElement backButtonInCommentPrefrences;

	@FindBy(id="com.koo.app:id/save_button")
	public WebElement saveButton;

	@FindBy(xpath ="//android.widget.TextView[@index='2']")
	public WebElement postTitleOnTheHomePageText;

	@FindBy(xpath ="//android.widget.TextView[@text='Delete Koo']")
	public WebElement deleteKooPost;

	@FindBy(id = "com.koo.app:id/tab_text")
	public WebElement noOfPostCount;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='1']")
	public WebElement noOfLanguagePostCount;

	@FindBy(xpath = "//android.widget.Button[@text='Not Now']")
	public WebElement update_PopUp;

	@FindBy(id="com.koo.app:id/likes_holder")
	public WebElement likeButton;

	@FindBy(id="com.koo.app:id/whatsapp_holder")
	public WebElement whatshappShareButton;

	@FindBy(id="com.koo.app:id/generic_share_holder")
	public WebElement shareButton;
	
	@FindBy(id="com.koo.app:id/tv_available_lng_count")
	public WebElement availableLanguageCount;
	
	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	public WebElement enlishLanguagePostButtoon;
	
	@FindBy(xpath = "//android.widget.TextView[@text='हिंदी']")
	public WebElement hindiLangugagePostButton;


	String title="I Verify user is able to add hashtags and the suggestion list should be displayed and user should be able to select any one from the "
			+ "list or add own hashtag and I Verify user is able to mention any user and the suggestion "
			+ "list should be displayed and user should be able to select any one from the list."
			+ "I VerifyI Verify user is able to add title from minimum of one to maximum of fourhundred characters ";

	String link="https://www.youtube.com/";

	public void verify_whats_on_your_mind_text_is_displayed_in_the_selected_language() throws InterruptedException {
		Thread.sleep(5000);
		click(addButton);
		Thread.sleep(1500);
		//Assert.assertTrue(whatsYourMindText.getText().equalsIgnoreCase("What's on your mind..."));	   
		//System.out.print(whatsYourMindText.getText());
	}

	public void verify_the_post_button_on_the_top_right_of_the_screen() {
		Assert.assertTrue(isElementPresent(postButton));

	}

	public void verify_the_back_button_on_the_top_left_of_the_screen() {
		Assert.assertTrue(isElementPresent(backButton));
	}

	public void verify_the_text_audio_and_video_icon_below_the_koo_title_box() {
		Assert.assertTrue(isElementPresent(videoIcon));
		Assert.assertTrue(isElementPresent(micIcon));
		Assert.assertTrue(isElementPresent( textIcon)); 
	}


	public void verify_the_link_images_and_title_character_count_at_the_bottom_of_the_screen() {
		Assert.assertTrue(isElementPresent(emojiIcon));
		Assert.assertTrue(isElementPresent(addlink));
		Assert.assertTrue(charactarCountText.getText().equalsIgnoreCase("0 / 400")); 
	}

	public void verify_the_profile_picture_to_the_left_of_the_title_box() {
		Assert.assertTrue(isElementPresent(profileIcon));
	}

	public void verify_on_tapping_on_title_field_keyboard_should_open_and_on_tapping_anywhere_else_apart_from_keyboard_and_title_field_it_should_disappear() throws InterruptedException {
		Thread.sleep(5000);
		click(kooCreationTextBox);
		Assert.assertTrue(isKeyPadShown());
		Thread.sleep(2000);
		click(profileIcon);
		Thread.sleep(5000);
		Assert.assertFalse(!isKeyPadShown());
	}

	public void verify_on_tapping_on_tapping_on_mic_or_video_icon_for_the_first_time_user_should_get_permissions_popup_after_allowing_user_should_navigate_to_recording_screen() throws InterruptedException {
		waitForVisibility(micIcon);
		click(micIcon);
		Assert.assertTrue(isElementPresent(allowButtonOnConfirmationPopup));
		Assert.assertTrue(isElementPresent(denyButtonOnConfirmationPopup));
		Thread.sleep(2500);
		click(allowButtonOnConfirmationPopup);
		Thread.sleep(500);
		click(allowButtonOnConfirmationPopup);
		Thread.sleep(500);
		Assert.assertTrue(isElementPresent(AudioRecordingButton));
		click(CancelAudioRecordingPopUp);
	}


	public void verify_on_tapping_on_images_icon_user_should_navigate_to_gallery_and_on_tapping_on_back_button_user_should_navigate_to_koo_creation_screen() throws InterruptedException {
		Thread.sleep(1500);
		waitForVisibility(imageIcon);
		click(imageIcon);
		Thread.sleep(1500);
		Assert.assertTrue(galleryText.getText().equalsIgnoreCase("Gallery"));
		Assert.assertTrue(isElementPresent(cameraIcon));
		click(backButton);
		Assert.assertTrue(isElementPresent(imageIcon));
	}


	public void verify_on_tapping_on_cancel_button_the_link_field_is_closed() throws InterruptedException {
		Thread.sleep(2500);
		click(closeTextBoxButton);
		Assert.assertTrue(isElementPresent(whatsYourMindTextBox));
	}

	public void verify_on_typing_or_pasting_any_link_save_button_is_enabled() {
		click(attachLinkTextBox);
		sendKeys(attachLinkTextBox,"https://www.youtube.com/");
		waitForVisibility(okButtonOnAttachLink);
		Assert.assertTrue(isEnabled(okButtonOnAttachLink));
		clear(attachLinkTextBox);
	}

	public void verify_on_long_press_in_the_link_field_user_is_able_to_paste_the_copied_link() {
		waitForVisibility(addlink);
		click(addlink);
		sendKeys(attachLinkTextBox, link);

	}

	public void verify_on_tapping_the_cancel_button_beside_the_link_field_the_field_should_be_cleared() {
		click(cancelLinkPasteInAttachLink);
	}
	public void verify_user_is_able_to_post_koo_only_by_entering_title() {
		String post="The automated koo post";
		sendKeys(whatsYourMindTextBox,post);
		Assert.assertTrue(isEnabled(postButton));
		click(settingsIcon);
		//Assert.assertTrue(commentPrefrencesHeadr.getText().equalsIgnoreCase("Comment Preferences"));
		click(applyForAllKoosButton);
		Assert.assertTrue(isEnabled(saveButton));
		waitForVisibility(backButtonInCommentPrefrences);
		click(backButtonInCommentPrefrences);
		waitForVisibility(postButton);
		click(postButton);
		//Assert.assertTrue(post.equalsIgnoreCase(myPostTitle.getText()));

	}

	public void verify_user_is_able_to_post_koo_only_by_attaching_link() throws InterruptedException {
		sendKeys(whatsYourMindTextBox,link);
		Assert.assertTrue(isEnabled(postButton));
		Thread.sleep(3500);
		//click(postButton);
		//clear(whatsYourMindTextBox);
		//Assert.assertTrue(link.equalsIgnoreCase(myPostTitle.getText()));
	}

	public void verify_user_is_able_to_rekoo_with_comment_on_tapping_on_rekoo_button_and_selecting_rekoo_with_comment() {
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		sendKeys(whatsYourMindTextBox,"the rekoo automated comment");
		click(postButton);
	}

	public void verify_user_is_able_to_comment_on_tapping_on_comment_button() throws InterruptedException {
		waitForVisibility(commentButton);
		click(commentButton);
		waitForVisibility(commentTextBox);
		sendKeys(whatsYourMindTextBox, "The automated reply of comment"); 
		Thread.sleep(500);
		click(postButton);
	}


	public void verify_user_is_able_to_see_youtube_icon_at_bottom_of_the_screen() {
		Assert.assertTrue(isElementPresent(youtubeLink));
	}

	public void verify_user_is_able_to_see_the_poll_icon_at_the_bottom_of_the_screen() throws InterruptedException {
		waitForVisibility(addButton);
		click(addButton);
		Assert.assertTrue(isElementPresent(pollIcon));
		click(pollIcon);
		Assert.assertTrue(isElementPresent(pollCreationText1));
		Assert.assertTrue(isElementPresent(addOptionButton));
		Assert.assertTrue(isElementPresent(pollCreationText2));  
	}

	public void verify_on_title_box_by_default_poll_title_should_be_empty() {
		pollCreationText1.getText().equalsIgnoreCase("Option 1");
		pollCreationText2.getText().equalsIgnoreCase("Option 2");
	}
	public void verify_by_default_there_should_be_poll_options_tapping_on_icon_options_box_should_increase() {
		Assert.assertTrue(isElementPresent(pollCreationText2));  
		click(addOptionButton);
		waitForVisibility(pollCreationTextBox3);
		Assert.assertTrue(isElementPresent(pollCreationTextBox3));   
	}
	public void verify_user_should_be_able_to_create_poll_with_min_and_max_options() throws InterruptedException {
		waitForVisibility(pollIcon);
		click(pollIcon);
		sendKeys(kooCreationTextBox, "The automated reply1");
		sendKeys(pollCreationTextBox1, "The first automated poll");
		sendKeys(pollCreationTextBox2, "The second automated poll");
		Assert.assertTrue(isEnabled(postButton));
		Thread.sleep(500);
		clear(kooCreationTextBox);
		clear(pollCreationTextBox1);
		clear(pollCreationTextBox2);
		Thread.sleep(500);
		sendKeys(kooCreationTextBox, "The automated reply2");
		sendKeys(pollCreationTextBox1, "The first automated poll");
		sendKeys(pollCreationTextBox2, "The second automated poll");
		click(addOptionButton);
		sendKeys(pollCreationTextBox3, "The third automated poll");
		Assert.assertTrue(isEnabled(postButton));
		Thread.sleep(800);
		clear(kooCreationTextBox);
		clear(pollCreationTextBox1);
		clear(pollCreationTextBox2);
		clear(pollCreationTextBox3);
		Thread.sleep(500);
		sendKeys(kooCreationTextBox, "The automated reply");
		sendKeys(pollCreationTextBox1, "The first automated poll");
		sendKeys(pollCreationTextBox2, "The second automated poll");
		sendKeys(pollCreationTextBox3, "The third automated poll");
		click(addOptionButton);
		sendKeys(pollCreationTextBox4, "The third automated poll");
		Assert.assertTrue(isEnabled(postButton));
	}

	public void verify_there_should_be_cancel_button_on_options_section() {
		Assert.assertTrue(isElementPresent(closePollOptionButton));
	}

	public void verify_after_entering_the_text_inside_options_box_and_tapping_on_cancel_button_a_pop_up_should_display() {
		sendKeys(pollCreationTextBox1, "The first automated poll");
		click(closePollOptionButton);
		Assert.assertTrue(isElementPresent(yesButtonOnConfirmationPopUp));
		Assert.assertTrue(isElementPresent(noButtonOnConfirmationPopUp));
		click(yesButtonOnConfirmationPopUp);
	}

	public void verify_by_default_poll_duration_should_be_day() {
		waitForVisibility(pollIcon);
		Assert.assertTrue(pollLength.getText().equalsIgnoreCase("1 Day"));
	}


	public void verify_user_should_not_be_able_to_post_poll_without_title() throws InterruptedException {
		waitForVisibility(pollIcon);
		click(pollIcon);
		sendKeys(pollCreationTextBox1, "The first automated poll");
		Assert.assertFalse(!isEnabled(postButton));
		sendKeys(kooCreationTextBox, "The automated reply post");
		sendKeys(pollCreationTextBox2, "The second automated poll");
		Assert.assertTrue(isEnabled(postButton));
		click(postButton);
		Thread.sleep(2000);
		//click(closePollOptionButton);
		//waitForVisibility(yesButtonOnConfirmationPopUp);
		//click(yesButtonOnConfirmationPopUp);
	}

	public void verify_error_message_should_show_to_the_user_on_creating_same_poll_options_in_poll() {
		clear(pollCreationTextBox1);
		sendKeys(pollCreationTextBox1, "The first automated poll");
		sendKeys(pollCreationTextBox2, "The first automated poll");
	}

	public void verify_user_should_able_to_edit_poll_until_there_are_no_action_on_poll() {
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		waitForVisibility(editKooPollButton);
		click(editKooPollButton);
		clear(pollCreationTextBox1);
		clear(pollCreationTextBox2);
		sendKeys(pollCreationTextBox1, "The first edited automated poll");
		sendKeys(pollCreationTextBox2, "The second edited automated poll");
		waitForVisibility(postButton);
		click(postButton);

	}

	public void verify_on_selecting_audio_or_video_options_while_poll_creation_poll_creation_should_be_disabled() {
		waitForVisibility(pollIcon);
		click(pollIcon);
		click(micIcon);
		Assert.assertFalse(!isEnabled(micIcon));
		waitForVisibility(videoIcon);
		click(videoIcon);
		Assert.assertFalse(!isEnabled(videoIcon));

	}

	public void verify_on_tapping_default_poll_duration_a_pop_up_should_display_where_user_can_set_the_time_for_poll() {
		waitForVisibility(pollLength);
		click(pollLength);
		Assert.assertTrue(isElementPresent(setPollDurationHeadr));
		Assert.assertTrue(isElementPresent(cancelPollDurationButton));
		Assert.assertTrue(isElementPresent(setPollDurationButton));
		click(setPollDurationButton);

	}

	public void verify_user_is_able_to_enter_upto_thirty_five_characters_on_options_box() throws InterruptedException {
		Assert.assertTrue(optionCharctarCount.getText().equalsIgnoreCase("35"));
		sendKeys(pollCreationTextBox1, "The is to check the length of the t");

	}
	public void verifyUserIsAbleToAddTitleFromMinimumOfToMaximumOfCharacters() throws InterruptedException {
		sendKeys(whatsYourMindTextBox,"a");
		Assert.assertTrue(kooTitleCount.getText().equalsIgnoreCase("1 / 400"));
		Assert.assertTrue(isEnabled(postButton));
		Thread.sleep(500);
		clear(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox,title);
		Thread.sleep(500);
		Assert.assertTrue(kooTitleCount.getText().equalsIgnoreCase("400 / 400"));
		clear(whatsYourMindTextBox);

	}

	public void verifyUserIsAbleToAddHashtagsAndTheSuggestionListShouldBeDisplayedAndUserShouldBeAbleToSelectAnyOneFromTheListOrAddOwnHashtag() {
		sendKeys(whatsYourMindTextBox,"#good");
		for(WebElement li:hastTagSuggestionList) {
			System.out.println(li.getText());
			click(hastTagSuggestion);
		}
		clear(whatsYourMindTextBox);   
	}

	public void verifyUserIsAbleToMentionAnyUserAndTheSuggestionListShouldBeDisplayedAndUserShouldBeAbleToSelectAnyOneFromTheList() throws InterruptedException {
		sendKeys(whatsYourMindTextBox,"@Tiger");
		Thread.sleep(500);
		for(WebElement li:userSuggestionsList) {
			System.out.println(li.getText());
			click(userSuggestion);
		}
		Thread.sleep(1000);
		clear(whatsYourMindTextBox);  
		Thread.sleep(2000);
	}

	public void verifyIfTheUserIsAbleToAddALinkInTitleField() throws InterruptedException {
		waitForVisibility(addButton);
		click(addButton);
		sendKeys(whatsYourMindTextBox,"https://www.kooapp.com/");
		Assert.assertTrue(isEnabled(postButton));
		Thread.sleep(1000);
		clear(whatsYourMindTextBox);
	}

	public void verifyGIFIconAtTheBottomOfKooCreationScreen() {
		Assert.assertTrue(isElementPresent(emojiIcon));

	}

	public void verifyEnteredTextIsTranscriptedInSelectedLanguage() {
		Assert.assertTrue(defaultLanguageText.getText().equalsIgnoreCase("English"));

	}

	public void onTappingKooCreationButtonUserShouldLandOnMultiLingualKooCreationScreenFromFeedOwnProfileCreateYourFirstKooButton() {
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(backButton);
		Assert.assertTrue(isElementPresent(whatsYourMindText));
		click(backButton);
		waitForVisibility(kooCreationButton);
		click(kooCreationButton);
		Assert.assertTrue(isElementPresent(whatsYourMindText));
		waitForVisibility(backButton);
		click(backButton);
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		Assert.assertTrue(isElementPresent(edit_profile_button));
		waitForVisibility(addButton);
		click(addButton);
		Assert.assertTrue(isElementPresent(whatsYourMindText));
		waitForVisibility(backButton);
		click(backButton);
		waitForVisibility(backButtonInEditProfile);
		click(backButtonInEditProfile);
	}

	public void verifyOnTappingPlusButtonUserShouldNavigateToLanguageSelectionScreen() {
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(languageSelectionPlusIcon);
		click(languageSelectionPlusIcon);
		Assert.assertTrue(isElementPresent(activeLanguageHeadr));
		Assert.assertTrue(isElementPresent(othersLanguageHeadr ));

	}

	public void verifyRemaininglanguagesShouldShowOnOtherLanguagesSectionWithEmptyCheckbox(){
		waitForVisibility(languageSelectionCheckBox);
		//Assert.assertTrue(languageSelectionCheckBox.isSelected());
		for(WebElement el:listOfLanguageSelectionCheckobox) {
			Assert.assertTrue(!el.isSelected()); 
		}

	}

	public void verifyOnSelectingTheLanguageFromOthersSectionSelectedLanguagesShouldAddOnActiveLanguagesListWithCheckboxEnabledAndLanguageOrderingToggleButton() throws InterruptedException {
		int count=listOfLanguageSelectionCheckobox.size();
		waitForVisibility(otherLanguagesCheckBox);
		click(otherLanguagesCheckBox);
		Thread.sleep(5000);
		int count1=listOfLanguageSelectionCheckobox.size();
		Assert.assertNotEquals(count, count1);

	}

	public void verifyTappingDoneButtonOnLanguageSelectionScreenUserShouldNavigateToKooCreationScreenWithAllTheAddedLanguages() {
		click(doneButton);
		Assert.assertTrue(isElementPresent(whatsYourMindText));
		Assert.assertTrue(listOfLanguageONKooCreationSCreen.size()>1);

	}	

	public void verifyOnDeselctingTheLanguageForActiveLanguageSectionRespectiveLanguageShouldShowOnOtherLangauge() {
		waitForVisibility(languageSelectionPlusIcon);
		int countKooLanguageOnCreationScreen=listOfLanguageONKooCreationSCreen.size();
		click(languageSelectionPlusIcon);
		int count=listOfLanguageSelectionCheckobox.size();
		click(activeLanguagesCheckBox);
		int count1=listOfLanguageSelectionCheckobox.size();
		Assert.assertNotEquals(count, count1);
		click(doneButton);
		waitForVisibility(whatsYourMindText);
		int countKooLanguageAfterDeselecting=listOfLanguageONKooCreationSCreen.size();
		Assert.assertNotEquals(countKooLanguageOnCreationScreen,countKooLanguageAfterDeselecting );
		click(backButton);

	}

	public void verify_what_on_your_mind_text_should_in_respective_languages() {
		waitForVisibility(whatsYourMindText);
	}

	public void verifyThereShouldBeTwoCountriesOnLangaugeSelectionScreenIndiaAndNigeria() {
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
	}

	public void  verify_after_switching_the_country_india_and_nigeria_active_languages_section_should_be_empty() {
		waitForVisibility(nigeriaButton);
		click(nigeriaButton);
		for(WebElement el:tickButtonList) {
			Assert.assertTrue(!el.isSelected());
		}	
	}

	public void verify_user_should_be_able_to_select_both_indian_nigerian_languages_for_mlk_creation() {
		waitForVisibility(nigeriaButton);
		click(nigeriaButton);
		waitForVisibility(nigeriaAvailiableLanguage);
		click(nigeriaAvailiableLanguage);
		waitForVisibility(kooNigeriaOfficialHeadr);
		Assert.assertTrue(kooNigeriaOfficialHeadr.getText().equalsIgnoreCase("Koo Nigeria Official"));
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(IndiaButton);
		click(IndiaButton);
		waitForVisibility(languageButton);
		click(languageButton);

	}

	public void verify_unavailable_languages_should_show_on_other_languages_section_with_empty_checkbox_and_coming_soon_button() {
		//waitForVisibility(settingsTab);
		//click(settingsTab);
		//waitForVisibility(languageSelectionOnEditProfile);
		//click(languageSelectionOnEditProfile);
		swipeToSeeDownsideElementsOfScreen(2);
		Assert.assertTrue(isElementPresent(comingSoonText));
		//Assert.assertTrue(isElementSelected(otherLanguagesCheckBox));
	}


	public void verify_koo_creation_title_box_should_move_on_swiping_with_respective_language_highlighting() {
		waitForVisibility(kooCreationButtonForOtherLanguage);
		click(kooCreationButtonForOtherLanguage);
	}

	public void verify_button_shown_in_active_languages_title_box_tapping_the_button_translates_text_from_original_language_should_load_in_title() {
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox,"Checking language convertion");
		click(languageSelectionPlusIcon);
		waitForVisibility(hindiLanguageButton);
		click(hindiLanguageButton);
		click(doneButton);
		waitForVisibility(whatsYourMindTextBox);
		waitForVisibility(editKooPollButton);
		click(editKooPollButton);
		waitForVisibility(translateFromOrignalLangugeButton);
		Assert.assertTrue(translateFromOrignalLangugeButton.getText().equalsIgnoreCase("Translate from original"));
		click(translateFromOrignalLangugeButton);
		clear(whatsYourMindText);
		sendKeys(whatsYourMindText, "à¤�à¤ª à¤®à¥‡à¤‚ à¤¹à¤¿à¤‚à¤¦à¥€ à¤­à¤¾à¤·à¤¾ à¤®à¥‡à¤‚ à¤šà¥‡à¤•à¤¿à¤‚à¤— à¤ªà¥‹à¤¸à¥�à¤Ÿ");
	}
	
	
public void verifyAvailableInTheseManyLanguagesTextShouldShowOnTheKooCardInFeedAsWellAsOnKooDetailedScreenWithBlueColourAndGlobeIcon() {
	    Assert.assertTrue(isEnabled(postButton));
	    click(postButton);
	    waitForVisibility(userProfileIcon);
	    Assert.assertTrue(availableLanguageCount.getText().equalsIgnoreCase("Available in 2 languages"));
	    Assert.assertTrue(isElementPresent(hindiLangugagePostButton));
	    Assert.assertTrue(isElementPresent(enlishLanguagePostButtoon));
	    waitForVisibility(hindiLanguageButton);
		   click(hindiLanguageButton);
	}

public void verifyUserShouldBeAbleToImportHastagFromOriginalLanguageShouldBeInBlueColour() throws InterruptedException {
    waitForVisibility(addButton);
    click(addButton);
    waitForVisibility(whatsYourMindTextBox);
    sendKeys(whatsYourMindTextBox, "#Good");
    click(editKooPollButton);
    waitForVisibility(translateFromOrignalLangugeButton);
    click(translateFromOrignalLangugeButton);
    Assert.assertTrue(whatsYourMindText.getText().equalsIgnoreCase("#Good"));
    click(languageButton);
    clear(whatsYourMindTextBox);
    Thread.sleep(1500);
    }

public void verifyUserShouldBeAbleToImportLinksAttachedInKooTitleFromOriginalLanguageShouldBeInBlueColour() {
	sendKeys(whatsYourMindTextBox,link);
	click(editKooPollButton);
    waitForVisibility(translateFromOrignalLangugeButton);
    click(translateFromOrignalLangugeButton);
    Assert.assertTrue(whatsYourMindText.getText().equalsIgnoreCase("#Good"));
    click(languageButton);
    clear(whatsYourMindTextBox);
}
	public void verifyAfterRefreshingTheFeedScreenPostedKoosShouldNotDisappear() {
		swipeToSeeUpsideElementsOfScreen(2);
		Assert.assertTrue(isElementPresent(postTitleOnTheHomePageText));
	}

	public void verifyKoosCountShouldIncreaseOnProfileScreenBasedOnTheLanguagesUserIsCreating() {
		waitForVisibility(addButton);
		click(userProfileIcon);
		waitForVisibility(edit_profile_button);
		waitForVisibility(noOfPostCount);
		String countNoPost=TestUtils.removeSpecialCharacters(noOfPostCount.getText());
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "Checking to increase the no of post count in profile");
		click(postButton);
		waitForVisibility(edit_profile_button);
		waitForVisibility(noOfPostCount);
		String countNoAfterPost=TestUtils.removeSpecialCharacters(noOfPostCount.getText());
		int count=Integer.parseInt(countNoPost);
		int count1=Integer.parseInt(countNoAfterPost);
		Assert.assertTrue(count1>count);	
	}


	public void verifyUserShouldBeAbleToDeleteIndividualKooFromProfileScreenAndKooDetailedScreen() throws InterruptedException {
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "Checking to delete the post from profile");
		Assert.assertTrue(isEnabled(postButton));
		click(postButton);
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		waitForVisibility(deleteKooPost);
		click(deleteKooPost);
		waitForVisibility(yesButtonOnConfirmationPopUp);
		click(yesButtonOnConfirmationPopUp);
		Thread.sleep(1500);
		/*
		Assert.assertTrue(isElementPresent(postTitleOnTheHomePageText));
		click(addButton);
		Assert.assertTrue(isElementPresent(whatsYourMindTextBox));
		sendKeys(whatsYourMindTextBox, "Checking to delete the post from profile");
		Assert.assertTrue(isEnabled(postButton));
		click(postButton);
		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("Checking to delete the post from profile"));
		 */
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		waitForVisibility(noOfPostCount);
		String countNoOfPostBeforeDelete=noOfPostCount.getText();
		Assert.assertTrue(isElementPresent(twoDotButton));
		click(twoDotButton);
		waitForVisibility(deleteKooPost);
		click(deleteKooPost); 
		waitForVisibility(yesButtonOnConfirmationPopUp);
		click(yesButtonOnConfirmationPopUp);
		String countNoOfPostAfterDelete=noOfPostCount.getText();
		Assert.assertNotSame(countNoOfPostBeforeDelete,countNoOfPostAfterDelete);

	}


	public void verifyOnChangingTheLanguageFromLanguageSelectionScreenAndBackToCurrentLanguagePostedKoosShouldNotDisappearOnFeedScreen() throws InterruptedException {
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "Checking the post for changing the language");
		Assert.assertTrue(isEnabled(postButton));
		click(postButton);
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("Checking the post for changing the language"));
		click(userProfileIcon);
		Assert.assertTrue(isElementPresent(edit_profile_button));
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(hindiLanguageButton);
		click(hindiLanguageButton);
		waitForVisibility(postTitleOnTheHomePageText);
		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("Checking the post for changing the language"));
		Thread.sleep(3500);
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(hindiLanguageButton);
		click(languageButton);
		Thread.sleep(3000);
		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("Checking the post for changing the language"));
	}


	public void verifyActionButtonsShouldShowForRespectiveLanguageKoosOnFeedScreenProfileScreenAndKooDetailedScreenLikeRekooCommentRekooWithComment() {
		waitForVisibility(commentButton);
		Assert.assertTrue(isElementPresent(commentButton));
		Assert.assertTrue(isElementPresent(whatshappShareButton));
		Assert.assertTrue(isElementPresent(shareButton));
		Assert.assertTrue(isElementPresent(likeButton));
		waitForVisibility(rekooButton);
		Assert.assertTrue(isElementPresent(rekooButton));
		if(isElementPresent(rekooWithComment)) {
			click(rekooWithComment);
			waitForVisibility(backButton);
			click(backButton);
		}else {

			Assert.assertTrue(isElementPresent(unDoRekooButton));
			click(unDoRekooButton);
		}

	}


	public void clickOnProfile() {
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(isElementPresent(edit_profile_button));
	}

	public void verifyHomePage() {
		waitForVisibility(addButton);
		Assert.assertTrue(isElementPresent(userProfileIcon));
	}

	public void verifyNumberIndicationOnPostButtonNumberOfLanguagesKooIsCreated() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(noOfLanguagePostCount.getText().equalsIgnoreCase("2"));

	}
	
public void verifyIfUserDoesNotPostTheKooInTheirOwnLanguagePostedMLKShouldDisappearAfterRefreshOnFeedScreen() {
	  
	}


}
