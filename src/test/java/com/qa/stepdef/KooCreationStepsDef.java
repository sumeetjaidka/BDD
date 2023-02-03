package com.qa.stepdef;

import com.qa.pages.EditProfilePage;
import com.qa.pages.KooCreationPage;
import com.qa.pages.LanguageSelectionPage;

import io.cucumber.java.en.Then;

public class KooCreationStepsDef {


	@Then("I Verify Whats on your mind text is displayed in the selected language")
	public void i_verify_whats_on_your_mind_text_is_displayed_in_the_selected_language() throws InterruptedException {
		new KooCreationPage().verify_whats_on_your_mind_text_is_displayed_in_the_selected_language() ;  
	}
	
	@Then("I navigate to Koo Creation screen")
	public void iNavigateToKooCreationScreen() throws InterruptedException {
		new KooCreationPage().navigateToKooCreationScreen();
	}

	@Then("I navigate to Koo Landing page")
	public void iNavigateToKooLandingPage() throws InterruptedException {
		new KooCreationPage().navigateToKooLandingPage();
	}

	@Then("I Verify the post button on the top right of the screen")
	public void i_verify_the_post_button_on_the_top_right_of_the_screen() {
		new KooCreationPage().verify_the_post_button_on_the_top_right_of_the_screen(); 
	}

	@Then("I Verify the back button on the top left of the screen")
	public void i_verify_the_back_button_on_the_top_left_of_the_screen() {
		new KooCreationPage().verify_the_back_button_on_the_top_left_of_the_screen(); 
	}

	@Then("I Verify the text, audio and video icon below the koo title box")
	public void i_verify_the_text_audio_and_video_icon_below_the_koo_title_box() {
		new KooCreationPage().verify_the_text_audio_and_video_icon_below_the_koo_title_box();  
	}

	@Then("I Verify the link, images and title character count at the bottom of the screen")
	public void i_verify_the_link_images_and_title_character_count_at_the_bottom_of_the_screen() {
		new KooCreationPage().verify_the_link_images_and_title_character_count_at_the_bottom_of_the_screen() ;  
	}

	@Then("I Verify the profile picture to the left of the title box")
	public void i_verify_the_profile_picture_to_the_left_of_the_title_box() {
		new KooCreationPage().verify_the_profile_picture_to_the_left_of_the_title_box();   
	}

	@Then("I Verify on tapping on title field keyboard should open and on tapping anywhere else apart from keyboard and title field it should disappear.")
	public void i_verify_on_tapping_on_title_field_keyboard_should_open_and_on_tapping_anywhere_else_apart_from_keyboard_and_title_field_it_should_disappear() throws InterruptedException {
		new KooCreationPage().verify_on_tapping_on_title_field_keyboard_should_open_and_on_tapping_anywhere_else_apart_from_keyboard_and_title_field_it_should_disappear();
	}


	@Then("I Verify on tapping on mic or video icon for the first time user should get permissions popup after allowing user should navigate to recording screen.")
	public void i_verify_on_tapping_on_tapping_on_mic_or_video_icon_for_the_first_time_user_should_get_permissions_popup_after_allowing_user_should_navigate_to_recording_screen() throws InterruptedException {
		new KooCreationPage().verify_on_tapping_on_tapping_on_mic_or_video_icon_for_the_first_time_user_should_get_permissions_popup_after_allowing_user_should_navigate_to_recording_screen();
	}

	@Then("I Verify on tapping on images icon user should navigate to gallery and on tapping on back button user should navigate to koo creation screen")
	public void i_verify_on_tapping_on_images_icon_user_should_navigate_to_gallery_and_on_tapping_on_back_button_user_should_navigate_to_koo_creation_screen() throws InterruptedException {
		new KooCreationPage().verify_on_tapping_on_images_icon_user_should_navigate_to_gallery_and_on_tapping_on_back_button_user_should_navigate_to_koo_creation_screen();
	}

	@Then("I Verify on long press in the link field user is able to paste the copied link.")
	public void i_verify_on_long_press_in_the_link_field_user_is_able_to_paste_the_copied_link() {
		new KooCreationPage().verify_on_long_press_in_the_link_field_user_is_able_to_paste_the_copied_link();
	}


	@Then("I Verify on tapping the cancel button beside the link field the field should be cleared.")
	public void i_verify_on_tapping_the_cancel_button_beside_the_link_field_the_field_should_be_cleared() {
		new KooCreationPage().verify_on_tapping_the_cancel_button_beside_the_link_field_the_field_should_be_cleared();
	}

	@Then("I Verify on typing or pasting any link save button is enabled.")
	public void i_verify_on_typing_or_pasting_any_link_save_button_is_enabled() {
		new KooCreationPage().verify_on_typing_or_pasting_any_link_save_button_is_enabled();
	}

	@Then("I Verify on tapping on cancel button the link field is closed.")
	public void i_verify_on_tapping_on_cancel_button_the_link_field_is_closed() throws InterruptedException {
		new KooCreationPage().verify_on_tapping_on_cancel_button_the_link_field_is_closed();
	}

	@Then("I Verify user is able to post koo only by entering title.")
	public void i_verify_user_is_able_to_post_koo_only_by_entering_title() throws Exception {
		new KooCreationPage().verify_user_is_able_to_post_koo_only_by_entering_title();
	}

	@Then("I Verify user is able to post koo only by attaching link.")
	public void i_verify_user_is_able_to_post_koo_only_by_attaching_link() throws InterruptedException {
	new KooCreationPage().verify_user_is_able_to_post_koo_only_by_attaching_link();      
	}

	@Then("I Verify user is able to rekoo with comment on tapping on rekoo button and selecting rekoo with comment.")
	public void i_verify_user_is_able_to_rekoo_with_comment_on_tapping_on_rekoo_button_and_selecting_rekoo_with_comment() throws Exception {
	new KooCreationPage().verify_user_is_able_to_rekoo_with_comment_on_tapping_on_rekoo_button_and_selecting_rekoo_with_comment();
	}

