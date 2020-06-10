Feature: Categories Feature

  As a user I want to perform CRUD operation for Categories

  Background: Create new categories and verify if the categories is added
    When      I create new categories by providing a name & id and get status code 201
    Then      I verify that the categories is created and get the status code 200

  @Smoke
  Scenario: Update categories name and verify if the categories name is updated
    When    I update a existing categories using categoriesID and get status code 200
    Then    I verify that the categories name is updated and get status code 200

  @Sanity
  Scenario: Delete categories and verify if the categories is deleted
    When    I delete categories using categoriesID and get status code 200
    Then    I verify that the categories with categoriesID is deleted and get status code 404
