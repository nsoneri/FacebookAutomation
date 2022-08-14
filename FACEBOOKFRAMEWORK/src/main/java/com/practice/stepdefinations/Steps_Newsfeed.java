package com.practice.stepdefinations;

import com.practice.framework.WebBase;
import com.practice.webpages.HomePage;
import com.practice.webpages.Newsfeed;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Newsfeed{
	WebBase webBase = new WebBase();
	Newsfeed newsfeed = new Newsfeed();
	HomePage homePage = new HomePage();
	
	@When("I click on hamburger menu")
	public void i_click_on_hamburger_menu() {
	    newsfeed.clickOnHamburgermenu();
	}
	
	@When("I click on Logout button")
	public void i_click_on_logout_button() {
		newsfeed.clickOnLogoutButton();
	}
	
	@Then("I verify FB Homepage shows")
	public void i_verify_fb_homepage_shows() {
	  homePage.verifyFBHomePage();
	}
	
	@When("I click on Friends Tab")
	public void i_click_on_friends_tab() {
	    homePage.clickOnFriendsTab();
	}

	@Then("verify Friends Home Page shows")
	public void verify_friends_home_page_shows() {
	  
	}
}
