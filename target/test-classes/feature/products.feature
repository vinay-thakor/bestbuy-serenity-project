Feature: Products Feature

  As a user I want to perform CRUD operation for Products

  Background: Create new products and verify if the products is added
    When      I create new products by providing a name, type, upc, price, description and model get status code 201
    Then      I verify that the products is created and get status code 200

  @Smoke
  Scenario: Update products price and verify if the products price is updated
    When    I update a existing products using productsID and get status code 200
    Then    I verify that the products price is updated and get status code 200

  @Sanity
  Scenario: Delete products and verify if the products is deleted
    When      I delete products using productsID and get status code 200
    Then      I verify that the products with productsID is deleted and get status code 404
