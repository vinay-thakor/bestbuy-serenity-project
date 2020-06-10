package com.bestbuy.cucumber.steps;

import com.bestbuy.steps.ProductsSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import static com.bestbuy.utils.TestUtils.getRandomValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ProductsCrudSteps {

    static String name = "McVities Biscuits" + getRandomValue();
    static String type = "Biscuits & Crackers";
    static String upc = "12345" + getRandomValue();
    static double price = 2.98;
    static String description = "This is a placeholder request for creating a new product";
    static String model = "xyz" + getRandomValue();
    static int productId;

//    static String productName;
//    static float productPrice;

    @Steps
    ProductsSteps productsSteps;

    @When("^I create new products by providing a name, type, upc, price, description and model get status code 201$")
    public void iCreateNewProductsByProvidingANameTypeUpcPriceDescriptionAndModelGetStatusCode() {
        ValidatableResponse response = productsSteps.createProduct(name,type,upc,price,description,model).statusCode(201);
        productId = response.extract().path("id");
    }

    @Then("^I verify that the products is created and get status code 200$")
    public void iVerifyThatTheProductsIsCreatedAndGetStatusCode() {
        ValidatableResponse response = productsSteps.getProductById(productId).statusCode(200);
//        productName = response.extract().path("name");
//        assertThat(productName,equalTo(name));
        assertThat(response.extract().path("name"),equalTo(name));
    }

    @When("^I update a existing products using productsID and get status code 200$")
    public void iUpdateAExistingProductsUsingProductsIDAndGetStatusCode() {
        price = price + 7;
        productsSteps.updateProduct(productId,null,null,null,price,null,null).statusCode(200);
    }

    @Then("^I verify that the products price is updated and get status code 200$")
    public void iVerifyThatTheProductsPriceIsUpdatedAndGetStatusCode() {
        ValidatableResponse response = productsSteps.getProductById(productId).statusCode(200);
//        productPrice = response.extract().path("price");
//        assertThat(productPrice,equalTo((float) price));
        assertThat(response.extract().path("price"),equalTo((float) price));
    }

    @When("^I delete products using productsID and get status code 200$")
    public void iDeleteProductsUsingProductsIDAndGetStatusCode() {
        productsSteps.deleteProduct(productId).statusCode(200);
    }

    @Then("^I verify that the products with productsID is deleted and get status code 404$")
    public void iVerifyThatTheProductsWithProductsIDIsDeletedAndGetStatusCode() {
        productsSteps.deleteProduct(productId).statusCode(404);
    }
}
