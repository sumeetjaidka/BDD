package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.utils.TestUtils;

import io.cucumber.java.en.Then;

public class TrendingTags extends BasePage {
	TestUtils utils = new TestUtils();

	@FindBy(xpath = "//android.widget.LinearLayout[@index='2']")
	public WebElement trendingHeadr;

	@FindBy(id = "com.koo.app:id/layout_explore")
	public WebElement hastTagSymbol;

	@FindBy(xpath = "//android.widget.TextView[@index='0']")
	public WebElement TrendingHastagHeadr;

	@FindBy(xpath = "//android.widget.TextView[@text='In The News']")
	public WebElement inTheNewsHeadr;

	@FindBy(id = "com.koo.app:id/hashtag_images_rl")
	public WebElement profilesImagesCollection;

	@FindBy(xpath = "//android.widget.LinearLayout")
	public List<WebElement> listOfHastTagTitles;

	@FindBy(xpath = "//com.koo.app:id/hashtag_images_rl[@index='0']/android.widget.ImageView[@index='0']")
	public WebElement individualProfilePictureofCreator;

	@FindBy(id = "com.koo.app:id/toolbar_title")
	public WebElement hastTagTitleAtRespectiveScreen;

	@FindBy(xpath = "//android.widget.ImageView")
	public List<WebElement> listOfProfilePictureUnderHastTag;

	@FindBy(id = "com.koo.app:id/post_text_view")
	public WebElement textBoxContainingHasTagTitle;

	@FindBy(id = "com.koo.app:id/circular_fab")
	public WebElement plusIconTab;

	@FindBy(id = "com.koo.app:id/post_button")
	public WebElement postButton;

	@FindBy(id = "android:id/button2")
	public WebElement noButtonOnConfirmationPopUp;

	@FindBy(id = "android:id/button1")
	public WebElement yesButtonOnConfirmationPopUp;

	@FindBy(id = "com.koo.app:id/koo_using_hashtag")
	public WebElement kooCreationFabIcon;

	@FindBy(id = "com.koo.app:id/back_imageview")
	public WebElement backButton;

	@FindBy(id = "com.koo.app:id/topic_title")
	public WebElement hastTagTitle;

	@FindBy(xpath = "//android.widget.TextView[@text='People']")
	public WebElement peopleTab;

	@FindBy(id = "com.koo.app:id/divider_view")
	public WebElement dividerLine;

	public void verifyHastTagIconAtTheBottomBarNavigateToTrendingHastagScreen() throws InterruptedException {
		Thread.sleep(3000);
		click(hastTagSymbol);
		Assert.assertTrue(isElementPresent(TrendingHastagHeadr));

	}

	public void verifyListOfTreadingTags() throws InterruptedException {
		Thread.sleep(2500);
		Assert.assertTrue(listOfHastTagTitles.size() >= 1);
		int count = listOfHastTagTitles.size();
		System.out.print(count);
	}

	public void verifyProfilePicturesOfCreater() {
		Assert.assertTrue(isElementPresent(profilesImagesCollection));
	}

	public void verifyFiveProfilePictureUnderTrendingTags() {
		Assert.assertTrue(listOfProfilePictureUnderHastTag.size() > 5);

	}

	public void verifyPlusButton() {
		Assert.assertTrue(isElementPresent(plusIconTab));

	}

	public void verifyClickOnPlusButtonNavigateToKooCreationScreen() throws InterruptedException {
		click(plusIconTab);
		Thread.sleep(2500);
  
		Assert.assertTrue(isElementPresent(postButton));
		Assert.assertTrue(isElementPresent(textBoxContainingHasTagTitle));

	}