	@Then("I Verify user is able to comment on tapping on comment button.")
	public void i_verify_user_is_able_to_comment_on_tapping_on_comment_button() throws InterruptedException {
		new KooCreationPage().verify_user_is_able_to_comment_on_tapping_on_comment_button();
	}

	@Then("I Verify user is able to see youtube icon at bottom of the screen.")
	public void i_verify_user_is_able_to_see_youtube_icon_at_bottom_of_the_screen() {
		new KooCreationPage().verify_user_is_able_to_see_youtube_icon_at_bottom_of_the_screen();
	}

	@Then("I Verify user is able to see the poll icon at the bottom of the screen and Verify on tapping poll icon user should navigate to poll creation screen.")
	public void i_verify_user_is_able_to_see_the_poll_icon_at_the_bottom_of_the_screen() throws InterruptedException {
		new KooCreationPage().verify_user_is_able_to_see_the_poll_icon_at_the_bottom_of_the_screen();
	}

	@Then("I Verify on title box by default poll title should be empty.")
	public void i_verify_on_title_box_by_default_poll_title_should_be_empty() {
		new KooCreationPage().verify_on_title_box_by_default_poll_title_should_be_empty();
	}

	@Then("I Verify by default there should be two poll options tapping on plus icon options box should increase.")
	public void i_verify_by_default_there_should_be_poll_options_tapping_on_icon_options_box_should_increase() {
		new KooCreationPage().verify_by_default_there_should_be_poll_options_tapping_on_icon_options_box_should_increase();
	}

	@Then("I Verify User should be able to create poll with min two and max four options.")
	public void i_verify_user_should_be_able_to_create_poll_with_min_and_max_options() throws InterruptedException {
		new KooCreationPage().verify_user_should_be_able_to_create_poll_with_min_and_max_options();
	}

	@Then("I Verify user is able to enter upto thirty-five characters on options box.")
	public void i_verify_user_is_able_to_enter_upto_characters_on_options_box() throws InterruptedException {
		new KooCreationPage().verify_user_is_able_to_enter_upto_thirty_five_characters_on_options_box();
	}

	@Then("I Verify there should be cancel button on options section.")
	public void i_verify_there_should_be_cancel_button_on_options_section() {
		new KooCreationPage().verify_there_should_be_cancel_button_on_options_section();
	}

	@Then("I After entering the text inside options box and tapping on cancel button a pop-up should display.")
	public void i_after_entering_the_text_inside_options_box_and_tapping_on_cancel_button_a_pop_up_should_display() {
		new KooCreationPage().verify_after_entering_the_text_inside_options_box_and_tapping_on_cancel_button_a_pop_up_should_display();
	}

	@Then("I Verify by default poll duration should be one day.")
	public void i_verify_by_default_poll_duration_should_be_day() {
		new KooCreationPage().verify_by_default_poll_duration_should_be_day();
	}

	@Then("I Verify user should not be able to post poll without title.")
	public void i_verify_user_should_not_be_able_to_post_poll_without_title() throws InterruptedException {
		new KooCreationPage().verify_user_should_not_be_able_to_post_poll_without_title();
	}


	@Then("I Verify user should able to edit poll until there are no action on poll.")
	public void i_verify_user_should_able_to_edit_poll_until_there_are_no_action_on_poll() throws InterruptedException {
		new KooCreationPage().verify_user_should_able_to_edit_poll_until_there_are_no_action_on_poll() ;
	}

	@Then("I Verify on selecting audio or video options while poll creation, poll creation should be disabled.")
	public void i_verify_on_selecting_audio_or_video_options_while_poll_creation_poll_creation_should_be_disabled() {
		new KooCreationPage().verify_on_selecting_audio_or_video_options_while_poll_creation_poll_creation_should_be_disabled();
	}

	@Then("I Verify on tapping default poll duration a pop-up should display where user can set the time for poll.")
	public void i_verify_on_tapping_default_poll_duration_a_pop_up_should_display_where_user_can_set_the_time_for_poll() {
		new KooCreationPage().verify_on_tapping_default_poll_duration_a_pop_up_should_display_where_user_can_set_the_time_for_poll();
	}
	
	@Then("I Verify user is able to add title from minimum of one to maximum of fourhundred characters and I Verify post button is enabled on entering characters in the title field.")
	public void iVerifyUserIsAbleToAddTitleFromMinimumOfToMaximumOfCharacters() throws InterruptedException {
		new KooCreationPage().verifyUserIsAbleToAddTitleFromMinimumOfToMaximumOfCharacters();
	    
	}

	@Then("I Verify user is able to add hashtags and the suggestion list should be displayed and user should be able to select any one from the list or add own hashtag.")
	public void iVerifyUserIsAbleToAddHashtagsAndTheSuggestionListShouldBeDisplayedAndUserShouldBeAbleToSelectAnyOneFromTheListOrAddOwnHashtag() {
		new KooCreationPage().verifyUserIsAbleToAddHashtagsAndTheSuggestionListShouldBeDisplayedAndUserShouldBeAbleToSelectAnyOneFromTheListOrAddOwnHashtag(); 
	}
	
	@Then("I Verify entered text is transcripted in selected language.")
	public void iVerifyEnteredTextIsTranscriptedInSelectedLanguage() {
		new KooCreationPage().verifyEnteredTextIsTranscriptedInSelectedLanguage();
	}

	@Then("I Verify user is able to mention any user and the suggestion list should be displayed and user should be able to select any one from the list.")
	public void iVerifyUserIsAbleToMentionAnyUserAndTheSuggestionListShouldBeDisplayedAndUserShouldBeAbleToSelectAnyOneFromTheList() throws InterruptedException {
		new KooCreationPage().verifyUserIsAbleToMentionAnyUserAndTheSuggestionListShouldBeDisplayedAndUserShouldBeAbleToSelectAnyOneFromTheList();
	}

	@Then("I Verify if the user is able to add a link in title field.")
	public void iVerifyIfTheUserIsAbleToAddALinkInTitleField() throws InterruptedException {
		new KooCreationPage().verifyIfTheUserIsAbleToAddALinkInTitleField();
	}

