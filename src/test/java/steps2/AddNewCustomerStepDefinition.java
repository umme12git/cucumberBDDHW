package steps2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.AccountListPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestBase;

public class AddNewCustomerStepDefinition extends TestBase{
	LoginPage loginpage;
	DashboardPage dashboardpage;
	AccountListPage  accountlistpage;
	String  accntName;
	
	@Before
	public void common_method() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		accountlistpage = PageFactory.initElements(driver, AccountListPage.class);
		
	}
	
	@Given ("User is on the codefios login page")
	public void user_is_on_loginpage() {
		driver.get("https://codefios.com/ebilling/login");
		//System.out.println("user is on the login page");
		
	}
	
	@When("User enters username as {string} in the {string} field")
	public void user_enters_username_as_in_the_field(String loginData, String field) {
		loginpage.enterUserName(loginData);
	}
	
	
	@When("User enters password as {string} in the {string} field")
	public void user_enters_password_as_in_the_field(String loginData, String field) {
	   loginpage.enterPassword(loginData);
	}
	
	@When("User clicks on {string}")
	public void user_clicks_on(String field) {
		if(field.equalsIgnoreCase("login")) {
			loginpage.clickOnSubmit();
		}
		else if(field.equalsIgnoreCase("save")) {
			accountlistpage.clickOnSave();
		}
	}
	
	@Then  ("User should land in codefios Dashboard page")

	public void user_should_land_in_codefios_dashboard_page() {
		String expectedTitle = "Codefios";
		String actualTitle = loginpage.landedOnDashboardPage();
		try {
			Assert.assertEquals("did not land on dashboard page",expectedTitle, actualTitle);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@And ("User clicks in the {string} field")
	public void user_clicks_listaccount(String field) {
		if (field.equalsIgnoreCase("listAccount")) {
			dashboardpage.clickOnListAcc();
		}
		
		else if(field.equalsIgnoreCase("addAccount")) {
			accountlistpage.clickOnAddaccount();
		}
	}
	
	@And ("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field(String accountData, String field) {
		if(field.equalsIgnoreCase("accountName")) {
			accountlistpage.enterAccountName(accountData);
			this.accntName = accountData;
			//System.out.println("account name is "+accntName);
		}
		else if(field.equalsIgnoreCase("description")) {
			accountlistpage.enterDescription(accountData);
		}
		
		else if(field.equalsIgnoreCase("initialBalance")) {
			accountlistpage.enterBalance(accountData);
		}
		else if(field.equalsIgnoreCase("accountNumber")) {
			accountlistpage.enterAccountNumber(accountData);
		}
		
		else if(field.equalsIgnoreCase("contactPerson")) {
			accountlistpage.enterContactPerson(accountData);
		}	
	}
	
	@Then ("User should be able to validate new account created successfully")
	public void validate_new_account_validation() {
		//String actualElement;
		WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody[@id = \"tBody\"]/tr[1]/td[2]")));
		//actualElement = driver.findElement(By.xpath("//tbody[@id = \"tBody\"]/tr[1]/td[2]")).getText(); 
		Assert.assertEquals("account was not created successfully", accntName, driver.findElement(By.xpath("//tbody[@id = \"tBody\"]/tr[1]/td[2]")).getText());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody[@id = \"tBody\"]/tr[1]/td[2]")));
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
