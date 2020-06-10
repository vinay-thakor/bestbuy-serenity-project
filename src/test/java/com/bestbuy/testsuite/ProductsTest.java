package com.bestbuy.testsuite;

import com.bestbuy.errormessages.ErrorMessages;
import com.bestbuy.steps.ProductsSteps;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Test;

import static com.bestbuy.utils.TestUtils.getRandomValue;

public class ProductsTest extends TestBase {

    String name = "McVities Biscuits" + getRandomValue();
    String type = "Biscuits & Crackers";
    String upc = "12345" + getRandomValue();
    double price = 2.00;
    String description = "This is a placeholder request for creating a new product";
    String model = "xyz" + getRandomValue();

    @Steps
    ProductsSteps steps;

    @WithTags({
            @WithTag("productFeature:Smoke"),
            @WithTag("productFeature:Regression")
    })
    @Title("This test will get all products information")
    @Test
    public void getAllProducts() {
        steps.getAllProducts().statusCode(200);
    }

    @WithTags({
            @WithTag("productFeature:Sanity"),
            @WithTag("productFeature:Regression")
    })
    @Title("This test will get a specific product by Id")
    @Test
    public void getProductById() {
        int productId = steps.getAllProducts().extract().path("data[0].id");
        steps.getProductById(productId).statusCode(200);
    }

    @WithTags({
            @WithTag("productFeature:Positive"),
            @WithTag("productFeature:Regression")
    })
    @Title("This test will create a new product")
    @Test
    public void createAProduct() {
        ValidatableResponse response = steps.createProduct(name, type, upc, price, description, model);
        response.statusCode(201);
    }

    @WithTags({
            @WithTag("productFeature:Positive"),
            @WithTag("productFeature:Regression")
    })
    @Title("This test will update a name of an existing product")
    @Test
    public void UpdateAnExistingProduct() {
        int productId = steps.getAllProducts().extract().path("data[0].id");
        ValidatableResponse response = steps.updateProduct(productId, name, null, null, -10,
                null, null);
        response.statusCode(200);
    }

    @WithTags({
            @WithTag("productFeature:Negative"),
            @WithTag("productFeature:Regression")
    })
    @Title("This test will delete the product by id")
    @Test
    public void deleteAProductUsingId() {
        int productId = steps.getAllProducts().extract().path("data[3].id");
        steps.deleteProduct(productId).statusCode(200);
        steps.getProductById(productId).statusCode(404);
    }

    @WithTags({
            @WithTag("productFeature:Negative"),
            @WithTag("productFeature:Regression")
    })
    @Title("Verify 'Not found' error message with invalid endpoint")
    @Test
    public void verifyNotFoundErrorMessage() {
        ValidatableResponse response = steps.sendRequestToInvalidEndpoint();
        ErrorMessages.verifyNotFoundMessage(response);
    }

}
