package com.practice.stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.practice.framework.WebBase;
import com.practice.webpages.HomePage;
import com.practice.webpages.Newsfeed;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps_FBLogin {

	WebBase webBase = new WebBase();
	HomePage homePage = new HomePage();
	Newsfeed newsfeedPage = new Newsfeed();

	WebDriver driver;
	
	@Given("I open {string} browser and entered {string}")
	public void i_open_browser_and_entered(String browserName, String url) {
		webBase.createDriver(browserName);
		webBase.openWebsite(url);
	}

	@When("I entered username {string} in username textbox")
	public void i_entered_username_in_username_textbox(String username) {
		homePage.enterUsername(username);
	}

	@When("I entered password {string} in passwrod textbox")
	public void i_entered_password_in_passwrod_textbox(String password) {
		homePage.enterPassword(password);
	}

	@When("I click on Login button")
	public void i_click_on_login_button() {
		homePage.clickOnLoginButton();
		
	}

	@Then("verify Newsfeed shows")
	public void verify_newsfeed_shows() {
		newsfeedPage.verifyNextPage();
	}

	@Then("I close browser")
	public void i_close_browser() {
		webBase.closeBrowser();
	}
}
