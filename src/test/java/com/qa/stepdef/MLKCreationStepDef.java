package com.qa.stepdef;


import com.qa.pages.MLKCreationPage;

import io.cucumber.java.en.Then;

public class MLKCreationStepDef {
	
	@Then("^I create a new \"([^\"]*)\" Koo From English Language.")
	public void ICreateaNewaHindiKooFromEnglishLanguage(String language) throws InterruptedException {
		new MLKCreationPage().createAndVerifyKooOfDifferentLanguageFromEnglishLanguage(language);
	}
		
	@Then("^Creation of multilingual koo")
	public void Creationofmultilingualkoo(String languageToSelctText) throws InterruptedException {
		new MLKCreationPage().Creationofmultilingualkoo(languageToSelctText);
	}
	
	@Then("^I Create a Koo with all Language and verify them.")
	public void ICreateKooWithAllLanguagesAndVerifyThem() throws InterruptedException {
		new MLKCreationPage().ICreateOneKooWithAllAvailableLanguageAndVerifyThem();
	}
		
	@Then("^I Create Koo with English Hindi Tamil Languages and verify them.")
	public void ICreateKooWithHindiTamilEnglishLanguagesAndVerifyThem() throws InterruptedException {
		new MLKCreationPage().ICreateKooWithHindiTamilEnglishLanguagesAndVerifyThem();
	}
	
	@Then("^I Create Koo with English kannada Telugu Languages and verify them.")
	public void ICreateKooWithEnglishTeluguKannadaLanguagesAndVerifyThem() throws InterruptedException {
		new MLKCreationPage().ICreateKooWithEnglishTeluguKannadaLanguagesAndVerifyThem();
	}
	
	@Then("^I Create Koo with English Marathi Bangla Languages and verify them.")
	public void ICreateKooWithEnglishMarathiBanglaLanguagesAndVerifyThem() throws InterruptedException {
		new MLKCreationPage().ICreateKooWithEnglishMarathiBanglaLanguagesAndVerifyThem();
	}

	@Then("^I create a Koo in \"([^\"]*)\" language with combination of Title with Audio and Image/Images,Title with Audio and Link,Title with Video and Image/Images,Title with Video and Link.")
	public void iCreateKooWithAboveCombination(String language) throws InterruptedException {
		new MLKCreationPage().iCreateKooWithDifferentCombinations(language);
	}
	
	@Then("^I create a Koo in \"([^\"]*)\" language with combination of Without title Audio and Image/Images,Without title Audio and Link,Without title Video and Image/Images,Without title Video and Link")
	public void iCreateKooWithAboveCombinationWithoutTitle(String language) throws InterruptedException {
		new MLKCreationPage().iCreateKooWithDifferentCombinationsWithoutTitle(language);
	}

	
	
	
	
	
	
}
