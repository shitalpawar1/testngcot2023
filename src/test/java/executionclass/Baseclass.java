package executionclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pageclass.Loginpage;
import pageclass.ProfilePage;

public class Baseclass {
	
	static WebDriver driver;
	public Loginpage login;
	public ProfilePage profile;
	@BeforeSuite
  public void setup() {
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }
	@BeforeClass
	public void creatobj() {
		login=new Loginpage(driver);
		profile=new ProfilePage(driver);
	}

}
