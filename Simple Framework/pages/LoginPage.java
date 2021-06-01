package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import hooks.TestNgHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage extends TestNgHooks {

	@Given("Enter as Username (.*)$")
	public LoginPage typeUsername(String Username) {
		WebElement element = locateElement("id", "username");
		type(element, Username);
		return this;
	}

	@Then("Enter as Password (.*)$")
	public LoginPage typePassword(String password) {
		type(locateElement("id", "password"), password);
		return this;
	}

	@Then("Enter as Password (.*)$")
	public HomePage directLogin(String password) {
		typeAndEnter(locateElement("id", "password"), password);
		return new HomePage();
	}

	@And(" Click Login Button")
	public HomePage clickLogin() {
		click(locateElement("class", "decorativeSubmit"));
		return new HomePage();
	}

	@And("Click Login Failure")
	public LoginPage loginFailure() {
		click(locateElement("class", "decorativeSubmit"));
		return this;
	}

}
