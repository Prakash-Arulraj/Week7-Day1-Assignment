package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;

public class LoginTest extends TestNgHooks {
	
	@Test(dataProvider = "FetchExcelData")
	public void login(String username, String password) {
		new pages.LoginPage()
			.typeUsername(username)
			.typePassword(password)
			.clickLogin()
			.verifyLogin()
			.clickLogout();
			
		
	}

}
