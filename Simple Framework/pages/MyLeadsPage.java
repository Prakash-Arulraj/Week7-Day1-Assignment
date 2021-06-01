package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import hooks.TestNgHooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyLeadsPage extends TestNgHooks {

	@When("Click Create Lead Button")
	public CreateLeadPage clickCreateLeadButton() {
		click(locateElement("link", "Create Lead"));
		return new CreateLeadPage();
	}

}
