package com.qa.pages;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Enums;
import com.qa.pages.Filters.Languages;
import com.qa.pages.Filters.NigerianLanguages;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class LanguageSelectionPage extends BasePage {
	TestUtils utils = new TestUtils();

	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	public WebElement languageButton;

	@FindBy(id = "com.google.android.gms:id/credential_picker_layout")
	public WebElement googlepopup;

	@FindBy(xpath = "//android.widget.TextView[@text='(Urdu)']")
	public WebElement languageButtonUrdu;

	@FindBy(id = "com.koo.app:id/sign_with_email")
	public WebElement lnk_signInWithEmail;

	@FindBy(id = "com.koo.app:id/language_footer")
	public List<WebElement> txt_allLanguges;

	@FindBy(id = "com.koo.app:id/language_footer_nigeria")
	public List<WebElement> txt_allLangugesNigeria;

	@FindBy(id = "com.koo.app:id/header_textview")
	public WebElement txt_topHeader;

	@FindBy(id = "com.koo.app:id/view_language_header")
	public WebElement txt_LanguageOfHeader;

	@FindBy(id = "com.koo.app:id/india_card")
	public WebElement btn_IndianLanguage;

	@FindBy(id = "com.koo.app:id/nigeria_card")
	public WebElement btn_NigerianLanguage;

	@FindBy(id = "com.koo.app:id/available_languages")
	public WebElement txt_AvailableLanguageSectionNigeria;

	@FindBy(id = "com.koo.app:id/coming_soon_language_heading")
	public WebElement txt_ComingSoonLanguageSectionNigeria;

	@FindBy(id = "com.koo.app:id/available_language_heading")
	public WebElement txt_AvailableLanguageSectionIndia;

	@FindBy(id = "com.koo.app:id/coming_soon_language_heading")
	public WebElement txt_ComingSoonLanguageSectionIndia;

// to find the enter mobile number text field using id's
	@FindBy(id = "com.koo.app:id/phone_no_edittext")
	public WebElement txt_EnterMobileNumberInPopUp;


	@FindBy(id = "com.koo.app:id/phone_no_next_button")
	public WebElement proceedButtonInPopUp;

	public LanguageSelectionPage() {
	}

	public LanguageSelectionPage waitForLanguageScreen() {
		waitForVisibility(languageButton);
		return this;
	}

	public LanguageSelectionPage clickOnEnglishLanguage() {
		// waitForLanguageScreen();
		languageButton.click();

		// click(languageButton);
		return this;

	}

	public void swipeUpside() {
		swipeToSeeUpsideElementsOfScreen(2);

	}

	public void verifyAllLangugesOption() throws InterruptedException {
		Assert.assertTrue(txt_allLanguges.size() > 1);
		String language = "";
		for (WebElement el : txt_allLanguges) {
			language = TestUtils.removeSpecialCharacters(el.getText());
			Assert.assertTrue(Enums.getIfPresent(Languages.class, language).isPresent());
		}
		swipeToSeeDownsideElementsOfScreen(2);
		Thread.sleep(2000);
		for (WebElement el1 : txt_allLanguges) {
			language = TestUtils.removeSpecialCharacters(el1.getText());
			Assert.assertTrue(Enums.getIfPresent(Languages.class, language).isPresent());
		}
	}
	public LanguageSelectionPage waitForgooglepop() throws InterruptedException {
		Thread.sleep(3000);
		waitForVisibility(googlepopup);
		Assert.assertTrue(isElementPresent(googlepopup));
		Assert.assertTrue(googlepopup.getAttribute("content-desc").equalsIgnoreCase("Choose an Account"));
		//System.out.println(googlepopup.getAttribute("content-desc"));
		clickAndroidDeviceBackBttn();
		return this;
	}

	public void verifySelectLanguageText(String languagetext) {
		Assert.assertTrue(txt_topHeader.getText().contains(languagetext));

	}

	public void verifyLanguagesOfSection() {
		waitForVisibility(txt_LanguageOfHeader);
		Assert.assertTrue(txt_LanguageOfHeader.getText().contains("View Languages of"));
		Assert.assertTrue(isElementPresent(btn_IndianLanguage));
		Assert.assertTrue(isElementPresent(btn_NigerianLanguage));

	}

	public void verifyNigerianLanguages() throws InterruptedException {
		click(btn_NigerianLanguage);
		Assert.assertTrue(txt_allLangugesNigeria.size() > 0);
		String language = "";
		for (WebElement el : txt_allLangugesNigeria) {
			language = TestUtils.removeSpecialCharacters(el.getText());
			Assert.assertTrue(Enums.getIfPresent(NigerianLanguages.class, language).isPresent());
		}

	}

	public void verifyLanguagesDivisionSectionOfNigerianLaguage() {

		Assert.assertTrue(isElementPresent(txt_AvailableLanguageSectionNigeria));
		Assert.assertTrue(isElementPresent(txt_ComingSoonLanguageSectionNigeria));
		click(btn_IndianLanguage);
	}

	public void verifyLanguagesDivisionSectionOfIndianLaguage() {
		swipeToSeeUpsideElementsOfScreen(2);
		Assert.assertTrue(isElementPresent(txt_AvailableLanguageSectionIndia));
		Assert.assertTrue(isElementPresent(txt_ComingSoonLanguageSectionIndia));
	}

	public void scrollDownOnLanguageScreenToCheckIfLastLanguageDisplay() {
		swipeToSeeDownsideElementsOfScreen(2);
		Assert.assertTrue(isElementPresent(languageButtonUrdu));
	}

	public void verifyByDefaultIndiaIsSelected() throws URISyntaxException, IOException {
		By selectedLanguageByDefault = MobileBy.image(getReferenceImageB64("SelectedIndiaLanguage.PNG"));
		waitForVisibility(selectedLanguageByDefault);

	}

	public void clickOnInformMeButtonOfComingSoonLanguage(String languagename) {
		String xpathOfComingSoonLang = "//android.widget.TextView[@text='(" + languagename
				+ ")']/following-sibling::android.widget.Button";
		getDynamicVariable(xpathOfComingSoonLang).click();

	}

	public void clickOnLanguageSectionOfComingSoonLanguage(String languagename) {
		String xpathOfComingSoonLang = "//android.widget.TextView[@text='" + languagename + "']";
		getDynamicVariable(xpathOfComingSoonLang).click();

	}

	public void pressBackToNavigateBackToLanguageScreen() throws InterruptedException {
		clickAndroidDeviceBackBttn();
		Thread.sleep(1000);
		clickAndroidDeviceBackBttn();
		waitForLanguageScreen();

	}

	public void clickOnIndianLanguage() {
		click(btn_IndianLanguage);
	}

	public void enterMobileNumberInPopUp()
	{
		txt_EnterMobileNumberInPopUp.sendKeys("7837236146");
	}

	public void proceedButtonInPopUp()
	{
		proceedButtonInPopUp.click();
	}

}
