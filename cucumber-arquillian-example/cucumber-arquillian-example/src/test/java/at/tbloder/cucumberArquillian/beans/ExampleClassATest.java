package at.tbloder.cucumberArquillian.beans;

import javax.inject.Inject;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.arquillian.CukeSpace;

@RunWith(CukeSpace.class)
@CucumberOptions(
		features={"features/Example.feature"},
		glue={"at.tbloder.cucumberArquillian.beans"}
		)
public class ExampleClassATest {

		@Deployment
		public static JavaArchive createArchiveAndDeploy() {
			return ShrinkWrap.create(JavaArchive.class)//
					.addPackage(ExampleClassA.class.getPackage())
					.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
		}
		
		@Inject
		ExampleClassA exampleClassA;
	  
		int x;

		@Given("^a variable x with value (.+)$")
		public void givenXValue(int value) {
			exampleClassA.toString();
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
	 

}
