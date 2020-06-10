package com.bestbuy.cucumber.steps;

import com.bestbuy.steps.StoresSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import static com.bestbuy.utils.TestUtils.getRandomValue;
import static com.bestbuy.utils.TestUtils.getRandomValueInt;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class StoresCrudSteps {

    static String name = "Square" + getRandomValue();
    static String type = "One Stop Shop";
    static String address = "Three petrol pump";
    static String address2 = "Thane(W)";
    static String city = "Mumbai";
    static String state = "Maharastra";
    static String zip = "400602";
    static String lat = "2.22" + getRandomValueInt();
    static String lng = "9.99" + getRandomValueInt();
    static String hours = "Mon: 10-9; Tue: 10-9; Wed: 10-9; Thurs: 10-9; Fri: 10-9; Sat: 10-9; Sun: 10-8";

    static int storeId;
    static String storesName;

    @Steps
    StoresSteps storesSteps;

    @When("^I create new stores by providing a name, type, address, address2, city, state, zip, lat, lng and hours get status code 201$")
    public void iCreateNewStoresByProvidingANameTypeAddressAddressCityStateZipLatLngAndHoursGetStatusCode() {
        ValidatableResponse response = storesSteps.createStore(name,type,address,address2,city,state,zip,lat,lng,hours).statusCode(201);
        storeId = response.extract().path("id");
    }

    @Then("^I verify that the stores is created and get status code 200$")
    public void iVerifyThatTheStoresIsCreatedAndGetStatusCode() {
        ValidatableResponse response = storesSteps.getStoreById(storeId).statusCode(200);
        storesName = response.extract().path("name");
        assertThat(response.extract().path("name"),equalTo(name));
    }

    @When("^I update a existing stores using storesID and get status code 200$")
    public void iUpdateAExistingStoresUsingStoresIDAndGetStatusCode() {
        name = name + "1";
        storesSteps.updateStore(storeId,name,null,null,null,null,null,null,null,null,null).statusCode(200);
    }

    @Then("^I verify that the stores name is updated and get status code 200$")
    public void iVerifyThatTheStoresNameIsUpdatedAndGetStatusCode() {
        ValidatableResponse response = storesSteps.getStoreById(storeId).statusCode(200);
//        String updatedName = response.extract().path("name");
//        assertThat(updatedName,equalTo(name));
        assertThat(response.extract().path("name"),equalTo(name));

    }

    @When("^I delete stores using storesID and get status code 200$")
    public void iDeleteStoresUsingStoresIDAndGetStatusCode() {
        storesSteps.deleteStore(storeId).statusCode(200);
    }

    @Then("^I verify that the stores with storesID is deleted and get status code 404$")
    public void iVerifyThatTheStoresWithStoresIDIsDeletedAndGetStatusCode() {
        storesSteps.deleteStore(storeId).statusCode(404);
    }
}
