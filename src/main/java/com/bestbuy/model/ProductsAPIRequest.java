package com.bestbuy.model;

public class ProductsAPIRequest {

    public static ProductsPojo getAPIProductsRequest(String name, String type, String upc, double price,
                                                     String description, String model) {
        ProductsPojo productsPojo = new ProductsPojo();
        if (name != null) {
            productsPojo.setName(name);
        }
        if (type != null) {
            productsPojo.setType(type);
        }
        if (upc != null) {
            productsPojo.setUpc(upc);
        }
        if (price > 0) {
            productsPojo.setPrice(price);
        }
        if (description != null) {
            productsPojo.setDescription(description);
        }
        if (model != null) {
            productsPojo.setModel(model);
        }
        return productsPojo;
    }
}

