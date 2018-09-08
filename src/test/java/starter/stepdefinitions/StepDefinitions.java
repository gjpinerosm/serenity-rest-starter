package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import starter.model.DrinkOrder;

import java.util.List;
import java.util.Map;

public class StepDefinitions {
    @Given("^the following prices:$")
    public void the_following_prices(Map<String,Double> prices) {
    }


    @Given("^Sue has a (\\d+)% members discount$")
    public void sue_has_a_members_discount(int arg1) {
    }

    @When("^Sue orders a cappuccino$")
    public void sue_orders_a_cappuccino() {
    }

    @Then("^Sue should be charged \\$(.*)")
    public void sue_should_be_charged_$(double price) {
    }


    @When("^Sue orders (.*) of (.*)")
    public void sue_orders_espresso(int quantity, String product) {
    }

    @When("^Sue orders:$")
    public void sue_orders(List<DrinkOrder> order) {
    }


}