	@Then("I Verify GIF icon at the bottom of koo creation screen.")
	public void iVerifyGIFIconAtTheBottomOfKooCreationScreen2() {
		new KooCreationPage().verifyGIFIconAtTheBottomOfKooCreationScreen2();
	   
	}

	@Then("I On tapping koo creation button user should land on Multi Lingual Koo creation screen from:- Feed,Own Profile,create Your first koo button")
	public void ionTappingKooCreationButtonUserShouldLandOnMultiLingualKooCreationScreenFromFeedOwnProfileCreateYourFirstKooButton() throws InterruptedException {
		new KooCreationPage().onTappingKooCreationButtonUserShouldLandOnMultiLingualKooCreationScreenFromFeedOwnProfileCreateYourFirstKooButton();
	}


	@Then("I Verify on tapping plus button user should navigate to language selection screen there should be Active and Others Language")
	public void iVerifyOnTappingPlusButtonUserShouldNavigateToLanguageSelectionScreenAndThereShouldTwoCountriesOnLanguageSelectionScreenIndiaAndNigeria() {
		new KooCreationPage().verifyOnTappingPlusButtonUserShouldNavigateToLanguageSelectionScreen() ;
	}
	
	
	@Then("I Verify remaining languages should show on other languages section with empty checkbox.")
	public void iVerifyRemaininglanguagesShouldShowOnOtherLanguagesSectionWithEmptyCheckbox(){
		new KooCreationPage().verifyRemaininglanguagesShouldShowOnOtherLanguagesSectionWithEmptyCheckbox();
	}

	
	@Then("I Verify on selecting the language from others section, selected languages should add on active languages list with checkbox enabled and language ordering toggle button.")
	public void i_verify_on_selecting_the_language_from_others_section_selected_languages_should_add_on_active_languages_list_with_checkbox_enabled_and_language_ordering_toggle_button() throws InterruptedException {
		new KooCreationPage().verifyOnSelectingTheLanguageFromOthersSectionSelectedLanguagesShouldAddOnActiveLanguagesListWithCheckboxEnabledAndLanguageOrderingToggleButton();
	}

	@Then("I Verify there should be two countries on language selection screen India and Nigeria.")
	public void i_verify_there_should_be_two_countries_on_language_selection_screen_india_and_nigeria() {
		new KooCreationPage().verifyThereShouldBeTwoCountriesOnLangaugeSelectionScreenIndiaAndNigeria();
		new LanguageSelectionPage().verifyLanguagesOfSection();
	}

	@Then("I Verify on select language screen on selecting Indian country indian language options should show On selecting Nigeria country nigerian language options should show")
	public void i_verify_on_select_language_screen_on_selecting_indian_country_indian_language_options_should_show_on_selecting_nigeria_country_nigerian_language_options_should_show() throws InterruptedException {
		new LanguageSelectionPage().verifyAllLangugesOption();
		new LanguageSelectionPage().verifyNigerianLanguages();
	}

	@Then("I Verify after switching the country India and Nigeria active languages section should be empty")
	public void i_verify_after_switching_the_country_india_and_nigeria_active_languages_section_should_be_empty() {
			new KooCreationPage().verify_after_switching_the_country_india_and_nigeria_active_languages_section_should_be_empty();	
	}

	@Then("I Verify on tapping unavailable\\(Coming Soon) languages on language selection screen no action should happen")
	public void i_verify_on_tapping_unavailable_coming_soon_languages_on_language_selection_screen_no_action_should_happen() {
		new LanguageSelectionPage().clickOnLanguageSectionOfComingSoonLanguage("(Gujarati)");
	}
	
	@Then("I Verify tapping Done button on language selection screen user should navigate to koo creation screen with all the added languages.")
	public void iVerifyTappingDoneButtonOnLanguageSelectionScreenUserShouldNavigateToKooCreationScreenWithAllTheAddedLanguages() {
		new KooCreationPage().verifyTappingDoneButtonOnLanguageSelectionScreenUserShouldNavigateToKooCreationScreenWithAllTheAddedLanguages();
	}	
	
	@Then("I Verify on deselecting the language from active languages section respective language should show on other languages section with checkbox disabled on language selection screen tapping proceed button respective language should disappear on koo creation screen.")
	public void iVerifyOnDeselctingTheLanguageForActiveLanguageSectionRespectiveLanguageShouldShowOnOtherLangauge() {
		new KooCreationPage().verifyOnDeselctingTheLanguageForActiveLanguageSectionRespectiveLanguageShouldShowOnOtherLangauge();
	}
	
	@Then("I Verify Whats on your mind text should in respective languages.")
	public void i_verify_what_on_your_mind_text_should_in_respective_languages() {
		new KooCreationPage().verify_what_on_your_mind_text_should_in_respective_languages();
	}
	
	@Then("I Verify user should be able to select both Indian & Nigerian languages for MLK creation")
	public void i_verify_user_should_be_able_to_select_both_indian_nigerian_languages_for_mlk_creation() throws Exception {
		new KooCreationPage().verify_user_should_be_able_to_select_both_indian_nigerian_languages_for_mlk_creation();
	}

	@Then("I Verify unavailable languages should show on other languages section with empty checkbox and coming soon button.")
	public void i_verify_unavailable_languages_should_show_on_other_languages_section_with_empty_checkbox_and_coming_soon_button() {
		new KooCreationPage().verify_unavailable_languages_should_show_on_other_languages_section_with_empty_checkbox_and_coming_soon_button();
	}
	
	@Then("I Verify koo creation title box should move on swiping with respective language highlighting.")
	public void i_verify_koo_creation_title_box_should_move_on_swiping_with_respective_language_highlighting() {
		new KooCreationPage().verify_koo_creation_title_box_should_move_on_swiping_with_respective_language_highlighting();
	}

