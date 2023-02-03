package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MLKCreationPage extends BasePage {
	
	
	@FindBy(id = "com.koo.app:id/toolbar_profile")
	public WebElement HomeScreen;
	
	@FindBy(id="com.koo.app:id/circular_fab")
	public WebElement addButton;
	
	@FindBy(id="com.koo.app:id/post_text_view")
	public WebElement whatsYourMindTextBox;
	
	
	@FindBy(xpath ="//android.widget.TextView[@text='Hindi']")
	public WebElement HindiLaguageBttn;
	
	@FindBy(id="com.koo.app:id/add_language_iv")
	public WebElement languageSelectionPlusIcon;
	
	@FindBy(xpath = "//android.widget.TextView[@text='(Hindi)']")
	public WebElement hindiLanguageButton;
	
	@FindBy(id="com.koo.app:id/translate_tv")
	public WebElement translateFromOrignalLangugeButton;
	
	@FindBy(id="com.koo.app:id/post_button")
	public WebElement postButton;
	
	@FindBy(id="com.koo.app:id/done_tv")
	public WebElement doneButton;
	
	@FindBy(id="com.koo.app:id/img_my_profile")
	public WebElement userProfileIcon;
	
	@FindBy(id="com.koo.app:id/tv_available_lng_count")
	public WebElement availableLanguageCount;
	
	@FindBy(xpath = "//android.widget.TextView[@text='English']")
	public WebElement enlishLanguagePostButtoon;
	
	@FindBy(xpath = "//android.view.ViewGroup[@index='3']/android.widget.LinearLayout[@index='0']/androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='0']/android.widget.TextView[@index='0']")
	public WebElement language1Buttoon;

	@FindBy(xpath = "//android.view.ViewGroup[@index='3']/android.widget.LinearLayout[@index='0']/androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='1']/android.widget.TextView[@index='0']")
	public WebElement language2Button;
	
	@FindBy(xpath = "//android.view.ViewGroup[@index='3']/android.widget.LinearLayout[@index='0']/androidx.recyclerview.widget.RecyclerView[@index='1']/android.widget.LinearLayout[@index='2']/android.widget.TextView[@index='0']")
	public WebElement language3Button;
	
	@FindBy(xpath = "//android.widget.TextView[@text='(Tamil)']")
	public WebElement tamilLanguageButton;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Tamil']")
	public WebElement TamilLaguageBttn;

	@FindBy(xpath = "//android.widget.TextView[@text='(Kannada)']")
	public WebElement kannadaLanguageButton;
	
	@FindBy(xpath ="//android.widget.TextView[@text='Kannada']")
	public WebElement KannadaLaguageBttn;

	@FindBy(xpath="//android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='1']/android.widget.TextView[@index='2']")
	public WebElement selectedLanguage;
	
	@FindBy(xpath="//android.widget.LinearLayout[@index='1']/android.view.ViewGroup[@index='0']/android.widget.TextView[@index='2']")
	public WebElement defaultSelectedLanguage;
	
	
	public MLKCreationPage() {
		
	}
	
    public void VerifyUserIsOnHomePage() throws InterruptedException {
    	waitForVisibility(HomeScreen);
    	Assert.assertTrue(isElementPresent(HomeScreen));
		
	}
    
    public void NavigationToKooCreationPage() throws InterruptedException {
    	waitForVisibility(addButton);
		click(addButton);
		waitForVisibility(whatsYourMindTextBox);
		Assert.assertTrue(isElementPresent(whatsYourMindTextBox));
    }
    
    public void kooCreationWithAllAvailableLanguage() throws InterruptedException{
    	click(languageSelectionPlusIcon);
    	waitForVisibility(doneButton);
    	while(isElementPresent(selectedLanguage)) {
			waitForVisibility(selectedLanguage);
			click(selectedLanguage);
			Thread.sleep(1000);
		}
    }
    
    public void CreationOfKooUsingThreeLanguages(String languageToSelctText1, String languagetoSelectText2) throws InterruptedException {
    	click(languageSelectionPlusIcon);
    	waitForVisibility(doneButton);
    	while(isElementPresent(selectedLanguage)) {
			waitForVisibility(selectedLanguage);
			click(selectedLanguage);
			Thread.sleep(1000);
		}
    	
		WebElement languageToBeSelect1 = getDynamicVariable("//android.widget.TextView[@text='("+languageToSelctText1+")']");
		WebElement languageToBeSelect2 = getDynamicVariable("//android.widget.TextView[@text='("+languagetoSelectText2+")']");
		waitForVisibility(languageToBeSelect1);
		try {
			if(isElementPresent(selectedLanguage)) {
				waitForVisibility(selectedLanguage);
				click(selectedLanguage);
			}
		} catch(Exception e) {
			e.getStackTrace();
		}	
		click(languageToBeSelect1);
		click(languageToBeSelect2);
		Thread.sleep(1000);
		click(doneButton);
		WebElement languageSelectedIcon1 = getDynamicVariable("//android.widget.TextView[@text='"+languageToSelctText1+"']");
		waitForVisibility(languageSelectedIcon1);
		WebElement languageSelectedIcon2 = getDynamicVariable("//android.widget.TextView[@text='"+languagetoSelectText2+"']");
		waitForVisibility(languageSelectedIcon2);
		sendKeys(whatsYourMindTextBox,"Creating a new MLK Post");
		click(languageSelectedIcon1);
		Thread.sleep(1000);
		waitForVisibility(translateFromOrignalLangugeButton);
		Assert.assertTrue(translateFromOrignalLangugeButton.getText().equalsIgnoreCase("Translate from original"));
		click(translateFromOrignalLangugeButton);
		Thread.sleep(3000);
		click(languageSelectedIcon2);
		Thread.sleep(1000);
		waitForVisibility(translateFromOrignalLangugeButton);
		Assert.assertTrue(translateFromOrignalLangugeButton.getText().equalsIgnoreCase("Translate from original"));
		click(translateFromOrignalLangugeButton);
		Thread.sleep(3000);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(4000);
    	
    }
    public void selectLanguageForMultiKoo(String languageToSelctText) throws InterruptedException{
    	WebElement languageToBeSelect = getDynamicVariable("//android.widget.TextView[@text='("+languageToSelctText+")']");
		waitForVisibility(languageToBeSelect);
		click(languageToBeSelect);
		Thread.sleep(500);
    }
    
    public void removeSelectedLanguageIfAlreadySelected() throws InterruptedException{
			while(isElementPresent(selectedLanguage)) {
				waitForVisibility(selectedLanguage);
				click(selectedLanguage);
			}
		
    }

    public void removeDefaultLanguageAfterOneLaguageIsAdded() throws InterruptedException{
		
			waitForVisibility(defaultSelectedLanguage);
			click(defaultSelectedLanguage);
		
	
    }
    
    public void verifyIfLanguageIsAdded(String languageToSelctText) {
    	waitForVisibility(whatsYourMindTextBox);
    	WebElement languageSelectedIcon = getDynamicVariable("//android.widget.TextView[@text='"+languageToSelctText+"']");
		waitForVisibility(languageSelectedIcon);
    }
   
    public void Creationofmultilingualkoo(String languageToSelctText) throws InterruptedException{
    	click(languageSelectionPlusIcon);
    	waitForVisibility(doneButton);
    	removeSelectedLanguageIfAlreadySelected();
    	selectLanguageForMultiKoo(languageToSelctText);
		Thread.sleep(1000);
		click(doneButton);
		verifyIfLanguageIsAdded(languageToSelctText);
		WebElement languageSelectedIcon = getDynamicVariable("//android.widget.TextView[@text='"+languageToSelctText+"']");
		sendKeys(whatsYourMindTextBox,"Creating a new MLK Post");
		click(languageSelectedIcon);
		Thread.sleep(1000);
		waitForVisibility(translateFromOrignalLangugeButton);
		Assert.assertTrue(translateFromOrignalLangugeButton.getText().equalsIgnoreCase("Translate from original"));
		click(translateFromOrignalLangugeButton);
		Thread.sleep(3000);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(4000);
    	
    }

    public void selectOnlyOneLanguageApartFromEnglishLag(String languageToSelctText) throws InterruptedException{
    	click(languageSelectionPlusIcon);
    	waitForVisibility(doneButton);
    	removeSelectedLanguageIfAlreadySelected();
    	selectLanguageForMultiKoo(languageToSelctText);
		Thread.sleep(1000);
		
		click(doneButton);
		verifyIfLanguageIsAdded(languageToSelctText);
		WebElement languageSelectedIcon = getDynamicVariable("//android.widget.TextView[@text='"+languageToSelctText+"']");
		sendKeys(whatsYourMindTextBox,"Creating a new MLK Post");
		click(languageSelectedIcon);
		Thread.sleep(1000);
		waitForVisibility(translateFromOrignalLangugeButton);
		Assert.assertTrue(translateFromOrignalLangugeButton.getText().equalsIgnoreCase("Translate from original"));
		click(translateFromOrignalLangugeButton);
		Thread.sleep(3000);
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(4000);
    	
    }

    public void IVerifyForMultipleSplitOfLanguageForKoo(String numofLanguage) throws InterruptedException {
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(availableLanguageCount.getText().equalsIgnoreCase("Available in "+numofLanguage+" languages"));
		Assert.assertTrue(isElementPresent(language1Buttoon));
		Assert.assertTrue(isElementPresent(language2Button));
		waitForVisibility(language2Button);
		click(language2Button);
		Thread.sleep(1000);
		waitForVisibility(language1Buttoon);
		click(language1Buttoon);
		try {
			if(isElementPresent(language3Button)) {
				click(language3Button);
				Thread.sleep(1000);
				waitForVisibility(language1Buttoon);
				click(language1Buttoon);
				
			}
		}catch(Exception e) {
			e.getStackTrace();
		}	
		
	}
    
    public void IVerifyForMultipleSplitOfLanguageForAllLanguageKoo() throws InterruptedException {
		waitForVisibility(userProfileIcon);
		Assert.assertTrue(availableLanguageCount.getText().equalsIgnoreCase("Available in 8 languages"));
		Assert.assertTrue(isElementPresent(language1Buttoon));
		Assert.assertTrue(isElementPresent(language2Button));
		waitForVisibility(language2Button);
		click(language2Button);
		Thread.sleep(1000);
		waitForVisibility(language1Buttoon);
		click(language1Buttoon);
		try {
			if(isElementPresent(language3Button)) {
				click(language3Button);
				Thread.sleep(1000);
				waitForVisibility(language1Buttoon);
				click(language1Buttoon);
				
			}
		}catch(Exception e) {
			e.getStackTrace();
		}	
		
	}
	

	public void createAndVerifyKooOfDifferentLanguageFromEnglishLanguage(String languageToTranslate) throws InterruptedException {
		VerifyUserIsOnHomePage();
		NavigationToKooCreationPage();	
		Creationofmultilingualkoo(languageToTranslate);
		IVerifyForMultipleSplitOfLanguageForKoo("2");
		
	}
    
   public void ICreateOneKooWithAllAvailableLanguageAndVerifyThem() throws InterruptedException{
	   	VerifyUserIsOnHomePage();
		NavigationToKooCreationPage();
		click(languageSelectionPlusIcon);
    	waitForVisibility(doneButton);
    	removeSelectedLanguageIfAlreadySelected();
    	selectLanguageForMultiKoo("Hindi");
    	selectLanguageForMultiKoo("Tamil");
    	selectLanguageForMultiKoo("Kannada");
    	selectLanguageForMultiKoo("Telugu");
    	selectLanguageForMultiKoo("Marathi");
    	selectLanguageForMultiKoo("Bangla");
    	selectLanguageForMultiKoo("Gujarati");
    	click(doneButton);
    	waitForVisibility(whatsYourMindTextBox);
    	sendKeys(whatsYourMindTextBox,"Creating a new MLK Post for all language");
		for(int i=1;i<=7;i++) {
			WebElement languageSelectedIcon = getDynamicVariable("//android.widget.HorizontalScrollView[@index='2']/android.widget.LinearLayout[@index='0']/android.widget.LinearLayout[@index='"+i+"']");
			waitForVisibility(languageSelectedIcon);
			click(languageSelectedIcon);
			Thread.sleep(1000);
			waitForVisibility(translateFromOrignalLangugeButton);
			Assert.assertTrue(translateFromOrignalLangugeButton.getText().equalsIgnoreCase("Translate from original"));
			click(translateFromOrignalLangugeButton);
			Thread.sleep(2000);
		}
		waitForVisibility(postButton);
		click(postButton);
		Thread.sleep(4000);
		IVerifyForMultipleSplitOfLanguageForKoo("8");
   }
	
	
	public void ICreateKooWithHindiTamilEnglishLanguagesAndVerifyThem() throws InterruptedException {
		VerifyUserIsOnHomePage();
		NavigationToKooCreationPage();
		CreationOfKooUsingThreeLanguages("Hindi", "Tamil");
		IVerifyForMultipleSplitOfLanguageForKoo("3");
	}

	public void ICreateKooWithEnglishTeluguKannadaLanguagesAndVerifyThem() throws InterruptedException {
		VerifyUserIsOnHomePage();
		NavigationToKooCreationPage();
		CreationOfKooUsingThreeLanguages("Kannada", "Telugu");
		IVerifyForMultipleSplitOfLanguageForKoo("3");
	}

	public void ICreateKooWithEnglishMarathiBanglaLanguagesAndVerifyThem() throws InterruptedException {
		VerifyUserIsOnHomePage();
		NavigationToKooCreationPage();
		CreationOfKooUsingThreeLanguages("Marathi", "Bangla");
		IVerifyForMultipleSplitOfLanguageForKoo("3");
	}
	
	public void iCreateKooWithDifferentCombinations(String languageToSelect) throws InterruptedException {
		KooCreationPage koocreationpage = new KooCreationPage();
		VerifyUserIsOnHomePage();
		NavigationToKooCreationPage();	
		click(languageSelectionPlusIcon);
    	waitForVisibility(doneButton);
    	removeSelectedLanguageIfAlreadySelected();
    	selectLanguageForMultiKoo(languageToSelect);
		Thread.sleep(1000);
		removeDefaultLanguageAfterOneLaguageIsAdded();
		click(doneButton);
		verifyIfLanguageIsAdded(languageToSelect);
		
		koocreationpage.createKooPost("Checking koo post with Audio and Image");
		koocreationpage.creatingPostWithAudioAndImage();
		koocreationpage.clickonKooCreation();
		koocreationpage.createKooPost("Checking koo post with Audio and Link");
		koocreationpage.creatingPostWithAudioAndLink();
		koocreationpage.clickonKooCreation();
		koocreationpage.createKooPost("Checking koo post with Video and Image");
		koocreationpage.creatingPostWithVideoAndImage();
		koocreationpage.clickonKooCreation();
		koocreationpage.createKooPost("Checking koo post with Video and Link");
		koocreationpage.creatingPostWithVideoAndLink();
		
	}
	
	public void iCreateKooWithDifferentCombinationsWithoutTitle(String languageToSelect) throws InterruptedException {
		KooCreationPage koocreationpage = new KooCreationPage();
		VerifyUserIsOnHomePage();
		NavigationToKooCreationPage();	
		click(languageSelectionPlusIcon);
    	waitForVisibility(doneButton);
    	removeSelectedLanguageIfAlreadySelected();
    	selectLanguageForMultiKoo(languageToSelect);
		Thread.sleep(1000);
		removeDefaultLanguageAfterOneLaguageIsAdded();
		click(doneButton);
		verifyIfLanguageIsAdded(languageToSelect);
		
	
		koocreationpage.creatingPostWithAudioAndImage();
		koocreationpage.clickonKooCreation();
		koocreationpage.creatingPostWithAudioAndLink();
		koocreationpage.clickonKooCreation();
		koocreationpage.creatingPostWithVideoAndImage();
		koocreationpage.clickonKooCreation();
		koocreationpage.creatingPostWithVideoAndLink();
			
	}

	
	



	

}
