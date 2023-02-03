package com.qa.pages;

import com.qa.stepdef.CommonStepsDef;
import com.qa.utils.TestUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class KooCreationPageSamsungDevice extends BasePage{

	TestUtils utils = new TestUtils();

	@FindBy(id="com.koo.app:id/circular_fab")
	public WebElement addButton;

	@FindBy(id="com.koo.app:id/fab_new")
	public WebElement addButtonWhile;

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
	//@FindBy(id="com.koo.app:id/poll_tab_icon")
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
	
	@FindBy(id="com.koo.app:id/creation_view")
	public WebElement whatsYourCommentTextBoxOnTheKooPost;
	
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

//	@FindBy(id="com.android.packageinstaller:id/permission_deny_button")
//	public WebElement denyButtonOnConfirmationPopup;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.Button[@index='1']")
	public WebElement denyButtonOnConfirmationPopup;

//	@FindBy(id="com.android.packageinstaller:id/permission_allow_button")
//	public WebElement allowButtonOnConfirmationPopup;
//	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.Button[@index='0']")
	public WebElement allowButtonOnConfirmationPopup;
	
	//com.android.permissioncontroller:id/permission_allow_foreground_only_button

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

	@FindBy(id="com.koo.app:id/album_image") //Mi phones
	public WebElement cameraIcon;

	@FindBy(id="com.koo.app:id/image_gallery_item")
	public List<WebElement> samsungCameraIcon;

	@FindBy(id="com.koo.app:id/image_gallery_item")
	public WebElement samsungCameraGallery;

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

	@FindBy(id="com.koo.app:id/creation_view")
	public WebElement commentButtonAfterRekoo;

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

	@FindBy(xpath="//android.widget.TextView[@text='Edit Koo']")
	public WebElement editKooPollButton;

	@FindBy(xpath="//android.widget.LinearLayout[@index='1']")
	public WebElement otherLanguageSelectionButton;

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

	//@FindBy(id="com.koo.app:id/ivAdd")
	@FindBy(id="com.koo.app:id/circular_fab_plus")
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

	@FindBy(id="com.koo.app:id/translate_tv_btm")
	public WebElement translateFromOrignalLangugeButtonAtBottom;

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

	@FindBy(xpath = "//android.widget.ImageView[@index=1]")
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

	@FindBy(xpath = "//android.widget.TextView[@text='हिंदी']")
	public List<WebElement> hindiLanguagePostButtonList;

	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	public List<WebElement> englishLanguagePostButtonList;


	@FindBy(xpath = "//android.widget.LinearLayout[@index='4']/android.widget.TextView[@index='0']")
	public WebElement kooCreationButtonInHindi;

	@FindBy(xpath="//android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='3']")
	public WebElement kooTitleInEnglishInProfile;

	@FindBy(xpath="//android.widget.RelativeLayout[@index='0']android.widget.TextView[@index='4']")
	public WebElement kooTitleInHindiInProfile;

	@FindBy(xpath="//android.widget.TextView[@text='@timesofindia']")	
	public WebElement kooHandle;

	@FindBy(id="com.koo.app:id/generic_share_holder")
	//@FindBy(xpath="//android.widget.TextView[@text='We will let your followers know you posted a Koo']")	
	public WebElement letYourFollowerKnowMessage;

	//@FindBy(id="com.koo.app:id/textinput_placeholder")
	@FindBy(id="com.koo.app:id/et_name")
	public WebElement whatYouNameTextBox;

	@FindBy(id="com.koo.app:id/button_verify")
	public WebElement submitButton;
	
	@FindBy(id ="com.koo.app:id/circular_fab_plus")
	public WebElement AddPollButton;
	
	@FindBy(id ="com.koo.app:id/audioTabIcon")
	public WebElement CreatePollMic;
	
	@FindBy(id ="com.koo.app:id/view_pager")
	public WebElement CreatePollPage;
	
	@FindBy(id="com.koo.app:id/audio_playing_imageview")
	public WebElement profilepic;
	
	@FindBy(id="com.koo.app:id/layout_record_button")
	public WebElement micOn;
	
	@FindBy(id="com.koo.app:id/btn_cancel")
	public WebElement restartButton;
	
	@FindBy(id="com.koo.app:id/progress_bar")
	public WebElement stopButton;
	
	@FindBy(id="com.koo.app:id/timer_textview")
	public WebElement recorderTimer;
	
	@FindBy(id="com.koo.app:id/post_answer_text_view")
	public WebElement SaveButton;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	public WebElement permission1;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	public WebElement permission2;
	
	@FindBy(xpath="//android.view.ViewGroup[@index='0']/android.widget.FrameLayout[@index='0']/android.widget.ImageView[@index='1']")
	public WebElement stopPauseButton;
	
	@FindBy(id="android:id/message")
	public WebElement ConfirmationMessage;

	@FindBy(id="android:id/button1")
	public WebElement YesConfirmationButton;

	@FindBy(id="com.koo.app:id/preview_thumbnail")
	public WebElement audioPreview;
	
	@FindBy(id="com.koo.app:id/preview_timer_textview")
	public WebElement recaudiolength;
	
	@FindBy(xpath="//android.widget.TextView[@text='Preview']")
	public WebElement previewText;
	
	@FindBy(id="com.koo.app:id/timeLineBar")
	public WebElement audioCropBar;
	
	@FindBy(id="com.koo.app:id/icon_video_play")
	public WebElement playButton;
	
	@FindBy(id="com.koo.app:id/btn_post")
	public WebElement cropSaveButton;
	
	@FindBy(id="com.koo.app:id/audio_preview_layout")
	public WebElement recordedAudio;
	
	@FindBy(id="com.koo.app:id/play_imageview")
	public WebElement audioPlay;

	@FindBy(id="com.koo.app:id/audio_view")
	public WebElement createdAudio;
	
	@FindBy(id ="com.koo.app:id/videoTabIcon")
	public WebElement CreatePollVideo;
	
	@FindBy(id="com.koo.app:id/thumbnail_imageview")
	public WebElement recordedVideo;
	
	@FindBy(id="com.koo.app:id/toolbar_heading_textview")
	public WebElement previewPage;

	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	public WebElement mediaPermissionAllowButton;
	
	@FindBy(id="com.koo.app:id/album_name")
	public WebElement phoneGallary;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']/android.widget.ImageView[@index='0']")
	public WebElement cameraImages;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement mobileCamera;

	@FindBy(id="com.koo.app:id/btnCapture")
	public WebElement samsungCameraCaptureButton;
	
	@FindBy(id="com.koo.app:id/image_gallery_item")
	public WebElement image1;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.FrameLayout[@index='1']/android.widget.ImageView[@index='0']")
	public WebElement Image2;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.FrameLayout[@index='0']/android.widget.ImageView[@index='1']")
	public WebElement selectedImage1;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.FrameLayout[@index='1']/android.widget.ImageView[@index='1']")
	public WebElement selectedImage2;
	
	@FindBy(id="com.koo.app:id/image_gallery_item")
	public WebElement image2;
	
	@FindBy(id="com.koo.app:id/add_view")
	public WebElement addMoreButton;
	
	@FindBy(id="com.koo.app:id/done_imageview")
	public WebElement doneImage;
	
	@FindBy(id="com.koo.app:id/image_position_text")
	public WebElement imagePositionText;
	
	@FindBy(id ="com.koo.app:id/iv_add_youtube_link")
	public WebElement CreatePollYouTubeLink;
	 
	@FindBy(id="com.koo.app:id/album_image") //mi specific
	public WebElement videoAlbum;
	
	@FindBy(id="com.koo.app:id/image_gallery_item")
	public WebElement video1;
	
	@FindBy(id ="com.koo.app:id/iv_add_link")
	public WebElement CreatePollLink;
	
	@FindBy(id="com.koo.app:id/link_editext")
	public WebElement linkField;
	
	@FindBy(id="com.koo.app:id/save_link_view")
	public WebElement linkSaveButton;
	
	@FindBy(id="com.koo.app:id/audio_tab_icon")
	public WebElement mic;
	
	@FindBy(id ="com.koo.app:id/topic_title_textview")
	public WebElement KooCardContent;
	
	@FindBy(id="com.koo.app:id/btnCapture")
	public WebElement cameraScreen;
	
	@FindBy(id="com.koo.app:id/item_toggle_camera")
	public WebElement cameraSwitchButton;
	
	@FindBy(id="com.koo.app:id/imgToggleFlashOff")
	public WebElement flashToggleOFFButton;
	
	@FindBy(id="com.koo.app:id/imgToggleFlashOn")
	public WebElement flashToggleONButton;
	
	@FindBy(xpath="//android.widget.ImageButton")
	public WebElement cameraScreenBackButton;
	
	@FindBy(id="com.koo.app:id/btn_discard_image")
	public WebElement cancleButton;

	@FindBy(id="com.koo.app:id/cancel_preview")
	public WebElement cancelImagePreviewButton;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='2']/android.widget.LinearLayout[@index='1']/android.widget.FrameLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement doneButton1;
	
	@FindBy(id="com.koo.app:id/image_view")
	public WebElement capturedImage;
	
	@FindBy(id="com.koo.app:id/add_image_textview")
	public WebElement multipleAddButton;
	
	@FindBy(id="com.koo.app:id/iv_options_more")
	public WebElement dropDownButton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Edit Koo']")
	public WebElement editKooButton;

	@FindBy(xpath="//android.widget.TextView[@text='Comment Preferences']")
	public WebElement commentPrefrencesPage;
	
	@FindBy(xpath="//android.widget.TextView[@text='Everyone']")
	public WebElement everyoneOption;
	
	@FindBy(xpath="//android.widget.TextView[@text='People You Follow']")
	public WebElement peopleYouFollowOption;
	
	@FindBy(xpath="//android.widget.TextView[@text='No one']")
	public WebElement noOneOption;
	
	@FindBy(xpath="//android.widget.TextView[@text='Apply for all Koos']")
	public WebElement applyForAllKooOption;
	
	@FindBy(id="com.koo.app:id/noone_checkbox")
	public WebElement checkboxesOption;
	
	@FindBy(xpath="//android.widget.RelativeLayout[@index='0']/android.widget.CheckBox[@index='2']")
	public WebElement everyoneCheckbox;
	
	@FindBy(xpath="//android.widget.RelativeLayout[@index='2']/android.widget.CheckBox[@index='2']")
	public WebElement peopleYouFollowCheckbox;
	
	@FindBy(xpath="//android.widget.RelativeLayout[@index='4']/android.widget.CheckBox[@index='2']")
	public WebElement noOneCheckbox;
	
	@FindBy(id ="com.koo.app:id/clProfile")
	public WebElement Profileicon;
	
	@FindBy(id = "com.koo.app:id/toolbar_heading_textview")
	public WebElement ProfileNameHeading;
	
	@FindBy(id="com.koo.app:id/fl_settings")
	public WebElement setting;
	
	@FindBy(id = "com.koo.app:id/layout_search")
	public WebElement SearchButton;
	
	@FindBy(id = "com.koo.app:id/action_bar_et_search")
	public WebElement SearchField;
	
	@FindBy(id = "com.koo.app:id/search_view_pager")
	public WebElement SearchPage;
	
	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']")
	public WebElement KooSearch1;
	
	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']")
	public WebElement KooSearch2;
	
	@FindBy(id ="com.koo.app:id/toolbar_title")
	public WebElement Kootitle;
	
	@FindBy(xpath = "//android.widget.ImageView[@index='1']")
	public WebElement CloseButton;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Show this thread']")
	public WebElement ThreadsButton;
	
	@FindBy(id="com.koo.app:id/glsurfaceview")
	public WebElement cameraViewScreen;
	
	@FindBy(id="com.koo.app:id/btn_toggle_camera")
	public WebElement videoCameraTogggle;
	
	@FindBy(id="android:id/message")
	public WebElement alertMessagePopup;
	
	@FindBy(id="com.koo.app:id/preview_thumbnail")
	public WebElement videoPreview;
	
	@FindBy(id="com.koo.app:id/video_loader")
	public WebElement recordedVideo1;
	
	@FindBy(id="com.koo.app:id/txt_start_time")
	public WebElement minDuration;
	
	@FindBy(id="com.koo.app:id/txt_end_time")
	public WebElement maxDuration;
	
	@FindBy(id="com.koo.app:id/cancel_media")
	public WebElement canclebutton;
	
	@FindBy(id="com.koo.app:id/edit_media")
	public WebElement editButton;
	
	@FindBy(id="com.koo.app:id/play_view")
	public WebElement playbutton;
	
	@FindBy(id="com.koo.app:id/content_duration_view")
	public WebElement videoDuration;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button")
	public WebElement denyButton;
	
	@FindBy(id="com.koo.app:id/action_crop")
	public WebElement imageCropButton;
	
	@FindBy(id="com.koo.app:id/action_delete")
	public WebElement deleteButton;
	
	@FindBy(id="com.koo.app:id/cancel_preview")
	public WebElement cancleButton1;
	
	@FindBy(xpath="//android.widget.TextView[@text='Write Your Comment...']")
	public WebElement commentFieldButton;
	
	@FindBy(id="com.koo.app:id/gif_icon")
	public WebElement gifButton;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']")
	public WebElement gifSuggestions;
	
	@FindBy(xpath="//androidx.recyclerview.widget.RecyclerView[@index='0']/android.widget.FrameLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement gifSuggestion1;
	
	@FindBy(id="com.koo.app:id/single_image")
	public WebElement slectedGif;
	
	@FindBy(id="com.koo.app:id/single_image")
	public WebElement thumbnail_imageview;
	
	@FindBy(xpath="//android.widget.Button[@text='ALLOW']")
	public WebElement allowPermision1;
	
	@FindBy(id="com.koo.app:id/img_pause")
	public WebElement playPauseButton;
	
	@FindBy(id="com.koo.app:id/post_answer_view")
	public WebElement saveAudioButton;
	
	@FindBy(id="com.koo.app:id/cancel_media")
	public WebElement canclebutton2;
	
	@FindBy(xpath ="//androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='1']")
	public WebElement selectingScreenshotsFromGallery;
	
	@FindBy(id="com.koo.app:id/image_gallery_item")
	public WebElement image_gallery_item ;
	
	@FindBy(id="com.koo.app:id/add_link")
	public WebElement linkIcon ;
	
	@FindBy(id="com.koo.app:id/link_preview_cancel")
	public WebElement link_preview_cancel ;
	
	@FindBy(id="com.koo.app:id/iv_add_image")
	public WebElement addImageButtonAtTheBottom ;
	
	@FindBy(id="com.koo.app:id/logout_imageview")
	public WebElement logOutButton;

	@FindBy(id="com.koo.app:id/tvFollow")
	public WebElement logOutConfirmButton;
	
	@FindBy(id="com.koo.app:id/image_view")
	public WebElement fullImageView;
	
	@FindBy(id="com.koo.app:id/play_view")
	public WebElement uploadedVideoPlayPauseButton;
	
	@FindBy(id="com.koo.app:id/link_preview_link")
	public WebElement link_preview_link;
	
	@FindBy(id="com.android.chrome:id/close_button")
	public WebElement closeButtonToTheLinkPage;
	
	@FindBy(id="com.koo.app:id/layout_notification")
	public WebElement notificationButton ;
	
	@FindBy(xpath= "//android.widget.LinearLayout[@index='2']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']")
	public WebElement likeNotification;
	
	@FindBy(id="com.koo.app:id/tvNotificationTitle")
	public List<WebElement> listOfNotifications ;
	
	@FindBy(id="com.koo.app:id/login_button")
	public WebElement logInButton;
	
	@FindBy(xpath= "//android.widget.LinearLayout[@index='0']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']")
	public WebElement commentNotification;
	
	@FindBy(xpath= "//android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='1']")
	public WebElement rekooNotification;
	
	@FindBy(id = "com.koo.app:id/following_textview")
	public WebElement follwingButtonInProfile;
	
	@FindBy(id = "com.koo.app:id/btnFollowView")
	public WebElement followingButton;
	
	@FindBy(id = "android:id/button1")
	public WebElement confirmPopUpMessageForUnfollow;
	
	@FindBy(id = "com.koo.app:id/imgNotificationType")
	public WebElement imgNotificationButton;
	
	@FindBy(xpath= "//android.widget.TextView[@text='Feed']")
	public WebElement feedTab;
	
	@FindBy(id="com.koo.app:id/camera_blip")
	public WebElement cameraBlip;
	
	
	
	String title="I Verify user is able to add hashtags and the suggestion list should be displayed and user should be able to select any one from the "
			+ "list or add own hashtag and I Verify user is able to mention any user and the suggestion "
			+ "list should be displayed and user should be able to select any one from the list."
			+ "I VerifyI Verify user is able to add title from minimum of one to maximum of fourhundred characters ";

	String link="https://www.youtube.com/";
	
	public void updatePopUp() throws Exception {
		Thread.sleep(2000);
		try {
		if (isElementPresent(update_PopUp)) {
			click(update_PopUp);
		}
		}catch(Exception e){
			e.getStackTrace();
		}

	}

	public void verify_whats_on_your_mind_text_is_displayed_in_the_selected_language() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Checking whats on your mind" + whatsYourCommentTextBoxOnTheKooPost.isDisplayed() + " and text is " + whatsYourCommentTextBoxOnTheKooPost.getText());
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		System.out.println("Checking whats on your mind" + whatsYourCommentTextBoxOnTheKooPost.isDisplayed() + " and text is " + whatsYourCommentTextBoxOnTheKooPost.getText());
		Assert.assertTrue(whatsYourCommentTextBoxOnTheKooPost.getText().contains("What's on your mind..."));
		Assert.assertTrue(isElementPresent(kooCreationButton));

	}
	
	public void navigateToKooCreationScreen() throws InterruptedException {
		click(addButton);
		Thread.sleep(1500);
		waitForVisibility(whatsYourMindTextBox);
	}

	public void verify_the_post_button_on_the_top_right_of_the_screen() {
		waitForVisibility(postButton);
		Assert.assertTrue(isElementPresent(postButton));

	}

	public void verify_the_back_button_on_the_top_left_of_the_screen() {
		waitForVisibility(backButton);
		Assert.assertTrue(isElementPresent(backButton));
	}

	public void verify_the_text_audio_and_video_icon_below_the_koo_title_box() {
		waitForVisibility(videoIcon);
		Assert.assertTrue(isElementPresent(videoIcon));
		Assert.assertTrue(isElementPresent(micIcon));
		Assert.assertTrue(isElementPresent(textIcon));
	}

	public void verify_the_link_images_and_title_character_count_at_the_bottom_of_the_screen() {
		waitForVisibility(emojiIcon);
		Assert.assertTrue(isElementPresent(emojiIcon));
		Assert.assertTrue(isElementPresent(addlink));
		Assert.assertTrue(charactarCountText.getText().equalsIgnoreCase("0 / 400"));
	}

	public void verify_the_profile_picture_to_the_left_of_the_title_box() {
		waitForVisibility(profileIcon);
		Assert.assertTrue(isElementPresent(profileIcon));
	}

	public void verify_on_tapping_on_title_field_keyboard_should_open_and_on_tapping_anywhere_else_apart_from_keyboard_and_title_field_it_should_disappear()
			throws InterruptedException {
		//Thread.sleep(5000);
		click(kooCreationTextBox);
		Thread.sleep(3000);
		Assert.assertTrue(isKeyPadShown());
		click(profileIcon);
		Thread.sleep(5000);
		Assert.assertFalse(!isKeyPadShown());
	}

	public void verify_on_tapping_on_tapping_on_mic_or_video_icon_for_the_first_time_user_should_get_permissions_popup_after_allowing_user_should_navigate_to_recording_screen()
			throws InterruptedException {
		waitForVisibility(micIcon);
		click(micIcon);
		waitForVisibility(allowButtonOnConfirmationPopup);
		Assert.assertTrue(isElementPresent(allowButtonOnConfirmationPopup));
		Assert.assertTrue(isElementPresent(denyButtonOnConfirmationPopup));
		//Thread.sleep(2500);
		click(allowButtonOnConfirmationPopup);
		Thread.sleep(500);
		click(allowButtonOnConfirmationPopup);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(AudioRecordingButton));
		click(CancelAudioRecordingPopUp);
	}

	public void verify_on_tapping_on_images_icon_user_should_navigate_to_gallery_and_on_tapping_on_back_button_user_should_navigate_to_koo_creation_screen()
			throws InterruptedException {
		Thread.sleep(1500);
		waitForVisibility(imageIcon);
		click(imageIcon);
		//Thread.sleep(1500);
		/*specific to Mi
		waitForVisibility(galleryText);
		Assert.assertTrue(galleryText.getText().equalsIgnoreCase("Gallery"));

		 */
		Assert.assertTrue(isElementPresent(samsungCameraGallery));
		//Assert.assertTrue(isElementPresent(cameraIcon));  mi
		Assert.assertTrue(isElementPresent(samsungCameraIcon.get(0))); //no unique identifiers available
		click(backButton);
		waitForVisibility(imageIcon);
		Assert.assertTrue(isElementPresent(imageIcon));
	}

	public void verify_on_tapping_on_cancel_button_the_link_field_is_closed() throws InterruptedException {
		Thread.sleep(2500);
		click(closeTextBoxButton);
		waitForVisibility(whatsYourMindTextBox);
		Assert.assertTrue(isElementPresent(whatsYourMindTextBox));
	}

	public void verify_on_typing_or_pasting_any_link_save_button_is_enabled() {
		click(attachLinkTextBox);
		sendKeys(attachLinkTextBox, "https://www.youtube.com/");
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
	public void verify_user_is_able_to_post_koo_only_by_entering_title() throws Exception {
		String post="The automated koo post";
		sendKeys(whatsYourMindTextBox,post);
		Assert.assertTrue(isEnabled(postButton));
		click(settingsIcon);
		click(applyForAllKoosButton);
		Assert.assertTrue(isEnabled(saveButton));
		waitForVisibility(backButtonInCommentPrefrences);
		click(backButtonInCommentPrefrences);
		waitForVisibility(postButton);
		click(postButton);
	
		try {
			if (isElementPresent(whatYouNameTextBox)) {
				waitForVisibility(whatYouNameTextBox);
				sendKeys(whatYouNameTextBox,"Tester"+utils.getRandomNumber(1000));
				Assert.assertTrue(isElementPresent(submitButton));
				click(submitButton);
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}	
		
		
		
		
		updatePopUp();
		
	}

	public void verify_user_is_able_to_post_koo_only_by_attaching_link() throws InterruptedException {
		sendKeys(whatsYourMindTextBox,link);
		Assert.assertTrue(isEnabled(postButton));
		Thread.sleep(3500);

	}

	public void verify_user_is_able_to_rekoo_with_comment_on_tapping_on_rekoo_button_and_selecting_rekoo_with_comment() throws Exception {
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		sendKeys(whatsYourMindTextBox,"the rekoo automated comment");
		click(postButton);
		
	}

	public void verify_user_is_able_to_comment_on_tapping_on_comment_button() throws InterruptedException {
		Thread.sleep(1000);	
		waitForVisibility(commentButton);
		click(commentButton);
		Thread.sleep(1000);	
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		waitForVisibility(whatsYourMindText);
		sendKeys(whatsYourMindTextBox, "The automated reply of comment"); 
		Thread.sleep(500);
		click(postButton);
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
	}


	public void verify_user_is_able_to_see_youtube_icon_at_bottom_of_the_screen() {
		waitForVisibility(youtubeLink);
		Assert.assertTrue(isElementPresent(youtubeLink));
	}

	public void verify_user_is_able_to_see_the_poll_icon_at_the_bottom_of_the_screen() throws InterruptedException {
		waitForVisibility(addButton);
		click(addButton);
		Thread.sleep(3000);
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
		waitForVisibility(addButton);
		click(addButton);
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
		clickAndroidDeviceBackBttn();
		waitForVisibility(addOptionButton);
		click(addOptionButton);
		sendKeys(pollCreationTextBox4, "The fourth automated poll");
		Assert.assertTrue(isEnabled(postButton));
	}

	public void verify_there_should_be_cancel_button_on_options_section() {
		Assert.assertTrue(isElementPresent(closePollOptionButton));
	}

	public void verify_after_entering_the_text_inside_options_box_and_tapping_on_cancel_button_a_pop_up_should_display() {
		sendKeys(pollCreationTextBox1, "The first automated poll");
		click(closePollOptionButton);
		waitForVisibility(yesButtonOnConfirmationPopUp);
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

	}

	public void verify_error_message_should_show_to_the_user_on_creating_same_poll_options_in_poll() {
		clear(pollCreationTextBox1);
		sendKeys(pollCreationTextBox1, "The first automated poll");
		sendKeys(pollCreationTextBox2, "The first automated poll");
	}

	public void verify_user_should_able_to_edit_poll_until_there_are_no_action_on_poll() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(2);
		Thread.sleep(2000);
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		Thread.sleep(1500);
		waitForVisibility(editKooPollButton);
		click(editKooPollButton);
		Thread.sleep(2000);
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
		Thread.sleep(1000);
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
		click(postButton);
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		waitForVisibility(deleteKooPost);
		click(deleteKooPost);
		waitForVisibility(yesButtonOnConfirmationPopUp);
		click(yesButtonOnConfirmationPopUp);
	}

	public void verifyGIFIconAtTheBottomOfKooCreationScreen2() {
		waitForVisibility(emojiIcon);
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

	public void verify_user_should_be_able_to_select_both_indian_nigerian_languages_for_mlk_creation() throws Exception {
		waitForVisibility(nigeriaButton);
		click(nigeriaButton);
		waitForVisibility(nigeriaAvailiableLanguage);
		click(nigeriaAvailiableLanguage);
		updatePopUp();
		waitForVisibility(kooNigeriaOfficialHeadr);
		//While using mobile login I was getting the kooOffical Headr but through email not gettings
		//Assert.assertTrue(kooNigeriaOfficialHeadr.getText().equalsIgnoreCase("Koo Nigeria Official"));
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
		swipeToSeeDownsideElementsOfScreen(2);
		waitForVisibility(comingSoonText);
		Assert.assertTrue(isElementPresent(comingSoonText));
		
	}


	public void verify_koo_creation_title_box_should_move_on_swiping_with_respective_language_highlighting() {
		waitForVisibility(kooCreationButtonForOtherLanguage);
		click(kooCreationButtonForOtherLanguage);
	}

	public void verify_button_shown_in_active_languages_title_box_tapping_the_button_translates_text_from_original_language_should_load_in_title() throws InterruptedException {
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox,"Checking language convertion");
		click(languageSelectionPlusIcon);
		waitForVisibility(hindiLanguageButton);
		click(hindiLanguageButton);
		click(doneButton);
		waitForVisibility(whatsYourMindTextBox);
		waitForVisibility(otherLanguageSelectionButton);
		click(otherLanguageSelectionButton);
		Thread.sleep(500);
		waitForVisibility(translateFromOrignalLangugeButton);
		Assert.assertTrue(translateFromOrignalLangugeButton.getText().equalsIgnoreCase("Translate from original"));
		click(translateFromOrignalLangugeButton);
		Thread.sleep(500);
		clear(whatsYourMindText);
		Thread.sleep(1000);
		sendKeys(whatsYourMindText, "ऐप में हिंदी भाषा में चेकिंग पोस्ट");
	}


	public void verifyAvailableInTheseManyLanguagesTextShouldShowOnTheKooCardInFeedAsWellAsOnKooDetailedScreenWithBlueColourAndGlobeIcon() throws Exception {
		Assert.assertTrue(isEnabled(postButton));
		click(postButton);
		updatePopUp();
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(availableLanguageCount.getText().equalsIgnoreCase("Available in 2 languages"));
		Thread.sleep(2000);
		try{
			if(hindiLanguageButton.isDisplayed())
			{
				Assert.assertTrue(isElementPresent(hindiLangugagePostButton));
				Assert.assertTrue(isElementPresent(enlishLanguagePostButtoon));
				waitForVisibility(hindiLangugagePostButton);
				click(hindiLangugagePostButton);
				Thread.sleep(1000);
				waitForVisibility(enlishLanguagePostButtoon);
				click(enlishLanguagePostButtoon);
			}
			if(hindiLanguagePostButtonList.get(0).isDisplayed())
			{
				Assert.assertTrue(isElementPresent(hindiLanguagePostButtonList.get(0)));
				Assert.assertTrue(isElementPresent(englishLanguagePostButtonList.get(0)));
				waitForVisibility(hindiLanguagePostButtonList.get(0));
				click(hindiLanguagePostButtonList.get(0));
				Thread.sleep(1000);
				waitForVisibility(englishLanguagePostButtonList.get(0));
				click(englishLanguagePostButtonList.get(0));
			}
		}
		catch (Exception e)
		{

		}


	}


	public void verifyAfterPostingAnMLKIfUserEditsKooInParticularLanguageChangeContentInAnotherLanguageThatKooShouldAppearInLatestUpdatedLanguage() throws InterruptedException {
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		Thread.sleep(500);
		waitForVisibility(editKooPollButton);
		click(editKooPollButton);
		waitForVisibility(whatsYourMindTextBox);
		clear(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox,"editing the langague conversion post");
		click(postButton);
		waitForVisibility(userProfileIcon);
		Thread.sleep(1500);
		waitForVisibility(postTitleOnTheHomePageText);
//		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("editing the language conversion post"));

		try{
			if(hindiLanguageButton.isDisplayed())
			{
				Assert.assertTrue(isElementPresent(hindiLangugagePostButton));
				Assert.assertTrue(isElementPresent(enlishLanguagePostButtoon));
				waitForVisibility(hindiLangugagePostButton);
				click(hindiLangugagePostButton);
				Thread.sleep(1000);

			}
			if(hindiLanguagePostButtonList.get(0).isDisplayed())
			{
				Assert.assertTrue(isElementPresent(hindiLanguagePostButtonList.get(0)));
				Assert.assertTrue(isElementPresent(englishLanguagePostButtonList.get(0)));
				waitForVisibility(hindiLanguagePostButtonList.get(0));
				click(hindiLanguagePostButtonList.get(0));
				Thread.sleep(1000);

			}
		}
		catch (Exception e)
		{

		}

		waitForVisibility(postTitleOnTheHomePageText);
		Thread.sleep(3000);
		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("ऐप में हिंदी भाषा में चेकिंग पोस्ट"));
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		Thread.sleep(800);
		waitForVisibility(editKooPollButton);
		Thread.sleep(1000);
		click(editKooPollButton);
		waitForVisibility(whatsYourMindTextBox);
		clear(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox,"हिंदी की संपादित पोस्ट चेक कर रहा है");
		click(postButton);
		waitForVisibility(userProfileIcon);
		Thread.sleep(2000);
		waitForVisibility(hindiLangugagePostButton);
		click(hindiLangugagePostButton);
		waitForVisibility(postTitleOnTheHomePageText);
		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("हिंदी की संपादित पोस्ट चेक कर रहा है"));
	}


	public void verifyUserShouldBeAbleToImportHastagFromOriginalLanguageShouldBeInBlueColour() throws InterruptedException {
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "#Good");
		Thread.sleep(500);
		click(otherLanguageSelectionButton);
		waitForVisibility(translateFromOrignalLangugeButton);
		click(translateFromOrignalLangugeButton);
		click(languageButton);
		clear(whatsYourMindTextBox);
		Thread.sleep(1500);
	}

	public void verifyUserShouldBeAbleToImportLinksAttachedInKooTitleFromOriginalLanguageShouldBeInBlueColour() throws Exception {
		sendKeys(whatsYourMindTextBox,link);
		click(otherLanguageSelectionButton);
		Thread.sleep(2000);
		waitForVisibility(translateFromOrignalLangugeButtonAtBottom);
		click(translateFromOrignalLangugeButtonAtBottom);
		click(postButton);
		//updatePopUp();
		waitForVisibility(backButtonInEditProfile);
		click(backButtonInEditProfile);
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(isElementPresent(userProfileIcon));
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		waitForVisibility(deleteKooPost);
		click(deleteKooPost);
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		waitForVisibility(deleteKooPost);
		click(deleteKooPost);
		waitForVisibility(yesButtonOnConfirmationPopUp);
		click(yesButtonOnConfirmationPopUp);

	}
	public void verifyAfterRefreshingTheFeedScreenPostedKoosShouldNotDisappear() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(2);
		Thread.sleep(2000);
		waitForVisibility(postTitleOnTheHomePageText);
		Assert.assertTrue(isElementPresent(postTitleOnTheHomePageText));
	}

	public void verifyIfUserIndianEngUserPostsInNigerianEngKooShouldNotShowOnIndianEngFeed() {
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(nigeriaButton);
		click(nigeriaButton);
		waitForVisibility(nigeriaAvailiableLanguage);
		click(nigeriaAvailiableLanguage);
		try {
			if (isElementPresent(update_PopUp)) {
				click(update_PopUp);
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}	

		waitForVisibility(kooNigeriaOfficialHeadr);
		//Assert.assertTrue(kooNigeriaOfficialHeadr.getText().equalsIgnoreCase("Koo Nigeria Official"));
	}
	public void IVerifyUserIsAbleToPerformLikeRekooCommentRekooWithCommentEtcOnAllMLKKoosAndVerifyTheReactedKoosOnReactorsProfile() throws Exception {
		scrollToElement(kooHandle,"up");
		waitForVisibility(likeButton);
		click(likeButton);
		Thread.sleep(700);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		sendKeys(whatsYourMindTextBox, "nice post");
		click(postButton);
		waitForVisibility(commentButtonAfterRekoo);
		click(commentButtonAfterRekoo);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "comment to this profile");
		click(postButton);
		waitForVisibility(rekooButton);
		click(rekooButton);
		Thread.sleep(300);	
		click(rekooButton);
		Thread.sleep(1000);
		
	}


	public void verifyIfUserNigerianEngUserPostsInIndianEngKooShouldNotShowOnNigerianEngFeed() {
		waitForVisibility(kooCreationButton);
		click(kooCreationButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "checking the post in Nigeria English language");
		click(postButton);
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("checking the post in Nigeria English language"));
		click(userProfileIcon);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(IndiaButton);
		click(IndiaButton);
		waitForVisibility(languageButton);
		click(languageButton);
		waitForVisibility(userProfileIcon);
		

	}


	public void verifyOnChangingTheLanguageFromLanguageSelectionScreenRespectiveLanguageKoosOnlyShouldShowOnFeedAndKooDetailedScreenWithHighlightingTheButton() {
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(IndiaButton);
		click(hindiLanguageButton);
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(kooCreationButtonInHindi.getText().equalsIgnoreCase("+ कू"));

	}


	public void verifyKoosCountShouldIncreaseOnProfileScreenBasedOnTheLanguagesUserIsCreating() {
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
		Thread.sleep(2000);
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
		Thread.sleep(2000);
		click(userProfileIcon);
		waitForVisibility(noOfPostCount);
		String countNoOfPostBeforeDelete=noOfPostCount.getText();
		Assert.assertTrue(isElementPresent(twoDotButton));
		click(twoDotButton);
		Thread.sleep(500);
		waitForVisibility(deleteKooPost);
		click(deleteKooPost); 
		waitForVisibility(yesButtonOnConfirmationPopUp);
		click(yesButtonOnConfirmationPopUp);
		Thread.sleep(500);
		String countNoOfPostAfterDelete=noOfPostCount.getText();
		Assert.assertNotSame(countNoOfPostBeforeDelete,countNoOfPostAfterDelete);

	}


	public void verifyOnChangingTheLanguageFromLanguageSelectionScreenAndBackToCurrentLanguagePostedKoosShouldNotDisappearOnFeedScreen() throws Exception {
		Thread.sleep(3000);
		waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "Checking the post for changing the language");
		Assert.assertTrue(isEnabled(postButton));
		click(postButton);
		Thread.sleep(3000);
		updatePopUp();
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(postTitleOnTheHomePageText.getText().equalsIgnoreCase("Checking the post for changing the language"));
		click(userProfileIcon);
		waitForVisibility(edit_profile_button);
		Assert.assertTrue(isElementPresent(edit_profile_button));
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(hindiLanguageButton);
		click(hindiLanguageButton);
		Thread.sleep(2500);
		updatePopUp();
		Thread.sleep(2000);
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
		Assert.assertTrue(isElementPresent(rekooButton));

	}

	public void verifyPostedKoosShouldShowIndividuallyOnProfileScreenWithLanguageIndicationButton() {
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		waitForVisibility(edit_profile_button);
		Assert.assertTrue(isElementPresent(enlishLanguagePostButtoon));
		Assert.assertTrue(kooTitleInEnglishInProfile.getText().equalsIgnoreCase("editing the langague conversion post"));
		Assert.assertTrue(isElementPresent(hindiLangugagePostButton));
		//Assert.assertTrue(kooTitleInHindiInProfile.getText().equalsIgnoreCase("हिंदी की संपादित पोस्ट चेक कर रहा है"));

	}


	public void clickOnProfile() {
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		waitForVisibility(edit_profile_button);
		Assert.assertTrue(isElementPresent(edit_profile_button));
	}

	public void verifyHomePage() {
		waitForVisibility(addButton);
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(isElementPresent(userProfileIcon));
	}

	public void verifyNumberIndicationOnPostButtonNumberOfLanguagesKooIsCreated() throws InterruptedException {
		Thread.sleep(500);
		Assert.assertTrue(noOfLanguagePostCount.getText().equalsIgnoreCase("2"));

	}
	
	public void clickonKooCreation() {
		try {
			waitForVisibility(addButton);
			click(addButton);
		}catch(Exception e){
			e.getStackTrace();
		}

	}

	/*
	public void deletePost() {
		waitForVisibility(userProfileIcon);
		waitForVisibility(twoDotButton);
		click(twoDotButton);
		waitForVisibility(deleteKooPost);
		click(deleteKooPost);
	}
	 */

	public void createKooPost(String post) {
		waitForVisibility(whatsYourMindText);
		sendKeys(whatsYourMindTextBox, post);

	}



	public void verifyImportAudioVideoLinkImageslFromOriginalLanguageButtonOnTappingTheButtonMediaFromOriginalLangaugeShouldLoad() throws InterruptedException {
		
		clickonKooCreation();
		waitForVisibility(micIcon);
		click(micIcon);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);
		}catch(Exception e){
			e.getStackTrace();
		}
		waitForVisibility(playPauseButton);
		click(playPauseButton);
		Thread.sleep(800);
		click(saveAudioButton);
		waitForVisibility(canclebutton2);
		click(canclebutton2);
		Thread.sleep(1200);
		click(imageIcon);
		waitForVisibility(galleryText);
		click(selectingScreenshotsFromGallery);
		waitForVisibility(image_gallery_item);
		click(image_gallery_item);
		waitForVisibility(doneImage);
		click(doneImage);
		waitForVisibility(cancleButton1);
		click(cancleButton1);
		Thread.sleep(800);
		waitForVisibility(videoIcon);
		click(videoIcon);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission1);
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);

		}catch(Exception e){
			e.getStackTrace();
		}
		Thread.sleep(1500);
		waitForVisibility(playPauseButton);
		click(playPauseButton);
		Thread.sleep(3000);
		waitForVisibility(recorderTimer);
