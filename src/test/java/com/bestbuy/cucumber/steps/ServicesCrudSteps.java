package com.bestbuy.cucumber.steps;

import com.bestbuy.steps.ServicesSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;

import static com.bestbuy.utils.TestUtils.getRandomValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ServicesCrudSteps {

    static String name = "Software Testing" + getRandomValue();
    static String servicesName;
    static int servicesID;

    @Steps
    ServicesSteps servicesSteps;


    @When("^I create new services by providing a name and get status code 201$")
    public void iCreateNewServicesByProvidingAName() {
        ValidatableResponse response = servicesSteps.createNewService(name).statusCode(201);
        servicesID = response.extract().path("id");
        servicesName = response.extract().path("name");
    }

    @Then("^I verify that the services is created and get status code 200$")
    public void iVerifyThatTheServicesWithNameIsCreated() {
        ValidatableResponse response = servicesSteps.getServiceById(servicesID);
        response.statusCode(200);
        assertThat(servicesName, equalTo(name));
    }

    @When("^I update a existing services using servicesID and get status code 200$")
    public void iUpdateAExistingServicesUsingServicesID() {
        name = name + "API Testing";
        ValidatableResponse response = servicesSteps.updateService(servicesID,name);
        response.statusCode(200);
    }

    @Then("^I verify that the services name is updated and get status code 200$")
    public void iVerifyThatTheServicesNameIsUpdated() {
        ValidatableResponse response1 = servicesSteps.getServiceById(servicesID).statusCode(200);
        assertThat(response1.extract().path("name"),equalTo(name));
    }

    @When("^I delete services using servicesID and get status code 200$")
    public void iDeleteServicesUsingServicesIDAndGetStatusCode() {
        servicesSteps.deleteService(servicesID).statusCode(200);
    }


    @Then("^I verify that the services with servicesID is deleted and get status code 404$")
    public void iVerifyThatTheServicesWithServicesIDIsDeletedAndGetStatusCode() {
         servicesSteps.deleteService(servicesID).statusCode(404);
    }
}
