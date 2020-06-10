package com.bestbuy.cucumber.steps;

import com.bestbuy.steps.CategoriesSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import static com.bestbuy.utils.TestUtils.getRandomValue;
import static com.bestbuy.utils.TestUtils.getRandomValueInt;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class CategoriesCrudSteps {

    static String categoryName = "Software Testing Ideas" + getRandomValue();
    static String categoryId = "Soft Test" + getRandomValueInt();
//    static String name;

    @Steps
    CategoriesSteps categoriesSteps;

    @When("^I create new categories by providing a name & id and get status code 201$")
    public void iCreateNewCategoriesByProvidingANameIdAndGetStatusCode() {
        categoriesSteps.createCategories(categoryName, categoryId).statusCode(201);
    }

    @Then("^I verify that the categories is created and get the status code 200$")
    public void iVerifyThatTheCategoriesIsCreatedAndGetTheStatusCode() {
        ValidatableResponse response = categoriesSteps.getCategoriesById(categoryId).statusCode(200);
//        name = response.extract().path("name");
//        assertThat(name, equalTo(categoryName));
        assertThat(response.extract().path("name"), equalTo(categoryName));
    }

    @When("^I update a existing categories using categoriesID and get status code 200$")
    public void iUpdateAExistingCategoriesUsingCategoriesIDAndGetStatusCode() {
        categoryName = categoryName + "Technology";
        categoriesSteps.updateCategoriesById(categoryName, categoryId).statusCode(200);
    }

    @Then("^I verify that the categories name is updated and get status code 200$")
    public void iVerifyThatTheCategoriesNameIsUpdatedAndGetStatusCode() {
        ValidatableResponse response = categoriesSteps.getCategoriesById(categoryId).statusCode(200);
//        String updatedName = response.extract().path("name");
//        assertThat(updatedName, equalTo(categoryName));
        assertThat(response.extract().path("name"), equalTo(categoryName));
    }

    @When("^I delete categories using categoriesID and get status code 200$")
    public void iDeleteCategoriesUsingCategoriesIDAndGetStatusCode() {
        categoriesSteps.deleteCategory(categoryId).statusCode(200);
    }

    @Then("^I verify that the categories with categoriesID is deleted and get status code 404$")
    public void iVerifyThatTheCategoriesWithCategoriesIDIsDeletedAndGetStatusCode() {
        categoriesSteps.deleteCategory(categoryId).statusCode(404);
    }
}
