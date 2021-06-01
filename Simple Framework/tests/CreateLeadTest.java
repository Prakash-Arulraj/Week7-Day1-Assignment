package tests;

import org.testng.annotations.Test;

import hooks.TestNgHooks;

public class CreateLeadTest extends TestNgHooks {
	
	@Test(dataProvider = "FetchExcelData")
	public void login(String username,String password,String companyname, String firstname, String lastname) {
		new pages.LoginPage()
			.typeUsername(username)
			.typePassword(password)
			.clickLogin()
			.clickCrmLink()
			.clickLeadButton()
			.clickCreateLeadButton()
			.enterCompanyName(companyname)
			.enterFirstName(firstname)
			.enterLastName(lastname)
			.clickCreate();
			
			
		
	}

}
