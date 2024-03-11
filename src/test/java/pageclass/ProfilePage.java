package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	
	@FindBy(xpath = "//img[@alt='profile picture']")
	private WebElement profileicon;
	

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	
	public ProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void logoutapp() throws InterruptedException {
		profileicon.click();
		Thread.sleep(3000);
		logout.click();
	}
}


