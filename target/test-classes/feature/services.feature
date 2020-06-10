Feature: Services Feature

  As a user I want to perform CRUD operation for Services

  Background: Create new services and verify if the services is added
    When      I create new services by providing a name and get status code 201
    Then      I verify that the services is created and get status code 200

  @Smoke
  Scenario: Update services name and verify if the services name is updated
    When    I update a existing services using servicesID and get status code 200
    Then    I verify that the services name is updated and get status code 200

  @Sanity
  Scenario: Delete services and verify if the services is deleted
    When      I delete services using servicesID and get status code 200
    Then      I verify that the services with servicesID is deleted and get status code 404