	@Then("I Verify Translate form original language button shown in Active languages title box and On tapping the button translates text from original language should load in title.")
	public void i_verify_button_shown_in_active_languages_title_box_tapping_the_button_translates_text_from_original_language_should_load_in_title() throws InterruptedException {
		new KooCreationPage().verify_button_shown_in_active_languages_title_box_tapping_the_button_translates_text_from_original_language_should_load_in_title();
	}
	
	
	@Then("I Verify User should be able to import Hastag from original language & should be in Blue colour.")
	public void iVerifyUserShouldBeAbleToImportHastagFromOriginalLanguageShouldBeInBlueColour() throws InterruptedException {
		new KooCreationPage().verifyUserShouldBeAbleToImportHastagFromOriginalLanguageShouldBeInBlueColour();
	}

	@Then("I User should be able to import links attached in koo title from original language & should be in blue colour.")
	public void iUserShouldBeAbleToImportLinksAttachedInKooTitleFromOriginalLanguageShouldBeInBlueColour() throws Exception {
		new KooCreationPage().verifyUserShouldBeAbleToImportLinksAttachedInKooTitleFromOriginalLanguageShouldBeInBlueColour();
	}

	@Then("I Verify If user Indian Eng user posts in Nigerian Eng, Koo should not show on Indian Eng feed.")
	public void iVerifyIfUserIndianEngUserPostsInNigerianEngKooShouldNotShowOnIndianEngFeed() {
		new KooCreationPage().verifyIfUserIndianEngUserPostsInNigerianEngKooShouldNotShowOnIndianEngFeed();
	}

	@Then("I If user Nigerian Eng user posts in Indian Eng, Koo should not show on Nigerian Eng feed.")
	public void iIfUserNigerianEngUserPostsInIndianEngKooShouldNotShowOnNigerianEngFeed() {
		new KooCreationPage().verifyIfUserNigerianEngUserPostsInIndianEngKooShouldNotShowOnNigerianEngFeed();
	}

	@Then("I Verify on changing the language from language selection screen respective language koos only should show on feed and koo detailed screen with highlighting the button.")
	public void iVerifyOnChangingTheLanguageFromLanguageSelectionScreenRespectiveLanguageKoosOnlyShouldShowOnFeedAndKooDetailedScreenWithHighlightingTheButton() {
		new KooCreationPage(). verifyOnChangingTheLanguageFromLanguageSelectionScreenRespectiveLanguageKoosOnlyShouldShowOnFeedAndKooDetailedScreenWithHighlightingTheButton();
	}

	@Then("I Verify Available in these many languages text should show on the koo card in feed as well as on koo detailed screen with blue colour and globe icon")
	public void iVerifyAvailableInTheseManyLanguagesTextShouldShowOnTheKooCardInFeedAsWellAsOnKooDetailedScreenWithBlueColourAndGlobeIcon() throws Exception {
		new KooCreationPage().verifyAvailableInTheseManyLanguagesTextShouldShowOnTheKooCardInFeedAsWellAsOnKooDetailedScreenWithBlueColourAndGlobeIcon();
	}
	
	@Then("I Verify after posting an MLK, if user edits koo in particular language & change content in another language, that koo should appear in latest updated language.")
	public void iVerifyAfterPostingAnMLKIfUserEditsKooInParticularLanguageChangeContentInAnotherLanguageThatKooShouldAppearInLatestUpdatedLanguage() throws InterruptedException {
		new KooCreationPage().verifyAfterPostingAnMLKIfUserEditsKooInParticularLanguageChangeContentInAnotherLanguageThatKooShouldAppearInLatestUpdatedLanguage();
	}

	
	@Then("I Verify user is able to perform like, rekoo, comment, rekoo with comment etc on all MLK koos and Verify the reacted koos on reactors profile.")
	public void ThenIVerifyUserIsAbleToPerformLikeRekooCommentRekooWithCommentEtcOnAllMLKKoosAndVerifyTheReactedKoosOnReactorsProfile() throws Exception {
		new KooCreationPage().IVerifyUserIsAbleToPerformLikeRekooCommentRekooWithCommentEtcOnAllMLKKoosAndVerifyTheReactedKoosOnReactorsProfile();
	}
	
	@Then("I Verify number indication on post button - number of languages koo is created.")
	public void iVerifyNumberIndicationOnPostButtonNumberOfLanguagesKooIsCreated() throws InterruptedException {
		new KooCreationPage().verifyNumberIndicationOnPostButtonNumberOfLanguagesKooIsCreated();
	}

	
	@Then("I Verify after refreshing the feed screen posted koos should not disappear.")
	public void iVerifyAfterRefreshingTheFeedScreenPostedKoosShouldNotDisappear() throws InterruptedException {
		new KooCreationPage().verifyAfterRefreshingTheFeedScreenPostedKoosShouldNotDisappear();
	}

	@Then("I Verify on changing the language from language selection screen and back to current language posted koos should not disappear on feed screen.")
	public void iVerifyOnChangingTheLanguageFromLanguageSelectionScreenAndBackToCurrentLanguagePostedKoosShouldNotDisappearOnFeedScreen() throws Exception {
		new KooCreationPage().verifyOnChangingTheLanguageFromLanguageSelectionScreenAndBackToCurrentLanguagePostedKoosShouldNotDisappearOnFeedScreen();
	}


	@Then("I Verify user should be able to delete individual koo from profile screen and koo detailed screen.")
	public void iVerifyUserShouldBeAbleToDeleteIndividualKooFromProfileScreenAndKooDetailedScreen() throws InterruptedException {
		new KooCreationPage().verifyUserShouldBeAbleToDeleteIndividualKooFromProfileScreenAndKooDetailedScreen() ;
	}
	
	@Then("I Verify koos count should increase on profile screen based on the languages user is creating.")
	public void iVerifyKoosCountShouldIncreaseOnProfileScreenBasedOnTheLanguagesUserIsCreating() {
		new KooCreationPage().verifyKoosCountShouldIncreaseOnProfileScreenBasedOnTheLanguagesUserIsCreating();
	}

