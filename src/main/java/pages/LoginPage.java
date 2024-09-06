package pages;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id = \"user_name\"]")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id = \"password\"]")
	WebElement UserPassword;
	@FindBy(how = How.XPATH, using = "//button[@id = \"login_submit\"]")
	WebElement SubmitButton;

	public void enterUserName(String username) {
		System.out.println("********in login page username is " + username);
		UserName.sendKeys(username);

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void enterPassword(String password) {
		UserPassword.sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickOnSubmit() {
		SubmitButton.click();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String landedOnDashboardPage() {
		String title = driver.getTitle();
		return title;
		

	}
}
