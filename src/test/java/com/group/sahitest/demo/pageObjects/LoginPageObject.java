package com.group.sahitest.demo.pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://sahitest.com/demo/training/login.htm")
public class LoginPageObject extends PageObject {

	private final static Logger LOGGER = Logger.getLogger(LoginPageObject.class.getName());

	public static WebDriver driver;

	private static WebDriverWait wait;

	private String inputUser = "//input[@name='user']";
	private String inputPass = "//input[@name='password']";
	private String btnLogin = "//input[@value='Login']";

	public void openDriver() {
		//setDefaultBaseUrl("http://sahitest.com/demo/training/login.htm");
		getDriver().get("http://sahitest.com/demo/training/login.htm");
		driver = getDriver();
		wait = new WebDriverWait(driver, 10);
	}

	public void sendKeyInputUser(String input) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.inputUser)));
		element.sendKeys(input);
		LOGGER.info("Send key user: " + this.inputUser);
	}

	public void sendKeyInputPass(String input) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.inputPass)));
		element.sendKeys(input);
		LOGGER.info("Send key pass: " + this.inputPass);
	}

	public void clickBtnLogin() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.btnLogin)));
		element.click();
		LOGGER.info("Click login: " + this.btnLogin);
	}

}
