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

public class ProfilePage extends BasePage {
	TestUtils utils = new TestUtils();

	@FindBy(id = "com.koo.app:id/clProfile")
	public WebElement Profileicon;

	@FindBy(xpath = "//android.view.ViewGroup[@index='1']/android.widget.FrameLayout[@index='0']")
	public WebElement ProfilePic;

	@FindBy(id = "com.koo.app:id/channel_imageview")
	public List<WebElement> profilePageElements; //first element is the profile pic
	//public WebElement profilePhoto = profilePageElements.get(0);

	@FindBy(xpath = "//android.view.ViewGroup[@index='1']/android.widget.TextView[@index='2']")
	public WebElement ProfileName;

	@FindBy(xpath = "//android.view.ViewGroup[@index='1']/android.widget.TextView[@index='3']")
	public WebElement ProfileHandelName;

	@FindBy(id = "com.koo.app:id/toolbar_heading_textview")
	public WebElement ProfileNameHeading;

	@FindBy(id = "com.koo.app:id/layout_close")
	public WebElement ProfileBackButton;

	@FindBy(id = "com.koo.app:id/toolbar_profile")
	public WebElement HomeMainScreen;

	@FindBy(id = "com.koo.app:id/blip_share")
	public WebElement ShareButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']")
	public WebElement ShareLayout;

	@FindBy(id = "com.koo.app:id/share_title")
	public WebElement ShareTitle;

	@FindBy(id = "com.koo.app:id/rl_twitter")
	public WebElement TwitterShareButton;

	@FindBy(id = "com.koo.app:id/rl_whatsapp_status")
	public WebElement WhatsappStatusButton;

	@FindBy(id = "com.koo.app:id/rl_whatsapp")
	public WebElement WhatsappShareButton;

	@FindBy(id = "com.koo.app:id/rl_facebook")
	public WebElement FacebookShareButton;

	@FindBy(id = "com.koo.app:id/close_button")
	public WebElement SharecloseButton;

	@FindBy(id = "android:id/chooser_header")
	public WebElement ShareDetailheading;

	@FindBy(id = "android:id/profile_tabhost")
	public WebElement ShareDetail1;

	@FindBy(id = "com.koo.app:id/fl_settings")
	public WebElement SettingButton;

	@FindBy(id = "com.koo.app:id/image_view")
	public WebElement ProfilePicFullScreen;

	@FindBy(xpath = "//android.widget.ImageButton")
	public WebElement ProfileScreenBackButton;

	@FindBy(id = "com.koo.app:id/edit_profile_button")
	public WebElement EditProfileButton;

	@FindBy(id = "com.koo.app:id/read_more")
	public WebElement ReadMoreButton;

	@FindBy(id = "com.koo.app:id/show_more_text")
	public WebElement MoreInfoButton;

	@FindBy(id = "com.koo.app:id/profession_textview")
	public WebElement ProfessionText;

	@FindBy(id = "com.koo.app:id/description_textview")
	public WebElement ProfileDescriptionText;

	@FindBy(id = "com.koo.app:id/extra_info_container")
	public WebElement ExtraInfo;

	@FindBy(id = "com.koo.app:id/tv_location")
	public WebElement UserLocation;

	@FindBy(id = "com.koo.app:id/tv_joining")
	public WebElement KooJoiningDate;

	@FindBy(id = "com.koo.app:id/tv_gender")
	public WebElement GenderText;

	@FindBy(id = "com.koo.app:id/tv_maritalstatus")
	public WebElement MaritalStatus;

	@FindBy(id = "com.koo.app:id/tv_dob")
	public WebElement UserDOB;

	@FindBy(id = "com.koo.app:id/tv_youtube")
	public WebElement UserLink;

	@FindBy(id = "com.koo.app:id/following_layout")
	public WebElement followingButton;

	@FindBy(id = "com.koo.app:id/followers_layout")
	public WebElement followerButton;

	@FindBy(id = "com.koo.app:id/followers_count_textview")
	public WebElement followerCount;

	@FindBy(id = "com.koo.app:id/following_count_textview")
	public WebElement followingCount;

	@FindBy(id = "com.koo.app:id/profile_images_following")
	public List<WebElement> size_FollowingImages;

	@FindBy(id = "com.koo.app:id/profile_images_followers")
	public List<WebElement> size_FollowerImages;

	@FindBy(id = "com.koo.app:id/profile_images_following")
	public WebElement fiveFollowingImages;

	@FindBy(id = "com.koo.app:id/profile_images_followers")
	public WebElement fiveFollowerImages;

	@FindBy(id = "com.koo.app:id/title")
	public WebElement followerPage;

	@FindBy(id = "com.koo.app:id/title")
	public WebElement followingPage;

	@FindBy(xpath = "//android.widget.ImageButton")
	public WebElement backButton;

	@FindBy(id = "com.koo.app:id/follower_item_layout")
	public List<WebElement> FollowerList_of_people;

	@FindBy(id = "com.koo.app:id/follower_item_layout")
	public WebElement FollowerList;

	@FindBy(id = "com.koo.app:id/btnFollowView")
	public List<WebElement> followButtonsForAllFollowers;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public List<WebElement> namesForAllFollowers;

	@FindBy(id = "com.koo.app:id/tvHandle")
	public List<WebElement> handleNamesForAllFollowers;

	@FindBy(id = "com.koo.app:id/tvHeadline")
	public List<WebElement> professionsForAllFollowers;

	@FindBy(id = "com.koo.app:id/channel_imageview")
	public List<WebElement> profileImagesForAllFollowers;

	@FindBy(id = "com.koo.app:id/tvFollow")
	public List<WebElement> followingButtonsForAllFollowingMember;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public List<WebElement> namesForAllFollowingMembers;

	@FindBy(id = "com.koo.app:id/tvHandle")
	public List<WebElement> handleNamesForAllFollowingMembers;

	@FindBy(id = "com.koo.app:id/tvHeadline")
	public List<WebElement> professionsForAllFollowingMembers;