	@Then("I Verify posted koos should show individually on profile screen with language indication button.")
	public void iVerifyPostedKoosShouldShowIndividuallyOnProfileScreenWithLanguageIndicationButton() {
		new KooCreationPage().verifyPostedKoosShouldShowIndividuallyOnProfileScreenWithLanguageIndicationButton();
	}
	@Then("I Verify action buttons should show for respective language koos on feed screen, profile screen and koo detailed screen -Like, Rekoo, Comment & Rekoo with comment")
	public void iVerifyActionButtonsShouldShowForRespectiveLanguageKoosOnFeedScreenProfileScreenAndKooDetailedScreenLikeRekooCommentRekooWithComment() {
		new KooCreationPage().verifyHomePage();
		new KooCreationPage().verifyActionButtonsShouldShowForRespectiveLanguageKoosOnFeedScreenProfileScreenAndKooDetailedScreenLikeRekooCommentRekooWithComment();
		new KooCreationPage().clickOnProfile();
		new KooCreationPage().verifyActionButtonsShouldShowForRespectiveLanguageKoosOnFeedScreenProfileScreenAndKooDetailedScreenLikeRekooCommentRekooWithComment();
	}

	//multilingual koo creation4
	
		@Then("Verify Import Audio\\/Video\\/Link\\/Imagesl from original language button On tapping the button media from original langauge should load.")
		public void verifyImportAudioVideoLinkImageslFromOriginalLanguageButtonOnTappingTheButtonMediaFromOriginalLangaugeShouldLoad() throws InterruptedException {
			new KooCreationPage().verifyImportAudioVideoLinkImageslFromOriginalLanguageButtonOnTappingTheButtonMediaFromOriginalLangaugeShouldLoad();
			
		}

		@Then("Verify user is able to add different types of media in different languages.")
		public void verifyUserIsAbleToAddDifferentTypesOfMediaInDifferentLanguages() throws Exception {
			new KooCreationPage().verifyUserIsAbleToAddDifferentTypesOfMediaInDifferentLanguages();
		}

		@Then("Verify post button should not enable only on adding media from bottom bar.")
		public void verifyPostButtonShouldNotEnableOnlyOnAddingMediaFromBottomBar() throws InterruptedException {
			new KooCreationPage().verifyPostButtonShouldNotEnableOnlyOnAddingMediaFromBottomBar();
		}

		@Then("Verify user should be able to create Koo with Following Combinations: Title with Audio and Image\\/Images,Title with Audio and Link,Title with Video and Image\\/Images,Title with Video and Link")
		public void verifyUserShouldBeAbleToCreateKooWithFollowingCombinationsTitleWithAudioAndImageImagesTitleWithAudioAndLinkTitleWithVideoAndImageImagesTitleWithVideoAndLink() throws InterruptedException {
			new KooCreationPage().verifingKooCreationWithAudio_Video_Link_Image();
		}

		@Then("Verify user should be able to create Koo with Following Combinations: Without title Audio and Image\\/Images,Without title Audio and Link,Without title Video and Image\\/Images,Without title Video and Link")
		public void verifyUserShouldBeAbleToCreateKooWithFollowingCombinationsWithoutTitleAudioAndImageImagesWithoutTitleAudioAndLinkWithoutTitleVideoAndImageImagesWithoutTitleVideoAndLink() throws InterruptedException {
			new KooCreationPage().verifingKooCreationWithoutTitle();
		}

		@Then("Verify user should be able to able view preview of added media in MLK creation screen and user should able to play audio,vidoe,open and the attach link and see the added images.")
		public void verifyUserShouldBeAbleToAbleViewPreviewOfAddedMediaInMLKCreationScreenAndUserShouldAbleToPlayAudioVidoeOpenAndTheAttachLinkAndSeeTheAddedImages() throws Exception {
			new KooCreationPage().userShouldShouldPlayAudio_Video_OpenAttachLink();
		}

		@Then("Verify Profile picture icon on top of koo creation title box.")
		public void verifyProfilePictureIconOnTopOfKooCreationTitleBoxOnceUpdatingUpdatedProfileShouldReflectInsteadOfProfilePictureIcon() throws InterruptedException {
			new KooCreationPage().verifyProfilePictureIconOnTopOfKooCreationTitleBoxOnceUpdatingUpdatedProfileShouldReflectInsteadOfProfilePictureIcon();
		}
		
		
		@Then ("Once updating updated profile should reflect instead of profile picture icon.")
		public void verifyOnceUpdatingProfileShouldShowProfilePicIcon() {
			new KooCreationPage().verifyOnceUpdatingProfileShouldShowProfilePicIcon();
		}
		
		//koo Notification
		@Then("Verify notifications should come for all the created koos.")
		public void verifyNotificationsShouldComeForAllTheCreatedKoos() throws InterruptedException {
			new KooCreationPage().verifyNotificationsShouldComeForAllTheCreatedKoos();
		}

		
		@Then("Verify on tapping on notifications user should navigate to respective koo details screen")
		public void verifyOnTappingOnNotificationsUserShouldNavigateToRespectiveKooDetailsScreen() throws Exception {
			new KooCreationPage().verifyOnTappingOnNotificationsUserShouldNavigateToRespectiveKooDetailsScreen();
		}

		

		@Then("Verify the comment, rekoo, rekoo with comment on the creators profile.")
		public void verifyTheCommentRekooRekooWithCommentOnTheCreatorsProfile() throws InterruptedException {
			new KooCreationPage().verifyTheCommentRekooRekooWithCommentOnTheCreatorsProfile();
		}
		
		@Then ("I login in into other follower account")
		public void loginTOFollowerAccount() throws Exception {
			new KooCreationPage().like_comment_AndRekooThePost();
		}
		
		@Then ("I Verify Like,Rekoo and comments")
		public void verifyLikesRekooAndComments() throws InterruptedException {
			new KooCreationPage().verify_Like_Comment_AndRekooPost();
		}


		@Then("Verify user should be able to switch between the different languages in koo details screen.")
		public void verifyUserShouldBeAbleToSwitchBetweenTheDifferentLanguagesInKooDetailsScreen() {
		    
		}

	
		@Then("Verify user is able to follow\\/unfollow user after navigating to koo details screen by tapping on notifications.")
		public void verifyUserIsAbleToFollowUnfollowUserAfterNavigatingToKooDetailsScreenByTappingOnNotifications() throws InterruptedException {
			new KooCreationPage().verifyUserIsAbleToFollowUnfollowUserAfterNavigatingToKooDetailsScreenByTappingOnNotifications();
		}
	
	
	

