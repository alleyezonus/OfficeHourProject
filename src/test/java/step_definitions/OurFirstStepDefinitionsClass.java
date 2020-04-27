package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class OurFirstStepDefinitionsClass {
    //Annotations work as a key for cucumber
    @And("Precondition One")
    public void precondition_one(){

    }

    @And("Outcome two")
    public void outcomeTwo() {
    }

    @Then("Outcome one")
    public void outcomeOne() {
    }

    @Given("Precondition Two")
    public void precondition_Two() {


    }

    @Given("Precondition Three")
    public void precondition_Three() {

    }

    @When("Action one")
    public void action_one() {

    }

    @When("Action two")
    public void action_two() {

    }

    @When("Action")
    public void action() {

    }

    @Then("Outcome")
    public void outcome() {

    }



}
