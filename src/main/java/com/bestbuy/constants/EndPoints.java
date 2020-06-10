package com.bestbuy.constants;

public class EndPoints {

    /**
     * Products micro-service Endpoints
     */
    public static final String GET_ALL_PRODUCTS = "/products";
    public static final String CREATE_PRODUCT = "/products";
    public static final String GET_PRODUCT_BY_ID = "/products/{productId}";
    public static final String UPDATE_PRODUCT_BY_ID = "/products/{productId}";
    public static final String DELETE_PRODUCT_BY_ID = "/products/{productId}";
    public static final String INVALID_ENDPOINT_PRODUCT = "/product123";

    /**
     * Stores micro-service Endpoints
     */
    public static final String GET_ALL_STORES = "/stores";
    public static final String CREATE_STORE = "/stores";
    public static final String GET_STORE_BY_ID = "/stores/{storeId}";
    public static final String UPDATE_STORE_BY_ID = "/stores/{storeId}";
    public static final String DELETE_STORE_BY_ID = "/stores/{storeId}";
    public static final String INVALID_ENDPOINT_STORE = "/store123";

    /**
     * Services micro-service Endpoints
     */
    public static final String GET_ALL_SERVICES = "/services";
    public static final String CREATE_SERVICES = "/services";
    public static final String GET_SERVICES_BY_ID = "/services/{serviceId}";
    public static final String UPDATE_SERVICES_BY_ID = "/services/{serviceId}";
    public static final String DELETE_SERVICES_BY_ID = "/services/{serviceId}";
    public static final String INVALID_ENDPOINT_SERVICES = "/service123";

    /**
     * Categories micro-service Endpoints
     */
    public static final String GET_ALL_CATEGORIES = "/categories";
    public static final String CREATE_CATEGORIES = "/categories";
    public static final String GET_CATEGORIES_BY_ID  = "/categories/{categoryID}";
    public static final String UPDATE_CATEGORIES_BY_ID  = "/categories/{categoryID}";
    public static final String DELETE_CATEGORIES_BY_ID  = "/categories/{categoryID}";
    public static final String INVALID_ENDPOINT_CATEGORIES  = "/category123";

}
