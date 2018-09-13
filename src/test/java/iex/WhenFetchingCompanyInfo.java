package iex;

import io.restassured.RestAssured;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.Ensure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.rest.SerenityRest.when;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SerenityRunner.class)
public class WhenFetchingCompanyInfo {

    @Before
    public void setBaseUri() {
        RestAssured.baseURI = "https://api.iextrading.com/1.0";
    }

    @Test
    public void should_return_company_name_and_industry() {
        when().get("/stock/aapl/company")
                .then().statusCode(200);

        Ensure.that("company name is returned", response -> response.body("companyName", equalTo("Apple Inc.")));
        Ensure.that("industry is returned", response -> response.body("industry", equalTo("Computer Hardware")));
    }
}
