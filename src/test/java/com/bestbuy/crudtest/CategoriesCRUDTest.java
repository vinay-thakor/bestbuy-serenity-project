package com.bestbuy.crudtest;

import com.bestbuy.steps.CategoriesSteps;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.bestbuy.utils.TestUtils.getRandomValue;
import static com.bestbuy.utils.TestUtils.getRandomValueInt;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SerenityRunner.class)
public class CategoriesCRUDTest extends TestBase {

    static String name = "Software Testing Ideas" + getRandomValue();
    static String categoryId = "Soft Test" + getRandomValueInt();

    @Steps
    CategoriesSteps categoriesSteps;

    @Title("This test will create a new category")
    @Test
    public void test001() {
        ValidatableResponse response = categoriesSteps.createCategories(name, categoryId);
        response.statusCode(201);
    }

    @Title("Update the category name and verify the updated information")
    @Test
    public void test002() {
        name = name + "& Automation";
        categoriesSteps.updateCategoriesById(name,categoryId).statusCode(200);
        ValidatableResponse response1 = categoriesSteps.getCategoriesById(categoryId);
        assertThat(response1.extract().path("name"), equalTo(name));
    }

    @Title("Delete the category and verify if the category is deleted")
    @Test
    public void test003() {
        categoriesSteps.deleteCategory(categoryId).statusCode(200);
        categoriesSteps.deleteCategory(categoryId).statusCode(404);
    }
}
