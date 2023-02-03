package com.qa.pages;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Enums;
import com.qa.pages.Filters.DiscoverProfession;
//import com.qa.pages.Filters.ReasonForReportingList;
import com.qa.utils.TestUtils;

import io.cucumber.java.en.Then;

public class HomePage extends BasePage {

	PermissionHandlerPage permissionHandler = new PermissionHandlerPage();
	@FindBy(id= "com.koo.app:id/clProfile")
	public WebElement profilePicLocator;

	@FindBy(id= "com.koo.app:id/koo_imageview")
	public WebElement kooIcon;

	@FindBy(id="com.koo.app:id/iv_explore")
	public WebElement trendingKooIcon;


	@FindBy(xpath = "//android.widget.TextView[@index='0']")
	public WebElement TrendingHastagHeadr;


	@FindBy(xpath="//android.widget.TextView[@text='Trending Koos (24 hours)']")
	public WebElement trendingKoosText;

	@FindBy(xpath = "//android.Widget.ImageButton[@index='0']")
	public WebElement backButtonNavigation;

	@FindBy(xpath= "//android.widget.TextView[@text='Feed']")
	public WebElement feedTab;

	@FindBy(xpath="//android.widget.TextView[@text='People']")
	public WebElement peopleTab;

	@FindBy(xpath="//android.widget.TextView[@text='Cricket']")
	public WebElement cricketTab;

	@FindBy(xpath="//android.widget.TextView[@text='Trending']")
	public WebElement trendingTab;

	@FindBy(xpath="//android.widget.TextView[@text='Videos']")
	public WebElement videosTab;	

	@FindBy(xpath="//android.widget.TextView[@text='Polls']")
	public WebElement pollsTab;	

	@FindBy(xpath="//android.widget.TextView[@text='Following']")
	public WebElement followingTab;

	@FindBy(id="com.koo.app:id/tv_button_text")
	public WebElement topFiftyFollowerforHindi;

	@FindBy(id="com.koo.app:id/above_title")
	public WebElement fiftyPlusPeopleInSpecalizedProfession;

	@FindBy(id="com.koo.app:id/tvFollow")
	public WebElement followButtonInHindi;

	@FindBy(id="com.koo.app:id/new_koos_view")
	public WebElement GoToNewFeedsInHindi;

	@FindBy(xpath="//android.widget.TextView[@text='@à¤•à¥‚_à¤¹à¤¿à¤‚à¤¦à¥€']")
	public WebElement kooHindiOfficalTitle;

	@FindBy(id="com.koo.app:id/likes_holder")
	public WebElement likeButton;
	
	@FindBy(id="com.koo.app:id/like_textview")
	public WebElement likeAmountText;

	@FindBy(xpath="//android.widget.TextView[@text='Let others know who you are']")
	public WebElement letMeKnowWhoYouArePopUp;

	@FindBy(id="com.koo.app:id/close_button")
	public WebElement closeButton;

	@FindBy(xpath="//android.widget.TextView[@text='à¤¨à¤ˆ à¤«à¤¼à¥€à¤¡ à¤¦à¥‡à¤–à¥‡à¤‚']")
	public WebElement newFeedTextInHindi;

	@FindBy(id="com.koo.app:id/top_user_title")
	public WebElement followIntrestingPeople;

	@FindBy(xpath="//android.widget.TextView[@resource-id='com.koo.app:id/top_user_title' and @index='0']")
	public WebElement discoverReleventPeopleInHindi;


	@FindBy(id="com.koo.app:id/tv_button_text")
	public WebElement topFiftyFollowerforTamil;


	@FindBy(xpath="//android.widget.TextView[@text='Latest']")
	public WebElement latestTab;

	@FindBy(xpath="//android.widget.TextView[@text='New']")
	public WebElement newTab;

	@FindBy(xpath="//android.widget.TextView[@text='Popular']")
	public WebElement popularTab;

	//@FindBy(xpath="//android.widget.TextView[@text='People you can follow']" )
	@FindBy(id="com.koo.app:id/header_text")
	public WebElement peopleYouCanFollowText;

	@FindBy(id="com.koo.app:id/channel_name_textview")
	public List<WebElement> cardsData;

	@FindBy(id = "com.koo.app:id/layout_home")
	public WebElement homeExplorer;

	@FindBy(id = "com.koo.app:id/layout_explore")
	public WebElement hashTags;

	@FindBy(id = "com.koo.app:id/layout_search")
	public WebElement searchButton;

	@FindBy(id = "com.koo.app:id/layout_messages")
	public WebElement chatButton;

	@FindBy(id = "com.koo.app:id/layout_notification")
	public WebElement notificationButton;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public WebElement kooCard;

	@FindBy(id = "com.koo.app:id/topic_title_textview")
	public WebElement kooFeedMessage;
	
	@FindBy(id = "com.koo.app:id/topic_title_textview")
	public WebElement justificationText;

	@FindBy(id = "com.koo.app:id/circular_fab")
	public WebElement kooCreationButton;

	@FindBy(id = "com.koo.app:id/iv_home")
	public WebElement homeButton;

	@FindBy(id="com.koo.app:id/tv_button_text")
	public WebElement findFriendsOnKoo;

	//	 Verify Navigations on Koo app
	@FindBy(id="com.koo.app:id/img_my_profile")
	public WebElement profilePic;

	@FindBy(id="com.koo.app:id/tv_edit_profile")
	public WebElement editProfileButtonElement;

	@FindBy(id="com.koo.app:id/layout_close")
	public WebElement backButtonProfilePage;

	@FindBy(id="com.koo.app:id/tvNotificationTitle")
	public WebElement messageText;

	@FindBy(id="com.koo.app:id/top_user_title")
	public WebElement discoverRelevantPeopleText;

	//  Verify Koo Card functionality
	@FindBy(id="com.koo.app:id/layout_profile")
	public WebElement KooLabelLayout1;

	@FindBy(id="com.koo.app:id/channel_imageview")
	public WebElement KooProfilePic;

	//@FindBy(xpath="//android.widget.RelativeLayout[@index='0']/android.widget.RelativeLayout[@index='1']/android.widget.ImageView[@index='0']")
	//public WebElement KooProfilePic;

	@FindBy(xpath ="//android.widget.TextView[@resource-id='com.koo.app:id/channel_name_textview' and @index='0']")
	public WebElement KooProfileName;
	
	@FindBy(id="com.koo.app:id/channel_name_textview")
	public WebElement profileName;

	@FindBy(id ="com.koo.app:id/koo_time_creation_tv")
	public WebElement KooTime;
	
//	@FindBy(xpath="//android.widget.TextView[@resource-id='com.koo.app:id/topic_title_textview' and index='3']")
	@FindBy(id="com.koo.app:id/small_preview_rekoo")
	public WebElement originalKooText;
	
	

	//@FindBy(xpath ="//android.view.ViewGroup[@index='2']/android.widget.ImageView[@index='2']")
	//public WebElement KooFollowButton;

	//@FindBy(xpath ="//android.view.ViewGroup[@index='2']/android.widget.ImageView[@index='2']")
	//public WebElement KooCustomizeButton;

	//@FindBy(xpath ="//android.view.ViewGroup[@index='2']/android.widget.ImageView[@index='2']")
	//public WebElement KooCustomizeButton1;

	@FindBy(id ="com.koo.app:id/channel_handle_textview")
	public WebElement KooHandelName;

	@FindBy(id ="com.koo.app:id/topic_title_textview")
	public WebElement KooCardContent;

	//	@FindBy(id="com.koo.app:id/topic_title_textview")
	//	public WebElement KooCardContent;

	@FindBy(id="com.koo.app:id/like_imageview")
	public WebElement KooCardLikeButton;

	@FindBy(id="com.koo.app:id/comment_imageview")
	public WebElement KooCardCommentButton;

	@FindBy(id="com.koo.app:id/rekoo_imageview")
	public WebElement KooCardReeKooButton;

	@FindBy(id="com.koo.app:id/whatsapp_share_iv")
	public WebElement KooCardWhatsaapShareButton;

	@FindBy(id="com.koo.app:id/whatsapp_share_iv")
	public List<WebElement> whatsAppShareButtonList;

	@FindBy(id="com.koo.app:id/generic_share_iv")
	public WebElement KooCardShareButton;

	@FindBy(id="com.koo.app:id/layout_profile_parent")
	public WebElement KooProfileDetail;

	@FindBy(id="com.koo.app:id/channel_imageview")
	public WebElement KooProfilepicDetail;

	@FindBy(id="com.koo.app:id/layout_close")
	public WebElement KooCardBackButton;

	@FindBy(id="com.koo.app:id/toolbar_heading_textview")
	public WebElement KooCardTitleName;

	@FindBy(id="com.koo.app:id/fl_video_preview_layout")
	public WebElement Playersection;

	@FindBy(id="com.koo.app:id/play_view")
	public WebElement Playerbutton;
	
	@FindBy(id="com.koo.app:id/iv_options_more")
	public WebElement dropDownButton;
	
	@FindBy(xpath="//android.widget.TextView[@text='Delete Koo']")
	public WebElement deleteButton;
	

	@FindBy(xpath="//android.widget.ListView")
	public WebElement dropDownMenu;
	
