package com.syn.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Productpage {
	WebDriver driver;

	By add1 = By.id("add-to-cart-sauce-labs-backpack");
	By add2 = By.id("add-to-cart-sauce-labs-bike-light");
	By cartIcon = By.className("shopping_cart_link");

	public Productpage(WebDriver driver) {
		this.driver = driver;
	}

	public void addProducts() {
		driver.findElement(add1).click();
		driver.findElement(add2).click();
		System.out.println("Products added to cart");
	}

	public void goToCart() {
		driver.findElement(cartIcon).click();
		System.out.println("Navigated to cart");
	}
}

