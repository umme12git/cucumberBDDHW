$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/otherAddNewAccount.feature");
formatter.feature({
  "name": "codefios addnewaccount functionality validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@addaccountfeature"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to add a new account with success",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addaccountscenario1"
    }
  ]
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters username as \"\u003cusername\u003e\" in the \"userName\" field",
  "keyword": "When "
});
formatter.step({
  "name": "User enters password as \"\u003cpassword\u003e\" in the \"password\" field",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should land in codefios Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks in the \"listAccount\" field",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks in the \"addAccount\" field",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountName\u003e\" in the \"accountName\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cdescription\u003e\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003cinitialBalance\u003e\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003caccountNumber\u003e\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User enters \"\u003ccontactPerson\u003e\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on \"save\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to validate new account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountName",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson"
      ]
    },
    {
      "cells": [
        "demo@codefios.com",
        "abc123",
        "Travel checking",
        "Company paid",
        "100",
        "040404",
        "Jenny Smith"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User should be able to add a new account with success",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@addaccountfeature"
    },
    {
      "name": "@addaccountscenario1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the codefios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_is_on_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"demo@codefios.com\" in the \"userName\" field",
  "keyword": "When "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_enters_username_as_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"abc123\" in the \"password\" field",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_enters_password_as_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land in codefios Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_should_land_in_codefios_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks in the \"listAccount\" field",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_clicks_listaccount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks in the \"addAccount\" field",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_clicks_listaccount(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Travel checking\" in the \"accountName\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_enters_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Company paid\" in the \"description\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_enters_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"100\" in the \"initialBalance\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_enters_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"040404\" in the \"accountNumber\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_enters_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"Jenny Smith\" in the \"contactPerson\" field in accounts page",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_enters_in_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"save\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.user_clicks_on(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to validate new account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "steps2.AddNewCustomerStepDefinition.validate_new_account_validation()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});