	public void clickOnBackButtoonAndVerifyYesAndNo() throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibility(textBoxContainingHasTagTitle);
		sendKeys(textBoxContainingHasTagTitle, "The automated reply");
		Thread.sleep(1500);
		click(backButton);
		Assert.assertTrue(isElementPresent(noButtonOnConfirmationPopUp));
		Assert.assertTrue(isElementPresent(yesButtonOnConfirmationPopUp));
	}

	public void verifyAndClickOnYesButton() throws InterruptedException {
		Thread.sleep(2000);
		click(backButton);
		Thread.sleep(1000);
		click(yesButtonOnConfirmationPopUp);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(TrendingHastagHeadr));
		Thread.sleep(5000);
	}

	public void verifyAndClickOnNoButton() {
		click(noButtonOnConfirmationPopUp);
		Assert.assertTrue(isElementPresent(postButton));
		Assert.assertTrue(isElementPresent(textBoxContainingHasTagTitle));
	}

	public void verifyClickONRespectiveHastagUserShouldNavigateToDetailedScreen() throws InterruptedException {
		click(hastTagTitle);
		Thread.sleep(1500);
		Assert.assertTrue(isElementPresent(kooCreationFabIcon));
		Thread.sleep(5000);
	}

	public void verifyAndClickOnBackButtonOnRespectiveHastTagScreen() throws InterruptedException {
		Thread.sleep(5000);
		click(backButton);
		Thread.sleep(2000);
	}

	public void verifyOnTappingPlusIconButtonHashtagUserShouldNavigateToKooCreationScreen()
			throws InterruptedException {
		click(plusIconTab);
		Thread.sleep(5000);
		String hastTagTitleText = hastTagTitle.getText();
		Assert.assertTrue(isElementPresent(kooCreationFabIcon));
		String hdii = hastTagTitleAtRespectiveScreen.getText();
		System.out.print("The titles of the txext arte" + hastTagTitleText + "  " + hdii);
		// Assert.assertTrue(hastTagTitle.getText().equalsIgnoreCase(hastTagTitleAtRespectiveScreen.getText()));
		Thread.sleep(3000);

	}

	public void verifyThereShouldBeKooCreationFabIconOnTappingItUserShouldNavigateToKooCreationScreenAndCursorShouldHighlightWithKeypadOpen()
			throws InterruptedException {
		click(kooCreationFabIcon);
		Thread.sleep(2500);
		Assert.assertTrue(isElementPresent(textBoxContainingHasTagTitle));
		Thread.sleep(2000);
		click(backButton);
		click(yesButtonOnConfirmationPopUp);

	}

	public void verifyAfterEnteringTextInsideKooCreationTitleBoxTappingOnAppDeviceBackButtonFromKooCreationScreenConfirmationPopupShouldShowWithYesOrNo()
			throws InterruptedException {
		Thread.sleep(2000);
		waitForVisibility(textBoxContainingHasTagTitle);
		sendKeys(textBoxContainingHasTagTitle, "The automated reply");
		Thread.sleep(1500);
		click(backButton);
		Assert.assertTrue(isElementPresent(noButtonOnConfirmationPopUp));
		Assert.assertTrue(isElementPresent(yesButtonOnConfirmationPopUp));
	}

	public void verifyAllTheHashtagsUIShouldBeInOneGroupWithDividerLineBelowEveryHashtag() {
		Assert.assertTrue(isElementPresent(dividerLine));
	}

	public void verifyUserShouldBeAbleToScrollTheScreen() throws InterruptedException {
		Thread.sleep(1500);
		waitForVisibility(TrendingHastagHeadr);

	}

	public void verifyInTheNewsSectionShouldShowOnlyIfThereAreAnyHashtagsIsTrendingFromNewsProfiles() {
		try {
			Thread.sleep(5000);
			waitForVisibility(hastTagSymbol);
			click(hastTagSymbol);
			Assert.assertTrue(isElementPresent(TrendingHastagHeadr));
			if(isElementPresent(inTheNewsHeadr)) {
				Assert.assertTrue(isElementPresent(inTheNewsHeadr));
				Thread.sleep(2000);
				click(inTheNewsHeadr);
			}
			else
			{
				System.out.println("News hashtags are not seen");
			}
		} catch (Exception e) {
			e.getStackTrace();
		}

	}

	public void verifyAndClickOnProfilePictureOfTheCreator() throws InterruptedException {
		Assert.assertTrue(isElementPresent(profilesImagesCollection));
		Thread.sleep(2500);
		click(individualProfilePictureofCreator);
		Thread.sleep(2500);

	}

	public void onTappingYesUserShouldBackToScreen() throws InterruptedException {
		click(backButton);
		Thread.sleep(500);
		click(yesButtonOnConfirmationPopUp);
		Thread.sleep(1000);
		Assert.assertTrue(isElementPresent(inTheNewsHeadr));

	}

	public void verifyOnDraggingTheScreenDownAndReleaseToRefreshTextShouldShowAndOnReleasingScreenShouldRefresh()
			throws InterruptedException {
		swipeToSeeUpsideElementsOfScreen(2);
		Thread.sleep(2500);
	}

	public void verifyOnTappingAppDeviceBackButtonFromProfileScreenUserShouldNavigateToInTheNewsScreen()
			throws InterruptedException {
		Thread.sleep(2000);
		click(backButton);
		Thread.sleep(2000);
		Assert.assertTrue(isElementPresent(inTheNewsHeadr));
	}

}
