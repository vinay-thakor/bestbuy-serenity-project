package com.bestbuy.steps;

import com.bestbuy.constants.EndPoints;
import com.bestbuy.model.ServicesAPIRequest;
import com.bestbuy.model.ServicesPojo;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ServicesSteps {

    @Step("Creating new service with serviceName: {0}")
    public ValidatableResponse createNewService(String name) {

        ServicesPojo servicesPojo = ServicesAPIRequest.getAPIServicesRequest(name);

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)

                .when()
                .body(servicesPojo)

                .post(EndPoints.CREATE_SERVICES)

                .then()
                .log()
                .ifValidationFails();
    }

    @Step("Get service information with serviceId: {0}")
    public ValidatableResponse getServiceById(int serviceId) {
        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .pathParam("serviceId", serviceId)

                .when()
                .get(EndPoints.GET_SERVICES_BY_ID)

                .then()
                .log()
                .ifValidationFails();
    }

    @Step("Updating service information with serviceId: {0}")
    public ValidatableResponse updateService(int serviceId, String name) {

        ServicesPojo servicesPojo = ServicesAPIRequest.getAPIServicesRequest(name);

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .pathParam("serviceId", serviceId)

                .when()
                .body(servicesPojo)
                .patch(EndPoints.UPDATE_SERVICES_BY_ID)

                .then()
                .log()
                .ifValidationFails();
    }

    @Step("Delete service information with serviceId: {0}")
    public ValidatableResponse deleteService(int serviceId) {

        return SerenityRest.rest()
                .given()
                .contentType(ContentType.JSON)
                .pathParam("serviceId", serviceId)

                .when()
                .delete(EndPoints.DELETE_SERVICES_BY_ID)

                .then()
                .log()
                .ifValidationFails();
    }
}
