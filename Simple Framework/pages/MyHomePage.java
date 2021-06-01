package pages;

import org.openqa.selenium.By;

import hooks.TestNgHooks;
import io.cucumber.java.en.Then;

public class MyHomePage extends TestNgHooks {
	
	@Then("Click Lead Button")
	public MyLeadsPage clickLeadButton() {
		click(locateElement("link", "Leads"));
		return new MyLeadsPage();
	}

}
