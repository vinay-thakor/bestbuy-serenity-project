package com.bestbuy.model;

public class ServicesAPIRequest {

    public static ServicesPojo getAPIServicesRequest(String name) {

        ServicesPojo servicesPojo = new ServicesPojo();
        if (name != null) {
            servicesPojo.setName(name);
        }
        return servicesPojo;
    }
}