	@Then("I Verify user profile picture is displayed above the mic button.")
	public void VerifyUserProfilePictureIsDisplayedAboveTheMicButton() throws InterruptedException {
		new KooCreationPage().VerifyUserProfilePictureIsDisplayedAboveTheMicButton();
	}
	
	@Then("I Verify on starting the recording the timer is displayed above the recording button and after 4sec of recording restart button should appear and save button should be enabeled.")
	public void IVerifyOnStartingTheRecording() throws InterruptedException {
		new KooCreationPage().IVerifyOnStartingTheRecording();
	}
	
	@Then("I Verify user is able to pause the recording on tapping on pause button.")
	public void IVerifyUserIsAbleToPauseTheRecording() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPauseTheRecording();
	}
	
	@Then("I Verify on tapping on restart button conformation popup is displayed.")
	public void IVerifyOnTappingOnRestartButton() throws InterruptedException {
		new KooCreationPage().IVerifyOnTappingOnRestartButton();
	}
	
	@Then("I Verify before saving the recorded video user is able to preview the recorded audio as well as fully recorded length.")
	public void IVerifyPreviewAndFullyRecordedLengthAllowed() throws InterruptedException {
		new KooCreationPage().IVerifyPreviewAndFullyRecordedLengthAllowed();
	}
	
	@Then("I Verify user is able to crop the audio from the preview screen.")
	public void IVerifyUserIsAbleToCropTheAudioFromThePreviewScreen() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToCropTheAudioFromThePreviewScreen();
	}

	@Then("I Verify user is able to post koo only by recording video.")
	public void IVerifyUserIsAbleToPostKooOnlyByRecordingVideo() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooOnlyByRecordingVideo();
	}
	
	@Then("I Verify user is able to post koo only by attaching image or images.")
	public void IVerifyByPostingImageOrImages() throws InterruptedException {
		new KooCreationPage().IVerifyByPostingImageOrImages();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of title and audio.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndAudio() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndAudio();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of title and video.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndVideo() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndVideo();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of title and link.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndlink() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOfTitleAndlink();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of audio and link.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfAudioAndlink() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOfAudioAndlink();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of audio and images.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfAudioAndImages() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOfAudioAndImages();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of title, video and link.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOfVideoAndLink() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOfVideoAndLink();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of title, audio and link.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleAudioAndLink() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleAudioAndLink();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of title, audio and images.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleAudioAndImage() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleAudioAndImage();
	}
	
	@Then("I Verify user is able to post koo by adding in combinations of title, video and images.")
	public void IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleVideoAndImage() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToPostKooByAddingInCombinationsOftitleVideoAndImage();
	}
	
	@Then("I Verify user is able to rekoo with comment on tapping on rekoo button and selecting rekoo with comment")
	public void IVerifyUserIsAbleToRekooWithCommentOnTappingOnRekooButtonAndSelectingRekooWithComment() throws Exception {
		new KooCreationPage().IVerifyUserIsAbleToRekooWithCommentOnTappingOnRekooButtonAndSelectingRekooWithComment();
	}

	@Then("I Verify user is able to rekoo with comment by adding text, audio, video, link and image.")
	public void IVerifyUserIsAbleToRekooWithCommentByAddingTextAudioVideoLinkAndImage() throws Exception {
		new KooCreationPage().IVerifyUserIsAbleToRekooWithCommentByAddingTextAudioVideoLinkAndImage();
	}
	
	@Then("I Verify user is able to rekoo with comment by adding a comment with the combination of all.")
	public void IVerifyUserIsAbleToRekooWithCommentByAddingCommentWithTheCombinationOfAll() throws Exception {
		new KooCreationPage().IVerifyUserIsAbleToRekooWithCommentByAddingCommentWithTheCombinationOfAll();
	}
	
	@Then("I Verify user is able to comment on tapping on comment button")
	public void IVerifyUserIsAbleToCommentOnTappingOnCommentButton() throws Exception {
		new KooCreationPage().IVerifyUserIsAbleToCommentOnTappingOnCommentButton();
	}
	
	@Then("I Verify user is able to create and post comment by adding text, audio, video, link and image.")
	public void IVerifyUserIsAbleToCreateAndPostCommentByAddingTextAudioVideoLinkandImage() throws Exception {
		new KooCreationPage().IVerifyUserIsAbleToCreateAndPostCommentByAddingTextAudioVideoLinkandImage();
	}
	
	@Then("I Verify user is able to create and post comment by adding a comment with the combination of all.")
	public void IVerifyUserIsAbleToCreateAndPostCommentByAddingCommentWithTheCombinationOfAll() throws Exception {
		new KooCreationPage().IVerifyUserIsAbleToCreateAndPostCommentByAddingCommentWithTheCombinationOfAll();
	}
	
	@Then("I Verify user is able to tap the camera icon.")
	public void IVerifyUserIsAbleToTapTheCameraIcon() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToTapTheCameraIcon();
	}
	
	@Then("I Verify user should ba able to switch between front and back camera and take a picture.")
	public void IVerifyUserShouldBaAbleToSwitchBetweenFrontAndBackCameraAndTakeaPicture() throws InterruptedException {
		new KooCreationPage().IVerifyUserShouldBaAbleToSwitchBetweenFrontAndBackCameraAndTakeaPicture();
	}
	
	@Then("I Verify user is able to switch on and of the flash while using back camera.")
	public void IVerifyUserIsAbleToSwitchOnAndOfTheFlashWhileUsingackamera() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToSwitchOnAndOfTheFlashWhileUsingackamera();
	}
	
	@Then("I Verify on tapping back /cancel button from camera screen user should land on gallery screen.")
	public void IVerifyOnTappingBackCancelButtonFromCameraScreenUserShouldLandOnGalleryScreen() throws InterruptedException {
		new KooCreationPage().IVerifyOnTappingBackCancelButtonFromCameraScreenUserShouldLandOnGalleryScreen();
	}
	
	@Then("I Verify on capturing the image done and cancel button with image cropper should appear.")
	public void IVerifyOnCapturingTheImageDoneAndCancelButtonWithImageCropperShouldAppear() throws InterruptedException {
		new KooCreationPage().IVerifyOnCapturingTheImageDoneAndCancelButtonWithImageCropperShouldAppear();
	}
	
	@Then("I Verify on tapping on done after cropping or without cropping user should land on koo creation screen with the captured image.")
	public void IVerifyOnTappingOnDone() throws InterruptedException {
		new KooCreationPage().IVerifyOnTappingOnDone();
	}
	
	@Then("I Verify user should not be able to post a koo without adding title.")
	public void IVerifyUserShouldNotBeAbleToPostKooWithoutAddingTitle() throws InterruptedException {
		new KooCreationPage().IVerifyUserShouldNotBeAbleToPostKooWithoutAddingTitle();
	}
	
	@Then("I Verify Koo comments off feature for scenarios for Edit Koo feature.")
	public void IVerifyKooCommentsOffFeatureForScenarios() throws Exception {
		new KooCreationPage().IVerifyKooCommentsOffFeatureForScenarios();
	}
	
	@Then("I Verify on selecting everyone all the users using koo app they can comment on that respective koo.")
	public void IVerifyonSelectingEveryoneAllTheUsersUsingKooAppTheyCanCommentonThatRespectiveKoo() throws Exception {
		new KooCreationPage().IVerifIVerifyonSelectingEveryoneAllTheUsersUsingKooAppTheyCanCommentonThatRespectiveKooyKooCommentsOffFeatureForScenarios();
	}
	
	@Then("I Verify user should be able to see Video recording option on the koo create text box.")
	public void IVerifyUserShouldBeAbleToSeeVideoRecordingOptionOnTheKooCreateTextBox() throws Exception {
		new KooCreationPage().IVerifyUserShouldBeAbleToSeeVideoRecordingOptionOnTheKooCreateTextBox();
	}
	
	@Then("I Verify on tapping Video icon, user should navigate to Video recording screen and Record video permission popup should show.")
	public void IVerifyOnTappingVideoIconUserShouldNavigateToVideoRecordingScreenAndRecordVideoPermissionPopupShouldShow() throws Exception {
		new KooCreationPage().IVerifyOnTappingVideoIconUserShouldNavigateToVideoRecordingScreenAndRecordVideoPermissionPopupShouldShow();
	}
	
	@Then("I Verify on tapping device back user should navigate back to Koo create screen.")
	public void IVerifyOnTappingDeviceBackUserShouldNavigateBackToKooCreateScreen() throws InterruptedException {
		new KooCreationPage().IVerifyOnTappingDeviceBackUserShouldNavigateBackToKooCreateScreen();
	}
	
	@Then("I Verify Video recording screen should show in full screen by default along with rear camera view.")
	public void IVerifyVideoRecordingScreenShouldShowInFullScreenByDefaultAlongWithRearCameraView() throws InterruptedException {
		new KooCreationPage().IVerifyVideoRecordingScreenShouldShowInFullScreenByDefaultAlongWithRearCameraView();
	}
	
	@Then("I Verify user should be able to record video for min of 3 seconds and max of 1 minute.")
	public void IVerifyUserShouldbeAbletoRecordVideoForMinof3SecondsandMaxof1Minute() throws InterruptedException {
		new KooCreationPage().IVerifyUserShouldbeAbletoRecordVideoForMinof3SecondsandMaxof1Minute();
	}
	
	@Then("I Verify on tapping Camera switch button, recording screen should switch to front camera and vice versa.")
	public void IVerifyonTappingCameraSwitchButtonRecordingScreenShouldSwitchtoFrontCameraandViceVersa() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingCameraSwitchButtonRecordingScreenShouldSwitchtoFrontCameraandViceVersa();
	}
	
	@Then("I Verify on tapping close button device back button popup should show with the text.")
	public void IVerifyonTappingCloseButtonDeviceBackButtonPopupShouldShowWithTheText() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingCloseButtonDeviceBackButtonPopupShouldShowWithTheText();
	}
	
	@Then("I Verify on tapping Preview button user should navigate to video preview screen along with following options.")
	public void IVerifyonTappingPreviewButtonUserShouldNavigatetoVideoPreviewScreenAlongWithFollowingOptions() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingPreviewButtonUserShouldNavigatetoVideoPreviewScreenAlongWithFollowingOptions();
	}
	
	@Then("I Verify on tapping back button device back button user should navigate back to video recording screen.")
	public void IVerifyonTappingBackButtonDeviceBackButtonUserShouldNavigateBacktoVideoRecordingScreen() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingBackButtonDeviceBackButtonUserShouldNavigateBacktoVideoRecordingScreen();
	}
	
	@Then("I Verify on tapping play button, recorded video clip should start playing.")
	public void IVerifyonTappingPlayButtonRecordedVideoClipShouldStartPlaying() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingPlayButtonRecordedVideoClipShouldStartPlaying();
	}
	
	@Then("I Verify on tapping Save button in video recording screen, user should navigate to Koo create screen and recorded video should show as attached.")
	public void IVerifyonTappingSaveButtoninVideoRecordingScreen() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingSaveButtoninVideoRecordingScreen();
	}
	
	@Then("I Verify following options should show on the attached recorded video in koo creation screen.")
	public void IVerifyFollowingOptionsShouldShowonTheAttachedRecordedVideoinKooCreationScreen() throws InterruptedException {
		new KooCreationPage().IVerifyFollowingOptionsShouldShowonTheAttachedRecordedVideoinKooCreationScreen();
	}
	
	@Then("I Verify on tapping Edit button, user should navigate to Video Edit screen and verify following things in Edit screen.")
	public void IVerifyonTappingEditButtonUserShouldNavigatetoVideoEditScreenandVerifyFollowingThingsinEditScreen() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingEditButtonUserShouldNavigatetoVideoEditScreenandVerifyFollowingThingsinEditScreen();
	}
	
	@Then("I Verify user is able to tap on add video button.")
	public void IVerifyUserIsAbleToTaponaddVideoButton() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToTaponaddVideoButton();
	}
	
	@Then("I Verify user should be able to select any of the gallery type.")
	public void IVerifyUserShouldBeAbletoSelectAnyofTheGalleryType() throws InterruptedException {
		new KooCreationPage().IVerifyUserShouldBeAbletoSelectAnyofTheGalleryType();
	}
	
	@Then("I Verify edit, remove and play buttons on the added video.")
	public void IVerifyEditRemoveandPlayButtonsonTheAddedVideo() throws InterruptedException {
		new KooCreationPage().IVerifyEditRemoveandPlayButtonsonTheAddedVideo();
	}
	
	@Then("I Veriy on tapping edit button user should navigate to preview screen.")
	public void IVeriyonTappingEditButtonUserShouldNavigatetoPreviewScreen() throws InterruptedException {
		new KooCreationPage().IVeriyonTappingEditButtonUserShouldNavigatetoPreviewScreen();
	}
	
	@Then("I Verify on tapping play button user should land on preview screen and video should start playing automatically.")
	public void IVerifyonTappingPlayButtonUserShouldLandonPreviewScreenandVideoShouldStartPlayingAutomatically() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingPlayButtonUserShouldLandonPreviewScreenandVideoShouldStartPlayingAutomatically();
	}
	
	@Then("I Verify on tapping cancel button the added video should disappear from koo creation screen.")
	public void IVerifyonTappingCancelButtontheAddedVideoShouldDisappearFromKooCreationScreen() throws InterruptedException {
		new KooCreationPage().IVerifyonTappingCancelButtontheAddedVideoShouldDisappearFromKooCreationScreen();
	}
	
	@Then("I Verify user should not be able to post a koo only by adding a video Without title.")
	public void IVerifyUserShouldNotbeAbletoPostaKooOnlybyAaddingaVideoWithoutTitle() throws InterruptedException {
		new KooCreationPage().IVerifyUserShouldNotbeAbletoPostaKooOnlybyAaddingaVideoWithoutTitle();
	}
	
	@Then("I Verify user is able to see image upload icon on the koo creation screen.")
	public void IVerifyUserIsAbleToSeeImageUploadIconOnTheKooCreationScreen() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToSeeImageUploadIconOnTheKooCreationScreen();
	}


	
	@Then("I Verify on tapping any perticular image from the gallery, user should navigate to koo creation with the selected image.")
	public void IVerifybySelectingTheImage() throws InterruptedException {
		new KooCreationPage().IVerifybySelectingTheImage();
	}
	
	@Then("I Verify the edit and the cancel button on the image.")
	public void IVerifytheEditandTheCancelButtononTheImage() throws InterruptedException {
		new KooCreationPage().IVerifytheEditandTheCancelButtononTheImage();
	}
	
	@Then("I Verify the Add image button at the bottom untill user adds maximum of 4 images.")
	public void IVerifytheAddImageButtonatTheBottomUntillUserAddsMaximumof4Images() throws InterruptedException {
		new KooCreationPage().IVerifytheAddImageButtonatTheBottomUntillUserAddsMaximumof4Images();
	}
	
	@Then("I Verify on long pressing on any image also user should be able to select multiple images.")
	public void IVerifyonLongPressingOnAnyImageAlsoUserShouldbeAbletoSelectMultipleImages() throws InterruptedException {
		new KooCreationPage().IVerifyonLongPressingOnAnyImageAlsoUserShouldbeAbletoSelectMultipleImages();
	}
	
