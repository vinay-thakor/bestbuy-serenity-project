package com.bestbuy.crudtest;

import com.bestbuy.steps.ServicesSteps;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.bestbuy.utils.TestUtils.getRandomValue;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SerenityRunner.class)
public class ServicesCRUDTest extends TestBase {

    static String name = "Software Testing" + getRandomValue();
    static int serviceId;

    @Steps
    ServicesSteps servicesSteps;

    @Title("This test will create a new service ")
    @Test
    public void test001() {
        ValidatableResponse response = servicesSteps.createNewService(name).statusCode(201);
        serviceId = response.extract().path("id");
    }

    @Title("Update the service name and verify the updated information")
    @Test
    public void test002 () {
        name = name + " API Testing ";
        servicesSteps.updateService(serviceId,name).statusCode(200);
        ValidatableResponse response = servicesSteps.getServiceById(serviceId);
        assertThat(response.extract().path("name"), equalTo(name));
    }

    @Title("Delete the service and verify if the service is deleted")
    @Test
    public void test003() {
        servicesSteps.deleteService(serviceId).statusCode(200);
        servicesSteps.deleteService(serviceId).statusCode(404);
    }
 }
