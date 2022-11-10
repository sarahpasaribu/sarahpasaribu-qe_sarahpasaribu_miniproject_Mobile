@logout
Feature: Logout


  @logout1
  Scenario Outline: Logout
    Given User navigates to login page
    When User input <Email> <password>
    And User click button login
		
		Given Click icon logout
		
    Examples: 
      | Email  | password |  
      | sarah123@gmail.com | Windows15 | 