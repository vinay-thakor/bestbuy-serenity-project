$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("categories.feature");
formatter.feature({
  "line": 1,
  "name": "Categories Feature",
  "description": "\r\nAs a user I want to perform CRUD operation for Categories",
  "id": "categories-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "Create new categories and verify if the categories is added",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I create new categories by providing a name \u0026 id and get status code 201",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the categories is created and get the status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriesCrudSteps.iCreateNewCategoriesByProvidingANameIdAndGetStatusCode()"
});
formatter.result({
  "duration": 12486162000,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesCrudSteps.iVerifyThatTheCategoriesIsCreatedAndGetTheStatusCode()"
});
formatter.result({
  "duration": 1440285300,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Update categories name and verify if the categories name is updated",
  "description": "",
  "id": "categories-feature;update-categories-name-and-verify-if-the-categories-name-is-updated",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I update a existing categories using categoriesID and get status code 200",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify that the categories name is updated and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriesCrudSteps.iUpdateAExistingCategoriesUsingCategoriesIDAndGetStatusCode()"
});
formatter.result({
  "duration": 408548300,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesCrudSteps.iVerifyThatTheCategoriesNameIsUpdatedAndGetStatusCode()"
});
formatter.result({
  "duration": 69224100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Create new categories and verify if the categories is added",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I create new categories by providing a name \u0026 id and get status code 201",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the categories is created and get the status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriesCrudSteps.iCreateNewCategoriesByProvidingANameIdAndGetStatusCode()"
});
formatter.result({
  "duration": 137009900,
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nExpected status code \u003c201\u003e but was \u003c400\u003e.\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:83)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:77)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:60)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:235)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:247)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:471)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.validateResponseIfRequired(ResponseSpecificationImpl.groovy:636)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:210)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.callCurrent(PogoMetaMethodSite.java:59)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:166)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:122)\r\n\tat io.restassured.specification.ResponseSpecification$statusCode$0.callCurrent(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.statusCode(ResponseSpecificationImpl.groovy:130)\r\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.statusCode(ValidatableResponseOptionsImpl.java:117)\r\n\tat com.bestbuy.cucumber.steps.CategoriesCrudSteps.iCreateNewCategoriesByProvidingANameIdAndGetStatusCode(CategoriesCrudSteps.java:25)\r\n\tat ✽.When I create new categories by providing a name \u0026 id and get status code 201(categories.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "CategoriesCrudSteps.iVerifyThatTheCategoriesIsCreatedAndGetTheStatusCode()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 15,
  "name": "Delete categories and verify if the categories is deleted",
  "description": "",
  "id": "categories-feature;delete-categories-and-verify-if-the-categories-is-deleted",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I delete categories using categoriesID and get status code 200",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I verify that the categories with categoriesID is deleted and get status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "CategoriesCrudSteps.iDeleteCategoriesUsingCategoriesIDAndGetStatusCode()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "CategoriesCrudSteps.iVerifyThatTheCategoriesWithCategoriesIDIsDeletedAndGetStatusCode()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("products.feature");
formatter.feature({
  "line": 1,
  "name": "Products Feature",
  "description": "\r\nAs a user I want to perform CRUD operation for Products",
  "id": "products-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "Create new products and verify if the products is added",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I create new products by providing a name, type, upc, price, description and model get status code 201",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the products is created and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsCrudSteps.iCreateNewProductsByProvidingANameTypeUpcPriceDescriptionAndModelGetStatusCode()"
});
formatter.result({
  "duration": 286542200,
  "status": "passed"
});
formatter.match({
  "location": "ProductsCrudSteps.iVerifyThatTheProductsIsCreatedAndGetStatusCode()"
});
formatter.result({
  "duration": 80546200,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Update products price and verify if the products price is updated",
  "description": "",
  "id": "products-feature;update-products-price-and-verify-if-the-products-price-is-updated",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I update a existing products using productsID and get status code 200",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify that the products price is updated and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsCrudSteps.iUpdateAExistingProductsUsingProductsIDAndGetStatusCode()"
});
formatter.result({
  "duration": 178668600,
  "status": "passed"
});
formatter.match({
  "location": "ProductsCrudSteps.iVerifyThatTheProductsPriceIsUpdatedAndGetStatusCode()"
});
formatter.result({
  "duration": 60478700,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Create new products and verify if the products is added",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I create new products by providing a name, type, upc, price, description and model get status code 201",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the products is created and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsCrudSteps.iCreateNewProductsByProvidingANameTypeUpcPriceDescriptionAndModelGetStatusCode()"
});
formatter.result({
  "duration": 200866900,
  "status": "passed"
});
formatter.match({
  "location": "ProductsCrudSteps.iVerifyThatTheProductsIsCreatedAndGetStatusCode()"
});
formatter.result({
  "duration": 84342700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Delete products and verify if the products is deleted",
  "description": "",
  "id": "products-feature;delete-products-and-verify-if-the-products-is-deleted",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I delete products using productsID and get status code 200",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I verify that the products with productsID is deleted and get status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductsCrudSteps.iDeleteProductsUsingProductsIDAndGetStatusCode()"
});
formatter.result({
  "duration": 231732600,
  "status": "passed"
});
formatter.match({
  "location": "ProductsCrudSteps.iVerifyThatTheProductsWithProductsIDIsDeletedAndGetStatusCode()"
});
formatter.result({
  "duration": 40808400,
  "status": "passed"
});
formatter.uri("services.feature");
formatter.feature({
  "line": 1,
  "name": "Services Feature",
  "description": "\r\nAs a user I want to perform CRUD operation for Services",
  "id": "services-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "Create new services and verify if the services is added",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I create new services by providing a name and get status code 201",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the services is created and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicesCrudSteps.iCreateNewServicesByProvidingAName()"
});
formatter.result({
  "duration": 239586800,
  "status": "passed"
});
formatter.match({
  "location": "ServicesCrudSteps.iVerifyThatTheServicesWithNameIsCreated()"
});
formatter.result({
  "duration": 40243800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Update services name and verify if the services name is updated",
  "description": "",
  "id": "services-feature;update-services-name-and-verify-if-the-services-name-is-updated",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I update a existing services using servicesID and get status code 200",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify that the services name is updated and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicesCrudSteps.iUpdateAExistingServicesUsingServicesID()"
});
formatter.result({
  "duration": 202260500,
  "status": "passed"
});
formatter.match({
  "location": "ServicesCrudSteps.iVerifyThatTheServicesNameIsUpdated()"
});
formatter.result({
  "duration": 82571800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Create new services and verify if the services is added",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I create new services by providing a name and get status code 201",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the services is created and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicesCrudSteps.iCreateNewServicesByProvidingAName()"
});
formatter.result({
  "duration": 283759000,
  "status": "passed"
});
formatter.match({
  "location": "ServicesCrudSteps.iVerifyThatTheServicesWithNameIsCreated()"
});
formatter.result({
  "duration": 40908600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Delete services and verify if the services is deleted",
  "description": "",
  "id": "services-feature;delete-services-and-verify-if-the-services-is-deleted",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I delete services using servicesID and get status code 200",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I verify that the services with servicesID is deleted and get status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "ServicesCrudSteps.iDeleteServicesUsingServicesIDAndGetStatusCode()"
});
formatter.result({
  "duration": 184111300,
  "status": "passed"
});
formatter.match({
  "location": "ServicesCrudSteps.iVerifyThatTheServicesWithServicesIDIsDeletedAndGetStatusCode()"
});
formatter.result({
  "duration": 31751500,
  "status": "passed"
});
formatter.uri("stores.feature");
formatter.feature({
  "line": 1,
  "name": "Stores Feature",
  "description": "\r\nAs a user I want to perform CRUD operation for Stores",
  "id": "stores-feature",
  "keyword": "Feature"
});
formatter.background({
  "line": 5,
  "name": "Create new stores and verify if the stores is added",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I create new stores by providing a name, type, address, address2, city, state, zip, lat, lng and hours get status code 201",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the stores is created and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StoresCrudSteps.iCreateNewStoresByProvidingANameTypeAddressAddressCityStateZipLatLngAndHoursGetStatusCode()"
});
formatter.result({
  "duration": 338137900,
  "status": "passed"
});
formatter.match({
  "location": "StoresCrudSteps.iVerifyThatTheStoresIsCreatedAndGetStatusCode()"
});
formatter.result({
  "duration": 74132600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Update stores name and verify if the stores name is updated",
  "description": "",
  "id": "stores-feature;update-stores-name-and-verify-if-the-stores-name-is-updated",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I update a existing stores using storesID and get status code 200",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I verify that the stores name is updated and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StoresCrudSteps.iUpdateAExistingStoresUsingStoresIDAndGetStatusCode()"
});
formatter.result({
  "duration": 207083300,
  "status": "passed"
});
formatter.match({
  "location": "StoresCrudSteps.iVerifyThatTheStoresNameIsUpdatedAndGetStatusCode()"
});
formatter.result({
  "duration": 80479600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "Create new stores and verify if the stores is added",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I create new stores by providing a name, type, address, address2, city, state, zip, lat, lng and hours get status code 201",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that the stores is created and get status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StoresCrudSteps.iCreateNewStoresByProvidingANameTypeAddressAddressCityStateZipLatLngAndHoursGetStatusCode()"
});
formatter.result({
  "duration": 321871000,
  "status": "passed"
});
formatter.match({
  "location": "StoresCrudSteps.iVerifyThatTheStoresIsCreatedAndGetStatusCode()"
});
formatter.result({
  "duration": 77106700,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Delete stores and verify if the stores is deleted",
  "description": "",
  "id": "stores-feature;delete-stores-and-verify-if-the-stores-is-deleted",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I delete stores using storesID and get status code 200",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I verify that the stores with storesID is deleted and get status code 404",
  "keyword": "Then "
});
formatter.match({
  "location": "StoresCrudSteps.iDeleteStoresUsingStoresIDAndGetStatusCode()"
});
formatter.result({
  "duration": 214983200,
  "status": "passed"
});
formatter.match({
  "location": "StoresCrudSteps.iVerifyThatTheStoresWithStoresIDIsDeletedAndGetStatusCode()"
});
formatter.result({
  "duration": 30232800,
  "status": "passed"
});
});