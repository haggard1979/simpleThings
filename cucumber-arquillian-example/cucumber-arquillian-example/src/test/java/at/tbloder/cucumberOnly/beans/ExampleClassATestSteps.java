package at.tbloder.cucumberOnly.beans;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExampleClassATestSteps {

	int x;

	@Given("^a variable x with value (.+)$")
	public void givenXValue(int value) {
		x = value;
	}

	@When("^I multiply x by (.+)$")
	public void whenImultiplyXBy(int value) {
		x = x * value;
	}

	@Then("^x should equal (.+)$")
	public void thenXshouldBe(int value) {
		if (value != x)
			throw new RuntimeException("x is " + x + ", but should be " + value);
	}
	@Given("^toString$")
	public void tostring() throws Throwable {
		System.out.println("");
	}

}
