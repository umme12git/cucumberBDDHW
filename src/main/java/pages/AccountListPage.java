package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class AccountListPage {
	WebDriver  driver;
	public AccountListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"tBody\"]/tr[1]/td[2]")  WebElement accNameField;
	@FindBy(how = How.XPATH, using = "//*[@id=\"accountModalLabel\"]") WebElement newAccountField;
	@FindBy(how = How.XPATH, using = "//button[text()= \"Add Account\"]")  WebElement addAccount;
	@FindBy(how = How.XPATH, using = "//input[@id = \"account_name\"]") WebElement accName;
	@FindBy(how = How.XPATH, using = "//textarea[@id = \"description\"]") WebElement accdescription;
	@FindBy(how = How.XPATH, using = "//input[@id = \"balance\"]") WebElement  accBalance;
	@FindBy(how = How.XPATH, using = "//input[@id = \"account_number\"]") WebElement  accNumber;
	@FindBy(how = How.XPATH, using = "//input[@id = \"contact_person\"]") WebElement  acccontactPerson;
	@FindBy(how = How.XPATH, using = "//button[@id = \"accountSave\"]") WebElement  accSave;
	
	public void clickOnAddaccount() {
		addAccount.click();
	}
	
	public void enterAccountName(String accname) {
		accName.sendKeys(accname);
	}
	
	public void enterDescription(String descrip) {
		accdescription.sendKeys(descrip);
	}
	public void enterBalance(String bal) {
		accBalance.sendKeys(bal);
	}
	
	public void enterAccountNumber(String accnumber ) {
		accNumber.sendKeys(accnumber);
	}
	
	public void enterContactPerson(String contperson) {
		acccontactPerson.sendKeys(contperson);
	}
	
	public void clickOnSave() {
		accSave.click();
	}
	public String validateNewAccountCreated() {
		//String  expectedElement = accntName;
		String  actualElement = accNameField.getText();
		return actualElement;
		
	}
	
	
}
