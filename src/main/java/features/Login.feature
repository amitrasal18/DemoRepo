@tag
Feature: Login to application
  As a registered user, I want to log on to application then I can see home screen
	
  @test
  Scenario Outline: Logon to the application
  Given user is already on Login Page
	When title of login page is Free CRM
	Then user enters "<username>" and "<password>"
	Then user clicks on login button
	Then user is on home page
	Then Close the browser


Examples:
	| username 			| password 		 |
	| standard_user | secret_sauce |