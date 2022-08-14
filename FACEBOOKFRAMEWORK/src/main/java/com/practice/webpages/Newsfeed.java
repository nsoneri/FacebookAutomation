package com.practice.webpages;

import org.openqa.selenium.By;

import com.practice.framework.WebBase;

public class Newsfeed extends WebBase {
	
	private By lblNewsfeedLocator = By.xpath("//a[@aria-label='Home']");

	private By btnhamburgermenuLocator = By.xpath("//*[@aria-label='Your profile']");

	private By btnLogoutLocator = By.xpath("//*[text()='Log Out']");
	
	public void verifyNextPage() {
		if (verifyPage(lblNewsfeedLocator, "Newsfeed", 5)) {
			System.out.println("Successfully verified newsfeed");
		} else {
			System.out.println("Fail :Failed to verify newsfeed ");
		}
	}

	public void clickOnHamburgermenu() {
		if (clickOnElement(btnhamburgermenuLocator, "Hamburger Button", 5)) {
			System.out.println("PASS : Successfullt clicked on Hamburgermenu button");
		} else {
			System.out.println("FAIL : Failed to clicked on Hamburgermenu button");
		}
	}

	public void clickOnLogoutButton() {
		if (clickOnElement(btnLogoutLocator, "Logout Button", 5)) {
			System.out.println("PASS : Successfully clicked on Logout Button");
		} else {
			System.out.println("FAIL : Failed to Click on Logout Button");
		}
	}
}