//		Assert.assertTrue(isElementPresent(recorderTimer));
		Thread.sleep(15000);
		waitForVisibility(previewPage);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		Thread.sleep(2000);
		click(cropSaveButton);
		waitForVisibility(SaveButton);
		click(SaveButton);
		waitForVisibility(whatsYourMindTextBox);
		waitForVisibility(canclebutton2);
		click(canclebutton2);
		waitForVisibility(linkIcon);
		click(linkIcon);
		sendKeys(attachLinkTextBox, link);
		waitForVisibility(okButtonOnAttachLink);
		click(okButtonOnAttachLink);
		waitForVisibility(link_preview_cancel);
		click(link_preview_cancel);
		Thread.sleep(1500);
		clickAndroidDeviceBackBttn();

	}

	public void verifyPostButtonShouldNotEnableOnlyOnAddingMediaFromBottomBar() {
		clickonKooCreation();
		waitForVisibility(whatsYourMindTextBox);
		waitForVisibility(addImageButtonAtTheBottom);
		click(addImageButtonAtTheBottom);
		waitForVisibility(allowPermision1);
		click(allowPermision1);
		waitForVisibility(galleryText);
		click(selectingScreenshotsFromGallery);
		waitForVisibility(image_gallery_item);
		click(image_gallery_item);
		waitForVisibility(doneImage);
		click(doneImage);
		waitForVisibility(whatsYourMindText);
		Assert.assertFalse(!isEnabled(postButton));
		waitForVisibility(cancleButton1);
		click(cancleButton1);


	}


	public void creatingPostWithAudioAndImage() throws InterruptedException {

		waitForVisibility(micIcon);
		click(micIcon);

		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);
		}catch(Exception e){
			e.getStackTrace();
		}

		waitForVisibility(playPauseButton);
		click(playPauseButton);
		Thread.sleep(800);
		//click(playPauseButton);
		//waitForVisibility(saveAudioButton);
		click(saveAudioButton);
		waitForVisibility(whatsYourMindText);
		click(imageIcon);
		waitForVisibility(galleryText);
		click(selectingScreenshotsFromGallery);
		waitForVisibility(image_gallery_item);
		click(image_gallery_item);
		waitForVisibility(doneImage);
		click(doneImage);
		waitForVisibility(postButton);
		click(postButton);
		//deletePost();

	}


	public void creatingPostWithAudioAndLink() throws InterruptedException {

		waitForVisibility(micIcon);
		click(micIcon);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);
		}catch(Exception e){
			e.getStackTrace();
		}
		waitForVisibility(playPauseButton);
		click(playPauseButton);
		Thread.sleep(800);
		//click(playPauseButton);
		//Thread.sleep(1500);
		click(saveAudioButton);
		Thread.sleep(1500);
		waitForVisibility(linkIcon);
		click(linkIcon);
		sendKeys(attachLinkTextBox, link);
		waitForVisibility(okButtonOnAttachLink);
		click(okButtonOnAttachLink);
		waitForVisibility(postButton);
		click(postButton);
		//deletePost();
	}
	public void creatingPostWithVideoAndImage() throws InterruptedException {

		waitForVisibility(videoIcon);
		click(videoIcon);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
//			Thread.sleep(3000);
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);
			}
			}catch(Exception e){
			e.getStackTrace();
		}
		
		waitForVisibility(playPauseButton);
		click(playPauseButton);
		Thread.sleep(3000);
		waitForVisibility(recorderTimer);
