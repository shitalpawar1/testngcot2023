package pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeavePage {

	public LeavePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
