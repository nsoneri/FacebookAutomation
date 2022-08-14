package com.practice.webpages;

import org.openqa.selenium.By;

import com.practice.framework.WebBase;

public class HomePage extends WebBase {

	private By txtUsernameLocator = By.id("email");

	private By txtPasswordLocator = By.id("pass");

	private By btnLoginLocator = By.name("login");

	private By lblFBHomePageLocator = By.xpath("//*[text()='Recent logins']");

	private By btnFriendsTabLocator = By.xpath("//a[@aria-label='Friends']");
	
	private By lblFriendsHomeLocator = By.xpath("//*[text()='Home']");

	public void enterUsername(String username) {
		if (enterTextInTextbox(txtUsernameLocator, username, "username", 5) != null) {
			System.out.println("Pass : Successfully entered username");
		} else {
			System.out.println("Fail : Failed to entered text in textbox");
		}
	}

	public void enterPassword(String password) {
		if (enterTextInTextbox(txtPasswordLocator, password, "Password", 5) != null) {
			System.out.println("PASS : Successfully entered password");
		} else {
			System.out.println("Fail : Failed to enter Password");
		}
	}

	public void clickOnLoginButton() {
		if (clickOnElement(btnLoginLocator, "Login button", 5)) {
			System.out.println("PASS : Successfully clicked on Login button");
		} else {
			System.out.println("Fail : Failed to click on Login button ");
		}
	}

	public void verifyFBHomePage() {
		if (verifyPage(lblFBHomePageLocator, "FB HomePage", 5)) {
			System.out.println("PASS : Successfully verified FB Home Page");
		} else {
			System.out.println("FAIL : Failed to verify FB Home page");
		}
	}

	public void clickOnFriendsTab() {
		if (clickOnElement(btnFriendsTabLocator, "Friends tab button", 5)) {
			System.out.println("PASS : Successfully clicked on Friends tab button");
		} else {
			System.out.println("FAIL : Failed to clicked on Login button");
		}
	}
	
	public void verifyFriendsHome() {
		if(verifyPage(lblFriendsHomeLocator, "Friends Home", 5)) {
			System.out.println("PASS : Successfully Verified Friends Home Page");
		} else {
			System.out.println("FAIL : Failed to verify Friends Home Page");
		}
	}
}
