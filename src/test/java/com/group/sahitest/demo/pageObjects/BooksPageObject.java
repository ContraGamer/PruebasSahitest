package com.group.sahitest.demo.pageObjects;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;

public class BooksPageObject extends PageObject {

	private final static Logger LOGGER = Logger.getLogger(BooksPageObject.class.getName());

	private static WebDriver driver;
	private static WebDriverWait  wait;

	private String inputJava = "(//input[@name='q'])[1]";
	private String inputRyby = "(//input[@name='q'])[2]";
	private String inputPython = "(//input[@name='q'])[3]";
	private String btnAdd = "//input[@value='Add']";
	private String btnClear = "//input[@value='Clear']";
	private String btnLogout = "//input[@value='Logout']";
	private String inputTotal = "//input[@id='total']";
	private String labelCostJava = "//table//tr[2]/td[3]";
	private String labelCostRuby = "//table//tr[3]/td[3]";
	private String labelCostPython = "//table//tr[4]/td[3]";
	
	public void initDriver() {
		driver=LoginPageObject.driver;
		wait =  new WebDriverWait(driver, 10);
	}

	public void sendKeyInputJava(String input) {
		initDriver();
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.inputJava)));
		element.clear();
		element.sendKeys(input);
		LOGGER.info("Send key input java: " + this.inputJava);
	}

	public void sendKeyInputRuby(String input) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.inputRyby)));
		element.clear();
		element.sendKeys(input);
		LOGGER.info("Send key input Ruby: " + this.inputRyby);
	}

	public void sendKeyInputPython(String input) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.inputPython)));
		element.clear();
		element.sendKeys(input);
		LOGGER.info("Send key input Python: " + this.inputPython);
	}

	public void clickBtnAdd() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.btnAdd)));
		element.click();
		LOGGER.info("Click: " + this.btnAdd);
	}

	public void clickBtnClear() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.btnClear)));
		element.click();
		LOGGER.info("Click: " + this.btnClear);
	}

	public void clickBtnLogout() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.btnLogout)));
		element.click();
		LOGGER.info("Click: " + this.btnLogout);
	}

	public String getTextInputTotal() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.inputTotal)));
		String value = element.getAttribute("value");
		LOGGER.info("getTxt: " + this.inputTotal + " value: " + value);
		return value;
	}

	public String getTextLabelCostJava() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.labelCostJava)));
		String value = element.getText();
		LOGGER.info("getTxt: " + this.labelCostJava + " value: " + value);
		return value;
	}

	public String getTextLabelCostRuby() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.labelCostRuby)));
		String value = element.getText();
		LOGGER.info("getTxt: " + this.labelCostRuby + " value: " + value);
		return value;
	}

	public String getTextLabelCostPython() {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(this.labelCostPython)));
		String value = element.getText();
		LOGGER.info("getTxt: " + this.labelCostPython + " value: " + value);
		return value;
	}

}
