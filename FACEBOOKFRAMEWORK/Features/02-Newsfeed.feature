Feature: Logout

	@smoke
	Scenario: Successfully logout from Fb
			Given I open "chrome" browser and entered "https://www.facebook.com/"
			When I entered username "sonerinehal620@gmail.com" in username textbox
			And I entered password "asdfasdf12" in passwrod textbox
			And I click on Login button
			Then verify Newsfeed shows
			When I click on Friends Tab
			Then verify Friends Home Page shows
			When I click on hamburger menu
			And I click on Logout button
			Then I verify FB Homepage shows
			Then I close browser