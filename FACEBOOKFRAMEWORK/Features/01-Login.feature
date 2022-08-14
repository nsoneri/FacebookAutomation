Feature: Login

			Scenario: Successfully log into Facebook
			Given I open "chrome" browser and entered "https://www.facebook.com/"
			When I entered username "sonerinehal620@gmail.com" in username textbox
			And I entered password "asdfasdf12" in passwrod textbox
			And I click on Login button
			Then verify Newsfeed shows
			Then I close browser