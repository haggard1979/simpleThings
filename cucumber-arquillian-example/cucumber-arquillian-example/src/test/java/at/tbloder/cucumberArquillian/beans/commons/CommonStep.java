package at.tbloder.cucumberArquillian.beans.commons;

import javax.inject.Inject;

import at.tbloder.cucumberArquillian.beans.ExampleClassA;
import cucumber.api.java.en.Given;

public class CommonStep {

	@Inject
	ExampleClassA exampleClassA;
	
	@Given("^toString$")
	public void givenXValue() {
		exampleClassA.toString();		
	}
}
