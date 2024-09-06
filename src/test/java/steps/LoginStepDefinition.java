package steps;

import org.openqa.selenium.support.PageFactory;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountListPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase{
	
	LoginPage loginpage;
	DashboardPage dashboardpage;
	AccountListPage  accountlistpage;
	
	@Before
	public void common_method() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		accountlistpage = PageFactory.initElements(driver, AccountListPage.class);
		
	}
	
	@Given ("User is on the codefios login page")
	public void user_is_on_loginpage() {
		driver.get("https://codefios.com/ebilling/login");
		System.out.println("user is on the login page");
		
	}
	@When("User enters username as {string}")
	public void user_enters_username(String username) {
		
		loginpage.enterUserName(username);
		
	    //System.out.println("user entered user name as ");
	    
	}	
	
	@When  ("User enters password as {string}")
	public void user_enters_password(String password) {
		loginpage.enterPassword(password);
		
	}
	@When  ("User clicks on sign in button")
	public void user_clicks_submit_button() {
		loginpage.clickOnSubmit();
		
	}
	
	@Then  ("User should land in codefios Dashboard page")

	public void user_should_land_in_codefios_dashboard_page() {
		
	}
	
	@And ("User clicks on list Account")
	public void user_clicks_listaccount() {
		dashboardpage.clickOnListAcc();
		
	}
	
	@And ("User clicks on add Account")
	public void user_clicks_addaccount() {
		accountlistpage.clickOnAddaccount();
	}
	
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//	}
	
}
