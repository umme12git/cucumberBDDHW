package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DashboardPage {
	WebDriver  driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//span[text() = \"List Accounts\"]")
	 
	 WebElement List_Account_Link;
	
	 public  void clickOnListAcc() {
		
		List_Account_Link.click();	
	}
	 public String landedOnListAccountPage() {
		 	String title = driver.getTitle();
		 	return title;

		}

}
