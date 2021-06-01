package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import hooks.TestNgHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class HomePage extends TestNgHooks{
	
	@Then(" Verify Home Page")
	public HomePage verifyLogin() {
		verifyPartialText(locateElement("tag", "h2"), "Welcome");
		return this;
	}
	@And("Click Logout Button")
	public LoginPage clickLogout() {
		click(locateElement("class", "decorativeSubmit"));
		return new LoginPage();
	}
	@And("Click crmsfa Link")
	public MyHomePage clickCrmLink() {
		click(locateElement("link", "CRM/SFA"));
		return new MyHomePage();
	}

}
