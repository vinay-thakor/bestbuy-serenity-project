Feature: Stores Feature

  As a user I want to perform CRUD operation for Stores

  Background: Create new stores and verify if the stores is added
    When      I create new stores by providing a name, type, address, address2, city, state, zip, lat, lng and hours get status code 201
    Then      I verify that the stores is created and get status code 200

  @Smoke
  Scenario: Update stores name and verify if the stores name is updated
    When    I update a existing stores using storesID and get status code 200
    Then    I verify that the stores name is updated and get status code 200

  @Sanity
  Scenario: Delete stores and verify if the stores is deleted
    When      I delete stores using storesID and get status code 200
    Then      I verify that the stores with storesID is deleted and get status code 404
