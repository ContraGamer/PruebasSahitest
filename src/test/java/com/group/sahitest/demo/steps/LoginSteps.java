package com.group.sahitest.demo.steps;

import com.group.sahitest.demo.pageObjects.LoginPageObject;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPageObject loginPO;

	@Step("Abrir navegador y login")
	public void login(String user, String pass) {
		loginPO.openDriver();
		loginPO.sendKeyInputUser(user);
		loginPO.sendKeyInputPass(pass);
		loginPO.clickBtnLogin();
	}

}