//	@Then("I Verify GIF icon at the bottom of koo creation screen.")
//	public void IVerifyGIFIconatTheBottomOfKooCreationScreen1() throws Exception {
//		new KooCreationPage().IVerifyGIFIconatTheBottomOfKooCreationScreen1();
//	}
	
	@Then("I Verify on tapping GIF icon GIF images should load and display.")
	public void IVerifyOnTappingGIFIconGIFImagesShouldLoadAndDisplay() throws Exception {
		new KooCreationPage().IVerifyOnTappingGIFIconGIFImagesShouldLoadAndDisplay();
	}
	
	@Then("I Verify on tapping any of the GIF image respective image should show on koo creation screen.")
	public void IVerifyonTappingAnyofTheGIFImageRespectiveImageShouldShowonKooCreationScreen() throws Exception {
		new KooCreationPage().IVerifyonTappingAnyofTheGIFImageRespectiveImageShouldShowonKooCreationScreen();
	}

	//new by sumeet
	@Then("I Verify user is able to post koo by adding MyfirstKoo as title and it is visible on Feed Screen.")
	public void IVerifyUserIsAbleToPostKooByAddingTitle() throws InterruptedException {
		new KooCreationPage().createfirstKooPost("MyfirstKoo");
		new EditProfilePage().goToProfilePage();
	}

	@Then("I Verify user is able to input title")
	public void IVerifyuserisabletoinputtitle() throws InterruptedException {
		new KooCreationPage().InputTitle("Input title");

	}

	@Then("^I Verify user is able to delete its own created koo.")
	public void IverifyUserisAbleToDeleteItsOwnKoo() throws InterruptedException {
		new KooCreationPage().DeleteKooCreated();

	}
	@Then("^I Verify Click On Photo")
	public void iVerifyClickOnPhoto() throws InterruptedException {
		new KooCreationPage().iVerifyClickOnPhoto();

	}
	@Then("I Verify user is able to see image upload icon on the koo creation screen and select the image from gallary.")
	public void IVerifyUserIsAbleToSeeImageUploadIconOnTheKooCreationScreenandselecttheimagefromgallary() throws InterruptedException {
		new KooCreationPage().IVerifyUserIsAbleToSeeImageUploadIconOnTheKooCreationScreenandselecttheimagefromgallary();
	}

	@Then("I verify user should be able to create poll with title")
	public void verify_user_should_be_able_to_create_poll_with_title() throws InterruptedException {
		new KooCreationPage().verify_user_should_be_able_to_create_poll_with_title();
	}



	
}
