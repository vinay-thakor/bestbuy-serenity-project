package com.bestbuy.steps;

import com.bestbuy.constants.EndPoints;
import com.bestbuy.model.ProductsAPIRequest;
import com.bestbuy.model.ProductsPojo;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ProductsSteps {

    @Step("Creating product with name: {0}, type: {1}, upc: {2}, price: {3}, description: {4} and model: {5}")
    public ValidatableResponse createProduct(String name, String type, String upc, double price,
                                             String description, String model) {
        ProductsPojo productsPojo = ProductsAPIRequest.getAPIProductsRequest(name, type, upc, price, description,
                model);

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .when()
                .body(productsPojo)
                .post(EndPoints.CREATE_PRODUCT)
                .then().log().ifValidationFails();
    }

    @Step("Getting the product information with productId: {0}")
    public ValidatableResponse getProductById(int productId) {

        return SerenityRest.rest()
                .given()
                .pathParam("productId", productId)
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_PRODUCT_BY_ID)
                .then().log().ifValidationFails();
    }

    @Step("Getting the all products information")
    public ValidatableResponse getAllProducts() {

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_ALL_PRODUCTS)
                .then().log().ifValidationFails();
    }

    @Step("Updating product information with productId: {0}, updated field: {1}")
    public ValidatableResponse updateProduct(int productId, String name, String type, String upc, double price,
                                             String description, String model) {
        ProductsPojo productsPojo = ProductsAPIRequest.getAPIProductsRequest(name, type, upc, price, description,
                model);

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .pathParam("productId", productId)
                .when()
                .body(productsPojo)
                .patch(EndPoints.UPDATE_PRODUCT_BY_ID)
                .then().log().ifValidationFails();
    }

    @Step("Deleting product information with productId: {0}")
    public ValidatableResponse deleteProduct(int productId) {
        return SerenityRest.rest()
                .given()
                .pathParam("productId", productId)
                .when()
                .delete(EndPoints.DELETE_PRODUCT_BY_ID)
                .then().log().ifValidationFails();
    }

    @Step("Send request to invalid endpoint")
    public ValidatableResponse sendRequestToInvalidEndpoint() {
        return SerenityRest.rest()
                .given()
                .when()
                .delete(EndPoints.INVALID_ENDPOINT_PRODUCT)
                .then().log().ifValidationFails();
    }
}