	@FindBy(xpath = "//android.widget.FrameLayout[@index='0']")
	public WebElement Customizeoption;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']")
	public WebElement Shareoption;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']")
	public WebElement Followoption;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.TextView[@index='0']")
	public WebElement Followotext;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='2']")
	public WebElement ReportKoooption;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='3']")
	public WebElement Blockoption;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='4']")
	public WebElement ReportUseroption;

	@FindBy(id="com.koo.app:id/bannerAndFollowButtonLayout")
	public WebElement FollowPeople;

	@FindBy(id = "com.koo.app:id/tv_button_text")
	public WebElement followPeople;

	@FindBy(id="com.koo.app:id/header_text")
	public WebElement validateLocator;

	@FindBy(xpath = "android.widget.RelativeLayout[@index='0']")
	public WebElement cardClick;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']")
	public WebElement UnfollowPopup;

	@FindBy(id="android:id/button1")
	public WebElement UnfollowButton;

	@FindBy(xpath = "//android.view.ViewGroup[@index='1']")
	private WebElement Profiledetail;

	@FindBy(xpath = "//android.view.ViewGroup[@index='1']/android.widget.FrameLayout[@index='0']")
	private WebElement Profilepic;

	@FindBy(id ="com.koo.app:id/image_view")
	private WebElement profilepicture;

	@FindBy(xpath = "//android.widget.ImageButton[@index='0']")
	private WebElement ProfileBackButton;

	@FindBy(id ="com.koo.app:id/link_preview_layout")
	public WebElement NewsLink;

	@FindBy(xpath="//android.widget.FrameLayout")
	public WebElement KooCard;

	@FindBy(id ="com.koo.app:id/rekoo_count_parent")
	public WebElement ReeKooCards;

	@FindBy(id="com.koo.app:id/reactors_images_rl")
	public WebElement ReekooImages;

	@FindBy(xpath="//android.widget.LinearLayout[@index='2']")
	public WebElement KooCardsComments;

	@FindBy(id = "com.koo.app:id/image_view")
	public WebElement KooCardsPicture;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.TextView[@Text='#AzadiKaAmritMahotsav']")
	public WebElement KooCardsHashtagView;

	@FindBy(id="com.koo.app:id/back_imageview")
	public WebElement KooContentBackButton;
	
	@FindBy(id="android:id/button2")
	public WebElement NoConfirmationButton;


	@FindBy(xpath = "//android.view.ViewGroup[@index='4']/android.view.ViewGroup[@index='1']")
	public WebElement CommentField;
	
	@FindBy(xpath="//android.widget.EditText[@text='Write a comment']")
	public WebElement writeCommentField;

	@FindBy(id="com.koo.app:id/creation_view")
	public WebElement CommentFieldOfFeeds;

	@FindBy(id ="com.koo.app:id/reply_info")
	public WebElement replyInfo;

	@FindBy(id ="com.koo.app:id/reply_image_view")
	public WebElement replytoPicture;

	@FindBy(id="com.koo.app:id/reply_title")
	public WebElement ReplyToText;

	@FindBy(id ="com.koo.app:id/post_text_layout")
	public WebElement replyField;
	
	@FindBy(xpath="//android.widget.TextView[@text='Write Your Comment...']")
	public WebElement commentBOCText;


	@FindBy(id="com.koo.app:id/post_text_view")
	public WebElement EditRepyField;

	@FindBy(xpath ="//android.widget.RelativeLayout[@index='7']/android.widget.TextView[@index='0']")
	public WebElement endofpage;

	@FindBy(id = "com.koo.app:id/rekoo_holder")
	public WebElement ReeKooButton;

	@FindBy(xpath = "//android.widget.TextView[@text='You  Re-Kooed this ']")
	public WebElement youHaveReKooMessage;

	@FindBy(id="com.koo.app:id/comment_holder")
	public WebElement commentButton;

	@FindBy(id="com.koo.app:id/creation_view")
	public WebElement whatsYourCommentTextBoxOnTheKooPost;

	@FindBy(xpath = "//android.widget.TextView[@text='nice post']")
	public WebElement nicePostCommentText;

	@FindBy(id ="com.koo.app:id/rekoo_textview")
	public WebElement ReeKooCount;

	@FindBy(xpath = "//android.widget.TextView[@text='(Hindi)']")
	public WebElement hindiLangugagePostButton;

	@FindBy(id = "com.koo.app:id/following_textview")
	public WebElement follwingButtonInProfile;

	@FindBy(id = "com.koo.app:id/tv_koo")
	public WebElement kooCreationButtonInHindi;

	@FindBy(xpath = "//android.widget.TextView[@text='+']")
	public WebElement kooCreationButtonInTamil;

	@FindBy(xpath = "//android.widget.TextView[@text='(Tamil)']")
	public WebElement tamilLanguageSelectionButton;

	@FindBy(id = "com.koo.app:id/rt_without_content")
	public WebElement ReeKooWithOutComment;

	@FindBy(id = "com.koo.app:id/rt_with_content")
	public WebElement ReeKooWithComment;

	@FindBy(xpath = "//android.widget.TextView[@text='Re-Koo']")
	public WebElement ReeKooWithOutCommenttext;

	@FindBy(xpath = "//android.widget.TextView[@text='Re-Koo with Comment']")
	public WebElement ReeKooWithCommenttext;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.view.ViewGroup[@index='0']/android.widget.TextView[@text='Report User']")
	public WebElement reportUserPagetext;

	@FindBy(id="com.koo.app:id/container")
	public WebElement ReeKooWithCommentScreen;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement ReeKooWithCommentScreenBackButton;

	@FindBy(id ="android:id/title_container")
	public WebElement SharinglistContainer;
	
	@FindBy(id ="com.whatsapp:id/toolbar")
	public WebElement WhatsAppShareToolbar;

	@FindBy(id ="android:id/icon")
	public List<WebElement> SharinglistElementsSamsung;

	@FindBy(id ="android:id/resolver_list")
	public WebElement SharingListContainerSamsung;

	@FindBy(xpath= "//android.widget.TextView[@text='Share']")
	public WebElement SharingListTitle;

	@FindBy(id ="android:id/profile_tabhost")
	public WebElement SharingList;

	@FindBy(id ="com.koo.app:id/undo_rekoo_without_content")
	public WebElement UndoKooButton;

	@FindBy(id="com.koo.app:id/like_textview")
	public WebElement likesButton;

	@FindBy(xpath="//android.widget.TextView[@index='1']")
	public WebElement PostButtonBefore;

	@FindBy(xpath="//android.widget.TextView[@index='2']")
	public WebElement PostButtonAfter;

	@FindBy(id="com.koo.app:id/post_button")
	public WebElement PostButton;

	@FindBy(id="com.koo.app:id/comment_textview")
	public WebElement CommentButton;

	@FindBy(xpath="//android.widget.TextView[@text='Write Your Comment...']")
	public WebElement KooCardCommentField;

	@FindBy(id="com.koo.app:id/comment_textview")
	public WebElement CommentCount;

	@FindBy(xpath ="//android.widget.LinearLayout[@index='2']")
	public WebElement CommentDisplayAfterPosting;

	@FindBy(id="com.koo.app:id/image_view")
	public WebElement CommentPicDisplay; 

	@FindBy(xpath ="//android.widget.TextView[@text='Show this thread']")
	public WebElement ThreadsButton;

	@FindBy(id ="com.koo.app:id/circular_fab")
	public WebElement NewKooPostButton;
	
	@FindBy(id="com.koo.app:id/more_tv")
	public WebElement moreLikeThisButton;
	
	@FindBy(id="com.koo.app:id/images_rl")
	public WebElement recomendationImages;

	@FindBy(id ="com.koo.app:id/post_text_view")
	public WebElement CreateNewKooField;

	@FindBy(id ="com.koo.app:id/btn_share_facebook")
	public WebElement FacebookButton;

	@FindBy(xpath ="//android.webkit.WebView")
	public WebElement FacebookPopUp;

	@FindBy(xpath ="//android.widget.TextView[@text='whats a wounderful day']")
	public WebElement CreatedKooVerification;

	@FindBy(xpath ="//android.widget.TextView[@text='Polls']")
	public WebElement PollsTag;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Videos']")
	public WebElement VideosTag;

	@FindBy(id ="com.koo.app:id/rootView")
	public WebElement poll1;

	@FindBy(id="com.koo.app:id/rv_options")
	public WebElement PollOptions;

	@FindBy(xpath ="//androidx.recyclerview.widget.RecyclerView[@index='4']/android.widget.LinearLayout[@index='0']")
	public WebElement PollOption1;

	@FindBy(xpath ="//androidx.recyclerview.widget.RecyclerView[@index='4']/android.widget.LinearLayout[@index='1']")
	public WebElement PollOption2;

	@FindBy(id ="com.koo.app:id/tv_votes")
	public WebElement TotalVotes;

	@FindBy(id ="com.koo.app:id/tv_ending_at")
	public WebElement DeadlinePoll;

	@FindBy(xpath ="//android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='1']")
	public WebElement pollcreation;

	@FindBy(id ="com.koo.app:id/circular_fab_plus")
	public WebElement AddPollButton;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Share']")
	public WebElement Share;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='0']")
	public WebElement FollowingUnfollow;
	
	@FindBy(xpath="//android.widget.TextView[@text='Report Koo']")
	public WebElement ReportKoo;
	
	@FindBy(xpath="//android.widget.TextView[@text='Block']")
	public WebElement Block;
	
	@FindBy(xpath="//android.widget.TextView[@text='Report User']")
	public WebElement ReportUser;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement shareIcon;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement followingIcon;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement reportKooIcon;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement blockIcon;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement reportUserIcon;
	
	@FindBy(xpath="//android.widget.TextView[@text='Share Koo']")
	public WebElement shareKooTitle;
	
	@FindBy(xpath="//android.widget.FrameLayout[@index='1']")
	public WebElement shareingAppsList;
	
	
	@FindBy(id="com.koo.app:id/appbarLayout")
	public WebElement reportKooPage;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.view.ViewGroup[@index='0']/android.widget.TextView[@text='Report Koo']")
	public WebElement reportKooPagetext;
	
	@FindBy(id="com.koo.app:id/issue_recycler_view")
	public WebElement reportKooOptions;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='0']/android.view.ViewGroup[@index='0']/android.widget.ImageButton[@index='0']")
	public WebElement reportKooPageBackButton;
	

	@FindBy(id ="com.koo.app:id/view_pager")
	public WebElement CreatePollPage;

	@FindBy(id="com.koo.app:id/post_text_view")
	public WebElement CreatePollField;

	@FindBy(id ="com.koo.app:id/speechToTextIcon")
	public WebElement CreatePollSpeech;

	@FindBy(id ="com.koo.app:id/audioTabIcon")
	public WebElement CreatePollMic;

	@FindBy(id ="com.koo.app:id/videoTabIcon")
	public WebElement CreatePollVideo;

	@FindBy(id ="com.koo.app:id/btn_emoji")
	public WebElement CreatePollSmiles;

	@FindBy(id ="com.koo.app:id/iv_add_link")
	public WebElement CreatePollLink;
	
	@FindBy(id="com.android.chrome:id/url_bar")
	public WebElement UrlBar;

	@FindBy(id="com.android.chrome:id/close_button")
	public WebElement ChromeCloseButton;

	@FindBy(id ="com.koo.app:id/iv_add_youtube_link")
	public WebElement CreatePollYouTubeLink;

	@FindBy(id ="com.koo.app:id/iv_add_image")
	public WebElement CreatePollAddImage;

	@FindBy(id ="com.koo.app:id/poll_tab_icon")
	public WebElement CreatePollicon;

	@FindBy(id ="com.koo.app:id/settings_icon")
	public WebElement CreatePollSettingIcon;

	@FindBy(id ="com.koo.app:id/character_count_textview")
	public WebElement CreatePollCharacterCount;

	@FindBy(id="com.koo.app:id/fl_settings")
	public WebElement settingsTab;

	@FindBy(id="com.koo.app:id/logout_imageview")
	public WebElement logOutButton;

	@FindBy(id="com.koo.app:id/tvFollow")
	public WebElement logOutConfirmButton;

	@FindBy(id="com.koo.app:id/login_button")
	public WebElement logInButton;

	@FindBy(id="com.koo.app:id/language_layout")
	public WebElement languageSelectionOnEditProfile;

	@FindBy(id="com.koo.app:id/back_imageview")
	public WebElement backButton;

	@FindBy(id="com.koo.app:id/poll_parent_layout")
	public WebElement CreatePollOptionsLayout;

	@FindBy(id="com.koo.app:id/et_choice_one")
	public WebElement CreatePollOptions1;

	@FindBy(id="com.koo.app:id/et_choice_two")
	public WebElement CreatePollOptions2;

	@FindBy(id="com.koo.app:id/ic_close_poll")
	public WebElement CreatePollOptionsClose;

	@FindBy(id="com.koo.app:id/tv_add_option")
	public WebElement AddCreatePollOptions;

	@FindBy(id="com.koo.app:id/layout_display_duration")
	public WebElement CreatedPollDuration;

	@FindBy(id="com.koo.app:id/header_text")
	public WebElement CreatedPollDurationTiming;

	@FindBy(id="com.koo.app:id/layout_choice_three")
	public WebElement CreatePollOptions3;

	@FindBy(id="com.koo.app:id/iv_remove_option_three")
	public WebElement RemoveCreatePollOption;

	@FindBy(id="com.koo.app:id/post_button")
	public WebElement PollPostButton;

	@FindBy(id="android:id/message")
	public WebElement ConfirmationMessage;

	@FindBy(id="android:id/button1")
	public WebElement YesConfirmationButton;
	
	@FindBy(id="com.koo.app:id/toolbar_title")
	public WebElement hashtagScreen;

	@FindBy(id="com.koo.app:id/tv_percent")
	public WebElement PollPercentage;

	@FindBy(id="com.koo.app:id/topic_recycler_view")
	public WebElement PollDetails;

	@FindBy(xpath="//android.widget.FrameLayout[@index='0']/android.widget.ImageView[@index='1']")
	public WebElement Selectedpoll;

	@FindBy(id="com.koo.app:id/button_holder")
	public WebElement followPeopleButton;

	@FindBy(xpath = "//android.widget.TextView['View Trending Koos']")
	public WebElement viewTrendingKoosButton;

	@FindBy(id="com.koo.app:id/btnFollowView")
	public WebElement followButton;

	@FindBy(id="com.koo.app:id/new_koos_textview")
	public WebElement newKooButton;

	@FindBy(xpath = "//android.widget.TextView[@text ='Koo English']")
	public WebElement welcomeKooEnglish;

	@FindBy(xpath = "//android.widget.ImageView[@index=1]")
	public WebElement update_PopUp;

	@FindBy(id="com.koo.app:id/fl_video_preview_layout")
	public WebElement welcomeKooFamilyVideo;

	@FindBy(id="com.koo.app:id/play_blip_view")
	public WebElement blinkOnFollowButton;

	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	public WebElement englishLanguageButton;

	@FindBy(xpath = "//android.widget.TextView[@text='1d']")
	public WebElement lastOneDayFeed;

	@FindBy(xpath = "//android.widget.TextView[@text='Report Koo']")
	public WebElement reportKoo;

	@FindBy(id="com.koo.app:id/post_text_view")
	public WebElement whatsYourMindTextBox;

	@FindBy(id="com.koo.app:id/post_button")
	public WebElement postButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Report User']")
	public WebElement reportUser;

	@FindBy(id="com.koo.app:id/iv_options_more")
	public WebElement twoDotButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Share']")
	public WebElement shareKoo;

	@FindBy(id="com.koo.app:id/comment_channel_name_textview")
	public WebElement userName;

	@FindBy(id="com.koo.app:id/comment_creation_textview")
	public WebElement kooCardDetail;

	@FindBy(id="com.koo.app:id/issue_textview")
	public List<WebElement> reasonForReportingList;

	@FindBy(id="com.koo.app:id/issue_textview")
	public WebElement reasonForReportingUser;

	@FindBy(xpath = "//android.widget.TextView[@text='Cyberbullying, Insulting or Intimidating']")
	public WebElement cyberBullingInsultingorIntimidating;

	@FindBy(xpath = "//android.widget.TextView[@text='Shared my or someone else's private information.']")
	public WebElement shareMyOrSomeOnePrivateInformation ;

	@FindBy(xpath = "//android.widget.TextView[@text='Spamming, Scamming and Phishing']")
	public WebElement spamming;

	@FindBy(xpath = "//android.widget.TextView[@text='Intellectual Property Infringement']")
	public WebElement IntellectualPropertyInfringement;

	@FindBy(xpath = "//android.widget.TextView[@text='Self Injury or Suicide']")
	public WebElement SelfInjuryorSuicide;

	@FindBy(xpath = "//android.widget.TextView[@text='Conducts Illegal Activities']")
	public WebElement ConductsIllegalActivities;

	@FindBy(xpath = "//android.widget.TextView[@text='Pretending to be me or someone else']")
	public WebElement PretendingTobeBeMeOrSomeOneElse ;

	@FindBy(xpath = "//android.widget.TextView[@text='Something Else']")
	public WebElement SomethingElse;

	@FindBy(xpath = "//android.widget.TextView[@text='Not Interested/ Not Relevant']")
	public WebElement NotIntrested;

	@FindBy(xpath = "//android.widget.TextView[@text='More like this']")
	public WebElement moreLikeThis;

	@FindBy(id="com.koo.app:id/koo_using_hashtag_text")
	public WebElement plusKooUsingHastagButton;

	@FindBy(id="com.koo.app:id/creation_view_layout")
	public WebElement commentBOC;

	@FindBy(xpath = "//android.widget.TextView[@text='Our team will review it and take an action']")
	public WebElement ourTeamWillReviewText;
	
	@FindBy(xpath="//android.widget.TextView[@text='Hate Speech and Discrimination']")
	public WebElement report1;

	@FindBy(xpath="//android.widget.TextView[@text='Religiously Offensive Content']")
	public WebElement report2;

	@FindBy(xpath="//android.widget.TextView[@text='Terrorism and Extremism']")
	public WebElement report3;
	
	@FindBy(xpath="//android.widget.TextView[@text='Dangerous, Violent Content (Death or Injury)']")
	public WebElement report4;
	
	@FindBy(xpath="//android.widget.TextView[@text='Graphic, Obscene or Sexual Content']")
	public WebElement report5;
	
	@FindBy(xpath="//android.widget.TextView[@text='Provoking Koo / Comment']")
	public WebElement report6;

	@FindBy(xpath="//android.widget.TextView[@text='Misinformation and Fake news']")
	public WebElement report7;
	
	@FindBy(xpath="//android.widget.TextView[@text='Malicious Programmes, URL or Code']")
	public WebElement report8;
	
	@FindBy(xpath="//android.widget.TextView[@text='Sexual Exploitation of a Child']")
	public WebElement report9;
	
	@FindBy(xpath="//android.widget.TextView[@text='Not Interested/ Not Relevant']")
	public WebElement report10;
	
	@FindBy(xpath="//android.widget.TextView[@text='Something Else']")
	public WebElement report11;
	
	@FindBy(id="com.koo.app:id/report_koo_subheader")
	public WebElement alreadryReportedText;
	
	@FindBy(xpath= "//android.widget.TextView[@text='Feed']")
	public WebElement feedtab;
	
	@FindBy(xpath="//android.widget.TextView[@text='People you can follow']")
	public WebElement peopleucanfollow;
	
	@FindBy(xpath="//android.widget.TextView[@text='Popular']")
	public WebElement popular;
	
	@FindBy(xpath="//android.widget.TextView[@text='News Pap	ers & Channels']")
	public WebElement newspaperandchannels;
	
	@FindBy(xpath="//android.widget.TextView[@text='Entertainment']")
	public WebElement entertainment;
	
	@FindBy(xpath="//android.widget.TextView[@text='Politicians']")
	public WebElement politics;
	
	@FindBy(xpath="//android.widget.TextView[@text='Journalists']")
	public WebElement journalist;
	
	@FindBy(xpath="//android.widget.TextView[@text='Poets and Authors']")
	public WebElement poetsandauthor;
	
	@FindBy(xpath="//android.widget.TextView[@text='New']")
	public WebElement newpage;
	
	@FindBy(xpath="//android.widget.TextView[@text='Government Services']")
	public WebElement governmentservices;
	
	@FindBy(xpath="//android.widget.TextView[@text='Govt. Officials']")
	public WebElement governmentofficals;
	
	@FindBy(xpath="//android.widget.TextView[@text='Sports']")
	public WebElement sports;
	
	@FindBy(xpath="//android.widget.TextView[@text='Interesting Accounts']")
	public WebElement interestingaccounts;
	
	@FindBy(xpath="//android.widget.TextView[@text='Cricket']")
	public WebElement cricket;
	
	@FindBy(xpath="//android.widget.TextView[@text='Business']")
	public WebElement business;
	
	@FindBy(xpath="//android.widget.TextView[@text='Humor']")
	public WebElement humor;
	
	@FindBy(xpath="//android.widget.TextView[@text='Chief Ministers of India']")
	public WebElement chiefministers;
	
	@FindBy(xpath="//android.widget.TextView[@text='Interesting People']")
	public WebElement interestingpeople;
	
	@FindBy(xpath="//android.widget.TextView[@text='Recently Joined']")
	public WebElement recentlyjoined;
	
	@FindBy(xpath="//android.widget.TextView[@text='Spiritual Leaders']")
	public WebElement spiritualleaders;

	@FindBy(id="com.koo.app:id/tvFollow")
	public WebElement followbutton;

	@FindBy(id="com.koo.app:id/srl_classics_arrow")
	public WebElement arrow;
	
	@FindBy(xpath="//android.widget.TextView[@text='Pull Down to Refresh']")
	public WebElement refresh;
	
	@FindBy(xpath="//android.widget.TextView[@text='New Koos']")
	public WebElement newkoos;
	
	@FindBy(xpath="//android.widget.TextView[@text='Following']")
	public WebElement following;
	
	@FindBy(xpath="//android.widget.TextView[@text='People']")
	public WebElement peopledetailscreen;
	
	@FindBy(id="com.koo.app:id/channel_name_textview")
	public WebElement clicktheprofile;
	
	@FindBy(id="com.koo.app:id/layout_close")
	public WebElement backbutton;


	
	@FindBy(id="android.view.ViewGroup[@text='item_container']")
	public WebElement item;
	
	@FindBy(xpath="//android.widget.TextView[@text='Discover Relevant People']")
	public WebElement discoverrelevantpeople;
	
	@FindBy(xpath="(//android.widget.TextView[@resource-id='com.koo.app:id/creation_view']//parent::android.widget.RelativeLayout//parent::android.widget.LinearLayout)[1]")
	public WebElement scrolldown;
	
	@FindBy(id="comment_layout")
	public WebElement commentlayout;
	
	@FindBy(id="com.koo.app:id/followers_textview")
	public WebElement followersprofiles;
	
	@FindBy(id="com.koo.app:id/following_textview")
	public WebElement followingprofiles;
	
	@FindBy(id="com.koo.app:id/koo_imageview")
	public WebElement kooimages;
	
	//new by sumeet

	@FindBy(id="com.koo.app:id/tv_button_text")
	public WebElement topFiftyFollowEnglish;

	@FindBy(id="com.koo.app:id/view_all_textview")
	public WebElement viewAllPeopleCrousel;

	@FindBy(xpath="//android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton")
	public WebElement goBackFromAllPeopleCrousel;

	@FindBy(id="com.koo.app:id/fl_action_bar_cancel")
	public WebElement CancelButton;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
			"android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
	public WebElement BackToHomeButton;

	@FindBy(id="com.koo.app:id/blocked_list_imageview")
	public WebElement ManageUnblockButton;

	@FindBy(id="com.koo.app:id/unblock")
	public WebElement UnblockButton;

	@FindBy(id="com.koo.app:id/iv_messages")
	public WebElement MessageIconHome;

	@FindBy(id="com.koo.app:id/backArrow")
	public WebElement BackArrowMessage;

	@FindBy(id="com.koo.app:id/iv_notification")
	public WebElement NotificationIconHome;



	public void user_is_in_feed_screen() throws Exception {
		waitForVisibility(feedtab);
	}

	public void i_verify_that_people_you_can_follow_should_display() throws Exception {
		Thread.sleep(1500);
		if(!isElementPresent(peopleucanfollow)) {
			swipeToDownsideTillElementPresent(peopleucanfollow, 5);
		}
		waitForVisibility(peopleucanfollow);
		Assert.assertTrue(isElementPresent(peopleucanfollow));
	}

	public void verifyPopular() throws Exception {
		if (isElementPresent(popular))
		{
			System.out.print("pouplar is Present");
		}
		else
		{
			System.out.print("popular Not Present");
		}
	}

	public void i_verify_that_newspapers_and_channels_display_on_feed() throws InterruptedException {
		if (isElementPresent(newspaperandchannels))
		{
			System.out.print("newspaper and channels is Present");
		}
		else
		{
			System.out.print("newspaper and channels is Not Present");
		}
	}
	public void i_verify_the_entertaniment_should_be_shown() throws Exception {
		if (isElementPresent(entertainment))
		{
			System.out.print("entertainment is Present");
		}
		else
		{
			System.out.print("entertainment Not Present");
		}
	}
	public void i_verify_that_politicians_should_display() throws Exception {
		if (isElementPresent(politics))
		{
			System.out.print("politics is Present");
		}
		else
		{
			System.out.print("politics Not Present");
		}
	}
	public void i_verify_jornalist_should_be_shown() throws InterruptedException {
		if (isElementPresent(journalist))
		{
			System.out.print("journalist is Present");
		}
		else
		{
			System.out.print("journalist Not Present");
		}
	}
	public void i_verify_poets_and_authors_should_display() throws Exception {
		if (isElementPresent(poetsandauthor))
		{
			System.out.print("poets and author is Present");
		}
		else
		{
			System.out.print("poets and author Not Present");
		}
	}

	public void i_verify_new_is_displayed() {
		if (isElementPresent(newpage))
		{
			System.out.print("new page is Present");
		}
		else
		{
			System.out.print("new page Not Present");
		}
	}

	public void i_verify_government_services_is_displayed() {
		if (isElementPresent(governmentservices))
		{
			System.out.print("governement services is present");
		}
		else
		{
			System.out.print("government services is Not Present");
		}
	}

	public void i_verify_government_officials_should_display() 
	{
		if (isElementPresent(governmentofficals))
		{
			System.out.print("government officials is Present");
		}
		else
		{
			System.out.print("government officials Not Present");
		}
	}
	
	public void i_verify_on_sports_is_displayed() {
		if (isElementPresent(sports))
		{
			System.out.print("sports is Present");
		}
		else
		{
			System.out.print("sports Not Present");
		}
	}

	public void i_verify_interesting_accounts_should_shown() {
		if (isElementPresent(interestingaccounts))
		{
			System.out.print("interesting accounts is Present");
		}
		else
		{
			System.out.print("interesting accounts Not Present");
		}
	}

	public void i_verify_cricket_should_displayed() {
		if (isElementPresent(cricket))
		{
			System.out.print("cricket is Present");
		}
		else
		{
			System.out.print("cricket Not Present");
		}
	}

	public void i_verify_the_business_should_display() {
		if (isElementPresent(business))
		{
			System.out.print("business is Present");
		}
		else
		{
			System.out.print("business Not Present");
		}
	}

	public void i_verify_that_humor_is_displayed() {
		if (isElementPresent(humor))
		{
			System.out.print("humor is Present");
		}
		else
		{
			System.out.print("humor Not Present");
		}
	}
	
	public void i_verify_cheif_minister_of_india_is_displayed() throws Exception {
		if (isElementPresent(chiefministers))
		{
			System.out.print("cheif minister is Present");
		}
		else
		{
			System.out.print("cheif minister Not Present");
		}
	}

	public void i_verify_interesting_people_should_displayed() {
		if (isElementPresent(interestingpeople))
		{
			System.out.print("interesting people is Present");
		}
		else
		{
			System.out.print("interesting people Not Present");
		}
	}

	
	public void i_verify_recently_joined_is_displayed_on_feed_page() {
		if (isElementPresent(recentlyjoined))
		{
			System.out.print("recently joined is Present");
		}
		else
		{
			System.out.print("recently joined Not Present");
		}
	}

	public void i_verify_spiritual_leaders_is_displayed() {
		if (isElementPresent(spiritualleaders))
		{
			System.out.print("spiritual leaders is Present");
		}
		else
		{
			System.out.print("spiritual leaders Not Present");
		}
	}

	public void i_verify_user_scroll_the_profiles_on_carousels() {
		waitForVisibility(feedtab);
		for(int i=1; i<=8; i++)
		{
			if (isElementPresent(scrolldown))
			{
				System.out.print("Scroll is getting Started");
				swipeToSeeDownsideElementsOfScreen(i);
			}
			else
			{
				System.out.print("Scroll is working");
				swipeToSeeDownsideElementsOfScreen(i);
				isElementPresent(commentlayout);
			}
			
		}
		
	}
	
	public void i_verify_user_click_on_follow_the_profile_and_respective_profile_disappear_after_refresh_the_feed_screen() throws InterruptedException {
		if(!isElementPresent(kooIcon)) {
			swipeToUpsideTillElementPresent(kooIcon, 5);
		}
		click(kooIcon);
		Thread.sleep(3000);
		if(!isElementPresent(peopleucanfollow)) {
			swipeToDownsideTillElementPresent(peopleucanfollow, 10);
		}
		waitForVisibility(peopleucanfollow);
		Thread.sleep(3000);
		click(followbutton);
		Thread.sleep(3000);
		click(newkoos);
		Thread.sleep(3000);
	}

	public void i_verify_that_unfollowed_people_should_show_on_both_feed_and_people_detail_screen() throws Exception {
		if(!isElementPresent(peopleucanfollow)) {
			swipeToDownsideTillElementPresent(peopleucanfollow, 10);
		}
		waitForVisibility(peopleucanfollow);
		//click(peopledetailscreen);
		
	}

	public void i_verify_following_button_should_change_in_people_detail_screen() {
		waitForVisibility(peopledetailscreen);
		click(peopledetailscreen);
		String Before_Follow= getText(followbutton,"Before Clicking the follow button");
		click(followbutton);
		String After_Follow = getText(followbutton,"After Clicking the follow button");
		if (Before_Follow!=After_Follow) {
			System.out.print("User has been following");
		}
		else {
			System.out.print("User has not been following");
		}
		waitForVisibility(following);		
	}

	public void i_verify_on_tapping_any_profile_navigate_to_respective_profile_page_and_tapping_on_the_back_button() throws Exception {
		waitForVisibility(peopleucanfollow);
		click(clicktheprofile);
		waitForVisibility(followersprofiles);
		waitForVisibility(followingprofiles);
		WebElement a = followersprofiles;
		WebElement b = followingprofiles;
		if(a==followersprofiles && b==followingprofiles) {
			System.out.print("tapping the existing profile");
			click(backbutton);
			isElementPresent(kooimages);
		}
		else {
			System.out.print("not tapping on profile");
		}	
	}


	public void verifyTheProfilePicture() {
		waitForVisibility(profilePicLocator);
		Assert.assertTrue(isElementPresent(profilePicLocator));

	}

	public void updatePopUp() throws Exception {
		Thread.sleep(4000);
		try {
			//if (isElementPresent(update_PopUp)) {
			click(update_PopUp);
			//}
		}catch(Exception e){
			e.getStackTrace();
		}}

	//}
	public void verifyTheKooIcon() {
		waitForVisibility(kooIcon);
		Assert.assertTrue(isElementPresent(kooIcon));
	}

	public void verifyTheTrendingKooIcon() {
		waitForVisibility(trendingKooIcon);
		Assert.assertTrue(isElementPresent(trendingKooIcon));
	}

	public void verifyFeed(String text) {
		Assert.assertTrue(feedTab.getText().equalsIgnoreCase(text));
	}

	public void verifyPeopleText(String text) {
		Assert.assertTrue(peopleTab.getText().equalsIgnoreCase(text));
	}

	public void verify_koo_cretion_text_box_with_icon_below_home_screen_tabs_headers() {
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		Assert.assertTrue(isElementPresent(whatsYourCommentTextBoxOnTheKooPost));
	}

	public void verify_the_feed_people_tab_and_cricket_tab_in_respective_languages() {
		waitForVisibility(peopleTab);
		Assert.assertTrue(isElementPresent(peopleTab));
		click(peopleTab);
		waitForVisibility(cricketTab);
		Assert.assertTrue(isElementPresent(cricketTab));
		click(cricketTab);
		waitForVisibility(feedTab);
		click(feedTab);

	}

	public void verify_koo_create_fab_icon_should_show_as_in_respective_languages() throws Exception {
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		Thread.sleep(2500);
		waitForVisibility(hindiLangugagePostButton);
		click(hindiLangugagePostButton);
		Thread.sleep(2500);
		updatePopUp();
		Thread.sleep(5000);
		waitForVisibility(profilePic);
		Thread.sleep(2000);

		String rawString = "+ कू";
		byte[] bytes = rawString.getBytes(StandardCharsets.UTF_8);
		byte[] kooButtonText = kooCreationButtonInHindi.getText().getBytes(StandardCharsets.UTF_8);
		String utf8EncodedString = new String(kooButtonText, StandardCharsets.UTF_8);
		String expected = new String(bytes, StandardCharsets.UTF_8);

		System.out.println("Koo creation text seen on button is " + kooCreationButtonInHindi.getText() +"   -- " + kooCreationButtonInHindi.getText().contains("कू") + "   encoded  " + utf8EncodedString);
		System.out.println("Converted string " + bytes + "  -- " + kooButtonText + "  -- " + expected + "  -- " + utf8EncodedString);
		//Assert.assertTrue(expected, utf8EncodedString);

		System.out.println("Koo creation text seen on button is " + kooCreationButtonInHindi.getText() +"   -- " + kooCreationButtonInHindi.getText().equals("+ कू") + "   encoded  " + utf8EncodedString);
		Assert.assertTrue(kooCreationButtonInHindi.getText().contains("कू"));
	}

	public void verify_koo_create_f_ab_icon_should_on_show_with_icon_for_english_tamil_languages() {
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(tamilLanguageSelectionButton);
		click(tamilLanguageSelectionButton);
		waitForVisibility(profilePic);
		//Assert.assertTrue(kooCreationButtonInTamil.getText().equalsIgnoreCase("+"));
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(englishLanguageButton);
		click(englishLanguageButton);

	}

	public void verify_trending_hashtags_list_should_not_show_on_feed_screen_for_new_user_and_should_start_showing_on_feed_after_following_one_user() throws Exception {
		swipeToSeeUpsideElementsOfScreen(2);
	//	waitForVisibility(profilepicture);
		
		//scrollToElement(discoverRelevantPeopleText,"up");
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(welcomeKooEnglish));
		//Assert.assertTrue(isElementPresent(peopleYouCanFollowText));
		waitForVisibility(followButton);
		click(followButton);
		Thread.sleep(2500);
		swipeToSeeUpsideElementsOfScreen(2);
		click(kooIcon);
		Thread.sleep(5000);
		Assert.assertTrue(!isElementPresent(welcomeKooEnglish));

	}

	public void verify_after_scroll_to_bottom_banner_should_be_shown_with_button() throws Exception {
		swipeToDownsideTillElementPresent(followPeopleButton, 10);
		//scrollToElement(followPeopleButton, "up");
		Assert.assertTrue(isElementPresent(followPeopleButton));
	}

	public void verifyTheHomeExplorer() throws InterruptedException {
		Thread.sleep(5000);
		new BasePage().isElementPresent(homeExplorer);
		Thread.sleep(5000);
		new BasePage().isElementPresent(hashTags);
		Thread.sleep(5000);
		new BasePage().isElementPresent(searchButton);
		Thread.sleep(5000);
		new BasePage().isElementPresent(chatButton);
		Thread.sleep(5000);
		new BasePage().isElementPresent(notificationButton);
	}

	public void verifyTheKooCards() {
		new BasePage().
		isElementPresent(kooCard);
	}

	public void verifyOnScrollingFeedSeePeopleYouCanFollow() throws Exception {
		try {
			//scrollToElement(peopleYouCanFollowText,"up");
			swipeToDownsideTillElementPresent(peopleYouCanFollowText, 10);
			//Assert.assertTrue(isElementPresent(peopleYouCanFollowText));
			//Assert.assertTrue(cardsData.size()>1);
			Boolean peopleCarousel = peopleYouCanFollowText.getText().equalsIgnoreCase("People you can follow");
			if(!peopleCarousel)
			{
				System.out.println("Searching for carousel on People page");
			click(peopleTab);
				Thread.sleep(5000);
				swipeToDownsideTillElementPresent(peopleYouCanFollowText, 10);
				Assert.assertTrue(isElementPresent(peopleYouCanFollowText));
				peopleCarousel = peopleYouCanFollowText.getText().equalsIgnoreCase("People you can follow");
				Assert.assertTrue(peopleCarousel);
				click(feedTab);
				Thread.sleep(2000);
			}

		}

		catch (Exception e)
		{
			System.out.println("People carousel not found on feed screen and on People screen");
		}
	}

	public void verifyFeedMessage() {
		Assert.assertTrue(isElementPresent(kooFeedMessage));
	}

	public void verifyKooCreationButton() {
		Assert.assertTrue(isElementPresent(kooCreationButton));
	}

	public void verify_koo_creation_button_should_show_as_fab_icon_in_home_explore_public_profile_and_notifications_screens() {
		Assert.assertTrue(isElementPresent(kooCreationButton));
		waitForVisibility(peopleTab);
		click(peopleTab);
		waitForVisibility(kooCreationButton);
		Assert.assertTrue(isElementPresent(kooCreationButton));
		waitForVisibility(notificationButton);
		click(notificationButton);
		waitForVisibility(kooCreationButton);
		Assert.assertTrue(isElementPresent(kooCreationButton));
		waitForVisibility(homeButton);
		click(homeButton);

	}




	public void verifyTrendingHashTags() {
		waitForVisibility(hashTags);
		click(hashTags);

	}

	public void verifyHashTagsList() {

	}

	public void verifyOnScrollingScreenUser() {

	}

	public void verifyScrollingShowsFeedScreen() {

	}

	public void verifyAllTabsPresentOnHomeScreen() {

	}

	public void verifyFindFriendsIsPresentAfterScrolling() throws Exception {
		swipeToDownsideTillElementPresent(findFriendsOnKoo, 10);
		//scrollToElement(findFriendsOnKoo,"up");//for going down
		waitForVisibility(findFriendsOnKoo);
		Assert.assertTrue(isElementPresent(findFriendsOnKoo));
		waitForVisibility(peopleTab);
		click(peopleTab);
		swipeToDownsideTillElementPresent(findFriendsOnKoo, 10);
		//scrollToElement(findFriendsOnKoo,"up");
		waitForVisibility(findFriendsOnKoo);
		Assert.assertTrue(isElementPresent(findFriendsOnKoo));

	}

	public void verify_blink_on_top_bulk_follow_button_in_feed_screen() throws Exception {
		updatePopUp();
		waitForVisibility(peopleTab);
		click(peopleTab);
		Thread.sleep(1500);
		Assert.assertTrue(isElementPresent(blinkOnFollowButton));
		waitForVisibility(feedTab);
		click(feedTab);
	}


	public void verify_on_scrolling_the_screen_user_is_able_to_see_trending_koos_button() throws Exception {
		waitForVisibility(feedTab);
		click(feedTab);
		swipeToDownsideTillElementPresent(viewTrendingKoosButton, 10);
		//scrollToElement(viewTrendingKoosButton,"up");
		waitForVisibility(viewTrendingKoosButton);
		Assert.assertTrue(isElementPresent(viewTrendingKoosButton));
	}

	public void scrollToOneDayFeed() {
		try {
			scrollToElement(lastOneDayFeed,"up");
			waitForVisibility(lastOneDayFeed);
			Assert.assertTrue(lastOneDayFeed.getText().equalsIgnoreCase("24h"));
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	public void verify_all_the_tabs_in_home_screen_for_one_day_old_user_feed_people_following_trending_new_latest_polls_popular_cricket_and_videos() throws Exception {
		Thread.sleep(1800);
		waitForVisibility(feedTab);
		waitForVisibility(peopleTab);
		click(peopleTab);
		swipeToUpsideTillElementPresent(discoverRelevantPeopleText, 10);
		waitForVisibility(discoverRelevantPeopleText);
		Assert.assertTrue(isElementPresent(discoverRelevantPeopleText));
		clickAndroidDeviceBackBttn();
		waitForVisibility(trendingTab);
		click(trendingTab);
		waitForVisibility(cricketTab);
		click(cricketTab);
		waitForVisibility(videosTab);
		click(videosTab);
		waitForVisibility(latestTab);
		click(latestTab);
		waitForVisibility(followingTab);
		click(followingTab);
		waitForVisibility(newTab);
		click(newTab);
		waitForVisibility(popularTab);
		click(popularTab);
		swipeFromBottomToUp();
		Thread.sleep(1000);
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(logOutButton);
		click(logOutButton);
		waitForVisibility(logOutConfirmButton);
		click(logOutConfirmButton);
		waitForVisibility(logInButton);
		click(logInButton);




	}
	//verify ForNew user 

	public void i_verify_the_feed_structure_in_the_following_order_for_newly_installed_user_and_people_you_can_follow_careosule_in_the_first_position_with_infinite_profile_suggestions() throws Exception
	{

		Thread.sleep(5000);
		updatePopUp();
		waitForVisibility(profilePic);
		Assert.assertTrue(isElementPresent(followButton));
	}

	public void i_follow_people_button_and_top_fifty_bulk_follow_button_for_non_english_languages() throws InterruptedException {
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(tamilLanguageSelectionButton);
		click(tamilLanguageSelectionButton);
		Thread.sleep(1500);
		waitForVisibility(profilePic);
		waitForVisibility(topFiftyFollowerforTamil);
		Assert.assertTrue(isElementPresent(topFiftyFollowerforTamil));
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		click(hindiLangugagePostButton);
		Thread.sleep(2500);
		waitForVisibility(topFiftyFollowerforHindi);
		Assert.assertTrue(isElementPresent(topFiftyFollowerforHindi));

	}

	public void i_koo_team_demo_video_for_respective_language_and_discover_relavent_poeple_section_and_sample_feed_for_non_english_languages() throws Exception {
		swipeToDownsideTillElementPresent(discoverReleventPeopleInHindi, 10);
		//scrollToElement(discoverReleventPeopleInHindi,"up");
		//waitForVisibility(welcomeKooFamilyVideo);
		//  Assert.assertTrue(isElementPresent(welcomeKooFamilyVideo));
		Assert.assertTrue(isElementPresent(discoverReleventPeopleInHindi));
		Thread.sleep(1500);
		swipeToUpsideTillElementPresent(kooIcon, 10);
		click(kooIcon);
		Thread.sleep(5000);
		if(!isElementPresent(welcomeKooFamilyVideo)) {
			swipeToDownsideTillElementPresent(welcomeKooFamilyVideo, 5);
		}
		Assert.assertTrue(isElementPresent(welcomeKooFamilyVideo));
		swipeToUpsideTillElementPresent(kooIcon, 10);
		//scrollToElement(kooIcon,"down");
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		//waitForVisibility(languageSelectionOnEditProfile);
		//click(languageSelectionOnEditProfile);
		//waitForVisibility(hindiLangugagePostButton);
		//click(hindiLangugagePostButton);
		//waitForVisibility(profilePic);
		//click(profilePic);
		//waitForVisibility(settingsTab);
		//click(settingsTab);
		//waitForVisibility(languageSelectionOnEditProfile);
		click(logOutButton);
		waitForVisibility(logOutConfirmButton);
		click(logOutConfirmButton);
		waitForVisibility(logInButton);
		click(logInButton);
	}

	public void i_verify_koo_team_profile_should_be_followed_by_default_for_non_english_users() throws Exception {
		updatePopUp();
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(follwingButtonInProfile);
		click(follwingButtonInProfile);
		waitForVisibility(kooHindiOfficalTitle);
		Assert.assertTrue(isElementPresent(kooHindiOfficalTitle));
		Thread.sleep(3500);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1500);
		clickAndroidDeviceBackBttn();
	}


	public void i_verify_on_top_of_feed_carousel_with_profile_cards_to_follow() throws Exception {
		updatePopUp();
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		click(languageSelectionOnEditProfile);
		waitForVisibility(englishLanguageButton); 
		click(englishLanguageButton);
		Thread.sleep(1500);
		updatePopUp();
		waitForVisibility(profilePic);
		if(!isElementPresent(peopleYouCanFollowText)) {
			swipeToDownsideTillElementPresent(peopleYouCanFollowText, 4);
		}
		waitForVisibility(peopleYouCanFollowText);
		Assert.assertTrue(isElementPresent(peopleYouCanFollowText));
	}


	public void i_verify_on_following_a_profile_on_feed_for_the_first_time_user_should_get_view_new_feed_button_tapping_on_it_feed_should_refresh() {

		waitForVisibility(followButton);
		click(followButton);
		waitForVisibility(newKooButton);
		click(newKooButton);
	}

	public void i_verify_follow_people_button_below_people_you_can_follow_carousel_tapping_on_it_user_should_land_on_people_tab() throws Exception {
		//waitForVisibility(profilePic);
		Thread.sleep(1500);
		//scrollToElement(discoverRelevantPeopleText,"up");
		swipeToDownsideTillElementPresent(followPeopleButton, 5);
		//scrollToElement(followPeopleButton,"up");
		waitForVisibility(discoverRelevantPeopleText);
		click(followPeopleButton);
		waitForVisibility(peopleTab);
		Assert.assertTrue(isElementPresent(peopleTab));
		waitForVisibility(feedTab);
		click(feedTab);
	}




	public void logOutFromAccount() {
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(languageSelectionOnEditProfile);
		waitForVisibility(logOutButton);
		click(logOutButton);
		waitForVisibility(logOutConfirmButton);
		click(logOutConfirmButton);
		waitForVisibility(logInButton);
		click(logInButton);

	}

	public void i_verify_on_tapping_each_segment_user_should_enter_sbf_detail_screen_which_displays_list_of_profiles_to_be_followed_in_that_category() throws InterruptedException {
		if(!isElementPresent(topFiftyFollowerforHindi)) {
			swipeToDownsideTillElementPresent(topFiftyFollowerforHindi, 2);
		}
		waitForVisibility(topFiftyFollowerforHindi);
		
		//Assert.assertFalse(!isElementPresent(kooHindiOfficalTitle));
	}

	public void verify_user_should_be_able_to_follow_profile_inside_sbf_detail_screen() throws InterruptedException  {
		if(!isElementPresent(fiftyPlusPeopleInSpecalizedProfession)) {
			swipeToDownsideTillElementPresent(fiftyPlusPeopleInSpecalizedProfession, 5);
		}
		waitForVisibility(fiftyPlusPeopleInSpecalizedProfession);
		//click(fiftyPlusPeopleInSpecalizedProfession);
		//waitForVisibility(newFeedTextInHindi);
		waitForVisibility(followButton);
		click(followButtonInHindi);
		//waitForVisibility(GoToNewFeedsInHindi);
		//click(GoToNewFeedsInHindi);
		Thread.sleep(2500);
		clickAndroidDeviceBackBttn();

	}

	public void i_verify_koo_team_video_of_respectie_language_should_be_displayed_on_feed_user_should_be_able_to_react_on_that_koo() throws Exception {
		swipeToUpsideTillElementPresent(welcomeKooFamilyVideo, 5);
	//	scrollToElement(welcomeKooFamilyVideo, "down");
		waitForVisibility(likesButton);
		click(likeButton);

	}

	public void i_verify_after_following_ine_profile_sample_feed_should_disappear_on_feed_screen() {
		waitForVisibility(followButton);
		Assert.assertTrue(!isElementPresent(kooHindiOfficalTitle));
	}

	public void i_verify_discover_relavent_people_section_should_show_on_feed_for_available_sections_in_resspective_languages() {

	}

	public void i_verify_end_of_feed_banner_woth_follow_people_button_at_the_bottom_of_feed_screen() {

	}

	public void i_verify_channel_creation_popup_should_be_displayed_on_tapping_on_rekoo_posting_comment_creating_koo() {
		waitForVisibility(KooCardReeKooButton);
		click(KooCardReeKooButton);
		waitForVisibility(letMeKnowWhoYouArePopUp);
		Assert.assertTrue(isElementPresent(letMeKnowWhoYouArePopUp));
		click(closeButton);
	}


	public void i_verify_on_tapping_on_follow_button_from_any_section_twentyfive_profiles_should_be_folowed_and_the_respective_card_should_disappear() {

	}

	public void i_verify_after_following_one_profile_all_the_koos_from_the_user_should_show_on_feed() {

	}
	public void i_verify_after_following_one_person_new_user_feed_structure_should_disappear_latest_koo_by_followed_account_should_show_on_top_of_the_feed() {

	}

	public void i_verify_unfollowing_all_the_profiles_new_user_feed_stucture_should_be_shown() throws InterruptedException {
		waitForVisibility(profilePic);
		click(profilePic);
		//for(int i=0;i<=3;i++) {
		waitForVisibility(followButton);
		click(followButton);
		swipeFromBottomToUp();
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(follwingButtonInProfile);
		click(follwingButtonInProfile);
		waitForVisibility(followButton);
		click(followButton);
		waitForVisibility(YesConfirmationButton);
		click(YesConfirmationButton);
		Thread.sleep(1500);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1500);
		clickAndroidDeviceBackBttn();
		waitForVisibility(profilePic);
		Thread.sleep(1000);
		swipeFromBottomToUp();
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(discoverRelevantPeopleText));
		Assert.assertTrue(isElementPresent(videosTab));


	}



	//	 Verify Navigations on Koo app
	public void verifyProfilePictureClick() throws InterruptedException {
		Thread.sleep(10000);
		new BasePage().click(profilePic);
		Thread.sleep(5000);
		new BasePage().isElementPresent(editProfileButtonElement);
		Thread.sleep(5000);
		new BasePage().click(backButtonProfilePage);
		Thread.sleep(5000);
		new BasePage().isElementPresent(profilePic);
	}

	public void verifyOnClickRefreshOfKooIcon() throws InterruptedException {
		Thread.sleep(12000);
		
		click(kooIcon);

	}

	public void verifyOnClickKooIconUserNavigatedToKooScreen() throws Exception {

		waitForVisibility(trendingKooIcon);
		click(trendingKooIcon);
		waitForVisibility(TrendingHastagHeadr);
		Assert.assertTrue(isElementPresent(TrendingHastagHeadr));
		Thread.sleep(1500);
		clickAndroidDeviceBackBttn();
	}

	public void verifyOnTappingToHomeIconUserNavigatedToTopOfFeed() {
		new BasePage().click(homeExplorer);
	}

	public void verifyOnSearchButtonUserNavigateToSearchScreen() throws Exception {
		if(new BasePage().isElementPresent(searchButton))
		{
			Thread.sleep(5000);
			new BasePage().click(searchButton);

			if(new BasePage().isElementPresent(backButtonNavigation))
			{
				Thread.sleep(5000);
				new BasePage().click(backButtonNavigation);
			}
			else {
				throw new Exception("Element" + backButtonNavigation + "not found");
			}
		}
		else {
			throw new Exception("Element" + searchButton + "not found");
		}
	}

	public void verifyOnTappingOnChatButtonIsNavigatedToChatScreenPressingBackButtonNavigatesToHomeScreen() throws Exception {
		if(new BasePage().isElementPresent(chatButton))
		{
			Thread.sleep(2000);
			new BasePage().click(chatButton);

			//if(isElementPresent(messageText))
			//{
			Thread.sleep(5000);
			clickAndroidDeviceBackBttn();
		}
	}

	public void verifyOnNotificationButtonNavigatesToNotificationScreenThenBackButtonNavigatesToHomeScreen() throws Exception {
		if(new BasePage().isElementPresent(notificationButton))
		{
			Thread.sleep(5000);
			click(notificationButton);

			if(isElementPresent(messageText))
			{
				Thread.sleep(5000);
				clickAndroidDeviceBackBttn();
			}
			else {
				throw new Exception("Element" + backButtonNavigation + "not found");
			}
		}
		else {
			throw new Exception("Element" + chatButton + "not found");
		}
	}

	public void  verifyTapOnPeopleButtonNavigateUserToPeopleScreenPressingFeedNavigateToFeedScreen() throws Exception {
		
			Thread.sleep(2000);
			click(peopleTab);
			Thread.sleep(2000);
			swipeToUpsideTillElementPresent(discoverRelevantPeopleText, 5);
			click(feedTab);
	}

	public void verifyTapOnTrendingButtonNavigateToTrendingPageTapOnBackButtonNavigateToFeedScreen() throws Exception {
		waitForVisibility(trendingTab);
		click(trendingTab);

		//isElementPresent(discoverRelevantPeopleText))

		Thread.sleep(5000);
		new BasePage().click(feedTab);


	}


	public void FromAnyListUserIsNavigatedToRespectiveScreenAndOnPressingBackButtonUserShouldNavigateBackToFeed() throws Exception {
		swipeToDownsideTillElementPresent(moreLikeThis, 5);
	//	scrollToElement(moreLikeThis,"up");
		if(isElementPresent(moreLikeThis)) {
			click(moreLikeThis);
			waitForVisibility(plusKooUsingHastagButton);
			Thread.sleep(500);
			clickAndroidDeviceBackBttn();
			Thread.sleep(500);
			Assert.assertTrue(isElementPresent(moreLikeThis));
			Thread.sleep(700);
			clickAndroidDeviceBackBttn();
		}
		
		
	}


	public void verifyJustificationTextAndCommentThreadsShouldNotBeDisplayedInAnyOfTheOtherTabsExecptFeedsTab() throws InterruptedException {
		waitForVisibility(ReeKooButton);
		click(ReeKooButton);
		swipeFromBottomToUp();
		Assert.assertTrue(isElementPresent(youHaveReKooMessage));
		Thread.sleep(1500);
		waitForVisibility(commentButton);
		click(commentButton);
		Thread.sleep(1000);	
		waitForVisibility(whatsYourCommentTextBoxOnTheKooPost);
		click(whatsYourCommentTextBoxOnTheKooPost);
		waitForVisibility(whatsYourMindTextBox);
		sendKeys(whatsYourMindTextBox, "nice post"); 
		Thread.sleep(500);
		click(postButton);
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		swipeFromBottomToUp();
		Assert.assertTrue(isElementPresent(nicePostCommentText));
		waitForVisibility(trendingTab);
		click(trendingTab);
		waitForVisibility(ReeKooButton);
		click(ReeKooButton);
		swipeFromBottomToUp();
		Assert.assertTrue(!isElementPresent(youHaveReKooMessage));
		waitForVisibility(feedTab);
		click(feedTab);

	}

	public void verifyKoosShouldBeDisplayedAsPerTheTimestampsLatestKooFirstInAllOfTheHomeTabs() {

	}

	public void peopleYouCanFollowText() throws InterruptedException {

		try {
			//scrollToElement(peopleYouCanFollowText,"up");
			swipeToDownsideTillElementPresent(peopleYouCanFollowText, 10);
			//Assert.assertTrue(isElementPresent(peopleYouCanFollowText));
			//Assert.assertTrue(cardsData.size()>1);
			Thread.sleep(1000);
			Boolean peopleCarousel = peopleYouCanFollowText.getText().equalsIgnoreCase("People you can follow");
			if(!peopleCarousel)
			{
				System.out.println("Searching for carousel on People page");
				click(peopleTab);
				Thread.sleep(5000);
				swipeToDownsideTillElementPresent(peopleYouCanFollowText, 4);
				Assert.assertTrue(isElementPresent(peopleYouCanFollowText));
				peopleCarousel = peopleYouCanFollowText.getText().equalsIgnoreCase("People you can follow");
				Assert.assertTrue(peopleCarousel);
			}

		}

		catch (Exception e)
		{
			System.out.println("People carousel not found on feed screen and on People screen");
		}

	}


	public void verify_tapping_on_people_trending_latest_following_new_polls_vidoes_and_popular_for_one_day_old_users_poeple_tab_caorusel_content_should_be_displayed_and_tapping_back_user_should_land_on_feed_screen() {
		
		//Assert.assertFalse(!isElementPresent(kooHindiOfficalTitle));
		waitForVisibility(peopleTab);
		click(peopleTab);
		waitForVisibility(trendingTab);
		click(trendingTab);
		waitForVisibility(videosTab);
		click(videosTab);
		waitForVisibility(pollsTab);
		click(pollsTab);
		waitForVisibility(latestTab);
		click(latestTab);
		waitForVisibility(followingTab);
		click(followingTab);
		waitForVisibility(popularTab);
		click(popularTab);
		waitForVisibility(newTab);
		click(newTab);
		swipeFromBottomToUp();
		waitForVisibility(profilePic);
		click(profilePic);
		waitForVisibility(settingsTab);
		click(settingsTab);
		waitForVisibility(logOutButton);
		click(logOutButton);
		waitForVisibility(logOutConfirmButton);
		click(logOutConfirmButton);
		waitForVisibility(logInButton);
		click(logInButton);

	}

	public void verifyForNewAccount() {
		waitForVisibility(profilePic);
		Assert.assertTrue(isElementPresent(welcomeKooFamilyVideo));
	}



	// Verify Koo Card functionality






	//report User
	



	public void verify_report_user_option_is_shown_on_every_koo_card_except_own_koos() throws Exception {
		
		String profilename = getprofileName();
		if(!isElementPresent(dropDownButton)) {
			swipeToDownsideTillElementPresent(dropDownButton, 3);
		}
		if(KooProfileName.getText().equalsIgnoreCase("profilename")) {
			waitForVisibility(dropDownButton);
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertFalse(isElementPresent(ReportKoo));
			Assert.assertFalse(isElementPresent(reportUser));
		}
		else {
			waitForVisibility(dropDownButton);
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(isElementPresent(ReportKoo));
			Assert.assertTrue(isElementPresent(reportUser));
		}
		clickAndroidDeviceBackBttn();
	}
		


	public void verify_user_should_be_able_to_report_user_from_feed_public_profile_koo_detail_screens_and_other_all_screens_by_tap_on_in_koo_card_options() throws InterruptedException {
		
		String profilename = getprofileName();
		if(!isElementPresent(dropDownButton)) {
			swipeToDownsideTillElementPresent(dropDownButton, 3);
		}
		while(KooProfileName.getText().equalsIgnoreCase(profilename)) {
			swipeToDownsideTillElementPresent(dropDownButton, 1);
		}
		Thread.sleep(2000);
		click(KooProfileName);
		waitForVisibility(KooCardBackButton);
		waitForVisibility(dropDownButton);
		click(dropDownButton);
		waitForVisibility(dropDownMenu);
		Assert.assertTrue(isElementPresent(ReportKoo));
		Assert.assertTrue(isElementPresent(reportUser));
					
	}



	public void verify_by_tap_on_report_user_option_in_koo_card_user_should_navigate_to_report_user_screen() {
		Assert.assertTrue(isElementPresent(reportUser));
		click(reportUser);
	}


	public void verify_in_report_user_screen_all_the_reasons_should_be_listed_and_profile_username_and_user_bio_of_respective_user_should_be_displayed_below_the_header() {
		waitForVisibility(userName);
		Assert.assertTrue(isElementPresent(userName));
		Assert.assertTrue(isElementPresent(reasonForReportingUser));
	}


	public void verify_app_back_button_should_be_displayed_and_by_tap_on_app_back_button_mobile_back_button_user_should_navigate_back_to_the_respective_screen_with_koo_card() {
		//waitForVisibility(backButtonNavigation);
		//click(backButtonProfilePage);
		clickAndroidDeviceBackBttn();
		waitForVisibility(profilePic);
	}

	public void verify_the_reasons_listed_should_be_present() {
		Assert.assertTrue(reasonForReportingList.size()==9);
		waitForVisibility(cyberBullingInsultingorIntimidating);
		Assert.assertTrue(isElementPresent(cyberBullingInsultingorIntimidating));

		Assert.assertTrue(isElementPresent(spamming));
		Assert.assertTrue(isElementPresent(IntellectualPropertyInfringement));
		Assert.assertTrue(isElementPresent(SelfInjuryorSuicide));
		Assert.assertTrue(isElementPresent(ConductsIllegalActivities));
		Assert.assertTrue(isElementPresent(PretendingTobeBeMeOrSomeOneElse));
		Assert.assertTrue(isElementPresent(SomethingElse));
		Assert.assertTrue(isElementPresent(NotIntrested));
		//Assert.assertTrue(isElementPresent(shareMyOrSomeOnePrivateInformation));

	}


	public void verify_user_should_be_able_to_report_user_by_tap_on_the_listed_reasons() {
		//waitForVisibility(twoDotButton);
		//click(twoDotButton);
		//waitForVisibility(reportUser);
		//click(reportUser);
		waitForVisibility(reasonForReportingUser);
		//click(reasonForReportingUser);

	}


	public void verify_by_tap_on_any_listed_reasons_our_team_will_review_it_and_take_an_action_text_message_should_be_displayed() {
		waitForVisibility(ourTeamWillReviewText);
		Assert.assertTrue(ourTeamWillReviewText.getText().equalsIgnoreCase("Our team will review it and take an action"));
	}


	public void verify_the_reported_user_should_be_shown_in_reported_user_tab_in_dashboard() {

	}


	public void verify_on_reporting_the_user_the_particular_user_should_not_show_to_the_reported_user() {

	}


	public void verify_if_user_reports_the_same_account_again_a_toast_message_saying_you_have_already_reportes_this_user_should_be_shown() {

	}
	
	// Verify Koo Card functionality



		public String getprofileName() throws InterruptedException {
			new ProfilePage().iNavigateToProfileScreen();
			Thread.sleep(2000);
			String profilename= profileName.getText();
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);
			return profilename;
			
		}


		public void verifyProfilePicNameHandelProfessionTimeOfKooCreated() throws Exception {
			Thread.sleep(5000);
			String profilename = getprofileName();
			if(!isElementPresent(KooLabelLayout1)) {
				swipeToDownsideTillElementPresent(KooLabelLayout1, 5);
			}
			
			//scrollToElement(KooLabelLayout1, "up");
			Assert.assertTrue(isElementPresent(KooLabelLayout1));
			Assert.assertTrue(isElementPresent(KooProfilePic));
			Assert.assertTrue(isElementPresent(KooProfileName));
			Assert.assertTrue(isElementPresent(KooTime));
			Assert.assertTrue(isElementPresent(KooHandelName));
			Assert.assertTrue(isElementPresent(dropDownButton));
			
			while(KooProfileName.getText().equalsIgnoreCase(profilename)) {
				swipeToDownsideTillElementPresent(KooLabelLayout1, 1);
				if(!isElementPresent(KooProfileName)) {
					swipeToDownsideTillElementPresent(KooProfileName, 1);
				}
			}
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(isElementPresent(dropDownMenu));
			Assert.assertTrue(isElementPresent(Share));
			Assert.assertTrue(isElementPresent(shareIcon));
			Assert.assertTrue(isElementPresent(FollowingUnfollow));
			Assert.assertTrue(isElementPresent(followingIcon));
			Assert.assertTrue(isElementPresent(ReportKoo));
			Assert.assertTrue(isElementPresent(reportKooIcon));
			Assert.assertTrue(isElementPresent(Block));
			Assert.assertTrue(isElementPresent(blockIcon));
			Assert.assertTrue(isElementPresent(ReportUser));
			Assert.assertTrue(isElementPresent(reportUserIcon));
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);

		}

		public void VerifyKooContentOnKooCard() throws InterruptedException {
			//swipeToSeeUpsideElementsOfScreen(1);
			Assert.assertTrue(isElementPresent(KooCardContent));

		}

		public void VerifyCommentLikeRekooShareButtonOnKooContent() throws Exception {
			Thread.sleep(2000);
			if(!isElementPresent(KooCardLikeButton)) {
				swipeToDownsideTillElementPresent(KooCardLikeButton, 4);
			}
			//swipeToSeeDownsideElementsOfScreen(1);
			waitForVisibility(KooCardLikeButton);
			Assert.assertTrue(isElementPresent(KooCardLikeButton));
			Assert.assertTrue(isElementPresent(KooCardCommentButton));
			Assert.assertTrue(isElementPresent(KooCardReeKooButton));
			try {
				if(isElementPresent(KooCardWhatsaapShareButton)) {
					Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
				}
				else {
					if (whatsAppShareButtonList.size() >= 1) {
						Assert.assertTrue(whatsAppShareButtonList.size() >= 1);
					} else {
						int i = 0;
						while (i < 5) {
							swipeToDownsideTillElementPresent(KooCardWhatsaapShareButton, 1);
							if (whatsAppShareButtonList.size() >= 1) {
								break;
							}
							i++;
						}
					}
				}
			}
			catch (Exception e)
			{
				System.out.println("WhatsApp button is not seen");
			}

			//Assert.assertTrue(isElementPresent(KooCardShareButton));

			try {
				if(isElementPresent(KooCardShareButton)) {
					Assert.assertTrue(isElementPresent(KooCardShareButton));
				}
				else {
						int i = 0;
						while (i < 5) {
							swipeToDownsideTillElementPresent(KooCardShareButton, 1);
							if (KooCardShareButton.isDisplayed()) {
								break;
							}
							i++;
						}
					}
			}
			catch (Exception e)
			{
				System.out.println("WhatsApp button is not seen");
			}

			if(!isElementPresent(commentBOC)) {
				swipeToDownsideTillElementPresent(commentBOC, 5);
			}
			if(isElementPresent(commentBOC)) {
				Assert.assertTrue(isElementPresent(commentBOC));
				Assert.assertTrue(commentBOCText.getText().contains("Write Your Comment..."));
			}
			



		}

		public void VerifyTappingProfileNameHandelNavigateToProfileDeail() throws InterruptedException {
			if(!isElementPresent(KooProfilePic)) {
				swipeToUpsideTillElementPresent(KooProfilePic, 3);
			}
			waitForVisibility(KooProfileName);
			click(KooProfileName);
			Thread.sleep(2000);
			waitForVisibility(KooCardBackButton);
			Assert.assertTrue(isElementPresent(KooCardBackButton));
			Assert.assertTrue(isElementPresent(KooCardTitleName));
			Assert.assertTrue(isElementPresent(KooProfileDetail));
			Assert.assertTrue(isElementPresent(KooProfilepicDetail));
			click(KooCardBackButton);
			//waitForVisibility(KooProfileName);
			Thread.sleep(2000);
			click(KooProfileName);
			waitForVisibility(KooCardBackButton);
			Assert.assertTrue(isElementPresent(KooCardBackButton));
			Assert.assertTrue(isElementPresent(KooCardTitleName));
			Assert.assertTrue(isElementPresent(KooProfileDetail));
			Assert.assertTrue(isElementPresent(KooProfilepicDetail));
			click(KooCardBackButton);
			//waitForVisibility(KooHandelName);
			Thread.sleep(2000);
			click(KooHandelName);
			waitForVisibility(KooCardBackButton);
			Assert.assertTrue(isElementPresent(KooCardBackButton));
			Assert.assertTrue(isElementPresent(KooCardTitleName));
			Assert.assertTrue(isElementPresent(KooProfileDetail));
			Assert.assertTrue(isElementPresent(KooProfilepicDetail));
			click(KooCardBackButton);

		}

		public void VerifyTappingPlayButtonOnKooCardToStart() throws Exception {
			Thread.sleep(6000);
			swipeToSeeUpsideElementsOfScreen(1);
			while(!isElementPresent(Playerbutton)) {
				swipeToDownsideTillElementPresent(Playerbutton, 1);
			}
				click(Playerbutton);
				waitForVisibility(Playersection);
				
		}


		public void verifyForNonFollowedUseFollowButtonDisplay() throws InterruptedException {
			waitForVisibility(Customizeoption);
			Assert.assertTrue(isElementPresent(Customizeoption));
			Assert.assertTrue(isElementPresent(Shareoption));
			Assert.assertTrue(isElementPresent(Followoption));
			click(Followoption);
			waitForVisibility(UnfollowPopup);
			Assert.assertTrue(isElementPresent(UnfollowPopup));
			click(UnfollowButton);
			waitForVisibility(ReportKoooption);
			Assert.assertTrue(isElementPresent(ReportKoooption));
			Assert.assertTrue(isElementPresent(ReportUseroption));
			Assert.assertTrue(isElementPresent(Blockoption));
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);



		}

		public void VerifytappingImageToOpenFullScreen() throws InterruptedException {
			Thread.sleep(2000);
			swipeToSeeUpsideElementsOfScreen(1);
			Thread.sleep(2000);;
			click(KooProfilePic);
			Thread.sleep(2000);
			waitForVisibility(Profiledetail);
			Assert.assertTrue(isElementPresent(Profiledetail));
			Assert.assertTrue(isElementPresent(Profilepic));
			click(Profilepic);
			waitForVisibility(ProfileBackButton);
			Assert.assertTrue(isElementPresent(ProfileBackButton));
			click(ProfileBackButton);
			waitForVisibility(KooCardBackButton);
			Assert.assertTrue(isElementPresent(KooCardBackButton));
			Assert.assertTrue(isElementPresent(KooCardTitleName));
			Assert.assertTrue(isElementPresent(KooProfileDetail));
			Assert.assertTrue(isElementPresent(KooProfilepicDetail));
			click(KooCardBackButton);
			Thread.sleep(2000);

		}

		public void VerifytappingNewsLinkAndNavugateToParticularLink() throws Exception {
			Thread.sleep(3000);
			clickAndroidDeviceBackBttn();
			Thread.sleep(3000);
			if(!isElementPresent(NewsLink)) {
				swipeToDownsideTillElementPresent(NewsLink, 20);
			}
			
			if(isElementPresent(NewsLink)) {
				Assert.assertTrue(isElementPresent(NewsLink));
				click(NewsLink);
				Thread.sleep(5000);
				if(isElementPresent(UrlBar)) {
					waitForVisibility(UrlBar);
					
					Assert.assertTrue(isElementPresent(UrlBar));
					Assert.assertTrue(isElementPresent(ChromeCloseButton));
					click(ChromeCloseButton);
					waitForVisibility(NewsLink);
				}
				
			}
			
		
			
		
		}	
		public void VerifyRekooIconFunctionality() throws Exception {
			Thread.sleep(2000);
			swipeToSeeUpsideElementsOfScreen(1);
			Thread.sleep(2000);
			waitForVisibility(KooCardContent);
			Thread.sleep(2000);
			click(KooCardContent);
			Thread.sleep(2000);
			scrollToElement(ReekooImages, "up");
			waitForVisibility(ReekooImages);
			Assert.assertTrue(isElementPresent(ReekooImages));
			Assert.assertTrue(isElementPresent(ReeKooCards));
			swipeToSeeDownsideElementsOfScreen(3);
			swipeToSeeUpsideElementsOfScreen(3);

		}

		public void VerifyCommentsPresent() throws Exception {
			Thread.sleep(2000);
			swipeToDownsideTillElementPresent(KooCardsComments, 5);
			//scrollToElement(KooCardsComments, "up");
			Thread.sleep(2000);
			waitForVisibility(KooCardsComments);
			Assert.assertTrue(isElementPresent(KooCardsComments));
//			Thread.sleep(2000);
//			swipeToSeeDownsideElementsOfScreen(1);
//			swipeToSeeDownsideElementsOfScreen(1);
//			swipeToSeeUpsideElementsOfScreen(2);
//			waitForVisibility(KooCardsComments);
//			Assert.assertTrue(isElementPresent(KooCardsComments));
//			Thread.sleep(2000);
			swipeToSeeUpsideElementsOfScreen(2);

		}

		public void VerifyHashtagPresentandNavigateToParticularHashtag() throws InterruptedException {
			waitForVisibility(KooCardsHashtagView);
			Assert.assertTrue(isElementPresent(KooCardsHashtagView));
			click(KooCardsHashtagView);

		}

		public void VerifybackButtonandContinue() throws InterruptedException {
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);
			waitForVisibility(KooLabelLayout1);
			Assert.assertTrue(isElementPresent(KooLabelLayout1));
			Thread.sleep(2000);

		}

		public void VerifybyTappingoncommentAndThenOnCommentField() throws Exception {
			Thread.sleep(2000);
			VerifyCommentLikeRekooShareButtonOnKooContent();
			Thread.sleep(2000);
			swipeToDownsideTillElementPresent(KooCardCommentButton, 5);
			//swipeToSeeDownsideElementsOfScreen(1);
			//Thread.sleep(2000);
			waitForVisibility(KooCardCommentButton);
			click(KooCardCommentButton);
			Thread.sleep(1000);
			waitForVisibility(CommentField);
			Assert.assertTrue(isElementPresent(CommentField));
			click(CommentField);
			Thread.sleep(2000);
			Assert.assertTrue(isKeyPadShown());
			Thread.sleep(1000);
			Assert.assertTrue(isElementPresent(replyInfo));
			Assert.assertTrue(isElementPresent(replytoPicture));
			Assert.assertTrue(isElementPresent(ReplyToText));
			Assert.assertTrue(isElementPresent(replyField));
			clickAndroidDeviceBackBttn();
			Assert.assertFalse(!isKeyPadShown());
			clickAndroidDeviceBackBttn();
			Thread.sleep(3000);


		}

		public void VerifybyTappingoncommentAndThennavigateBackToFeed() throws Exception {
			swipeToDownsideTillElementPresent(KooCardCommentField, 5);
			//scrollToElement(KooCardCommentField, "up");
			waitForVisibility(KooCardCommentField);
			click(KooCardCommentField);
			waitForVisibility(writeCommentField);
			Assert.assertTrue(isElementPresent(writeCommentField));
			click(backButton);
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			swipeToUpsideTillElementPresent(kooIcon, 10);
			waitForVisibility(profilePic);
			Assert.assertTrue(isElementPresent(profilePic));
			Thread.sleep(2000);
		}

		public void VerifybyTappingonReeKooButton() throws Exception {
			swipeToDownsideTillElementPresent(ReeKooButton, 5);
			//scrollToElement(ReeKooButton, "up");
			waitForVisibility(ReeKooButton);
			Assert.assertTrue(isElementPresent(ReeKooButton));
			click(ReeKooButton);
			Thread.sleep(3000);
			/*waitForVisibility(ReeKooWithOutComment);
			Assert.assertTrue(isElementPresent(ReeKooWithOutComment));
			Assert.assertTrue(isElementPresent(ReeKooWithComment));
			Assert.assertTrue(isElementPresent(ReeKooWithOutCommenttext));
			Assert.assertTrue(isElementPresent(ReeKooWithCommenttext));*/
			permissionHandler.dismissRekooCommentPopUp();
			Thread.sleep(2000);
			//clickAndroidDeviceBackBttn();
			clickAndroidDeviceBackBttn();
			swipeToUpsideTillElementPresent(profilePic, 2);
			waitForVisibility(profilePic);
			Assert.assertTrue(isElementPresent(profilePic));
		}
		
		public void VerifybyTappingonReeKoowithcommentButton() throws Exception {
			Thread.sleep(2000);
			//VerifyCommentLikeRekooShareButtonOnKooContent();
			swipeToDownsideTillElementPresent(KooCardReeKooButton, 3);
			waitForVisibility(KooCardReeKooButton);
			click(KooCardReeKooButton);
			waitForVisibility(ReeKooWithOutComment);
			Assert.assertTrue(isElementPresent(ReeKooWithOutComment));
			Assert.assertTrue(isElementPresent(ReeKooWithComment));
			Assert.assertTrue(isElementPresent(ReeKooWithOutCommenttext));
			Assert.assertTrue(isElementPresent(ReeKooWithCommenttext));
			click(ReeKooWithCommenttext);
			Thread.sleep(2000);
			Assert.assertTrue(isKeyPadShown());
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);
			Assert.assertFalse(!isKeyPadShown());
			waitForVisibility(ReeKooWithCommentScreen);
			Assert.assertTrue(isElementPresent(ReeKooWithCommentScreen));
			Assert.assertTrue(isElementPresent(ReeKooWithCommentScreenBackButton));
			click(ReeKooWithCommentScreenBackButton);
			swipeToUpsideTillElementPresent(profilePic, 2);
			waitForVisibility(profilePic);
			Assert.assertTrue(isElementPresent(profilePic));
		}

		public void VerifybyTappingonWhatsAppShareButton() throws Exception {
			Thread.sleep(2000);
			swipeToDownsideTillElementPresent(ReeKooCount, 5);
		//	scrollToElement(ReeKooCount, "up");
			//swipeToSeeDownsideElementsOfScreen(1);
			Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
			click(KooCardWhatsaapShareButton);
			Thread.sleep(2000);
			if(isElementPresent(SharinglistContainer)) {
				Assert.assertTrue(isElementPresent(SharinglistContainer));
				Assert.assertTrue(isElementPresent(SharingListTitle));
				Assert.assertTrue(isElementPresent(SharingList));
			}
			//Devices where whatsapp is not available should open the android application container
			else if(isElementPresent(SharingListContainerSamsung))
			{
				Thread.sleep(2000);
				Assert.assertTrue(SharinglistElementsSamsung.size()>2);
			}
			else {
				Assert.assertTrue(isElementPresent(WhatsAppShareToolbar));
			}
			Thread.sleep(3000);
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);

		}

		public void VerifybyTappingonReeKooButtonGetIncreasedByOne() throws Exception {
			//swipeToSeeUpsideElementsOfScreen(3);
			swipeToDownsideTillElementPresent(ReeKooButton, 10);
			//scrollToElement(ReeKooButton, "up");
			Thread.sleep(2000);
			waitForVisibility(ReeKooButton);
			Assert.assertTrue(isElementPresent(ReeKooButton));
			Thread.sleep(2000);
			int likecountBefore;
			if(ReeKooCount.getText().equals("")) {
				likecountBefore=0;
			}else {
				likecountBefore = Integer.parseInt(ReeKooCount.getText());
			}
			
			scrollToElement(ReeKooButton, "up");
			click(ReeKooCount);
			waitForVisibility(ReeKooWithOutComment);
			Thread.sleep(3000);
			Assert.assertTrue(isElementPresent(ReeKooWithOutComment));
			Assert.assertTrue(isElementPresent(ReeKooWithComment));
			Assert.assertTrue(isElementPresent(ReeKooWithOutCommenttext));
			Assert.assertTrue(isElementPresent(ReeKooWithCommenttext));
			click(ReeKooWithOutCommenttext);
			Thread.sleep(7000);
			int likecountAfter = Integer.parseInt(ReeKooCount.getText());
			Assert.assertTrue(likecountAfter==likecountBefore+1);
			Thread.sleep(7000);
			int likecountBefore1;
			if(ReeKooCount.getText().equals("")) {
				likecountBefore1=0;
			}else {
				likecountBefore1 = Integer.parseInt(ReeKooCount.getText());
			}
			ReeKooCount.click();
			waitForVisibility(UndoKooButton);
			Assert.assertTrue(isElementPresent(UndoKooButton));
			UndoKooButton.click();
		}

		public void VerifybyTappingonlikeButtonGetIncreasedByOne() throws InterruptedException {
			waitForVisibility(KooCardLikeButton);
			Assert.assertTrue(isElementPresent(KooCardLikeButton));
			int likecountBefore, likecountAfter;
			if(likeAmountText.getText().equals("")) {
				likecountBefore=0;
			}else {
				likecountBefore = Integer.parseInt(likeAmountText.getText());
			}
			
			click(likeButton);
			Thread.sleep(2000);
			if(likeAmountText.getText().equals("")) {
				likecountAfter=0;
			}else {
				likecountAfter = Integer.parseInt(likeAmountText.getText());
			}
			
			Thread.sleep(6000);
			Assert.assertTrue(likecountAfter==likecountBefore+1);
			Thread.sleep(2000);
			int likecountBefore1 = Integer.parseInt(likeAmountText.getText());
			Thread.sleep(2000);
			click(likeButton);
			int likecountAfter1 = Integer.parseInt(likeAmountText.getText());
			Thread.sleep(6000);
			Assert.assertTrue(likecountAfter1==likecountBefore1-1);
			Thread.sleep(2000);

		}

		public void VerifybyPostingCommentAndKooCommentIncrease() throws Exception {
			if(!isElementPresent(CommentButton)) {
				swipeToDownsideTillElementPresent(CommentCount, 3);
			}
			Thread.sleep(2000);
			Assert.assertTrue(isElementPresent(CommentButton));
			click(CommentButton);
			Thread.sleep(2000);
			//swipeToDownsideTillElementPresent(CommentCount, 2);
			int commentcountBefore;
			if(CommentCount.getText().equals("")) {
				commentcountBefore=0;
			}else {
				commentcountBefore = Integer.parseInt(CommentCount.getText());
			}
			//Assert.assertTrue(isElementPresent(ReeKooCards));
			Assert.assertTrue(isElementPresent(commentBOCText));
			click(commentBOCText);
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			waitForVisibility(replyField);
			Assert.assertTrue(isElementPresent(replyField));
			//click(replyField);
			Assert.assertTrue(isElementPresent(PostButtonBefore));
			EditRepyField.sendKeys("Nice");
			Assert.assertTrue(isElementPresent(PostButtonAfter));
			click(PostButton);
			Thread.sleep(1000);
		//	waitForVisibility(ReeKooCards);
			//Assert.assertTrue(isElementPresent(ReeKooCards));
		//	swipeToDownsideTillElementPresent(CommentCount, 5);
			//swipeToSeeUpsideElementsOfScreen(2);
			//scrollToElement(CommentCount, "up");
			Thread.sleep(2000);
			int commentCountAfter = Integer.parseInt(CommentCount.getText());
			Assert.assertTrue(commentCountAfter==commentcountBefore+1);
			Thread.sleep(2000);

		}

		public void VerifybyPostingCommentAfterPostingComment() throws InterruptedException {
			waitForVisibility(CommentDisplayAfterPosting);
			Assert.assertTrue(isElementPresent(CommentDisplayAfterPosting));
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);
		}

		public void VerifybyTappingThreadsAndNavigateToKooDetailedComments() throws Exception {
			swipeToDownsideTillElementPresent(ThreadsButton, 2);
			if (isElementPresent(ThreadsButton))
			{
				Thread.sleep(2000);
				click(ThreadsButton);
				Thread.sleep(2000);
				swipeToSeeDownsideElementsOfScreen(2);
				swipeToSeeUpsideElementsOfScreen(2);
				Thread.sleep(2000);
				clickAndroidDeviceBackBttn();
			}
			else
			{			

				swipeToSeeUpsideElementsOfScreen(2);
				Thread.sleep(2000);
			}
		}

		public void VerifybyTappingCommentFieldsOfFeeds() throws InterruptedException {
			if(!isElementPresent(commentBOCText)) {
				swipeToDownsideTillElementPresent(commentBOCText, 3);
			}
			Assert.assertTrue(isElementPresent(commentBOCText));
			click(commentBOCText);
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);
			swipeToSeeDownsideElementsOfScreen(1);
			waitForVisibility(replyField);
			Assert.assertTrue(isElementPresent(replyField));
			Assert.assertTrue(isElementPresent(PostButtonBefore));
			EditRepyField.sendKeys("Nice");
			clear(EditRepyField);
			waitForVisibility(PostButtonAfter);
			Assert.assertTrue(isElementPresent(PostButtonAfter));
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);



		}


		public void VerifyAfterPostingNewKooFaceBookButtonAppear() throws InterruptedException {
			waitForVisibility(NewKooPostButton);
			Assert.assertTrue(isElementPresent(NewKooPostButton));
			click(NewKooPostButton);
			Thread.sleep(2000);
			Assert.assertTrue(isKeyPadShown());
			clickAndroidDeviceBackBttn();
			waitForVisibility(CreateNewKooField);
			Assert.assertTrue(isElementPresent(CreateNewKooField));
			CreateNewKooField.sendKeys("whats a wounderful day");
			click(PostButton);
			waitForVisibility(FacebookButton);
			Assert.assertTrue(isElementPresent(FacebookButton));

		}

		public void VerifyFacebookButtonFunctionality() throws InterruptedException {
//			click(FacebookButton);
//			Thread.sleep(15000);
//			Thread.sleep(5000);
//			//waitForVisibility(FacebookPopUp);
//			//Assert.assertTrue(isElementPresent(FacebookPopUp));
//			Thread.sleep(2000);
//			clickAndroidDeviceBackBttn();
//			waitForVisibility(CreatedKooVerification);
//			Assert.assertTrue(isElementPresent(CreatedKooVerification));
//			Thread.sleep(2000);
			waitForVisibility(dropDownButton);
			Assert.assertTrue(isElementPresent(dropDownButton));
			click(dropDownButton);
			waitForVisibility(deleteButton);
			click(deleteButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);


		}
		
		public void VerifypollsUndePollTag() throws InterruptedException {
			Thread.sleep(2000);
			click(VideosTag);
			Thread.sleep(1000);
			Assert.assertTrue(isElementPresent(PollsTag));
			click(PollsTag);
			Thread.sleep(2000);
			swipeToSeeDownsideElementsOfScreen(2);
			swipeToSeeUpsideElementsOfScreen(2);
			waitForVisibility(poll1);
			Assert.assertTrue(isElementPresent(poll1));
			Assert.assertTrue(isElementPresent(PollOptions));
			Assert.assertTrue(isElementPresent(TotalVotes));
			Assert.assertTrue(isElementPresent(DeadlinePoll));
			Assert.assertTrue(isElementPresent(KooCardLikeButton));
			Assert.assertTrue(isElementPresent(KooCardCommentButton));
			Assert.assertTrue(isElementPresent(KooCardReeKooButton));
			Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
			Assert.assertTrue(isElementPresent(KooCardShareButton));
			Assert.assertTrue(isElementPresent(CommentFieldOfFeeds));
			Assert.assertTrue(isElementPresent(TotalVotes));
			Assert.assertTrue(isElementPresent(DeadlinePoll));
			Thread.sleep(2000);


		}

		public void VerifyPollTagCreationAndVerifyAtFeeds() throws InterruptedException {
			waitForVisibility(pollcreation);
			Assert.assertTrue(isElementPresent(pollcreation));
			Assert.assertTrue(isElementPresent(AddPollButton));
			click(AddPollButton);
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			waitForVisibility(CreatePollPage);
			Assert.assertTrue(isElementPresent(CreatePollPage));
			Assert.assertTrue(isElementPresent(CreatePollField));
			Assert.assertTrue(isElementPresent(CreatePollSpeech));
			Assert.assertTrue(isElementPresent(CreatePollMic));
			Assert.assertTrue(isElementPresent(CreatePollVideo));
			Assert.assertTrue(isElementPresent(CreatePollSmiles));
			Assert.assertTrue(isElementPresent(CreatePollLink));
			Assert.assertTrue(isElementPresent(CreatePollYouTubeLink));
			Assert.assertTrue(isElementPresent(CreatePollAddImage));
			Assert.assertTrue(isElementPresent(CreatePollicon));
			Assert.assertTrue(isElementPresent(CreatePollSettingIcon));
			Assert.assertTrue(isElementPresent(CreatePollCharacterCount));
			click(CreatePollicon);
			waitForVisibility(CreatePollOptionsLayout);
			Assert.assertTrue(isElementPresent(CreatePollOptionsLayout));
			Assert.assertTrue(isElementPresent(CreatePollOptions1));
			Assert.assertTrue(isElementPresent(CreatePollOptions2));
			Assert.assertTrue(isElementPresent(CreatePollOptionsClose));
			Assert.assertTrue(isElementPresent(AddCreatePollOptions));
			Assert.assertTrue(isElementPresent(CreatedPollDuration));
			click(CreatedPollDuration);
			waitForVisibility(CreatedPollDurationTiming);
			Assert.assertTrue(isElementPresent(CreatedPollDurationTiming));
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);
			click(AddCreatePollOptions);
			waitForVisibility(CreatePollOptions3);
			Assert.assertTrue(isElementPresent(CreatePollOptions3));
			Assert.assertTrue(isElementPresent(RemoveCreatePollOption));
			click(RemoveCreatePollOption);
			Thread.sleep(2000);
			click(CreatePollOptionsClose);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			Thread.sleep(2000);
			click(CreatePollicon);
			waitForVisibility(CreatePollField);
			CreatePollField.sendKeys("how is your day going");
			clickAndroidDeviceBackBttn();
			waitForVisibility(CreatePollOptions1);
			CreatePollOptions1.sendKeys("Good");
			CreatePollOptions2.sendKeys("bad");
			click(PollPostButton);
			waitForVisibility(KooLabelLayout1);
			Assert.assertTrue(isElementPresent(KooLabelLayout1));
			Assert.assertTrue(isElementPresent(poll1));
			Assert.assertTrue(isElementPresent(PollOptions));
			Assert.assertTrue(isElementPresent(DeadlinePoll));
			Assert.assertTrue(isElementPresent(PollPercentage));
			Thread.sleep(2000);

		}

		public void VerifyUserIsAbleToSeeBelowIconsBelowPolls() throws InterruptedException {
			waitForVisibility(KooCardLikeButton);
			Thread.sleep(1000);
			Assert.assertTrue(isElementPresent(KooCardLikeButton));
			//Assert.assertTrue(isElementPresent(KooCardCommentButton));
			Assert.assertTrue(isElementPresent(KooCardReeKooButton));
			Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
			Assert.assertTrue(isElementPresent(KooCardShareButton));

		}

		public void VerifyTappingOnDifferentPartsOfCreatedPoll() throws InterruptedException {
			Thread.sleep(2000);
			swipeToSeeUpsideElementsOfScreen(1);
			waitForVisibility(poll1);
			click(poll1);
			Thread.sleep(2000);
			waitForVisibility(PollDetails);
			Assert.assertTrue(isElementPresent(PollDetails));
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			waitForVisibility(DeadlinePoll);
			click(DeadlinePoll);
			waitForVisibility(PollDetails);
			Assert.assertTrue(isElementPresent(PollDetails));
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			waitForVisibility(PollPercentage);
			click(PollPercentage);
			waitForVisibility(PollDetails);
			Assert.assertTrue(isElementPresent(PollDetails));
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();

		}

		public void VerifyUserShouldAbelVoteOnlyOnceForEachPoll()  throws InterruptedException {
			click(VideosTag);
			waitForVisibility(PollsTag);
			Assert.assertTrue(isElementPresent(PollsTag));
			click(PollsTag);
			waitForVisibility(poll1);
			swipeToSeeUpsideElementsOfScreen(2);
			Thread.sleep(2000);
			Assert.assertTrue(isElementPresent(poll1));
			Assert.assertTrue(isElementPresent(PollOptions));
			
			clickAndroidDeviceBackBttn();
		}

		public void VerifyByDeletingTheGeneratedPoll() throws InterruptedException {
			waitForVisibility(dropDownButton);
			Assert.assertTrue(isElementPresent(dropDownButton));
			click(dropDownButton);
			waitForVisibility(deleteButton);
			click(deleteButton);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
		}

		public void VerifyByCreatingKooUSingHashTagInIt() throws Exception {
			waitForVisibility(NewKooPostButton);
			Assert.assertTrue(isElementPresent(NewKooPostButton));
			click(NewKooPostButton);
			Thread.sleep(2000);
			clickAndroidDeviceBackBttn();
			waitForVisibility(CreateNewKooField);
			Assert.assertTrue(isElementPresent(CreateNewKooField));
			CreateNewKooField.sendKeys("#education is impt");
			click(PostButton);
			Thread.sleep(2000);
			waitForVisibility(NewKooPostButton);
			Thread.sleep(2000);
			swipeToSeeUpsideElementsOfScreen(5);
			waitForVisibility(moreLikeThisButton);
			Assert.assertTrue(isElementPresent(moreLikeThisButton));
			Assert.assertTrue(isElementPresent(recomendationImages));
				
		}
		
		public void VerifyTappingOnMoreLikeThisButtonUsersShouldLandToThatParticularHashtagScreen() throws InterruptedException {
			waitForVisibility(moreLikeThisButton);
			click(moreLikeThisButton);
			waitForVisibility(hashtagScreen);
			Assert.assertTrue(isElementPresent(hashtagScreen));
			Assert.assertTrue(hashtagScreen.getText().contains("#"));
			swipeToSeeDownsideElementsOfScreen(1);
			swipeToSeeUpsideElementsOfScreen(1);
			waitForVisibility(KooContentBackButton);
			click(KooContentBackButton);
		//	waitForVisibility(KooCardContent);
			//Assert.assertTrue(KooCardContent.getText().contains("#education is impt"));
		//	VerifyByDeletingTheGeneratedPoll();

		}
		
		public void VerifyOnTappingShareIconShareSheetShouldOpenOptionsPopupWithAvailableAppOnTheUserDevice() throws InterruptedException {
			swipeToSeeUpsideElementsOfScreen(2);
			waitForVisibility(KooCardShareButton);
			Assert.assertTrue(isElementPresent(KooCardShareButton));
			click(KooCardShareButton);
			Thread.sleep(2000);
//			waitForVisibility(shareingAppsList);
//			Assert.assertTrue(isElementPresent(shareingAppsList));
//			Assert.assertTrue(isElementPresent(shareKooTitle));
			clickAndroidDeviceBackBttn();
			
		}
		
		public void VerifyForFollowedUserKooDropdownUnfollowOptionShouldDisplay() throws Exception {
			waitForVisibility(dropDownButton);
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(isElementPresent(dropDownMenu));
			Assert.assertTrue(isElementPresent(FollowingUnfollow));
			Assert.assertTrue(isElementPresent(followingIcon));
			click(FollowingUnfollow);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			click(YesConfirmationButton);
			waitForVisibility(followButton);
			Assert.assertTrue(isElementPresent(followButton));
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(FollowingUnfollow.getText().contentEquals("Follow"));
			click(FollowingUnfollow);
//			Thread.sleep(2000);
//			swipeToSeeUpsideElementsOfScreen(2);
//			Thread.sleep(2000);
			waitForVisibility(dropDownButton);
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(FollowingUnfollow.getText().contentEquals("Following"));
			clickAndroidDeviceBackBttn();
			
		}
		
		public void VerifyOnTappingReportKooKooReportScreenWithReportKooOptionsShouldOpen() throws InterruptedException {
			waitForVisibility(dropDownButton);
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(isElementPresent(ReportKoo));
			Assert.assertTrue(isElementPresent(reportKooIcon));
			click(ReportKoo);
			waitForVisibility(reportKooPage);
			Assert.assertTrue(isElementPresent(reportKooPage));
			Assert.assertTrue(isElementPresent(reportKooPagetext));
			Assert.assertTrue(isElementPresent(reportKooOptions));
			Assert.assertTrue(isElementPresent(reportKooPageBackButton));
			swipeToSeeDownsideElementsOfScreen(1);
			swipeToSeeUpsideElementsOfScreen(1);
			click(reportKooPageBackButton);
			waitForVisibility(dropDownButton);
			
		}
		
		public void VerifyOnTappingBlockOptionBlockPopUpShouldAppear() throws InterruptedException {
			waitForVisibility(dropDownButton);
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(isElementPresent(Block));
			Assert.assertTrue(isElementPresent(blockIcon));
			click(Block);
			waitForVisibility(ConfirmationMessage);
			Assert.assertTrue(isElementPresent(ConfirmationMessage));
			Assert.assertTrue(isElementPresent(YesConfirmationButton));
			Assert.assertTrue(isElementPresent(NoConfirmationButton));
			click(NoConfirmationButton);
			waitForVisibility(dropDownButton);
			
		}
		
		public void VerifyOnTappingReportUser() throws InterruptedException {
			waitForVisibility(dropDownButton);
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(isElementPresent(ReportUser));
			Assert.assertTrue(isElementPresent(reportUserIcon));
			click(ReportUser);
			waitForVisibility(reportKooPage);
			Assert.assertTrue(isElementPresent(reportKooPage));
			Assert.assertTrue(isElementPresent(reportUserPagetext));
			Assert.assertTrue(isElementPresent(reportKooOptions));
			Assert.assertTrue(isElementPresent(reportKooPageBackButton));
			click(reportKooPageBackButton);
			waitForVisibility(dropDownButton);
			
		}
		
		
		



		///
		public void verifyEndListFollowPeopleCardPresentNavigatesToPeopleScreen() throws InterruptedException {
			swipeToUpsideTillElementPresent(whatsYourMindTextBox, 10);
			swipeToDownsideTillElementPresent(followPeople, 10);
			
		}

		public void verifyOnTappingOnCardNavigatesToProfile() throws InterruptedException {
			if(isElementPresent(cardClick)) {
				click(cardClick);
				Thread.sleep(1000);
				new BasePage().click(backButtonProfilePage);
			}
			
		}
		
		//reported koo

		public void VerifyReportKooOptionIsShownOnEveryKooCardExceptOwnKoos() throws Exception {
			String profilename = getprofileName();
			if(!isElementPresent(dropDownButton)) {
				swipeToDownsideTillElementPresent(dropDownButton, 3);
			}
			if(KooProfileName.getText().equalsIgnoreCase(profilename)) {
				waitForVisibility(dropDownButton);
				click(dropDownButton);
				waitForVisibility(dropDownMenu);
				Assert.assertFalse(isElementPresent(ReportKoo));
			}
			else {
				waitForVisibility(dropDownButton);
				click(dropDownButton);
				waitForVisibility(dropDownMenu);
				Assert.assertTrue(isElementPresent(ReportKoo));
			}
			clickAndroidDeviceBackBttn();
		}

		public void VerifyUserShouldBeAbleToReportKooFromVariousPages() throws InterruptedException {
			String profilename = getprofileName();
			if(!isElementPresent(dropDownButton)) {
				swipeToDownsideTillElementPresent(dropDownButton, 3);
			}
			while(KooProfileName.getText().equalsIgnoreCase(profilename)) {
				swipeToDownsideTillElementPresent(dropDownButton, 1);
			}
			Thread.sleep(2000);
			click(KooProfileName);
			waitForVisibility(KooCardBackButton);
			waitForVisibility(dropDownButton);
			click(dropDownButton);
			waitForVisibility(dropDownMenu);
			Assert.assertTrue(isElementPresent(ReportKoo));
			
		}

		public void VerifyTheReasonslistedUnderReportKooMenu() throws Exception {
				Assert.assertTrue(isElementPresent(reportKooIcon));
				click(ReportKoo);
				waitForVisibility(reportKooPage);
				Assert.assertTrue(isElementPresent(reportKooPage));
				Assert.assertTrue(isElementPresent(reportKooPagetext));
				Assert.assertTrue(isElementPresent(reportKooOptions));
				Assert.assertTrue(isElementPresent(reportKooPageBackButton));
				Assert.assertTrue(isElementPresent(report1));
				Assert.assertTrue(isElementPresent(report2));
				Assert.assertTrue(isElementPresent(report3));
				Assert.assertTrue(isElementPresent(report4));
				Assert.assertTrue(isElementPresent(report5));
				Assert.assertTrue(isElementPresent(report6));
				Assert.assertTrue(isElementPresent(report7));
				Assert.assertTrue(isElementPresent(report8));
				Assert.assertTrue(isElementPresent(report9));
				Assert.assertTrue(isElementPresent(report10));
			
			
			
		}

		public void VerifyUserShouldBeAbleToReportKooByTapOnTheListedReasons() throws Exception {
			swipeToSeeUpsideElementsOfScreen(1);
			click(report1);
			try {
				if(isElementPresent(alreadryReportedText)) {
					Assert.assertTrue(isElementPresent(alreadryReportedText));
					Assert.assertTrue(alreadryReportedText.getText().equalsIgnoreCase("Our team will review it and take an action"));
				}else {
					throw new Exception("The Koo is Already Reported");
				}
			}catch (Exception e) {
				e.getStackTrace();
			}}	
			


	//out of network

	public void verifyOONShouldShowAccordingToTimeOfReactionDoneOnActualKoo() throws InterruptedException {
		while(!isElementPresent(justificationText)) {
			swipeToDownsideTillElementPresent(justificationText, 1);
		}
		Assert.assertTrue(isElementPresent(justificationText));
		String reactionTime = KooTime.getText();
		click(originalKooText);
		waitForVisibility(KooContentBackButton);
		String originalKooTime=KooTime.getText();
		Assert.assertFalse(reactionTime.equalsIgnoreCase(originalKooTime));	
		click(KooContentBackButton);
		
	}


	public void verifyOONKooShouldNotShowAccordingToTimeOfActualKooCreated() {

	}


	public void verifyOneReactionTimeIsConsideredOnOONKooWhenThereAreMultileReactionsOnSameKoo() {

	}


	public void veirfyJustificationTextShouldShowOnOONKooAccordingToTheReactionMade() {

	}


	public void verifyOnFollowingOONKooCreatorShouldShowBasedOnTheKooCreatedTimeOnceAfterFeedRefresh() {

	}


	public void verifyOnFollowingOONKooJustificationTextShouldNotShow() {

	}


	public void verifyJutificationTextShouldChangeWhenSameUserDoesMoreThanReactionAfterSomeTime(Integer int1) {

	}


	public void verifyWhenDifferentUsersDoesReactionOnOONKooJustificationTextShouldShow1stTwoReactorSNamesAlongWithTypeOfReaction() {
	}


	public void veirfyJustificationTextShouldShowOnlyForOutOfNetworkKoosNotForFollowingUsersKoos() {

	}

	//New by sumeet
	public void i_follow_people_button_and_top_fifty_bulk_follow_button_for_english_languages() throws InterruptedException {
		Thread.sleep(20000);
		swipeToSeeDownsideElementsOfScreen(3);
		waitForVisibility(topFiftyFollowEnglish);
		Assert.assertTrue(isElementPresent(topFiftyFollowEnglish));
	}
	public void verify_on_top_of_feed_carousel_with_profile_cards_to_follow() throws Exception {
		updatePopUp();
		waitForVisibility(profilePic);
		if(!isElementPresent(peopleYouCanFollowText)) {
			Thread.sleep(20000);
			click(viewAllPeopleCrousel);
			swipeToDownsideTillElementPresent(peopleYouCanFollowText, 4);
		}
		click(goBackFromAllPeopleCrousel);

	}

	public void verifyOnClickBackButton() throws InterruptedException {
		if(isElementPresent(backbutton)) {
			click(backbutton);
			Thread.sleep(2000);
		}

	}

	public void verifyclickOnBackToHomeButton() throws InterruptedException {
		Thread.sleep(2000);
		if(isElementPresent(BackToHomeButton)) {
			click(BackToHomeButton);

		}

	}


	public void verifyClickOnHomeButton() throws InterruptedException {
		Thread.sleep(2000);
		isElementPresent(homeExplorer);
		Assert.assertTrue(isElementPresent(homeExplorer));
		click(homeExplorer);

	}

	public void verifyClickOnCancelButton() throws InterruptedException {
		Thread.sleep(5000);
		isElementPresent(CancelButton);
		click(CancelButton);

	}

	public void verifyClickOnManageUnblockButton() throws InterruptedException {
		Thread.sleep(5000);
		isElementPresent(ManageUnblockButton);
		click(ManageUnblockButton);

	}

	public void verifyClickOnUnblockButton() throws InterruptedException {
		Thread.sleep(5000);
		isElementPresent(UnblockButton);
		click(UnblockButton);

	}

	public void verifyClickOnMessageIconHome() throws InterruptedException {
		Thread.sleep(5000);
		isElementPresent(MessageIconHome);
		click(MessageIconHome);

	}

	public void verifyClickOnBackArrowMessagebutton() throws InterruptedException {
		Thread.sleep(5000);
		isElementPresent(BackArrowMessage);
		click(BackArrowMessage);

	}

	public void verifyClickOnNotificationIconHome() throws InterruptedException {
		Thread.sleep(5000);
		isElementPresent(NotificationIconHome);
		click(NotificationIconHome);

	}






}