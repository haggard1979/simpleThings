package at.tbloder.cucumberOnly.beans;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/features/Example.feature"},
		glue={"at.tbloder.cucumberOnly.beans"}
		)
public class ExampleClassATest {
	 	  

}
