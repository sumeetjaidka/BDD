package com.qa.stepdef;

import com.qa.pages.EditProfilePage;

import io.cucumber.java.en.Then;

public class EditProfileStepDef {

	@Then("^I Verify Edit profile text with back button should show on the header.")
	public void IverifyEditProfileTextAndBackButtonOnHeader() throws InterruptedException {
		new EditProfilePage().IverifyEditProfileTextAndBackButtonOnHeader();
	}
	
	@Then("^I Verify Below following text fields should present in Edit Profile screen.")
	public void IverifyBelowFollowingFieldsInEditProfile() throws InterruptedException {
		new EditProfilePage().IverifyBelowFollowingFieldsInEditProfile();
	}
	
	@Then("^I Verify Tapping on the camera icon on the placeholder user should navigate to camera screen and tapping on back button on the header or device back button user should navigate back to the edit profile screen.")
	public void IverifyTappingCameraIconFunctionalityAndComingBack() throws InterruptedException {
		new EditProfilePage().IverifyTappingCameraIconFunctionalityAndComingBack();
	}
	
	@Then("^I Verify tapping on all fiels on edit profile, user should navigate to respective edit fileds.")
	public void IverifyTappingOnVariousFieldOnEditProfileAndComingBack() throws InterruptedException {
		new EditProfilePage().IverifyTappingOnVariousFieldOnEditProfileAndComingBack();
	}
	
	@Then("^I Verify Tapping on Save changes button after editing or updating the profile details, user should navigate to the Edit Profile screen.")
	public void IverifyTappingOnSaveChangesButtonAndComingBackFunctionality() throws InterruptedException {
		new EditProfilePage().IverifyTappingOnSaveChangesButtonAndComingBackFunctionality();
	}
	
	@Then("^I Verify User should enter at least minimum 3 characters in Name edit text field to save the changes, Save button should not enable until then.")
	public void IverifySaveButtonDisabelUntillMin3CharacterIsNotEntered() throws InterruptedException {
		new EditProfilePage().IverifySaveButtonDisabelUntillMin3CharacterIsNotEntered();
	}
	
	@Then("^I Verify User should be able to enter 30 characters or less than that but not more than 30 characters in Profession text field.")
	public void IVerifyUserShouldbeabletoenter30charactersorlessthanthatbutnotmorethan() throws InterruptedException {
		new EditProfilePage().IVerifyUserShouldbeabletoenter30charactersorlessthanthatbutnotmorethan();
	}
	
	@Then("^I Verify User should be able to see the device Current Location later verify Tapping on currecnt location, user should get allow location access popup.")
	public void IVerifyCurrentLocationFieldFunctionalityandItsPopUP() throws InterruptedException {
		new EditProfilePage().IVerifyCurrentLocationFieldFunctionalityandItsPopUP();
	}
	
	@Then("^I Verify user is able to update Bio with 1000 characters, By tapping on save changes button toast message should display when user enters more than 1000 characters in Bio field.")
	public void IVerifyuserisabletoupdateBioUsing1000characters() throws InterruptedException {
		new EditProfilePage().IVerifyuserisabletoupdateBioUsing1000characters();
	}
	
	@Then("^I Verify on tapping Date of Birth field Google default Calender should open.")
	public void IVerifyontappingDateofBirthfieldGoogledefaultCalendershouldopen() throws InterruptedException {
		new EditProfilePage().IVerifyontappingDateofBirthfieldGoogledefaultCalendershouldopen();
	}
	
	@Then("^I Verify user is able to select any of the previous dates not before dates from calender.")
	public void IVerifyuserisabletoselectanyofthepreviousdatesnotbeforedatesfromcalender() throws InterruptedException {
		new EditProfilePage().IVerifyuserisabletoselectanyofthepreviousdatesnotbeforedatesfromcalender();
	}
	
	@Then("^I Verify on tapping open link button user should be navigated to respective social media web page under Social Media Section.")
	public void IVerifyOpenLinkButtonUnderSocialMediaSection() throws InterruptedException {
		new EditProfilePage().IVerifyOpenLinkButtonUnderSocialMediaSection();
	}
	
	@Then("^I Verify on tapping clear link button the entered link should be cleared.")
	public void IVerifyontappingclearlinkbuttontheenteredlinkshouldbecleared() throws InterruptedException {
		new EditProfilePage().goToProfilePage();
		new EditProfilePage().IVerifyontappingclearlinkbuttontheenteredlinkshouldbecleared();
	}
	
	@Then("^I Verify Functionality on every field page and check on edit profile as well on profile page.")
	public void IVerifyDeletebuttonFunctionalityoneveryfieldpage() throws InterruptedException {
		new EditProfilePage().IVerifyDeletebuttonFunctionalityoneveryfieldpage();
	}
	
	@Then("^I Verify By Deleting the Saved Qualification and Saved Experience.")
	public void IVerifyByDeletingtheSavedQualificationandSavedExperience() throws InterruptedException {
		new EditProfilePage().IVerifyByDeletingtheSavedQualificationandSavedExperience();
	}
	
	@Then("^I Verify Deleted Links Should Not Appear on Profile Tab")
	public void IVerifyDeletedLinksShouldNotAppearonProfileTab() throws InterruptedException{
		//new EditProfilePage().goToProfilePage();
		new EditProfilePage().IVerifyDeletedLinksShouldNotAppearonProfileTab();
	}
	
	@Then("^I verify by Deleting Website Textfield, should not appear on profile page.")
	public void IverifybyDeletingWebsiteTextfieldshoulddisappearonprofilepage() throws InterruptedException{
		new EditProfilePage().IverifybyDeletingWebsiteTextfieldshoulddisappearonprofilepage();
	}
	
	@Then("^I Verify On tapping delete button of Profession, confirmation popup should be shown & on deleting it should reflect in both edit profile & profile screens.")
	public void IverifybyDeletingProfessionalTextfieldshoulddisappearonprofilepage() throws InterruptedException{
		new EditProfilePage().IverifybyDeletingProfessionalTextfieldshoulddisappearonprofilepage();
	}
	
	@Then("^I Verify On tapping delete button of Location Field, confirmation popup should be shown & on deleting it should reflect in both edit profile & profile screens.")
	public void IverifybyDeletingLocationTextfieldshoulddisappearonprofilepage() throws InterruptedException{
		new EditProfilePage().IverifybyDeletingLocationTextfieldshoulddisappearonprofilepage();
	}
	
	@Then("^I Verify On tapping delete button of Bio Field, confirmation popup should be shown & on deleting it should reflect in both edit profile & profile screens.")
	public void IverifybyDeletingBioTextfieldshoulddisappearonprofilepage() throws InterruptedException{
		new EditProfilePage().IverifybyDeletingBioTextfieldshoulddisappearonprofilepage();
	}
	
	@Then("^I Verify On tapping delete button of DOB Field, confirmation popup should be shown & on deleting it should reflect in both edit profile & profile screens.")
	public void IverifybyDeletingDOBTextfieldshoulddisappearonprofilepage() throws InterruptedException{
		new EditProfilePage().IverifybyDeletingDOBTextfieldshoulddisappearonprofilepage();
	}
	
	@Then("^I Verify by Entering the details again.")
	public void IVerifyByEnteringTheDetailsAgain() throws InterruptedException{
		new EditProfilePage().IVerifyByEnteringTheDetailsAgain();
	}

}