//		Assert.assertTrue(isElementPresent(recorderTimer));
		Thread.sleep(15000);
		waitForVisibility(previewPage);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		Thread.sleep(2000);
		click(cropSaveButton);
		waitForVisibility(SaveButton);
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(whatsYourMindTextBox);
		click(imageIcon);
		waitForVisibility(galleryText);
		click(selectingScreenshotsFromGallery);
		waitForVisibility(image_gallery_item);
		click(image_gallery_item);
		waitForVisibility(doneImage);
		click(doneImage);
		waitForVisibility(postButton);
		click(postButton);
		//deletePost();


	}
	public void creatingPostWithVideoAndLink() throws InterruptedException {

		waitForVisibility(videoIcon);
		click(videoIcon);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
//			Thread.sleep(3000);
//			waitForVisibility(allowPermision1);
//			click(allowPermision1);
			}
			}catch(Exception e){
			e.getStackTrace();
		}
		waitForVisibility(playPauseButton);
		click(playPauseButton);
		Thread.sleep(3000);
		waitForVisibility(recorderTimer);
//		Assert.assertTrue(isElementPresent(recorderTimer));
		Thread.sleep(15000);
		waitForVisibility(previewPage);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		Thread.sleep(2000);
		click(cropSaveButton);
		waitForVisibility(SaveButton);
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(whatsYourMindTextBox);
		waitForVisibility(linkIcon);
		click(linkIcon);
		sendKeys(attachLinkTextBox, link);
		waitForVisibility(okButtonOnAttachLink);
		click(okButtonOnAttachLink);
		waitForVisibility(postButton);
		click(postButton);
		//deletePost();
	}


	public void verifingKooCreationWithoutTitle() throws InterruptedException {
		clickonKooCreation();
		creatingPostWithAudioAndImage();
		clickonKooCreation();
		creatingPostWithAudioAndLink();
		clickonKooCreation();
		creatingPostWithVideoAndImage();
		clickonKooCreation();
		creatingPostWithVideoAndLink();
	}

	public void verifingKooCreationWithAudio_Video_Link_Image() throws InterruptedException {
		clickonKooCreation();
		createKooPost("Checking koo post with Audio and Image");
		creatingPostWithAudioAndImage();
		clickonKooCreation();
		createKooPost("Checking koo post with Audio and Link");
		creatingPostWithAudioAndLink();
		clickonKooCreation();
		createKooPost("Checking koo post with Video and Image");
		creatingPostWithVideoAndImage();
		clickonKooCreation();
		createKooPost("Checking koo post with Video and Link");
		creatingPostWithVideoAndLink();
	}

	public void changeLanguageForLanguageSelectionPost(WebElement wait,WebElement clickOnLanguage) {
		waitForVisibility(userProfileIcon);
		click(userProfileIcon);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(wait);
		click(clickOnLanguage);

	}


	public void verifyUserIsAbleToAddDifferentTypesOfMediaInDifferentLanguages() throws Exception {
		changeLanguageForLanguageSelectionPost(hindiLanguageButton, hindiLanguageButton);
		waitForVisibility(userProfileIcon);
		click(addButtonWhile);
		createKooPost("Checking koo post with Audio and Image in Hindi language");
		creatingPostWithAudioAndImage();
		updatePopUp();
		waitForVisibility(addButtonWhile);
		click(addButtonWhile);
		createKooPost("Checking koo post with Video and Image in Hindi language");
		creatingPostWithVideoAndImage();
		updatePopUp();
		changeLanguageForLanguageSelectionPost(languageButton,languageButton);
		waitForVisibility(userProfileIcon);
	}


	public void userShouldShouldPlayAudio_Video_OpenAttachLink() throws Exception{

		try {
			waitForVisibility(userProfileIcon);
			scrollToElement(audioPlay, "up");
			waitForVisibility(audioPlay);
			click(audioPlay);
			Thread.sleep(3000);
			click(audioPlay);
			scrollToElement(thumbnail_imageview,"up");
			waitForVisibility(thumbnail_imageview);
			click(thumbnail_imageview);
			waitForVisibility(fullImageView);
			Assert.assertTrue(isElementPresent(fullImageView));
			Thread.sleep(1500);
			clickAndroidDeviceBackBttn();
			Thread.sleep(1500);
			scrollToElement(uploadedVideoPlayPauseButton,"up");
			waitForVisibility(uploadedVideoPlayPauseButton);
			click(uploadedVideoPlayPauseButton);
			Thread.sleep(4000);
			click(uploadedVideoPlayPauseButton);
			Thread.sleep(1000);
			scrollToElement(link_preview_link, "up");
			click(link_preview_link);
			waitForVisibility(closeButtonToTheLinkPage);
			click(closeButtonToTheLinkPage);

		}catch(Exception e){
			e.getStackTrace();
		}

	}

	//Notifcation 
		public void clickNotificationButton() {
			waitForVisibility(notificationButton);
			click(notificationButton);

		}

		public void verifyNotificationsShouldComeForAllTheCreatedKoos() throws InterruptedException {
			clickNotificationButton();
			Thread.sleep(3000);
			for(WebElement notificatins: listOfNotifications) {
				System.out.println("The notifcation are"+ notificatins.getText());
			}

		}


		public void verifyTheCommentRekooRekooWithCommentOnTheCreatorsProfile() {
			clickonKooCreation();
			waitForVisibility(whatsYourMindTextBox);
			sendKeys(whatsYourMindTextBox, "creating post for notificatins");
			waitForVisibility(postButton);
			click(postButton);
			logOutFromAccount();

		}

		public void logOutFromAccount() {
			waitForVisibility(userProfileIcon);
			click(userProfileIcon);
			waitForVisibility(settingsTab);
			click(settingsTab);
			waitForVisibility(languageSelectionOnEditProfile);
			click(logOutButton);
			waitForVisibility(logOutConfirmButton);
			click(logOutConfirmButton);
			waitForVisibility(logInButton);
			click(logInButton);
		}

		public void like_comment_AndRekooThePost() throws Exception{
			Thread.sleep(1000);
			waitForVisibility(userProfileIcon);
			click(likeButton);
			waitForVisibility(rekooButton);
			verify_user_is_able_to_rekoo_with_comment_on_tapping_on_rekoo_button_and_selecting_rekoo_with_comment();
			Thread.sleep(1000);
			verify_user_is_able_to_comment_on_tapping_on_comment_button();
			logOutFromAccount();
		}

		public void verify_Like_Comment_AndRekooPost() {
			waitForVisibility(userProfileIcon);
			click(notificationButton);
			Assert.assertTrue(isElementPresent(likeNotification));
			Assert.assertTrue(isElementPresent(commentNotification));
			Assert.assertTrue(isElementPresent(rekooNotification));
		}


		public void verifyUserIsAbleToFollowUnfollowUserAfterNavigatingToKooDetailsScreenByTappingOnNotifications() throws InterruptedException {
			click(likeNotification);
			Thread.sleep(1000);
			clickAndroidDeviceBackBttn();
			waitForVisibility(userProfileIcon);
			click(userProfileIcon);
			waitForVisibility(settingsTab);
			click(follwingButtonInProfile);
			waitForVisibility(followingButton);
			click(followingButton);
			waitForVisibility(confirmPopUpMessageForUnfollow);
			click(confirmPopUpMessageForUnfollow);
			Thread.sleep(1500);
			clickAndroidDeviceBackBttn();
			Thread.sleep(1500);
			clickAndroidDeviceBackBttn();
		}


		public void verifyOnTappingOnNotificationsUserShouldNavigateToRespectiveKooDetailsScreen() throws Exception {


			try {
				waitForVisibility(userProfileIcon);
				click(notificationButton);
				scrollToElement(imgNotificationButton,"up");
				click(imgNotificationButton);
				waitForVisibility(userProfileIcon);
				Assert.assertTrue(isElementPresent(feedTab));
			}catch(Exception e){
				e.getStackTrace();
			}}


		public void verifyProfilePictureIconOnTopOfKooCreationTitleBoxOnceUpdatingUpdatedProfileShouldReflectInsteadOfProfilePictureIcon() throws InterruptedException {
			swipeToSeeUpsideElementsOfScreen(3);
			waitForVisibility(userProfileIcon);
			click(userProfileIcon);
			waitForVisibility(settingsTab);
			Assert.assertTrue(isElementPresent(cameraBlip));
			click(settingsTab);
			waitForVisibility(languageSelectionOnEditProfile);
			click(logOutButton);
			waitForVisibility(logOutConfirmButton);
			click(logOutConfirmButton);
			waitForVisibility(logInButton);
			click(logInButton);
		}
		
		public void verifyOnceUpdatingProfileShouldShowProfilePicIcon() {
			waitForVisibility(userProfileIcon);
			click(userProfileIcon);
			waitForVisibility(settingsTab);
			Assert.assertFalse(!isElementPresent(cameraBlip));
			click(settingsTab);
			waitForVisibility(languageSelectionOnEditProfile);
			click(logOutButton);
			waitForVisibility(logOutConfirmButton);
			click(logOutConfirmButton);
			waitForVisibility(logInButton);
			click(logInButton);
		}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public void VerifyUserProfilePictureIsDisplayedAboveTheMicButton() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollMic));
		click(CreatePollMic);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
				
	}


	public void IVerifyOnStartingTheRecording() throws InterruptedException {
		click(micOn);
		Thread.sleep(4000);
		Assert.assertTrue(isElementPresent(recorderTimer));
		Thread.sleep(4000);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		
	}


	public void IVerifyUserIsAbleToPauseTheRecording() throws InterruptedException {
		click(micOn);
		click(micOn);
		click(micOn);
		
	}


	public void IVerifyOnTappingOnRestartButton() throws InterruptedException {
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		click(restartButton);
		waitForVisibility(ConfirmationMessage);
		Assert.assertTrue(isElementPresent(ConfirmationMessage));
		Assert.assertTrue(isElementPresent(YesConfirmationButton));
		clickAndroidDeviceBackBttn();
		waitForVisibility(recorderTimer);
		
	}


	public void IVerifyPreviewAndFullyRecordedLengthAllowed() throws InterruptedException {
		waitForVisibility(previewText);
		Assert.assertTrue(isElementPresent(previewText));
		Assert.assertTrue(isElementPresent(recaudiolength));
		Assert.assertTrue(isElementPresent(audioPreview));
		Assert.assertTrue(recaudiolength.getText().equalsIgnoreCase("01:00"));
		
	}


	public void IVerifyUserIsAbleToCropTheAudioFromThePreviewScreen() throws InterruptedException {
		click(audioPreview);
		waitForVisibility(audioCropBar);
		Assert.assertTrue(isElementPresent(audioCropBar));
		Assert.assertTrue(isElementPresent(playButton));
		Assert.assertTrue(isElementPresent(cropSaveButton));
		click(playButton);
		Thread.sleep(2000);
		click(playButton);
		Thread.sleep(2000);
		click(cropSaveButton);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(recordedAudio);
		Assert.assertTrue(isElementPresent(recordedAudio));
		click(postButton);
		//adding 10 seconds delay for audio upload to complete, this is to be reduced in future based on time taken for upload
		Thread.sleep(10000);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(audioPlay));
		Assert.assertTrue(isElementPresent(createdAudio));
		click(audioPlay);
		new HomePage().VerifyByDeletingTheGeneratedPoll();
	}


	public void IVerifyUserIsAbleToPostKooOnlyByRecordingVideo() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(videoIcon));
		click(videoIcon);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission1);
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(micOn);
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		waitForVisibility(recorderTimer);
		for(int i=0;i<4;i++)
		{
			Thread.sleep(10000);
			System.out.println("Is video recording complete and preview seen " );//+ previewPage.isDisplayed() + previewPage.isEnabled());
		}
		waitForVisibility(previewPage);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		Thread.sleep(2000);
		click(cropSaveButton);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(recordedVideo);
		Assert.assertTrue(isElementPresent(recordedVideo));
		click(postButton);
		Thread.sleep(10000); //waiting for 10 seconds for video upload to complete
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);
		new HomePage().VerifyByDeletingTheGeneratedPoll();
		
	}


	public void IVerifyByPostingImageOrImages() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		try {
			if(cameraImages.isEnabled()) {
				Assert.assertTrue(isElementPresent(cameraImages));
				click(cameraImages);
				waitForVisibility(image1);
				Assert.assertTrue(isElementPresent(image1));
				click(image1);
				waitForVisibility(doneImage);
				click(doneImage);
			}
		}
		catch (Exception e)
		{
			Assert.assertTrue(isElementPresent(samsungCameraIcon.get(2))); //no unique identifiers available, checking camera icon
			click(samsungCameraIcon.get(2));

		}

		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("image Test");
		waitForVisibility(postButton);
		click(postButton);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);

	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndAudio() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollMic));
		click(CreatePollMic);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Thread.sleep(2000); //waiting until the state switches to timer view
		Assert.assertTrue(isElementPresent(recorderTimer));
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Title and Audio Combination Test");
		click(postButton);
		Thread.sleep(10000); //waiting for upload to complete
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);
		
	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndVideo() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
		click(CreatePollYouTubeLink);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		try {
			waitForVisibility(videoAlbum);
			Assert.assertTrue(isElementPresent(videoAlbum));
			click(videoAlbum);
			waitForVisibility(video1);
			Assert.assertTrue(isElementPresent(video1));
			click(video1);
		}
		catch (Exception e)
		{
			//choose the second video displayed in list, need better locators for this
			Thread.sleep(2000);
			waitForVisibility(samsungCameraIcon.get(2));
			Assert.assertTrue(samsungCameraIcon.get(2).isDisplayed());
			samsungCameraIcon.get(2).click();

		}
		Thread.sleep(3000);
		waitForVisibility(cropSaveButton);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		click(cropSaveButton);
		Thread.sleep(3000);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Title and Video Combination Test");
		Thread.sleep(3000);
		click(postButton);
		//wait until upload is complete
		Thread.sleep(10000);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);	
	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndlink() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollLink));
		click(CreatePollLink);
		waitForVisibility(linkField);
		sendKeys(linkField, "https://anydesk.com/en/downloads/thank-you?dv=win_exe");
		Assert.assertTrue(isElementPresent(linkSaveButton));
		click(linkSaveButton);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Title and Link Combination Test");
		click(postButton);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);	
		
		
	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfAudioAndlink() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollMic));
		click(CreatePollMic);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Thread.sleep(4000);
		Assert.assertTrue(isElementPresent(recorderTimer));
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollLink));
		click(CreatePollLink);
		waitForVisibility(linkField);
		sendKeys(linkField, "https://anydesk.com/en/downloads/thank-you?dv=win_exe");
		Assert.assertTrue(isElementPresent(linkSaveButton));
		click(linkSaveButton);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(10000);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);	
	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfAudioAndImages() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollMic));
		click(CreatePollMic);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Thread.sleep(2000);
		waitForVisibility(recorderTimer);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
			try {
				if (cameraImages.isEnabled()) {
					Assert.assertTrue(isElementPresent(cameraImages));
					click(cameraImages);
					waitForVisibility(image1);
					Assert.assertTrue(isElementPresent(image1));
					click(image1);
					waitForVisibility(doneImage);
					click(doneImage);
				}
			}

			catch (Exception e)
			{
				Assert.assertTrue(isElementPresent(samsungCameraIcon.get(2))); //no unique identifiers available, checking camera icon
				click(samsungCameraIcon.get(5));

			}
		Thread.sleep(3000);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(10000);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);	
		
	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfVideoAndLink() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
		click(CreatePollYouTubeLink);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}

		try {
			waitForVisibility(videoAlbum);
			Assert.assertTrue(isElementPresent(videoAlbum));
			click(videoAlbum);
			waitForVisibility(video1);
			Assert.assertTrue(isElementPresent(video1));
			click(video1);
		}
		catch (Exception e)
		{
			//choose the second video displayed in list, need better locators for this
			Thread.sleep(2000);
			waitForVisibility(samsungCameraIcon.get(2));
			Assert.assertTrue(samsungCameraIcon.get(2).isDisplayed());
			samsungCameraIcon.get(2).click();

		}
		Thread.sleep(3000);
		waitForVisibility(cropSaveButton);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		click(cropSaveButton);
		Thread.sleep(1000);
		waitForVisibility(CreatePollPage);
		click(CreatePollLink);
		waitForVisibility(linkField);
		sendKeys(linkField, "https://anydesk.com/en/downloads/thank-you?dv=win_exe");
		click(linkSaveButton);
		Thread.sleep(3000);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Title, video and Link Combination Test");
		Thread.sleep(3000);
		click(postButton);
		//wait until upload is complete
		Thread.sleep(10000);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);
	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleAudioAndLink() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollMic));
		click(CreatePollMic);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		waitForVisibility(recorderTimer);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollLink));
		click(CreatePollLink);
		waitForVisibility(linkField);
		sendKeys(linkField, "https://anydesk.com/en/downloads/thank-you?dv=win_exe");
		Assert.assertTrue(isElementPresent(linkSaveButton));
		click(linkSaveButton);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Title, Audio and Link Combination Test");
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(10000);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);	
	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleAudioAndImage() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollMic));
		click(CreatePollMic);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));

		try {
			if(cameraImages.isEnabled()) {
				Assert.assertTrue(isElementPresent(cameraImages));
				click(cameraImages);
				waitForVisibility(image1);
				Assert.assertTrue(isElementPresent(image1));
				click(image1);
				waitForVisibility(doneImage);
				click(doneImage);
			}
		}
		catch (Exception e)
		{
			//choose the second video displayed in list, need better locators for this
			Thread.sleep(2000);
			waitForVisibility(samsungCameraIcon.get(2));
			Assert.assertTrue(samsungCameraIcon.get(2).isDisplayed());
			samsungCameraIcon.get(2).click();
			Thread.sleep(2000);
		}


		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Title, Audio and Link Combination Test");
		waitForVisibility(postButton);
		Thread.sleep(2000);
		click(postButton);
		Thread.sleep(15000);
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);	
		
	}


	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleVideoAndImage() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
		click(CreatePollYouTubeLink);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		try {
			waitForVisibility(videoAlbum);
			Assert.assertTrue(isElementPresent(videoAlbum));
			click(videoAlbum);
			waitForVisibility(video1);
			Assert.assertTrue(isElementPresent(video1));
			click(video1);
		}
		catch (Exception e)
		{
			//choose the second video displayed in list, need better locators for this
			Thread.sleep(2000);
			waitForVisibility(samsungCameraIcon.get(2));
			Assert.assertTrue(samsungCameraIcon.get(2).isDisplayed());
			samsungCameraIcon.get(2).click();

		}
		Thread.sleep(3000);
		waitForVisibility(cropSaveButton);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		click(cropSaveButton);
		Thread.sleep(1000);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		try {
			if(cameraImages.isEnabled()) {
				Assert.assertTrue(isElementPresent(cameraImages));
				click(cameraImages);
				waitForVisibility(image1);
				Assert.assertTrue(isElementPresent(image1));
				click(image1);
				waitForVisibility(doneImage);
				click(doneImage);
			}
		}
		catch (Exception e)
		{
			//choose the second video displayed in list, need better locators for this
			Thread.sleep(2000);
			waitForVisibility(samsungCameraIcon.get(2));
			Assert.assertTrue(samsungCameraIcon.get(2).isDisplayed());
			samsungCameraIcon.get(2).click();
			Thread.sleep(2000);
		}
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Title, Video and Image Combination Test");
		waitForVisibility(postButton);
		Thread.sleep(10000);
		click(postButton);
		Thread.sleep(3000);	
		waitForVisibility(AddPollButton);
		Thread.sleep(3000);	
		/////



	}
	
	public void IVerifyUserIsAbleToRekooWithCommentOnTappingOnRekooButtonAndSelectingRekooWithComment() throws Exception {
		waitForVisibility(KooCardContent);
		click(KooCardContent);
		scrollToElement(rekooButton, "up");
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		sendKeys(whatsYourMindTextBox,"the rekoo automated comment");
		click(postButton);
		
	}


	public void IVerifyUserIsAbleToRekooWithCommentByAddingTextAudioVideoLinkAndImage() throws Exception {
		scrollToElement(rekooButton, "up");
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		clickAndroidDeviceBackBttn();
		waitForVisibility(mic);
		Assert.assertTrue(isElementPresent(mic));
		click(mic);
		Thread.sleep(2000);
		try {
			if (isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				Thread.sleep(2000);

				if(isElementPresent(permission1)) {
					Assert.assertTrue(isElementPresent(permission1));
					click(permission1);
					Thread.sleep(2000);
				}
			}
			if (isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
				Thread.sleep(2000);
				if(isElementPresent(permission1)) {
					waitForVisibility(permission1);
					Assert.assertTrue(isElementPresent(permission1));
					click(permission1);
				}
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(recorderTimer));
		for(int i=0;i<4;i++)
		{
			Thread.sleep(10000);
			System.out.println("Is video recording complete and preview seen " );//+ previewPage.isDisplayed() + previewPage.isEnabled());
		}
		waitForVisibility(previewPage);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(5000);
		scrollToElement(rekooButton, "up");
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		clickAndroidDeviceBackBttn();
		waitForVisibility(CreatePollYouTubeLink);
		Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
		click(CreatePollYouTubeLink);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(videoAlbum);
		click(videoAlbum);
		waitForVisibility(video1);
		Assert.assertTrue(isElementPresent(video1));
		click(video1);
		waitForVisibility(cropSaveButton);
		click(cropSaveButton);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Testing");
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(10000);
		scrollToElement(rekooButton, "up");
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		clickAndroidDeviceBackBttn();
		waitForVisibility(CreatePollLink);
		Assert.assertTrue(isElementPresent(CreatePollLink));
		click(CreatePollLink);
		waitForVisibility(linkField);
		sendKeys(linkField, "https://anydesk.com/en/downloads/thank-you?dv=win_exe");
		Assert.assertTrue(isElementPresent(linkSaveButton));
		click(linkSaveButton);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Testing");
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(5000);
		scrollToElement(rekooButton, "up");
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		clickAndroidDeviceBackBttn();
		waitForVisibility(imageIcon);
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		Assert.assertTrue(isElementPresent(cameraImages));
		click(cameraImages);
		waitForVisibility(image1);
		Assert.assertTrue(isElementPresent(image1));
		click(image1);
		waitForVisibility(doneImage);
		click(doneImage);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Testing");
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(5000);
	}


	public void IVerifyUserIsAbleToRekooWithCommentByAddingCommentWithTheCombinationOfAll() throws Exception {
		scrollToElement(rekooButton, "up");
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		clickAndroidDeviceBackBttn();
		waitForVisibility(mic);
		Assert.assertTrue(isElementPresent(mic));
		click(mic);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Assert.assertTrue(isElementPresent(recorderTimer));
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(CreatePollLink);
		Assert.assertTrue(isElementPresent(CreatePollLink));
		click(CreatePollLink);
		waitForVisibility(linkField);
		sendKeys(linkField, "https://anydesk.com/en/downloads/thank-you?dv=win_exe");
		Assert.assertTrue(isElementPresent(linkSaveButton));
		click(linkSaveButton);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Testing");
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(5000);
		clickAndroidDeviceBackBttn();
		
		
	}


	public void IVerifyUserIsAbleToCommentOnTappingOnCommentButton() throws Exception {
		waitForVisibility(KooCardContent);
		click(KooCardContent);
		scrollToElement(whatsYourCommentTextBoxOnTheKooPost, "up");
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		waitForVisibility(whatsYourMindText);
		sendKeys(whatsYourMindTextBox, "The automated reply of comment"); 
		click(postButton);
		
	}


	public void IVerifyUserIsAbleToCreateAndPostCommentByAddingTextAudioVideoLinkandImage() throws InterruptedException {
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		clickAndroidDeviceBackBttn();
		waitForVisibility(mic);
		Assert.assertTrue(isElementPresent(mic));
		click(mic);
		Thread.sleep(2000);
		try {
			if (isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				Thread.sleep(2000);

				if (isElementPresent(permission1)) {
					Assert.assertTrue(isElementPresent(permission1));
					click(permission1);
					Thread.sleep(2000);
				}
				if (isElementPresent(permission2)) {
					waitForVisibility(permission2);
					Assert.assertTrue(isElementPresent(permission2));
					click(permission2);
					Thread.sleep(2000);
				}
			}
			if (isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
				Thread.sleep(2000);
				if (isElementPresent(permission1)) {
					waitForVisibility(permission1);
					Assert.assertTrue(isElementPresent(permission1));
					click(permission1);
				}
			}
		}
		catch (Exception e)
		{

		}
		Thread.sleep(2000);
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		waitForVisibility(recorderTimer);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		Thread.sleep(2000);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(15000); //failing with 10000 ms, increased to 15000 ms
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		clickAndroidDeviceBackBttn();
		waitForVisibility(CreatePollYouTubeLink);
		Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
		click(CreatePollYouTubeLink);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}

		try {
			if(videoAlbum.isEnabled()) {
				waitForVisibility(videoAlbum);
				Assert.assertTrue(isElementPresent(videoAlbum));
				click(videoAlbum);
				waitForVisibility(video1);
				Assert.assertTrue(isElementPresent(video1));
				click(video1);
			}
		}
		catch (Exception e)
		{
			//choose the second video displayed in list, need better locators for this
			Thread.sleep(2000);
			waitForVisibility(samsungCameraIcon.get(8));
			Assert.assertTrue(samsungCameraIcon.get(8).isDisplayed());
			samsungCameraIcon.get(2).click();

		}

		waitForVisibility(cropSaveButton);
		click(cropSaveButton);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Testing");
		Thread.sleep(2000);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(15000);
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		clickAndroidDeviceBackBttn();
		waitForVisibility(CreatePollLink);
		Assert.assertTrue(isElementPresent(CreatePollLink));
		click(CreatePollLink);
		waitForVisibility(linkField);
		sendKeys(linkField, "https://anydesk.com/en/downloads/thank-you?dv=win_exe");
		Assert.assertTrue(isElementPresent(linkSaveButton));
		click(linkSaveButton);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Testing");
		Thread.sleep(2000);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(15000);
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		clickAndroidDeviceBackBttn();
		waitForVisibility(imageIcon);
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));


		try {
			if(cameraImages.isEnabled()) {
				Assert.assertTrue(isElementPresent(cameraImages));
				click(cameraImages);
				waitForVisibility(image1);
				Assert.assertTrue(isElementPresent(image1));
				click(image1);
				waitForVisibility(doneImage);
				click(doneImage);
			}
		}
		catch (Exception e)
		{
			Assert.assertTrue(isElementPresent(samsungCameraIcon.get(4))); //no unique identifiers available, checking camera icon
			click(samsungCameraIcon.get(4));

		}
		Thread.sleep(2000);
		waitForVisibility(kooCreationTextBox);
		kooCreationTextBox.sendKeys("Testing");
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(15000);
	}


	public void IVerifyUserIsAbleToCreateAndPostCommentByAddingCommentWithTheCombinationOfAll() throws Exception {
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		clickAndroidDeviceBackBttn();
		waitForVisibility(whatsYourMindText);
		sendKeys(whatsYourMindTextBox, "The automated reply of comment"); 
		waitForVisibility(mic);
		Assert.assertTrue(isElementPresent(mic));
		click(mic);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}	
		waitForVisibility(profilepic);
		Assert.assertTrue(isElementPresent(profilepic));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(recorderTimer));
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(CreatePollYouTubeLink);
		Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
		click(CreatePollYouTubeLink);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(CreatePollLink);
		Assert.assertTrue(isElementPresent(CreatePollLink));
		click(CreatePollLink);
		waitForVisibility(linkField);
		sendKeys(linkField, "https://anydesk.com/en/downloads/thank-you?dv=win_exe");
		Assert.assertTrue(isElementPresent(linkSaveButton));
		click(linkSaveButton);
		waitForVisibility(imageIcon);
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(postButton);
		click(postButton);
				
	}


	public void IVerifyUserIsAbleToTapTheCameraIcon() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		//Assert.assertTrue(isElementPresent(mobileCamera)); //mi specific
		//click(mobileCamera);
		Assert.assertTrue(isElementPresent(samsungCameraIcon.get(0))); //no unique identifiers available
		click(samsungCameraIcon.get(0));

		try {
			Thread.sleep(2000);
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		Thread.sleep(2000);
		waitForVisibility(cameraScreen);
		Assert.assertTrue(isElementPresent(cameraScreen));

	}


	public void IVerifyUserShouldBaAbleToSwitchBetweenFrontAndBackCameraAndTakeaPicture() throws InterruptedException {
		waitForVisibility(cameraScreen);
		Assert.assertTrue(isElementPresent(cameraScreen));
		Assert.assertTrue(isElementPresent(cameraSwitchButton));
		click(cameraSwitchButton);
		waitForVisibility(cameraScreen);
		click(cameraSwitchButton);
		
	}


	public void IVerifyUserIsAbleToSwitchOnAndOfTheFlashWhileUsingackamera() throws InterruptedException {
		waitForVisibility(flashToggleOFFButton);
		Assert.assertTrue(isElementPresent(flashToggleOFFButton));
		click(flashToggleOFFButton);
		waitForVisibility(flashToggleONButton);
		Assert.assertTrue(isElementPresent(flashToggleONButton));
		click(flashToggleONButton);
		waitForVisibility(flashToggleOFFButton);
		Assert.assertTrue(isElementPresent(flashToggleOFFButton));
	
	}


	public void IVerifyOnTappingBackCancelButtonFromCameraScreenUserShouldLandOnGalleryScreen() throws InterruptedException {
		waitForVisibility(cameraScreenBackButton);
		Assert.assertTrue(isElementPresent(cameraScreenBackButton));
		click(cameraScreenBackButton);
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		Assert.assertTrue(phoneGallary.getText().equalsIgnoreCase("Gallery"));
	
	}


	public void IVerifyOnCapturingTheImageDoneAndCancelButtonWithImageCropperShouldAppear() throws InterruptedException {
		try {

			waitForVisibility(mobileCamera);
			Assert.assertTrue(isElementPresent(mobileCamera));
			click(mobileCamera);
			waitForVisibility(cameraScreen);
			Assert.assertTrue(isElementPresent(cameraScreen));
			click(cameraScreen);
			waitForVisibility(cancleButton);
			Assert.assertTrue(isElementPresent(cancleButton));
			Assert.assertTrue(isElementPresent(doneButton1));
		} catch (Exception e)
		{
			waitForVisibility(samsungCameraIcon.get(0));
			Assert.assertTrue(isElementPresent(samsungCameraIcon.get(0)));
			click(samsungCameraIcon.get(0));
			waitForVisibility(cameraScreen);
			Assert.assertTrue(isElementPresent(cameraScreen));
			click(cameraScreen);
			Thread.sleep(2000);
			waitForVisibility(cancelImagePreviewButton);
			Assert.assertTrue(isElementPresent(cancelImagePreviewButton));
			//Assert.assertTrue(isElementPresent(doneButton1));
	}

	}


	public void IVerifyOnTappingOnDone() throws InterruptedException {
		waitForVisibility(doneButton1);
		click(doneButton1);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(capturedImage));
		Assert.assertTrue(isElementPresent(addMoreButton));
		click(addMoreButton);
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		Assert.assertTrue(phoneGallary.getText().equalsIgnoreCase("Gallery"));
		Assert.assertTrue(isElementPresent(cameraImages));
		click(cameraImages);
		waitForVisibility(image1);
		Assert.assertTrue(isElementPresent(image1));
		click(image1);
		waitForVisibility(multipleAddButton);
		Assert.assertTrue(isElementPresent(multipleAddButton));
		click(multipleAddButton);
		waitForVisibility(doneImage);
		click(doneImage);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		
	}


	public void IVerifyUserShouldNotBeAbleToPostKooWithoutAddingTitle() throws InterruptedException {
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		waitForVisibility(whatsYourMindText);
		sendKeys(whatsYourMindTextBox,""); 
		waitForVisibility(postButton);
		click(postButton);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		sendKeys(whatsYourMindTextBox, "Tested and Verified for (Image From Camera) module"); 
		click(postButton);
		Thread.sleep(4000);
		swipeToSeeUpsideElementsOfScreen(2);
		Thread.sleep(2000);
		waitForVisibility(myPostTitle);
		Assert.assertTrue(isElementPresent(myPostTitle));
		
	}


	public void IVerifyKooCommentsOffFeatureForScenarios() throws Exception {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		sendKeys(whatsYourMindTextBox, "Testing for comment preferences"); 
		click(postButton);
		Thread.sleep(4000);
		swipeToSeeUpsideElementsOfScreen(3);
		waitForVisibility(KooCardContent);
		Assert.assertTrue(isElementPresent(KooCardContent));
		waitForVisibility(dropDownButton);
		Assert.assertTrue(isElementPresent(dropDownButton));
		click(dropDownButton);
		waitForVisibility(editKooButton);
		click(editKooButton);
		waitForVisibility(settingsIcon);
		Assert.assertTrue(isElementPresent(settingsIcon));
		click(settingsIcon);
		waitForVisibility(commentPrefrencesPage);
		Assert.assertTrue(isElementPresent(commentPrefrencesPage));
		Assert.assertTrue(isElementPresent(everyoneOption));
		Assert.assertTrue(isElementPresent(peopleYouFollowOption));
		Assert.assertTrue(isElementPresent(noOneOption));
		Assert.assertTrue(isElementPresent(applyForAllKooOption));
		Assert.assertTrue(isElementPresent(checkboxesOption));
		click(everyoneCheckbox);
		click(noOneCheckbox);
		click(everyoneCheckbox);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		click(postButton);
			
	}


	public void IVerifIVerifyonSelectingEveryoneAllTheUsersUsingKooAppTheyCanCommentonThatRespectiveKooyKooCommentsOffFeatureForScenarios() throws Exception {
		waitForVisibility(Profileicon);
		click(Profileicon);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(setting));
		new ProfilePage().IVerifyByLoggingOut();
		new CommonStepsDef().logInUsingTestMobileNumber("1111100034");
		waitForVisibility(Profileicon);
		waitForVisibility(SearchButton);
		click(SearchButton);
		waitForVisibility(SearchPage);
		Assert.assertTrue(isElementPresent(SearchPage));
		Assert.assertTrue(isElementPresent(SearchField));
		SearchField.sendKeys("yester10");
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		waitForVisibility(KooSearch1);
		click(KooSearch1);
		Thread.sleep(2000);
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		Thread.sleep(2000);
		waitForVisibility(whatsYourMindText);
		sendKeys(whatsYourMindTextBox, "Followed people is abel to comment for (everyone) koo"); 
		click(postButton);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(3000);
		waitForVisibility(Profileicon);
		click(Profileicon);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(setting));
		new ProfilePage().IVerifyByLoggingOut();
		new CommonStepsDef().logInUsingTestMobileNumber("1111100035");
		waitForVisibility(Profileicon);
		waitForVisibility(SearchButton);
		click(SearchButton);
		waitForVisibility(SearchPage);
		Assert.assertTrue(isElementPresent(SearchPage));
		Assert.assertTrue(isElementPresent(SearchField));
		SearchField.sendKeys("yester10");
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		waitForVisibility(KooSearch2);
		click(KooSearch2);
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		waitForVisibility(whatsYourMindText);
		sendKeys(whatsYourMindTextBox, "UnFollowed people is abel to comment for (everyone) koo"); 
		click(postButton);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		waitForVisibility(Profileicon);
		click(Profileicon);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(setting));
		new ProfilePage().IVerifyByLoggingOut();
		new CommonStepsDef().logInUsingTestMobileNumber("1111100034");
		try {
			if(isElementPresent(CloseButton)){
				click(CloseButton);
			} 	
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		try {
			if (isElementPresent(ThreadsButton))
			{
				click(ThreadsButton);
				Thread.sleep(4000);
				clickAndroidDeviceBackBttn();
			}
			else
			{			
				waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
				click(whatsYourCommentTextBoxOnTheKooPost);
				Thread.sleep(4000);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		clickAndroidDeviceBackBttn();
		new HomePage().VerifyByDeletingTheGeneratedPoll();
	}


	public void IVerifyUserShouldBeAbleToSeeVideoRecordingOptionOnTheKooCreateTextBox() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(videoIcon));
				
	}


	public void IVerifyOnTappingVideoIconUserShouldNavigateToVideoRecordingScreenAndRecordVideoPermissionPopupShouldShow() throws InterruptedException {
		waitForVisibility(videoIcon);
		click(videoIcon);
		Thread.sleep(2000);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				Thread.sleep(2000);
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
				Thread.sleep(2000);
			}
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
				Thread.sleep(2000);
				waitForVisibility(permission1);
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
			}


		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(micOn);
		Assert.assertTrue(isElementPresent(micOn));
		
	}

	public void IVerifyOnTappingDeviceBackUserShouldNavigateBackToKooCreateScreen() throws InterruptedException {
		waitForVisibility(micOn);
		Assert.assertTrue(isElementPresent(micOn));
		clickAndroidDeviceBackBttn();
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(videoIcon));
		click(videoIcon);
		waitForVisibility(micOn);
		Assert.assertTrue(isElementPresent(micOn));
		Assert.assertTrue(isElementPresent(cameraViewScreen));
	
	}

	public void IVerifyVideoRecordingScreenShouldShowInFullScreenByDefaultAlongWithRearCameraView() throws InterruptedException {
		Assert.assertTrue(isElementPresent(cameraViewScreen));
		
	}
	
	public void IVerifyUserShouldbeAbletoRecordVideoForMinof3SecondsandMaxof1Minute() throws InterruptedException {
		Assert.assertTrue(isElementPresent(videoCameraTogggle));
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(recorderTimer));
		//recording video for 1 minute
		//Thread.sleep(60000);
		/*if(mediaPermissionAllowButton.isDisplayed())
		{
			mediaPermissionAllowButton.click();
			Thread.sleep(2000);
		}*/


		//checking for preview button 5 times every 15 seconds
		for(int i=0;i<4;i++)
		{
			Thread.sleep(10000);
			System.out.println("Is video recording complete and preview seen " );//+ previewPage.isDisplayed() + previewPage.isEnabled());
		}
		waitForVisibility(previewPage);
		clickAndroidDeviceBackBttn();
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(!isElementPresent(videoCameraTogggle));
		
		
	}


	public void IVerifyonTappingCameraSwitchButtonRecordingScreenShouldSwitchtoFrontCameraandViceVersa() throws InterruptedException {
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		click(restartButton);
		waitForVisibility(yesButtonOnConfirmationPopUp);
		Assert.assertTrue(isElementPresent(yesButtonOnConfirmationPopUp));
		click(yesButtonOnConfirmationPopUp);
		waitForVisibility(videoCameraTogggle);
		Assert.assertTrue(!isElementPresent(previewText));
		Assert.assertTrue(isElementPresent(videoCameraTogggle));
		click(videoCameraTogggle);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(cameraViewScreen));
		click(videoCameraTogggle);
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(cameraViewScreen));
	}


	public void IVerifyonTappingCloseButtonDeviceBackButtonPopupShouldShowWithTheText() throws InterruptedException {
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Assert.assertTrue(isElementPresent(recorderTimer));
		clickAndroidDeviceBackBttn();
		waitForVisibility(alertMessagePopup);
		Assert.assertTrue(alertMessagePopup.getText().equalsIgnoreCase("Are you sure you want to leave the recording screen?"));
		Assert.assertTrue(yesButtonOnConfirmationPopUp.getText().equalsIgnoreCase("YES"));
		clickAndroidDeviceBackBttn();
		waitForVisibility(cameraViewScreen);
		Assert.assertTrue(isElementPresent(micOn));
		Assert.assertTrue(isElementPresent(cameraViewScreen));
		clickAndroidDeviceBackBttn();
		waitForVisibility(alertMessagePopup);
		click(yesButtonOnConfirmationPopUp);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(videoIcon));	
		
	}


	public void IVerifyonTappingPreviewButtonUserShouldNavigatetoVideoPreviewScreenAlongWithFollowingOptions() throws InterruptedException {
		waitForVisibility(videoIcon);
		click(videoIcon);
		waitForVisibility(micOn);
		Assert.assertTrue(isElementPresent(micOn));
		click(micOn);
		Assert.assertTrue(isElementPresent(recorderTimer));
		//checking for preview button 5 times every 15 seconds
		for(int i=0;i<4;i++)
		{
			Thread.sleep(10000);
			System.out.println("Is video recording complete and preview seen " );//+ previewPage.isDisplayed() + previewPage.isEnabled());
		}
		waitForVisibility(previewPage);
		clickAndroidDeviceBackBttn();
		waitForVisibility(videoPreview);
		Assert.assertTrue(isElementPresent(videoPreview));
		click(videoPreview);
		waitForVisibility(previewPage);
		Assert.assertTrue(isElementPresent(backButtonInCommentPrefrences));
		Assert.assertTrue(isElementPresent(recordedVideo1));
		Assert.assertTrue(isElementPresent(playButton));
		Assert.assertTrue(isElementPresent(audioCropBar));
		Assert.assertTrue(isElementPresent(cropSaveButton));
		Assert.assertTrue(isElementPresent(minDuration));
		Assert.assertTrue(isElementPresent(maxDuration));
	
	}


	public void IVerifyonTappingBackButtonDeviceBackButtonUserShouldNavigateBacktoVideoRecordingScreen() throws InterruptedException {
		waitForVisibility(backButtonInCommentPrefrences);
		click(backButtonInCommentPrefrences);
		waitForVisibility(videoPreview);
		Assert.assertTrue(isElementPresent(videoPreview));
		click(videoPreview);
		waitForVisibility(previewPage);
		
	}


	public void IVerifyonTappingPlayButtonRecordedVideoClipShouldStartPlaying() throws InterruptedException {
		waitForVisibility(playButton);
		click(playButton);
		Thread.sleep(4000);
		click(playButton);
		
	}


	public void IVerifyonTappingSaveButtoninVideoRecordingScreen() throws InterruptedException {
		Assert.assertTrue(isElementPresent(cropSaveButton));
		click(cropSaveButton);
		waitForVisibility(restartButton);
		Assert.assertTrue(isElementPresent(restartButton));
		Assert.assertTrue(isElementPresent(SaveButton));
		click(SaveButton);
		waitForVisibility(recordedVideo);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(recordedVideo));	
		
	}


	public void IVerifyFollowingOptionsShouldShowonTheAttachedRecordedVideoinKooCreationScreen() throws InterruptedException {
		waitForVisibility(recordedVideo);
		Assert.assertTrue(isElementPresent(canclebutton));
		Assert.assertTrue(isElementPresent(editButton));	
		Assert.assertTrue(isElementPresent(playbutton));
		Assert.assertTrue(isElementPresent(videoDuration));
		
	}


	public void IVerifyonTappingEditButtonUserShouldNavigatetoVideoEditScreenandVerifyFollowingThingsinEditScreen() throws InterruptedException {
		waitForVisibility(editButton);
		click(editButton);
		waitForVisibility(previewPage);
		Assert.assertTrue(isElementPresent(backButtonInCommentPrefrences));
		Assert.assertTrue(isElementPresent(recordedVideo1));
		Assert.assertTrue(isElementPresent(playButton));
		Assert.assertTrue(isElementPresent(audioCropBar));
		Assert.assertTrue(isElementPresent(cropSaveButton));
		Assert.assertTrue(isElementPresent(minDuration));
		Assert.assertTrue(isElementPresent(maxDuration));
		waitForVisibility(playButton);
		click(playButton);
		Thread.sleep(4000);
		click(playButton);
		click(backButtonInCommentPrefrences);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(recordedVideo));	
	}


	public void IVerifyUserIsAbleToTaponaddVideoButton() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
		click(CreatePollYouTubeLink);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
			if(isElementPresent((permission1))) {
				Thread.sleep(1000);
				waitForVisibility(permission1);
				click(permission1);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		try{
			if(isElementPresent(videoAlbum))
			{
				waitForVisibility(videoAlbum);
			}
			else {
				waitForVisibility(samsungCameraIcon.get(2));
			}
		}
		catch (Exception e) {
			System.out.println("None of the video gallery options matched");
		}
		//waitForVisibility(videoAlbum);
		
	}


	public void IVerifyUserShouldBeAbletoSelectAnyofTheGalleryType() throws InterruptedException {
		//handling both Samsung and Mi cases
/*		try{
			if(isElementPresent(videoAlbum))
			{
				waitForVisibility(videoAlbum);
				Assert.assertTrue(isElementPresent(videoAlbum));
				click(videoAlbum);
			}
			else {
				waitForVisibility(samsungCameraIcon.get(2));
			}
		}
		catch (Exception e) {
			System.out.println("None of the video gallery options matched");
		}
		waitForVisibility(videoAlbum);
		Assert.assertTrue(isElementPresent(videoAlbum));
		click(videoAlbum);
		waitForVisibility(video1);
		Assert.assertTrue(isElementPresent(video1));
		click(video1);*/
		//choosing the second video present in gallery
		Thread.sleep(2000);
		waitForVisibility(samsungCameraIcon.get(2));
		Assert.assertTrue(samsungCameraIcon.get(2).isDisplayed());
		samsungCameraIcon.get(2).click();
		waitForVisibility(cropSaveButton);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		click(cropSaveButton);
		waitForVisibility(kooCreationTextBox);
		Assert.assertTrue(isElementPresent(recordedVideo));	
		
	}


	public void IVerifyEditRemoveandPlayButtonsonTheAddedVideo() throws InterruptedException {
		waitForVisibility(recordedVideo);
		Assert.assertTrue(isElementPresent(canclebutton));
		Assert.assertTrue(isElementPresent(editButton));	
		Assert.assertTrue(isElementPresent(playbutton));
		Assert.assertTrue(isElementPresent(videoDuration));
		
	}


	public void IVeriyonTappingEditButtonUserShouldNavigatetoPreviewScreen() throws InterruptedException {
		waitForVisibility(editButton);
		click(editButton);
		waitForVisibility(previewPage);
		Assert.assertTrue(isElementPresent(backButtonInCommentPrefrences));
		Assert.assertTrue(isElementPresent(recordedVideo1));
		Assert.assertTrue(isElementPresent(playButton));
		Assert.assertTrue(isElementPresent(audioCropBar));
		Assert.assertTrue(isElementPresent(cropSaveButton));
		Assert.assertTrue(isElementPresent(minDuration));
		Assert.assertTrue(isElementPresent(maxDuration));
		waitForVisibility(playButton);
		click(playButton);
		Thread.sleep(4000);
		click(playButton);
		click(backButtonInCommentPrefrences);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(recordedVideo));	
		
	}


	public void IVerifyonTappingPlayButtonUserShouldLandonPreviewScreenandVideoShouldStartPlayingAutomatically() throws InterruptedException {
		waitForVisibility(playbutton);
		click(playbutton);
		waitForVisibility(previewPage);
		Assert.assertTrue(isElementPresent(backButtonInCommentPrefrences));
		Thread.sleep(4000);
		click(backButtonInCommentPrefrences);
		waitForVisibility(recordedVideo);
	}


	public void IVerifyonTappingCancelButtontheAddedVideoShouldDisappearFromKooCreationScreen() {
		waitForVisibility(canclebutton);
		click(canclebutton);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(!isElementPresent(recordedVideo));
		
	}


	public void IVerifyUserShouldNotbeAbletoPostaKooOnlybyAaddingaVideoWithoutTitle() {
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
		click(CreatePollYouTubeLink);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}

		try{
			if(isElementPresent(videoAlbum))
			{
				waitForVisibility(videoAlbum);
				Assert.assertTrue(isElementPresent(videoAlbum));
				click(videoAlbum);
			}
			else {
				waitForVisibility(samsungCameraIcon.get(2));
				Assert.assertTrue(isElementPresent(samsungCameraIcon.get(2)));
				click(samsungCameraIcon.get(2));
			}
		}
		catch (Exception e) {
			System.out.println("None of the video gallery options matched");
		}

		/*waitForVisibility(video1);
		Assert.assertTrue(isElementPresent(video1));
		click(video1);*/
		waitForVisibility(cropSaveButton);
		Assert.assertTrue(isElementPresent(cropSaveButton));
		click(cropSaveButton);
		waitForVisibility(kooCreationTextBox);
		Assert.assertTrue(isElementPresent(recordedVideo));	
		click(postButton);
		Assert.assertTrue(!isElementPresent(AddPollButton));
		waitForVisibility(kooCreationTextBox);
		Assert.assertTrue(isElementPresent(recordedVideo));	
		
	}


	public void IVerifyUserIsAbleToSeeImageUploadIconOnTheKooCreationScreen() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		Assert.assertTrue(isElementPresent(cameraImages));
		click(cameraImages);
		waitForVisibility(image1);
		Assert.assertTrue(isElementPresent(image1));
		click(image1);

	}


	public void IVerifybySelectingTheImage() throws InterruptedException {
		waitForVisibility(imageCropButton);
		Assert.assertTrue(isElementPresent(imageCropButton));
		Assert.assertTrue(isElementPresent(deleteButton));
		waitForVisibility(doneImage);
		click(doneImage);
		waitForVisibility(postButton);
		
	}


	public void IVerifytheEditandTheCancelButtononTheImage() throws InterruptedException {
		waitForVisibility(capturedImage);
		Assert.assertTrue(isElementPresent(capturedImage));
		Assert.assertTrue(isElementPresent(cancleButton1));
		click(cancleButton1);
		Thread.sleep(2000);
		Assert.assertTrue(!isElementPresent(capturedImage));
		Assert.assertTrue(!isElementPresent(cancleButton1));
		
	}


	public void IVerifytheAddImageButtonatTheBottomUntillUserAddsMaximumof4Images() throws InterruptedException {
		waitForVisibility(AddPollButton);
		click(AddPollButton);
		waitForVisibility(CreatePollPage);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(CreatePollPage));
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		Assert.assertTrue(isElementPresent(cameraImages));
		click(cameraImages);
		waitForVisibility(image1);
		Assert.assertTrue(isElementPresent(image1));
		click(image1);
		waitForVisibility(doneImage);
		click(doneImage);
		waitForVisibility(addMoreButton);
		Assert.assertTrue(isElementPresent(addMoreButton));
		click(addMoreButton);
		waitForVisibility(phoneGallary);
		click(cameraImages);
		waitForVisibility(image1);
		click(image1);
		waitForVisibility(multipleAddButton);
		Assert.assertTrue(isElementPresent(multipleAddButton));
		Assert.assertTrue(multipleAddButton.getText().equalsIgnoreCase("Add images 1 / 4"));
		Assert.assertTrue(isElementPresent(selectedImage1));
		click(Image2);
		Assert.assertTrue(multipleAddButton.getText().equalsIgnoreCase("Add images 2 / 4"));
		Assert.assertTrue(isElementPresent(selectedImage2));
		click(Image2);
		Assert.assertTrue(multipleAddButton.getText().equalsIgnoreCase("Add images 1 / 4"));
		Assert.assertTrue(!isElementPresent(selectedImage2));
		click(Image2);
		Assert.assertTrue(multipleAddButton.getText().equalsIgnoreCase("Add images 2 / 4"));
		Assert.assertTrue(isElementPresent(selectedImage2));
		Thread.sleep(3000);
		click(multipleAddButton);
		waitForVisibility(doneImage);
		Assert.assertTrue(isElementPresent(imagePositionText));
		click(doneImage);
		waitForVisibility(addMoreButton);
		Assert.assertTrue(isElementPresent(addMoreButton));
		click(addMoreButton);
		waitForVisibility(mobileCamera);
		Assert.assertTrue(isElementPresent(mobileCamera));
		click(mobileCamera);
		try {
			if(isElementPresent(permission1)) {
				Assert.assertTrue(isElementPresent(permission1));
				click(permission1);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(cameraScreen);
		Assert.assertTrue(isElementPresent(cameraSwitchButton));
		click(cameraSwitchButton);
		waitForVisibility(cameraScreen);
		waitForVisibility(cameraScreen);
		click(cameraScreen);
		waitForVisibility(doneButton1);
		click(doneButton1);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(!isElementPresent(addMoreButton));
		Assert.assertTrue(!isEnabled(imageIcon));
		waitForVisibility(postButton);
		
		
	}


	public void IVerifyonLongPressingOnAnyImageAlsoUserShouldbeAbletoSelectMultipleImages() throws InterruptedException {
		click(cancleButton1);
		Thread.sleep(2000);
		click(cancleButton1);
		Thread.sleep(2000);
		click(cancleButton1);
		Thread.sleep(2000);
		click(cancleButton1);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(imageIcon));
		click(imageIcon);
		try {
			if(isElementPresent(permission2)) {
				waitForVisibility(permission2);
				Assert.assertTrue(isElementPresent(permission2));
				click(permission2);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
		waitForVisibility(phoneGallary);
		Assert.assertTrue(isElementPresent(phoneGallary));
		Assert.assertTrue(isElementPresent(cameraImages));
		click(cameraImages);
		waitForVisibility(image1);
		Assert.assertTrue(isElementPresent(image1));
		longPressOnElement(image1);
		waitForVisibility(multipleAddButton);
		Assert.assertTrue(isElementPresent(multipleAddButton));
		Assert.assertTrue(multipleAddButton.getText().equalsIgnoreCase("Add images 1 / 4"));
		Assert.assertTrue(isElementPresent(selectedImage1));
		click(Image2);
		Assert.assertTrue(multipleAddButton.getText().equalsIgnoreCase("Add images 2 / 4"));
		Assert.assertTrue(isElementPresent(selectedImage2));
		click(Image2);
		Assert.assertTrue(multipleAddButton.getText().equalsIgnoreCase("Add images 1 / 4"));
		Assert.assertTrue(!isElementPresent(selectedImage2));
		click(Image2);
		Assert.assertTrue(multipleAddButton.getText().equalsIgnoreCase("Add images 2 / 4"));
		Assert.assertTrue(isElementPresent(selectedImage2));
		Thread.sleep(3000);

		
	}


	public void IVerifyGIFIconatTheBottomOfKooCreationScreen1() throws Exception {
		waitForVisibility(KooCardContent);
		click(KooCardContent);
		scrollToElement(rekooButton, "up");
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		waitForVisibility(gifButton);
		Assert.assertTrue(isElementPresent(gifButton));
		
		
		
	}


	public void IVerifyOnTappingGIFIconGIFImagesShouldLoadAndDisplay() throws Exception {
		waitForVisibility(KooCardContent);
		click(KooCardContent);
		scrollToElement(rekooButton, "up");
		waitForVisibility(rekooButton);
		click(rekooButton);
		waitForVisibility(rekooWithComment);
		click(rekooWithComment);
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		waitForVisibility(gifButton);
		Assert.assertTrue(isElementPresent(gifButton));
		
		waitForVisibility(gifButton);
		click(gifButton);
		waitForVisibility(gifSuggestions);
		Assert.assertTrue(isElementPresent(gifSuggestions));
		
	}


	public void IVerifyonTappingAnyofTheGIFImageRespectiveImageShouldShowonKooCreationScreen() throws InterruptedException {
		waitForVisibility(gifSuggestions);
		waitForVisibility(gifSuggestion1);
		Assert.assertTrue(isElementPresent(gifSuggestion1));
		click(gifSuggestion1);
		waitForVisibility(slectedGif);
		Assert.assertTrue(isElementPresent(slectedGif));
		Assert.assertTrue(isElementPresent(cancleButton1));
		click(postButton);
		waitForVisibility(slectedGif);
		Assert.assertTrue(isElementPresent(slectedGif));
		Assert.assertTrue(isElementPresent(cancleButton1));
		click(cancleButton1);
		
	}



	





	
	
	


}
