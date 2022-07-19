package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionTwo {
	
	@Given("my name is {string}")
	public void my_name_is(String string) {
	  System.out.println("my name is " + string);
	}
	@When("my rollnumber are {string}")
	public void my_rollnumber_are(String string) {
		  System.out.println("My rollnumber is " + string);

	}
	@Then("I verify my enrollment as {string}")
	public void i_verify_my_enrollment_as(String string) {
		  System.out.println("my enrollment is " + string);

	}

}
