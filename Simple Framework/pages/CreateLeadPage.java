package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateLeadPage extends TestNgHooks {
	
	@Then("Type Company Name (.*)$")
	public CreateLeadPage enterCompanyName(String companyname) {
		type(locateElement("id", "createLeadForm_companyName"), companyname);
		return this;
	}

	@And("Type First Name (.*)$")
	public CreateLeadPage enterFirstName(String firstname) {
		type(locateElement("id", "createLeadForm_firstName"), firstname);
		return this;
	}

	@And("Type Last Name (.*)$")
	public CreateLeadPage enterLastName(String lastname) {
		type(locateElement("id", "createLeadForm_lastName"), lastname);
		return this;
	}

	@And("Click Create Lead")
	public ViewLeadPage clickCreate() {
		click(locateElement("name", "submitButton"));
		return new ViewLeadPage();
	}

}
