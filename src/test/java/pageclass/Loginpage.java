package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	//static WebDriver driver;
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	private WebElement loginbutton;
	
	public void loginwithcredentials() throws InterruptedException {
		username.sendKeys("Admin");
		Thread.sleep(3000);
		password.sendKeys("admin123");
		Thread.sleep(3000);
		loginbutton.click();
		
	}
	

}
