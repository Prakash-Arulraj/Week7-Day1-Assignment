package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import hooks.TestNgHooks;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends TestNgHooks {
	
	@Then("Verify Create Lead")
	public ViewLeadPage verifyCreate() {
		WebElement ele = driver.findElement(By.xpath("//div[text()[normalize-space()='View Lead']]"));
		System.out.println(ele.isDisplayed());
		return this;
	}

}
