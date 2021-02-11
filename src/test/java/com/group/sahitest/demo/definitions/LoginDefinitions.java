package com.group.sahitest.demo.definitions;

import com.group.sahitest.demo.steps.LoginSteps;

import cucumber.api.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class LoginDefinitions {

	@Steps
	LoginSteps loginS;

	@Given("^login app web \"([^\"]*)\" \"([^\"]*)\"$")
	public void loginAppWeb(String user, String pass) {

		loginS.login(user, pass);

	}

}
