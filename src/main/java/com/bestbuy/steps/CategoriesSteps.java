package com.bestbuy.steps;

import com.bestbuy.constants.EndPoints;
import com.bestbuy.model.CategoriesAPIRequest;
import com.bestbuy.model.CategoriesPojo;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class CategoriesSteps {

    @Step("Creating Category with name: {0} and id: {1}")
    public ValidatableResponse createCategories(String name, String id) {
        CategoriesPojo categoriesPojo = CategoriesAPIRequest.getAPICategoriesRequest(name, id);

        return SerenityRest.rest()
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)

                .when()
                .body(categoriesPojo)
                .post(EndPoints.CREATE_CATEGORIES)

                .then()
                .log()
                .all();
//                .ifValidationFails();
    }

    @Step("Getting the product information with categoriesId: {0}")
    public ValidatableResponse getCategoriesById(String categoryId) {

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .pathParam("categoryID", categoryId)

                .when()
                .get(EndPoints.GET_CATEGORIES_BY_ID)

                .then()
                .log()
                .ifValidationFails();
    }

    @Step("Update the category information with categoryId: {0}, updated field: {1}")
    public ValidatableResponse updateCategoriesById(String name, String categoryId) {

        CategoriesPojo categoriesPojo = CategoriesAPIRequest.getAPICategoriesRequest(name, categoryId);

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .pathParam("categoryID", categoryId)

                .when()
                .body(categoriesPojo)
                .patch(EndPoints.UPDATE_CATEGORIES_BY_ID)

                .then()
                .log()
                .ifValidationFails();
    }


    @Step("Deleting category information with categoryId: {0}")
    public ValidatableResponse deleteCategory(String categoryId) {

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .pathParam("categoryID", categoryId)

                .when()
                .delete(EndPoints.DELETE_CATEGORIES_BY_ID)

                .then()
                .log()
                .ifValidationFails();
    }
}
