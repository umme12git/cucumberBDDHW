@addaccountfeature
Feature: codefios addnewaccount functionality validation


	@addaccountscenario1
	Scenario Outline: User should be able to add a new account with success

		Given User is on the codefios login page
		When  User enters username as "<username>" in the "userName" field
		And   User enters password as "<password>" in the "password" field
		And   User clicks on "login" 
		Then  User should land in codefios Dashboard page
	  And   User clicks in the "listAccount" field 
		And 	User clicks in the "addAccount" field	
			
		And 	User enters "<accountName>" in the "accountName" field in accounts page
		And  	User enters "<description>" in the "description" field in accounts page
		And   User enters "<initialBalance>" in the "initialBalance" field in accounts page
		And   User enters "<accountNumber>" in the "accountNumber" field in accounts page
		And   User enters "<contactPerson>" in the "contactPerson" field in accounts page
		And 	User clicks on "save"
		Then 	User should be able to validate new account created successfully
		 
		
		

		Examples:
		|username	|password|accountName|description|initialBalance|accountNumber|contactPerson|
		|demo@codefios.com|abc123|Travel checking|Company paid|100|040404|Jenny Smith|
		
		
		
		
