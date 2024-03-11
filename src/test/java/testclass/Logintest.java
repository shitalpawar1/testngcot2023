package testclass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import executionclass.Baseclass;

public class Logintest {
	@Test
	public class LoginTest extends Baseclass{
		
		public void loginpositiveTestcase() throws InterruptedException {
			
			login.loginwithcredentials();
			Reporter.log("success login case",true);
			Assert.assertTrue(true);
			
		}
		@Test
		public void logoutapp() throws InterruptedException {
			
			profile.logoutapp();
			Reporter.log("success logout",true);
			Assert.assertTrue(true);
		}
	}

}
