package starter.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static net.serenitybdd.rest.SerenityRest.when;
import static org.hamcrest.Matchers.equalTo;

public class SymbolStepDefintions {

    @Given("^I am an active trader on IEX$")
    public void i_am_an_active_trader() {
        RestAssured.baseURI = "https://api.iextrading.com";
        RestAssured.basePath = "/1.0";
    }

    @When("^I request company information about (.*)")
    public void i_request_company_information_about(String symbol) {
        when().get("/stock/{symbol}/company", symbol);
    }

    @Then("^I should receive the following company details:$")
    public void i_should_receive_the_following_company_details(Map<String, String> expectedCompanyDetails) {
        expectedCompanyDetails.keySet().forEach(
                key -> then().body(key, equalTo(expectedCompanyDetails.get(key)))
        );
    }


}
