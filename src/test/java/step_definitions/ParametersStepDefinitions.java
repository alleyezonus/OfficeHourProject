package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class ParametersStepDefinitions {

    @Given("I am on the {string} page")
    public void I_am_on_the_login_page(String page){


    }

    @Then("I should be navigated to homepage")
    public void iShouldBeNavigatedToHomepage() {

    }
    // Regex Equation
    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
    }
    @When("I call row 4 and column {float} data")
    public void i_call_row_and_column_data(float num2) {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I click login")
    public void i_click_login() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("I enter the following data")
    public void i_enter_the_following_data(Map<String, List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(dataTable);
    }


}
