@loginfeature
Feature: codefios login functionality validation


@loginscenario1
	Scenario: User should be able to login with valid credential

Given User is on the codefios login page
When  User enters username as "demo@codefios.com"
When  User enters password as "abc123"
When  User clicks on sign in button
Then  User should land in codefios Dashboard page

@loginscenario2
	Scenario: User should not be able to login with invalid credential

Given User is on the codefios login page
When  User enters username as "demo@codefios.com"
When  User enters password as "abc120"
When  User clicks on sign in button
Then  User should land in codefios Dashboard page

 
 
