package com.syn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
	WebDriver driver;

	By message = By.className("complete-header");

	public ConfirmationPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getConfirmationMessage() {
		return driver.findElement(message).getText();
	}
}
