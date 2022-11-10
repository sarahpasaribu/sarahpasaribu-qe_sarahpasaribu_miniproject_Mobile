@additem
Feature: Login


  @additem1
  Scenario Outline: Add Item
    Given User navigates to login page
    When User input <Email> <password>
    And User click button login
    
    Given Click Button Beli
		Then Show the addition cart

    Examples: 
      | Email  | password |  
      | sarah123@gmail.com | Windows15 | 