	@FindBy(id = "com.koo.app:id/channel_imageview")
	public List<WebElement> profileImagesForAllFollowingMembers;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']")
	public WebElement Followerpeople1;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.RelativeLayout[@index='0']")
	public WebElement Followerpeople1_Picture;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.LinearLayout[@index='1']")
	public WebElement Followerpeople1_Name;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='2']")
	public WebElement Followerpeople1_Handle_Name;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='4']/android.widget.RelativeLayout[@index='0']")
	public WebElement Followerpeople4_Picture;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='4']/android.widget.LinearLayout[@index='1']")
	public WebElement Followerpeople4_Name;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='4']/android.widget.TextView[@index='2']")
	public WebElement Followerpeople4_Handle_Name;


	@FindBy(id = "com.koo.app:id/tvFollow")
	public WebElement Follow_and_unfollowButton;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	public WebElement Followerpeople2;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']/android.widget.RelativeLayout[@index='0']")
	public WebElement Followerpeople2_Picture;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']/android.widget.LinearLayout[@index='1']")
	public WebElement Followerpeople2_Name;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']/android.widget.TextView[@index='2']")
	public WebElement Followerpeople2_Handle_Name;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='2']")
	public WebElement Followerpeople3;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='3']")
	public WebElement Followerpeople4;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='4']")
	public WebElement Followerpeople5;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']")
	public WebElement allSection;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']")
	public WebElement mutualSection;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='2']")
	public WebElement latestSection;

	@FindBy(id = "com.koo.app:id/fl_settings")
	public WebElement setting;

	@FindBy(id = "android:id/button1")
	public WebElement yesButton;

	@FindBy(id = "com.koo.app:id/logout_imageview")
	public WebElement logoutTab;

	@FindBy(id = "com.koo.app:id/tvCancel")
	public WebElement cancelbutton;

	@FindBy(id = "com.koo.app:id/status_header_textview")
	public WebElement logInPage;

	@FindBy(id = "com.koo.app:id/tvFollow")
	public WebElement logoutButton;

	@FindBy(id = "com.koo.app:id/search_iv")
	public WebElement searchButton;

	@FindBy(id = "com.koo.app:id/action_bar_et_search")
	public WebElement searchTextField;

	@FindBy(id = "com.koo.app:id/search_iv")
	public WebElement cancelButton;

	@FindBy(id = "com.koo.app:id/stats_layout")
	public WebElement statisticButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Detailed Statistics']")
	public WebElement statisticsPage;

	@FindBy(id = "com.koo.app:id/backArrow")
	public WebElement statisticBackButton;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='0']")
	public WebElement statisticDailyTab;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='0']")
	public WebElement statisticWeeklyTab;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='2']/android.widget.FrameLayout[@index='0']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='0']")
	public WebElement statisticMonthlyTab;

	@FindBy(id = "com.koo.app:id/followers_count_view")
	public WebElement followerCountGraph;

	@FindBy(id = "com.koo.app:id/koo_count_view")
	public WebElement kooCountGraph;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']")
	public WebElement kooIconWithCount;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='0']")
	public WebElement likeIconWithCount;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement likeIcon;

	//@FindBy(xpath="//android.widget.HorizontalScrollView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='1']")
	@FindBy(xpath = "//android.widget.TextView[@index='1' and @selected='true']")
	public WebElement likeCount;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='2']/android.widget.RelativeLayout[@index='0']")
	public WebElement commentIconWithCount;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='2']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='1']")
	public WebElement commentCountInProfile;

	@FindBy(xpath = "//android.widget.HorizontalScrollView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='3']/android.widget.RelativeLayout[@index='0']")
	public WebElement hashtagIconWithCount;

	@FindBy(id = "com.koo.app:id/tv_create_koo")
	public WebElement createKooButtonWithSmiley;

	@FindBy(id = "com.koo.app:id/iv_light_bulb")
	public WebElement tipsIcon;

	@FindBy(xpath = "//android.widget.TextView[@text='Tips for Creators:']")
	public WebElement tipsForCreator;

	@FindBy(id = "com.koo.app:id/creator_suggestion_hint")
	public WebElement creatorSugesstions;

	@FindBy(id = "com.koo.app:id/circular_fab")
	public WebElement createKooFAB_Button;

	@FindBy(id = "com.koo.app:id/view_pager")
	public WebElement createKooPage;

	@FindBy(id = "com.koo.app:id/post_text_view")
	public WebElement createKooField;

	@FindBy(id = "com.koo.app:id/speechToTextIcon")
	public WebElement createKooSpeech;

	@FindBy(id = "com.koo.app:id/audioTabIcon")
	public WebElement createKooMic;

	@FindBy(id = "com.koo.app:id/videoTabIcon")
	public WebElement createKooVideo;

	@FindBy(id = "com.koo.app:id/btn_emoji")
	public WebElement createKooSmiles;

	@FindBy(id = "com.koo.app:id/iv_add_link")
	public WebElement createKooLink;

	@FindBy(id = "com.koo.app:id/iv_add_youtube_link")
	public WebElement createKooYouTubeLink;

	@FindBy(id = "com.koo.app:id/iv_add_image")
	public WebElement createKooAddImage;

	@FindBy(id = "com.koo.app:id/poll_tab_icon")
	public WebElement createKooPollicon;

	@FindBy(id = "com.koo.app:id/settings_icon")
	public WebElement createKooSettingIcon;

	@FindBy(id = "com.koo.app:id/character_count_textview")
	public WebElement createKooCharacterCount;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement createKooBackButton;

	@FindBy(id = "com.koo.app:id/post_button")
	public WebElement kooPostButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']/android.widget.TextView[@index='0']")
	public WebElement requestToKoo;

	@FindBy(id = "com.koo.app:id/follows_you_view")
	public WebElement followsYouText;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='No Koos']")
	public WebElement nooKooText;

	@FindBy(id = "com.koo.app:id/tv_button_text")
	public WebElement requestKooSend;

	@FindBy(id = "com.koo.app:id/iv_icon")
	public WebElement tickSendIcon;

	@FindBy(id = "com.koo.app:id/layout_profile")
	public WebElement KooLabelLayout1;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.RelativeLayout[@index='0']")
	public WebElement KooProfilePic;

	@FindBy(xpath = "//android.view.ViewGroup[@index='2']/android.widget.TextView[@index='0']")
	public WebElement KooProfileName;

	@FindBy(id = "com.koo.app:id/koo_time_creation_tv")
	public WebElement KooTime;

	@FindBy(id = "com.koo.app:id/channel_handle_textview")
	public WebElement KooCardContent;

	@FindBy(id = "com.koo.app:id/channel_handle_textview")
	public WebElement koohandel;

	@FindBy(id = "com.koo.app:id/rootView")
	public WebElement poll1;

	@FindBy(id = "com.koo.app:id/rv_options")
	public WebElement PollOptions;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index='4']/android.widget.LinearLayout[@index='0']")
	public WebElement PollOption1;

	@FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@index='4']/android.widget.LinearLayout[@index='1']")
	public WebElement PollOption2;

	@FindBy(id = "com.koo.app:id/tv_votes")
	public WebElement TotalVotes;

	@FindBy(id = "com.koo.app:id/tv_ending_at")
	public WebElement DeadlinePoll;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='1']")
	public WebElement pollcreation;

	@FindBy(id = "com.koo.app:id/ivAdd")
	public WebElement AddPollButton;

	@FindBy(id = "com.koo.app:id/view_pager")
	public WebElement CreatePollPage;

	@FindBy(id = "com.koo.app:id/post_text_view")
	public WebElement CreatePollField;

	@FindBy(id = "com.koo.app:id/speechToTextIcon")
	public WebElement CreatePollSpeech;

	@FindBy(id = "com.koo.app:id/audioTabIcon")
	public WebElement CreatePollMic;

	@FindBy(id = "com.koo.app:id/videoTabIcon")
	public WebElement CreatePollVideo;

	@FindBy(id = "com.koo.app:id/btn_emoji")
	public WebElement CreatePollSmiles;

	@FindBy(id = "com.koo.app:id/iv_add_link")
	public WebElement CreatePollLink;

	@FindBy(id = "com.koo.app:id/iv_add_youtube_link")
	public WebElement CreatePollYouTubeLink;

	@FindBy(id = "com.koo.app:id/iv_add_image")
	public WebElement CreatePollAddImage;

	@FindBy(id = "com.koo.app:id/poll_tab_icon")
	public WebElement CreatePollicon;

	@FindBy(id = "com.koo.app:id/settings_icon")
	public WebElement CreatePollSettingIcon;

	@FindBy(id = "com.koo.app:id/character_count_textview")
	public WebElement CreatePollCharacterCount;


	@FindBy(id = "com.koo.app:id/poll_parent_layout")
	public WebElement CreatePollOptionsLayout;

	@FindBy(id = "com.koo.app:id/et_choice_one")
	public WebElement CreatePollOptions1;

	@FindBy(id = "com.koo.app:id/et_choice_two")
	public WebElement CreatePollOptions2;

	@FindBy(id = "com.koo.app:id/ic_close_poll")
	public WebElement CreatePollOptionsClose;

	@FindBy(id = "com.koo.app:id/tv_add_option")
	public WebElement AddCreatePollOptions;

	@FindBy(id = "com.koo.app:id/layout_display_duration")
	public WebElement CreatedPollDuration;

	@FindBy(id = "com.koo.app:id/header_text")
	public WebElement CreatedPollDurationTiming;

	@FindBy(id = "com.koo.app:id/layout_choice_three")
	public WebElement CreatePollOptions3;

	@FindBy(id = "com.koo.app:id/iv_remove_option_three")
	public WebElement RemoveCreatePollOption;

	@FindBy(id = "com.koo.app:id/post_button")
	public WebElement PollPostButton;

	@FindBy(id = "android:id/message")
	public WebElement ConfirmationMessage;

	@FindBy(id = "android:id/button1")
	public WebElement YesConfirmationButton;

	@FindBy(id = "com.koo.app:id/creation_view")
	public WebElement CommentFieldOfFeeds;

	@FindBy(id = "com.koo.app:id/like_imageview")
	public WebElement KooCardLikeButton;

	@FindBy(id = "com.koo.app:id/comment_imageview")
	public WebElement KooCardCommentButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Write Your Comment...']")
	public WebElement commentFieldInKoo;

	@FindBy(id = "com.koo.app:id/rekoo_imageview")
	public WebElement KooCardReeKooButton;

	@FindBy(id = "com.koo.app:id/whatsapp_share_iv")
	public WebElement KooCardWhatsaapShareButton;

	@FindBy(id = "com.koo.app:id/generic_share_iv")
	public WebElement KooCardShareButton;

	@FindBy(id = "com.koo.app:id/rekoo_holder")
	public WebElement ReeKooButton;

	@FindBy(id = "com.koo.app:id/rekoo_textview")
	public WebElement ReeKooCount;

	@FindBy(id = "com.koo.app:id/rt_without_content")
	public WebElement ReeKooWithOutComment;

	@FindBy(id = "com.koo.app:id/rt_with_content")
	public WebElement ReeKooWithComment;

	@FindBy(xpath = "//android.widget.TextView[@text='Re-Koo']")
	public WebElement ReeKooWithOutCommenttext;

	@FindBy(xpath = "//android.widget.TextView[@text='Re-Koo with Comment']")
	public WebElement ReeKooWithCommenttext;

	@FindBy(id = "com.koo.app:id/container")
	public WebElement ReeKooWithCommentScreen;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement ReeKooWithCommentScreenBackButton;

	@FindBy(id = "android:id/title_container")
	public WebElement SharinglistContainer;

	@FindBy(xpath = "//android.widget.TextView[@text='Share']")
	public WebElement SharingListTitle;

	@FindBy(id = "android:id/profile_tabhost")
	public WebElement SharingList;

	@FindBy(id = "com.koo.app:id/undo_rekoo_without_content")
	public WebElement UndoKooButton;

	@FindBy(id = "com.koo.app:id/layout_close")
	public WebElement KooCardBackButton;

	@FindBy(id = "com.koo.app:id/toolbar_heading_textview")
	public WebElement KooCardTitleName;

	@FindBy(id = "com.koo.app:id/layout_profile_parent")
	public WebElement KooProfileDetail;

	@FindBy(id = "com.koo.app:id/channel_imageview")
	public WebElement KooProfilepicDetail;

	@FindBy(xpath = "//android.view.ViewGroup[@index='1']")
	private WebElement Profiledetail;

	@FindBy(xpath = "//android.view.ViewGroup[@index='1']/android.widget.FrameLayout[@index='0']")
	private WebElement Profilepic;

	@FindBy(id = "com.koo.app:id/image_view")
	private WebElement profilepicture;

	@FindBy(id = "com.koo.app:id/rekoo_count_parent")
	public WebElement ReeKooCards;

	@FindBy(id = "com.koo.app:id/rekoo_imageview")
	public WebElement ReekooImages;

	@FindBy(xpath = "//android.view.ViewGroup[@index='2']/android.widget.TextView[@index='3']")
	public WebElement KooHandelName;

	@FindBy(xpath = "//android.view.ViewGroup[@index='4']/android.view.ViewGroup[@index='1']")
	public WebElement CommentField;

	@FindBy(xpath = "//android.widget.TextView[@text='Show this thread']")
	public WebElement ThreadsButton;

	@FindBy(id = "com.koo.app:id/details_container")
	public WebElement KooCardDetail;

	@FindBy(id = "com.koo.app:id/subhead_textview")
	public WebElement kooProfession;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.RelativeLayout[@index='0']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']")
	public WebElement koo1Time;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']/android.widget.RelativeLayout[@index='0']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='1']")
	public WebElement koo2Time;

	@FindBy(id = "com.koo.app:id/iv_options_more")
	public WebElement dropDownButton;

	@FindBy(id = "com.koo.app:id/topic_title_textview")
	public WebElement content1;

	@FindBy(xpath = "//android.widget.TextView[@text='Delete Koo']")
	public WebElement deleteButton;

	@FindBy(id = "com.koo.app:id/trending_koo_tv")
	public WebElement viewTrendingKooText;

	@FindBy(xpath = "//android.widget.TextView[@text='No Koos']")
	public WebElement nooKoosText;

	//@FindBy(id="com.koo.app:id/like_textview")
	@FindBy(id = "com.koo.app:id/like_imageview")
	public WebElement likeButton;

	@FindBy(id = "com.koo.app:id/channel_name_textview")
	public WebElement profileName;

	@FindBy(id = "com.koo.app:id/channel_handle_textview")
	public WebElement profileHandel;

	@FindBy(id = "com.koo.app:id/creation_view")
	public WebElement commentField;

	@FindBy(id = "com.koo.app:id/comment_imageview")
	public WebElement commentIcon;

	@FindBy(id = "com.koo.app:id/comment_textview")
	public WebElement commentCount;

	@FindBy(id = "com.koo.app:id/rekoo_imageview")
	public WebElement reeKooIcon;

	@FindBy(id = "com.koo.app:id/rekoo_textview")
	public WebElement reeKooCount;

	@FindBy(id = "com.koo.app:id/post_button")
	public WebElement PostButton;

	@FindBy(id = "com.koo.app:id/post_text_view")
	public WebElement EditRepyField;

	@FindBy(id = "com.koo.app:id/post_text_layout")
	public WebElement replyField;

	@FindBy(xpath = "//android.widget.TextView[@index='2']")
	public WebElement PostButtonAfter;

	@FindBy(id = "com.koo.app:id/iv_koo_header")
	public WebElement reeKooPrf;

	@FindBy(id = "com.koo.app:id/tv_koo_header")
	public WebElement reeKootext;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='5']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='3']")
	public WebElement content2;

	@FindBy(id = "com.koo.app:id/login_button")
	public WebElement logInButton;

	@FindBy(id = "com.koo.app:id/profile_view_layout")
	public WebElement profileViewButton;

	@FindBy(id = "com.koo.app:id/profile_view_icon")
	public WebElement profileViewIcon;

	@FindBy(id = "com.koo.app:id/profile_view_text")
	public WebElement profileViewCount;

	@FindBy(id = "com.koo.app:id/toolbar_heading_textview")
	public WebElement profileViewPage;

	@FindBy(id = "com.koo.app:id/tvHandle")
	public WebElement profileHandel1;

	@FindBy(id = "com.koo.app:id/tvHeadline")
	public WebElement profileAbout;

	@FindBy(id = "com.koo.app:id/action_bar_et_search")
	public WebElement SearchField;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='0']")
	public WebElement PeopleSearched1;

	@FindBy(xpath = "//android.widget.RelativeLayout[@index='1']")
	public WebElement PeopleSearched2;

	@FindBy(id = "com.koo.app:id/search_view_pager")
	public WebElement SearchPage;

	@FindBy(id = "com.koo.app:id/voice_search_image_view")
	public WebElement MicButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='0']")
	public WebElement PeopleButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='1']")
	public WebElement HashtagButton;

	@FindBy(xpath = "//android.widget.LinearLayout[@index='2']")
	public WebElement KooButton;

	@FindBy(id = "com.koo.app:id/layout_search")
	public WebElement SearchButton;

	@FindBy(id = "com.koo.app:id/tvPageTitle")
	public WebElement trendingKooPage;

	@FindBy(id = "com.koo.app:id/tab_text")
	public WebElement kooCountOfProfile;

	//made by sumeet
	@FindBy(id = "com.koo.app:id/edit_profile_button")
	public WebElement EditProfile;

	@FindBy(id = "com.koo.app:id/et_name")
	public WebElement NameProfile ;

	@FindBy(id = "com.koo.app:id/save_button")
	public WebElement SaveButton ;

	@FindBy(id = "com.koo.app:id/single_line_edit")
	public WebElement lineEdit ;


	@FindBy(id = "com.koo.app:id/et_handle")
	public WebElement handleName ;

	@FindBy(id = "com.koo.app:id/tv_profession")
	public WebElement ProfessionName ;




	public void iNavigateToProfileScreen() throws InterruptedException {
		Thread.sleep(3000);
		waitForVisibility(HomeMainScreen);
		Thread.sleep(3000);
		click(Profileicon);
		Thread.sleep(3000);
		waitForVisibility(ProfileNameHeading);

	}

	public void verifyProfilePageBasicElements() {
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(profilePageElements.get(0)));
		//Assert.assertTrue(isElementPresent(ProfilePic));
		Assert.assertTrue(isElementPresent(profileName));
		Assert.assertTrue(isElementPresent(ProfileHandelName));
		Assert.assertTrue(isElementPresent(setting));
	}

	public void IVerifyTappingUserStatsIconAndVerifyStatsScreen() throws InterruptedException {

		Assert.assertTrue(isElementPresent(statisticButton));
		click(statisticButton);
		waitForVisibility(statisticsPage);

	}


	public void iVerifyBackButtonAndDeviceBackButtonFunctionalityOnStatsScreen() throws InterruptedException {
		click(statisticBackButton);
		waitForVisibility(statisticButton);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		click(statisticButton);
		waitForVisibility(statisticsPage);
		Assert.assertTrue(isElementPresent(statisticsPage));
		clickAndroidDeviceBackBttn();
		waitForVisibility(statisticButton);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));

	}


	public void iVerifySharingElementsFunctionality() throws InterruptedException {
		Assert.assertTrue(isElementPresent(ShareButton));
		click(ShareButton);
		waitForVisibility(SharecloseButton);
		Assert.assertTrue(isElementPresent(SharecloseButton));
		Assert.assertTrue(isElementPresent(ShareLayout));
		Assert.assertTrue(isElementPresent(ShareTitle));
		Assert.assertTrue(isElementPresent(WhatsappShareButton));
		Assert.assertTrue(isElementPresent(WhatsappStatusButton));
		Assert.assertTrue(isElementPresent(TwitterShareButton));
		Assert.assertTrue(isElementPresent(FacebookShareButton));
		waitForVisibility(SharecloseButton);
		click(SharecloseButton);
	}


	public void iVerifyVariousSharingElementFunctionality() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		click(ShareButton);
		waitForVisibility(ShareTitle);
		Assert.assertTrue(isElementPresent(ShareTitle));
		waitForVisibility(WhatsappShareButton);
		click(WhatsappShareButton);
		//waitForVisibility(ShareDetailheading);
		//Assert.assertTrue(isElementPresent(ShareDetailheading));
		//Assert.assertTrue(isElementPresent(ShareDetail1));
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		waitForVisibility(ShareButton);
		ShareButton.click();
		Thread.sleep(2000);
		waitForVisibility(TwitterShareButton);
		click(TwitterShareButton);
		//waitForVisibility(ShareDetailheading);
		//Assert.assertTrue(isElementPresent(ShareDetailheading));
		//Assert.assertTrue(isElementPresent(ShareDetail1));
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();

	}


	public void iVerifySettingButtonandShareButtonOnUserStats() throws InterruptedException {
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(ShareButton));
		Assert.assertTrue(isElementPresent(SettingButton));

	}


	public void iVerifyImageOnFullScreen() throws InterruptedException {
		waitForVisibility(profilePageElements.get(0));
		click(profilePageElements.get(0));
		waitForVisibility(ProfilePicFullScreen);
		Thread.sleep(4000);
		Assert.assertTrue(isElementPresent(ProfilePicFullScreen));
		waitForVisibility(ProfileScreenBackButton);
		click(ProfileScreenBackButton);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));

	}


	public void iVerifyEditProfileButton() throws InterruptedException {
		waitForVisibility(EditProfileButton);
		Assert.assertTrue(isElementPresent(EditProfileButton));

	}


	public void iVerifyMoreInfoAndLessInfoButton() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if (isElementPresent(ReadMoreButton)) {
				Assert.assertTrue(isElementPresent(ReadMoreButton));
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		Thread.sleep(2000);
		try {
			if (isElementPresent(MoreInfoButton)) {
				Assert.assertTrue(isElementPresent(MoreInfoButton));
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public void iVerifyProfileDetailsthingsbelowtheprofileimage() throws InterruptedException {
		waitForVisibility(profilePageElements.get(0));
		Assert.assertTrue(isElementPresent(profilePageElements.get(0)));
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(ProfileHandelName));
		Assert.assertTrue(isElementPresent(ProfessionText));
		Assert.assertTrue(isElementPresent(ProfileDescriptionText));
		Assert.assertTrue(isElementPresent(UserLocation));
		Assert.assertTrue(isElementPresent(KooJoiningDate));
		if (isElementPresent(MoreInfoButton)) {
			Assert.assertTrue(isElementPresent(MoreInfoButton));
			click(MoreInfoButton);
			Thread.sleep(1000);
			Assert.assertTrue(isElementPresent(GenderText));
			Assert.assertTrue(isElementPresent(MaritalStatus));
			Assert.assertTrue(MoreInfoButton.getText().equalsIgnoreCase("Less Info"));
			//Assert.assertTrue(isElementPresent(UserDOB));
			//Assert.assertTrue(isElementPresent(UserLink));
		}
		if (isElementPresent(ReadMoreButton)) {
			Assert.assertTrue(isElementPresent(ReadMoreButton));
			click(ReadMoreButton);
			waitForVisibility(ReadMoreButton);
			click(ReadMoreButton);
		}
	}


	public void iVerifyFollowerandFollowingButton() throws InterruptedException {
		waitForVisibility(followerButton);
		Assert.assertTrue(isElementPresent(followerButton));
		Assert.assertTrue(isElementPresent(followingButton));

	}

	public void iVerifyCountonfollowersfollowingbuttons() throws InterruptedException {
		Assert.assertTrue(isElementPresent(fiveFollowerImages));
		Assert.assertTrue(isElementPresent(fiveFollowingImages));
		Assert.assertTrue(size_FollowerImages.size() >= 1);
		Assert.assertTrue(size_FollowingImages.size() >= 1);
	}


	public void IVerifyUserShouldBeAbleTotTaponFollowersFollowingButtonsAndShouldEnterRespectiveScreen() throws InterruptedException {

		click(followerButton);
		waitForVisibility(followerPage);
		Assert.assertTrue(isElementPresent(followerPage));
		Assert.assertTrue(isElementPresent(backButton));
		click(backButton);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		click(followingButton);
		waitForVisibility(followingPage);
		Assert.assertTrue(isElementPresent(followingPage));
		Assert.assertTrue(isElementPresent(backButton));
		click(backButton);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));

	}

	public void IVerifyUsersNameShouldAppearInListAlongWithProfileImagesFollowUnfollowButtons() throws InterruptedException {
		waitForVisibility(followerButton);
		click(followerButton);
		waitForVisibility(followerPage);
		Assert.assertTrue(isElementPresent(followerPage));
		Thread.sleep(2000);
		int numoffollowers = followButtonsForAllFollowers.size();
		for (int i = 0; i < numoffollowers - 1; i++) {
			Assert.assertTrue(isElementPresent(followButtonsForAllFollowers.get(i)));
			Assert.assertTrue(isElementPresent(namesForAllFollowers.get(i)));
			Assert.assertTrue(isElementPresent(handleNamesForAllFollowers.get(i)));
			Assert.assertTrue(isElementPresent(professionsForAllFollowers.get(i)));
			Assert.assertTrue(isElementPresent(profileImagesForAllFollowers.get(i)));
		}


		//Verify All Tabs
		Assert.assertTrue(isElementPresent(backButton));
		Assert.assertTrue(isElementPresent(allSection));
		click(allSection);

		waitForVisibility(mutualSection);
		Assert.assertTrue(isElementPresent(mutualSection));
		click(mutualSection);
		waitForVisibility(latestSection);
		Assert.assertTrue(isElementPresent(latestSection));
		click(latestSection);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);

		//Verifying Following section
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(followingButton));
		click(followingButton);
		waitForVisibility(followingPage);
		Assert.assertTrue(isElementPresent(followingPage));
		Assert.assertTrue(isElementPresent(backButton));
		click(backButton);
		waitForVisibility(followingButton);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(followingButton));
		click(followingButton);
		waitForVisibility(followingPage);
		Assert.assertTrue(isElementPresent(followingPage));
		Assert.assertTrue(isElementPresent(backButton));

		int numoffollowing = followingButtonsForAllFollowingMember.size();
		for (int i = 0; i < numoffollowing - 1; i++) {
			Assert.assertTrue(isElementPresent(followingButtonsForAllFollowingMember.get(i)));
			Assert.assertTrue(isElementPresent(namesForAllFollowingMembers.get(i)));
			Assert.assertTrue(isElementPresent(handleNamesForAllFollowingMembers.get(i)));
			Assert.assertTrue(isElementPresent(professionsForAllFollowingMembers.get(i)));
			Assert.assertTrue(isElementPresent(profileImagesForAllFollowingMembers.get(i)));
		}


		Assert.assertTrue(isElementPresent(allSection));
		click(allSection);
		waitForVisibility(mutualSection);
		Assert.assertTrue(isElementPresent(mutualSection));
		click(mutualSection);
		waitForVisibility(latestSection);
		Assert.assertTrue(isElementPresent(latestSection));
		click(latestSection);
		waitForVisibility(backButton);
		click(backButton);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));

	}

	public void IVerifyFunctionalityofSearchFieldOnEachSectionOfFollowersAsWellAsFollowing() throws InterruptedException {
		waitForVisibility(followerButton);
		click(followerButton);
		waitForVisibility(searchButton);
		Assert.assertTrue(isElementVisible(searchButton));
		Assert.assertTrue(isElementPresent(searchButton));
		Assert.assertFalse(!isKeyPadShown());
		click(searchButton);
		waitForVisibility(searchTextField);
		Assert.assertTrue(isElementVisible(searchTextField));
		Assert.assertTrue(isElementVisible(cancelButton));
		Assert.assertTrue(isKeyPadShown());
		click(cancelButton);
		Assert.assertFalse(!isKeyPadShown());
		Assert.assertFalse(!isElementVisible(searchTextField));
		Assert.assertTrue(isElementVisible(searchButton));
		click(searchButton);
		waitForVisibility(searchTextField);
		searchTextField.sendKeys("updoer tester");
		clickAndroidDeviceBackBttn();
		waitForVisibility(allSection);
		Assert.assertTrue(isElementPresent(allSection));
		Assert.assertTrue(isElementPresent(mutualSection));
		click(mutualSection);
		waitForVisibility(latestSection);
		Assert.assertTrue(isElementPresent(latestSection));
		click(latestSection);
		waitForVisibility(backButton);
		click(backButton);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(followingButton));
		click(followingButton);
		waitForVisibility(followingPage);
		Assert.assertTrue(isElementPresent(followingPage));
		Assert.assertTrue(isElementPresent(backButton));
		Assert.assertTrue(isElementVisible(searchButton));
		Assert.assertTrue(isElementPresent(searchButton));
		Assert.assertFalse(!isKeyPadShown());
		click(searchButton);
		waitForVisibility(searchTextField);
		Assert.assertTrue(isElementVisible(searchTextField));
		Assert.assertTrue(isElementVisible(cancelButton));
		Assert.assertTrue(isKeyPadShown());
		click(cancelButton);
		Assert.assertFalse(!isKeyPadShown());
		Assert.assertFalse(!isElementVisible(searchTextField));
		Assert.assertTrue(isElementVisible(searchButton));
		click(searchButton);
		waitForVisibility(searchTextField);
		searchTextField.sendKeys("Ashwini");
		clickAndroidDeviceBackBttn();
		Assert.assertFalse(!isKeyPadShown());
		waitForVisibility(allSection);
		Assert.assertTrue(isElementPresent(allSection));
		click(allSection);
		waitForVisibility(mutualSection);
		Assert.assertTrue(isElementPresent(mutualSection));
		click(mutualSection);
		waitForVisibility(latestSection);
		Assert.assertTrue(isElementPresent(latestSection));
		click(latestSection);
		waitForVisibility(backButton);
		click(backButton);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));

	}

	public void IVerifyUserStatsScreenOnTappingStatsIconInProfielHeader() throws InterruptedException {
		Assert.assertTrue(isElementPresent(statisticButton));
		click(statisticButton);
		Thread.sleep(2000);
		waitForVisibility(statisticsPage);
		Assert.assertTrue(isElementPresent(statisticsPage));
		Assert.assertTrue(isElementPresent(statisticBackButton));
		Assert.assertTrue(statisticsPage.getText().equalsIgnoreCase("Detailed Statistics"));
		click(statisticBackButton);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(statisticButton));
		click(statisticButton);
		Thread.sleep(2000);
		waitForVisibility(statisticsPage);
		Assert.assertTrue(isElementPresent(statisticsPage));
		Assert.assertTrue(isElementPresent(statisticBackButton));
		Assert.assertTrue(statisticsPage.getText().equalsIgnoreCase("Detailed Statistics"));
		Assert.assertTrue(isElementPresent(statisticWeeklyTab));
		Assert.assertTrue(statisticWeeklyTab.getText().equalsIgnoreCase("Weekly"));
		Assert.assertTrue(isElementPresent(statisticMonthlyTab));
		Assert.assertTrue(statisticMonthlyTab.getText().equalsIgnoreCase("Monthly"));
		Assert.assertTrue(isElementPresent(statisticDailyTab));
		Assert.assertTrue(statisticDailyTab.getText().equalsIgnoreCase("Daily"));
		Assert.assertTrue(isElementPresent(followerCountGraph));
		Assert.assertTrue(followerCountGraph.getText().equalsIgnoreCase("Followers Count (Cumulative)"));
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(kooCountGraph));
		Assert.assertTrue(kooCountGraph.getText().equalsIgnoreCase("Koos Count (Cumulative)"));
		click(statisticWeeklyTab);
		Thread.sleep(2000);
		waitForVisibility(followerCountGraph);
		Assert.assertTrue(isElementPresent(followerCountGraph));
		Assert.assertTrue(followerCountGraph.getText().equalsIgnoreCase("Followers Count (Cumulative)"));
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(kooCountGraph));
		Assert.assertTrue(kooCountGraph.getText().equalsIgnoreCase("Koos Count (Cumulative)"));
		click(statisticMonthlyTab);
		Thread.sleep(2000);
		waitForVisibility(followerCountGraph);
		Assert.assertTrue(isElementPresent(followerCountGraph));
		Assert.assertTrue(followerCountGraph.getText().equalsIgnoreCase("Followers Count (Cumulative)"));
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(kooCountGraph));
		Assert.assertTrue(kooCountGraph.getText().equalsIgnoreCase("Koos Count (Cumulative)"));
		click(statisticDailyTab);
		Thread.sleep(2000);
		waitForVisibility(statisticBackButton);
		click(statisticBackButton);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));

	}

	public void IVerifyKooIconLikeCommentIconAppearOnTheprofileTab() throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibility(kooIconWithCount);
		Assert.assertTrue(isElementPresent(kooIconWithCount));
		Assert.assertTrue(isElementPresent(likeIconWithCount));
		Assert.assertTrue(isElementPresent(commentIconWithCount));
		Assert.assertTrue(isElementPresent(hashtagIconWithCount));

	}

	public void iVerifyTipsForCreatorsAlwaysPresentInProfilePage() throws InterruptedException {
		swipeToDownsideTillElementPresent(tipsForCreator, 5);
		Assert.assertTrue(isElementPresent(tipsIcon));
		Assert.assertTrue(isElementPresent(tipsForCreator));

	}

	public void verifyElementsInNoKoosUI() throws InterruptedException {
		Assert.assertTrue(isElementVisible(createKooButtonWithSmiley));
		Assert.assertTrue(isElementPresent(createKooFAB_Button));
		click(createKooButtonWithSmiley);
		waitForVisibility(createKooPage);
		Assert.assertTrue(isElementPresent(createKooPage));
		Assert.assertTrue(isElementPresent(createKooField));
		Assert.assertTrue(isElementPresent(createKooSpeech));
		Assert.assertTrue(isElementPresent(createKooMic));
		Assert.assertTrue(isElementPresent(createKooVideo));
		Assert.assertTrue(isElementPresent(createKooSmiles));
		Assert.assertTrue(isElementPresent(createKooLink));
		Assert.assertTrue(isElementPresent(createKooYouTubeLink));
		Assert.assertTrue(isElementPresent(createKooAddImage));
		Assert.assertTrue(isElementPresent(createKooPollicon));
		Assert.assertTrue(isElementPresent(createKooSettingIcon));
		Assert.assertTrue(isElementPresent(createKooCharacterCount));
		Assert.assertTrue(isElementPresent(createKooBackButton));
		Assert.assertTrue(isElementPresent(kooPostButton));
		click(createKooBackButton);
		IVerifyKooIconLikeCommentIconAppearOnTheprofileTab();
	}

	public void verifyNoKooUI() throws InterruptedException {
		swipeToDownsideTillElementPresent(createKooButtonWithSmiley, 2);
		if (isElementPresent(createKooButtonWithSmiley)) {
			verifyElementsInNoKoosUI();
		} else {
			//Delete all Koos to verify Koo With Smiley
			//Get the total number of Koos present

			int count = Integer.parseInt(removeAllSpacesAndSpecialChar(kooCountOfProfile.getText()));
			for (int i = 1; i <= count; i++) {
				if (isElementPresent(dropDownButton)) {
					deleteExistingKooFromProfile();
				} else {
					swipeToDownsideTillElementPresent(dropDownButton, 2);
					Assert.assertTrue(isElementPresent(dropDownButton));
					deleteExistingKooFromProfile();

				}

			}
			verifyElementsInNoKoosUI();
		}
		createKoo("This is a new Koo" + utils.getRandomNumber(1000));
		createKoo("This is again a new Koo" + utils.getRandomNumber(1000));

	}

	public void deleteExistingKooFromProfile() throws InterruptedException {
		click(dropDownButton);
		click(deleteButton);
		waitForVisibility(ConfirmationMessage);
		Assert.assertTrue(isElementPresent(ConfirmationMessage));
		Assert.assertTrue(isElementPresent(YesConfirmationButton));
		click(YesConfirmationButton);
		Thread.sleep(5000);
	}

	public void createKoo(String kootitle) throws InterruptedException {
		click(createKooFAB_Button);
		sendKeys(createKooField, kootitle);
		click(kooPostButton);
		Thread.sleep(5000);
	}


	public void verifyIfKooCardsArePresent() throws InterruptedException {
		swipeToDownsideTillElementPresent(createKooButtonWithSmiley, 2);
		if (isElementPresent(createKooButtonWithSmiley)) {
			createKoo("This is a new Koo" + utils.getRandomNumber(1000));
			createKoo("This is again a new Koo" + utils.getRandomNumber(1000));
		}
		swipeToUpsideTillElementPresent(ProfileNameHeading, 2);
		Assert.assertTrue(isElementPresent(KooCardContent));

	}

	public void verifyLatestKooIsDisplayingInTop() throws InterruptedException {
		String latestKooTitle = "New Koo to check order" + utils.getRandomNumber(1000);
		createKoo(latestKooTitle);
		waitForVisibility(content1);
		Assert.assertTrue(content1.getText().equalsIgnoreCase(latestKooTitle));
	}

	public void verifyAllOptionsInKooCard() {
		Assert.assertTrue(isElementPresent(KooCardLikeButton));
		Assert.assertTrue(isElementPresent(KooCardCommentButton));
		Assert.assertTrue(isElementPresent(KooCardReeKooButton));
		Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
		Assert.assertTrue(isElementPresent(KooCardShareButton));

	}

	public void verifyCommentIconFeature() {
		Assert.assertTrue(isElementPresent(KooCardCommentButton));
		click(KooCardCommentButton);
		waitForVisibility(CommentField);
		Assert.assertTrue(isElementPresent(CommentField));
		clickAndroidDeviceBackBttn();
		waitForVisibility(KooCardCommentButton);


	}

	public void verifyRequestKooFeatureForPublicProfile() throws Exception {
		String handlenamefornewuser = ProfileHandelName.getText();
		IVerifyByLoggingOut();
		new LoginPage().enterTestMobileNumber("1111100014");
		new LoginPage().enterTestOTPFromMobile();
		waitForVisibility(HomeMainScreen);
		click(SearchButton);
		waitForVisibility(SearchPage);
		click(SearchField);
		SearchField.clear();
		SearchField.sendKeys("@" + handlenamefornewuser);
		Thread.sleep(2000);
		waitForVisibility(PeopleSearched1);
		click(PeopleSearched1);
		Thread.sleep(4000);
		Assert.assertTrue(isElementPresent(requestToKoo));
		Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request to Koo"));
		click(requestToKoo);
		waitForVisibility(requestKooSend);
		Assert.assertTrue(isElementVisible(requestKooSend));
		Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request Sent!"));
		Assert.assertTrue(isElementPresent(tickSendIcon));
		swipeToSeeUpsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(ProfileBackButton));
		click(ProfileBackButton);

		waitForVisibility(HomeMainScreen);
		click(SearchButton);
		waitForVisibility(SearchPage);
		click(SearchField);
		SearchField.clear();
		SearchField.sendKeys(handlenamefornewuser);
		Thread.sleep(2000);
		waitForVisibility(PeopleSearched1);
		click(PeopleSearched1);
		Thread.sleep(4000);
		Assert.assertFalse(isElementPresent(requestToKoo));
	}


	/*	public void IVerifyUserShouldAbletoSeeCreateYouFirstKoobuttonWithSmileyInOwnProfileIfNotPostedAnyKoo() throws InterruptedException {
			swipeToDownsideTillElementPresent(createKooButtonWithSmiley, 2);
			if(isElementPresent(createKooButtonWithSmiley))
			{
				Assert.assertTrue(isElementVisible(createKooButtonWithSmiley));
				Assert.assertTrue(isElementPresent(tipsIcon));
				Assert.assertTrue(isElementPresent(tipsForCreator));
				Assert.assertTrue(tipsForCreator.getText().equalsIgnoreCase("Tips for Creators:"));
				Assert.assertTrue(isElementPresent(creatorSugesstions));
				Assert.assertTrue(isElementPresent(createKooFAB_Button));
				click(createKooButtonWithSmiley);
				waitForVisibility(createKooPage);
				Assert.assertTrue(isElementPresent(createKooPage));
				Assert.assertTrue(isElementPresent(createKooField));
				Assert.assertTrue(isElementPresent(createKooSpeech));
				Assert.assertTrue(isElementPresent(createKooMic));
				Assert.assertTrue(isElementPresent(createKooVideo));
				Assert.assertTrue(isElementPresent(createKooSmiles));
				Assert.assertTrue(isElementPresent(createKooLink));
				Assert.assertTrue(isElementPresent(createKooYouTubeLink));
				Assert.assertTrue(isElementPresent(createKooAddImage));
				Assert.assertTrue(isElementPresent(createKooPollicon));
				Assert.assertTrue(isElementPresent(createKooSettingIcon));
				Assert.assertTrue(isElementPresent(createKooCharacterCount));
				Assert.assertTrue(isElementPresent(createKooBackButton));
				Assert.assertTrue(isElementPresent(kooPostButton));
				click(createKooBackButton);
				IVerifyKooIconLikeCommentIconAppearOnTheprofileTab();

			}
			else {

				swipeToSeeUpsideElementsOfScreen(2);
				swipeToSeeDownsideElementsOfScreen(2);
			}
			Assert.assertTrue(isElementPresent(createKooFAB_Button));
			click(createKooFAB_Button);
			waitForVisibility(createKooPage);
			Assert.assertTrue(isElementPresent(createKooPage));
			Assert.assertTrue(isElementPresent(createKooField));
			Assert.assertTrue(isElementPresent(createKooSpeech));
			Assert.assertTrue(isElementPresent(createKooMic));
			Assert.assertTrue(isElementPresent(createKooVideo));
			Assert.assertTrue(isElementPresent(createKooSmiles));
			Assert.assertTrue(isElementPresent(createKooLink));
			Assert.assertTrue(isElementPresent(createKooYouTubeLink));
			Assert.assertTrue(isElementPresent(createKooAddImage));
			Assert.assertTrue(isElementPresent(createKooPollicon));
			Assert.assertTrue(isElementPresent(createKooSettingIcon));
			Assert.assertTrue(isElementPresent(createKooCharacterCount));
			Assert.assertTrue(isElementPresent(createKooBackButton));
			Assert.assertTrue(isElementPresent(kooPostButton));
			click(createKooBackButton);
			IVerifyKooIconLikeCommentIconAppearOnTheprofileTab();

		}
	*/
	public void IVreifyIfPublicUserHasNotCreatedAnykoos() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(2);
		Assert.assertTrue(isElementPresent(followerButton));
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(followingButton));
		click(followerButton);
		waitForVisibility(backButton);
		click(backButton);
		waitForVisibility(followerButton);
		click(followerButton);
		waitForVisibility(followerPage);
		Assert.assertTrue(isElementPresent(followerPage));
		Assert.assertTrue(isElementPresent(backButton));
		Assert.assertTrue(isElementPresent(Followerpeople1));
		Assert.assertTrue(isElementPresent(Followerpeople1_Picture));
		Assert.assertTrue(isElementPresent(Followerpeople1_Name));
		Assert.assertTrue(isElementPresent(Followerpeople1_Handle_Name));
		click(Followerpeople1_Name);
		waitForVisibility(followsYouText);
		Assert.assertTrue(isElementPresent(followsYouText));
		Assert.assertTrue(followsYouText.getText().equalsIgnoreCase("Follows You"));
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertFalse(!isElementVisible(createKooButtonWithSmiley));
		Assert.assertFalse(!isElementVisible(createKooFAB_Button));
		if (isElementVisible(KooCardContent)) {
			isElementVisible(KooCardContent);
			swipeToSeeUpsideElementsOfScreen(1);
			Assert.assertTrue(isElementPresent(ProfileBackButton));
			click(ProfileBackButton);
		} else {

			Thread.sleep(2000);
			if (isElementVisible(nooKooText)) {
				Assert.assertTrue(isElementVisible(nooKooText));
				Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("No Koos"));
				if (isElementVisible(requestToKoo)) {
					Assert.assertTrue(isElementVisible(requestToKoo));
					Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request to Koo"));
					click(requestToKoo);
					waitForVisibility(requestKooSend);
					Assert.assertTrue(isElementVisible(requestKooSend));
					Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request Sent!"));
					Assert.assertTrue(isElementVisible(tickSendIcon));
					swipeToSeeUpsideElementsOfScreen(1);
					Assert.assertTrue(isElementPresent(ProfileBackButton));
					click(ProfileBackButton);
					waitForVisibility(KooCardContent);
					isElementVisible(KooCardContent);
					swipeToSeeUpsideElementsOfScreen(1);
					Assert.assertTrue(isElementPresent(ProfileBackButton));
					click(ProfileBackButton);
				} else {
					Thread.sleep(2000);
				}

			}

		}


		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(Followerpeople1));
		Assert.assertTrue(isElementPresent(Followerpeople2));
		Assert.assertTrue(isElementPresent(Followerpeople3));
		Assert.assertTrue(isElementPresent(Followerpeople4));
		Assert.assertTrue(isElementPresent(Followerpeople5));
		Assert.assertTrue(isElementPresent(Followerpeople4_Picture));
		Assert.assertTrue(isElementPresent(Followerpeople4_Name));
		Assert.assertTrue(isElementPresent(Followerpeople4_Handle_Name));
		click(Followerpeople4_Name);
		waitForVisibility(followsYouText);
		Assert.assertTrue(isElementPresent(followsYouText));
		Assert.assertTrue(followsYouText.getText().equalsIgnoreCase("Follows You"));
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertFalse(!isElementVisible(createKooButtonWithSmiley));
		Assert.assertFalse(!isElementVisible(createKooFAB_Button));
		if (isElementVisible(KooCardContent)) {
			isElementVisible(KooCardContent);
			swipeToSeeUpsideElementsOfScreen(1);
			Assert.assertTrue(isElementPresent(ProfileBackButton));
			click(ProfileBackButton);
		} else {

			Thread.sleep(2000);
			if (isElementVisible(nooKooText)) {
				Assert.assertTrue(isElementVisible(nooKooText));
				Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("No Koos"));
				if (isElementVisible(requestToKoo)) {
					Assert.assertTrue(isElementVisible(requestToKoo));
					Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request to Koo"));
					click(requestToKoo);
					waitForVisibility(requestKooSend);
					Assert.assertTrue(isElementVisible(requestKooSend));
					Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request Sent!"));
					Assert.assertTrue(isElementVisible(tickSendIcon));
					swipeToSeeUpsideElementsOfScreen(1);
					Assert.assertTrue(isElementPresent(ProfileBackButton));
					click(ProfileBackButton);
					waitForVisibility(KooCardContent);
					isElementVisible(KooCardContent);
					swipeToSeeUpsideElementsOfScreen(1);
					Assert.assertTrue(isElementPresent(ProfileBackButton));
					click(ProfileBackButton);
				} else {
					Thread.sleep(2000);
				}

			}

		}

		click(backButton);
		waitForVisibility(followingButton);
		click(followingButton);
		waitForVisibility(backButton);
		click(backButton);
		waitForVisibility(followingButton);
		click(followingButton);
		waitForVisibility(followingPage);
		Assert.assertTrue(isElementPresent(followingPage));
		Assert.assertTrue(isElementPresent(backButton));
		Assert.assertTrue(isElementPresent(Followerpeople1));
		waitForVisibility(Followerpeople1_Name);
		//Assert.assertTrue(isElementPresent(Followerpeople1_Picture));
		Assert.assertTrue(isElementPresent(Followerpeople1_Name));
		Assert.assertTrue(isElementPresent(Followerpeople1_Handle_Name));
		click(Followerpeople1_Name);
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertFalse(!isElementVisible(createKooButtonWithSmiley));
		Assert.assertFalse(!isElementVisible(createKooFAB_Button));
		if (isElementVisible(KooCardContent)) {
			isElementVisible(KooCardContent);
			swipeToSeeUpsideElementsOfScreen(1);
			Assert.assertTrue(isElementPresent(ProfileBackButton));
			click(ProfileBackButton);
		} else {

			Thread.sleep(2000);
			if (isElementVisible(nooKooText)) {
				Assert.assertTrue(isElementVisible(nooKooText));
				Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("No Koos"));
				if (isElementVisible(requestToKoo)) {
					Assert.assertTrue(isElementVisible(requestToKoo));
					Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request to Koo"));
					click(requestToKoo);
					waitForVisibility(requestKooSend);
					Assert.assertTrue(isElementVisible(requestKooSend));
					Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request Sent!"));
					Assert.assertTrue(isElementVisible(tickSendIcon));
					swipeToSeeUpsideElementsOfScreen(1);
					Assert.assertTrue(isElementPresent(ProfileBackButton));
					click(ProfileBackButton);
					waitForVisibility(KooCardContent);
					isElementVisible(KooCardContent);
					swipeToSeeUpsideElementsOfScreen(1);
					Assert.assertTrue(isElementPresent(ProfileBackButton));
					click(ProfileBackButton);
				} else {
					Thread.sleep(2000);
				}

			}

		}

		Thread.sleep(2000);
		waitForVisibility(Followerpeople2);
		Assert.assertTrue(isElementPresent(Followerpeople2));
		Assert.assertTrue(isElementPresent(Followerpeople3));
		Assert.assertTrue(isElementPresent(Followerpeople4));
		Assert.assertTrue(isElementPresent(Followerpeople5));
		//Assert.assertTrue(isElementPresent(Followerpeople4_Picture));
		Assert.assertTrue(isElementPresent(Followerpeople4_Name));
		Assert.assertTrue(isElementPresent(Followerpeople4_Handle_Name));
		click(Followerpeople4_Name);
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertFalse(!isElementVisible(createKooButtonWithSmiley));
		Assert.assertFalse(!isElementVisible(createKooFAB_Button));
		if (isElementVisible(KooCardContent)) {
			isElementVisible(KooCardContent);
			swipeToSeeUpsideElementsOfScreen(1);
			Assert.assertTrue(isElementPresent(ProfileBackButton));
			click(ProfileBackButton);
		} else {

			Thread.sleep(2000);
			if (isElementVisible(nooKooText)) {
				Assert.assertTrue(isElementVisible(nooKooText));
				Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("No Koos"));
				if (isElementVisible(requestToKoo)) {
					Assert.assertTrue(isElementVisible(requestToKoo));
					Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request to Koo"));
					click(requestToKoo);
					waitForVisibility(requestKooSend);
					Assert.assertTrue(isElementVisible(requestKooSend));
					Assert.assertTrue(nooKooText.getText().equalsIgnoreCase("Request Sent!"));
					Assert.assertTrue(isElementVisible(tickSendIcon));
					swipeToSeeUpsideElementsOfScreen(1);
					Assert.assertTrue(isElementPresent(ProfileBackButton));
					click(ProfileBackButton);
					waitForVisibility(KooCardContent);
					isElementVisible(KooCardContent);
					swipeToSeeUpsideElementsOfScreen(1);
					Assert.assertTrue(isElementPresent(ProfileBackButton));
					click(ProfileBackButton);
				} else {
					Thread.sleep(2000);
				}

			}

		}


		click(backButton);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
	}

	/*public void IVerifyKoosShouldShowInTimelineBasis() throws InterruptedException {
		waitForVisibility(createKooFAB_Button);
		Assert.assertTrue(isElementPresent(createKooFAB_Button));
		click(createKooFAB_Button);
		Thread.sleep(4000);
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
		waitForVisibility(CreatePollField);
		CreatePollField.sendKeys("how is your day going");
		clickAndroidDeviceBackBttn();
		waitForVisibility(CreatePollOptions1);
		CreatePollOptions1.sendKeys("Good");
		CreatePollOptions2.sendKeys("bad");
		click(PollPostButton);
		Thread.sleep(5000);
		swipeToSeeUpsideElementsOfScreen(2);
		waitForVisibility(KooTime);
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(KooTime.getText().equalsIgnoreCase("Just Now"));
		Assert.assertTrue(isElementPresent(poll1));
		Assert.assertTrue(isElementPresent(PollOptions));
		Assert.assertTrue(isElementPresent(DeadlinePoll));
		Assert.assertTrue(isElementPresent(KooCardLikeButton));
		Assert.assertTrue(isElementPresent(KooCardCommentButton));
		Assert.assertTrue(isElementPresent(KooCardReeKooButton));
		Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
		Assert.assertTrue(isElementPresent(KooCardShareButton));
		Assert.assertTrue(isElementPresent(DeadlinePoll));
		clickAndroidDeviceBackBttn();
		swipeToSeeUpsideElementsOfScreen(2);
		IVerifyTappingUserStatsIconAndVerifyStatsScreen();
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(KooLabelLayout1));
		Assert.assertTrue(isElementPresent(KooCardContent));
		Assert.assertTrue(isElementPresent(ReekooImages));
		Assert.assertTrue(isElementPresent(ReeKooButton));
		click(ReeKooButton);
		waitForVisibility(ReeKooWithOutComment);
		Assert.assertTrue(isElementPresent(ReeKooWithOutComment));
		Assert.assertTrue(isElementPresent(ReeKooWithComment));
		Assert.assertTrue(isElementPresent(ReeKooWithOutCommenttext));
		Assert.assertTrue(isElementPresent(ReeKooWithCommenttext));
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
		click(KooCardWhatsaapShareButton);
		waitForVisibility(SharinglistContainer);
		Thread.sleep(2000);
		clickAndroidDeviceBackBttn();
		waitForVisibility(KooCardCommentButton);
		click(KooCardCommentButton);
		waitForVisibility(CommentField);
		Assert.assertTrue(isElementPresent(CommentField));
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(KooLabelLayout1));
		Assert.assertFalse(!isElementVisible(ThreadsButton));
		Assert.assertTrue(isElementPresent(createKooFAB_Button));
		click(createKooFAB_Button);
		waitForVisibility(CreatePollPage);
		Assert.assertTrue(isElementPresent(CreatePollPage));
		sendKeys(CreatePollField, "who is gonna win todays IPL match");
		click(PollPostButton);
		Thread.sleep(10000);
		clickAndroidDeviceBackBttn();
		swipeToSeeUpsideElementsOfScreen(2);
		IVerifyTappingUserStatsIconAndVerifyStatsScreen();
		swipeToSeeDownsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(KooTime));
		//		Assert.assertTrue(KooTime.getText().equalsIgnoreCase("Just Now"));

	}*/

	public void IVerifyInTappingTheKooCardUserShouldEnterKooDetailscreen() throws InterruptedException {
		waitForVisibility(content1);
		click(content1);
		waitForVisibility(KooCardDetail);
		Assert.assertTrue(isElementPresent(KooCardDetail));
		Assert.assertTrue(isElementPresent(createKooBackButton));
		click(createKooBackButton);
		Thread.sleep(2000);
		waitForVisibility(KooLabelLayout1);
		Assert.assertTrue(isElementPresent(KooLabelLayout1));
	}


	public void IVerifyKoosShouldShowInTimelineBasisLatestKooShouldShowOnTop() throws InterruptedException {
		Assert.assertTrue(isElementPresent(KooTime));
		//		String Timeof1Koo = koo1Time.getText();
		//		String Timeof2Koo = koo2Time.getText();
		int TimeofKoo1 = Integer.parseInt(koo1Time.getText());
		int TimeofKoo2 = Integer.parseInt(koo2Time.getText());
		//		Assert.assertTrue(Timeof1Koo!=Timeof2Koo );
		Assert.assertTrue(TimeofKoo1 < TimeofKoo2);
	}

	public void IVerifyTappingOnTheOptionButtonDeleteKooShouldShow() throws InterruptedException {
		waitForVisibility(dropDownButton);
		Assert.assertTrue(isElementPresent(dropDownButton));
		Assert.assertTrue(isElementPresent(content1));
		click(dropDownButton);
		waitForVisibility(deleteButton);
		click(deleteButton);
		waitForVisibility(ConfirmationMessage);
		Assert.assertTrue(isElementPresent(ConfirmationMessage));
		Assert.assertTrue(isElementPresent(YesConfirmationButton));
		click(YesConfirmationButton);
		waitForVisibility(dropDownButton);
		Assert.assertTrue(isElementPresent(dropDownButton));
		Assert.assertTrue(isElementPresent(content1));
		click(dropDownButton);
		waitForVisibility(deleteButton);
		click(deleteButton);
		waitForVisibility(ConfirmationMessage);
		Assert.assertTrue(isElementPresent(ConfirmationMessage));
		Assert.assertTrue(isElementPresent(YesConfirmationButton));
		click(YesConfirmationButton);


	}

	public String goBackToFeedPageAndLikeAnyKoo() throws Exception {
		clickAndroidDeviceBackBttn();
		swipeToSeeUpsideElementsOfScreen(1);
		waitForVisibility(content1);
		Assert.assertTrue(isElementPresent(content1));
		String contentCheck = content1.getText();
		swipeToSeeDownsideElementsOfScreen(TestUtils.getRandomInRange(1, 10));
		scrollToElement(KooCardLikeButton, "up");
		Assert.assertTrue(isElementPresent(KooCardLikeButton));
		click(likeButton);
		Thread.sleep(1000);
		swipeToSeeUpsideElementsOfScreen(2);
		return contentCheck;
	}

	public void goBackToFeedPageAndCommentAnyKoo() throws Exception {
		clickAndroidDeviceBackBttn();
		swipeToSeeUpsideElementsOfScreen(1);
		//	waitForVisibility(content1);
		//Assert.assertTrue(isElementPresent(content1));
		//String contentCheck = content1.getText();
		swipeToSeeDownsideElementsOfScreen(TestUtils.getRandomInRange(1, 10));
		if (!isElementPresent(KooCardCommentButton)) {
			swipeToDownsideTillElementPresent(KooCardCommentButton, 1);
		}
		Assert.assertTrue(isElementPresent(KooCardCommentButton));
		click(KooCardCommentButton);
		Thread.sleep(2000);
		swipeToDownsideTillElementPresent(commentFieldInKoo, 1);
		click(commentFieldInKoo);
		sendKeys(createKooField, "This is new Comment");
		click(kooPostButton);
		Thread.sleep(4000);
		clickAndroidDeviceBackBttn();
		swipeToSeeUpsideElementsOfScreen(2);
	}

	public void IVerifyLikedKoosShouldDisplayOnLikedSection() throws Exception {
		waitForVisibility(likeIconWithCount);
		Assert.assertTrue(isElementPresent(likeIconWithCount));
		click(likeIconWithCount);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(likeIcon);
		Assert.assertTrue(isElementPresent(likeIcon));
		Assert.assertTrue(isElementPresent(likeCount));
		Assert.assertTrue(isElementVisible(viewTrendingKooText));
		if (isElementPresent(nooKooText)) {
			IVerifyForTrendingKooButton();
			String contentofLikedKoo = goBackToFeedPageAndLikeAnyKoo();
			iNavigateToProfileScreen();
			waitForVisibility(likeIconWithCount);
			click(likeIconWithCount);
			Thread.sleep(1000);
			System.out.println("LikeCounts are " + removeAllSpacesAndSpecialChar(likeCount.getText()));
			Assert.assertTrue(removeAllSpacesAndSpecialChar(likeCount.getText()).equals("1"));
			Assert.assertTrue(isElementPresent(content1));
			//Assert.assertTrue(content1.getText().equalsIgnoreCase(contentofLikedKoo));
		}
		Assert.assertTrue(isElementPresent(likeIconWithCount));
		int likeCountBefore = Integer.parseInt(removeAllSpacesAndSpecialChar(likeCount.getText()));
		String contentofLikedKoo = goBackToFeedPageAndLikeAnyKoo();
		System.out.println("Content of liked Koo are: " + contentofLikedKoo);
		iNavigateToProfileScreen();
		waitForVisibility(likeIconWithCount);
		click(likeIconWithCount);
		Thread.sleep(1000);
		int likeCountAfter = Integer.parseInt(removeAllSpacesAndSpecialChar(likeCount.getText()));
		Assert.assertTrue(likeCountBefore < likeCountAfter);
		Assert.assertTrue(isElementPresent(content1));
		System.out.println("Content of Koos are: " + content1.getText());
		//Assert.assertTrue(content1.getText().equalsIgnoreCase(contentofLikedKoo));
		scrollToElement(KooCardLikeButton, "up");
		Thread.sleep(1000);
		click(KooCardLikeButton);
		Thread.sleep(2000);

	}

	public void IVerifyTheKoosPresentInLikedSection() throws Exception {
		Thread.sleep(2000);
		scrollToElement(KooCardLikeButton, "up");
		Assert.assertTrue(isElementPresent(KooCardLikeButton));
		Assert.assertTrue(isElementPresent(KooCardCommentButton));
		Assert.assertTrue(isElementPresent(KooCardReeKooButton));
		Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
		Assert.assertTrue(isElementPresent(KooCardShareButton));
		Assert.assertTrue(isElementPresent(content1));
		swipeToSeeUpsideElementsOfScreen(1);
		scrollToElement(KooTime, "down");
		Assert.assertTrue(isElementPresent(KooProfilePic));
		Assert.assertTrue(isElementPresent(profileName));
		Assert.assertTrue(isElementPresent(profileHandel));
		Assert.assertTrue(isElementPresent(kooProfession));
		Assert.assertTrue(isElementPresent(KooTime));
	}

	public void IVerifyByTappingOnTheKooInLikedSection() throws InterruptedException {
		waitForVisibility(content1);
		Assert.assertTrue(isElementPresent(content1));
		click(content1);
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(2);
		swipeToSeeUpsideElementsOfScreen(2);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(likeIconWithCount));

	}

	public void IVerifyUserShouldAbleToLikeAndDislikeTheKooAndVerifyRespectiveCount() throws Exception {
		Thread.sleep(2000);
		swipeToSeeDownsideElementsOfScreen(1);
		scrollToElement(KooCardLikeButton, "up");
		Assert.assertTrue(isElementPresent(KooCardLikeButton));
		int likecountBefore = Integer.parseInt(likeButton.getText());
		click(likeButton);
		int likecountAfter = Integer.parseInt(likeButton.getText());
		Assert.assertTrue(likecountAfter == likecountBefore - 1);
		int likecountBefore1 = Integer.parseInt(likeButton.getText());
		click(likeButton);
		int likecountAfter1 = Integer.parseInt(likeButton.getText());
		Assert.assertTrue(likecountAfter1 == likecountBefore1 + 1);
		click(likeButton);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);

	}

	public void IVerifyForTrendingKooButton() throws InterruptedException {

		Assert.assertTrue(isElementVisible(viewTrendingKooText));
		click(viewTrendingKooText);
		waitForVisibility(trendingKooPage);
		Assert.assertTrue(isElementVisible(trendingKooPage));
		Assert.assertTrue(trendingKooPage.getText().equalsIgnoreCase("Trending Koos (24 hours)"));
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		//	clickAndroidDeviceBackBttn();
	}

	public void IVerifyUserShouldAbleToCommentToTheKooAndVerifyCommentCount() throws Exception {
		//IVerifyTappingUserStatsIconAndVerifyStatsScreen();
		Assert.assertTrue(isElementPresent(commentIconWithCount));
		click(commentIconWithCount);
		Thread.sleep(2000);
		if (isElementPresent(nooKooText)) {
			IVerifyForTrendingKooButton();
			goBackToFeedPageAndCommentAnyKoo();
			iNavigateToProfileScreen();
			waitForVisibility(commentIconWithCount);
			click(commentIconWithCount);
			Thread.sleep(1000);
			System.out.println("Comment counts are " + removeAllSpacesAndSpecialChar(commentCountInProfile.getText()));
			Assert.assertTrue(removeAllSpacesAndSpecialChar(commentCountInProfile.getText()).equals("1"));
		}

		int CommentcountBefore = 0;
		if (commentCountInProfile.getText().equals("")) {
			CommentcountBefore = 0;

		} else {
			CommentcountBefore = Integer.parseInt(removeAllSpacesAndSpecialChar(commentCountInProfile.getText()));

		}

		goBackToFeedPageAndCommentAnyKoo();
		iNavigateToProfileScreen();
		waitForVisibility(commentIconWithCount);
		click(commentIconWithCount);
		Thread.sleep(1000);
		int commentCountAfter = Integer.parseInt(removeAllSpacesAndSpecialChar(commentCountInProfile.getText()));
		Assert.assertTrue(CommentcountBefore < commentCountAfter);

	}

	public void IVerifyTappingOnAnyRekooUserShouldNavigateToKoosDetailedScreen() throws Exception {
		swipeToSeeDownsideElementsOfScreen(1);
		scrollToElement(content1, "up");
		click(content1);
		waitForVisibility(createKooBackButton);
		Assert.assertTrue(isElementPresent(createKooBackButton));
		click(createKooBackButton);
		waitForVisibility(commentIconWithCount);
		Assert.assertTrue(isElementPresent(commentIconWithCount));
		click(content1);
		waitForVisibility(createKooBackButton);
		Assert.assertTrue(isElementPresent(createKooBackButton));
		clickAndroidDeviceBackBttn();
		waitForVisibility(commentIconWithCount);
		Assert.assertTrue(isElementPresent(commentIconWithCount));

	}

	public void IVerifyTappingOnTheOptionButtonDeleteKooShouldShowForUserRekooedKoos() throws InterruptedException {
		waitForVisibility(dropDownButton);
		Assert.assertTrue(isElementPresent(dropDownButton));
		Assert.assertTrue(isElementPresent(content1));
		click(dropDownButton);
		waitForVisibility(deleteButton);
		click(deleteButton);
		waitForVisibility(ConfirmationMessage);
		Assert.assertTrue(isElementPresent(ConfirmationMessage));
		Assert.assertTrue(isElementPresent(YesConfirmationButton));
		click(YesConfirmationButton);
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(dropDownButton);
		Assert.assertTrue(isElementPresent(dropDownButton));
		Assert.assertTrue(isElementPresent(content1));
		click(dropDownButton);
		waitForVisibility(deleteButton);
		click(deleteButton);
		waitForVisibility(ConfirmationMessage);
		Assert.assertTrue(isElementPresent(ConfirmationMessage));
		Assert.assertTrue(isElementPresent(YesConfirmationButton));
		click(YesConfirmationButton);
		swipeToSeeUpsideElementsOfScreen(3);


	}

	public void IVerifyByDefaultProfileViewIconShouldNotShow() throws Exception {
		if (new BasePage().isElementVisible(profileViewButton)) {
			Assert.assertTrue(isElementPresent(profileViewIcon));
			Assert.assertTrue(isElementPresent(profileViewCount));
			new BasePage().click(profileViewButton);

			if (new BasePage().isElementPresent(profileViewPage)) {
				Thread.sleep(2000);
				Assert.assertTrue(isElementPresent(profileName));
				Assert.assertTrue(isElementPresent(profileHandel1));
				Assert.assertTrue(isElementPresent(profileAbout));
				Assert.assertTrue(isElementPresent(Follow_and_unfollowButton));
				click(Follow_and_unfollowButton);
				if (new BasePage().isElementVisible(ConfirmationMessage)) {
					Thread.sleep(2000);
					Assert.assertTrue(isElementPresent(YesConfirmationButton));

					if (new BasePage().isElementPresent(YesConfirmationButton)) {
						Thread.sleep(2000);
						new BasePage().click(YesConfirmationButton);
					}
				} else {
					throw new Exception("Element" + YesConfirmationButton + "not found");
				}
				Thread.sleep(5000);
				new BasePage().click(profileName);
				Assert.assertTrue(isElementPresent(ProfileNameHeading));
				clickAndroidDeviceBackBttn();
				Assert.assertTrue(isElementPresent(profileViewPage));

			} else {
				throw new Exception("Element" + profileViewPage + "not found");
			}
		} else {
			throw new Exception("Element" + profileViewButton + "not found");
		}
	}

	public void IVerifyByLoggingOut() throws InterruptedException {
		Thread.sleep(2000);
		swipeToUpsideTillElementPresent(setting, 8);
		waitForVisibility(setting);
		click(setting);
		waitForVisibility(logoutTab);
		Assert.assertTrue(isElementPresent(logoutTab));
		click(logoutTab);
		Thread.sleep(2000);
		waitForVisibility(logoutButton);
		Assert.assertTrue(isEnabled(logoutButton));
		Assert.assertTrue(isElementPresent(logoutButton));
		click(logoutButton);
		waitForVisibility(logInPage);
		Assert.assertTrue(isElementPresent(logInPage));
		click(logInButton);

	}

	public void IVerifyByTapOnSearchIconUser() throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		click(SearchButton);
		waitForVisibility(SearchPage);
		Assert.assertTrue(isElementPresent(SearchPage));
		Assert.assertTrue(isElementPresent(MicButton));
		Assert.assertTrue(isElementPresent(SearchField));
		Assert.assertTrue(isElementPresent(PeopleButton));
		Assert.assertTrue(isElementPresent(HashtagButton));
		Assert.assertTrue(isElementPresent(KooButton));
		click(SearchField);
		waitForVisibility(SearchField);
		SearchField.clear();
		SearchField.sendKeys("tupdoer");
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(PeopleSearched1));
		click(profileHandel1);
		swipeToSeeDownsideElementsOfScreen(2);
		swipeToSeeUpsideElementsOfScreen(2);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		Thread.sleep(2000);
		waitForVisibility(HomeMainScreen);
		Assert.assertTrue(isElementPresent(HomeMainScreen));
		click(Profileicon);
		waitForVisibility(ProfileNameHeading);
		Assert.assertTrue(isElementPresent(ProfileNameHeading));
		Assert.assertTrue(isElementPresent(setting));
		IVerifyByLoggingOut();

	}


	public void IVerifyMentionTabFunctionality() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(hashtagIconWithCount));
		click(hashtagIconWithCount);
		waitForVisibility(createKooFAB_Button);
		Assert.assertTrue(isElementPresent(createKooFAB_Button));
		click(createKooFAB_Button);
		waitForVisibility(CreatePollField);
		CreatePollField.sendKeys("@test2 how are you");
		click(PollPostButton);
		Thread.sleep(2000);

	}

	public void IVerifyMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(1);
		Assert.assertTrue(isElementPresent(hashtagIconWithCount));
		click(hashtagIconWithCount);
		waitForVisibility(content1);
		Assert.assertTrue(content1.getText().equalsIgnoreCase("@test2 how are you"));
		click(content1);
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		waitForVisibility(content1);
		Assert.assertTrue(content1.getText().equalsIgnoreCase("@test2 how are you"));
		Assert.assertTrue(isElementPresent(KooCardLikeButton));
		Assert.assertTrue(isElementPresent(KooCardCommentButton));
		Assert.assertTrue(isElementPresent(KooCardReeKooButton));
		Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
		Assert.assertTrue(isElementPresent(KooCardShareButton));
		Assert.assertTrue(isElementPresent(content1));
		Assert.assertTrue(isElementPresent(KooProfilePic));
		Assert.assertTrue(isElementPresent(profileName));
		Assert.assertTrue(isElementPresent(profileHandel));
		Assert.assertTrue(isElementPresent(kooProfession));
		Assert.assertTrue(isElementPresent(KooTime));
		click(likeButton);
		waitForVisibility(likeIconWithCount);
		Assert.assertTrue(isElementPresent(likeIconWithCount));
		click(likeButton);
		waitForVisibility(KooCardWhatsaapShareButton);
		Assert.assertTrue(isElementPresent(KooCardWhatsaapShareButton));
		click(KooCardWhatsaapShareButton);
		waitForVisibility(SharinglistContainer);
		Assert.assertTrue(isElementPresent(SharinglistContainer));
		Assert.assertTrue(isElementPresent(SharingListTitle));
		Assert.assertTrue(isElementPresent(SharingList));
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		Assert.assertTrue(isElementPresent(ReeKooButton));
		click(ReeKooButton);
		waitForVisibility(ReeKooWithOutComment);
		Assert.assertTrue(isElementPresent(ReeKooWithOutComment));
		Assert.assertTrue(isElementPresent(ReeKooWithComment));
		Assert.assertTrue(isElementPresent(ReeKooWithOutCommenttext));
		Assert.assertTrue(isElementPresent(ReeKooWithCommenttext));
		click(ReeKooWithOutComment);
		waitForVisibility(ReeKooCount);
		ReeKooCount.click();
		waitForVisibility(UndoKooButton);
		Assert.assertTrue(isElementPresent(UndoKooButton));
		UndoKooButton.click();
		swipeToSeeUpsideElementsOfScreen(3);

	}

	public void IVerifyUserADeletedMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile() throws InterruptedException {
		swipeToSeeDownsideElementsOfScreen(1);
		waitForVisibility(dropDownButton);
		Assert.assertTrue(isElementPresent(dropDownButton));
		Assert.assertTrue(isElementPresent(content1));
		click(dropDownButton);
		waitForVisibility(deleteButton);
		click(deleteButton);
		waitForVisibility(ConfirmationMessage);
		Assert.assertTrue(isElementPresent(ConfirmationMessage));
		Assert.assertTrue(isElementPresent(YesConfirmationButton));
		click(YesConfirmationButton);
		Thread.sleep(1000);
		swipeToSeeUpsideElementsOfScreen(1);

	}

	public void IVerifyDeletedMentionedKoosShouldDisplayInUserBMentionsSectionOnProfile() throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(1);
		waitForVisibility(hashtagIconWithCount);
		Assert.assertTrue(isElementPresent(hashtagIconWithCount));
		click(hashtagIconWithCount);
		waitForVisibility(content1);
		Assert.assertTrue(isElementVisible(content1));


	}

	public void IVerifyLogOut() throws InterruptedException {

		waitForVisibility(logoutTab);
		Assert.assertTrue(isElementPresent(logoutTab));
		click(logoutTab);
		Thread.sleep(2000);
		waitForVisibility(logoutButton);
		Assert.assertTrue(isEnabled(logoutButton));
		Assert.assertTrue(isElementPresent(logoutButton));
		click(logoutButton);
		waitForVisibility(logInPage);
		Assert.assertTrue(isElementPresent(logInPage));
		click(logInButton);

	}

	public void IVerifyByLogOut() throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibility(logoutTab);
		Assert.assertTrue(isElementPresent(logoutTab));
		click(logoutTab);

	}

	// made by sumeet
	public void iVerifyMoreInfoAndLessInfoButtonSettings() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if (isElementPresent(MoreInfoButton)) {
				Assert.assertTrue(isElementPresent(MoreInfoButton));
				click(MoreInfoButton);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

		Thread.sleep(2000);
		try {
			if (isElementPresent(MoreInfoButton)) {
				Assert.assertTrue(isElementPresent(MoreInfoButton));
				click(MoreInfoButton);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public void iVerifyTappingOnBackButtonUserShouldNavigateBack() throws Exception {
		Thread.sleep(2000);
		if (isElementPresent(ProfileBackButton)) {
			Assert.assertTrue(isElementPresent(ProfileBackButton));
			click(ProfileBackButton);
		}
	}

	public void iVerifyclickonEditprofile() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if (isElementPresent(EditProfile)) {
				Assert.assertTrue(isElementPresent(EditProfile));
				click(EditProfile);
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
	public void iclickonaEditprofilenamefield() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if (isElementPresent(NameProfile)) {
				Assert.assertTrue(isElementPresent(NameProfile));
				click(NameProfile);

			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public void IclickonalineEditinputname() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if (isElementPresent(lineEdit)) {
				Assert.assertTrue(isElementPresent(lineEdit));
				click(lineEdit);
				lineEdit.sendKeys("Mani");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
		Thread.sleep(2000);
	}

	public void iVerifyclickonSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if (isElementPresent(SaveButton)) {
				Assert.assertTrue(isElementPresent(SaveButton));
				click(SaveButton);

			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public void iclickonhandlenameButtonandinputhandlename() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if (isElementPresent(handleName)) {
				Assert.assertTrue(isElementPresent(handleName));
				click(handleName);

			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
	public void iclickonprofessionnameButton() throws InterruptedException {
		Thread.sleep(2000);
		try {
			if (isElementPresent(ProfessionName)) {
				Assert.assertTrue(isElementPresent(ProfessionName));
				click(ProfessionName);
				Thread.sleep(2000);
				click(ProfessionName);

			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}







}