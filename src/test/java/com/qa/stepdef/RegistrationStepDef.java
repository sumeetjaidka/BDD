package com.qa.stepdef;

import com.qa.pages.LoginPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStepDef {

	
	@Then("^I enter username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String username) throws InterruptedException {
        new LoginPage().enterUserName(username);
    }
}
